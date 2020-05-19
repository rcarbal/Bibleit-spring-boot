const live_server = "https://bibleit.online";
const test_server = "http://localhost:8000";
const json_parser = "http://localhost:8300";
const json_extractor_questions = "http://localhost:8200";
let EVENT_LISTENER_RUNNING = false;

let currentData;
let SELECTED_INDEX;


let questionDiv = document.getElementById('question')
let input = document.getElementById('answer');
let previewDiv = document.getElementById('previewDiv');
let bookDiv = document.getElementById('book')
let chapterDiv = document.getElementById('chapter')
let verseDiv = document.getElementById('verse')
let resource = document.getElementById('resourceId')
let indexDiv = document.getElementById('index')
let idDiv = document.getElementById('idDiv')

const booksDropdown = document.getElementById('books')

let submitButton = document.getElementById('submit')
submitButton.onclick = () =>{
    submitQuestion()
}

const testSting = "supercalifragilisticexpialidocious"

    
axios.get(`${json_parser}/books`)
.then((response)=>{

    response.data.forEach((dataBook)=>{
        let bookEle = document.createElement('div')
        bookEle.innerHTML = dataBook
        bookEle.classList.add("dropdown-item")

        bookEle.onclick = (event) => {

            const getResourse = resource.value
            const bookClicked = event['srcElement'].innerText

            resource.value = getResourse +", " + bookClicked
        }

        booksDropdown.appendChild(bookEle)
    });

})


function setTest(){
    setQuestionInformation(testSting)
}

function submitQuestion(){
    let questionData = questionDiv.value
    let answerData = input.value
    let indexData = indexDiv.value
    let versesData = resource.value

    const path = `${json_extractor_questions}/questions`

    axios.post(path,
        {
          question: questionData,
          answer : answerData,
          index : indexData,
          verse : versesData
        }).then((response)=>{
            let data = response.data.question
            alert(`question: ${data['question']}\n answer: ${data['answer']}\n id:${data['id']}`)
        });
}


function echoWord(ele){

    let id = ele.id
    
    if (!EVENT_LISTENER_RUNNING){

        EVENT_LISTENER_RUNNING = true;
    

        // remove all previewDiv's children if any
        if (previewDiv.hasChildNodes()){
            previewDiv.innerHTML = "";
        }

        let inputValue;

        if (id === "answer"){
            inputValue = input.value
        }else {
            inputValue = questionDiv.value
        }

        if (inputValue.length > 0){

            // Call to next method if th input value is not null
            getPreviewQuestion(inputValue, id)
        }
        else if (inputValue.length == 0){

            let previewShouldHave = previewDiv.classList.contains("show_pre");
            if(previewShouldHave){
                previewDiv.classList.remove("show_pre");
            }

            previewDiv.style.visibility = "hidden";

            EVENT_LISTENER_RUNNING = false;
        }
    }

}

function getPreviewQuestion(inputValue, id){

    let path;

    if (id === "answer"){
        path = "/matchedAnswers"
    }else {
        path = "/matchedQuestions"
    }

    axios.get(`${test_server}${path}?userInput=${inputValue}`)
    .then((response)=>{

        previewDiv.style.visibility = "visible";

        if (previewDiv.hasChildNodes()){
            previewDiv.innerHTML = "";
        }

        currentData = response['data']
        let index = 0;
        if (response.data.length > 0){
            response.data.forEach((data)=>{
                

                let questionDataContainer  = document.createElement('div')

                // Set click listener
                questionDataContainer.onclick = (event)=>{
                   setQuestionInformation(event)
                }

                questionDataContainer.setAttribute('data-index', index);
                
                let question = document.createElement('strong')
                question.style.pointerEvents = "none";

                let answerDivCont = document.createElement('div')
                answerDivCont.style.pointerEvents = "none"
                let answerDiv = document.createElement('i')
                answerDiv.style.pointerEvents = "none"
                answerDivCont.appendChild(answerDiv)
                answerDivCont.id = "answerPreview"

                let matches = document.createElement('div')
                matches.style.pointerEvents = "none";   

                question.innerHTML = data['question']
                answerDiv.innerHTML = data['answer']
                matches.innerHTML = data['matches']

                questionDataContainer.classList.add("set-border")
                questionDataContainer.appendChild(question)
                questionDataContainer.appendChild(answerDivCont)
                questionDataContainer.appendChild(matches)
                previewDiv.appendChild(questionDataContainer)
                index++
            })
        }
        EVENT_LISTENER_RUNNING = false;  
    })
}

function setQuestionInformation(event){

    if (event === "supercalifragilisticexpialidocious"){

        questionDiv.value = "test question supercalifragilisticexpialidocious"
        input.value = "test answer supercalifragilisticexpialidocious"
        resource.value = "verse supercalifragilisticexpialidocious"
    }
    else{
        const index = event['srcElement'].getAttribute('data-index')
        SELECTED_INDEX = index
    
        // clear all the elements
        questionDiv.value = ""
        input.value = ""
        resource.value = ""
        indexDiv.value = ""
        idDiv.value = ""
    
        questionDiv.value = currentData[index]['question']
        input.value = currentData[index]['answer']
        resource.value = currentData[index]['verse']
        idDiv.value = currentData[index]['id'] 
        indexDiv.value = SELECTED_INDEX
    }
    
}

// setTest()