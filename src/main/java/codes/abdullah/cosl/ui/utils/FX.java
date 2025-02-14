package codes.abdullah.cosl.ui.utils;

import codes.abdullah.cosl.ui.controller.Controller;
import codes.abdullah.cosl.ui.controller.Controller.LoadType;
import codes.abdullah.parcel.Parcel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FX {

	public static final int LOAD_ONLY = 0;
	public static final int LOAD_AND_INJECT = 1;

//	public static final Parcel res = Parcel.of("strings/strings");

	public static <T extends Controller> T load(Class<T> cls, Parcel res, Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(FX.class.getResource(getFxml(cls)));
			Parent root = loader.load();
			T t = loader.getController();
			t.setParcel(res);
			stage.setScene(new Scene(root));
			t.setStage(stage);
			t.init();
			return t;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <T extends Controller> T load(Class<T> cls, Controller parent, LoadType lt) {
		try {
			FXMLLoader loader = new FXMLLoader(FX.class.getResource(getFxml(cls)));
			Parent root = loader.load();
			T t = loader.getController();
			if (lt == LoadType.LOAD_NEW_SCENE) {
				parent.getStage().setScene(new Scene(root));
			}
			t.setParcel(parent.getParcel());
			t.setStage(parent.getStage());
			t.init();
			return t;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static <T extends Controller> String getFxml(Class<T> cls) {
		try {
			return cls.getDeclaredConstructor().newInstance().getFxml();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
