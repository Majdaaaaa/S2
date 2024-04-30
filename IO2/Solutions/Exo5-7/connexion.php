<?php
function se_connecter(){
      $connexion = mysqli_connect ("pams.script.univ-paris-diderot.fr", 
     "ifagnot", "*******", "ifagnot" ) ;

     if (!$connexion) {
     echo "Pas de connexion au serveur " ; exit ;
     }
     else 
    // echo "connexion réussie! <br/> " ;
     mysqli_set_charset($connexion, "utf8"); //pour que les caractères reçus soient codés en utf-8.
     return $connexion;
     }
?>