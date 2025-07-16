package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import models.Book;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> bookComparator = (b1, b2) -> {
        int tituloCompare = b2.getTitulo().compareToIgnoreCase(b1.getTitulo()); 
        if (tituloCompare != 0) return tituloCompare;

        int anioCompare = Integer.compare(b1.getAnio(), b2.getAnio()); 
        return anioCompare; 
    };

        Set<Book> libroOrdenado = new TreeSet<>(bookComparator);
        libroOrdenado.addAll(libros);
        return libroOrdenado;
    }
}