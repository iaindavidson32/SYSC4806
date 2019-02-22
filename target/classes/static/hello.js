$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/buddy"
    }).then(function(data) {
       $('.buddy-name0').append(data._embedded.buddy[0].name);
       $('.buddy-number0').append(data._embedded.buddy[0].phoneNumber);
       $('.buddy-name1').append(data._embedded.buddy[1].name);
       $('.buddy-number1').append(data._embedded.buddy[1].phoneNumber);
       $('.buddy-name2').append(data._embedded.buddy[2].name);
       $('.buddy-number2').append(data._embedded.buddy[2].phoneNumber);
       $('.buddy-name3').append(data._embedded.buddy[3].name);
       $('.buddy-number3').append(data._embedded.buddy[3].phoneNumber);
       $('.buddy-name4').append(data._embedded.buddy[4].name);
       $('.buddy-number4').append(data._embedded.buddy[4].phoneNumber);
    });
});