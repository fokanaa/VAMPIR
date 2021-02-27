public class Raznoe {
    public static void main(String[] args) {
        double a, b = 4.12;
        a = 22.1 + b;
        float pi = 3.14f; // При использовании типа float требуется указывать суффикс f или F
        // так как без них типом литерала будет считаться double
        float anotherPi = (float) 3.14; // Можно привести явно
        double c = 27;
        double d = pi * c;
        System.out.println(d);
    }
}
