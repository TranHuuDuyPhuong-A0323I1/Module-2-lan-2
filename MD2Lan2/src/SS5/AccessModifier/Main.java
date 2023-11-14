package SS5.AccessModifier;

public class Main {
    public static void main(String[] args) {
        AccessModifier access_modifier=new AccessModifier();
        System.out.println(access_modifier.getRadius()+ " " +access_modifier.getArea());
        access_modifier.setRadius(3);
        System.out.println(access_modifier.getRadius()+ " " +access_modifier.getArea());
    }
}
