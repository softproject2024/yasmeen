package yasmeen.softwareproject;

import java.util.ArrayList;
import java.util.List;

public class Post {
    String path;
    List<Integer>rates;
    String des;
    String prd;
    int id;
    public Post(String pa, String prdname, String de, int id){
        path=pa;
        des=de;
        prd=prdname;
        this.id=id;
        rates=new ArrayList<>();

    }
    public int getrate(){

        int y=0;
        for (int i:rates){
            y+=i;
        }
        y=(y/rates.size());
        return y;
    }

    public List<Integer> getRates() {
        return rates;
    }
}
