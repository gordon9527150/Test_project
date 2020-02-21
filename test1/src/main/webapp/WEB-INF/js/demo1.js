// 创建方法
var flag = false;
    function chageImg() {
        // 获取按钮的对象
        var img1 = document.getElementById("img1")
    //            console.log("测试")
        // 点击按钮就切换图片
        if (!flag) {
            img1.src = "../imgs/on.gif";
        } else {
            img1.src = "../imgs/off.gif";
        }
    //            alert(flag)
        flag = !flag;
    }

