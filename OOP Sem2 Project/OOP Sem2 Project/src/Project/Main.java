package Project;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.scene.control.CheckBox;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Main extends Application implements Serializable { 
	   /**
	 * 
	 */
    
    private Controller controller = new Controller();
    private ArrayList<League> leagues = new ArrayList<League>();

    
	private static final long serialVersionUID = 230846983791489702L;
	@Override 
	   public void start(Stage stage) {            
	      
	      //labels for the tab Intro
	      Label welcomeLabel = new Label("My Soccer League Application\r\n");
	       
	      //Creating Design for League Tab
	      Text leagueName = new Text("What is the Name of your League: ");	
	      TextField leagueNameField = new TextField();
	      Button leagueAdd = new Button("Add"); 
	      Button leagueRemove = new Button("Remove");  
	      Button leagueListTab2 = new Button("List");
	      
	      
	      //Creating List Views for League Tab
	      ListView<League> listViewLeagueTab2 = new ListView();
	      ListView<Team> listViewTeamTab2 = new ListView();
	      //Creating List Views for Teams Tab
	      ListView<League> listViewLeagueTab3 = new ListView();
	      ListView<Team> listViewTeamTab3 = new ListView();
	      
	      
	      //Creating List Views for Player Tab
	      ListView<League> listViewLeagueTab4 = new ListView();
	      ListView<Team> listViewTeamTab4 = new ListView();
	      ListView<Player> listViewPlayerTab4 = new ListView();
	      
	      
	      //Creating Design for Teams Tab
	      Button leagueListTab3 = new Button("List");
	      Text leaguePick = new Text("Please Pick the League You want to add the team to.");
	      Text teamName = new Text("What is the Name of the Team");
	      TextField teamNameField = new TextField();
	      Text teamColour = new Text("What is the Colour of the Team");
	      TextField teamColourField = new TextField();
	      Button teamsAdd = new Button("Add");
	      Button teamsRemove = new Button("Remove");
	      Button teamsList = new Button("List");
	      
	      //Creating Design for Manager in Team Tab
	      Text fManagerName = new Text("What is the First Name of the Manager");
	      TextField fManagerNameField = new TextField();
	      Text mManagerName = new Text("What is the Middle Name of the Manager");
	      TextField mManagerNameField = new TextField();
	      Text sManagerName = new Text("What is the Last Name of the Manager");
	      TextField sManagerNameField = new TextField();
	      Text phoneNumber = new Text("What is the Phone Number");
	      TextField phoneNumberField = new TextField();
	      Text email = new Text("What is the email");
	      TextField emailField = new TextField();
	      Text dateOfBirth = new Text("What is the Date Of Birth");
	      DatePicker dob = new DatePicker();
	      Text starRating = new Text("What is the Star Rating for the Manager");
	      TextField starRatingField = new TextField();
	      Button managerAdd = new Button("Add");
	      Button managerRemove = new Button("Remove");
	      Button managerList = new Button("List");
	      
	      //Creating Design for Players Tab
	      Text leaguePickTab4 = new Text("Which League would you like to view");
	      TextField firstName = new TextField();
	      TextField secondName = new TextField();
	      TextField lastName = new TextField();
	      Text playerPhone = new Text("Enter the Player's Phone Number");
	      TextField phoneField = new TextField();
	      Text playerEmail = new Text("Enter the Player's Email");
	      TextField emailFieldtab4 = new TextField();
	      Text dateOfBirthtab4 = new Text("Enter the Player's DOB");
	      DatePicker dobtab4 = new DatePicker();
	      Text goalie = new Text("Is the Player a Goalie");
	      RadioButton goalieYes = new RadioButton("Yes, He is a Goalie");
	      RadioButton goalieNo = new RadioButton("No, He is a Goalie");
	      Text goals = new Text("Enter The Player's Goals");
	      TextField goalsNumber = new TextField();
	      Button teamPrint = new Button("List");
	      Button playerPrint = new Button("List");
	      Text playerName = new Text("Player's Name: (Enter First Name in first box, middle in second and last name in the third");
	      Button playerAdd = new Button("Add");
	      Button playerRemove = new Button("Remove");
	      Button playerList = new Button("List");
	      
	      ToggleGroup toggle = new ToggleGroup();
	      goalieYes.setToggleGroup(toggle);
	      goalieNo.setToggleGroup(toggle);
	      
	      //Creating Design for Database Tab
	      Button saveDatabase = new Button("Save");
	      
	      //creating the text-area
	      TextArea textarea = new TextArea();
	      
	      //Creating a Pane 
	      GridPane gridPane = new GridPane(); 
	      TabPane tabPane = new TabPane();	      
	      
	      //Setting size for the pane 
	       tabPane.setPrefSize(1600,1000);
	      
	      //Setting the padding  
	      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      tabPane.setPadding(new Insets(0, 0, 10, 0));
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);
	      
	      //Creating the tabs
	      Tab tab1 = new Tab("Intro", new Label("Welcome"));
	      Tab tab2 = new Tab("Add/Remove Leauge"  , new Label("Add/Remove League"));
	      Tab tab3 = new Tab("Add/Remove Team" , new Label("Add/Remove Team"));
	      Tab tab4 = new Tab("Add/Remove Player" , new Label("Add/Remove Player"));
	      Tab tab5 = new Tab("Database" , new Label("Access The Database"));
	      
	      //configuring the Intro tab	      
	      VBox tab1Box = new VBox();
	      	     
	      welcomeLabel.setFont(new Font("Calibri", 16));
	      tab1Box.getChildren().addAll(welcomeLabel);
	      tab1Box.setAlignment(Pos.CENTER);
	      
	      tab1.setContent(tab1Box);
	      
	      tabPane.getTabs().add(tab1);
	      tab1.setClosable(false);
	      
	      //configuring the Management tab
	      //VBox tab2Box = new VBox();
	      GridPane tab2GridPane = new GridPane();
	      tab2GridPane.setVgap(5); 
	      tab2GridPane.setHgap(5);
	      tab2GridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      tab2GridPane.setPrefSize(1600, 1000);
	      
	      //League Grid Pane
	      tab2GridPane.add(leagueName, 0,1);
	      tab2GridPane.add(leagueNameField, 0, 2);
	      tab2GridPane.add(leagueAdd, 0, 3);
	      tab2GridPane.add(listViewLeagueTab2, 0, 4);
	      tab2GridPane.add(leagueListTab2, 0, 6);
	      tab2GridPane.add(listViewTeamTab2, 0, 7);
	      
	      tab2.setContent(tab2GridPane);
	      
	      tabPane.getTabs().add(tab2);
	      tab2.setClosable(false);
	      
	      //configuring the Teams tab
	      GridPane tab3GridPane = new GridPane();
	      
	      tab3GridPane.setVgap(5); 
	      tab3GridPane.setHgap(5);
	      tab3GridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      tab3GridPane.setPrefSize(1600, 1000);
	      
	      //Teams Grid Pane
	      tab3GridPane.add(leaguePick, 0, 1);
	      tab3GridPane.add(listViewLeagueTab3, 0, 2);
	      tab3GridPane.add(leagueListTab3, 0, 3);
	      tab3GridPane.add(listViewTeamTab3, 0, 4);
	      tab3GridPane.add(teamName, 0, 5);
	      tab3GridPane.add(teamNameField, 0, 6);
	      tab3GridPane.add(teamColour, 0, 7);
	      tab3GridPane.add(teamColourField, 0, 8);
	      tab3GridPane.add(teamsAdd, 0, 9);
	      tab3GridPane.add(teamsRemove, 1, 9);
	      
	      tab3GridPane.add(fManagerName, 0, 11);
	      tab3GridPane.add(fManagerNameField, 0, 12);
	      tab3GridPane.add(mManagerName, 0, 13);
	      tab3GridPane.add(mManagerNameField, 0, 14);
	      tab3GridPane.add(sManagerName, 0, 15);
	      tab3GridPane.add(sManagerNameField, 0, 16);
	      tab3GridPane.add(phoneNumber, 0, 17);
	      tab3GridPane.add(phoneNumberField, 0, 18);
	      tab3GridPane.add(email, 0, 19);
	      tab3GridPane.add(emailField, 0, 20);
	      tab3GridPane.add(dateOfBirth, 0, 21);
	      tab3GridPane.add(dob, 0, 22);
	      tab3GridPane.add(starRating, 0, 23);
	      tab3GridPane.add(starRatingField, 0, 24);
	      tab3GridPane.add(managerAdd, 0, 25);
	      tab3GridPane.add(managerRemove, 1, 25);
	      
	      tab3.setContent(tab3GridPane);
	      
	      tabPane.getTabs().add(tab3);
	      tab3.setClosable(false);
	     
	      //Styling nodes     
	      gridPane.setStyle("-fx-background-color: WHITE;"); 
	       
	      //Creating a scene object       
	      HBox hBox = new HBox(tabPane);
	      Scene scene = new Scene(hBox);	      
	      
	      //configuring the Management tab
	      GridPane tab4GridPane = new GridPane();
	      tab4GridPane.setVgap(5); 
	      tab4GridPane.setHgap(5);
	      tab4GridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      tab4GridPane.setPrefSize(1600, 1000);
	      
	      //League Grid Pane
	      tab4GridPane.add(leaguePickTab4, 0,1);
	      tab4GridPane.add(listViewLeagueTab4, 0, 2);
	      tab4GridPane.add(teamPrint, 0, 3);
	      tab4GridPane.add(listViewTeamTab4, 0, 4);
	      tab4GridPane.add(playerPrint, 0, 5);
	      tab4GridPane.add(listViewPlayerTab4, 0, 6);
	      tab4GridPane.add(playerName, 0, 7);
	      tab4GridPane.add(firstName, 0, 8);
	      tab4GridPane.add(secondName, 0, 9);
	      tab4GridPane.add(lastName, 0, 10);
	      tab4GridPane.add(playerPhone, 0, 11);
	      tab4GridPane.add(phoneField, 0, 12);
	      tab4GridPane.add(playerEmail, 0, 13);
	      tab4GridPane.add(emailFieldtab4, 0, 14);
	      tab4GridPane.add(dateOfBirthtab4, 0, 15);
	      tab4GridPane.add(dobtab4, 0, 16);
	      tab4GridPane.add(goalie, 0, 17);
	      tab4GridPane.add(goalieYes, 0, 18);
	      tab4GridPane.add(goalieNo, 0, 19);
	      tab4GridPane.add(goals, 0, 20);
	      tab4GridPane.add(goalsNumber, 0, 21);
	      tab4GridPane.add(playerAdd, 0, 22);
	      tab4GridPane.add(playerRemove, 1, 22);
	      
	      tab4.setContent(tab4GridPane);
	      
	      tabPane.getTabs().add(tab4);
	      tab4.setClosable(false);
	      
	      //configuring the Database Tab
	      GridPane tab5GridPane = new GridPane();
	      
	      tab5GridPane.setVgap(5); 
	      tab5GridPane.setHgap(5);
	      tab5GridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      tab5GridPane.setPrefSize(1600, 1000);
	      
	      //Database Grid Pane
	      tab5GridPane.add(saveDatabase, 0, 1);
	      
	      tab5.setContent(tab5GridPane);
	      
	      tabPane.getTabs().add(tab5);
	      tab5.setClosable(false);
	    // Setting an action for the Submit button
	     leagueAdd.setOnAction(new EventHandler<ActionEvent>() {
	     @Override
	       	public void handle(ActionEvent e) {
	        controller.addLeague(leagues, leagueNameField, listViewLeagueTab2, listViewLeagueTab3, listViewLeagueTab4);
	       }
	     });
	      //list Team for League Page
	      leagueListTab2.setOnAction(new EventHandler<ActionEvent>() {
	    	  public void handle(ActionEvent e)	{
	    		  controller.listdata(leagues, listViewLeagueTab2, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);
	    	  }
	      });
	      //List Team for Team Page
	      leagueListTab3.setOnAction(new EventHandler<ActionEvent>() {   	  
	    	  public void handle(ActionEvent e)	{
	    		  controller.listdataTeamTab3(leagues, listViewLeagueTab3, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);	  
	    	  }
	     });
	      //Add Team name and colour
	      teamsAdd.setOnAction(new EventHandler<ActionEvent>() {
	    	  public void handle(ActionEvent e)	{
	    		  controller.addTeam(leagues, teamNameField, teamColourField, listViewLeagueTab3, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);
	    	  }
	      });
	      teamsRemove.setOnAction(new EventHandler<ActionEvent>() {
	    	  public void handle(ActionEvent e)	{
	    		  controller.removeTeam(leagues, teamNameField, teamColourField, listViewLeagueTab3, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);
	    	  }
	      });
	      //Add Manager to Team
	      managerAdd.setOnAction(new EventHandler<ActionEvent>() {
	    	  public void handle(ActionEvent e)	{
				controller.managerAdd(leagues, fManagerNameField, mManagerNameField, sManagerNameField,  phoneNumberField, emailField, dob, starRatingField, listViewLeagueTab3, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);
	    	  }
	      });
	      //managerRemove.setOnAction(new EventHandler<ActionEvent>() {
	    //	  public void handle(ActionEvent e)	{
			//	controller.managerRemove(leagues, fManagerNameField, mManagerNameField, sManagerNameField,  phoneNumberField, emailField, dob, starRatingField, listViewLeagueTab3, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);
	    	//  }
	   //   });
	    //  dateOrderButton.setOnAction(new EventHandler<ActionEvent>() {
	    //	  public void handle(ActionEvent e)	{	    		  
	    //		 //Activity.sort(Comparator.comparing(Activity::getDate));	    		  
	    //	  }
	    //  });
	      //List Team for Player Page
	      teamPrint.setOnAction(new EventHandler<ActionEvent>() {   	  
	    	  public void handle(ActionEvent e)	{
	    		  controller.listdataTeamTab4(leagues, listViewLeagueTab4, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);	  
	    	  }
	     });
	      //List Players for Player Page
	      playerPrint.setOnAction(new EventHandler<ActionEvent>() {   	  
	    	  public void handle(ActionEvent e)	{
	    		  controller.listdataPlayerTab4(leagues, listViewPlayerTab4, listViewLeagueTab4, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4);	  
	    	  }
	     });
	      //Add Players to Player list
	      playerAdd.setOnAction(new EventHandler<ActionEvent>() {   	  
	    	  public void handle(ActionEvent e)	{
	    		  controller.addPlayerTab4(leagues, listViewPlayerTab4, listViewLeagueTab4, goalsNumber, listViewTeamTab2, listViewTeamTab3, listViewTeamTab4, firstName, secondName, lastName, phoneField, emailFieldtab4, dobtab4, goalieYes, goalieNo);	  
	    	  }
	     });
	      //Save Data to Database
	      saveDatabase.setOnAction(new EventHandler<ActionEvent>() {  
	    	  public void handle(ActionEvent e) {
	    		  controller.saveTab5(leagues);
	    	  }
	      });
	      
	    //Creating the Test Data
	    League league1 = new League("league2");
	  	
	  	
	    Team team1 = new Team("Stoke", "Red");
        Team team2 = new Team("Everton", "Blue");
	  	
	  	
	  	Name name1 = new Name("James", "Patrick", "Franloe");
	  	Name name2 = new Name("Mike", "John", "Lenord");
	  	Manager manager1 = new Manager(name1, "0872941956", "james@gmail.com", "30/10/1950", 9);
	 	Manager manager2 = new Manager(name2, "0858729271", "mike@gmail.com", "12/07/1972", 6);

	  	
	 	Name name3 = new Name("Frank", "Patrick", "Jones");
	  	Name name4 = new Name("Ben", "James", "O'Neill");
	  	Name name5 = new Name("Mark", "Matthew", "Smith");
	  	Name name6 = new Name("Aaron", "Anthony", "Barrett");
	  	Player player1 = new Player(name3, "0878529122", "Frank@gmail.com", true, 2);
	  	Player player2 = new Player(name4, "0862516293", "Ben@gmail.com", false, 5);
	  	Player player3 = new Player(name5, "0218452915", "Mark@gmail.com", false, 12);
	  	Player player4 = new Player(name6, "0892831512", "Aaron@gmail.com", true, 8);


	  	team1.addPlayer(player1);
        team1.addPlayer(player2);
        team2.addPlayer(player3);
        team2.addPlayer(player4);
        team1.addManager(manager1);
        team2.addManager(manager2);

	  	leagues.add(league1);
        
        league1.addTeam(team1);
        league1.addTeam(team2);
	  	
        for (int i=0;i<leagues.size();i++) {
        	listViewLeagueTab2.getItems().add(leagues.get(i));
        	listViewLeagueTab3.getItems().add(leagues.get(i));
        	listViewLeagueTab4.getItems().add(leagues.get(i));
        }
	      
	      //Setting title to the Stage 
	      stage.setTitle("My Soccer League Application"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);
	      
	      
	      //Displaying the contents of the stage 
	      stage.show(); 
	   }      
	   public static void main(String args[]){ 
	      launch(args); 
	   } 
	}
