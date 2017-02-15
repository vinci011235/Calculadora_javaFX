package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Ui.fxml"));
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Calculator");
		primaryStage.getIcons().add(new Image("http://www.clker.com/cliparts/b/f/6/6/1369869528901488487calculator-24-hi.png"));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
