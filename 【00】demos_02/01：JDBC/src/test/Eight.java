package test;

import service.CountryService;

import java.util.ArrayList;
import java.util.HashMap;

public class Eight {
    public static void main(String[] args) {
        CountryService service = new CountryService();
        ArrayList<HashMap<String,String>> list = service.select8();
        for(HashMap<String,String> map:list){
            System.out.println(map.get("cname")  + "----" + map.get("sum"));
        }
    }
}
