<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>HTML5 canvas孙悟空卡通头像 - 源码之家</title>

<style>
	body{text-align:center;padding-top:3em;}
</style>

</head>
<body>
<canvas width="650" height="478"></canvas>
<script>

    (function(){
        var cvs=document.querySelector("canvas"),
                g=cvs.getContext("2d");
        g.lineWidth=2;

        //右臂
        g.beginPath();
        g.strokeStyle="#DE821B";
        g.fillStyle="#FFDE00";
        g.moveTo(261,337);
        g.quadraticCurveTo(268,328,287,320);
        g.lineTo(323,357);
        g.quadraticCurveTo(281,415,243,377);
        g.closePath();
        g.fill();
        g.stroke();

        //身体
        g.beginPath();
        g.strokeStyle="#DE821B";
        g.fillStyle="#FFDE00";
        g.moveTo(86,265);
        g.quadraticCurveTo(33,267,15,292);
        g.lineTo(52,339);
        g.quadraticCurveTo(88,328,101,341);
        g.lineTo(92,336);
        g.quadraticCurveTo(88,338,81,347);
        g.bezierCurveTo(188,468,306,372,261,306);

        g.closePath();
        g.fill();
        g.stroke();

        //衣带
        g.beginPath();
        g.fillStyle="#000000";
        g.moveTo(251,330);
        g.quadraticCurveTo(241,369,139,384);
        g.quadraticCurveTo(231,400,273,343);
        g.closePath();
        g.fill();

        //右手
        g.strokeStyle="#842C00";
        g.fillStyle="#BA6830";
        g.beginPath();
        g.moveTo(15,291);
        g.bezierCurveTo(-16,339,31,348,51,339);
        g.fill();
        g.stroke();
        g.beginPath();
        g.moveTo(51,339);
        g.quadraticCurveTo(65,295,15,291);
        g.closePath();
        g.fill();

        //左手
        g.beginPath();
        g.moveTo(287,320);
        g.bezierCurveTo(370,283,377,363,322,356);
        g.fill();
        g.stroke();
        g.beginPath();
        g.moveTo(287,320);
        g.quadraticCurveTo(291,349,322,356);
        g.closePath();
        g.fill();

        //左脚
        g.beginPath();
        g.strokeStyle="#690203";
        g.fillStyle="#000000";
        g.moveTo(110,404);
        g.quadraticCurveTo(57,440,113,453);
        g.closePath();
        g.fill();
        g.stroke();
        //右脚
        g.beginPath();
        g.moveTo(110,424);
        g.bezierCurveTo(58,465,117,498,173,463);
        g.closePath();
        g.fill();
        g.stroke();

        //裙角
        g.beginPath();
        g.strokeStyle="#949591";
        g.fillStyle="#D1D2D4";
        g.moveTo(255,424);
        g.quadraticCurveTo(242,436,222,437);
        g.quadraticCurveTo(223,426,219,425);
        g.quadraticCurveTo(231,417,255,424);
        g.fill();
        g.stroke()
        g.closePath();

        //左腿
        g.beginPath();
        g.strokeStyle="#650300";
        g.fillStyle="#ED1B24";
        g.moveTo(211,404);
        g.quadraticCurveTo(245,467,166,467);
        g.closePath();
        g.fill();
        g.stroke();
        //右腿
        g.beginPath();
        g.moveTo(62,364);
        g.quadraticCurveTo(45,427,127,433);
        g.quadraticCurveTo(130,457,170,463);
        g.quadraticCurveTo(203,442,194,403);
        g.closePath();
        g.fill();
        g.stroke();

        //裙摆
        g.beginPath();
        g.strokeStyle="#949591";
        g.fillStyle="#FFFFFF";
        g.moveTo(45,354);
        g.quadraticCurveTo(174,413,246,410);
        g.quadraticCurveTo(254,419,254,424);
        g.quadraticCurveTo(226,414,204,438);
        g.quadraticCurveTo(166,389,125,432);
        g.quadraticCurveTo(102,400,66,403);
        g.quadraticCurveTo(70,372,32,365);
        g.quadraticCurveTo(36,360,45,354);
        g.fill();
        g.stroke();
        g.closePath();

        //裙
        g.beginPath();
        g.strokeStyle="#952C3D";
        g.fillStyle="#EE707B";
        g.moveTo(81,346);
        g.quadraticCurveTo(142,418,224,398);
        g.quadraticCurveTo(242,407,245,410);
        g.quadraticCurveTo(221,410,206,424);
        g.quadraticCurveTo(164,384,124,415);
        g.quadraticCurveTo(114,396,79,394);
        g.quadraticCurveTo(74,368,44,354);
        g.quadraticCurveTo(64,343,83,346);
        g.closePath();
        g.fill();
        g.stroke();
        //黑斑
        g.beginPath();
        g.fillStyle="#000000";
        g.moveTo(62,348);
        g.bezierCurveTo(59,365,90,390,86,353);
        g.lineTo(80,346);
        g.quadraticCurveTo(69,345,62,348);
        g.closePath();
        g.fill();
        g.beginPath();
        g.moveTo(112,377);
        g.quadraticCurveTo(114,380,132,388);
        g.bezierCurveTo(114,397,88,386,112,377);
        g.closePath();
        g.fill();
        g.beginPath();
        g.moveTo(205,402);
        g.quadraticCurveTo(212,401,226,398);
        g.bezierCurveTo(245,406,196,420,205,403);
        g.closePath();
        g.fill();

        //裙
        g.beginPath();
        g.strokeStyle="#952C3D";
        g.fillStyle="#EE707B";
        g.moveTo(106,395);
        g.quadraticCurveTo(160,363,193,412);
        g.quadraticCurveTo(160,389,125,414);
        g.fill();
        g.stroke();
        g.closePath();
        g.beginPath();
        g.fillStyle="#000000";
        g.moveTo(148,383);
        g.quadraticCurveTo(164,384,177,396);
        g.bezierCurveTo(153,405,140,382,148,383);
        g.closePath();
        g.fill();
        //修整
        g.beginPath();
        g.moveTo(81,346);
        g.quadraticCurveTo(48,345,31,365);
        g.stroke();
        g.closePath();
        g.beginPath();
        g.moveTo(228,399);
        g.quadraticCurveTo(257,415,254,424);
        g.stroke();
        g.closePath();


        //帽冠
        g.beginPath();
        g.strokeStyle="#DE821B";
        g.fillStyle ="#DDA90C";
        g.moveTo(40,137);
        g.bezierCurveTo(-8,152,-12,225,34,222);
        g.stroke();
        g.closePath();
        g.fill();

        g.beginPath();
        g.moveTo(38,137);
        g.bezierCurveTo(0,152,4,194,32,202);
        g.closePath();
        g.fillStyle="#FFDE00";
        g.fill();

        //帽子外边

        g.beginPath();
        g.moveTo(290,53);
        g.quadraticCurveTo(250,17,135,51);

        g.bezierCurveTo(-5,105,5,270,102,268);
        g.stroke();
        g.closePath();
        g.fillStyle="#DDA90C";
        g.fill();

        g.beginPath();
        g.fillStyle="#FFDE00";
        g.moveTo(290,54);
        g.bezierCurveTo(258,19,115,35,72,95);
        g.bezierCurveTo(75,95,3,207,100,227);
        g.closePath();
        g.fill();

        //头巾
        g.strokeStyle="#6B9C7F";
        g.fillStyle="#B2DDC9";
        g.beginPath();
        g.moveTo(329,98);
        g.bezierCurveTo(294,15,147,72,110,203);
        g.fill();
        g.stroke();
        g.closePath();
        g.beginPath();
        g.fillStyle="#8DB2A4";
        g.moveTo(247,62);
        g.lineTo(261,72);
        g.lineTo(280,70);
        g.lineTo(262,58);
        g.closePath();
        g.fill();


        //围巾
        g.beginPath();
        g.strokeStyle="#007CB2";
        g.fillStyle="#4DC6E1";
        g.moveTo(88,268);
        g.bezierCurveTo(132,277,173,358,214,318);
        g.quadraticCurveTo(185,337,185,352);
        g.bezierCurveTo(221,333,235,354,252,342);

        g.quadraticCurveTo(272,340,270,358);
        g.quadraticCurveTo(301,333,269,318);
        g.lineTo(280,325);
        g.quadraticCurveTo(292,297,165,227);
        g.fill();
        g.stroke();
        g.closePath();
        g.beginPath();
        g.lineTo(265,312);
        g.quadraticCurveTo(285,350,250,344);
        g.quadraticCurveTo(262,333,253,318);

        g.closePath();
        g.fill();
        g.stroke();

        //头
        g.beginPath();
        g.strokeStyle="#842C00";
        g.fillStyle="#BA6830";
        g.moveTo(351,141);
        g.bezierCurveTo(313,-3,144,102,111,234);
        g.bezierCurveTo(118,247,147,327,260,321);
        g.stroke();
        g.closePath();
        g.fill();
        //头阴影
        g.beginPath();
        g.fillStyle="#8B411F";
        g.moveTo(316,83);
        g.quadraticCurveTo(341,103,349,135);
        g.quadraticCurveTo(338,120,337,119);
        g.quadraticCurveTo(330,103,311,83);
        g.fill();
        g.closePath();

        //头巾结
        g.beginPath();
        g.strokeStyle="#6B9C7F";
        g.fillStyle="#B2DDC9";
        g.moveTo(231,2);
        g.quadraticCurveTo(245,75,311,78);
        g.quadraticCurveTo(331,56,325,13);
        g.quadraticCurveTo(316,16,303,5);
        g.quadraticCurveTo(315,37,304,65);
        g.quadraticCurveTo(263,58,264,2);
        g.quadraticCurveTo(255,12,231,1);
        g.quadraticCurveTo(235,61,301,78);
        g.fill();
        g.stroke();
        g.closePath();


        g.beginPath();
        g.moveTo(287,57);
        g.quadraticCurveTo(296,65,295,78);
        g.quadraticCurveTo(315,85,315,80);
        g.quadraticCurveTo(306,49,281,53);
        g.stroke();
        //g.closePath();
        g.fill();
        g.beginPath();
        g.fillStyle="#8DB2A4";
        g.moveTo(298,79);
        g.quadraticCurveTo(322,88,311,70);
        g.quadraticCurveTo(306,77,298,79);
        g.fill();
        g.closePath();

        //耳朵
        g.beginPath();
        g.strokeStyle="#842C00";
        g.fillStyle="#BA6830";
        g.moveTo(127,207);
        g.bezierCurveTo(62,164,36,281,135,268);

        g.stroke();
        g.closePath();
        g.fill();

        g.beginPath();
        g.fillStyle="#95411D";
        g.moveTo(123,236);
        g.bezierCurveTo(92,203,64,250,122,236);
        g.closePath();
        g.fill();

        g.beginPath();
        g.moveTo(127,238);
        g.lineWidth=1;
        g.strokeStyle="#842C00";
        g.quadraticCurveTo(104,220,88,225);
        g.stroke();

        //脸
        g.beginPath();
        g.moveTo(322,253);
        g.strokeStyle="#842C00";
        g.fillStyle="#FFFFFF";
        g.lineWidth=2;
        g.bezierCurveTo(276,235,376,197,348,135);
        g.quadraticCurveTo(303,73,237,81);
        g.quadraticCurveTo(203,93,170,129);
        g.quadraticCurveTo(143,223,231,268);
        g.bezierCurveTo(198,276,216,314,253,321);
        g.quadraticCurveTo(279,319,314,302);
        g.lineTo(317,294);
        g.quadraticCurveTo(338,285,316,257);

        g.closePath();
        g.stroke();
        g.fill();
        //脸阴影
        g.beginPath();
        g.fillStyle="#CCD0D5";
        g.moveTo(341,127);
        g.quadraticCurveTo(348,132,349,139);
        g.quadraticCurveTo(361,172,331,206);
        g.lineTo(329,201);
        g.quadraticCurveTo(358,159,339,126);
        g.fill();
        g.closePath();


        //眉毛
        g.beginPath();
        g.moveTo(279,137);
        g.strokeStyle="#096F30";
        g.fillStyle="#5CA74A";
        g.quadraticCurveTo(295,114,308,132);
        g.bezierCurveTo(312,142,307,143,312,162);
        g.bezierCurveTo(296,139,303,129,280,136);

        g.closePath();
        g.stroke();
        g.fill();

        //眼眶
        g.beginPath();
        g.moveTo(279,137);
        g.strokeStyle="#B21D21";
        g.fillStyle="#ED1B24";
        g.lineWidth=1;
        g.moveTo(321,253);
        g.bezierCurveTo(302,242,309,234,331,207);
        g.bezierCurveTo(279,109,198,173,235,228);
        g.bezierCurveTo(259,269,290,239,325,271);
        g.quadraticCurveTo(324,265,316,258);
        g.fill();
        g.stroke();
        g.closePath();


        //眼眶阴影
        g.beginPath();
        g.fillStyle="#B81214";
        g.moveTo(328,202);
        g.quadraticCurveTo(305,229,310,240);
        g.quadraticCurveTo(311,229,332,207);
        g.fill();
        g.closePath();

        //眼睛
        g.beginPath();
        g.moveTo(271,252);
        g.strokeStyle="#FFDE00";
        g.fillStyle="#FFFFFF";

        g.bezierCurveTo(226,187,326,161,299,257);
        g.stroke();
        g.closePath();
        g.stroke();
        g.fill();

        //眼球
        g.beginPath();
        g.fillStyle="#49494B";
        g.moveTo(292,255);
        g.bezierCurveTo(280,217,315,200,299,257);
        g.closePath();
        g.fill();
        g.beginPath();
        g.fillStyle="#000000";
        g.moveTo(299,251);
        g.bezierCurveTo(272,242,314,187,299,251);
        g.closePath();
        g.fill();
        g.beginPath();
        g.fillStyle="#FFFFFF";
        g.moveTo(298,229);
        g.bezierCurveTo(292,208,287,255,298,233);
        g.closePath();
        g.fill();

        //嘴巴
        g.beginPath();
        g.strokeStyle="#6DAE5E";
        g.moveTo(310,267);
        g.bezierCurveTo(328,282,312,308,293,303);
        g.stroke();
        g.strokeStyle="#842C00";
        g.moveTo(321,292);
        g.bezierCurveTo(322,301,318,304,312,298);
        g.stroke();
        g.fill();
        g.closePath();

        //右手阴影
        g.beginPath();
        g.fillStyle="#97441E";
        g.moveTo(8,331);
        g.quadraticCurveTo(28,336,53,318);
        g.quadraticCurveTo(53,328,50,339);
        g.quadraticCurveTo(18,347,10,331);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(311,352);
        g.quadraticCurveTo(326,346,338,354);
        g.quadraticCurveTo(327,359,311,352);
        g.fill();
        g.closePath();
        g.beginPath();
        g.fillStyle="#DDA80C";
        g.moveTo(54,318);
        g.bezierCurveTo(77,303,137,338,107,347);
        g.quadraticCurveTo(94,324,51,339);
        g.quadraticCurveTo(54,326,54,318);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(107,347);
        g.quadraticCurveTo(104,350,88,353);
        g.lineTo(83,345);
        g.quadraticCurveTo(85,341,91,337);
        g.quadraticCurveTo(99,341,107,345);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(260,371);
        g.quadraticCurveTo(277,387,311,352);
        g.quadraticCurveTo(316,356,322,356);
        g.quadraticCurveTo(287,408,250,382);
        g.fill();
        g.closePath();

        //云
        g.strokeStyle="#43AEDA";
        g.beginPath();
        g.moveTo(337,297);
        g.quadraticCurveTo(396,311,460,301);
        g.bezierCurveTo(442,296,453,278,462,283);
        g.moveTo(475,274);
        g.bezierCurveTo(487,299,447,284,464,265);
        g.bezierCurveTo(476,251,487,262,489,263);
        g.bezierCurveTo(464,227,533,216,533,243);
        g.bezierCurveTo(530,277,488,246,514,241);
        g.moveTo(529,228);
        g.bezierCurveTo(554,165,660,205,622,249);
        g.bezierCurveTo(667,267,620,326,585,278);
        g.bezierCurveTo(578,298,533,273,559,254);
        g.bezierCurveTo(587,244,581,282,565,270);
        g.moveTo(637,287);
        g.bezierCurveTo(672,316,624,331,614,323);
        g.moveTo(598,317);
        g.bezierCurveTo(595,337,566,309,592,306);
        g.bezierCurveTo(626,304,616,346,585,334);
        g.bezierCurveTo(570,353,536,346,530,324);
        g.bezierCurveTo(529,283,589,323,544,320);
        g.moveTo(516,317);
        g.bezierCurveTo(494,307,527,293,532,310);
        g.moveTo(528,327);
        g.bezierCurveTo(517,337,488,332,477,314);
        g.moveTo(480,311);
        g.quadraticCurveTo(425,319,337,297);
        g.stroke();
        g.closePath();

        g.beginPath();
        g.fillStyle="#C7E6F4";
        g.moveTo(480,311);
        g.quadraticCurveTo(425,319,337,297);
        g.quadraticCurveTo(425,315,473,306);
        g.fill();
        g.closePath();

        g.beginPath();
        g.moveTo(606,202);
        g.quadraticCurveTo(642,216,623,250);
        g.quadraticCurveTo(615,244,601,248);
        g.quadraticCurveTo(632,228,606,202);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(630,254);
        g.bezierCurveTo(663,282,609,315,589,281);
        g.bezierCurveTo(589,292,650,299,630,254);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(646,296);
        g.quadraticCurveTo(659,325,614,324);
        g.lineTo(614,324);
        g.quadraticCurveTo(648,319,646,296);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(573,328);
        g.quadraticCurveTo(574,339,561,345);
        g.quadraticCurveTo(578,343,585,334);
        g.fill();
        g.closePath();
        g.beginPath();
        g.moveTo(501,331);
        g.quadraticCurveTo(539,325,523,302);
        g.quadraticCurveTo(535,309,530,313);
        g.quadraticCurveTo(529,309,528,326);
        g.quadraticCurveTo(515,335,501,331);
        g.fill();
        g.closePath();
    })();

</script>
<div style="text-align:center;">
<p>${test}:<a target="_blank">${person}</a></p>
</div>
</body>
</html>