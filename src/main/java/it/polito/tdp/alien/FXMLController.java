package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.model.Dizionario;
import it.polito.tdp.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Dizionario model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClearText;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextField txtInput;

    @FXML
    private TextArea txtTraduzione;
    
    @FXML
    private Label txtError;
    
    public void setModel (Dizionario model) {
    	this.model=model;
    }

    @FXML
    void doTraduzione(ActionEvent event) {
    	String input = txtInput.getText().toLowerCase();
    	String [] s = input.split(" ");
    	
	    if(s.length==2) {
	    	if(s[0].matches("[a-zA-Z]+") && s[1].matches("[a-zA-Z]+")) {
	    		
	    		model.add(s[0], s[1]);    
	    		txtInput.clear();
	    		txtError.setText("");
	    	} else {
	    		txtError.setText("Errore formato");
	    	}
	    } else if (s.length==1) {
	    	if(s[0].matches("[a-zA-Z]+")){
	    		txtTraduzione.setText(model.getTraduzione(s[0]).toString());
	    		txtError.setText("");
	    	} else {
	    		txtError.setText("Errore formato");
	    	}
    	}
    	
    }

    @FXML
    void handleClearText(ActionEvent event) {
    	txtInput.clear();
    	txtTraduzione.clear();
    	txtError.setText("");
    }

    @FXML
    void initialize() {
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTraduzione != null : "fx:id=\"txtTraduzione\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtError != null : "fx:id=\"txtError\" was not injected: check your FXML file 'Scene.fxml'.";

        model = new Dizionario();
    }

}

