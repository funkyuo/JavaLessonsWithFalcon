public class Lesson8Task1 {

    public static void main(String[] args) {
        Counter loop = new Counter("Счетчик цикла", 1);
        Counter even = new Counter("Четные числа");
        Counter odd = new Counter("Нечетные числа");
        while (loop.counter <= 100) {
            switch (loop.counter % 2) {
                case 0:
                    even.counter++;
                    break;
                case 1:
                    odd.counter++;
                    break;
            }
            loop.counter++;
        }
        //создать отдельный метод для вывода в консоль
        System.out.println(even.name + " : " + even.counter);
        System.out.println(odd.name + " : " + odd.counter);
    }
}


