package codes.abdullah.cosl;

import codes.abdullah.cosl.ui.controller.Controller;
import codes.abdullah.cosl.ui.controller.Controller.LoadType;
import codes.abdullah.cosl.ui.controller.Home;
import codes.abdullah.cosl.ui.utils.FX;
import codes.abdullah.parcel.Parcel;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainFX extends Application {
	Controller m = new Controller() {
		@Override
		public String getFxml() {
			throw new UnsupportedOperationException();
		}
	};

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		m.setStage(stage);
		m.setParcel(Parcel.of("strings/strings"));
		FX.load(Home.class, m, LoadType.LOAD_NEW_SCENE);
		stage.show();
	}

}
