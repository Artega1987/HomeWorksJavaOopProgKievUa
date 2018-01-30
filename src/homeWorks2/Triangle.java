package homeWorks2;

public class Triangle {

        double x;
        double y;
        double z;

    public Triangle( double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

    public double triangleArea() {
        double p = (x + y + z) / 2;
        double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
            return s;
        }
    }



