package com.musicshoppe2.controller;

import com.musicshoppe2.dao.ProductDao;
import com.musicshoppe2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by Marissa on 6/3/17.
 */

@Controller
public class HomeController {

    private ProductDao productDao=new ProductDao();

    @RequestMapping("/")
    public String home() {
        return "home";
    }



    @RequestMapping("/productList")
    public String getProducts(Model model) {  //function imports model parameter, which will be attached to view of
        List<Product> products=productDao.getProductList();

        model.addAttribute("product", products);  //In model, we attached products to model, gave it a name of products

        //List<Product> productList=productDao.getProductList();

        //Product product = productList.get(0);  //refer product to productList
       // model.addAttribute(product);  //bind product to model object
        return "productList"; //when we return productList, product will be attached to the view automatically

    }

    @RequestMapping("/productList/viewProduct/{productId}")  //productId is path variable
    public String viewProduct (@PathVariable String productId, Model model) throws IOException {  //takes in path variable as param,
        //passes it on to model so string will have content of productId

        Product product=productDao.getProductById(productId);  //will return a product given its Id
        model.addAttribute(product);
        return "viewProduct";

    }


}
