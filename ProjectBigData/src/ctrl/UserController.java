package ctrl;

/**
 * Created by Nelson on 11/27/2016.
 */


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class UserController {
    private String data;
    private Map<String, String> items;

    @PostConstruct
    public void init() {
        items = new LinkedHashMap<String, String>();
        items.put("Data 1", "This is Data1 selected !! ");
        items.put("Data 2", "This is Data 2 selected in this case ");
        items.put("Data 3", "Data 3 has been selected ");
    }

    public void show() {
        System.out.println("Selected data :" + data);
    }

    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }


}