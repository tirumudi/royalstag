package com.exavirtue.labs.models;

/**
 * Created by thirumudi on 6/10/17.
 */
public class PlayerRequest {

    private int id;
    private int playerId;
    private int playerRequested;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerRequested() {
        return playerRequested;
    }

    public void setPlayerRequested(int playerRequested) {
        this.playerRequested = playerRequested;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
