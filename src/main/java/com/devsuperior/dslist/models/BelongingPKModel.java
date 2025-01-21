package com.devsuperior.dslist.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPKModel {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameModel gameModel;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameListModel gameListModel;

    public BelongingPKModel() {
    }

    public BelongingPKModel(GameModel gameModel, GameListModel gameListModel) {
        this.gameModel = gameModel;
        this.gameListModel = gameListModel;
    }

    public GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public GameListModel getGameListModel() {
        return gameListModel;
    }

    public void setGameListModel(GameListModel gameListModel) {
        this.gameListModel = gameListModel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPKModel that = (BelongingPKModel) o;
        return Objects.equals(gameModel, that.gameModel) && Objects.equals(gameListModel, that.gameListModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameModel, gameListModel);
    }
}
