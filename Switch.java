import javafx.application.Application;

import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.scene.control.ChoiceDialog;

import javafx.scene.control.Alert;

import javafx.scene.control.Alert.AlertType;

import java.util.Optional;



public class Switch extends Application {



    @Override

    public void start(Stage primaryStage) {
	

       ArrayList<String> choices = new ArrayList<String>();

        choices.add("Administrator");

        choices.add("Faculty");

        choices.add("Staff");

        choices.add("Student");

        choices.add("Guest");



        String defaultOption = choices.get(4);

		@SuppressWarnings("unchecked")

        ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choices);

        choiceDialog.setTitle("Role");

        choiceDialog.setHeaderText("Pleas select your role");

	        @SuppressWarnings("Unchecked")

        Optional<String> result = choiceDialog.showAndWait();



        String selected = result.get();



        Alert alert = new Alert(AlertType.INFORMATION);

        alert.setTitle("Greeting");

        alert.setHeaderText("Welcome!");



        switch (selected) {

            case "Administrator":

                alert.setContentText("Welcome Administrator!");

                break;

            case "Faculty":

                alert.setContentText("Welcome Faculty!");

                break;

            case "Staff":

                alert.setContentText("Welcome Staff!");

                break;

            case "Student":

                alert.setContentText("Welcome Student!");

                break;

            case "Guest":

                alert.setContentText("Welcome Guest!");

                break;

            default:

                alert.setContentText("Invalid choices");

        }



        alert.show();



        }
		public static void main(String[] args) {
		launch();
}

	

    }
