package se.uni.koeln.de;

public class Team implements OlympicTeam{
	
	private String name;
    private int numberOfAthletes = 0;
    private int numberOfGoldMedals = 0;
    
    public Team(String name, int numberOfAthletes, int numberOfGoldMedals) {
        this.name = name;
        this.numberOfAthletes = numberOfAthletes;
        this.numberOfGoldMedals = numberOfGoldMedals;
    }
    
    public int getNumberOfAthletes() {
        return numberOfAthletes;
    }

    public void setNumberOfAthletes(int numberOfAthletes) {
        this.numberOfAthletes = numberOfAthletes;
    }
    
    public int getNumberOfGoldMedals() { 
        return numberOfGoldMedals;
    }

    public void setNrOfGoldMedals(int nrOfGoldMedals) {
        this.numberOfGoldMedals = nrOfGoldMedals;
    }

    

    
    public void printNumberOfGoldMedals() {
        System.out.println("Team: " + this.name + " , " + "Number of GoldMedals: " + this.numberOfGoldMedals);
    }
    
    public void printNumberOfAthletes() {
        System.out.println("Team: " + this.name + " , " + "Number of Athletes: " + this.numberOfAthletes);
    }


}
