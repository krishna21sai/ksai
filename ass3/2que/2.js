function print() {
    var name = document.getElementById("name");
    var mail = document.getElementById("mail");
    var lan = document.getElementsByName("web");
    var color = document.getElementsByName("we");
    var branch = document.getElementById("krish");
    var msg = "";

    msg += name.value + " ";
    msg += mail.value + " ";

    for (var i = 0; i < lan.length; i++) {
        if (lan[i].checked) {
            msg += lan[i].value + " ";
        }
    }

    for (var i = 0; i < color.length; i++) {
        if (color[i].checked) {
            msg += color[i].value + " ";
        }
    }

    msg += branch.value + " ";

    document.getElementById("result").innerHTML = msg;
}
