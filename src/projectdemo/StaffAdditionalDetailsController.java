package projectdemo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class StaffAdditionalDetailsController {
    
    @FXML
    private TextArea detailstextarea;
    @FXML
    private Button backButton;

    public void initialize() {
        detailstextarea.setText("1. \"Cater the Food\" - On May 1st, 2023 at 9:00 AM in Room 302. You are responsible for catering the company's annual meeting in the third-floor conference room. The menu includes a variety of appetizers, entrees, and desserts, along with vegetarian and gluten-free options. Please make sure to arrive on time, set up the food, and ensure that everything is presented neatly and attractively.\n" +
"\n" +
"2. \"Vacuum the floor\" - On May 2nd, 2023 at 2:30 PM in 5th Floor NAC Building. You are responsible for vacuuming the fifth floor of the North Atlantic Building. Please make sure to move any chairs or other objects out of the way before vacuuming, and to be careful around any sensitive equipment. Also, please ensure that you cover all areas of the floor and that it is left clean and tidy.\n" +
"\n" +
"3. \"Clean both the Toilet\" - On May 3rd, 2023 at 10:00 AM on 4th Floor. You are responsible for cleaning the toilets located on the fourth floor of the building. Please make sure to thoroughly clean the stalls, toilets, and sinks, and to restock any necessary supplies such as toilet paper, soap, and paper towels. Also, please make sure that the area is left clean and tidy for the next users.\n" +
"\n" +
"I hope this helps you complete your tasks efficiently and effectively. If you have any questions or concerns, please don't hesitate to ask.");
    
    detailstextarea.setWrapText(true);
    }
    @FXML
private void loadstaffupcomingschedule(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("StaffUpcomingSchedule.fxml"));
Scene scene = new Scene(root);
Stage stage = (Stage) backButton.getScene().getWindow();
stage.setScene(scene);
stage.show();
}
}
