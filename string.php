<?php

//     NỐI CHUỖI
$a = "Nguyen Van An";
$e = "Tran Thi Nhu Ngoc";
$ea = $a . " " . $e;
echo $ea;
echo "<br>";

//      CẮT CHUỖI THÀNH MẢNG, NGĂN CÁCH BỞI KÝ TỰ
$traicay = "cam,quyt,xoai,oi,coc";
$rotraicay = explode(",", $traicay);
for ($i = 0; $i < count($rotraicay); $i++) {
    echo $rotraicay[$i];
    echo " " . "<br>";
}
//      CẮT CHUỖI THEO ĐỘ DÀI 
$x = "Chao moi nguoi!";
echo substr($x, 10, 8);
echo "<br>";
echo substr($x, 1);
echo "<br>";
echo substr($x, -10, 7);
echo "<br>";
echo substr($x, 5, -1);
echo "<br>";
echo substr($x, -12, -2);
echo "<br>";
//      KÝ TỰ BẤT HỢP LỆ
$x = "We are the so-called \"Vikings\" from the north.";
echo $x;
?>
