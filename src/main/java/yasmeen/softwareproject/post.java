package yasmeen.softwareproject;

import java.util.ArrayList;

public class post {
    String path;
    ArrayList<Integer>rates;
    String des;
    String prd;
    int id;
    public post(String pa,String prdname,String de,int id){
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

    public ArrayList<Integer> getRates() {
        return rates;
    }
}
