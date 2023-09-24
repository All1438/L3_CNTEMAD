<html>
    <head>
        <title>Factorielle</title>
    </head>
    <body>
        <h1>Calcul de la factorielle</h1>
        <form action="" method="post">
            Entrer un nombre: <input type="number" name="nombre">
            <input type="submit" value="Calculer">
        </form>
        <?php 
        function factorielle($n) {
            if($n == 0 || $n == 1){
                return 1;
            } else {
                $factoriel = ($n * factorielle($n - 1));
                return $factoriel;
            }
        }
        if(isset($_POST["nombre"])){
            $nombre = $_POST["nombre"];
            $resultat = factorielle($nombre);
            echo "La factorielle de $nombre est $resultat"
        }
        ?>
    </body>
</html>