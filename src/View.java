import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		primaryStage.setTitle("Yet Another Stat Tracker");
		primaryStage.setScene(new Scene(root, 300, 275));
		primaryStage.show();
	}	
}
