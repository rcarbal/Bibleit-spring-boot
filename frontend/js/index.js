let EVENT_LISTENER_RUNNING = false;
const live_server = "https://bibleit.online";
const test_server = "http://0.0.0.0:8000";

function echoWord(){
    
    if (!EVENT_LISTENER_RUNNING){

        EVENT_LISTENER_RUNNING = true;
        
        let input = document.getElementById('searchInput');
        let previewDiv = document.getElementById('previewDiv');

        // remove all previewDiv's children if any
        if (previewDiv.hasChildNodes()){
            previewDiv.innerHTML = "";
        }

        let inputValue = input.value;

        if (inputValue.length > 0){
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

// get child from preview div
$(document).ready(function() {
    $('#previewDiv').on('click', function(event) {
        // event.stopPropagation();
        const question = event.target.innerHTML;

        // get search and set search bar
        const search = document.getElementById('searchInput');
        search.value = question;

        // hide the preview div
        let previewShouldHave = previewDiv.classList.contains("show_pre");
        if(previewShouldHave){
            previewDiv.classList.remove("show_pre");
        }

        // remove preview dive child noteds
        if (previewDiv.hasChildNodes()){
            previewDiv.innerHTML = "";
        }

        // hide preview div
        if (question.split(" ").length){
            previewDiv.style.visibility = "hidden";
        }

        // call server to get response
        getQuestion()
    });
  });

function getPreviewQuestion(inputValue){
    axios.get(`${live_server}/api/question_match?input=${inputValue}`)
    .then((response)=>{

    let count = 0;

        response.data.forEach((data)=>{
            // check for high match score
            if (data[1] >= 85){
                let div = document.createElement("div");
                div.innerHTML = data[0];
                div.classList.add("text-left");
                div.classList.add("pt-1");
                div.classList.add("pl-3");

                previewDiv.appendChild(div);
                count++;
            }
        });

        if (count > 0){

        // set visibility of search preview div to visible
        let previewShouldNotHave = previewDiv.classList.contains("show_pre");
        if(!previewShouldNotHave){
            previewDiv.classList.add("show_pre");
        }
            previewDiv.style.visibility = "visible";
        }

        EVENT_LISTENER_RUNNING = false;
    });
}


function getQuestion(){
    // if input is not null get user input and send a form to the server
    let input = document.getElementById('searchInput');
    let previewDiv = document.getElementById('previewDiv');

    let answerCard = document.getElementById('answerCard');
    let answer = document.getElementById('cardAnswer');
    let bibleRef = document.getElementById('cardBibleRef');

    if (input.value.length == 0){
        
    }
    else {
        const userInstput = input.value;
        axios.get(`${live_server}/api/question?input=${userInstput}`)
        .then((response)=>{
            console.log(response.data)

            // display the anwer card if hidden
            if (window.getComputedStyle(answerCard).visibility === "hidden") {
                answerCard.style.visibility = "visible";
              }

            if (window.getComputedStyle(previewDiv).visibility === "visible") {
                previewDiv.style.visibility = "hidden";
            }

            // remove all previewDiv's children if any
            if (previewDiv.hasChildNodes()){
                previewDiv.innerHTML = "";
            }
        
            

            // set anser and bible reference
            // remove any element data from the answer and ref.
            answer.innerHTML = "";
            bibleRef.innerHTML = "";

            answer.innerHTML = response.data[1];
            bibleRef.innerHTML = response.data[2];

        })
    }
}