import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
  private LocalDateTime currentMoment;

  public Gigasecond(LocalDate moment) {
    // moment.atStartOfDay 를 사용하는 편이 직관적이었을듯
    // this(moment.atStartOfDay()) 형태로 생성자 오버라이딩을 하는 것도 깔끔
    this.currentMoment = moment.atTime(0, 0, 0);
  }

  public Gigasecond(LocalDateTime moment) {
    this.currentMoment = moment;
  }

  public LocalDateTime getDateTime() {
    return this.currentMoment.plusSeconds(1000000000L);
  }
}
