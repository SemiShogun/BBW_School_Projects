package ch.bbw.jl.craps;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ch.bbw.jl.craps.login.LoginController;

/**
 * Controller.java
 * 
 * @author Jamie Lam
 * @version 31.01.2020
 */
public class Controller implements Initializable {

    @FXML
    private Button btThrow;
    @FXML
    private ImageView dice1;
    @FXML
    private ImageView dice2;
    @FXML
    private Label gameResult;
    @FXML
    private Label placeHolder;
    
    Dice dice = new Dice();
    
    private int[] diceNumbers;
    
    @Override
    public void initialize(URL Arg, ResourceBundle bundle) {
        
    	String name = LoginController.nickName;
    	System.out.println(name);
    	this.dice1.setImage(new Image(getClass().getResourceAsStream("resources/images/Dice_0.png")));
        this.dice2.setImage(new Image(getClass().getResourceAsStream("resources/images/Dice_0.png")));
        this.placeHolder.setText(name);
        
        btThrow.setOnAction(ActionEvent -> {
    		System.out.println("Dice thrown");
    		
    		boolean result = startGame(dice);
    		    		
    		if (result) {
    			setImages(diceNumbers);
    			gameResult.setText("You win!");
    		} else {
    			setImages(diceNumbers);
    			gameResult.setText("You Lose...");
    		}

        });
    }
    
    public void setImages(int[] diceNumbers) {
        this.dice1.setImage(new Image(getClass().getResourceAsStream("resources/images/Dice_" + Integer.toString(diceNumbers[0]) + ".png")));
        this.dice2.setImage(new Image(getClass().getResourceAsStream("resources/images/Dice_" + Integer.toString(diceNumbers[1]) + ".png")));
    }
    
    public boolean startGame(Dice dice) {
    	Craps craps = new Craps(dice);
    	boolean result = craps.play();
    	diceNumbers = craps.getDiceNumbers();
    	return result;
    }
    
}
