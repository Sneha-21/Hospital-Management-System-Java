public class Medicines {
    private String name;
    private String company;
    private int cost;
    private int count;

    public Medicines(String name, String company, int cost, int count) {
        this.name = name;
        this.company = company;
        this.cost = cost;
        this.count = count;
    }

     @Override
    public String toString() {
        return "\nName    : " + name +
               "\nCompany : " + company +
               "\nCost    : " + cost +
               "\nCount   : " + count; 
    } 
    
}
