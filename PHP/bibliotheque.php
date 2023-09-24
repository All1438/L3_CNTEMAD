CREATE DATABASE bibliotheque;<!-- Permet de créer une nouvelle base de données -->
USE bibliotheque;<!-- Permet de séléctionner la base de données en tant que base de donnée actine -->

CREATE TABLE Livre(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    auteur VARCHAR(50) NOT NULL,
    nombrePage INTEGER NOT NULL,
    nombreExemplaire INTEGER NOT NULL
);

<!-- Creation du formulaire HTML -->
<html>
    <head>
        <title>Gère la bibliotheque</title>
    </head>
    <body>
        <h1>Gère la bibliotheque</h1>
        <form action="ajouter_livre.php" method="post">
            <!-- action='ajouter_livre.php' = gère l'insertion des données dens formulaires dans la bade données -->
            Title: <input type="text" name="title"><br>
            Auteur: <input type="text" name="auteur"> <br>
            Nombre de Page: <input type="number" name="page"> <br>
            Nombre d'exemplaire: <input type="number" name="exemplaire"> <br>
            <input type="submit" value="Envoyer">
        </form>
    </body>
</html>

<?php
// connexion a la base de données
$serveur = "localhost";
$utilisateur = "admin";
$motDePasse = "mot_de_passe";
$baseDeDonnees = "nom_BD";
$connexion = mysql_connect($serveur, $utilisateur, $motDePasse, $baseDeDonnees);
if(!connexion){
    exit("La connexion a la base de données est échoué" . mysql_connect_error);
}
// recupère les données de formulaire
$title = $_POST['title'];
$auteur = $_POST['auteur'];
$nbrPage = $_POST['page'];
$nbrExemplaire = $_POST['exemplaire'];
// requête d'insertion dans la base de données
$insertion = "INSERT INTO Livre(title, auteur, nombrePage, nombreExemplaire)
                VALUES($title, $auteur, $nbrPage, $nbrExemplaire)";
if(sql_query($connexion, $insertion)){
    echo "Livre ajouter avec succes";
} else {
    echo "Erreur lors de l'ajout du livre:" .mysql_error($connexion);
}
// Fermeture de la connexion
mysql_close($connexion);
?>