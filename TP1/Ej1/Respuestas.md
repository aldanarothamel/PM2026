Punto a: Se seleccionó el patrón State porque el comportamiento del objeto Pedido varía sustancialmente según su ciclo de vida (Abierto, Cerrado, Entregado). 
Encapsular cada estado en una clase propia respeta el principio de Responsabilidad Única (SRP) y Abierto/Cerrado (OCP), 
evitando sentencias if-else o switch sobre una propiedad de tipo enum o string.  
Punto c: Para incorporar la reapertura de pedidos, se agrega el método reabrir(Pedido pedido) en la interfaz EstadoPedido. 
En Cerrado, este método transiciona el pedido asignándole una nueva instancia de Abierto (pedido.setEstado(new Abierto())). 
En Abierto y Entregado, el método arroja una excepción indicando que la operación no es válida para ese estado. 
