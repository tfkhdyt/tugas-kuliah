<?php
interface Motor {
  public const MAX_SPEED = 135;
  public const MIN_SPEED = 0;
  public function nyalakan();
  public function matikan();
  public function gas();
  public function rem();
  public function getStatus();
}

class Pengendara {
  private $motor;

  public function __construct($motor) {
    $this->motor = $motor;
  }

  public function menyalakanMotor() {
    $this->motor->nyalakan();
  }

  public function mematikanMotor() {
    $this->motor->matikan();
  }

  public function menggasMotor() {
    $this->motor->gas();
  }

  public function mengeremMotor() {
    $this->motor->rem();
  }

  public function mengecekStatus() {
    return $this->motor->getStatus();
  }
}

class Yamaha implements Motor {
  private $kecepatan, $apakahMotorMenyala;

  public function __construct($kecepatan, $power) {
    $this->kecepatan = $kecepatan;
    // var_dump($power);
    $this->apakahMotorMenyala = $power;
  }

  public function getKecepatan() {
    return $this->kecepatan;
  }

  public function getStatus() {
    return $this->apakahMotorMenyala;
  }

  public function cetakAlert($warna, $icon, $teks) {
    // var_dump($warna);
    echo "
      <div class='alert alert-$warna alert-dismissible fade show mt-1 mb-3' role='alert'>
        <i class='fas fa-$icon'></i> $teks
        <button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button>
      </div>
    ";
  }

  public function nyalakan() {
    $warna = "success";
    $icon = "toggle-on";
    $teks = "Motor sudah menyala, selamat berkendara!";
    $this->cetakAlert($warna, $icon, $teks);
  }
  public function matikan() {
    $warna = "danger";
    $icon = "toggle-off";
    $teks = "Motor sudah dimatikan!";
    $this->cetakAlert($warna, $icon, $teks);
  }
  public function gas() {
    $warna = "primary";
    // var_dump($this->getKecepatan());
    if ($this->apakahMotorMenyala) {
      if ($this->getKecepatan() == Motor::MAX_SPEED) {
        $icon = "exclamation-triangle";
        $teks =
          "Anda sudah mencapai kecepatan maksimum! Kecepatan saat ini: <b>" .
          $this->getKecepatan() .
          " km/h</b>";
      } else {
        // $this->kecepatan += 5;
        $icon = "tachometer-alt";
        // var_dump($this->getKecepatan());
        $teks = "Kecepatan saat ini: <b>" . $this->getKecepatan() . " km/h</b>";
      }
    } else {
      $icon = "power-off";
      $teks = "Motor masih mati, tolong nyalakan motor terlebih dahulu!";
    }
    $this->cetakAlert($warna, $icon, $teks);
  }
  public function rem() {
    $warna = "warning";
    // var_dump($this->getKecepatan());
    if ($this->apakahMotorMenyala) {
      if ($this->getKecepatan() == Motor::MIN_SPEED) {
        $icon = "exclamation-triangle";
        $teks = "Kecepatan saat ini: <b>0 km/h</b>";
      } else {
        // $this->kecepatan += 5;
        $icon = "tachometer-alt";
        // var_dump($this->getKecepatan());
        $teks = "Kecepatan saat ini: <b>" . $this->getKecepatan() . " km/h</b>";
      }
    } else {
      $icon = "power-off";
      $teks = "Motor masih mati, tolong nyalakan motor terlebih dahulu!";
    }
    $this->cetakAlert($warna, $icon, $teks);
  }
}

$power = $_GET["power"] == "on" ? true : false;
// $kecepatan = $_GET["kecepatan"] ?: "0";
// var_dump($power);
if ($_GET["kecepatan"] <= 0) {
  $kecepatan = "0";
} elseif ($_GET["kecepatan"] >= 135) {
  $kecepatan = "135";
} elseif ($_GET["kecepatan"]) {
  $kecepatan = $_GET["kecepatan"];
} else {
  $kecepatan = "0";
}
// var_dump($kecepatan);
$nmax = new Yamaha($kecepatan, $power);
$taufik = new Pengendara($nmax);
$isPowerOn = $taufik->mengecekStatus() ? "&power=on" : "&power=off";

// var_dump($isPowerOn);
?>
<div class="container">
  <div class="row">
    <div class="col col-md-12 m-3 mx-md-0 mb-2">
      <h4 class="title">Interface Motor Yamaha</h4>
      <?php switch ($_GET["menu"]) {
        case "nyala":
          $taufik->menyalakanMotor();
          break;
        case "mati":
          $taufik->mematikanMotor();
          break;
        case "gas":
          $taufik->menggasMotor();
          break;
        case "rem":
          $taufik->mengeremMotor();
          break;
      } ?>
    </div>
  </div>
  <div class="row">
    <div class="col col-md-12 mx-2 mx-md-0">
      <div class="row mx-auto">
        <div class="col-12 col-md-6 <?php if ($_GET["power"] == "on") {
          echo "d-none";
        } ?>">
          <a href="/?interface&menu=nyala&power=on" class="btn btn-success me-2 mb-4 p-2 long-button d-flex flex-column pt-3">
            <i class="fas fa-toggle-on fa-3x mt-4"></i>
            <p>
              Nyalakan Motor
            </p>
          </a>
        </div>
        <div class="col-12 col-md-6 <?php if (
          $_GET["power"] == "off" ||
          empty($_GET["power"])
        ) {
          echo "d-none";
        } ?>">
          <a href="/?interface&menu=mati&power=off" class="btn btn-danger me-2 mb-4 p-2 long-button d-flex flex-column pt-3">
            <i class="fas fa-toggle-off fa-3x mt-4"></i>
            <p>
              Matikan Motor
            </p>
          </a>
        </div>
        <div class="col-6 col-md-3 <?php if (
          $_GET["power"] == "off" ||
          empty($_GET["power"])
        ) {
          echo "d-none";
        } ?>">
          <a href="/?interface&menu=gas<?= $isPowerOn ?>&kecepatan=<?= $kecepatan +
  5 ?>" class="btn btn-primary me-2 mb-3 p-2 big-button d-flex flex-column pt-3">
            <i class="fas fa-plus fa-3x mt-4"></i>
            <p>
              Gas
            </p>
          </a>
        </div>
        <div class="col-6 col-md-3 <?php if (
          $_GET["power"] == "off" ||
          empty($_GET["power"])
        ) {
          echo "d-none";
        } ?>">
          <a href="/?interface&menu=rem<?= $isPowerOn ?>&kecepatan=<?= $kecepatan -
  5 ?>" class="btn btn-warning me-2 mb-3 p-2 big-button d-flex flex-column pt-3">
            <i class="fas fa-minus fa-3x mt-4"></i>
            <p>
              Rem
            </p>
          </a>
        </div>
      </div>
    </div>
  </div>
</div>