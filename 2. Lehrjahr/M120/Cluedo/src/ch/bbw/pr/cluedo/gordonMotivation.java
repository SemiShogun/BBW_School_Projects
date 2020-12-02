package ch.bbw.pr.cluedo;

/**
 * gordonMotivation.java
 * A small assortment of friendly insults by Gordon Ramsay!
 * Gordon's insults will appear if there is an empty radio button.
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */
public class gordonMotivation {

    public static String motivation() {
        String[] motivationQuotes = new String[] {
                "My gran could do better! And she's dead!",
                "WHAT ARE YOU?",
                "I wish you'd jump in the oven! That would make my life a lot easier!",
                "You fucking donkey.",
                "You surprise me at how shit you are.",
                "Hey panini head, are you listening to me?"
        };

        int random = (int)((Math.random()) * motivationQuotes.length);

        return motivationQuotes[random];
    }
}