package com.prakash;

import javax.xml.ws.Endpoint;

import com.prakash.testmart.ProductCatalogImpl;

public class TestMartPublisher
{

    public static void main( String[] args )
    {
        Endpoint.publish( "http://localhost:8082/productCatalog", new ProductCatalogImpl() );
    }

}
