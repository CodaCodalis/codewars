<?php

class Anagrams
{
    function anagrams($word, $words) {
        $wordlen  = strlen($word);
        $arr = [];
        for ($i=0; $i<count($words); $i++){
            $wordsstr = $words[$i];
            $isAppending = TRUE;
            if ( strlen($wordsstr) !== $wordlen ){
                continue;
            }
            $wordsstrsplit = str_split($wordsstr);
            for($j=0; $j<$wordlen; $j++){
                $comp = $word[$j];
                $key    = array_search($comp, $wordsstrsplit);
                if ($key !== FALSE) {
                    unset($wordsstrsplit[$key]);
                }
                else{
                    $isAppending = FALSE;
                    break;
                }
            }
            if($isAppending === TRUE && count($wordsstrsplit) === 0){
                $arr[] = $wordsstr;
            }
        }
        return $arr;
    }
}