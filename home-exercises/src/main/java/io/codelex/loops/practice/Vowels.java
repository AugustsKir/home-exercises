package io.codelex.loops.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Vowels {

    //TODO: print all vowels using for and foreach
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};


        //todo - use for
        int i;
        for (i = 0; i < vowels.length; i++ ) {
            System.out.println(vowels[i]);
        }




       // todo - use foreach
        for (char vowel : vowels) {
            System.out.println(vowel);
        }

    }

}
