package properties

import java.util.Properties

object ProducerProperties {
  val properties: Properties = new Properties()
  properties.put("bootstrap.servers", "localhost:9092")
  properties.put("acks", "all")
  properties.put("retries", 0)
  properties.put("linger.ms", 1)
  properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  properties.put("enable.auto.commit", "true")
  properties.put("auto.commit.interval.ms", "1000")
  properties.put("buffer.memory", "33554432")

}
