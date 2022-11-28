package se.uni.koeln.de;
import java.util.ArrayList;


public class CompositeOlympicTeam implements OlympicTeam {
	
	private String name;
	private ArrayList<OlympicTeam> children;
	
	//constructor
	public CompositeOlympicTeam(String name) {
        this.children = new ArrayList<OlympicTeam>();
        this.name = name;
    }
	
	public ArrayList<OlympicTeam> getChildren() {
        return children;
    }
	
	public void addChild(OlympicTeam child) {
        this.children.add(child);

    }

    public void removeChild(OlympicTeam child) {
        children.remove(child);
    }
    
    //method from the interface
    public void printNumberOfAthletes() {
        System.out.println(this.name);
        for (OlympicTeam t : children) {
            t.printNumberOfAthletes();
        }
    }
    
    public void printNumberOfGoldMedals() {
        System.out.println(this.name);
        for (OlympicTeam t : children) {
            t.printNumberOfGoldMedals();
        }
    }

}
