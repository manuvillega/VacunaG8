package vistas2;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class GoogleMapPanel extends JFXPanel {

    private WebView webView;
    private WebEngine webEngine;

    public GoogleMapPanel() {
        Platform.runLater(this::createScene);
    }

    public void createScene() {
        webView = new WebView();
        webEngine = webView.getEngine();
        Scene scene = new Scene(webView);
        setScene(scene);
    }

    public void showMapForCity(String ciudad) {
        Platform.runLater(() -> {
            String url = "https://www.google.com/maps/search/hospitales+cerca+de+" + ciudad + "/@5zoom";
            webEngine.load(url);
        });
    }
}
