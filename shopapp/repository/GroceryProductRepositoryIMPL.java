package com.sda.javaAdvanced.shopapp.repository;

import com.sda.javaAdvanced.shopapp.model.GroceryProducts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroceryProductRepositoryIMPL extends SellableRepositoryIMPL<GroceryProducts> implements GroceryProductRepository {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    public GroceryProductRepositoryIMPL() {

        Path path = Paths.get("C:/Users/ilasd/OneDrive/Documents/SDA_JavaAdvenced/src/com/sda/javaAdvanced/shopapp/groceries.csv");
        try {
            Files.lines(path)
                    .skip(1)
                    .filter(item -> item != null)
                    .filter(item -> item.isEmpty())
                    .map(line -> {
                        try {
                            String[] array = line.split("\\|");
                            return new GroceryProducts(DATE_FORMAT.parse(array[5]), Boolean.parseBoolean(array[6]),
                                    array[7],
                                    Double.parseDouble(array[1]),
                                    array[2],
                                    array[3],
                                    array[4],
                                    array[0]
                            );
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    })
            .filter(groceryProduct -> groceryProduct != null)
            .forEach(groceryProduct -> add(groceryProduct));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
