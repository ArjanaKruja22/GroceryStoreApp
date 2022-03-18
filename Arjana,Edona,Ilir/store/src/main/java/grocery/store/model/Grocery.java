package grocery.store.model;
/* 
*This is a <b> Grocery Store </b>
*/

public class Grocery {
    private int ean_code;
    private String name;
    private int number;
    private int minimum;
    private double price;
    private int day;
    private int month;
    private int year;
    private boolean order;

    public Grocery(){};

    public Grocery(int ean_code,String name,int number, int minimum, double price, int day, int month, int year, boolean order ){
    this.ean_code = ean_code;
    this.name = name;
    this.number = number;
    this.minimum = minimum;
    this.price = price;
    this.day = day;
    this.month = month;
    this.year = year;
    this.order = order;
    }
    
    /** 
     * @return int
     */
    public int getEancode(){
        return ean_code;
    }
    
    /** 
     * @return String
     */
    public String getName(){
        return name;
    }
    
    /** 
     * @return int
     */
    public int getMinimum(){
        return number;
    }
    
    /** 
     * @return int
     */
    public int getNumber(){
        return minimum;
    }
    
    /** 
     * @return double
     */
    public double getPrice(){
        return price;
    }
    
    /** 
     * @return int
     */
    public int getDay(){
        return day;
    }
    
    /** 
     * @return int
     */
    public int getMonth(){
        return month;
    }
    
    /** 
     * @return int
     */
    public int getYear(){
        return year;
    }
    
    /** 
     * @return boolean
     */
    public boolean getOrder(){
        return order;
    }
    
    /** 
     * @param ean_code
     */
    public void setEancode(int ean_code){
        this.ean_code = ean_code;
    }
    
    /** 
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /** 
     * @param minimum
     */
    public void setMinimum(int minimum){
        this.minimum = minimum;
    }
    
    /** 
     * @param number
     */
    public void setNumber(int number){
        this.number = number;
    }
    
    /** 
     * @param price
     */
    public void setPrice(int price){
        this.price = price;
    }
    
    /** 
     * @param day
     */
    public void setDay(int day){
        this.day = day;
    }
    
    /** 
     * @param month
     */
    public void setMonth(int month){
        this.month = month;
    }
    
    /** 
     * @param year
     */
    public void setYear(int year){
        this.year = year;
    }
    
    /** 
     * @param order
     */
    public void setOrder(boolean order){
        this.order = order;
    }

}
