function to_register() {
    var sjhm = document.getElementById("sjhm").value;
    var pwd = document.getElementById("pwd").value;
    var pwd1 = document.getElementById("pwd1").value;
    var xm = document.getElementById("xm").value;
    var zjhm = document.getElementById("zjhm").value;

    if(sjhm==""||pwd==""||pwd1==""||xm==""||zjhm==""){
        toastr.warning('请填写基本信息！');
        return;
    }
    if(pwd!=pwd1){
        toastr.warning('两次密码不一致！');
    }
    $.ajax({
        url: "/to_register.do",
        data: {"sjhm": sjhm,"pwd":pwd,"xm":xm,"zjhm":zjhm},
        type: "post",
        timeout: 3000,
        dataType: "json",
        async: false,
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            toastr.error('链接超时');
        },
        success: function (responseText, textStatus, XMLHttpRequest) {
            if(responseText.code=='-1'){
                toastr.warning(responseText.msg);
                return;
            }
            toastr.success('注册成功！3秒后跳转登录页面...');
            setTimeout(function(){ location.href="login.do"; },3000);
        }
    });
}