public class Box {
    private final int lenght;
    private final int width;
    private final int height;

    public Box(int lenght, int width, int height){
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public static String getBoxType(int lenght, int width, int height){
        String type = " ";
        if (lenght == width && lenght == height){
            type = "Коробка является кубом";
        }
        else if (height != 0){
            type = "Коробка является обычной коробкой";
        }
        else if (height == 0) {
            type = "Коробка является ковертом";
        };
        return type;
    }

    public static void main(String[] args) {
        System.out.println(getBoxType (1, 1, 0));
    }
}
