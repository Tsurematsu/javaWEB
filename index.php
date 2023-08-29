<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>hello</h1>
    <?php

    try {
        // Ejecutamos el comando 
        $output = shell_exec('java -version');

        // Mostramos el resultado
        echo "Salida del comando: <br>";
        echo $output;

        // Verificamos si java está instalado
        if (strpos($output, 'java version') !== FALSE) {
            echo "<br>Java está instalado!";
        } else {
            echo "<br>Java NO está instalado";
        } //code...
    } catch (\Throwable $th) {
        echo "error de documento";
    }

    ?>
</body>

</html>