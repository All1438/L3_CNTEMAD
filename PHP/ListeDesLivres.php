<?php
    $server = "localhost";
    $utilisateur = "admin";
    $motDePasse = "********";
    $baseDeDonnees = "nom_de_base";
    // Connexion à la base de données
    $connexion = mysql_connect($server, $utilisateur, $motDePasse, $baseDeDonnees);
    // Verification de la connexion
    if(!$connexion) {
        exit("La connexion a la base de données a échoué:" .mysql_connect_error());
        // exit("") || die("") = affiche un message d'erreur personalisé et arrêter l'execution du script
    }
    // Requête pour recuperer les livres
    $requete = "SELECT * FROM Livres";
    $resultat = mysql_query($requete);// mysql_query() = est utilisée pour executer des requête SQL
?>

<html>
    <head>
        <title>Liste des livres</title>
    </head>
    <body>
        <h1>Liste des Tables</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Auteur</th>
                <th>Année de Publication</th>
            </tr>
            <?php
            // Affichage des livres
                while($ligne = mysql_fetch_assoc($resultat)) { // mysql_fetch_assoc = recupére les lignes du résultat de la requête et la retourne sous forme de la tableau associatif
                    echo "<tr>";
                    echo "<td>" . $ligne['ID'] . "</td>";
                    echo "<td>" . $ligne['Title'] . "</td>";
                    echo "<td>" . $ligne['Auteur'] . "</td>";
                    echo "<td>" . $ligne['AnneePublication'] . "</td>";
                    echo "</tr>"
                }
            ?>
        </table>
    </body>
</html>
<?php
// Fermeture de la connexion
    mysql_close($connexion);
?>