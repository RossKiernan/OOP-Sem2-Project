package Project;

import java.io.FileInputStream;
import java.sql.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	
public void addLeague(ArrayList<League> leagues, TextField leagueNameField, ListView<League> listViewLeagueTab2,
		ListView<League> listViewLeagueTab3, ListView<League> listViewLeagueTab4) {
	// TODO Auto-generated method stub
	String itemToAdd = leagueNameField.getText();
	League newleague = new League(itemToAdd);
	leagues.add(newleague);
	
	listViewLeagueTab2.getItems().clear();
	listViewLeagueTab3.getItems().clear();
	listViewLeagueTab4.getItems().clear();
	
	listViewLeagueTab2.getItems().addAll(leagues);
	listViewLeagueTab3.getItems().addAll(leagues);
	listViewLeagueTab4.getItems().addAll(leagues);
	
}

public void listdata(ArrayList<League> leagues, ListView<League> listViewLeagueTab2, ListView<Team> listViewTeamTab2,
		ListView<Team> listViewTeamTab3, ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	listViewTeamTab2.getItems().clear();
	int itemToPrint = listViewLeagueTab2.getSelectionModel().getSelectedIndex();
	League leaguePrint = leagues.get(itemToPrint);
	leaguePrint.printToView(listViewTeamTab2);
}

public void listdataTeamTab3(ArrayList<League> leagues, ListView<League> listViewLeagueTab3,
		ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3, ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	listViewTeamTab3.getItems().clear();
	int itemToPrint = listViewLeagueTab3.getSelectionModel().getSelectedIndex();
	League leaguePrint = leagues.get(itemToPrint);
	leaguePrint.printToView(listViewTeamTab3);
}

public void addTeam(ArrayList<League> leagues, TextField teamNameField, TextField teamColourField,
		ListView<League> listViewLeagueTab3, ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3,
		ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	listViewTeamTab3.getItems().clear();
	int itemToPrint = listViewLeagueTab3.getSelectionModel().getSelectedIndex();
	Team newteam = new Team(teamNameField.getText(), teamColourField.getText());
	League leaguePrint = leagues.get(itemToPrint);
	leaguePrint.addTeam(newteam);
	
	leaguePrint.printToView(listViewTeamTab3);

}

public void removeTeam(ArrayList<League> leagues, TextField teamNameField, TextField teamColourField,
		ListView<League> listViewLeagueTab3, ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3,
		ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	int itemToRemove = listViewLeagueTab3.getSelectionModel().getSelectedIndex();
	League leagueRemove = leagues.get(itemToRemove);
	int teamToDelete = listViewTeamTab3.getSelectionModel().getSelectedIndex();
	
	Team teamToDeleteTeam = leagueRemove.getTeamForPrint(teamToDelete);
	leagues.get(itemToRemove).removeTeam(teamToDeleteTeam);
	listViewTeamTab3.getItems().clear();
	
	leagueRemove.printToView(listViewTeamTab3);
	
}

public void managerAdd(ArrayList<League> leagues, TextField fManagerNameField, TextField mManagerNameField, TextField sManagerNameField, TextField phoneNumberField,
		TextField emailField, DatePicker dob, TextField starRatingField, ListView<League> listViewLeagueTab3,
		ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3, ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	String starRating = starRatingField.getText();
	int rating = Integer.parseInt(starRating);
	LocalDate date = dob.getValue(); 
	String dateString = date.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
	Name name = new Name(fManagerNameField.getText(), mManagerNameField.getText(), sManagerNameField.getText());
	Manager newmanager = new Manager(name, phoneNumberField.getText(), emailField.getText(), dateString, rating);
	
	int itemToPick = listViewLeagueTab3.getSelectionModel().getSelectedIndex();
	League leaguePick = leagues.get(itemToPick);
	int teamToPick = listViewTeamTab3.getSelectionModel().getSelectedIndex();
	
	Team teamToPickTeam = leaguePick.getTeamForPrint(teamToPick);
	teamToPickTeam.addManager(newmanager);
	listViewTeamTab3.getItems().clear();
	
	leaguePick.printToView(listViewTeamTab3);
}

public void listdataTeamTab4(ArrayList<League> leagues, ListView<League> listViewLeagueTab4,
		ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3, ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	listViewTeamTab4.getItems().clear();
	int itemToPrint = listViewLeagueTab4.getSelectionModel().getSelectedIndex();
	League leaguePrint = leagues.get(itemToPrint);
	leaguePrint.printToView(listViewTeamTab4);
}

public void listdataPlayerTab4(ArrayList<League> leagues, ListView<Player> listViewPlayerTab4, ListView<League> listViewLeagueTab4,
		ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3, ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
	listViewPlayerTab4.getItems().clear();
	int itemToPrint = listViewLeagueTab4.getSelectionModel().getSelectedIndex();
	League leaguePrint = leagues.get(itemToPrint);
	int teamToPrint = listViewTeamTab4.getSelectionModel().getSelectedIndex();
	
	Team teamToPrintTeam = leaguePrint.getTeamForPrint(teamToPrint);
	teamToPrintTeam.printToView(listViewPlayerTab4);
	
	
}

