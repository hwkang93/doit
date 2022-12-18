import Card from "./Card.js";

const cardList = [];
const userId = "khw";


document.addEventListener("DOMContentLoaded", () => {
    loadData();
});

function loadData() {
    const url = `doits/${userId}`;
    const options = {
        method : 'GET',
        header : {
            'Content-Type' : 'application/json'
        }
    }

    fetch(url, options)
        .then(response => {
            if(response.ok) {
                return response.json();
            }
        })
        .then(response => {
            for (const cardJsonObject of response) {
                cardList.push(new Card(cardJsonObject));
            }
        });
}