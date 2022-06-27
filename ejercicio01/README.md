# ejercicios-extraclase-03-2bim

- Se necesita resolver la siguiente problemática. Se necesita administrar una gasolinera que quiere determinar el valor a cancelar por cada automóvil por llenar el tanque de gasolina o diésel. Para cada automóvil se necesita los siguientes atributos: nombres del propietario, placa, valor a cancelar.

- Los autos que usan gasolina tienen las siguientes características particulares: número de galones máximo del tanque, costo de cada galón, iva (valor fijo de 10%); el valor total a cancelar es igual a la siguiente operación: (costo x galón) * (número de galones) + el iva de ((costo x galón) * (número de galones)).

- Los autos que usan diésel tienen las siguientes características: número de litros máximo del tanque, costo de cada litro, descuento en litros (porcentaje de litros que no se deben cancelar); el valor total a cancelar es igual a la siguiente operación: (costo x litros (los litros ya restados del descuento)) .

- Generar un proceso que permita ingresar automóviles de acuerdo al tipo; el proceso debe terminar cuando el usuario lo disponga; se debe presentar el reporte de cada auto ingresado. Luego presentar el total de ventas ( la suma de los valores a cancelar por cada auto).

### Importante:
- Usar el concepto de Polimorfismo.
- Usar una estructura ArrayList para almacenar los autos.
