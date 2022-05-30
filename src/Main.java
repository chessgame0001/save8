import view.Chessboard;
import view.Menu;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            mainFrame = new ChessGameFrame(1000, 760);
//            mainFrame.setVisible(false);
//            MusicTest.getBgm();
//        });
        SwingUtilities.invokeLater(() -> {
            Menu upperFrame = new Menu(1000, 760);
            Chessboard.setMenu(upperFrame);
            upperFrame.setVisible(true);
        });


}
}