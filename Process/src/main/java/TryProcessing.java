import processing.core.PApplet;

public class TryProcessing extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER=20;
    int x2=0,x3=0,x4=0;
    int x1=0;
    public static void main(String[] args) {
        PApplet.main(   "TryProcessing",args);

    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {


    }



    @Override
    public void draw() {
        drawCircle(x1,(HEIGHT*1)/5,DIAMETER,DIAMETER);
        x1++;
        drawCircle(x2,(HEIGHT*2)/5,DIAMETER,DIAMETER);
        x2=x2+2;
        drawCircle(x3,(HEIGHT*3)/5,DIAMETER,DIAMETER);
        x3=x3+3;
        drawCircle(x4,(HEIGHT*4)/5,DIAMETER,DIAMETER);
        x4=x4+4;

    }

    private void paintWhite() {
        background(255);
    }

    private void drawCircle(int width,int height,int radius1,int radius2) {
        ellipse(width,height,radius1,radius2);
    }
}

