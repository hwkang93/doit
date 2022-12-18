import Badge from "./Badge.js";

export default class Card {
    #id;
    #title;
    #executorId;

    #count;
    #price;

    #settleYn;
    #badgeList;

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

    toHtml() {

        `
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
        `
    }

    addCount() {

    }

    discountCount() {

    }
}