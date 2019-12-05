import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		 ReadWrite readWrite = new ReadWrite();
	        ArrayList<String> used = readWrite.returning();
	        
	        VBox vbox = new VBox(10);
	        
	        Slider slider = new Slider(1,4,1);
	        slider.setBlockIncrement(1);
	        slider.setMajorTickUnit(1);
	        slider.setMinorTickCount(0);
	        slider.setShowTickLabels(true);
	        slider.setShowTickMarks(true);
	        slider.setSnapToTicks(true);
	        slider.setPrefWidth(100);
	        slider.setMaxWidth(100);

	        Label sliderLabel = new Label("Enter Hamming Dist " + (int)slider.getValue());
	        
	        slider.valueProperty().addListener(new ChangeListener<Number>(){

	            @Override
	            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
	                sliderLabel.setText("Enter Hamming Dist " + (int)slider.getValue());
	                // TODO Auto-generated method stub
	                
	            }
	            });

	        final ObservableList<String> options = FXCollections.observableArrayList(used);
	        ComboBox comboBox = new ComboBox();
	        comboBox.setItems(options);
	        Button displayButton = new Button("Show Stations");

	        displayButton.setOnAction(new EventHandler<ActionEvent>() {

	            @Override
	            public void handle(ActionEvent event) {
	                String chosen = comboBox.getValue().toString();
	                int dist = (int)slider.getValue();
	                ArrayList<String> toGet = new ArrayList<String>();
	                String finale = null;
	                try {
	                    toGet = hammDist1(chosen, dist);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            //    for(int i = 0; i < toGet.size(); ++i) {
	            //        finale = toGet.get(i) + "\n";
	            //    }
	                finale = toGet.toString();
	                Label stations = new Label(finale);
	                stations.setText(finale);
	                vbox.getChildren().addAll(stations);
	                
	                // TODO Auto-generated method stub
	                
	            }
	            
	        });
	        
	        Button button = new Button("Calculate HD");
	        button.setOnAction(new EventHandler<ActionEvent>(){

	            @Override
	            public void handle(ActionEvent event) {
	                String chosen = comboBox.getValue().toString();
	                int[] useful = new int[5];
	                try {
	                    useful = hammDist0(chosen);
	                } catch (IOException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	                Label dist0 = new Label("Distance 0 " + useful[0]);
	                dist0.setText("Distance 0 " + useful[0]);
	                Label dist1 = new Label("Distance 1 " + useful[1]);
	                dist1.setText("Distance 1 " + useful[1]);
	                Label dist2 = new Label("Distance 2 " + useful[2]);
	                dist2.setText("Distance 2 " + useful[2]);
	                Label dist3 = new Label("Distance 3 " + useful[3]);
	                dist3.setText("Distance 3 " + useful[3]);
	                Label dist4 = new Label("Distance 4 " + useful[4]);
	                dist4.setText("Distance 4 " + useful[4]);
	                vbox.getChildren().addAll(dist0, dist1, dist2, dist3, dist4);
	                // TODO Auto-generated method stub
	                
	            }
	            
	        });

		// TODO Auto-generated method stub
		
	}
	
}
