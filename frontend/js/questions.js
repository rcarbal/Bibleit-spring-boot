const live_server = "https://bibleit.online";
const test_server = "http://localhost:8000";
let EVENT_LISTENER_RUNNING = false;

let input = document.getElementById('answer');
let previewDiv = document.getElementById('previewDiv');

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
        
        if (response.data.length > 0){
            response.data.forEach((data)=>{

                let question = document.createElement('strong')
                let matches = document.createElement('div')
                question.innerHTML = data['question']
                matches.innerHTML = data['matches']
                previewDiv.appendChild(question)
                previewDiv.appendChild(matches)
            })
        }
        EVENT_LISTENER_RUNNING = false;  
    })


}