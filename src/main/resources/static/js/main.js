import Card from "./Card.js";

const cardList = [];
const userId = "khw";


document.addEventListener("DOMContentLoaded", () => {
    loadData();
});

function loadData() {
    const targetDiv = document.querySelector('#card-group');
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
                const card = new Card(cardJsonObject);

                console.log(card.toHtml())

                targetDiv.append(card.toHtml());
                cardList.push(card);
            }
        });
}