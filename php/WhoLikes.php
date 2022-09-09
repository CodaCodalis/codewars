<?php

class WhoLikes
{
    function likes($names) : string {
        $s = sizeof($names);
        $list = "";
        if ($s == 0) {
            return "no one likes this";
        } elseif ($s == 1) {
            return $names[0]." likes this";
        } elseif ($s > 1 and $s < 4) {
            for ($i = 0; $i < $s - 1; $i++) {
                $list .= $names[$i].", ";
            }
            $list = substr($list,0,-2);
            return $list." and ".$names[$s - 1]." like this";
        } else {
            return $names[0].", ".$names[1]." and ".strval($s - 2)." others like this";
        }
    }
}