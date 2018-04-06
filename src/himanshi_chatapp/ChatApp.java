package himanshi_chatapp;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChatApp extends Application{
	@Override
	public void start(Stage primaryStage)throws Exception{
		Group group=new Group();
		Scene scene=new Scene(group,600,300);
		scene.setFill(Color.WHITE);
		primaryStage.setTitle("Chat Application");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

}
