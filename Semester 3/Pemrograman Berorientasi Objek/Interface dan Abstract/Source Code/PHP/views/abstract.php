<?php
abstract class BangunRuang {
  abstract function getVolume();
}

class Kubus extends BangunRuang {
  private $sisi;

  public function __construct($sisi) {
    $this->sisi = $sisi;
  }

  public function getVolume() {
    return pow($this->sisi, 3);
  }
}

class Balok extends BangunRuang {
  private $panjang, $lebar, $tinggi;

  public function __construct($panjang, $lebar, $tinggi) {
    $this->panjang = $panjang;
    $this->lebar = $lebar;
    $this->tinggi = $tinggi;
  }

  public function getVolume() {
    return $this->panjang * $this->lebar * $this->tinggi;
  }
}
$sisi = "";
$panjang = "";
$lebar = "";
$tinggi = "";
$volume = "";
$hasil = "";
$mode = "";

if (isset($_POST["mode"])) {
  // var_dump($_POST["mode"]);
  switch ($_POST["mode"]) {
    case "kubus":
      $sisi = isset($_POST["sisi"]) ? $_POST["sisi"] : "";
      $volume = new Kubus($sisi);
      $hasil = $volume->getVolume() ?: "";
      $mode = "kubus";
      break;
    case "balok":
      $panjang = $_POST["panjang"] ?: "";
      $lebar = $_POST["lebar"] ?: "";
      $tinggi = $_POST["tinggi"] ?: "";
      $volume = new Balok($panjang, $lebar, $tinggi);
      $hasil = $volume->getVolume() ?: "";
      $mode = "balok";
      break;
  }
}
?>
<div class="container">
  <div class="row">
    <div class="col col-md-12 m-3 mx-md-0 mb-2">
      <h4 class="title">Abstract Volume Bangun Ruang</h4>
    </div>
  </div>
  <div class="row">
    <div class="col col-md-12 mx-3 mx-md-0">
      <form action="/?abstract" method="POST">
        <div class="mode">
          <label class="_label">Pilih jenis bangun ruang:</label>
          <div class="form-check ms-3">
            <input class="form-check-input" type="radio" name="bangunRuang" id="kubus" value="kubus">
            <label class="form-check-label _label" for="kubus">
              Kubus
            </label>
          </div>
          <div class="form-check ms-3">
            <input class="form-check-input" type="radio" name="bangunRuang" id="balok" value="balok">
            <label class="form-check-label _label" for="balok">
              Balok
            </label>
          </div>
          <input type="hidden" name="mode">
        </div>
        <hr />
        <div class="formKubus mt-2 col-md-6">
          <label for="sisi" class="form-label _label">Sisi</label>
          <div class="input-group mb-3">
            <input type="number" step="any" class="form-control" placeholder=" " id="sisi" name="sisi" value="<?= $sisi ?>">
            <span class="input-group-text">cm</span>
          </div>
        </div>
        <div class="formBalok mt-2 d-none col-md-12">
          <div class="row">
            <div class="col-md-4">
              <label for="panjang" class="form-label _label">Panjang</label>
              <div class="input-group mb-3">
                <input type="number" step="any" class="form-control" placeholder=" " id="panjang" name="panjang" value="<?= $panjang ?>">
                <span class="input-group-text">cm</span>
              </div>
            </div>
            <div class="col-md-4">
              <label for="lebar" class="form-label _label">Lebar</label>
              <div class="input-group mb-3">
                <input type="number" step="any" class="form-control" placeholder=" " id="lebar" name="lebar" value="<?= $lebar ?>">
                <span class="input-group-text">cm</span>
              </div>
            </div>
            <div class="col-md-4">
              <label for="tinggi" class="form-label _label">Tinggi</label>
              <div class="input-group mb-3">
                <input type="number" step="any" class="form-control" placeholder=" " id="tinggi" name="tinggi" value="<?= $tinggi ?>">
                <span class="input-group-text">cm</span>
              </div>
            </div>
          </div>
        </div>
        <button type="submit" class="btn btn-primary"><i class="fas fa-calculator"></i> Hitung</button>
      </form>
      <hr />
      <div class="col-md-6">
        <label class="_label">Output</label>
        <div class="input-group mb-3 mt-2">
          <input type="text" class="form-control" placeholder=" " id="hasil" name="hasil" readonly>
          <span class="input-group-text">cm³</span>
        </div>
      </div>
    </div>
  </div>
</div>
<script>
  const radio = document.querySelector(".mode");
  const kubus = document.querySelector("#kubus");
  const balok = document.querySelector("#balok");
  const hasil = document.querySelector("#hasil");
  const formKubus = document.querySelector(".formKubus");
  const formBalok = document.querySelector(".formBalok");
  const mode = document.querySelector("input[type='hidden']");
  
  const formatNumber = (num) => {
    return num.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1.')
  }
  hasil.value = formatNumber('<?= $hasil ?>');
  // console.log(hasil)

  if ("<?= $mode ?>" == "kubus") {
    kubus.checked = true;
    balok.checked = false;
    mode.value = "kubus";
  } else if ("<?= $mode ?>" == "balok") {
    kubus.checked = false;
    balok.checked = true;
    formKubus.classList.add("d-none");
    formBalok.classList.remove("d-none");
    mode.value = "balok";
  } else {
    kubus.checked = true;
    balok.checked = false;
    mode.value = "kubus";
  }

  radio.addEventListener('click', (e) => {
    switch (e.target.id) {
      case 'kubus':
        formKubus.classList.remove("d-none");
        formBalok.classList.add("d-none");
        mode.value = "kubus";
        break;
      case 'balok':
        formKubus.classList.add("d-none");
        formBalok.classList.remove("d-none");
        mode.value = "balok";
        break;
    }
});
</script>