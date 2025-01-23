import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int intialSpeed = 2;

    Ball(int x, int y, int width, int height)
    {
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection * intialSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection * intialSpeed);
    }

    public void setXDirection(int randomXDirection)
    {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection)
    {
        yVelocity = randomYDirection;
    }

    public void move()
    {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }
}
