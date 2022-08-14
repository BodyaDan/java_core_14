package second;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        CommodityWork commodityWork = new CommodityWork();
        int n;
        while (true) {
            menu();
            n = scn.nextInt();
            switch (n) {
                case 1:
                    commodityWork.addCommodity();
                    break;
                case 2:
                    commodityWork.deleteCommodity();
                    break;
                case 3:
                    commodityWork.setCommodity();
                    break;
                case 4:
                    commodityWork.sortCommodities(1);
                    break;
                case 5:
                    commodityWork.sortCommodities(4);
                    break;
                case 6:
                    commodityWork.sortCommodities(3);
                    break;
                case 7:
                    commodityWork.sortCommodities(2);
                    break;
                case 8:
                    commodityWork.outElement();
                    break;
                case 9:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Щось, пішло не так!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n1 - Додати товар");
        System.out.println("2 - Видалити товар");
        System.out.println("3 - Замінити товар");
        System.out.println("4 - Сортувати за назвою");
        System.out.println("5 - Сортувати за довжиною");
        System.out.println("6 - Сортувати за шириною");
        System.out.println("7 - Сортувати за вагою");
        System.out.println("8 - Вивести і-тий елемент");
        System.out.println("9 - Завершити програму");
        System.out.print("Enter: ");
    }
}
