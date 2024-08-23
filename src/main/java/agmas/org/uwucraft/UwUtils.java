package agmas.org.uwucraft;

import java.util.Random;

// https://github.com/honkling/PrisonGame/blob/develop/src/main/java/prisongame/prisongame/lib/UwUtils.java
/*
*
* Original Code by Aroze
* Stolen from goose
* Translated by me for PrisonButBad
*
* Have fun :3c
*
* */

public class UwUtils {

    public static String uwuify(String text) {
        return text.toLowerCase()
                .replaceAll("\\.", "~ ")
                .replaceAll(",", "~ ")
                .replaceAll("-", "~ ")
                .replaceAll("\\?", "~ ")
                .replaceAll("hurt", "hUWUrt")
                .replaceAll("kill", "hwuwrt")
                .replaceAll("you", "you<3")
                .replaceAll("r", "w")
                .replaceAll("l", "w")
                .replaceAll("uwu", "UWU")
                .replaceAll("owo", "OWO")
                .replaceAll(";-;", "(-_-)")
                .replaceAll("-_-", "(-_-)")
                .replaceAll(":o", "※(^o^)/※")
                .replaceAll(":0", "※(^o^)/※")
                .replaceAll(":\\)", "(｡◕‿‿◕｡)")
                .replaceAll(":>", "(｡◕‿‿◕｡)")
                .replaceAll(":\\(", "(︶︹︶)")
                .replaceAll(":<", "(︶︹︶)")
                .replaceAll(":3", "(・3・)")
                .replaceAll(":D", "(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧")
                .replaceAll("\\._\\.", "(っ´ω`c)")
                .replaceAll("fuck", "fwick")
                .replaceAll("shit", "*poops*")
                .replaceAll("wtf", "whawt the fwick")
                .replaceAll("wth", "whawt the hecc");
    }

    public static String maximumUwuify(String text) {
        return text.toLowerCase()
                .replaceAll("\\.", "~ ")
                .replaceAll(",", "~ ")
                .replaceAll("-", "~ ")
                .replaceAll("\\?", "~ ")
                .replaceAll("hurt", "hUWUrt")
                .replaceAll("kill", "hwuwrt")
                .replaceAll("you", "you<3")
                .replaceAll("r", "w")
                .replaceAll("l", "w")
                .replaceAll("uwu", "UWU")
                .replaceAll("owo", "OWO")
                .replaceAll(";-;", "(-_-)")
                .replaceAll("-_-", "(-_-)")
                .replaceAll(":o", "※(^o^)/※")
                .replaceAll(":0", "※(^o^)/※")
                .replaceAll(":\\)", "(｡◕‿‿◕｡)")
                .replaceAll(":>", "(｡◕‿‿◕｡)")
                .replaceAll(":\\(", "(︶︹︶)")
                .replaceAll(":<", "(︶︹︶)")
                .replaceAll(":3", "(・3・)")
                .replaceAll(":D", "(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧")
                .replaceAll("\\._\\.", "(っ´ω`c)")
                .replaceAll("fuck", "fwick")
                .replaceAll("shit", "*poops*")
                .replaceAll("wtf", "whawt the fwick")
                .replaceAll("wth", "whawt the hecc") + getRandomUwUSuffix();
    }

    static String getRandomUwUSuffix() {
        String[] uwuSuffixes = new String[]{
                "~ uwu *nuzzles you*",
                "~ owo whats this",
                "~ *kisses you*",
                "~ *blushes*",
                "~ *hehe*",
                "~ meow",
                "~ owo",
                "~ uwu",
                " ;3",
                "~ *boops your nose*",
                "~ *snuggles with you*",
                "~ *giggles*",
                "~ *hugs you*",
        };
        return uwuSuffixes[new Random().nextInt(0,uwuSuffixes.length-1)];
    }
}