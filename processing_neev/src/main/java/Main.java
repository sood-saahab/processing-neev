import processing.core.PApplet;


public class Main extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int position1 = 0;
    int position2 = 0;
    int position3 = 0;
    int position4 = 0;

    public static void main(String[] args) {
        PApplet.main( "Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(position1, HEIGHT / 5, DIAMETER);
        drawCircle(position2, HEIGHT * 2/5, DIAMETER);
        drawCircle(position3, HEIGHT * 3/5, DIAMETER);
        drawCircle(position4, HEIGHT * 4/5, DIAMETER);
        position1 += 1;
        position2 += 2;
        position3 += 3;
        position4 += 4;
    }

    private void drawCircle(int position, int height, int size) {
        ellipse(position, height, size, size);
    }
}
