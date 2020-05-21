
//class properties
public class book {
    private int retailPrice;
    private int  releaseDate;
    private String bookLocation;
    private String stocked;
    
    // Properties given contructors
    public book(int retailPrice, int releaseDate, String bookLocation, String stocked) {

        this.retailPrice = retailPrice;
        this.releaseDate = releaseDate;
        this.bookLocation = bookLocation;
        this.stocked = stocked;
    }

//Getters
public int getretailPrice(){
    return retailPrice;
}

public int getreleaseDate(){
    return releaseDate;
}
public String getbookLocation(){
    return bookLocation;
}
public String getstocked(){
    return stocked;
}


//setters

public void setretailPrice(int retailPrice){
    this.retailPrice = retailPrice;
}

public void setreleaseDate(int releaseDate){
    this.releaseDate = releaseDate;
}

public void setbookLocation (String bookLocation){
    this.bookLocation = bookLocation;
}

public void setstocked(String stocked){
    this.stocked = stocked;
}

@Override
public String toString(){
    return this.getreleaseDate() + " " + this.getstocked() + " " + this.getbookLocation() + " " + this.getretailPrice()
    }
}




