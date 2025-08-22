package jeffersonrolino.com.github.gamelist.services;

import jeffersonrolino.com.github.gamelist.dtos.GameListDTO;
import jeffersonrolino.com.github.gamelist.entities.GameList;
import jeffersonrolino.com.github.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gameLists = gameListRepository.findAll();
        return gameLists.stream().map(gameList -> new GameListDTO(gameList)).toList();
    }
}
