import processing.core.PApplet;
import java.util.List;
import java.util.ArrayList;


public class Main extends PApplet {

    static final int WIDTH = 640;
    static final int HEIGHT = 480;
    List<Ball> balls;

    public static void main(String[] args)
    {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        drawBalls(4);
    }

    @Override
    public void draw() {
//        drawBalls(4);
        for(int i=0; i<4; i++)
        {
            moveBalls(balls.get(i));
        }
    }

    void drawBalls(int number)
    {
        balls= new ArrayList<>(4);
        for(int i=1;i<=number;i++)
        {
            Ball temp= new Ball(0,(i * (HEIGHT / 5)),i,10,this);
            balls.add(temp);
        }
    }

    void moveBalls(Ball ball)
    {
        ball.display();
        ball.move();
    }
}

