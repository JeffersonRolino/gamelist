package jeffersonrolino.com.github.gamelist.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game_list")
public class GameList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    /******************************************************************************************************************
     * CONSTRUCTORS
     ******************************************************************************************************************/
    public GameList() {
    }

    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
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

    /******************************************************************************************************************
     * EQUALS & HASH CODE
     ******************************************************************************************************************/
    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof GameList gameList)) return false;

        return id.equals(gameList.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
