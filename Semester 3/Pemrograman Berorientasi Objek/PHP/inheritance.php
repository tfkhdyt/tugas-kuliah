<?php
class Motor {
  private $merk,
  $tipe,
  $warna,
  $tahun;

  public function __construct($merk, $tipe, $warna, $tahun) {
    $this->merk = $merk;
    $this->tipe = $tipe;
    $this->warna = $warna;
    $this->tahun = $tahun;
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

  public function jalankan() {
    echo "Nyalakan motor...";
  }
}

class MotorMatic extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun) {
    parent::__construct($merk, $tipe, $warna, $tahun);
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

  public function jalankan() {
    echo "Nyalakan motor, lalu gas";
  }
}

class MotorKopling extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun) {
    parent::__construct($merk, $tipe, $warna, $tahun);
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

  public function jalankan() {
    echo "Nyalakan motor, tarik kopling, naik gigi, lalu perlahan lepas kopling dan gas";
  }
}

class MotorBebek extends Motor {
  public function __construct($merk, $tipe, $warna, $tahun) {
    parent::__construct($merk, $tipe, $warna, $tahun);
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

  public function jalankan() {
    echo "Nyalakan motor, naik gigi, lalu gas";
  }
}

$matic = new MotorMatic("Yamaha", "Nmax", "Abu-abu", 2021);
$kopling = new MotorKopling("Suzuki", "Satria F150", "Biru", 2020);
$bebek = new MotorBebek("Honda", "Supra X", "Merah", 2019);

echo "Motor Matic <br />
Merk: {$matic->getMerk()} <br /> 
Tipe: {$matic->getTipe()} <br />
Warna: {$matic->getWarna()} <br />
Tahun: {$matic->getTahun()} <br />
";
$matic->jalankan();

echo "<br /><br />Motor Kopling <br />
Merk: {$kopling->getMerk()} <br /> 
Tipe: {$kopling->getTipe()} <br />
Warna: {$kopling->getWarna()} <br />
Tahun: {$kopling->getTahun()} <br />
";
$kopling->jalankan();

echo "<br /><br />Motor Bebek <br />
Merk: {$bebek->getMerk()} <br /> 
Tipe: {$bebek->getTipe()} <br />
Warna: {$bebek->getWarna()} <br />
Tahun: {$bebek->getTahun()} <br />
";
$bebek->jalankan();
?>