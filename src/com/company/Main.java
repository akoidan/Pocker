package com.company;

import com.company.domains.Game;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> fileData = FileHandler.getFileData(args[0]);
        List<Game> games = fileData.stream().map(Game::deserialize).collect(Collectors.toList());
        games.forEach(System.out::println);
    }
}
