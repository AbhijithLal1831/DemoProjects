import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductService {
    List<Product> products= new ArrayList<>();
    public  void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getallproducts() {
        return products;
    }
    public Product getproduct(String name){
        for(Product P:products)
        {
            if(P.getName().equals(name))
                return P;
        }
        return null;
    }
    public Product getproductbyplace(String place){

        for(Product P:products)
        {
            if(P.getPlace().equals(place))
                return P;
        }
        return null;
    }

    public List<Product> getProductWithText(String text) {
        List<Product> Prods=new ArrayList<>();
        for(Product p:products) {
            if(p.getName().equals(text)||p.getPlace().equals(text)||p.getType().equals(text))
                Prods.add(p);
        }


return Prods;

    }
}
