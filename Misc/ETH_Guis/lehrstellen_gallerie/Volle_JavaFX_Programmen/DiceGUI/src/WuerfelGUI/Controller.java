package WuerfelGUI;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.Objects;

public class Controller {

    //Hier wird den Combobox Dropdown Menu und Bilder verknuepft
    @FXML
    private ComboBox<String> dropdown;
    @FXML
    private ImageView imageview1;
    @FXML
    private ImageView imageview2;
    @FXML
    private ImageView imageview3;

    //Dieses Konstruktor Initialisiert den GUI
    @FXML

    /*
      Initialisieren des Dropdown-Menues fuer die Anzahl der Wuerfel
     */
    public void initialize() {
        dropdown.getItems().addAll("1", "2", "3");
        dropdown.getSelectionModel().select("1");
        //initialisiere_Combobox() und wuerfeln() werden beide aufgerufen.
        initialisiere_Combobox();
        wuerfeln();
    }

    /**
     * initialisiere_Combobox() ist gemeint dafuer, dass falls die Zahl im Dropdown Menu geaendert wird, wird es nicht
     * automatisch Wuerfeln, sondern leere Wuerfeln vorzeigen
     */
    public void initialisiere_Combobox() {
        String zahl = dropdown.getValue();
        Image imageplaceholder = new Image("WuerfelGUI/fotos/wuerfel0.jpg");

        //Falls den Dropdown Menu den Nummer "1 enthaelt, wird nur ein Leere Wuerfel gezeigt.
        if (Objects.equals(zahl, "1")) {
            imageview1.setImage(null);
            imageview2.setImage(imageplaceholder);
            imageview3.setImage(null);
            System.out.println(zahl);
        }
        //Falls den Dropdown Menu den Nummer "2" enthaelt, werden zwei Leeren Wuerfeln gezeigt.
        else if (Objects.equals(zahl, "2")) {
            imageview1.setImage(imageplaceholder);
            imageview2.setImage(null);
            imageview3.setImage(imageplaceholder);
            System.out.println(zahl);
        }
        //Falls den Dropdown Menu den Nummer "3" enthaelt, werden drei (Alle) Leeren Wuerfeln gezeigt.
        else {
            imageview1.setImage(imageplaceholder);
            imageview2.setImage(imageplaceholder);
            imageview3.setImage(imageplaceholder);
            System.out.println(zahl);
        }
    }

