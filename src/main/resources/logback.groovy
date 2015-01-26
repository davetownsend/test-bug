displayStatus()
initAppenders()
initLoggers()


def displayStatus() {
  statusListener OnConsoleStatusListener
}


def initAppenders() {
  def filePattern = "[%d{dd/MM/yyyy hh:mm:ss:sss z}] %t %5p %c{4}: %m%n"
  appender('applogfile', RollingFileAppender) {
    file = "/home/logs/test/test.log"

    rollingPolicy(TimeBasedRollingPolicy) {
      FileNamePattern = "/home/logs/test/test-%d{yyyy-MM}.zip"
    }
    encoder(PatternLayoutEncoder) {
      pattern = filePattern
    }
  }
}


def initLoggers() {
  def appAppender = ['applogfile']
  logger 'io.unbounded.sma', INFO, appAppender, false
  logger 'org.springframework.boot', INFO, appAppender, false

  root DEBUG, ['stdout']
}
