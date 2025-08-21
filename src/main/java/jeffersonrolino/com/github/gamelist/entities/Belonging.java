package jeffersonrolino.com.github.gamelist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;


    /******************************************************************************************************************
     * CONSTRUCTORS
     ******************************************************************************************************************/
    public Belonging() {
    }

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }


    /******************************************************************************************************************
     * GETTERS & SETTERS
     ******************************************************************************************************************/
    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }


    /******************************************************************************************************************
     * EQUALS & HASH CODE
     ******************************************************************************************************************/
    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Belonging belonging)) return false;

        return id.equals(belonging.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
