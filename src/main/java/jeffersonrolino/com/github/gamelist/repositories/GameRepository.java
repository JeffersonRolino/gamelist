package jeffersonrolino.com.github.gamelist.repositories;

import jeffersonrolino.com.github.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
