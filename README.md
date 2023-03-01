# Examen Entornos de Desarrollo Curso 2022/23 (marzo)

## Objetivos que se van a valorar:

1. Desarrollo de Diagrama de Clases e implementación.
2. Desarrollo de Diagrama de Casos de Uso e implementación.
3. Control de Versiones (Git). Ramas. Pull Requests.
4. Principios SOLID.
5. Arquitectura: presentation, domain y data.
6. Patrones de Diseño: Repository y Singleton.

## Enunciado (Contexto)

Una entidad financiera nos pide informatizar su banco para ser más eficiente ante la competencia. El responsable del
departamento de informática se reune con nosotros y obtenemos la siguiente información:

- El banco trabaja principalmente con: clientes, cuentas bancarias, transacciones y productos bancarios.
  Además, se debe tener en cuenta los empleados del propio banco.
- De los clientes (customer) se trabaja con la siguiente información: dni, nombre, apellidos, dirección, población y
  código postal.
- Las cuentas bancarias (bank account) contiene: número cuenta, titular de la cuenta (cliente), transacciones, productos
  contratados y saldo.
- Las transacciones son los movimientos de entradas (ingresos) y salidas (pagos) de una cuenta bancaria. De los
  movimientos (movements) se almacena un código único por cada movimiento, descripción del movimiento e importe del
  movimiento. Si el importe es positivo se entiende que es un ingreso, sino, un pago.
- Los productos bancarios son definidos por el banco. Actualmente se tienen:
    - Hipoteca: es un producto del que se desea almacenar el código, nombre, descripción, fecha de inicio del préstamo,
      interés, fecha de fin del préstamo e importe prestado.
    - Plazo Fijo: es un producto donde el cliente ofrece al banco un dinero durante un tiempo estipulado y el banco le
      da un interés al cliente. Se desea almacenar: código del plazo, nombre, descripción, duración en meses del plazo,
      interés aplicado.
    - Tarjetas: es un producto del que se desea almacenar el código, nombre, descripción, fecha caducidad y número de la
      tarjeta.
- De los empleados se almacena el dni, nombre, apellidos y número de la seguridad social.

El banco realiza las siguiente acciones:

- Una persona puede abrir una cuenta bancaría. En el momento que la persona crea una cuenta bancaria, pasa a ser cliente
  del banco.
- Un cliente puede tener compras y gastos (transacciones) y se tiene que reflejar en la cuenta bancaria.
- Un cliente desea poder consultar los datos de su cuenta bancaria: transacciones realizadas, saldos, etc.
- Un cliente puede contratar productos del banco o no. Los productos van asociados a la cuenta bancaria.

## Ejercicios a realizar

### Transversal a todos los ejercicios

- Se deberá hacer un fork del proyecto y adjuntar la URL en la tarea abierta en el AulaVirtual.
- Todos los ejercicios deberán entregarse en una PR completando cada uno de los apartados. Si en alguno no se quiere
  añadir nada, se dejará en blanco.
- El ejercicio 1, 2, 3 y 4 deberán ser entregados antes de las 17:15h.
- Si la aplicación se cierra, al volverse a abrir podrá consultar la información que había metido anteriormente. Para
  ello, se almacenará en disco. Se adjunta una clase DemoFileLocalDataSource como ejemplo.
- El alumno deberá crear todas las clases de ficheros que crea oportuna y adaptarla a sus necesidades.
- El alumno podrá gestionar las ramas según sus necesidades.

### Ejercicio 1

En el desarrollo del software se distinguen cinco fases, ¿Cuales son? ¿Cómo las aplicarías en este examen?

### Ejercicio 2

Diseña el diagrama de clases.

### Ejercicio 3

Diseña el diagrama de caso de usos para la gestión de la cuenta, transacciones y productos bancarios.

### Ejercicio 4

Responde a la siguiente pregunta: ¿Qué son los principios SOLID? ¿Dónde lo aplicas en el proyecto? ¿Cuáles aplica?

### Ejercicio 5

Implementa en Java las siguientes funcionalidades:

- Crear una transacción de cobros.
- Crear una transacción de pagos.
- Crear un producto bancario: Hipoteca.
- Crear un cliente.
- Crear una cuenta bancaria. La cuenta irá asociada a un cliente. Deberá tener al menos dos transacciones y un producto
  contratado (hipoteca).
- Listar un cliente con su cuenta bancaria con las transacciones de esa cuenta y los productos contratados.

Nota: En algunos de los casos puede darse necesarios crear otros casos de uso como obtener, eliminar, modificar, etc.
