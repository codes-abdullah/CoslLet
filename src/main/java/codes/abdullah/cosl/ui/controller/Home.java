package codes.abdullah.cosl.ui.controller;

import codes.abdullah.cosl.r.R;
import codes.abdullah.cosl.ui.utils.FX;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;

public class Home extends Controller {
	@FXML
	private Tab tabStopTracker;
	
	@Override
	public void init() {
		super.init();
		StopTracker st =  FX.load(StopTracker.class, this, LoadType.LOAD_VIEW);
		tabStopTracker.setContent(st.getRoot());
	}

	@Override
	public String getFxml() {
		return R.resources.fxml.HOME;
	}

}
