<!DOCTYPE html>
<html>

<head>
  <title> Villes et villages des Vosges </title>
  <meta charset="utf-8" />
</head>

<body>
  <?php

  $connexion = mysqli_connect(
    "pams.script.univ-paris-diderot.fr",
    "ifagnot",
    "********",
    "ifagnot"
  );

  if (!$connexion) {
    echo "Pas de connexion au serveur ";
    exit;
  } else
    echo "connexion réussie! <br/> ";
  mysqli_set_charset($connexion, "utf8"); //pour que les caractères reçus soient codés en utf-8.
  $req = "select id, name from cities where departement_id = '88';";

  $resultat = mysqli_query($connexion, $req);
  if (!$resultat) {
    echo " requête incorrecte";
    echo mysqli_error($connexion);
  } else {
    while ($ligne = mysqli_fetch_assoc($resultat))
      echo $ligne['name'], " ", $ligne['id'], "<br/>";
  }
  ?>
</body>

</html>
