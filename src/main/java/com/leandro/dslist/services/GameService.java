package com.leandro.dslist.services;

import com.leandro.dslist.dto.GameMinDTO;
import com.leandro.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        var dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }
}
