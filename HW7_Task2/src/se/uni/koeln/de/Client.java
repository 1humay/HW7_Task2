package se.uni.koeln.de;

public class Client {
	
	 public static void main(String[] args) {

	        CompositeOlympicTeam olympicsTeams = new CompositeOlympicTeam("Olympics Team");

	        CompositeOlympicTeam asiaTeam = new CompositeOlympicTeam("Asia Team");
	        CompositeOlympicTeam africaTeam = new CompositeOlympicTeam("Africa Team");
	        CompositeOlympicTeam europeTeam = new CompositeOlympicTeam("Europe Team");
	        CompositeOlympicTeam southAmericaTeam = new CompositeOlympicTeam("South America Team");
	        olympicsTeams.addChild(asiaTeam);
	        olympicsTeams.addChild(africaTeam);
	        olympicsTeams.addChild(europeTeam);
	        olympicsTeams.addChild(southAmericaTeam);

	        //Asia Team
	        CompositeOlympicTeam chinaTeam = new CompositeOlympicTeam("China Team");
	        CompositeOlympicTeam afghanistanTeam = new CompositeOlympicTeam("Afghanistan Team");
	        asiaTeam.addChild(chinaTeam);
	        asiaTeam.addChild(afghanistanTeam);
	        
	        //China Team
	        CompositeOlympicTeam chinaWomensTeam = new CompositeOlympicTeam("China-Women");
	        CompositeOlympicTeam chinaMensTeam = new CompositeOlympicTeam("China-Men");
	        chinaTeam.addChild(chinaWomensTeam);
	        chinaTeam.addChild(chinaMensTeam);
	        //China Women's Team
	        Team chinaWomensTeakwondo = new Team("Women's Teakwondo", 13, 2);
	        Team chinaWomensWaterpolo = new Team("Women's Waterpolo", 16, 4);
	        Team chinaWomensArtGymnast = new Team("Women's Artistic Gymnastics", 12, 5);
	        chinaWomensTeam.addChild(chinaWomensTeakwondo);
	        chinaWomensTeam.addChild(chinaWomensWaterpolo);
	        chinaWomensTeam.addChild(chinaWomensArtGymnast);
	        //China Men's Team
	        Team chinaMensShooting = new Team("Men's Shooting", 6, 1);
	        chinaMensTeam.addChild(chinaMensShooting);


	        //EuropeTeam
	        CompositeOlympicTeam germanyTeam = new CompositeOlympicTeam("Germany Team");
	        CompositeOlympicTeam italyTeam = new CompositeOlympicTeam("Italy Team");
	        europeTeam.addChild(germanyTeam);
	        europeTeam.addChild(italyTeam);

	        //Germany Team
	        CompositeOlympicTeam germanyWomensTeam = new CompositeOlympicTeam("Germany-Women");
	        CompositeOlympicTeam germanyMensTeam = new CompositeOlympicTeam("Germany-Men");
	        germanyTeam.addChild(germanyWomensTeam);
	        germanyTeam.addChild(germanyMensTeam);

	        //Germany Women's Team
	        Team germanyWomensCycling = new Team("Women's Cycling", 48, 5);
	        Team germanyWomensTennis = new Team("Women's Tennis", 29, 0);
	        germanyWomensTeam.addChild(germanyWomensCycling);
	        germanyWomensTeam.addChild(germanyWomensTennis);

	        //Germany Men's Team
	        Team germanyMensTableTennis = new Team("Men's Table Tennis", 48, 5);
	        Team germanyMensFootball = new Team("Men's Football", 18, 7);
	        germanyMensTeam.addChild(germanyMensTableTennis);
	        germanyMensTeam.addChild(germanyMensFootball);

	        //Italy Team
	        CompositeOlympicTeam italyWomensTeam = new CompositeOlympicTeam("Italy-Women");
	        CompositeOlympicTeam italyMensTeam = new CompositeOlympicTeam("Italy-Men");
	        italyTeam.addChild(italyWomensTeam);
	        italyTeam.addChild(italyMensTeam);

	        //Italy Women's Team
	        Team italyWomensAlpineSky = new Team("Women's Alpine Sky", 7, 1);
	        italyWomensTeam.addChild(italyWomensAlpineSky);

	        //Italy Men's Team
	        Team italyMensFootball = new Team("Men's Football", 30, 1);
	        Team italyMensSwimming = new Team("Men's Swimming Team", 8, 0);
	        italyMensTeam.addChild(italyMensFootball);
	        italyMensTeam.addChild(italyMensSwimming);


	        //4.a
	        germanyMensTeam.printNumberOfAthletes();

	        //4.b
	        germanyTeam.printNumberOfGoldMedals();

	        //4.c
	        asiaTeam.printNumberOfGoldMedals();

	        //4.d
	        olympicsTeams.printNumberOfAthletes();

	    }

}
