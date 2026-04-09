public class Circle extends Shape {
    
    private float radius;

    public float getRadius(){

        return this.radius;
    }

    public void setRadius(float radius){

        this.radius = radius;
    }

    @Override public float calculateArea(){

        return (float)(getRadius() * getRadius() * Math.PI);
    }

    public Circle(){

        setRadius(0);
    }

    public Circle(float radius){

        setRadius(radius);
    }
}
