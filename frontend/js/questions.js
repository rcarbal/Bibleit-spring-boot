const live_server = "https://bibleit.online";
const test_server = "http://localhost:8000";
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

// $(document).click(function(event) {
//     var text = $(event.target).text();
//     console.log("Clicked")
// });

function echoWord(){
    
    if (!EVENT_LISTENER_RUNNING){

        EVENT_LISTENER_RUNNING = true;
    

        // remove all previewDiv's children if any
        if (previewDiv.hasChildNodes()){
            previewDiv.innerHTML = "";
        }

        let inputValue = input.value;

        if (inputValue.length > 0){

            // Call to next method if th input value is not null
            getPreviewQuestion(inputValue)
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

function getPreviewQuestion(inputValue){

    axios.get(`${test_server}/matchedAnswers?userInput=${inputValue}`)
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

                let matches = document.createElement('div')
                matches.style.pointerEvents = "none";   

                question.innerHTML = data['question']
                matches.innerHTML = data['matches']
                questionDataContainer.classList.add("set-border")
                questionDataContainer.appendChild(question)
                questionDataContainer.appendChild(matches)
                previewDiv.appendChild(questionDataContainer)
                index++
            })
        }
        EVENT_LISTENER_RUNNING = false;  
    })
}

function setQuestionInformation(event){
    const index = event['srcElement'].getAttribute('data-index')
    SELECTED_INDEX = index

    console.log(currentData[index])

    // clear all the elements
    questionDiv.value = ""
    input.value = ""
    resource.value = ""

    questionDiv.value = currentData[index]['question']
    input.value = currentData[index]['answer']
    resource.value = currentData[index]['verse']   
    
}