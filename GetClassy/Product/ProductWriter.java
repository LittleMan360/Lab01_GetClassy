import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductWriter
{

    public static void main(String[] args)
    {
        ArrayList<Product> ProductList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\ProductTestData.txt");


        boolean done;

        /*
        a. productID (a String)
        b. Name
        c. Description
        d. cost (a double)
         */


        //creates the variables
        String productID;
        String productName;
        String description;
        double cost;

        //creates the product
        do {

            productID = SafeInput.getNonZeroLenString(in,"Enter the product ID [6 digits]");
            productName = SafeInput.getNonZeroLenString(in,"Enter the product name");
            description = SafeInput.getNonZeroLenString(in,"Enter the description");
            cost = SafeInput.getDouble(in,"Enter the cost ");

            Product productInput = new Product(productID, productName, description, cost);
            ProductList.add(productInput);

            done = SafeInput.getYNConfirm(in, "Are you done?" );
        }while(!done);

        //writes the file
        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(Product rec : ProductList)
            {
                writer.write(rec.toCSVRecordMethod(), 0, rec.toCSVRecordMethod().length());
                // 0 is where to start (1st char) to write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}