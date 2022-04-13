import Bank;

public class Branch{
    private String branch_code;
    private String City;
    private String State;
    private String zipcode;

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }
    public String getCity(){
        return this.branch_code;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity(){
        return this;
    }

    public void setState(String state) {
        this.state; = state;
    }
    public String getState(){
        return this.state;
    }

    public void setCity(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getZipcode(){
        return this.zipcode;
    }


    public void addBranch(String branch_code, String city, String state, String zipcode)
    {
        Branch branch = new Branch(branch_code, city, state, zipcode);
        branchers.add(branch);
    }
    public int getNumOfBranches(){
        return branchers.size();
    }
    public Branch getBranch(int index) {
        return branchers.get(index);
    }

    public Iterator<Branch> getBranchers(){
        return branchers.iterator();
    }
}