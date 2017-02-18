package skynamiccontrol.view.forms;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Elodie on 17/02/2017.
 */
public class FormCircleController implements Initializable{

    @FXML
    private AnchorPane form_pane;

    @FXML
    private TextField field_name;

    @FXML
    private TextField field_north;

    @FXML
    private TextField field_east;

    @FXML
    private TextField field_radius;

    @FXML
    private ChoiceBox box_orientation;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Font.loadFont(getClass().getResourceAsStream("resources/font/OpenSans-Regular.ttf"), 14);
        form_pane.setStyle("-fx-font-family: OpenSans-Regular;");
    }

    @FXML
    public void onMouseEnteredOK(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMouseExitedOK(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMousePressOK(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMoueReleasedOK(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMouseEnteredNext(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMouseExitedNext(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMousePressedNext(MouseEvent mouseEvent) {
    }

    @FXML
    public void onMouseReleasedNext(MouseEvent mouseEvent) {
    }
}