package SS7.baitap1;

public abstract class Rectangle implements IResizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    @Override
    public void resize(double percent) {
        double oldArea = area();
        width *= (1 + percent/100);
        height *= (1 + percent/100);
        System.out.println("Rectangle area before resizing: " + oldArea/(1 + percent/100)/(1 + percent/100));
        System.out.println("Rectangle area after resizing: " + area());
    }
}
