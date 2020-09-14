package Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javafx.scene.control.ListView;

public class Team {
	
	private String colour;
	private String name;
	private ArrayList<Player> players;
	private ArrayList<Manager> managers;
	private Manager manager;
	
	public Team(String name, String colour) {
		this.name = name;
		players = new ArrayList<Player>();
		managers = new ArrayList<Manager>(1);
		this.colour = colour;
	}
	
	public boolean addPlayer(Player player) {
		players.add(player);
		return true;
	}
	public void removePlayer(int player) {
		players.remove(player);
	}
	
	public boolean addManager(Manager manager) {
		int retval = managers.size();
		if(retval == 0) {
			managers.add(manager);
		 }
		else { 
			System.out.println("ERROR, Enter One Manager Only!");
		}
		return true;
	}
	
	public void removeManager(Manager manager) {
		managers.remove(manager);
	}
    
	public String getColour() {
		return colour;
	}
    
	public void setColour(String colour) {
		Scanner team = new Scanner(System.in);
		System.out.println("Enter a colour: ");
		String colours = team.nextLine();
    	System.out.println("You entered " + colours);
		this.colour = colour;
		
	}
	
	public String toString() {
		return "Team: " + name + "\nManager: " + managers + "\nColour: " + colour + "\nPlayers: ";  
	}
	
	public void print() {
		System.out.println(toString());
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		};
		System.out.println("");
	}
	public ListView<Player> printToView(ListView<Player> view) {
		view.getItems().addAll(players);
		return view;
	}

	public void indexOf(String string) {
		
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getManagerName() {
		// TODO Auto-generated method stub
		return manager.getName().toString();
	}

	public String getManagerEmail() {
		// TODO Auto-generated method stub
		return manager.getEmail().toString();
	}

	public String getManagerDOB() {
		// TODO Auto-generated method stub
		return manager.getDateofbirth().toString();
	}

	public String getManagerPhone() {
		// TODO Auto-generated method stub
		return manager.getPhone().toString();
	}

	public int getManagerRating() {
		// TODO Auto-generated method stub
		return manager.getStarrating();
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	}
