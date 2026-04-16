package Polymorphism;

public class Rectangle extends Shape{
    
    private float width;
    private float height;

    public float getWidth(){

        return this.width;
    }

    public void setWidth(float width){

        this.width = width;
    }

    public float getHeight(){

        return this.height;
    }

    public void setHeight(float height){

        this.height = height;
    }

    @Override public float calculateArea(){

        return getHeight() * getWidth();
    }

    public Rectangle(){

        setWidth(0);
        setHeight(0);
    }

    public Rectangle(float width, float height){

        setWidth(width);
        setHeight(height);
    }
}