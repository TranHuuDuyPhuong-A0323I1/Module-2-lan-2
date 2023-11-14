package SS7.baitap1;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        // Generate an array of shapes (circles, rectangles, and squares)
        IResizeable[] shapes = new IResizeable[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean()) {
                shapes[i] = new Circle(random.nextInt(10) + 1) {};
            } else {
                shapes[i] = new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1) {};
            }
        }

        // Resize each shape in the array by a random percentage (1-100)
        for (IResizeable shape : shapes) {
            double percent = random.nextInt(100) + 1;
            shape.resize(percent);
        }
    }
}
