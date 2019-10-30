package data.REST;

import rest.API;
/**
 * Class to provide specific locations to the REST API
 * PROJ-217
 * Author: James Defant
 * Date: Oct 25 2019
 */
public class ProductSupplierData implements data.ProductSupplierData {
    @Override
    public String getProductSupplier(int productSupplierId) {

        // Call the API
        return API.getJson(Constants.URL + "/productsupplier/getproductsupplier/" + productSupplierId);    }

    @Override
    public String getAllProductSuppliers() {

        // Call the API
        return API.getJson(Constants.URL + "/productsupplier/getallproductsuppliers");    }

    @Override
    public String insertProductSupplier(String jsonData) {

        // Send data to the API and return message
        return API.putJson(Constants.URL + "/productsupplier/insertproductsupplier", jsonData);
    }

    @Override
    public String updateProductSupplier(String jsonData) {

        // Send data to the API and return message
        return API.postJson(Constants.URL + "/productsupplier/updateproductsupplier", jsonData);
    }

    @Override
    public String deleteProductSupplier(int productSupplierId) {

        // Send data to the API and return message
        return API.deleteJson(Constants.URL + "/productsupplier/deleteproductsupplier/" + productSupplierId);
    }
}
