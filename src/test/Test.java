
package test;

public class Test {

    public static void main(String[] args) {
        Triangle tria = new Triangle();
        System.out.println(tria);
        System.out.println("Area: " + tria.area());
        
        Triangle tri = new Triangle(5, 4);
        System.out.println(tri);
        System.out.println("Area: " + tri.area());
        
    }
    
}
