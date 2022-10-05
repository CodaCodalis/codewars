<?php

class DecToHex
{
    function rgb($r, $g, $b) {
        $arr = array($r, $g, $b);
        $rgbhex = '';
        for ($i = 0; $i < sizeof($arr); $i++) {
            if ($arr[$i] < 0) {
                $arr[$i] = 0;
            } elseif ($arr[$i] > 255) {
                $arr[$i] = 255;
            }
            $shex = dechex($arr[$i]);
            $shex = strtoupper($shex);
            if (strlen($shex) < 2) {
                $shex = "0".$shex;
            }
            $rgbhex .= $shex;
        }
        return $rgbhex;
    }
}