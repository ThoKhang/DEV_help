<?php
    $a = 100.0;
    if (is_float($a)) echo "a la so thap phan" . "<br>";
    else echo "a khong la so thap phan";
    
    $b = 90.0;
    $b2 = 0;
    if ($b2 == 0)
        $c = INF;
    else
        $c = $b / $b2;
    echo $c . "<br>";
    echo is_infinite($c) ? "Dung, no la so vo cung" : "Sai, no khong phai la so vo cung";
    echo "<br>";

    $numberstring ="123.45";
    $n2 = $numberstring + 10;
    echo $n2 ."\t"; var_dump($n2); echo "<br>";
    echo $numberstring ."\t"; var_dump($numberstring); echo "<br>";
    echo is_numeric($n2) ? "Dung n2 la chuoi so nguyen" : "Sai, vi n2 khong phai la chuoi so nguyen" . "<br>";
?>