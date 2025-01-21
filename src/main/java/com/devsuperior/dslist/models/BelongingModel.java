package com.devsuperior.dslist.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class BelongingModel {

    @EmbeddedId
    private BelongingPKModel id = new BelongingPKModel();
    private Integer position;

    public BelongingModel() {
    }

    public BelongingModel(GameModel gameModel, GameListModel gameListModel, Integer position) {
        id.setGameModel(gameModel);
        id.setGameListModel(gameListModel);

        this.position = position;
    }

    public BelongingPKModel getId() {
        return id;
    }

    public void setId(BelongingPKModel id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingModel that = (BelongingModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
