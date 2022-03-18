package grocery.store.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;



public interface GroceryService{
    public abstract Object[] updateArticle();
    public abstract Collection<String[]> getData() throws FileNotFoundException, IOException;
}
