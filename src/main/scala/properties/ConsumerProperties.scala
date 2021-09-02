package properties

import java.util.Properties

object ConsumerProperties {
  val consumerproperties: Properties = new Properties()
  consumerproperties.put("bootstrap.servers", "localhost:9092")
  consumerproperties.put("acks", "all")
  consumerproperties.put("retries", 0)
  consumerproperties.put("linger.ms", 1)
  consumerproperties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  consumerproperties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  consumerproperties.put("group.id", "test-consumer-group")
  consumerproperties.put("enable.auto.commit", "true")
  consumerproperties.put("auto.commit.interval.ms", "1000")

}
