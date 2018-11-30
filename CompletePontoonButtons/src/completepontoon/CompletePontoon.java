/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completepontoon;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 16007873
 */
public class CompletePontoon extends Application {

    @FXML
    private Button twistButton;

    @FXML
    private Button stickButton;

    Hand hand = new Hand();
    Cards card = new Cards();
    WinConditions win = new WinConditions();
    Player newPlayer = new Player();            //to be changed in the future to allow player choice!!
    Dealer theDealer = new Dealer();

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            String viewerFxml = "Pontoonfx.fxml";
            VBox page = (VBox) fxmlLoader.load(this.getClass().getResource(viewerFxml).openStream());
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @FXML
    private Label gameTextLabel;

    @FXML
    private Label gameTextLabel1;

    @FXML
    private Button startButton;

    @FXML
    private void startGame(ActionEvent event) {
        hand.hand();
        newPlayer.players(hand.twist());
        theDealer.dealer(hand.twist());
        gameTextLabel.setText("Your Card is: ");
        gameTextLabel1.setText("" + newPlayer.getPlayerCards());
        startButton.setVisible(false);
        twistButton.setVisible(true);
        stickButton.setVisible(true);
    }

    @FXML
    private void twist(ActionEvent event) {
        if (newPlayer.playervalue(card.CardValue(newPlayer.getPlayerCards())) <= 21) {
            newPlayer.players(hand.twist());
            if (theDealer.dealervalue(card.CardValue(theDealer.getDealerCards())) < 16) {
                theDealer.dealer(hand.twist());
//                System.out.println(Integer.toString(theDealer.dealervalue(card.CardValue(theDealer.getDealerCards()))));
            }
            gameTextLabel.setText("Your Cards have value: " + Integer.toString(newPlayer.playervalue(card.CardValue(newPlayer.getPlayerCards()))) + " and Are:");
            gameTextLabel1.setText("" + newPlayer.getPlayerCards());
        } else {
            gameTextLabel1.setText(win.WinConditions(newPlayer.playervalue(card.CardValue(newPlayer.getPlayerCards())), theDealer.dealervalue(card.CardValue(theDealer.getDealerCards()))));

        }
    }

    @FXML
    private void stick(ActionEvent event) {
//        win.WinConditions(newPlayer.playervalue(card.CardValue(newPlayer.getPlayerCards())), theDealer.dealervalue(card.CardValue(theDealer.getDealerCards())));
        gameTextLabel1.setText(win.WinConditions(newPlayer.playervalue(card.CardValue(newPlayer.getPlayerCards())), theDealer.dealervalue(card.CardValue(theDealer.getDealerCards()))));
//        System.exit(0);
    }

}
