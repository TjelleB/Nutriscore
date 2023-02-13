package schule.nutriscore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class NutriscoreApplication extends Application {
    private static Image scoreA = new Image("src/main/resources/schule/nutriscore/Img Nutriscore/2560px-Nutri-score-A.svg.png");
    private static Image scoreB = new Image("src/main/resources/schule/nutriscore/Img Nutriscore/2560px-Nutri-score-B.svg.png");
    private static Image scoreC = new Image("src/main/resources/schule/nutriscore/Img Nutriscore/2560px-Nutri-score-C.svg.png");
    private static Image scoreD = new Image("src/main/resources/schule/nutriscore/Img Nutriscore/2560px-Nutri-score-D.svg.png");
    private static Image scoreE = new Image("src/main/resources/schule/nutriscore/Img Nutriscore/2560px-Nutri-score-E.svg.png");

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NutriscoreApplication.class.getResource("Nutriscore.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Nutriscore");
        stage.setScene(scene);
        stage.show();
    }
    public static Image getImg(int i){
        switch(i){
            case 0 -> {return scoreA;}
            case 1 -> {return scoreB;}
            case 2 -> {return scoreC;}
            case 3 -> {return scoreD;}
            case 4 -> {return scoreE;}
            default -> {return scoreA;}
        }
    }

    public static void main(String[] args) {
        launch();
    }
}