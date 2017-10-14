/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5ot;

import CIT260.Group5ot.model.Barrel;
import CIT260.Group5ot.model.Campsite;
import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;
import CIT260.Group5ot.model.Health;
import CIT260.Group5ot.model.InventoryItem;

import CIT260.Group5ot.model.RiverCrossing;
import CIT260.Group5ot.model.Trail;
import CIT260.Group5ot.model.Wagon;

//Ken's classes to import...
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.EndScene;
import CIT260.Group5ot.model.LosingGameScene;
import CIT260.Group5ot.model.WinningGameScene;

//Eric's Classes to import...
import CIT260.Group5ot.model.HuntingScene;
import CIT260.Group5ot.model.FoodSource;
import CIT260.Group5ot.model.RegularSceneType;
import CIT260.Group5ot.model.TradingPost;
import CIT260.Group5ot.model.ResourceScene;
import CIT260.Group5ot.model.WaterSource;
                

/**
 *
 * @author erict.blackham
 */
public class Group5ot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Player playerOne = new Player();
        
        playerOne.setName("Michael Jordan");
        playerOne.setBestTime(8.00);
        
        String playerOneName = playerOne.getName();
        double playerOneBestTime = playerOne.getBestTime();
        
        System.out.println(playerOne.toString());
        
        
        Character.Father.getName();
        Character.Father.getDescription();
       
        System.out.println(Character.Father.getName() + " , " + Character.Father.getDescription());
         
        
        Health healthOne = new Health();
        
        healthOne.setLevel(10);
        healthOne.setStatus("sick");
        
        int healthOneLevel = healthOne.getLevel();
        String healthOneStatus = healthOne.getStatus();
        
        System.out.println("Health = " + healthOneLevel + ", Status = " + healthOneStatus);
        
        
        Wagon wagonOne = new Wagon();
        
        wagonOne.setTotalWeight(550.75);
        wagonOne.setSupplyItem("flour, dutch oven, can of grease");
        
        double wagonOneTotalWeight = wagonOne.getTotalWeight();
        String wagonOneSupplyItem = wagonOne.getSupplyItem();
        
        System.out.println("Total weight = " + wagonOneTotalWeight + ", Supplies = " + wagonOneSupplyItem);
        
        
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setInventoryType("food");
        inventoryItemOne.setQuantityInStock(435);
        inventoryItemOne.setRequiredAmount(350);
        
        String inventoryItemOneInventoryType = inventoryItemOne.getInventoryType();
        int inventoryItemOneQuantityInStock = inventoryItemOne.getQuantityInStock();
        int inventoryItemOneRequiredAmount = inventoryItemOne.getRequiredAmount();
        
        System.out.println("Inventory type = " + inventoryItemOneInventoryType + ", Quantity in stock = " + inventoryItemOneQuantityInStock + ", Required amount = " + inventoryItemOneRequiredAmount);
        
        Barrel barrelOne = new Barrel();
        
        barrelOne.setHeight(42.25);
        barrelOne.setDiameter(18.5);
        barrelOne.setVolume(47);
        barrelOne.setMaxWeight(200);
        
        double barrelOneHeight = barrelOne.getHeight();
        double barrelOneDiameter = barrelOne.getDiameter();
        double barrelOneVolume = barrelOne.getVolume();
        double barrelOneMaxWeight = barrelOne.getMaxWeight();
        
        System.out.println("Height = " + barrelOneHeight + ", Diameter = " + barrelOneDiameter + ", Volume = " + barrelOneVolume + ", Max weight = " + barrelOneMaxWeight);
        
        
        
        
        //Ken's class tests...
        //****************Map class****************
        //This brings an actual instance of Map to life (as "map")
        Map map = new Map();
        
        //This sets values for my variables
        map.setDescription("I\'m the map!");
        /* The below variables were no longer needed once we set constants.
        map.setRowCount(20);
        map.setColumnCount(35);
        */
        
        //This creates new, usable variables and assigns them values using above variables
        /*
        String mapDescription = map.getDescription();
        int mapRowCountCurrent = map.getROWCOUNT();
        int mapColumnCountCurrent = map.getCOLUMNCOUNT();
        */
        
        //This will use my new, usable variables
        //System.out.println("The map says: " + mapDescription + " I have " + mapRowCountCurrent + " rows and " + mapColumnCountCurrent + " columns. Thanks for stopping by.");
       
       
        
        System.out.println(map.toString());
        
        //****************Location class****************
        Location location = new Location();
        
        location.setRow(13);
        location.setColumn(20);
        location.setVisited(false); //location.isVisited();
        location.setAmountRemaining(8);
        
        System.out.println(location.toString());
        
        //****************EndScene****************
        EndScene endScene = new EndScene();
        
        endScene.setEndStatus(true);
        
        System.out.println(endScene.toString());
        
        //****************LosingGameScene****************
        LosingGameScene losingGameSceneVar = new LosingGameScene();
        
        losingGameSceneVar.setPlayerName(playerOne.getName());
        
        System.out.println(losingGameSceneVar.toString());
        
        //****************WinningGameScene****************
        WinningGameScene winningGameSceneVar = new WinningGameScene();
        
        winningGameSceneVar.setPlayerName(losingGameSceneVar.getPlayerName()); //Trying things. :)
        winningGameSceneVar.setRecordedTime(46);
        
        System.out.println(winningGameSceneVar.toString());

       
        Trail initialTrail  = new Trail();
        
              initialTrail.setCondition("fair");
        
        String  initialTrailCondition = initialTrail.getCondition();
        
        System.out.println("The condition of the trail is " + initialTrailCondition);
        
        
        
        RiverCrossing initialRiver = new RiverCrossing();
        
        initialRiver.setDifficulty("easy");
        initialRiver.setWaterLevel("low");
        
        String initalRiverDifficulty = initialRiver.getDifficulty();
        String initialRiverWaterLevel = initialRiver.getWaterLevel();
        
       
        //Eric's Tests
       
        HuntingScene huntSceneOne = new HuntingScene();
        
        huntSceneOne.setAmmunitionLvl(5);
        huntSceneOne.setAnimalType("buffalo");
        huntSceneOne.setDifficultyLvl("Easy");
        
        double partOneAmmuntion = huntSceneOne.getAmmunitionLvl();
        String partOneAnimal = huntSceneOne.getAnimalType();
        String partOneDifficulty = huntSceneOne.getDifficultyLvl();
        
        System.out.println(huntSceneOne.toString());
       
        
        FoodSource foodStuff = new FoodSource();
        
        foodStuff.setFoodLvl("High");
        foodStuff.setFoodNeeded("Wheat");
        
        String foodOneLvl = foodStuff.getFoodLvl();
        String foodOneNeeds = foodStuff.getFoodNeeded();
        
        System.out.println(foodStuff.toString());
        
    }
    
}
