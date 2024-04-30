<?php
   function affiche_villes_dept($connexion, $dep){
     //on récupère le nom du département
     $req = "select name from departements where id = '$dep';" ;
     $resultat = mysqli_query ($connexion, $req ) ;
     $ligne=mysqli_fetch_assoc($resultat);
     echo "<h2>villes du département de ", $ligne["name"], "</h2>";

     //on récupère les villes
     $req = "select id, name from cities where departement_id = '$dep';" ;
     $resultat = mysqli_query ($connexion, $req ) ; 
     if(!$resultat){ 
        echo" requête incorrecte";
        echo mysqli_error($connexion);
     }
     else {
       echo "<table><tr><th> nom </th> <th> id </th>\n";
       while ($ligne=mysqli_fetch_assoc($resultat))
          echo "<tr><td>",$ligne['name'], "</td><td>", $ligne['id'], "</td></tr>\n";
     echo "</table>";	  
     }
     
     }
     ?>