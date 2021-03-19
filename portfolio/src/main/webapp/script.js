async function showMessage() {
  const responseFromServer = await fetch('/hello');
  const msgResponse = await responseFromServer.json();

  const msgContainer = document.getElementById('message');
  const num = Math.floor(Math.random() * 3);
  text = "";
  if (num == 0){
    text = msgResponse.msg1;
  }
  else if (num == 1){
      text = msgResponse.msg2;
  }
  else {
      text = msgResponse.msg3;
  }
  console.log(text);
  msgContainer.innerText = text;     
  
}

function createMap() {
  const map = new google.maps.Map(
      document.getElementById('map'),
      {center: {lat: 37.422, lng: -122.084}, zoom: 16});
}

function load(){
    showMessage();
    createMap();
}