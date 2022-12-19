import Badge from "./Badge.js";

export default class Card {
    #id;
    #title;
    #executorId;

    #count;
    #price;

    #settleYn;
    #badgeList;

    /**
     *
     * @param targetDivId
     * @param cardJsonObject
     * @TODO
     *  - toHtml() -> DIV 별로 HTML 생성하는 메서드로 분리 (버튼 그룹, 버튼)
     *  - BUTTON CLICK EVENT 추가
     *  - CARD Object 에서 input 관리 가능하도록(addCount, discountCount)
     *  - document.ready 완료 시점 찾기 card 추가 미리 해야 할수도..
     */
    constructor(cardJsonObject) {
        this.#id = cardJsonObject.id;
        this.#title = cardJsonObject.title;
        this.#executorId = cardJsonObject.executorId;
        this.#count = cardJsonObject.count;
        this.#price = cardJsonObject.price;
        this.#settleYn = cardJsonObject.settleYn;

        const badge = new Badge(cardJsonObject.doitType);
        this.#badgeList = [
            new Badge(cardJsonObject.doitType),
            new Badge(cardJsonObject.dateType),
            new Badge(cardJsonObject.processType)
        ];
    }

    /**
    @example
    <div class="card bg-light mb-3" style="max-width: 30rem;">
            <div class="card-header">
                <span class="badge bg-secondary">월간</span>
                <span class="badge bg-primary">하기</span>
            </div>
            <div class="card-body">
                <div class="left-box w-75 align-middle">
                    <h5 class="card-title">${title}</h5>
                </div>
                <div class="right-box w-25">
                    <div class="right-box">
                        <button type="button" class="btn btn-primary">+</button>
                    </div>
                    <div class="right-box form-group w-50">
                        <fieldset disabled="">
                            <input class="form-control" type="text" disabled="" value="${this.#count}">
                        </fieldset>
                    </div>
                </div>
            </div>
        </div>
     */
    toHtml() {
        /** Card Div*/
        const cardDiv = document.createElement('div');
        cardDiv.className = 'card';
        cardDiv.classList.add('bg-light');
        cardDiv.classList.add('mb-3');
        cardDiv.style.maxWidth = '30rem';

        /** Card Header Div*/
        const cardHeaderDiv = document.createElement('div');
        cardHeaderDiv.className = 'card-header';
        this.#badgeList.forEach(badge => {
            cardHeaderDiv.append(badge.toHtml());
        })

        cardDiv.append(cardHeaderDiv);

        /** Card Body Div */
        const cardBodyDiv = document.createElement('div');
        cardBodyDiv.className = 'card-body';

        /** Card Title Div */
        const titleDiv = document.createElement('div');
        titleDiv.classList.add('left-box');
        titleDiv.classList.add('w-75');
        titleDiv.classList.add('align-middle');

        /** Card Title */
        const title = document.createElement('h5');
        title.className = 'card-title';
        title.innerText = this.#title;

        titleDiv.append(title);
        cardBodyDiv.append(titleDiv);

        /** Button Group Div */
        const buttonGroupDiv = document.createElement('div');
        buttonGroupDiv.classList.add('right-box');
        buttonGroupDiv.classList.add('w-25');

        /** Button Div */
        const buttonDiv = document.createElement('div')
        buttonDiv.classList.add('right-box');

        /** Button */
        const button = document.createElement('button');
        button.className = 'btn';
        button.classList.add('btn-primary');
        button.innerText = '+';

        buttonDiv.append(button);
        buttonGroupDiv.append(buttonDiv);

        /** Count Div */
        const countDiv = document.createElement('div');
        countDiv.classList.add('right-box');
        countDiv.classList.add('form-group');
        countDiv.classList.add('w-50');

        const fieldset = document.createElement('fieldset');
        fieldset.disabled;

        /** Count Input */
        const countInput = document.createElement('input');
        countInput.type = 'text';
        countInput.disabled = true;
        countInput.className = 'form-control';
        countInput.value = this.#count;

        fieldset.append(countInput);
        countDiv.append(fieldset);
        buttonGroupDiv.append(countDiv);
        cardBodyDiv.append(buttonGroupDiv);
        cardDiv.append(cardBodyDiv);

        return cardDiv;
    }

    addCount() {

    }

    discountCount() {

    }
}