
package test;


public class Triangle {
    private double base;
    private double hight;
    
    public Triangle() {
        
    }

    public Triangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }
    
    public double area() {
        return this.base * this.hight/2;
    
}

    @Override
    public String toString(){
        return "Base: " + base + " Higth: " + hight + " Area: " + area();
    }
    
}