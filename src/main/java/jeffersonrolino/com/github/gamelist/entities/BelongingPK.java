package jeffersonrolino.com.github.gamelist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    /******************************************************************************************************************
     * CONSTRUCTORS
     ******************************************************************************************************************/
    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }


    /******************************************************************************************************************
     * GETTERS & SETTERS
     ******************************************************************************************************************/
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }


    /******************************************************************************************************************
     * EQUALS & HASH CODE
     ******************************************************************************************************************/
    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BelongingPK that)) return false;

        return game.equals(that.game) && gameList.equals(that.gameList);
    }

    @Override
    public int hashCode() {
        int result = game.hashCode();
        result = 31 * result + gameList.hashCode();
        return result;
    }
}
