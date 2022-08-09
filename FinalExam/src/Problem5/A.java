package Problem5;

public class A {
    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getEllipse() {
        double x = 0.2;
        double y = 0.2;
        double total = this.a * x + this.b * y;

        String result = String.valueOf(this.a) + "X^2 + " + String.valueOf(this.b) + "Y^2 = " + total;
        return result;
    }
}
