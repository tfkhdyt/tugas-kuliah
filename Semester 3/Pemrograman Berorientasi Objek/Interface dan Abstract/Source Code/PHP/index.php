<?php
error_reporting(E_ERROR | E_PARSE);
$interface = $_GET["interface"] || null;
$abstract = $_GET["abstract"] || null;
$_404 = $_GET["404"] || null;
?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Interface & Abstract pada PHP</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css" />
  <!--<link rel="stylesheet" href="dist/css/bootstrap.min.css" />-->
  <link rel="stylesheet" href="dist/css/style.css" />
  <link rel="stylesheet" href="dist/css/bg.css" />
  <link rel="icon" href="https://raw.githubusercontent.com/tfkhdyt/tfkhdyt-portfolio/main/assets/img/favicon.ico" />
</head>
<body style="background-color:<?php if ($_COOKIE["dark"] == "true") {
  echo "#000000";
} else {
  echo "#ffffff";
} ?>">
  <?php require "views/navbar.php"; ?>
  <?php if (isset($interface) || $_GET == null) {
    require "views/interface.php";
  } elseif (isset($abstract)) {
    require "views/abstract.php";
  } elseif (isset($_404)) {
    require "views/404.php";
  } ?>
  <script>
    const toggle = document.getElementById("flexSwitchCheckDefault");
    const navbar = document.getElementsByClassName("navbar")[0];
    const darkThemeLabel = document.querySelector(".form-check-label");
    const title = document.querySelector(".title");
    const btn = document.querySelectorAll("a.btn");
    const label = document.querySelectorAll("._label, span, input");
    const hr = document.querySelectorAll("hr");
    const form = document.querySelectorAll(".form-control, .input-group-text");
    const formGroup = document.querySelectorAll(".input-group-text");
    console.log();

    toggle.addEventListener("change", () => {
      if (toggle.checked) {
        document.cookie = "dark=true";
        navbar.classList.replace("navbar-light", "navbar-dark");
        navbar.classList.replace("bg-light", "bg-dark");
        darkThemeLabel.style.color = "#9B9D9E";
        title.className = "text-light";
        document.body.style.backgroundColor = "#141719";
        label.forEach((e) => e.style.color = "white");
        hr.forEach((e) => e.style.color = "white");
        form.forEach((e) => e.style.backgroundColor = "#737373");
        form.forEach((e) => e.style.borderColor = "#25272C");
        form[form.length - 2].style.backgroundColor = "#545454";
        formGroup.forEach((e) => e.style.backgroundColor = "#545454");
      } else {
        document.cookie = "dark=false";
        navbar.classList.replace("navbar-dark", "navbar-light");
        navbar.classList.replace("bg-dark", "bg-light");
        darkThemeLabel.style.color = "#707071";
        title.className = "text-dark";
        document.body.style.backgroundColor = "white";
        label.forEach((e) => e.style.color = "black");
        hr.forEach((e) => e.style.color = "black");
        form.forEach((e) => e.style.backgroundColor = "");
        form.forEach((e) => e.style.borderColor = "");
        form[form.length - 2].style.backgroundColor = "";
        formGroup.forEach((e) => e.style.backgroundColor = "");
      }
    });
  </script>
  <?php if ($_COOKIE["dark"] == "true") { ?>
    <script>
      navbar.classList.replace("navbar-light", "navbar-dark");
      navbar.classList.replace("bg-light", "bg-dark");
      title.className = "text-light";
      label.forEach((e) => e.style.color = "white");
      hr.forEach((e) => e.style.color = "white");
      document.body.style.backgroundColor = "#141719";
      form.forEach((e) => e.style.backgroundColor = "#737373");
      form.forEach((e) => e.style.borderColor = "#25272C");
      form[form.length - 2].style.backgroundColor = "#545454";
      formGroup.forEach((e) => e.style.backgroundColor = "#545454");
    </script>
    <?php } else { ?>
    <script>
      navbar.classList.replace("navbar-dark", "navbar-light");
      navbar.classList.replace("bg-dark", "bg-light");
      title.className = "text-dark";
      label.forEach((e) => e.style.color = "black");
      hr.forEach((e) => e.style.color = "black");
      document.body.style.backgroundColor = "white";
      form.forEach((e) => e.style.backgroundColor = "");
      form.forEach((e) => e.style.borderColor = "");
      form[form.length - 2].style.backgroundColor = "";
      formGroup.forEach((e) => e.style.backgroundColor = "");
    </script>
    <?php } ?>

  <script src="dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

