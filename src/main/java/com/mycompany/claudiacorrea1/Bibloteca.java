/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claudiacorrea1;

/**
ay no ya no quiero alajskjalk
 */
public class Bibloteca implements Libro{

    static void Recursos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Recursos{
        private int id;
        private String titulo;
        private boolean disponible;
        
        public Recursos(int id, String titulo, boolean disponible){
            this.id = id;
            this.titulo = titulo;
            this.disponible = disponible;
        }
        interface Recurso{
            void agregar(String titulo);
        }
        class Recurso{
            private List<Recurso> recurses = new ArrqayList<>();
        
  
            void agregarRecurso(Recurso recurses){
                recurses.add(recursos);
            }
            void mostrarRecursos(int id){
            for (Recurso recurso : recursos){
                recurso.agregar(String titulo)
            }
        
            }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

        public int getId() {
            return id;
        }

        public String getTitulo() {
            return titulo;
        }

        public boolean isDisponible() {
            return disponible;
        }
        public String buscarRecursoPorTitulo(String titulo){
            
        
    }
    public class Libro extends Recursos{
        
        String autor;

        public Libro(int id, String titulo, boolean disponible) {
            super(id, titulo, disponible);
        }

        @Override
        public String toString() {
            return "Libro{" + "autor=" + autor + '}';
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }
    }
    public class Revista extends Recursos{
        int numero;
        
        public Revista(int id, String titulo, boolean disponible) {
            super(id, titulo, disponible);
        }
    

            public int getNumero() {
                return numero;
            }

            public void setNumero(int numero) {
                this.numero = numero;
            }

        @Override
        public String toString() {
            return "Revista{" + '}';
        }
        
        
        }

    }

