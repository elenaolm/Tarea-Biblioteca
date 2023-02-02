/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema6.Biblioteca;

/**
 *
 * @author Elena Oliva
 */
//Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
//Constructor por defecto.
//Constructor con parámetros.
//Métodos Setters/getters
//Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
//Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
//Método toString para mostrar los datos de los libros. 
//Escribe un programa para probar el funcionamiento de la clase Libro.
    public class Libro {
  private String titulo;
  private String autor;
  private int numEjemplares;
  private int numEjemplaresPrestados;

  // Constructor por defecto
  public Libro() {
    this.titulo = "";
    this.autor = "";
    this.numEjemplares = 0;
    this.numEjemplaresPrestados = 0;
  }

  // Constructor con parámetros
  public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
    this.titulo = titulo;
    this.autor = autor;
    this.numEjemplares = numEjemplares;
    this.numEjemplaresPrestados = numEjemplaresPrestados;
  }

  // Setters y getters
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumEjemplares() {
    return numEjemplares;
  }

  public void setNumEjemplares(int numEjemplares) {
    this.numEjemplares = numEjemplares;
  }

  public int getNumEjemplaresPrestados() {
    return numEjemplaresPrestados;
  }

  public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
    this.numEjemplaresPrestados = numEjemplaresPrestados;
  }

  // Método préstamo
  public boolean prestamo() {
    if (numEjemplaresPrestados < numEjemplares) {
      numEjemplaresPrestados++;
      return true;
    } else {
      return false;
    }
  }

  // Método devolución
  public boolean devolucion() {
    if (numEjemplaresPrestados > 0) {
      numEjemplaresPrestados--;
      return true;
    } else {
      return false;
    }
  }

  // Método toString
  @Override
  public String toString() {
    return "Título: " + titulo + ", Autor: " + autor + ", Número de ejemplares: " + numEjemplares + ", Número de ejemplares prestados: " + numEjemplaresPrestados;
  }
    
}
