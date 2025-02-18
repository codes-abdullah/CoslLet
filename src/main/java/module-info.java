module cosllet {
	
	requires javafx.base;
	requires javafx.controls;
//	requires transitive javafx.graphics;
//	requires transitive javafx.fxml;
//	requires transitive org.slf4j;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	requires transitive org.slf4j;
	requires ch.qos.reload4j;
//	requires transitive codes.abdullah.parcel;
	
	exports codes.abdullah.cosl to javafx.graphics, org.apache.poi.poi;
	requires poiji;
	exports codes.abdullah.cosl.ui.module.pob to poiji;
	exports codes.abdullah.cosl.utils to  poiji;
	opens codes.abdullah.cosl.utils to  poiji;
	opens codes.abdullah.cosl.ui.module.pob to poiji;
	opens codes.abdullah.cosl.ui.controller to javafx.fxml;
	requires transitive org.apache.poi.poi;
	requires org.apache.poi.ooxml;
}