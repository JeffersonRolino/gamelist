package jeffersonrolino.com.github.gamelist.dtos;

import jeffersonrolino.com.github.gamelist.entities.Game;
import jeffersonrolino.com.github.gamelist.projections.GameMinProjection;

public class GameMinimalDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    /******************************************************************************************************************
     * CONSTRUCTORS
     ******************************************************************************************************************/
    public GameMinimalDTO() {
    }

    public GameMinimalDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public GameMinimalDTO(Game game){
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public GameMinimalDTO(GameMinProjection gameMinProjection){
        this.id = gameMinProjection.getId();
        this.title = gameMinProjection.getTitle();
        this.year = gameMinProjection.getGameYear();
        this.imgUrl = gameMinProjection.getImgUrl();
        this.shortDescription = gameMinProjection.getShortDescription();
    }


    /******************************************************************************************************************
     * GETTERS
     ******************************************************************************************************************/
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
