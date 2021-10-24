<?php
// error_reporting(E_ERROR | E_PARSE);
$interface = $_GET["interface"];
$abstract = $_GET["abstract"];
?>
<nav class="navbar navbar-expand-md navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="?interface">
      <img src="https://tfkhdyt.my.id/assets/img/profile-img.jpg" class="rounded-circle mx-2 d-inline-block align-text-top" width="30" />
      Interface & Abstract
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-md-0">
        <li class="nav-item">
          <a class="nav-link
            <?php if (isset($interface) || $_GET == null) {
              echo "active";
            } ?>" aria-current="page" href="/?interface"><i class="fas fa-user-circle"></i> Interface</a>
        </li>
        <li class="nav-item">
          <a class="nav-link
            <?php if (isset($abstract)) {
              echo "active";
            } ?>" href="/?abstract"><i class="fab fa-artstation"></i> Abstract</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="https://tfkhdyt.my.id/" target="_blank"><i class="fas fa-user"></i> About Me</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="https://github.com/tfkhdyt/tugas-kuliah/tree/main/Semester%203/Pemrograman%20Berorientasi%20Objek/Encapsulation/Source%20Code/PHP" target="_blank"><i class="fas fa-code"></i> Source Code</a>
        </li>
        <li class="nav-item">
          <div class="form-check form-switch mt-2">
            <label class="form-check-label" for="flexSwitchCheckDefault" style="color: <?= $_COOKIE[
              "dark"
            ] == "true"
              ? "#9B9D9E"
              : "#707071" ?>;">Dark Theme</label>
            <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" <?php if (
              $_COOKIE["dark"] == "true"
            ) {
              echo "checked";
            } ?>>
          </div>
        </li>
      </ul>
    </div>
  </div>
</nav>
