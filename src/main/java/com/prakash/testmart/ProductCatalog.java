package com.prakash.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.prakash.model.Product;

@WebService
public interface ProductCatalog
{

    @WebMethod( action = "fetch_categories", operationName = "fetchCategories" )
    List<String> getProductCategories();

    @WebMethod( exclude = true )
    List<String> getProducts( String category );

    @WebMethod( exclude = true )
    boolean addProduct( String category,
                        String product );

    @WebMethod
    @WebResult( name = "product" )
    List<Product> getProductsList( @WebParam( name = "category" ) String category );

}