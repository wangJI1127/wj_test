<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>日历</title>
<style type="text/css">
*{
	padding: 0;margin:0;
}
.box{
	width: 150px;height: 180px;background: skyblue;margin: 100px auto;text-align: center;
}
#top{
	font-size: 14px;color: #fff;line-height: 60px;
}
#bottom{
	width: 75px;height: 75px;background:pink;margin: 15px auto;font-size: 50px;color: #fff;line-height: 75px;border-radius: 5px;
}
</style>
<script type="text/javascript">
   window.onload=function(){
   	var top=document.getElementById('top');
   	var bottom=document.getElementById('bottom');
   	var date=new Date();
   	var arr=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"]
   	top.innerHTML=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+"-"+arr[date.getDay()];
   	bottom.innerHTML=date.getDate();
   }
</script>
</head>
<body>
<div class="box">
	<div id="top"></div>
	<div id="bottom"></div>
</div>
</body>
</html>