public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 53;
        int height = 160;
        float index = service.calculate(mass, height);
        System.out.println("Ваш индекс массы тела сoставляет: " + index);
    }
}
