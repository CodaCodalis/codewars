<?php

class StopSpinning
{
    function spinWords(string $str): string {
        // TODO Have fun :)
        $strArr = explode(" ", $str);
        $sizeArr = sizeof($strArr); // 3
        if ($sizeArr > 1) { // true
            for ($i = 0; $i < $sizeArr; $i++) {
                $sizeStr = strlen($strArr[$i]);
                if ($sizeStr > 4) {
                    $revStr = strrev($strArr[$i]);
                    $strArr[$i] = $revStr;
                }
            }
        } else {
            if (strlen($str) > 4) {
                return strrev($str);
            } else {
                return $str;
            }
        }

        return implode(" ", $strArr);
    }
}