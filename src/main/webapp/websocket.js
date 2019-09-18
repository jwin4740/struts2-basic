function connect() {
    var userName = document.getElementById("userName").value;
    var message = "whatup";
    var uniqueId = "ask3424lka98";
    var host = document.location.host;
    var pathname = document.location.pathname;
    console.log("...trying to connect");
    let j = 0;
    setTimeout(callAction, 1000);
    setTimeout(callAction, 2000);

    function callAction() {
        $.get("message.action", {
            message: message,
            userName: userName,
            uniqueId: uniqueId,

        })
            .done(function (data) {
                //empty the message input
                console.log("data is: " + data)

                $("#message").val("init");
                $("#log").append("whatup\n");


            });
    }

    // ws = new WebSocket("ws://" + host + pathname + "chat");
    //
    //
    //
    // ws.onmessage = function (event) {
    //     var log = document.getElementById("log");
    //     console.log(event.data);
    //     var message = JSON.parse(event.data);
    //     log.innerHTML += message.from + " : " + message.content + "\n";
    // };
}

// function send() {
//     var content = document.getElementById("msg").value;
//     var json = JSON.stringify({
//         "content": content
//     });
//
//     ws.send(json);
// }