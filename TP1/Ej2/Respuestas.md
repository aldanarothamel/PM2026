Punto a patrones utilizados: 
Singleton. Garantiza la existencia de una única instancia del administrador de impresoras en todo el ciclo de vida de la aplicación, 
centralizando el control y evitando colisiones entre múltiples manejadores concurrentes.  
Object Pool: Permite reutilizar instancias de objetos costosos o limitados (Impresora) en lugar de crearlos y destruirlos bajo demanda. 
Administra la disponibilidad asignando y recuperando los recursos con obtenerImpresora() y liberarImpresora().  

Punto c ¿A qué clase o instancia debe enviarse el mensaje para obtener el Pool?
El mensaje debe enviarse directamente a la clase PoolImpresoras invocando su método estático de acceso PoolImpresoras.getInstancia(). 
Al ser un método de clase (static), no se requiere una instancia previa para solicitarlo.
