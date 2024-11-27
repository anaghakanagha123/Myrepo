package aggregationasmnt;

public class Address 
{
    private String place;
    private String streetname;
    private String hoseno;
    private Student stud;

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getStreetname() {
        return streetname;
    }
    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }
    public String getHoseno() {
        return hoseno;
    }
    public void setHoseno(String hoseno) {
        this.hoseno = hoseno;
    }
    public Student getStud() {
        return stud;
    }
    public void setStud(Student stud) {
        this.stud = stud;
    }
    public void displayDetails() {
  
        System.out.println("Student name: " + stud.getStdname());
        System.out.println("Student RollNo: " + stud.getStdroll());
        System.out.println("Student Address:");
        System.out.println("-----------------");
        System.out.println(getPlace() + ", " + getStreetname() + ", " + getHoseno());
    }

}
