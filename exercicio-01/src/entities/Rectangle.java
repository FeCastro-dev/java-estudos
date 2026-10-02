public class Rectangle {
    
    double width;
    double height;

    double area () {
        return width * height;
    }
    double perimeter () {
        return 2 * (width + height);
    }
    double diagonal () {
        return Math.sqrt((width * width) + (height * height));
    }
}