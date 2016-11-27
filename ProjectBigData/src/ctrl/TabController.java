
package ctrl;

/**
 * Created by Nelson on 11/27/2016.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import bean.Tab;


@ManagedBean
@SessionScoped
public class TabController {
    private List<Tab> tabs = null;
    private Tab selectedtab =null;
    
    @PostConstruct
    public void init(){
        if(tabs==null){
            tabs=new ArrayList<Tab>();
        }
        
        tabs.add(new Tab("Graph"));
        tabs.add(new Tab("Table"));
      
        
        if(selectedtab==null){
            selectedtab=tabs.get(0);
        }
        
    }
    

    public void doSelect(Tab t) {
        selectedtab = t;
      
        selectedtab.setContent(t.getTitle() +
                "This is the "+t.getTitle()+" <br/>" +
                "This is the "+t.getTitle()+" <br/>This is the "+t.getTitle()+" <br/>" +
                "This is the "+t.getTitle()+" <br/>This is the "+t.getTitle()+" <br/>" +
                "This is the "+t.getTitle()+" <br/>This is the "+t.getTitle()+" <br/>" +
                "This is the "+t.getTitle()+" <br/>This is the "+t.getTitle()+" <br/>" +
                "This is the "+t.getTitle()+" <br/>This is the "+t.getTitle()+" <br/>" +
                "This is the "+t.getTitle()+" <br/><br/><hr/>" + new Date());
    }
    

    public List<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public Tab getSelectedtab() {
        return selectedtab;
    }

    public void setSelectedtab(Tab selectedtab) {
        this.selectedtab = selectedtab;
    }
    
    
    
    
    
    
    
}