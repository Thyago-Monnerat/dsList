package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.models.GameModel;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(GameModel gameModel){
        this.id = gameModel.getId();
        this.title = gameModel.getTitle();
        this.year = gameModel.getYear();
        this.imgUrl = gameModel.getImgUrl();
        this.shortDescription = gameModel.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameMinProjection){
        this.id = gameMinProjection.getId();
        this.title = gameMinProjection.getTitle();
        this.year = gameMinProjection.getYear();
        this.imgUrl = gameMinProjection.getImgUrl();
        this.shortDescription = gameMinProjection.getShortDescription();
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
