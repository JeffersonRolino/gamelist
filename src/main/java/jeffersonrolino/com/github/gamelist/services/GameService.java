package jeffersonrolino.com.github.gamelist.services;

import jeffersonrolino.com.github.gamelist.dtos.GameDTO;
import jeffersonrolino.com.github.gamelist.dtos.GameMinimalDTO;
import jeffersonrolino.com.github.gamelist.entities.Game;
import jeffersonrolino.com.github.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinimalDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        List<GameMinimalDTO> gameMinimalDTOS = games.stream().map(game -> new GameMinimalDTO(game)).toList();
        return gameMinimalDTOS;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }
}
