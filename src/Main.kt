fun main() {
    // Crear un conjunto de libros con capacidad máxima de 5
    val conjuntoLibros = ConjuntoLibros(5)

    // Crear dos libros
    val libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", 432, 9)
    val libro2 = Libro("1984", "George Orwell", 328, 10)

    // Añadir los libros al conjunto
    conjuntoLibros.agregarLibro(libro1)
    conjuntoLibros.agregarLibro(libro2)

    // Mostrar el contenido del conjunto
    conjuntoLibros.mostrarContenido()

    // Mostrar el libro con mayor y menor calificación
    conjuntoLibros.mostrarLibroMayorCalificacion()
    conjuntoLibros.mostrarLibroMenorCalificacion()

    // Eliminar un libro por título
    println("\nEliminando libro por título '1984'...")
    if (conjuntoLibros.eliminarLibroPorTitulo("1984")) {
        println("Libro eliminado correctamente.")
    } else {
        println("No se encontró el libro con ese título.")
    }

    // Mostrar el contenido del conjunto después de eliminar
    conjuntoLibros.mostrarContenido()

    // Eliminar un libro por autor
    println("\nEliminando libro por autor 'Gabriel García Márquez'...")
    if (conjuntoLibros.eliminarLibroPorAutor("Gabriel García Márquez")) {
        println("Libro eliminado correctamente.")
    } else {
        println("No se encontró el libro con ese autor.")
    }

    // Mostrar el contenido del conjunto después de eliminar
    conjuntoLibros.mostrarContenido()

    // Volver a añadir un libro
    val libro3 = Libro("El Principito", "Antoine de Saint-Exupéry", 96, 8)
    println("\nAñadiendo nuevo libro 'El Principito'...")
    if (conjuntoLibros.agregarLibro(libro3)) {
        println("Libro añadido correctamente.")
    } else {
        println("No se pudo añadir el libro. El conjunto está lleno.")
    }

    // Mostrar el contenido final del conjunto
    conjuntoLibros.mostrarContenido()
}