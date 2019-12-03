package movies;

public class Movie {
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    public String category;

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }



}


