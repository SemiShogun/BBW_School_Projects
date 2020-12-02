package ch.bbw.jl.sportclub;

/**
 * Witze-Observer Applikations Klasse
 * @author Jamie Lam
 * @version 03.07.2020
 */
public class Application {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Active active1 = new Active();
		MoneySponsor sponsor1 = new MoneySponsor();

		SportClub sac = new SportClub();
		sac.addProperty(fan1);
		sac.addProperty(active1);
		sac.addProperty(sponsor1);
		
		System.out.println("Start");
		sac.sendSommerfestMessage();
		sac.sendTurnfestMessage();
		sac.sendVolleyballMessage();
		System.out.println("End");
	}
}
