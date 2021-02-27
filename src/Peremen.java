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
        String str ="string1";
        str = "string2"
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
        System.out.println(Math.round(2.5)); // Math.round округляє до більшлго .буде 3
        System.out.println(Math.round(2.4)); // буде 2
        float f10 = 100f/150;
        System.out.println(f10);// float працює з дробами і виведе 0.666
        int p1 = 10;
        p1 = p1 + 10;
        p1 +=10;
        p1 -=10;
        p1 *=10;
        p1 /=10;
//_______________________________________________ Інкремен (++)
        int p2 = 100;
                           // ++    p2 = p2+1,p2+=1
                          //____________________Посфиксний Инкримент
        int p3 = 100;
        int p4 = p3++;//получим 100.++ працює після главної задачі p4=p3 а потім вже p3=p3+1
                       //__________________Префиксные Инкрименты
        int o1 = 100;
        int p5 = ++o1;// получимо 101, ++ тут працю э до главної задачі p4 = (o1=o1+1)

        int z = 100;
        int x = ++z;
        System.out.println(z++);// z = 101 так як тут ++ посфиксний,но дальше z буду вже =102
//_______________________________Дикримент (--)
        int c = 100;
        a = c--;// 100
        a =--c;// 99
        //_____________________________ЛОГИЧЕСКИЕ ОПЕРАТОРЫ   ==,>,<,>=,<=,!=, &&
        boolean result0 =100==100;//true
        boolean result1 = 100 == 99;//false


        int res1 = 100;
        int res2 =99;

        boolean result2 = res1==res2;//false
        boolean result3 = res1>res2;//true
        boolean result4 = res1<res2;//false
        boolean result5 = res1 != res2;//true(не ровно)
                                  //логический оператор амперсаннд
        boolean tt =true;
        boolean ff=false;
        boolean result6=tt&&ff;








    }
}