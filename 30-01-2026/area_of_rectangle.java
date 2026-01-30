class Rectangle 
{
    protected double length;
    protected double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() 
    {
        return length * width;
    }
}

class AreaRectangle extends Rectangle 
{
    public AreaRectangle(double length, double width) {
        super(length, width);
    }

    public void displayArea() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

public class area_of_rectangle {
    public static void main(String[] args) {
        AreaRectangle rect = new AreaRectangle(5.0, 3.0);
        rect.displayArea();
    }
}
