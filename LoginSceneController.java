import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.net.URL;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginSceneController {
    public static Scene Create() throws Exception {
        URL sceneUrl = LoginSceneController.class
                .getResource("login.fxml");
        Parent root = FXMLLoader.load(sceneUrl);
        Scene scene = new Scene(root);
        return scene;
    }

    @FXML
    protected Button btLogin;

    @FXML
    protected TextField tfLogin;

    @FXML
    protected PasswordField pfPass;

    @FXML
    protected CheckBox cbPass;

    @FXML
    protected void tryLogin(ActionEvent e) {
        if (!tfLogin.getText().equals("don")) {
            Alert alert = new Alert(
                    AlertType.ERROR,
                    "Voce nao eh o don!",
                    ButtonType.OK);
            alert.showAndWait();
            return;
        }
        if (!pfPass.getText().equals("verstapi")) {
            Alert alert = new Alert(
                    AlertType.ERROR,
                    "VoCe nao sabe a senha do don seu feio",
                    ButtonType.OK);
            alert.showAndWait();
            return;
        }

        Stage crrStage = (Stage) btLogin
                .getScene().getWindow();
        crrStage.close();

        try {
            Stage stage = new Stage();
            Scene scene = MainSceneController.Create();
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            Alert alert = new Alert(
                AlertType.ERROR,
                "Erro ao carregar a página consulte a TI",
                ButtonType.OK);
        }

    }

}
