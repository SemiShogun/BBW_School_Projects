package application;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	//!!!!! geben Sie den Attributen andere Namen !!!!!!
	private ObservableList<String>  olHistory; // Liste fuer die History
	
	private StringProperty teamA; // so heisst das Team A
	private StringProperty teamB; // so heisst das Team B
	
	private IntegerProperty totalA;  // so viele Punkte hat das Team A im Total
	private IntegerProperty totalB; // so viele Punkte hat das Team B im Total

	private DoubleProperty percentA;  // Punkte in Prozent von 2500 Team A
	private DoubleProperty percentB; // Punkte in Prozent von 2500 Team B

	public Model() {
		olHistory = FXCollections.observableArrayList();

		teamA = new SimpleStringProperty("test1");
		teamB = new SimpleStringProperty("test2");
		totalA = new SimpleIntegerProperty(0);
		totalB = new SimpleIntegerProperty(0);
		percentA = new SimpleDoubleProperty(0.0);
		percentB = new SimpleDoubleProperty(0.0);
	}

	public ObservableList<String> getOlHistory() {
		return olHistory;
	}

	public void setOlHistory(ObservableList<String> olHistory) {
		this.olHistory = olHistory;
	}

	public String getTeamA() {
		return teamA.get();
	}

	public StringProperty teamAProperty() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA.set(teamA);
	}

	public String getTeamB() {
		return teamB.get();
	}

	public StringProperty teamBProperty() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB.set(teamB);
	}

	public int getTotalA() {
		return totalA.get();
	}

	public IntegerProperty totalAProperty() {
		return totalA;
	}

	public void setTotalA(int totalA) {
		this.totalA.set(totalA);
	}

	public int getTotalB() {
		return totalB.get();
	}

	public IntegerProperty totalBProperty() {
		return totalB;
	}

	public void setTotalB(int totalB) {
		this.totalB.set(totalB);
	}

	public double getPercentA() {
		return percentA.get();
	}

	public DoubleProperty percentAProperty() {
		return percentA;
	}

	public void setPercentA(double percentA) {
		this.percentA.set(percentA);
	}

	public double getPercentB() {
		return percentB.get();
	}

	public DoubleProperty percentBProperty() {
		return percentB;
	}

	public void setPercentB(double percentB) {
		this.percentB.set(percentB);
	}

	public void deleteProgress() {
		this.totalA.set(0);
		this.totalB.set(0);

		this.percentA.set(0.0);
		this.percentB.set(0.0);
	}

	public void deleteEverything() {
		this.olHistory.clear();

		this.teamA.set("");
		this.teamB.set("");

		this.totalA.set(0);
		this.totalB.set(0);

		this.percentA.set(0.0);
		this.percentB.set(0.0);
	}

}
