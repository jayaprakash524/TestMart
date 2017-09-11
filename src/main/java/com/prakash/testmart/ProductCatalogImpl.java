package com.prakash.testmart;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.prakash.model.Product;
import com.prakash.service.ProductService;

@WebService( endpointInterface = "com.prakash.testmart.ProductCatalog", name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService", targetNamespace = "http://www.testmart.com" )
public class ProductCatalogImpl implements ProductCatalog
{
    ProductService productService = new ProductService();

    @Override
    public List<String> getProductCategories()
    {
        return productService.getProductCategories();
    }

    @Override
    public List<String> getProducts( String category )
    {
        return productService.getProducts( category );
    }

    @Override
    public boolean addProduct( String category,
                               String product )
    {
        return productService.addProduct( category, product );
    }

    @Override
    public List<Product> getProductsList( String category )
    {
        List<Product> productList = new ArrayList<Product>();
        productList.add( new Product( "Java", "1234", 1233.00 ) );
        productList.add( new Product( "Advanced Java", "1235", 1499.79 ) );
        return productList;
    }
}
