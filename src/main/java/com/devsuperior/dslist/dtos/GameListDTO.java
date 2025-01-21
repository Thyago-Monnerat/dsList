package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.models.GameListModel;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameListModel gameListModel) {
        id = gameListModel.getId();
        name = gameListModel.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
