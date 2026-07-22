# 📚 Biblioteca

Sistema de gestión de biblioteca desarrollado en **Java** como parte de mi proceso de aprendizaje en Programación Orientada a Objetos.

El objetivo de este proyecto fue comenzar a desarrollar aplicaciones completas mientras aprendo Java, aplicando los conceptos en un proyecto real en lugar de limitarme únicamente a realizar ejercicios aislados.

---

## 🚀 Funcionalidades

### 📖 Gestión de libros

- Agregar libros.
- Mostrar todos los libros.
- Buscar libros por ID.
- Modificar el autor de un libro.
- Eliminar libros.

### 👤 Gestión de personas

- Agregar personas.
- Mostrar todas las personas.
- Buscar personas por ID.
- Eliminar personas.

### 📚 Gestión de préstamos

- Prestar libros.
- Buscar préstamos activos.
- Devolver libros.
- Evitar prestar un libro que ya se encuentra prestado.

---

## 🛠️ Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- IntelliJ IDEA
- Git
- GitHub

---

## 📖 Conceptos aplicados

Durante el desarrollo del proyecto trabajé con conceptos como:

- Clases y objetos.
- Encapsulamiento.
- Constructores.
- Composición entre clases.
- Colecciones (`ArrayList`).
- Reutilización de métodos.
- Separación de responsabilidades.
- Refactorización del código.

---

## 💡 Aprendizajes

Este proyecto representó mi primer contacto práctico con la Programación Orientada a Objetos.

Mi objetivo no fue dominar todos los conceptos de POO, sino comenzar a comprender sus fundamentos aplicándolos en un proyecto funcional.

Uno de los mayores desafíos fue diseñar la relación entre las clases. En particular, comprender que un préstamo debía estar compuesto por un objeto `Libro` y un objeto `Persona`, en lugar de almacenar únicamente sus identificadores.

Otra decisión importante fue centralizar la gestión de los identificadores dentro de la clase `Biblioteca`, dejando que fuera ella quien administrara la creación de libros y personas.

Durante el desarrollo también refactoricé el programa para mantener un `Main` limpio y organizado, separando cada opción del menú en funciones específicas para mejorar la legibilidad y el mantenimiento del código.

Más allá de que el proyecto funciona correctamente, el principal objetivo fue comprender el porqué de cada decisión de diseño antes que simplemente hacer que el programa funcionara.

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio.

```bash
git clone https://github.com/TLocatelli/Biblioteca.git
```

2. Abrir el proyecto con IntelliJ IDEA (o cualquier IDE compatible con Java).

3. Ejecutar la clase `Main`.

---

## 📈 Próximos pasos

Continuar desarrollando proyectos de mayor complejidad para seguir profundizando en Java y en Programación Orientada a Objetos, incorporando nuevos conceptos y mejores prácticas de desarrollo.

---

## 👨‍💻 Autor

Desarrollado por **Thiago Locatelli** como parte de mi proceso de aprendizaje y construcción de un portfolio de proyectos.
