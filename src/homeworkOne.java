public class homeworkOne {
    public static void main(String[] args){
        // problem one (create a circle)
        double pi = 3.14;
        int random = (int)(Math.random() * 16)+1;
        double area = pi*(random^2);

        System.out.println("Circle area: " + area);

        // problem two (create a rect. prism and out put area)

        int width = (int)(Math.random() * 9) + 5;
        System.out.println(width);
        int length = width - 4;
        int height = width * 3;

        int volume = length * width * height;

        System.out.println("Rectangular prism volume: " + volume);


    }
}
