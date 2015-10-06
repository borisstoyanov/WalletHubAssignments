Feature: Customer Posts on Facebook
       As a customer,
       I want to post on facebook 
       so that my friends and family could see it
 
Scenario: Facebook post
       Given the user is on Facebook LoginPage
       When he enters "12bstoyanov@gmail.com" as username
       And he enters "password5" as password
       And he clicks login
       And he enters "Hello World" as post
       Then ensure the post "Hello World" is posted 
