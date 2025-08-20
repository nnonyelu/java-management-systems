class Book{

	private String title;
	private String author;
	private boolean isAvailable = true;
	private String ISBN;

	public Book(String title,String author, String ISBN){
	this.title=title;
	this.author=author;
	this.ISBN = ISBN;
	}

	public void setTitle(String title){
	this.title = title; 
	}
        
        public String getTitle(){
	return title;
	}
	
	public void setAuthor(String author){
         this.author=author;
	}

	public String getAuthor(){
	return author;
	}

	public void setIsAvailable(boolean isAvailable){
	this.isAvailable = isAvailable;
	}

	public boolean getIsAvailable(){
	return isAvailable;
	}

	public void setISBN(String ISBN){
	this.ISBN = ISBN;
	}

	public String getISBN(){
	return ISBN;
	}
	
	
        public void borrowBook(){
	if(isAvailable){

	 this.isAvailable = false;
	 System.out.println("You just borrowed : " + getTitle());
	}else{
           System.out.println(getTitle() + " is already borrowed");
          }
	}
	public void returnBook(){
         if(!isAvailable){
	this.isAvailable = true;
           System.out.println("You just returned : " + getTitle());

           }else{
          System.out.println(getTitle() + " is already returned"); 

            }
	}
	public void printBookInfo(){
         System.out.println("Book Title:" + title); 
	System.out.println("Available ?" + (isAvailable ? "Yes" : "No")); 
        System.out.println("ISBN "+ ISBN); 
        System.out.println("Author: " + author); 


	}




}