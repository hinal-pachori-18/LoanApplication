# LoanApplication

-> First I have Created 2 Entities User and Loan.In user I have stored field id,username,password and also doing one to one mapping with Loan entity. like one user can apply for one loan.
-> I have created another entity that is Loan which contain field loanid,amountrequired,loanterm,weeklyPaymentDate,weeklyPayment,approved.
->first user apply for loan like which contain field like 
{
    "userId":2,
    "userName":"jinal",
    "password":"12345",
    "loan":{
        "loanId":102,
        "amountRequired":10000,
        "loanTerm":2,
        "weeklyPaymentDate":"",
        "weeklyPayment":"",
        "approved":false
    }
}
when the user apply for loan  becuase I use cascade type =ALL also insert data into Loan table.

->You can also fetch the Details of users and it will also associate with loan as well.

->Then set the loan will be approved from false to true by just passing userId from which user you have to set this loan we will set and then also setWeeklyPaymentDate from now to 7 days then we will update the loan details.
localhost:8080/api/v1/loan/2 
So it will update your data 
{
    "loanId": 102,
    "amountRequired": 10000.0,
    "loanTerm": 2,
    "weeklyPaymentDate": "2023-08-11",
    "weeklyPayment": null,
    "approved": true
}


->Then we will update the weekly payment and also update the date which will after be 7 days you have to pay on this date. 
localhost:8080/api/v1/loan/payment/2?payment=500
You can pass userId as endpoint from which user you have add weeklyPayment and update the date.
I use requestParma you can pass key as payment and value as you want. like 500

{
    "loanId": 102,
    "amountRequired": 10000.0,
    "loanTerm": 2,
    "weeklyPaymentDate": "2023-08-11",
    "weeklyPayment": 500.0,
    "approved": true
}


finally when you fetch the userDetails so it will be update All the details
[
    {
        "userId": 1,
        "userName": "hinal",
        "password": "1234",
        "loan": {
            "loanId": 101,
            "amountRequired": 5000.0,
            "loanTerm": 1,
            "weeklyPaymentDate": "2023-08-11",
            "weeklyPayment": 500.0,
            "approved": true
        }
    }.
]
