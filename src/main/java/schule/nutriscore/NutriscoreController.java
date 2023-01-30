package schule.nutriscore;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class NutriscoreController {
    public TextField txtEnergie;
    public TextField txtZucker;
    public TextField txtFette;
    public TextField txtSalzNat;
    public TextField txtEiweis;
    public TextField txtBallast;
    public TextField txtGemuese;
    public ComboBox cbSalzNat;
    public ImageView ivScore;
    public TextField txtEAN;
    public ComboBox cbType;
    public Button btnCalcScore;
    public Button btnSave;

    public void calculateScore(ActionEvent event) {
    }

    public void selectType(ActionEvent event) {
    }
}
