//Crear Array, añadir letras

var nombre = new Array;

nombre.push('G');
nombre.push('e');
nombre.push('r');
nombre.push('a');
nombre.push('r');
nombre.push('d');
nombre.push('1');

// Comprobar si son vocales, consonates y números
for (var i = 0; i < nombre.length; i++) {
    document.writeln(nombre[i], "<br/>");
    if (/[À-ú,a,e,i,o,u,A,E,I,O,U]/.test(nombre[i])) {
        document.writeln("VOCAL", "<br/>");

    } else if (/[1-9]/.test(nombre[i])) {
        document.writeln("Els noms de persones no contenen números!", "<br/>");
    } else {
        document.writeln("CONSONANT", "<br/>");
    }
}

//Mapear letras nombre
		
var contadorletras = new Map;

for (let index = 0; index < nombre.length; index++) {

    if (/[A-zÀ-ú]/.test(nombre[index])){

        if (contadorletras.has(nombre[index].toUpperCase())){
            contadorletras.set(nombre[index].toUpperCase(), contadorletras.get(nombre[index].toUpperCase())+1);
        }else{
            contadorletras.set(nombre[index].toUpperCase(), 1);
        }

    }

}

contadorletras.forEach((key,value)=>{document.write(key,value,"</br>")});

