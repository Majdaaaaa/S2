<?php
     function choix_dept($connexion){
        $req = "select id, name from departements;" ;
        $resultat = mysqli_query ($connexion, $req ) ; 
        if(!$resultat){ 
           echo" requête incorrecte";
           echo mysqli_error($connexion);
        }
        else {
       	   echo '<select name="dept" size="1>';
	   
           while ($ligne=mysqli_fetch_assoc($resultat))
              echo '<option value ="',$ligne['id'], '">',
	                 $ligne['name'], "</option>\n";
            echo '</select>';
	}
    }
?>