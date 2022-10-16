public class Box {
    private final int lenght;
    private final int width;
    private final int height;

    public Box(int lenght, int width, int height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public String getBoxType() {
        String type = " ";
        if (this.lenght == this.width && this.lenght == this.height) {
            type = "Коробка является кубом";
        } else if (this.height != 0) {
            type = "Коробка является обычной коробкой";
        } else {
            type = "Коробка является конвертом";
        }
        return type;
    }

    public static void main(String[] args) {
        Box box = new Box (1,1,0);
        System.out.println(box.getBoxType());
    }
}
