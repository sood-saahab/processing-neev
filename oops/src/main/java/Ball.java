import processing.core.PApplet;
public class Ball extends PApplet {

    int xPosition;
    int yPosition;
    int speed;
    int diameter;
    PApplet obj;

    Ball(int xPosition, int yPosition, int speed, int diameter, PApplet obj)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.speed = speed;
        this.diameter = diameter;
        this.obj = obj;
    }

    void display()
    {
        obj.ellipse(xPosition, yPosition, diameter, diameter);
    }

    void move()
    {
        xPosition += speed;
    }
}
