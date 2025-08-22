package jeffersonrolino.com.github.gamelist.dtos;

import jeffersonrolino.com.github.gamelist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    /******************************************************************************************************************
     * CONSTRUCTORS
     ******************************************************************************************************************/
    public GameListDTO() {
    }

    public GameListDTO(GameList gameList) {
        this.id = gameList.getId();
        this.name = gameList.getName();
    }


    /******************************************************************************************************************
     * GETTERS & SETTERS
     ******************************************************************************************************************/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
