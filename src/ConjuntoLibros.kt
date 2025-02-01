class ConjuntoLibros(val capacidadMaxima: Int) {
    private val libros: Array<Libro?> = arrayOfNulls(capacidadMaxima)

    fun agregarLibro(libro: Libro): Boolean {
        for (i in libros.indices) {
            if (libros[i] == null) {
                libros[i] = libro
                return true
            }
        }
        return false
    }

    fun eliminarLibroPorTitulo(titulo: String): Boolean {
        for (i in libros.indices) {
            if (libros[i]?.titulo == titulo) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun eliminarLibroPorAutor(autor: String): Boolean {
        for (i in libros.indices) {
            if (libros[i]?.autor == autor) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun mostrarLibroMayorCalificacion() {
        var libroMayorCalificacion: Libro? = null
        for (libro in libros) {
            if (libro != null && (libroMayorCalificacion == null || libro.calificacion > libroMayorCalificacion.calificacion)) {
                libroMayorCalificacion = libro
            }
        }
        if (libroMayorCalificacion != null) {
            println("Libro con mayor calificación: $libroMayorCalificacion")
        } else {
            println("No hay libros en el conjunto.")
        }
    }

    fun mostrarLibroMenorCalificacion() {
        var libroMenorCalificacion: Libro? = null
        for (libro in libros) {
            if (libro != null && (libroMenorCalificacion == null || libro.calificacion < libroMenorCalificacion.calificacion)) {
                libroMenorCalificacion = libro
            }
        }
        if (libroMenorCalificacion != null) {
            println("Libro con menor calificación: $libroMenorCalificacion")
        } else {
            println("No hay libros en el conjunto.")
        }
    }

    fun mostrarContenido() {
        println("Contenido del conjunto de libros:")
        for (libro in libros) {
            if (libro != null) {
                println(libro)
            }
        }
    }
}