public void addPlayerTab4(ArrayList<League> leagues, ListView<Player> listViewPlayerTab4,
		ListView<League> listViewLeagueTab4, TextField goalsNumber, ListView<Team> listViewTeamTab2, ListView<Team> listViewTeamTab3,
		ListView<Team> listViewTeamTab4, TextField firstName, TextField secondName, TextField lastName,
		TextField phoneField, TextField emailFieldtab4, DatePicker dobtab4, RadioButton goalieYes, RadioButton goalieNo) {
	// TODO Auto-generated method stub
	
    //creating the new person object
	Boolean isGoalie=false;
    //creating the name first
    Name newName = new Name(firstName.getText(),secondName.getText(), lastName.getText());

    //checking if player is a goalie
    if (goalieYes.isSelected()) {
        isGoalie=true;
    }
    else if (goalieNo.isSelected()) {
        isGoalie=false;
    }
    
    String goal = goalsNumber.getText();
    int goals = Integer.parseInt(goal);
    //new player object made
    Player newplayer = new Player(newName, phoneField.getText(), emailFieldtab4.getText(), isGoalie, goals);
    //adding the new player to the selected team

    //clearing the view first
    listViewPlayerTab4.getItems().clear();
    int leagueTobeAddedTo = listViewLeagueTab4.getSelectionModel().getSelectedIndex();
    League leagueToBePrinted = leagues.get(leagueTobeAddedTo);
    leagueToBePrinted.printToView(listViewTeamTab4);

    //something wrong with these 2 lines
    int teamToBePrinted = listViewTeamTab4.getSelectionModel().getSelectedIndex();
    //teamToBePrinted=teamToBePrinted-1;


    Team teamToBePrintedTeam = leagueToBePrinted.getTeamForPrint(teamToBePrinted);

    //teamToBePrintedTeam.printToView(playerListView);

    teamToBePrintedTeam.addPlayer(newplayer);

    listViewPlayerTab4.getItems().clear();
    teamToBePrintedTeam.printToView(listViewPlayerTab4);
	
}

public void saveTab5(ArrayList<League> leagues) {
	
	try {
		// 1. Get a connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/league", "root", "mypass");
		// 2. Create a Statement
		Statement myStatement = myConn.createStatement();
		// 3. Execute SQL query
		for(int i=0; i<leagues.size();i++) {
			
			League databaseLeague = leagues.get(i);
			String dbName = databaseLeague.getName();
			
			String sql = "Insert into league "
					+ "(leagueName) "
					+"values( "+ "'"+dbName+"')";
			
			myStatement.executeUpdate(sql);
		}
		
		League league1 = leagues.get(0);
		
		for(int i=0;i<league1.getTeam().size();i++) {
			
			Team dbTeam = league1.getTeamForPrint(i);
			
			String teamName = dbTeam.getName();
			String teamColour = dbTeam.getColour();
			
			String managerName = dbTeam.getManagerName();
			String managerEmail = dbTeam.getManagerEmail();
			String managerDOB = dbTeam.getManagerDOB();
			String managerPhone = dbTeam.getManagerPhone();
			int managerRating = dbTeam.getManagerRating();
			
			String sql = "Insert into team "
					+ "(teamName, teamColour, managerName, phone, email, dob, starRating) "
					+"values( "+ "'"+teamName+"',"+
								 "'"+teamColour+"',"+
								 "'"+managerName+"',"+
								 "'"+managerPhone+"',"+
								 "'"+managerEmail+"',"+
								 "'"+managerDOB+"',"+
								 "'"+managerRating+"')";
			
			myStatement.executeUpdate(sql);
		}
		
		ArrayList<Player> sqlPlayers = new ArrayList<Player>();
		
		for (int i = 0; i < league1.getTeam().size(); i++) {
			Team dbTeam = league1.getTeamForPrint(i);
			sqlPlayers.addAll(dbTeam.getPlayers());
		}
		
		for (int i = 0; i < sqlPlayers.size(); i++) {
			
			Player sqlPlayer = sqlPlayers.get(i);
			String goalie = "";
			
			String playerName = sqlPlayer.getName().toString();
			String playerPhone = sqlPlayer.getPhone();
			String playerEmail = sqlPlayer.getEmail();
			Boolean playerGoalie = sqlPlayer.goalie();
			
			if (playerGoalie = true) {
				goalie = "Yes";
			}
			else {
				goalie = "No";
			}
			
			int playerGoals = sqlPlayer.getGoals();
			
			String sql = "insert into player "
					+ "(playerName, phoneNumber, email, dob, goalie, goals) "
					+"values( "+ "'"+playerName+"',"+
								 "'"+playerPhone+"',"+
								 "'"+playerEmail+"',"+
								 "'"+goalie+"',"+
								 "'"+playerGoals+"')";
			
			myStatement.executeUpdate(sql);
					
		}
		
		
		System.out.println("SQL Query Done");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
			}
	}


//public void managerRemove(ArrayList<League> leagues, TextField fManagerNameField, TextField mManagerNameField,
	//	TextField sManagerNameField, TextField phoneNumberField, TextField emailField, DatePicker dob,
	//	TextField starRatingField, ListView<League> listViewLeagueTab3, ListView<Team> listViewTeamTab2,
	//	ListView<Team> listViewTeamTab3, ListView<Team> listViewTeamTab4) {
	// TODO Auto-generated method stub
  //	int itemToRemove = listViewLeagueTab3.getSelectionModel().getSelectedIndex();
//	League leagueRemove = leagues.get(itemToRemove);
//	int managerToDelete = listViewTeamTab3.getSelectionModel().getSelectedIndex();
	
//	Team managerToDeleteTeam = leagueRemove.getTeamForPrint(managerToDelete);
//	leagues.get(itemToRemove).removeManager(managerToDeleteTeam);
//	listViewTeamTab3.getItems().clear();
	
//	leagueRemove.printToView(listViewTeamTab3);
//}





