var items=document.getElementsByClassName("foodCarPage_mainFirTitleItem");
for(var i=0;i<items.length;i++){
    items[i].onmouserover=function(){
        items[i].className="foodCarPage_mainFirTitleItem foodCarPage_mainFirTitleItemActive"
    }
    items[i].onmouseout=function(){
        items[i].className="foodCarPage_mainFirTitleItem"
    }
}