package schule.nutriscore;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
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

    public String type;
    public int energie;
    public double zucker;
    public double gesaettigte_fette;
    public double salz;
    public double natrium;
    public double eiweis;
    public double ballast;
    public double gemuese;
    public Button btnDiagram;


    public void calculateScore() {
        getValues();
        if(type == "Allgemein"){
            Allgemein nahrung = new Allgemein(energie,zucker,gesaettigte_fette,salz,natrium,eiweis,ballast,gemuese);
            nahrung.calculateNutriscore();
        } else if (type == "Getraenk"){
            Getraenk nahrung = new Getraenk(energie,zucker,gesaettigte_fette,salz,natrium,eiweis,ballast,gemuese);
            nahrung.calculateNutriscore();
        }else if (type == "Kaese"){
            Kaese nahrung = new Kaese(energie,zucker,gesaettigte_fette,salz,natrium,eiweis,ballast,gemuese);
            nahrung.calculateNutriscore();
        }else if (type == "Zugesetzte Fette"){
            Fett nahrung = new Fett(energie,zucker,gesaettigte_fette,salz,natrium,eiweis,ballast,gemuese);
            nahrung.calculateNutriscore();
        }else if (type == "Wasser"){
            ivScore.setImage(NutriscoreApplication.getImg(0));
        }


    }

    public void getValues(){
        energie = Integer.parseInt(txtEnergie.getText());
        zucker = Double.parseDouble(txtZucker.getText());
        gesaettigte_fette = Double.parseDouble(txtFette.getText());
        if(cbSalzNat.getValue() == "Natrium"){
            natrium = Double.parseDouble(txtSalzNat.getText());
            salz = 0;
        } else if(cbSalzNat.getValue() == "Salz"){
            salz = Double.parseDouble(txtSalzNat.getText());
            natrium = 0;
        }
        eiweis = Double.parseDouble(txtEiweis.getText());
        ballast = Double.parseDouble(txtBallast.getText());
        gemuese = Double.parseDouble(txtGemuese.getText());
    }

    public void searchByEan(){
        disableInput();
    }

    public void selectType() {
        type =  (String) cbType.getValue();
        if (type == "Wasser"){
            disableInput();
        } else {
            enableInput();
        }
    }

    public void disableInput(){
        txtBallast.setDisable(true);
        txtEiweis.setDisable(true);
        txtEnergie.setDisable(true);
        txtFette.setDisable(true);
        txtGemuese.setDisable(true);
        txtSalzNat.setDisable(true);
        txtZucker.setDisable(true);
    }
    public void enableInput(){
        txtBallast.setDisable(false);
        txtEiweis.setDisable(false);
        txtEnergie.setDisable(false);
        txtFette.setDisable(false);
        txtGemuese.setDisable(false);
        txtSalzNat.setDisable(false);
        txtZucker.setDisable(false);
    }
}
