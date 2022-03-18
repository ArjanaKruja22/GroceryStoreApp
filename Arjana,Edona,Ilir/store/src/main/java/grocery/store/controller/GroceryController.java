package grocery.store.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import grocery.store.service.GroceryService;

@RestController
public class GroceryController {
    @Autowired
    GroceryService groceryService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<Object> getData() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(groceryService.getData(), HttpStatus.OK);
    }

    @RequestMapping(value ="/products/update", method = RequestMethod.GET)
    public ResponseEntity<Object> updateArticle() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(groceryService.updateArticle(), HttpStatus.OK);
    }
}
