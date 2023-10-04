import java.lang.invoke.StringConcatFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       ProductService service=new ProductService();
       service.addProduct(new Product("Asus Vivobook","laptop","Shop",2022));
        service.addProduct(new Product("Apple","laptop","Table",2021));
        service.addProduct(new Product("RealMe","Phone","Drawer",2017));
        service.addProduct(new Product("Samsaung","Phone","Table",2021));
        service.addProduct(new Product("Keyboard","Music Instrument","On_Stand",2010));
        service.addProduct(new Product("Television","Electronic Gadget","Black Table",2015));
        service.addProduct(new Product("Drimmer","HealthCare","Washroom",2015));
        service.addProduct(new Product("Polar","Tablefan","WhiteTable",2023));
        service.addProduct(new Product("Surya","IronBox","Table",2016));

List<Product> products=service.getallproducts();
//for(Product p:products) {
//    System.out.println(p);
//    System.out.println("=================================");
//}
        System.out.println("=================================");
//Product p=service.getproduct("Polar");
        //System.out.println(p);
//        Product white=service.getproductbyplace("Drawer");
        System.out.println(service.getproductbyplace("Drawer"));
//        System.out.println(white.getName());
List<Product> prods=service.getProductWithText("laptop");
        List<Product> prods1 = prods;
        for( Product prod :prods1)
            System.out.println(prods1);

        


    }
}