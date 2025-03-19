import java.awt.*;

public class Bird {

    int boardWidth = 360;
    static int boardHeight = 640;
    int birdX = boardWidth/8;
    static int birdY = boardHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;
    Image img;

    int x = birdX;
    int y = birdY;
    int width = birdWidth;
    int height = birdHeight;
    Bird(Image img){
        this.img = img;

    }
}
