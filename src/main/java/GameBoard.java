import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class GameBoard {


    private GUI gui;
    private GUI_Player[] guiPlayers;
    private Player[] players;

    public GameBoard() {
        gui = new GUI(customFields());
        setupPlayers();
        movePlayerAndCastDice();
    }

    public GUI_Field[] customFields() {
        GUI_Field[] fieldsDesign = new GUI_Field[20];

        fieldsDesign[0] = new GUI_Start("Start", "", "Hver gang du passerer start, modtager du 2 kr.", Color.GREEN.darker(), Color.BLACK);
        fieldsDesign[1] = new GUI_Street("Burgerbaren", "", "Få en burger på parkens bedste burgerbar. ('Bedste' nomineret af egen resturant.)", "1", Color.ORANGE, Color.BLACK);
        fieldsDesign[2] = new GUI_Street("Pizzariaet", "", "Hvis munden nu ikke er stor nok til den burger.", "1", Color.ORANGE, Color.BLACK);
        fieldsDesign[3] = new GUI_Chance("?", "", "Træk et chancekort og følg dets anvisninger.", Color.WHITE, Color.BLACK);
        fieldsDesign[4] = new GUI_Street("Slikbutikken", "", "Til den lille slikmund.", "1", Color.BLUE.brighter(), Color.BLACK);
        fieldsDesign[5] = new GUI_Street("Iskiosken", "", "Hjælper når solen er fremme.", "1", Color.BLUE.brighter(), Color.BLACK);
        fieldsDesign[6] = new GUI_Jail();
        fieldsDesign[6].setSubText("");
        fieldsDesign[7] = new GUI_Street("Museet", "", "Både sjovt og lærerigt.", "2", Color.PINK, Color.BLACK);
        fieldsDesign[8] = new GUI_Street("Biblioteket", "", "Lærerigt, men ikke så sjovt som museet.", "2", Color.PINK, Color.BLACK);
        fieldsDesign[9] = new GUI_Chance("?", "", "Træk et chancekort og følg dets anvisninger.", Color.WHITE, Color.BLACK);
        fieldsDesign[10] = new GUI_Street("Skaterparken", "", "Husk nu hjelmen.", "2", Color.YELLOW.brighter(), Color.BLACK);
        fieldsDesign[11] = new GUI_Street("Svømmingpoolen", "", "Ikke løbe ved poolen!.", "2", Color.YELLOW.brighter(), Color.BLACK);
        fieldsDesign[12] = new GUI_Refuge();
        fieldsDesign[12].setTitle("Gratis parkering");
        fieldsDesign[12].setSubText("");
        fieldsDesign[13] = new GUI_Street("Spillehallen", "", "Forældrenes undskyldning for deres ludomani.", "3", Color.RED, Color.BLACK);
        fieldsDesign[14] = new GUI_Street("Biografen", "", "Brug tid sammen med familien, uden at snakke med dem.", "3", Color.RED, Color.BLACK);
        fieldsDesign[15] = new GUI_Chance("?", "", "Træk et chancekort og følg dets anvisninger.", Color.WHITE, Color.BLACK);
        fieldsDesign[16] = new GUI_Street("Legetøjsbutikken", "", "Hvem siger man ikke kan købe kærlighed.", "3", Color.YELLOW, Color.BLACK);
        fieldsDesign[17] = new GUI_Street("Dyrehandlen", "", "Hvis familien nu ikke er stor nok.", "3", Color.YELLOW, Color.BLACK);
        fieldsDesign[18] = new GUI_Shipping();
        fieldsDesign[18].setTitle("Gå i fængsel");
        fieldsDesign[18].setSubText("");
        fieldsDesign[19] = new GUI_Street("Bowlinghallen", "", "Når far skal vise sig.", "4", Color.GREEN, Color.BLACK);
        fieldsDesign[20] = new GUI_Street("Zoo", "", "Det eneste sted dine forældre tillader dyr.", "4", Color.GREEN, Color.BLACK);
        fieldsDesign[21] = new GUI_Chance("?", "", "Træk et chancekort og følg dets anvisninger.", Color.WHITE, Color.BLACK);
        fieldsDesign[22] = new GUI_Street("Vandlandet", "", "Samme som poolen, bare dyrer.", "5", Color.BLUE.brighter(), Color.WHITE);
        fieldsDesign[23] = new GUI_Street("Strandpromenaden", "", "Sand. Alle. Steder.", "5", Color.BLUE.brighter(), Color.WHITE);


        return fieldsDesign;
    }



}
