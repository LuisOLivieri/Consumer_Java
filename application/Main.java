package application;

import entities.PriceUpdate;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new PriceUpdate()); //PERCORRE A COLEÇÁO E EXECUTA UM CONSUMER PARA CADA ELEMENTO
        //list.forEach(Product::staticPriceUpdate); STATIC
        //list.forEach(Product::nonStaticPriceUpdate); NO STATIC
        //list.forEach(System.out::println); PRINT
        //list.forEach(p -> {p.setPrice(p.getPrice() * 1.1); IN LINE
        Consumer<Product> cons = p -> {p.setPrice(p.getPrice() * 1.1);};
        list.forEach(cons);
        list.forEach(System.out::println);

    }
}