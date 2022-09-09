<?php

class MultiplesOfThreeAndFive
{
    function solution($number)
    {
        $counter_three = 0;
        $counter_five = 0;
        $counter_both = 0;
        for($i = 1; $i <= $number; $i++) {
            if ($i % 3 == 0) {
                $counter_three += 1; // 3
            }
            if ($i % 5 == 0) {
                $counter_five += 1; // 2
            }
            if ($i % 3 == 0 && $i % 5 == 0) {
                $counter_both += 1;
            }
        }
        if ($number % 3 == 0) {
            $counter_three += -1; // 3
        }
        if ($number % 5 == 0) {
            $counter_five += -1; // 1
        }
        $sum_three = ($counter_three * ($counter_three + 1) / 2) * 3;
        $sum_five = ($counter_five * ($counter_five + 1) / 2) * 5;
        $sum_both = ($counter_both * ($counter_both + 1) / 2) * 15;

        return $sum_three + $sum_five - $sum_both;

    }
}