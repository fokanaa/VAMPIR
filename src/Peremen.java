import jdk.swing.interop.SwingInterOpUtils;

public class Peremen {
    public static void main(String[] args) {
                               // Типи перемінних
        byte b = 116; // Вот тут будет ошибка, т.к. у нас диапазон от -128 до 127!
        short s = 1123;
        int i = 64536;
        long l = 21473648l; // Постфикс l или L обозначает литералы типа long без ком
        float f = 2343443.33232f; // Вкінці ставимо f без ком
        double d = 336345354.3123123; // Без ком
        char ch = '5';
        char ch2 =5;
        boolean bl = true;
        boolean bl2 =false;
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
                                 //Оператори
           // Бінарні
        int a = b; // = Бінарний оператор
           // Унарний
        int i2 = - 100; // - Унарний оператор
        int i3 = +100; // + Унарний оператор
            // приклади
        int i4 = 100/2;          // получиться 50
        int i5 = 100/150;       // має бути 0.6666.. но програма видасть 0
        int i7 = (int)2.9999;     //всеодно получим 2 а не 3(округляє до меньшого)
        System.out.println(i7);
        System.out.println(Math.round(2.5)); // Math.round округляє до більшлго
        System.out.println(Math.round(2.4));




    }
}