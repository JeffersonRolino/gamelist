package jeffersonrolino.com.github.gamelist.dtos;

import jeffersonrolino.com.github.gamelist.entities.Game;

public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    /******************************************************************************************************************
     * CONSTRUCTORS
     ******************************************************************************************************************/
    public GameDTO() {
    }

    public GameDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public GameDTO(Game game){
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
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
