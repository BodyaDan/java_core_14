package second;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CommodityWork {
    Scanner scn = new Scanner(System.in);
    ArrayList<Commodity> commodities = new ArrayList<>();

    public void addCommodity() {
        String name;
        double w, l, m;
        System.out.print("Назва товару: ");
        name = scn.next();
        System.out.print("Ширина товару: ");
        w = scn.nextDouble();
        System.out.print("Довжина товару: ");
        l = scn.nextDouble();
        System.out.print("Вага товару: ");
        m = scn.nextDouble();
        commodities.add(new Commodity(name, w, l, m));
        System.out.println("Товар \n" + name + "\" був успішно створений! Його індекс - " + (commodities.size() - 1));
        System.out.println("Ось список тепер - ");
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void deleteCommodity() {
        System.out.println("Введіть індекс товару для видалення: ");
        int n = scn.nextInt();
        if ((n >= 0) && (n < commodities.size())) {
            System.out.println("Товар \"" + commodities.get(n).getName() + "\" був успішно видалений");
            commodities.remove(n);
            System.out.println("Ось список тепер - ");
            for (Commodity c : commodities) {
                System.out.println(c);
            }
        }
        else
            System.out.println("Ой, щось пішло не так, скоріш за все невірний індекс!");
    }

    public void setCommodity() {
        System.out.println("Введіть індекс товару для його заміни: ");
        int n = scn.nextInt();
        if ((n >= 0) && (n < commodities.size())) {
            System.out.println("Тепер введіть нові параметри товару - ");
            String name;
            double w, l, m;
            System.out.print("Назва товару: ");
            name = scn.next();
            System.out.print("Ширина товару: ");
            w = scn.nextDouble();
            System.out.print("Довжина товару: ");
            l = scn.nextDouble();
            System.out.print("Вага товару: ");
            m = scn.nextDouble();
            var tor = new Commodity(name, w, l, m);
            Commodity rpl = commodities.set(n, tor);
            System.out.println("Новий товар був успішно доданий на місце старого!");
            System.out.println("Дані про старий товар - ");
            System.out.println(rpl);
            System.out.println("Ось список тепер - ");
            for (Commodity c : commodities) {
                System.out.println(c);
            }
        }
        else
            System.out.println("Ой, щось пішло не так, скоріш за все невірний індекс!");
    }

    public void sortCommodities(int n) {
        commodities.sort(new Sorter(n));
        System.out.println("Успішно! Ось список тепер - ");
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void outElement() {
        System.out.println("Введіть індекс товару для його виводу: ");
        int n = scn.nextInt();
        if ((n >= 0) && (n < commodities.size())) {
            System.out.println(commodities.get(n));
        }
    }
}
