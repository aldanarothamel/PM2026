Punto b:
Caso Simple: Venta con una única forma de pago

Algoritmo pagarVentaSimple(venta)
    Si venta.estado == PAGADA Entonces
        LanzarError "La venta ya está pagada"
    FinSi

    // Se delega a la estrategia seleccionada
    venta.formaDePago.procesarPago(venta.total)
    venta.estado <- PAGADA
FinAlgoritmo


Detalle de cada caso en el adaptador:
1. Caso Transferencia:
Metodo procesarPago(importe)
    Banco.transferir(this.cbuOrigen, importe)
FinMetodo
2. Caso Tarjeta:
Metodo procesarPago(importe)
    Tarjeta.cobrar(this.nombreTarjeta, this.numero, this.digitos, importe)
FinMetodo
3. Caso PayPal:
Metodo procesarPago(importe)
    PayPal.cobrar(this.usuario, importe)
FinMetodo
