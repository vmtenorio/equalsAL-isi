# Ejercicio equals de AbstractList de Java
Hecho en un fichero de JUnit para poder ir probando los test que vaya realizando.

### Edge-pair coverage
RT = {[1,2], [1,3,4], [1,3,5], [3,5,6], [5,6,7], [5,6,11], [6,7,8], [7,8,9], [7,8,10], [8,10,6], [10,6,7], [10,6,11]}

### Prime Path
RT = {[1,2], [1,3,4], [1,3,5,6,11], [1,3,5,6,7,8,9], [1,3,4,5,6,7,8,10], [6,7,8,10,6], [7,8,10,6,7], [8,10,6,7,8], [10,6,7,8,10]}
Quedan todos cubiertos por los test ya realizados, por lo que no hace falta realizar más tests
