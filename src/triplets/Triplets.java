/*
 * Author: Ahmed A.
 * Last edit: Feb 28th, 2020.
 * This program is a fun rhyming triplet generator.
 */
package triplets;

import java.util.ArrayList;

/**
 *
 * @author ahalh7876
 */
public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */

        //This program will use a dynamic arrays
        ArrayList<String> nouns = new ArrayList<String>();
        nouns.add("bog");
        nouns.add("trog");
        nouns.add("log");
        nouns.add("frog");
        nouns.add("hog");
        nouns.add("grog");
        nouns.add("pterodog");

        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");

        ArrayList<String> rhymingNouns = new ArrayList<String>();
        rhymingNouns.add("crocodile");
        rhymingNouns.add("francophile");
        rhymingNouns.add("juvenile");
        rhymingNouns.add("swedish mile");
        rhymingNouns.add("recompile");
        rhymingNouns.add("architectural style");
        rhymingNouns.add("international nautical mile");
        rhymingNouns.add("once in a while");

        String noun, noun2;
        String verb1, verb2;
        String rhymingNoun1, rhymingNoun2, rhymingNoun3;
        int randomNum;

        //get the first random noun from the nouns array
        //use .size() to get the # of elements
        randomNum = (int) (Math.random() * nouns.size());
        noun = nouns.get(randomNum);
        nouns.remove(randomNum);
        
        //get the second random noun from the nouns array
        //use .size() to get the # of elements
        randomNum = (int) (Math.random() * nouns.size());
        noun2 = nouns.get(randomNum);
        nouns.remove(randomNum);

        //get the first random verb from the verbs array &
        // remove from ArrayList
        randomNum = (int) (Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb2 = verbs.get(randomNum);
        randomNum = (int) (Math.random() * verbs.size());
        verbs.remove(randomNum);

        //get the first rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the second rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the second rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun3 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //Display the poem
        System.out.println("The " + noun + " " + verb1 + " a "
                + rhymingNoun1 + "\n" + "And then " + verb2
                + " it in the " + rhymingNoun2 + "\n" + "But the " + noun2 + " " + verb1 + " a "
                + rhymingNoun3);
    }
}
