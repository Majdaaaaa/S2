<?php
require_once("connexion.php");
require_once("affiche_villes.php");
require_once("choix_dept.php");
?>
<!DOCTYPE html>

<head>
  <title> Villes </title>
  <meta charset="utf-8" />
</head>

<body>
  <?php
  $connexion = se_connecter();
  //affiche_villes_dept($connexion, "88");//EXO 5
  if (isset($_POST["dept"])) {
    affiche_villes_dept($connexion, $_POST["dept"]);
    echo "<br/><br/><h2> Autre requête: </h2>";
  } else
    echo "<h2> Requête: </h2>";
  ?>
  <form action="villes.php" method="post" enctype="multipart/form-data">
    <?php choix_dept($connexion); ?>
    <input type="submit" value="choisir" name="send">
  </form>
  <?php mysqli_close($connexion); ?>
</body>

</html>
