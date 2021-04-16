# Prueba Desarrollador CFA

Esta es una prueba tecnica de frontend y backend:

## 1. Construcción del servicio REST
El servicio REST esta desarrollado con Spring Boot 2.4.4 con las siguientes caracteristicas:  
#### Metodos implementados
**GET** para obtener datos de las ventas.  
**POST** para recibir los datos de una preventa (Id del producto, Cantidad del producto y Id de la preventa).  
**PUT** Para realizar actualizaciones sobre los datos de una venta ya realizada en la base de datos (se puede actualizar desde el Frontend el dato de lugar de despacho).  
**DELETE** Para borrar una venta ya realizada que se encuentre almacenada en la base de datos.  

## 2. Datos de entrada
El  Frontend cuenta con un formulario de ingreso con los siguientes campos:  
- Id del producto  
- Cantidad del producto  
- Id de la preventa  

## 3. Validación de datos de entrada
La validación se realizo en el Frontend en Angular con su libreria *Validaciones*.

## 4. Respuesta de la aplicación ante una venta
#### Venta Correcta
Si los datos de entrada corresponden adecuadamente y si se ingreso el id de un producto ofertado (ver tabla de productos), el servicio REST retorna un mensaje con la siguiente estructura:  
- Id de la factura  
- Costo individual del producto  
- Cantidad  
- Valor descontado  
- Lugar de despacho  

#### Venta incorrecta
Para simular una venta incorrecta el usuario puede ingresar un id de prodcuto que no se encuentre ofertado (ver tabla de productos), de esta manera se realiza la petición para tramitar un producto erroneo y al no encontrarlo el servicio REST retorna un mensaje indicando que **NO** es posible realizar la venta.

## 5. Registro de datos de las ventas en una base de datos
El servicio REST realiza el almacenamiento de los datos de una venta valida por medio de un mapeo ORM hacia la base de datos POSTGRESQL en Heroku.

## 6. Frontend y Backend
El desarrollo del Frontend se hizo en Angular 11.2.8.  
El repositorio con el código fuente desarrollado se encuentra disponible en:  
[https://github.com/YilberSN/CFABackEnd.git](https://github.com/YilberSN/CFABackEnd.git)  

El desarrollo del Backend se realizo en Spring Boot 2.4.4.  
El repositorio con el codigo fuente desarrollado se encuentra disponible en:  
[https://github.com/YilberSN/CRUDAngularFrontend.git](https://github.com/YilberSN/CRUDAngularFrontend.git)

## 7. Creación del proyecto
El IDE utilizado fue Spring Tool Suite 4 para el desarrollo del Backend y Visual Studio Code 1.55.2 para el desarrollo del Frontend.

## 8. Implementación Heroku

Backend disponible en:  
[https://yilber-prueba-cfa.herokuapp.com/](https://yilber-prueba-cfa.herokuapp.com/)

Front disponible en:  
[https://yilber-cfa-frontend.herokuapp.com/](https://yilber-cfa-frontend.herokuapp.com/listar)  


## 9. Vista previa del proyecto

#### Imagenes del Frontend
![image](https://drive.google.com/uc?export=view&id=1uXVwp4_HU_sE6DC7XCI-xU8cmbtcWL2n)  

![image](https://drive.google.com/uc?export=view&id=10-fPqhBPQ2kAn0XNeIFiyzPyvXcv8pH5)  


#### Imagenes respuesta Backend

![image](https://drive.google.com/uc?export=view&id=14LIMS24TqwIjet8iU56-S73tZ7IKjAt-)  

![image](https://drive.google.com/uc?export=view&id=1W3I1qLastQXqssqrJtsmZvJ6pHZCYyQJ)  


## 10. Autor
Yilber Serrano  
Ingeniero en Control  
yilber.serrano@gmail.com  
