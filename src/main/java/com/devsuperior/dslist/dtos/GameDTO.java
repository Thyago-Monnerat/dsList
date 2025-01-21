package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.models.GameModel;

public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameDTO(){
    }

    public GameDTO(GameModel gameModel){
        this.id = gameModel.getId();
        this.title = gameModel.getTitle();
        this.year = gameModel.getYear();
        this.imgUrl = gameModel.getImgUrl();
        this.shortDescription = gameModel.getShortDescription();
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
