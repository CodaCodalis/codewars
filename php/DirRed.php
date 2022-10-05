<?php

class DirRed
{
    function dirReduc($arr) {
        $busy = true;
        while ($busy) {
            $busy = false;
            for ($i = 0; $i < sizeof($arr); $i++) {
                $cond = false;
                while ($i < sizeof($arr)) {
                    if ($arr[$i] == "SOUTH" and $arr[$i + 1] == "NORTH") {
                        $cond = true;
                        break;
                    }
                    if ($arr[$i] == "NORTH" and $arr[$i + 1] == "SOUTH") {
                        $cond = true;
                        break;
                    }
                    if ($arr[$i] == "EAST" and $arr[$i + 1] == "WEST") {
                        $cond = true;
                        break;
                    }
                    if ($arr[$i] == "WEST" and $arr[$i + 1] == "EAST") {
                        $cond = true;
                        break;
                    }
                    break;
                }
                if ($cond) {
                    $arr = array_replace($arr, array($i => "STOP", $i + 1 => "STOP"));
                    $busy = true;
                }
            }
            $arrsize = sizeof($arr);
            for ($j = 0; $j < $arrsize; $j++) {
                if ($arr[$j] == "STOP") {
                    unset($arr[$j]);
                }
            }
            $arr = array_values($arr);
        }
        return $arr;
    }
}