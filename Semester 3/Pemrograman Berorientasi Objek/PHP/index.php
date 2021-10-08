<?php
class Motor {
  private $merk,
  $tipe,
  $warna,
  $tahun,
  $gambar;

  public function __construct($merk, $tipe, $warna, $tahun, $gambar) {
    $this->merk = $merk;
    $this->tipe = $tipe;
    $this->warna = $warna;
    $this->tahun = $tahun;
    $this->gambar = $gambar;
  }

  public function getMerk() {
    return $this->merk;
  }

  public function getTipe() {
    return $this->tipe;
  }

  public function getWarna() {
    return $this->warna;
  }

  public function getTahun() {
    return $this->tahun;
  }

  public function getGambar() {
    return $this->gambar;
  }

  public function jalankan() {
    echo "Nyalakan motor...";
  }
}

class MotorMatic extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun, $gambar) {
    parent::__construct($merk, $tipe, $warna, $tahun, $gambar);
  }

  public function getMerk() {
    return parent::getMerk();
  }

  public function getTipe() {
    return parent::getTipe();
  }

  public function getWarna() {
    return parent::getWarna();
  }

  public function getTahun() {
    return parent::getTahun();
  }

  public function getGambar() {
    return parent::getGambar();
  }

  public function jalankan() {
    echo "Nyalakan motor, lalu gas...";
  }
}

class MotorKopling extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun, $gambar) {
    parent::__construct($merk, $tipe, $warna, $tahun, $gambar);
  }

  public function getMerk() {
    return parent::getMerk();
  }

  public function getTipe() {
    return parent::getTipe();
  }

  public function getWarna() {
    return parent::getWarna();
  }

  public function getTahun() {
    return parent::getTahun();
  }

  public function getGambar() {
    return parent::getGambar();
  }

  public function jalankan() {
    echo "Nyalakan motor, tarik kopling, naik gigi, lalu perlahan lepas kopling dan gas...";
  }
}

class MotorBebek extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun, $gambar) {
    parent::__construct($merk, $tipe, $warna, $tahun, $gambar);
  }

  public function getMerk() {
    return parent::getMerk();
  }

  public function getTipe() {
    return parent::getTipe();
  }

  public function getWarna() {
    return parent::getWarna();
  }

  public function getTahun() {
    return parent::getTahun();
  }

  public function getGambar() {
    return parent::getGambar();
  }

  public function jalankan() {
    echo "Nyalakan motor, naik gigi, lalu gas...";
  }
}

$matic = new MotorMatic("Yamaha", "Nmax", "Abu-abu", 2021, "nmax.jpg");
$kopling = new MotorKopling("Suzuki", "Satria F150", "Putih", 2020, "satria.jpg");
$bebek = new MotorBebek("Honda", "Supra X", "Merah", 2019, "supra.jpg");
?>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Inheritance & Polymorphism PHP</title>
  <!-- Development -->
  <!-- <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css"> -->
  <!-- Production -->
  <link rel="stylesheet" href="dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="dist/css/style.css">
</head>
<body>
  <div class="container">
    <div class="row mx-1 my-3">
      <div class="col-12 col-md-10 mx-auto">
        <div class="card">
          <div class="card-header fw-bold">
            Inheritance dan Polymorphism pada PHP
          </div>
          <div class="card-body">
            <div class="row mx-auto">
              <!-- Navbar -->
              <div class="col-12">
                <ul class="nav nav-tabs nav-fill" id="myTab" role="tablist">
                  <li class="nav-item" role="presentation">
                    <button class="nav-link active" id="matic-tab" data-bs-toggle="tab" data-bs-target="#matic" type="button" role="tab" aria-controls="matic" aria-selected="true">Motor Matic</button>
                  </li>
                  <li class="nav-item" role="presentation">
                    <button class="nav-link" id="kopling-tab" data-bs-toggle="tab" data-bs-target="#kopling" type="button" role="tab" aria-controls="kopling" aria-selected="false">Motor Kopling</button>
                  </li>
                  <li class="nav-item" role="presentation">
                    <button class="nav-link" id="bebek-tab" data-bs-toggle="tab" data-bs-target="#bebek" type="button" role="tab" aria-controls="bebek" aria-selected="false">Motor Bebek</button>
                  </li>
                </ul>
              </div>
              <!-- Content -->
              <div class="col-12 mt-2 content">
                <div class="tab-content" id="nav-tabContent">
                  <div class="tab-pane fade show active" id="matic" role="tabpanel" aria-labelledby="matic-tab">
                    <div class="row">
                      <div class="col-md-5 mt-md-2">
                        <img src="asset/images/<?= $matic->getGambar() ?>" alt="Gambar Nmax" class="img-fluid">
                      </div>
                      <div class="col-md-7 mt-md-2">
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Merk
                          </div>
                          <div class="col-9">
                            : <b><?= $matic->getMerk() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Tipe
                          </div>
                          <div class="col-9">
                            : <b><?= $matic->getTipe() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Warna
                          </div>
                          <div class="col-9">
                            : <b><?= $matic->getWarna() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Tahun
                          </div>
                          <div class="col-9">
                            : <b><?= $matic->getTahun() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-12 fst-italic text-wrap">
                            <?= $matic->jalankan() ?>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="tab-pane fade" id="kopling" role="tabpanel" aria-labelledby="kopling-tab">
                    <div class="row">
                      <div class="col-md-5 mt-md-2">
                        <img src="asset/images/<?= $kopling->getGambar() ?>" alt="Gambar Satria" class="img-fluid">
                      </div>
                      <div class="col-md-7 mt-md-2">
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Merk
                          </div>
                          <div class="col-9">
                            : <b><?= $kopling->getMerk() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Tipe
                          </div>
                          <div class="col-9">
                            : <b><?= $kopling->getTipe() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Warna
                          </div>
                          <div class="col-9">
                            : <b><?= $kopling->getWarna() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Tahun
                          </div>
                          <div class="col-9">
                            : <b><?= $kopling->getTahun() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-12 fst-italic text-wrap">
                            <?= $kopling->jalankan() ?>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="tab-pane fade" id="bebek" role="tabpanel" aria-labelledby="bebek-tab">
                    <div class="row">
                      <div class="col-md-5 mt-md-2">
                        <img src="asset/images/<?= $bebek->getGambar() ?>" alt="Gambar Supra" class="img-fluid">
                      </div>
                      <div class="col-md-7 mt-md-2">
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Merk
                          </div>
                          <div class="col-9">
                            : <b><?= $bebek->getMerk() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Tipe
                          </div>
                          <div class="col-9">
                            : <b><?= $bebek->getTipe() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Warna
                          </div>
                          <div class="col-9">
                            : <b><?= $bebek->getWarna() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 text-nowrap">
                            Tahun
                          </div>
                          <div class="col-9">
                            : <b><?= $bebek->getTahun() ?></b>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-12 fst-italic text-wrap">
                            <?= $bebek->jalankan() ?>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="card-footer text-muted text-center fw-light">
            <a href="https://github.com/tfkhdyt" target="_blank" class="text-reset text-decoration-none">Taufik Hidayat | 301200032 | Informatika</a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>