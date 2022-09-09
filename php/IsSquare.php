<?php

class IsSquare
{
    function isSquare($n){
        $number = (int)substr(sqrt($n) * 10, 1);
        if ($number == 0) {
            return true;
        } else {
            return false;
        }
    }
}