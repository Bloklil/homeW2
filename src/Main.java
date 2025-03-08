public class Main {

    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Задание 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println(" Общий вес двух бойцов " + totalWeight + " кг. ");
        System.out.println(" Разница в весе " + differenceWeight + " кг. ");

        System.out.println("Задание 7");
        var remains = weightBoxer2 - (Math.floor(weightBoxer2/weightBoxer1)*weightBoxer1);
        System.out.println(remains);

        System.out.println("Задание 8");
        var totalHours = 640;
        var pipleWorks = 8;
        var piple = totalHours / pipleWorks;
        System.out.println(" Всего в компании " +piple+ " рабочих ");
        var piple2 = piple + 94;
        var totalHours2 = piple2 *8;
        System.out.println(" ЕСли в компании работает " +piple2+ " рабочих, то всего " +totalHours2+ " часов работы может быть поделено между сотрудниками");




    }
}