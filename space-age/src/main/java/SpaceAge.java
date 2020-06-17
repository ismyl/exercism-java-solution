class SpaceAge {

  private double seconds;

  SpaceAge(double seconds) {
    this.seconds = seconds;
  }

  double getSeconds(Orbital orbital) {
    return this.seconds / orbital.getPeriodSecond();
  }

  double onEarth() {
    return getSeconds(Orbital.EARTH);
  }

  double onMercury() {
    return getSeconds(Orbital.MERCURY);
  }

  double onVenus() {
    return getSeconds(Orbital.VENUS);
  }

  double onMars() {
    return getSeconds(Orbital.MARS);
  }

  double onJupiter() {
    return getSeconds(Orbital.JUPITER);
  }

  double onSaturn() {
    return getSeconds(Orbital.SATURN);
  }

  double onUranus() {
    return getSeconds(Orbital.URANUS);
  }

  double onNeptune() {
    return getSeconds(Orbital.NEPTUNE);
  }

  public enum Orbital {
    EARTH(31557600),
    MERCURY(EARTH.periodSecond * 0.2408467),
    VENUS(EARTH.periodSecond * 0.61519726),
    MARS(EARTH.periodSecond * 1.8808158),
    JUPITER(EARTH.periodSecond * 11.862615),
    SATURN(EARTH.periodSecond * 29.447498),
    URANUS(EARTH.periodSecond * 84.016846),
    NEPTUNE(EARTH.periodSecond * 164.79132);

    private double periodSecond;

    Orbital(double periodSecond) {
      this.periodSecond = periodSecond;
    }

    public double getPeriodSecond() {
      return periodSecond;
    }
  }
}
