package com.ark.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public ModelAndView showProducts() {
        List<Product> products = productService.getAllProducts();
        Map<String, Object> params = new HashMap<>();
        params.put("products", products);
        return new ModelAndView("displayallproducts", params);
    }

    @RequestMapping("/products/{productCode}")
    public Product getProduct(@PathVariable String productCode) {
        return productService.getProduct(productCode);
    }

    @GetMapping("/addproduct")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addproducts";
    }
    @RequestMapping(method= RequestMethod.POST, value = "/addproduct")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "addedproduct";
    }
  /*  @PostMapping("/addproduct")
    public String greetingSubmit(@ModelAttribute Product product) {
        return "addedproduct";
    }*/

    @RequestMapping(method= RequestMethod.PUT,value = "/products/{productCode}")
    public void updateProduct(@RequestBody Product product, @PathVariable String productCode){
        productService.updateProduct(productCode,product);
    }

    @RequestMapping(method= RequestMethod.DELETE,value = "/products/{productCode}")
    public void deleteProduct(@PathVariable String productCode) {
        productService.deleteProduct(productCode);
    }
}
