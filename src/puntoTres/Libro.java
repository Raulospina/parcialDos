package puntoTres;

import java.util.Scanner;

public class Libro {
    static Scanner sn = new Scanner(System.in);

	public String titulo;
    public String autor;
	public int ISBN;
	 public int npaginas;

	   
   public Libro (String titulo, String autor, int ISBN, int npaginas) {
  this.titulo= titulo;
    this.autor= autor;
    this.ISBN = ISBN;
    this.npaginas = npaginas;
    	
    }



public String getTitulo () {
	System.out.println("ingrese el titulo");
	titulo = sn.nextLine();
    return titulo;
	}
public String getAutor() {
	System.out.println("ingrese el nombre de autor");
	autor = sn.nextLine();
    return autor;  
    
}
public int getISBN() {
	
	System.out.println("ingrese su codigo");
	ISBN = sn.nextInt();

	return ISBN;

}
public int getNpaginas () {
	
	System.out.println("ingrese el numero de paginas que desea tener");
	npaginas = sn.nextInt();

	return npaginas;

}

public static void main(String[] args) {
	Libro libro = new Libro (titulo, autor, ISBN, npaginas );
     System.out.println("	titulo " + libro.getTitulo());
     System.out.println("	autor " + libro.getAutor());

     System.out.println("	ISBN" + libro.getISBN());
     System.out.println("	numero de paginas" + libro.getNpaginas());

}






}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

