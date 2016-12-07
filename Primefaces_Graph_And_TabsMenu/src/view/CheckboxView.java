package view;
  
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
 
@ManagedBean
public class CheckboxView {
 
    private String[] selectedConsoles;
    private String[] selectedConsoles2;
    private String[] selectedCities;
    private String[] selectedCities2;
    private List<String> cities;
    private List<SelectItem> cars;
    private String[] selectedCars;
 
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        cities.add("Brasilia");
        cities.add("Amsterdam");
 
        cars = new ArrayList<SelectItem>();
        SelectItemGroup germanCars = new SelectItemGroup("Options");
        germanCars.setSelectItems(new SelectItem[] {
            new SelectItem("ENTSO_e-load", "ENTSO_e-load"),
            new SelectItem("EEX_wind", "EEX_wind"),
            new SelectItem("EEX_solar", "EEX_solar"),
            new SelectItem("ENTSO_Germany", "ENTSO_Germany"),
            new SelectItem("ENTSO_France", "ENTSO_France"),
            new SelectItem("ENTSO_Netherlands", "ENTSO_Netherlands"),
            new SelectItem("ENTSO_Belgium", "ENTSO_Belgium"),
        });
         
        SelectItemGroup americanCars = new SelectItemGroup("Filters");
        americanCars.setSelectItems(new SelectItem[]{
            new SelectItem("Forecast", "Forecast"),
            new SelectItem("Actual", "Actual"),
             });
 
        cars.add(germanCars);
        cars.add(americanCars);
    }
 
    public String[] getSelectedConsoles() {
        return selectedConsoles;
    }
 
    public void setSelectedConsoles(String[] selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }
 
    public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
 
    public String[] getSelectedCities2() {
        return selectedCities;
    }
 
   
 
    public String[] getSelectedConsoles2() {
        return selectedConsoles2;
    }
 
    public void setSelectedConsoles2(String[] selectedConsoles2) {
        this.selectedConsoles2 = selectedConsoles2;
    }
 
    public List<String> getCities() {
        return cities;
    }
 
    public List<SelectItem> getCars() {
        return cars;
    }
 
    public void setCars(List<SelectItem> cars) {
        this.cars = cars;
    }
 
    public String[] getSelectedCars() {
        return selectedCars;
    }
 
    public void setSelectedCars(String[] selectedCars) {
        this.selectedCars = selectedCars;
    }
}