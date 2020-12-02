package sample;

import javafx.application.Platform;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Controller {
    String Lotto = "x";

    public void Ch() {
        String Lotto = "CH";
    }

    public void Eu() {
        String Lotto = "EU";
    }

    public static void randomZahlCH(String[]args) {
        set<Integer> numbers = new TreeSet();
        Random random = new Random();
        while(numbers.size() < 6){
            int n = random.nextInt(46);
            if(n > 0){
                numbers.add(n);
            }
        }

    }

    public static void randomZahlEU(String[]args) {
        set<Integer> numbers = new TreeSet();
        Random random = new Random();
        while(numbers.size() < 5){
            int n = random.nextInt(51);
            if(n > 0){
                numbers.add(n);
            }
        }

    }

    public void btnExit() {
        Platform.exit();
        System.exit(0);
    }

}
