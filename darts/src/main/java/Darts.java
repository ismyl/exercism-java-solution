class Darts {

  private double coord;

  Darts(double x, double y) {
    this.coord = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

  int score() {
    if (this.coord > 10) {
      return 0;
    }

    if (this.coord > 5) {
      return 1;
    }

    if (this.coord > 1) {
      return 5;
    }

    return 10;
  }
}
