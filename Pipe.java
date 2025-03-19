import java.awt.*;

public class Pipe {
    int boardWidth = 360;
    int pipeX = boardWidth;
    static int pipeY = 0;
    int pipeWidth = 64;  //scaled by 1/6
    static int pipeHeight = 512;
    int x = pipeX;
    int y = pipeY;
    int width = pipeWidth;
    int height = pipeHeight;
    boolean passed = false;

    Image img;
    Pipe(Image img) {
        this.img = img;
    }
}
