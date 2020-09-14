package Project;
public class Player extends Person {
	
	private int goals;
	private boolean goalie;
	
	public Player(Name name, String phone, String email, boolean goalie, int goals) {
		super(name, phone, email);
		this.goalie = goalie;
		this.goals = goals;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public void goalie(boolean goalie) {
		this.goalie = goalie;
	}
	
	public boolean goalie() {
		return goalie;
	}
	
	public String toString() {
		return getName() + ", " + getPhone() + ", " + getEmail() + ", " + goalie + ", " + goals;
	}
	
	public void print() {
		System.out.println(toString());
	}

}
