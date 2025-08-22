package jeffersonrolino.com.github.gamelist.controllers;

import jeffersonrolino.com.github.gamelist.dtos.GameDTO;
import jeffersonrolino.com.github.gamelist.dtos.GameMinimalDTO;
import jeffersonrolino.com.github.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinimalDTO> findAll(){
        List<GameMinimalDTO> games = gameService.findAll();
        return games;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
