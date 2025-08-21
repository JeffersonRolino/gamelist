package jeffersonrolino.com.github.gamelist.services;

import jeffersonrolino.com.github.gamelist.dtos.GameDTO;
import jeffersonrolino.com.github.gamelist.entities.Game;
import jeffersonrolino.com.github.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDTOS = games.stream().map(game -> new GameDTO(game)).toList();
        return gameDTOS;
    }
}
