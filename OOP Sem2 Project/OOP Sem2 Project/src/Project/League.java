package Project;
import java.util.ArrayList;
import javafx.scene.control.ListView;

public class League {
	private String name;
	private ArrayList<Team> teams;
	
	public League(String leagName) {
		teams = new ArrayList<Team>();
		this.name=leagName;
	}
	
	
	public boolean addTeam(Team team) {
		teams.add(team);
		return true;
	}
	public void removeTeam(Team team) {
		teams.remove(team);
	}
	public String toString() {
		return getName() ;
	}
	
	public String getName() {
		return name;
}
	public void setName(String leagName) {
		this.name = leagName;
	}
	
	public void print() {
		System.out.println(toString());
		for(int i = 0; i < teams.size(); i++) {
			Team currentTeam = teams.get(i);
			currentTeam.print();
		}
		System.out.println("");
	}
	public ListView<Team> printToView(ListView<Team> view) {
		view.getItems().addAll(teams);
		return view;
	}
	public Team getTeamForPrint(int index) {
		return teams.get(index);
	}


	public ArrayList<Team> getTeam() {
		return teams;
	}
	

}