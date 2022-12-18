export default class Badge {
    /*
        PROCESS_TYPE
        성공      SUCCESS
        실패      FAIL
        진행중     ING

        DATE_TYPE
        일간      DATE
        주간      WEEK
        월간      MONTH

        DOIT_TYPE
        하기      DO
        말기      DONT
     */
    static SUCCESS = {
        key : 'bg-success',
        value : '성공'
    };
    static FAIL = {
        key : 'bg-danger',
        value : '실패'
    };

    static ING = {
        key : 'bg-ing',
        value : '진행중'
    };

    static DO = {
        key : 'bg-primary',
        value : '하기'
    }
    static DONT = {
        key : 'big-warning',
        value : '말기'
    }

    //일간, 주간, 월간
    static DATE = {
        key : 'big-light',
        value : '일간'
    }

    //TODO
    static WEEK = {
        key : 'big-grey',
        value : '주간'
    }

    static MONTH = {
        key : 'big-dark',
        value : '월간'
    }



    #badge;

    constructor(key) {
        this.#badge = Badge[key];
        debugger;
    }


    toHtml() {
        return `<span class="badge ${this.#badge.key}">${this.#badge.value}</span>`;
    }
}