import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TXTReceiptBuilder implements IReceiptBuilder {

    StringBuilder sb = new StringBuilder();

    @Override
    public void appendHeader(String header) {
        sb.append(header).append("\n");
    }

    @Override
    public void appendCustomer(CustomerModel customer) {
        sb.append("Customer ID: ").append(customer.mCustomerID).append("\n");
        sb.append("Customer Name: ").append(customer.mName).append("\n");
    }

    @Override
    public void appendProduct(ProductModel product) {
        sb.append("Product ID: ").append(product.mProductID).append("\n");
        sb.append("Product Name: ").append(product.mName).append("\n");
    }

    @Override
    public void appendPurchase(PurchaseModel purchase) {
        sb.append("Purchase ID: ").append(purchase.mPurchaseID).append("\n");
    }

    @Override
    public void appendFooter(String footer) {
        sb.append(footer).append("\n");
    }

    public void showMeTheMoney(StringBuilder sb) {
        System.out.println(sb);
    }

    public void printSb(StringBuilder sb) {
        try {
            File file = new File("TESTING.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append(sb);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
