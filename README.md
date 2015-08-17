# jGTFS
Pequeña libreria Java para manipular la especificacion GTFS (Google Transit Feed Specification)

##Estado
Implementación inicial


##Motivación
[TODO]


##Detalles
[TODO]


##Ejemplo
```java
	//Configuracion de Reader (Parser) y Writer (Persitencia).
	//Pueden ser independientes, incluso crearse nuevos para persistencia en una BD p.e 
	String fuente = "pathAlDirectorio/";
	
	GTFSReader lectura = new GTFSFileReader(fuente);
	GTFSWriter escritura = new GTFSFileWriter(fuente);

	GTFS especificacion = new GTFS(lectura,escritura);
	
	especificacion.load();	//Recupera una especificacion existente

	//Modificaciones
	especificacion.getAgencys().get(0).setName("Nueva Linea de Micros");
	
	//Si la especificacion es válida tras los cambios, se regeneran los archivos
	if(especificacion.validate()){
		especificacion.save();
	}
```
