public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }
    
    // Addition 1:
    // public boolean equals(Object obj) { 
    //     if(obj == null) return false; 
    //     if(obj == this) return true; 
    //     if(obj.getClass() != this.getClass()) return false; 
    //     return obj.title.equals(this.title) && obj.author.equals(this.author); 
    // }

    // Addition 2:
    // public boolean equals(Object obj) { 
    //     if(obj == null) return false; 
    //     if(obj == this) return true; 
    //     if(obj.getClass() != this.getClass()) return false; 
    //     return ((Book)obj).title.equals(this.title) && ((Book)obj).author.equals(this.author); 
    // }

    // Addition 3:
    // @Override
    // public boolean equals(Object obj) { 
    //     if(obj == null) return false; 
    //     if(obj == this) return true; 
    //     if(obj.getClass() != this.getClass()) return false; 
    //     return ((Book)obj).title.equals(this.title) && ((Book)obj).author.equals(this.author); 
    // }

    // Addition 4:
    // @Override 
    // public boolean equals(Book other) { 
    //     if(other == null) return false; 
    //     if(other == this) return true; 
    //     if(other.getClass() != this.getClass()) return false; 
    //     return other.title.equals(this.title) && other.author.equals(this.author); 
    // }

    // Addition 5:
    // public boolean equals(Book other) { 
    //     if(other == null) return false; 
    //     if(other == this) return true; 
    //     if(other.getClass() != this.getClass()) return false; 
    //     return other.title.equals(this.title) && other.author.equals(this.author); 
    // }
}
