import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ParseJson {
    private ToyStore toyStore;
    public ToyStore getToyStore(){return toyStore;}

    public ParseJson(String fileName){
        this.toyStore = new ToyStore();
        try{
            Gson gson = new Gson();
            Type store = new TypeToken<ToyStore>() {}.getType();
            this.toyStore=gson.fromJson(new FileReader(fileName),store);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
