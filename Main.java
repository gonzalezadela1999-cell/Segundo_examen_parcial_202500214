public static void main(String[] args) {
    ListaDobleCircular lista = new ListaDobleCircular();
    
    try (Scanner sc = new Scanner(System.in)) { 
        int opcion, valor;

        do {
            System.out.println("\n--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar al inicio");
            System.out.println("4. Eliminar al final");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor: ");
                    valor = sc.nextInt();
                    lista.insertarAlInicio(valor);
                    lista.imprimir();
                    break;
                case 2:
                    System.out.print("Ingrese valor: ");
                    valor = sc.nextInt();
                    lista.insertarAlFinal(valor);
                    lista.imprimir();
                    break;
                case 3:
                    lista.eliminarAlInicio();
                    lista.imprimir();
                    break;
                case 4:
                    lista.eliminarAlFinal();
                    lista.imprimir();
                    break;
                case 5:
                    System.out.print("Valor a buscar: ");
                    valor = sc.nextInt();
                    if (lista.buscar(valor)) System.out.println("¡Encontrado!");
                    else System.out.println("No encontrado.");
                    break;
                case 6:
                    lista.imprimir();
                    break;
            }
        } while (opcion != 7);
    } 
}