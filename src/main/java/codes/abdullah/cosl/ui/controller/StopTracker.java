package codes.abdullah.cosl.ui.controller;

import codes.abdullah.cosl.r.R;
import codes.abdullah.cosl.ui.module.Category;
import codes.abdullah.cosl.ui.module.Location;
import codes.abdullah.cosl.ui.module.pob.Position;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class StopTracker extends Controller {
	@FXML
	private VBox root;
	@FXML
	private DatePicker dpDate;
	@FXML
	private TextField tNumber;
	@FXML
	private TextField lblName;
	@FXML
	private ComboBox<Position> cbPosition;
	
	@FXML
	private ComboBox<Location> cbLocation;
	@FXML
	private ComboBox<Category> cbCategory;
	@FXML
	private TextArea tfCase;
	@FXML
	private Button bSave;
	
	@Override
	public void init() {
		super.init();
		
	}
	
	
	@Override
	public String getFxml() {
		return R.resources.fxml.STOP_TRACKER;
	}

}
