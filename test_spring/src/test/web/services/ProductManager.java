package test.web.services;
import java.io.Serializable;
import java.util.List;

import test.web.domain.Product;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}