    /**
     * wuerfeln() ist die Knopf, die automatisch 1 bis 3 Zahlen generiert und die Zahlen im Array einfuegt.
     * Nachdem die Zahlen generiert sind, wird es die entsprechende Zahl als Wuerfel vorzeigen, von 1 bis 6.
     */
    public void wuerfeln() {
        Image image1 = new Image("WuerfelGUI/fotos/wuerfel1.jpg");
        Image image2 = new Image("WuerfelGUI/fotos/wuerfel2.jpg");
        Image image3 = new Image("WuerfelGUI/fotos/wuerfel3.jpg");
        Image image4 = new Image("WuerfelGUI/fotos/wuerfel4.jpg");
        Image image5 = new Image("WuerfelGUI/fotos/wuerfel5.jpg");
        Image image6 = new Image("WuerfelGUI/fotos/wuerfel6.jpg");

        String wahl = dropdown.getValue();
        int[] wuerfel = new int[3];

        if (Objects.equals(wahl, "1")) {
            //for (int i = 0; i < 1; i++) ist eine Looping Sequenz die nur 1x geloopt wird, dieses Loop erstellt
            //eine Zufaellige Zahl und fuegt es im Array ein.
            for (int i = 0; i < 1; i++) {
                int zufallszahl;
                zufallszahl = (int) (Math.random() * 6) + 1;
                wuerfel[i] = zufallszahl;
                System.out.println(Arrays.toString(wuerfel));
                System.out.println(wuerfel[0]);
            }
            if (wuerfel[0] == 1) {
                imageview2.setImage(image1);
            } else if (wuerfel[0] == 2) {
                imageview2.setImage(image2);
            } else if (wuerfel[0] == 3) {
                imageview2.setImage(image3);
            } else if (wuerfel[0] == 4) {
                imageview2.setImage(image4);
            } else if (wuerfel[0] == 5) {
                imageview2.setImage(image5);
            } else {
                imageview2.setImage(image6);
            }
        } else if (Objects.equals(wahl, "2")) {
            //for (int i = 0; i < 2; i++) ist eine Looping Sequenz die nur 2x geloopt wird, dieses Loop erstellt
            //zwei Zufaelligen Zahlen und fuegt es im Array ein.
            for (int i = 0; i < 2; i++) {
                int zufallszahl;
                zufallszahl = (int) (Math.random() * 6) + 1;
                wuerfel[i] = zufallszahl;
                System.out.println(Arrays.toString(wuerfel));
                System.out.println(wuerfel[0]);
            }
            if (wuerfel[0] == 1) {
                imageview1.setImage(image1);
            } else if (wuerfel[0] == 2) {
                imageview1.setImage(image2);
            } else if (wuerfel[0] == 3) {
                imageview1.setImage(image3);
            } else if (wuerfel[0] == 4) {
                imageview1.setImage(image4);
            } else if (wuerfel[0] == 5) {
                imageview1.setImage(image5);
            } else {
                imageview1.setImage(image6);
            }

            if (wuerfel[1] == 1) {
                imageview3.setImage(image1);
            } else if (wuerfel[1] == 2) {
                imageview3.setImage(image2);
            } else if (wuerfel[1] == 3) {
                imageview3.setImage(image3);
            } else if (wuerfel[1] == 4) {
                imageview3.setImage(image4);
            } else if (wuerfel[1] == 5) {
                imageview3.setImage(image5);
            } else {
                imageview3.setImage(image6);
            }
        } else {
            //for (int i = 0; i < 3; i++) ist eine Looping Sequenz die nur 3x geloopt wird, dieses Loop erstellt
            //drei Zufaelligen Zahlen und fuegt es im Array ein.
            for (int i = 0; i < 3; i++) {
                int zufallszahl;
                zufallszahl = (int) (Math.random() * 6) + 1;
                wuerfel[i] = zufallszahl;
                System.out.println(Arrays.toString(wuerfel));
                System.out.println(wuerfel[0]);
            }
            if (wuerfel[0] == 1) {
                imageview1.setImage(image1);
            } else if (wuerfel[0] == 2) {
                imageview1.setImage(image2);
            } else if (wuerfel[0] == 3) {
                imageview1.setImage(image3);
            } else if (wuerfel[0] == 4) {
                imageview1.setImage(image4);
            } else if (wuerfel[0] == 5) {
                imageview1.setImage(image5);
            } else {
                imageview1.setImage(image6);
            }

            if (wuerfel[1] == 1) {
                imageview2.setImage(image1);
            } else if (wuerfel[1] == 2) {
                imageview2.setImage(image2);
            } else if (wuerfel[1] == 3) {
                imageview2.setImage(image3);
            } else if (wuerfel[1] == 4) {
                imageview2.setImage(image4);
            } else if (wuerfel[1] == 5) {
                imageview2.setImage(image5);
            } else {
                imageview2.setImage(image6);
            }
            if (wuerfel[2] == 1) {
                imageview3.setImage(image1);
            } else if (wuerfel[2] == 2) {
                imageview3.setImage(image2);
            } else if (wuerfel[2] == 3) {
                imageview3.setImage(image3);
            } else if (wuerfel[2] == 4) {
                imageview3.setImage(image4);
            } else if (wuerfel[2] == 5) {
                imageview3.setImage(image5);
            } else {
                imageview3.setImage(image6);
            }
        }
    }
}