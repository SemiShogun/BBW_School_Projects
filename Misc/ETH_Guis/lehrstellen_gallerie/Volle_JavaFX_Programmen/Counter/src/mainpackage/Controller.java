/*
@author Matthias Stierlin
@version 08.05.2019
 */

package mainpackage;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller {

    @FXML private Slider sliderBereich;
    @FXML private Slider sliderSchrittweite;
    @FXML private Label anzeige;
    @FXML private Label sliderAnzeige;
    @FXML private ProgressBar zaehlerstand;

    int minimum = 0;
    int maximum = 10;
    int counter = 0;
    int schrittweite = 1;

    /*
    Addiert den Wert von Schrittweite zu counter, sofern
    der Wert von "maximum" nicht überschritten wird.
    Die Anzeige wird am Ende aktualisiert.
     */
    public void btnPlus(){
        counter = counter + schrittweite;
        if (counter >= maximum){
            counter = maximum;
        }
        anzeigeNachfuehren();
    }

    /*
    Subtrahiert den Wert von Schrittweite vom counter, sofern
    der Wert von "minimum" nicht unterschritten wird.
    Die Anzeige wird am Ende aktualisiert.
     */
    public void btnMinus() {
        counter = counter - schrittweite;
        if (counter <= minimum) {
            counter = minimum;
        }
        else if (counter > maximum) {
            counter = maximum;
        }
        anzeigeNachfuehren();
    }

    /*
    Setzt den counter auf den Startwert zurück.
    Die anzeige wird am Ende aktualisiert.
     */
    public void btnReset(){
        counter = 0;
        anzeigeNachfuehren();
    }

    /*
    Bestimmt den Wert vom maximum und falls der Wert vom "counter" höher als "maximum" ist setzt er den Wert auf
    den gleichen Wert von "maximum". Er aktulisiert auch in den Fall den Anzeige auf den neuen Wert von "counter".
     */
    public  void  sliderBereich() {
        maximum = (int) sliderBereich.getValue();
        //Dient um den Anzeigelabel anzupassen falls :
        if (counter >= maximum) {
            counter = maximum;
            StringBuilder sliderCounter = new StringBuilder();
            sliderCounter.append("");
            sliderCounter.append(counter);
            String sliderCounterToString = sliderCounter.toString();
            anzeige.setText(sliderCounterToString); //Da wird der Zählerstand gesagt.
        }
        progressbar();
        sliderAnzeige();
    }

    /*
    Nimmt aktuellen Wert aus Slider "Bereich", wandelt diesen in einen String um und setzt ihn in den Label.
     */
    public void sliderAnzeige(){
        int sliderBereichWert = (int) sliderBereich.getValue();

        StringBuilder sliderWert = new StringBuilder();
        sliderWert.append("");
        sliderWert.append(sliderBereichWert);
        String sliderBereichwertinString = sliderWert.toString();
        sliderAnzeige.setText(sliderBereichwertinString); //Da wird der Slider wert in den Slideranzeige übermittelt.
    }

    /*
    Bestimmt den Schrittweite-Wert.
     */
    public void sliderSchrittweite(){
        schrittweite = (int) sliderSchrittweite.getValue();
    }

    /*
    Aktualisiert die GUI-Anzeige.
     */
    public void anzeigeNachfuehren() {
        anzeige();
        progressbar();
    }

    /*
    Aktualisiert den Label mit dem Wert der Variabel "counter".
     */
    public void anzeige(){
        StringBuilder counterAnzeige = new StringBuilder();//Da wandeln wir "counter" von "int" to "String".
        counterAnzeige.append("");
        counterAnzeige.append(counter);
        String counterWrite = counterAnzeige.toString();
        anzeige.setText(counterWrite); //Da wird der Zählerstand gesagt.
    }

    /*
    Setzt Progressbar anhand des aktuellen Wertes vom counter zum eingestellten maximum.
     */
    public void progressbar() {
        double maximumForProgressbar = (int) sliderBereich.getValue();
        double counterForProgressbar = counter;

        double Progressvalue = counterForProgressbar / maximum;

        zaehlerstand.setMaxHeight(maximumForProgressbar);
        zaehlerstand.setProgress(Progressvalue);
    }
}
