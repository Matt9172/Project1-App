package selectorPage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SelectorController {


    public ListView expertList;
    public Button connectButton;
    public TextField searchBar;


    public void initialize(){

        ObservableList<Object> listOfExperts = FXCollections.observableArrayList();

        listOfExperts.add("Programming");

        listOfExperts.add("Music");

        listOfExperts.add("DIY");

        listOfExperts.add("Cooking");

        listOfExperts.add("Baking");



        expertList.setItems(listOfExperts);

    }

    public void searchForExperts(ActionEvent actionEvent) {


    }

    public void connectToExpert(ActionEvent actionEvent) {


    }

}

