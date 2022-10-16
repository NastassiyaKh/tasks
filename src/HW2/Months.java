package HW2;

public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int monthNumber;

    Months(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public static int getNumberByName(String name) {
        for (Months month : values()) {
            if (month.name().equals(name)) {
                return month.monthNumber;
            }
        }
        return -1;
    }

    public static String getNameByNumber(int number) {
        for (Months month : values()) {
            if (month.monthNumber == number) {
                return month.name();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getNameByNumber(10));
        System.out.println(getNumberByName("OCTOBER"));

    }
}
