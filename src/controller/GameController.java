package controller;

import view.Chessboard;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GameController {
    private Chessboard chessboard;

    public GameController(Chessboard chessboard) {
        this.chessboard = chessboard;
    }

    public Chessboard getChessboard() {
        return chessboard;
    }

    public List<String> loadGameFromFile(String path) {
        JFileChooser jc = new JFileChooser();
        try {
            List<String> chessData = Files.readAllLines(Paths.get(path));
            chessboard.loadGame(chessData);
            return chessData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
//        if(){
//
//        }else{
//
//        }


    }
    public List<String> saveGameFile() {
        try {
            List<String> chessData = chessboard.saveGame();
            return chessData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//    public boolean ErrorCheck(){
//        if()
//    }

}
