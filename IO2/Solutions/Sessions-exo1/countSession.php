<?php
session_start();

if (!isset($_SESSION['visites']))
  $_SESSION['visites'] = 1;
else
  $_SESSION['visites']++;

$nb = $_SESSION['visites'];

?>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Count Session</title>
</head>
<body>
<?php
if ($nb > 1000000) {
  echo '<h1>Félicitations !</h1>';
  echo "<h2>C'est la millionième fois que vous visitez cette page</h2>";
  echo "<h2>Pour vous remercier de votre fidélité, nous vous offrons un milliard
d'euros !</h2>";
 } else {
  echo '<h1>Bonjour,</h1>';
  echo "<h2>Vous avez visité cette page $nb fois</h2>";
 }
?>

<h3><a href="?">Visitez à nouveau cette page !</a></h3>

</body>
</html>
