package codes.abdullah.cosl.ui.controller;

import codes.abdullah.cosl.MainCLI;
import codes.abdullah.parcel.Parcel;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.stage.Stage;

public abstract class Controller {

	public enum LoadType {
		LOAD_VIEW, LOAD_NEW_SCENE
	}

	@FXML
	protected Parent root;
	
	protected Parcel res;
	protected Stage stage;
	

	public abstract String getFxml();


	public Parent getRoot() {
		return root;
	}

	public Stage getStage() {
		return stage;
	}

	public void init() {

	}

	public Parcel getParcel() {
		return res;
	}

	public void info(String msg) {
		MainCLI.log.info(msg);
	}

	public void debug(String msg) {
		MainCLI.log.debug(msg);
	}

	public void warn(String msg) {
		MainCLI.log.warn(msg);
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setParcel(Parcel res) {
		this.res = res;
	}
	



}
