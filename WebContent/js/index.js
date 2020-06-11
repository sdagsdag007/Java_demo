//获取图片元素
var items = document.getElementsByClassName("item");
//获取小圆点元素
var points = document.getElementsByClassName("point");
  // 定时器
  var time = 0;
//表示第几张图片在展示，表示第index张图片有active这个类名
var index = 0;
//清除z-index
var clearActive = function () {
    for (var i = 0; i < items.length; i++) {
        items[i].className = "item";
    }
    for (var i = 0; i < points.length; i++) {
        points[i].className = "point";
    }
}
//添加z-index
var addIndex = function () {
    clearActive();
    items[index].className = "item active";
    points[index].className = "point active";
}

//点击原点切换图片
for (var i = 0; i < points.length; i++) {
    points[i].addEventListener("click", function () {
        var p_index = this.getAttribute("data-index");
        console.log(p_index);
        index = p_index;
        addIndex();
        time = 0;
    })
}

// 定时器，自动播放
setInterval(function () {
    if (time == 40) {
        addIndex();
        time = 0;
    } else {
        time++;
    }
}, 100);

// 下拉菜单
var user=document.getElementsByClassName("head_main_ietmLogin")[0];
var popNav=document.getElementsByClassName("head_main_itemPop");
user.onmouseover=function(){
    popNav[0].style.display="block";
}
user.onmouseout=function(){
    popNav[0].style.display="none";
}
/*---------------------------------------排行榜的js----------------------------------------------------------*/

// 获取家常导航控制
var jiachang_nav=document.getElementById("jiachang_nav");
// 获取凉菜导航控制
var liangcai_nav=document.getElementById("liangcai_nav");
// 获取主食导航控制
var zhushi_nav=document.getElementById("zhushi_nav");
// 获取饮品导航控制
var yinpin_nav=document.getElementById("yinpin_nav");

//获取家常区域
var jiachang=document.getElementById("jiachang");
//获取凉菜区域
var liangcai=document.getElementById("liangcai");
//获取主食区域
var zhushi=document.getElementById("zhushi");
//获取饮品区域
var yinpin=document.getElementById("yinpin");

//获取导航数组
var caipindaohang=document.getElementsByClassName("caipindaohang");
//获取内容数组
var content=document.getElementsByClassName("show_SecondContent_RankContent");

/*封装方法 */
/*导航恢复默认颜色 */
function default_color(){
    for(var i=0;i<caipindaohang.length;i++){
        caipindaohang[i].style.color="#999";
    }
}
/**设置当前对象颜色 */
function set_color(c_oop){
    c_oop.style.color="#f66495";
}
/**返回当前对象颜色 */
function back_color(c_oop){
    c_oop.style.color="#999";
}
/**设置所有区域为none */
function default_none(){
    for(var i=0;i<content.length;i++){
        content[i].style.display="none";
    }
}
/**设置当前区域显示 */
function set_block(c_oop){
    c_oop.style.display="block";
}
/**家常设置 */
jiachang_nav.onmouseover=function(){
    default_color();
    default_none();
    set_color(this);
    set_block(jiachang);
}

/**凉菜设置*/
liangcai_nav.onmouseover=function(){
    default_color();
    default_none();
    set_color(this);
    set_block(liangcai);
}
/**主食设置 */
zhushi_nav.onmouseover=function(){
    default_color();
    default_none();
    set_color(this);
    set_block(zhushi);
}
/**饮品设置*/
yinpin_nav.onmouseover=function(){
    default_color();
    default_none();
    set_color(this);
    set_block(yinpin);
}
/*-------------------------------------------------------今日推荐------------------------------------------ */
// 获取按钮1
var btnOne=document.getElementById("btnOne");
// 获取按钮2
var btnTwo=document.getElementById("btnTwo");
//获取按钮3
var btnThree=document.getElementById("btnThree");
//获取页1
var t_PageOne=document.getElementById("t_PageOne");
//获取页2
var t_PageTwo=document.getElementById("t_PageTwo");
//获取页3
var t_PageThree=document.getElementById("t_PageThree");
// 获取按钮数组
var btns=document.getElementsByClassName("Today_Control");
//获取内容数组
var t_content=document.getElementsByClassName("show_SecondContent_RecommendContent");
/**设置样式恢复默认*/
function default_css(){
    for(var i=0;i<btns.length;i++){
        btns[i].className="show_SecondContent_RecommendTitle_Control Today_Control";
    }
}
function set_css(c_oop){
    c_oop.className="show_SecondContent_RecommendTitle_Control show_SecondContent_RecommendTitle_ControlActive Today_Control";
}
function set_None(){
   for(var i=0;i<t_content.length;i++){
       t_content[i].style.display="none";
   }
}
btnOne.onmouseover=function(){
    default_css();
    set_css(this);
    set_None();
    set_block(t_PageOne);
}
btnTwo.onmouseover=function(){
    default_css();
    set_css(this);
    set_None();
    set_block(t_PageTwo);
}
btnThree.onmouseover=function(){
    default_css();
    set_css(this);
    set_None();
    set_block(t_PageThree);
}