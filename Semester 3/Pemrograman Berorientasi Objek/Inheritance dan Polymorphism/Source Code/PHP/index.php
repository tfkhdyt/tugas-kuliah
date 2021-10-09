<!-- Taufik Hidayat | 301200032 | Informatika Pagi -->
<?php
class Motor {
  private $merk, $tipe, $warna, $tahun, $gambar;

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
    return "Nyalakan motor...";
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
    return "Nyalakan motor, lalu gas...";
  }
}

class MotorKopling extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun, $gambar) {
    // Taufik Hidayat | 301200032 | Informatika Pagi
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
    return "Nyalakan motor, tarik kopling, naik gigi, lalu perlahan lepas kopling dan gas...";
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
    return "Nyalakan motor, naik gigi, lalu gas...";
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
  <link rel="preload" as="image" href="asset/images/nmax.jpg">
  <link rel="preload" as="image" href="asset/images/satria.jpg">
  <link rel="preload" as="image" href="asset/images/supra.jpg">
  <!-- Taufik Hidayat | 301200032 | Informatika Pagi -->
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
                    <button class="nav-link active" id="matic" data-bs-toggle="tab" type="button" role="tab" aria-selected="true">Motor Matic</button>
                  </li>
                  <li class="nav-item" role="presentation">
                    <button class="nav-link" id="kopling" data-bs-toggle="tab" type="button" role="tab" aria-selected="false">Motor Kopling</button>
                  </li>
                  <li class="nav-item" role="presentation">
                    <button class="nav-link" id="bebek" data-bs-toggle="tab" type="button" role="tab" aria-selected="false">Motor Bebek</button>
                  </li>
                </ul>
              </div>
              <!-- Content -->
              <div class="col-12 mt-2 content">
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
  <script>
    let merk, tipe, warna, tahun, gambar;
    const nav = document.getElementsByClassName('nav')[0];
    const content = document.getElementsByClassName('content')[0];
    
    const render = (merk, tipe, warna, tahun, gambar, jalankan) => {
      // Taufik Hidayat | 301200032 | Informatika Pagi
      content.innerHTML = `
        <div class="row">
          <div class="col-md-5 mt-md-2">
            <img src="asset/images/${gambar}" class="img-fluid">
          </div>
          <div class="col-md-7 mt-md-2">
            <div class="row">
              <div class="col-3 text-nowrap">
                Merk
              </div>
              <div class="col-9">
                : <b>${merk}</b>
              </div>
            </div>
            <div class="row">
              <div class="col-3 text-nowrap">
                Tipe
              </div>
              <div class="col-9">
                : <b>${tipe}</b>
              </div>
            </div>
            <div class="row">
              <div class="col-3 text-nowrap">
                Warna
              </div>
              <div class="col-9">
                : <b>${warna}</b>
              </div>
            </div>
            <div class="row">
              <div class="col-3 text-nowrap">
                Tahun
              </div>
              <div class="col-9">
                : <b>${tahun}</b>
              </div>
            </div>
            <div class="row">
              <div class="col-12 fst-italic text-wrap">
                ${jalankan}
              </div>
            </div>
          </div>
        </div>
      `;
    };
    
    render(
      '<?= $matic->getMerk() ?>',
      '<?= $matic->getTipe() ?>',
      '<?= $matic->getWarna() ?>',
      '<?= $matic->getTahun() ?>',
      '<?= $matic->getGambar() ?>',
      '<?= $matic->jalankan() ?>'
    );
    
    nav.addEventListener('click', (e) => {
      // if(e.target.classList.contains('active')) return;
      content.classList.add('fade');
      const jenis = e.target.id;
      switch(jenis) {
        case 'matic':
          merk = '<?= $matic->getMerk() ?>';
          tipe = '<?= $matic->getTipe() ?>';
          warna = '<?= $matic->getWarna() ?>';
          tahun = '<?= $matic->getTahun() ?>';
          gambar = '<?= $matic->getGambar() ?>';
          jalankan = '<?= $matic->jalankan() ?>';
          break;
        case 'kopling':
          merk = '<?= $kopling->getMerk() ?>';
          tipe = '<?= $kopling->getTipe() ?>';
          warna = '<?= $kopling->getWarna() ?>';
          tahun = '<?= $kopling->getTahun() ?>';
          gambar = '<?= $kopling->getGambar() ?>';
          jalankan = '<?= $kopling->jalankan() ?>';
          break;
        case 'bebek':
          merk = '<?= $bebek->getMerk() ?>';
          tipe = '<?= $bebek->getTipe() ?>';
          warna = '<?= $bebek->getWarna() ?>';
          tahun = '<?= $bebek->getTahun() ?>';
          gambar = '<?= $bebek->getGambar() ?>';
          jalankan = '<?= $bebek->jalankan() ?>';
          break;
      }
      console.log(jenis, merk);
      setTimeout(() => {
        render(merk, tipe, warna, tahun, gambar, jalankan);
        content.classList.remove('fade');
      }, 500);
    });
  </script>
</body>
</html>
<!-- Taufik Hidayat | 301200032 | Informatika Pagi -->