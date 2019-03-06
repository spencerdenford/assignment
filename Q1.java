// James Gillies 100655284 & Spencer Denford 100654362

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

public class Q1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=54; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);

        ImageView view1 = new ImageView(
                new Image( "file:///C:/Users/JAGma/Desktop/Software Systems Development and Integration/Assignment/Assignment/Cards/"+ list.get(0) + ".png"));
        ImageView view2 = new ImageView(
                new Image("file:///C:/Users/JAGma/Desktop/Software Systems Development and Integration/Assignment/Assignment/Cards/" + list.get(1) + ".png"));
        ImageView view3 = new ImageView(
                new Image("file:///C:/Users/JAGma/Desktop/Software Systems Development and Integration/Assignment/Assignment/Cards/" + list.get(2) + ".png"));
        HBox root = new HBox();

        root.getChildren().add(view1);
        root.getChildren().add(view2);
        root.getChildren().add(view3);

        Scene scene = new Scene(root);

        primaryStage.setTitle("Question1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}