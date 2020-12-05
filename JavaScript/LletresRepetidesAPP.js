//Crear Array, añadir letras

var nombre = new Array;
var surname = new Array;

// Nom amb String

var nameinput = prompt("Escribe tu nombre:");
var surnameinput = prompt("Escribe tu apellido:");

// Convertir el nombre en una Array

for (var i = 0; i < nameinput.length; i++) {
    nombre.push(nameinput.charAt(i));
}

// Convertir el apellido en Array

for (var i = 0; i < surnameinput.length; i++) {
    surname.push(surnameinput.charAt(i));
}


// Fusionar las dos listas con un espacio en medio

var fullname = new Array;

nombre.forEach(letra =>
    fullname.push(letra));

fullname.push(' ');

surname.forEach(letra =>
    fullname.push(letra));

// Comprobar si son vocales, consonates y números
for (var i = 0; i < fullname.length; i++) {
    document.writeln(fullname[i], "<br/>");
    if (/[À-ú,a,e,i,o,u,A,E,I,O,U]/.test(fullname[i])) {
        document.writeln("VOCAL", "<br/>");

    } else if (/[1-9]/.test(fullname[i])) {
        document.writeln("Els noms de persones no contenen números!", "<br/>");
    } else if (fullname[i]==' '){
        //no hacer nada
    } else {
        document.writeln("CONSONANT", "<br/>");
    }
}

//Mapear letras nombre
		
var contadorletras = new Map;

for (let index = 0; index < fullname.length; index++) {

    if (/[A-zÀ-ú]/.test(fullname[index])){

        if (contadorletras.has(fullname[index].toUpperCase())){
            contadorletras.set(fullname[index].toUpperCase(), contadorletras.get(fullname[index].toUpperCase())+1);
        }else{
            contadorletras.set(fullname[index].toUpperCase(), 1);
        }

    }

}

contadorletras.forEach((key,value)=>{document.write(key,value,"</br>")});

