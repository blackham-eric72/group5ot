/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import CIT260.Group5ot.enums.SceneType;

/**
 *
 * @author Flores Family
 */
public class Scene {
    private String symbol;  // This was in RegularSceneType.  Used for Map??
    private SceneType sceneType;

    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
    }
    public Scene(SceneType sceneType) {
        setSceneType(sceneType);
    }
    
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
}
