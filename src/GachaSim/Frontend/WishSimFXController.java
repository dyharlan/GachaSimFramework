/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GachaSim.Frontend;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import GachaSim.Banners.StdBanner;
import GachaSim.Banners.CharacterBanner;
import GachaSim.Banners.WeaponBanner;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author dyhar
 */
public class WishSimFXController implements Initializable {
    //Creating an instance of the Character Banner Class
    //in order to check the counters for the 5 and 4 star pity, and the 5* guarantee.
    CharacterBanner CbannerStatus = new CharacterBanner(); 
    
    //Creating an instance of the Weapon Banner Class
    //in order to check the counters for the 5 and 4 star pity, and the 5* guarantee.
    static WeaponBanner WbannerStatus = new WeaponBanner();
    
    //Creating an instance of the Standard Banner Class
    //in order to check the counters for the 5 and 4 star pity, and the 5* guarantee.
    static StdBanner SbannerStatus = new StdBanner();
    
    @FXML
    private Label guaranteed5;
    @FXML
    private TextArea CharWishHistory;
    @FXML
    private Label CharRolls;
    @FXML
    private Label CharLast4;
    @FXML
    private TextArea CharWishHistory_;
    @FXML
    private Label guaranteed5_;
    @FXML
    private Label CharRolls_;
    @FXML
    private Label CharLast4_;
    @FXML
    private TextArea WpnWishHistory;
    @FXML
    private Label WpnRolls;
    @FXML
    private Label WpnLast4;
    @FXML
    private TextArea StdWishHistory;
    @FXML
    private Label StdRolls;
    @FXML
    private Label StdLast4;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCharRoll(ActionEvent event) {
        CharWishHistory.appendText(CharacterBanner.CharRoll("Itto", "Xiangling", "Barbara", "Gorou") + "\n");
        guaranteed5.setText(String.valueOf(CbannerStatus.guaranteed5));
        CharRolls.setText(String.valueOf(CbannerStatus.Crolls));
        CharLast4.setText(String.valueOf(CbannerStatus._4Spity));

        guaranteed5_.setText(String.valueOf(CbannerStatus.guaranteed5));
        CharRolls_.setText(String.valueOf(CbannerStatus.Crolls));
        CharLast4_.setText(String.valueOf(CbannerStatus._4Spity));
    }

    @FXML
    private void handleCharRoll10(ActionEvent event) {
       for(int ctr = 0 ; ctr < 10 ; ctr++)
       {
           CharWishHistory.appendText(CharacterBanner.CharRoll("Itto", "Xiangling", "Barbara", "Gorou") + "\n");
           guaranteed5.setText(String.valueOf(CbannerStatus.guaranteed5));
           CharRolls.setText(String.valueOf(CbannerStatus.Crolls));
           CharLast4.setText(String.valueOf(CbannerStatus._4Spity));
           
           guaranteed5_.setText(String.valueOf(CbannerStatus.guaranteed5));
           CharRolls_.setText(String.valueOf(CbannerStatus.Crolls));
           CharLast4_.setText(String.valueOf(CbannerStatus._4Spity));
       }
    }

    @FXML
    private void handleCharClearHistory(ActionEvent event) {
        CharWishHistory.clear();
        CharWishHistory_.clear();
    }
    //This Event controls the 2nd banner rate up. During the 2nd half of an update, this mainly duplicates the 1st rate up since i'm too lazy
    // to figure out how to disable this that is reversible.
    @FXML
    private void handleCharRoll_(ActionEvent event) {
        CharWishHistory_.appendText(CharacterBanner.CharRoll("Itto", "Xiangling", "Barbara", "Gorou") + "\n");
        guaranteed5_.setText(String.valueOf(CbannerStatus.guaranteed5));
        CharRolls_.setText(String.valueOf(CbannerStatus.Crolls));
        CharLast4_.setText(String.valueOf(CbannerStatus._4Spity));
        
        guaranteed5.setText(String.valueOf(CbannerStatus.guaranteed5));
        CharRolls.setText(String.valueOf(CbannerStatus.Crolls));
        CharLast4.setText(String.valueOf(CbannerStatus._4Spity));
    }

    @FXML
    private void handleCharRoll10_(ActionEvent event) {
       for(int ctr = 0 ; ctr < 10 ; ctr++)
       {
           CharWishHistory_.appendText(CharacterBanner.CharRoll("Itto", "Xiangling", "Barbara", "Gorou") + "\n");
           guaranteed5_.setText(String.valueOf(CbannerStatus.guaranteed5));
           CharRolls_.setText(String.valueOf(CbannerStatus.Crolls));
           CharLast4_.setText(String.valueOf(CbannerStatus._4Spity));  
           
           guaranteed5.setText(String.valueOf(CbannerStatus.guaranteed5));
           CharRolls.setText(String.valueOf(CbannerStatus.Crolls));
           CharLast4.setText(String.valueOf(CbannerStatus._4Spity));
       }
    }

    @FXML
    private void handleCharClearHistory_(ActionEvent event) {
        CharWishHistory.clear();
        CharWishHistory_.clear();
    }
    

    @FXML
    private void handleWpnRoll(ActionEvent event) {
        WpnWishHistory.appendText(WeaponBanner.WpnRoll("Skyward Harp", "RedHorn Stonethresher", "Favonius Lance", "Alley Flash", "Miiternachts Waltz", "The Bell", "Sacrificial Fragments") + "\n");
        WpnRolls.setText(String.valueOf(WbannerStatus.Wrolls));
        WpnLast4.setText( String.valueOf(WbannerStatus._4Spity) );
    }

    @FXML
    private void handleWpnRoll10(ActionEvent event) {
       for(int ctr = 0 ; ctr < 10 ; ctr++)
       {
            WpnWishHistory.appendText(WeaponBanner.WpnRoll("Skyward Harp", "RedHorn Stonethresher", "Favonius Lance", "Alley Flash", "Miiternachts Waltz", "The Bell", "Sacrificial Fragments") + "\n");
            WpnRolls.setText(String.valueOf(WbannerStatus.Wrolls));
            WpnLast4.setText( String.valueOf(WbannerStatus._4Spity) );
       }
    }

    @FXML
    private void handleWpnClearHistory(ActionEvent event) {
        WpnWishHistory.clear();
    }

    @FXML
    private void handleStdRoll(ActionEvent event) {
        StdWishHistory.appendText(StdBanner.StdRoll() + "\n");
        StdRolls.setText(String.valueOf(WbannerStatus.Wrolls));
        StdLast4.setText( String.valueOf(WbannerStatus._4Spity) );
    }

    @FXML
    private void handleStdRoll10(ActionEvent event) {
       for(int ctr = 0 ; ctr < 10 ; ctr++)
       {
            StdWishHistory.appendText(StdBanner.StdRoll() + "\n");
            StdRolls.setText(String.valueOf(SbannerStatus.Srolls));
            StdLast4.setText( String.valueOf(SbannerStatus._4Spity) );
       }
    }

    @FXML
    private void handleStdClearHistory(ActionEvent event) {
        StdWishHistory.clear();
    }

    @FXML
    private void handleExit(ActionEvent event) {
        javafx.application.Platform.exit();
    }

    @FXML
    private void handleHowto(ActionEvent event) {
        
    }

    @FXML
    private void handleAbout(ActionEvent event) {
    }
}
