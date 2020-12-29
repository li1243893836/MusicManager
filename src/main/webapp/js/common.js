layui.define(function (exports) {
    var obj = {
        ajaxCommon : function () {
            layui.$.ajaxSetup({
                complete:function(xhr,status){
                    if(xhr.status==888){
                        layui.layer.msg("登录失效，即将跳转",{time:2000},function(){
                            window.location.href="/page/login-3.html"
                        });
                    }
                }
            });
        }
    }
    exports("common",obj);
});