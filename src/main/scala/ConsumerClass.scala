import properties.ConsumerProperties.consumerproperties
import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}

import java.time.Duration
import java.util.Collections
import scala.jdk.CollectionConverters.IterableHasAsScala

object ConsumerClass extends App {
  val consumer: KafkaConsumer[Nothing, String] = new KafkaConsumer[Nothing, String](consumerproperties)
  consumer.subscribe(Collections.singletonList("testcase"))

  def toConsume(i:Int){
    val records: ConsumerRecords[Nothing, String] = consumer.poll(Duration.ofMillis(100))
    for (j <- records.asScala) {
      println(j.value())
    }
    toConsume(i+1)
  }
  toConsume(0)
}
