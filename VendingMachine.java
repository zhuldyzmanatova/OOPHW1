import java.util.List;

public interface VendingMachine {

    void initProducts(List<Product> productLst);

    Product getProduct(String name);

}

// public class VendingMachine {
//     private List<Product> productList;

//     void initProduct(List<Product> a){
//         productList = a;
//     }

//     Product getProduct(String name){
//         for (int i = 0; i < productList.size(); i++){
//             if(name.equals(productList.get(i).getName())){
//                 return productList.get(i);
//             }
//         }
//         return null;
//     }
// }