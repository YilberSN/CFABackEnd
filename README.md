# Prueba Desarrollador CFA

Esta es una prueba tecnica de frontend y backend:

## 1. Construcción del servicio REST
El servicio REST esta desarrollado con Spring Boot 2.4.4 con las siguientes caracteristicas:  
#### Metodos implementados
**GET** para obtener datos de las ventas  
**POST** para recibir los datos de una preventa (Id del prodcuto, Cantidad del producto y Id de la preventa)  
**PUT** Para realizar actualizaciones sobre los datos de una venta ya realizada (se puede actualizar desde el Frontend el datos de lugar de despacho)  
**DELETE** Para borrar una venta ya realizada  

## 2. Datos de entrada
El  Frontend cuenta con un formulario de ingreso con los siguientes campos:  
Id del producto  
Cantidad del producto  
Id de la preventa  

## 3. Validación de datos de entrada
La validación se realizo en el Frontend con las Validaciones que ofrece Angular en su libreria.

## 4. Respuesta de la aplicación ante una venta
#### Venta Correcta
Si los datos de entrada corresponden adecuadamente y si se ingreso el id de un producto ofertado, el servicio REST retorna un mensaje con la siguiente estructura:  
Id de la factura  
Costo individual del producto  
Cantidad  
Valor descontado  
Lugar de despacho  
#### Venta incorrecta
Para simular una venta incorrecta el usuario puede ingresar un id de prodcuto que no se encuentre ofertado o en venta, de esta manera se realiza la petición para tramitar un producto erroneo y al no encontrarlo el servicio REST retorna un mensaje indicando que NO es posible realizar la venta.

## 5. Registro de datos de las ventas en una base de datos
El servicio REST realiza el almacenamiento de los datos de una venta valida por medio de un mapeo ORM hacia la base de datos.

## 6. Frontend y Backend
El desarrollo del Frontend se hizo en Angular.  
El repositorio con el codigo fuente desarrollado se encuentra disponible en:

El desarrollo del Backend se realizo en Spring Boot.  
El repositorio con el codigo fuente desarrollado se encuentra disponible en:


## 7. Creación del proyecto
Se utilizo el IDE utilizado fue Spring Tool Suite 4 para el desarrollo del Backend y Visual Studio Code para el desarrollo del Frontend.


## 8. Autor
Yilber Serrano  
Ingeniero en Control  
yilber.serrano@gmail.com  
