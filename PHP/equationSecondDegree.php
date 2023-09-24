<html>
    <head>
        <title>Resolution d'une equation de second degrée</title>
    </head>
    <body>
        <!-- formulaire permet de connecter avec PHP -->
        <form action="" method="post"> 
            a<input type="text" name="a"><br>
            b<input type="text" name="b"><br>
            c<input type="text" name="c"><br>
            <input type="submit" value="Resoudre">
        </form>
        <?php
        if(isset($_POST["a"]) && isset($_POST["b"]) && isset($_POST["c"])) {
            $a = $_POST["a"]; // permet d'entrer la valeur entrer par l'utilisateur dans la variable $a
            $b = $_POST["b"];
            $c = $_POST["c"];
            function equationQuadratique($a, $b, $c){
                $delta = ($b * $b -4 * $a * $c);
                if($delta > 0){
                    $x1 = ((-$b + sqrt($delta)) / (2 * a));
                    $x2 = ((-$b - sqrt($delta)) / (2 * a));
                    return "Deux solutions réelles : x1 = $x1 , x2 = $x2";
                }
                else if($delta == 0){
                    $x = (-$b / (2 * $a));
                    return "Une solutions réelles double: x = $x";
                }
                else {
                    return "Pas de solution réel";
                }    
            }
            $resultat = equationQuadratique($a, $b, $c);
            echo "<p>Resultat: $resultat</p>"
        }
        ?>
    </body>
</html>