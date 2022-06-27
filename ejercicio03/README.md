## Ejercicios-extraclase-03-2bim

* Generar una solución que permite administrar diferentes tipo de Arriendos.
* Usar el concepto de polimorfismo

### Problemática

Cada entidad (clase) arriendo debe tener las siguientes características: nombre arrendatario, pago arriendo mensual, cuota base

Existen diferentes tipos de arriendos

* Un tipo de arriendo: ArriendoLocalComida; que posee características particulares como: valorLuz, valorAgua, iva
  * Considerar: para el pago mensual de arriendo se debe operar la suma de valorLuz + valor Agua + cuota base; sacar
  el iva de la operación; para obtener el valor final

* Un tipo de arriendo: ArriendoLocalComercial; que posee características particulares como: valorAdicionalFijo.
  * Considerar: Para el pago mensual de arriendo se debe operar la suma de cuota base más valorAdicionalFijo.

* Un tipo de arriendo: ArriendoLocalSesiones; que posee características particulares como: valorSillas, valorAmplificacion
  * Para el pago mensual de arriendo se debe operar la suma de cuota base más valor de sillas y valor de amplificación.


### Importante:
