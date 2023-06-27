const username=document.getElementById("username")
const password=document.getElementById("password")
let randomOtp
let OTP=document.getElementById("OTP")
function gen()
{
    randomOtp = Math.floor(Math.random()* 999999)+10000
    alert(randomOtp)
}
function verify()
{
    if(!(username.value=="vignan"))
    {
        alert("username incorrect")
    }
    else if(!(password.value == 'it'))
    {
        alert("password incorrect")
    }
    else if(!(OTP.value==randomOtp))
    {
        alert("OTP incorrect")
    }
    else
    {
        alert("loginsuccessful")
        username.value=""
        password.value=""
        OTP.value=""
    }
}