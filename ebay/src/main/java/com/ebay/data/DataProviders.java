package com.ebay.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "searchData")
    public Object[] getSearchData(){
        return  new Object[] {"Core Java Books","Selenium Books","Data Structure Books"};
    }
    @DataProvider(name = "credentials")
    public Object [][] getCredentials(){
        return  new Object[][]{{"hamzacherfaoui32@gmail.com","helloworld65"},{"hamzacherfaoui32@gmail.com","helloworld78"},{"hamzacherfaoui32@gmail.com","helloworld6321"}};
    }
}
