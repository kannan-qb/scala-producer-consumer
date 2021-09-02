import properties.ProducerProperties.properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

import scala.annotation.tailrec
import scala.io.StdIn
object ProducerClass extends App {
  val producer: KafkaProducer[Nothing, String] = new KafkaProducer[Nothing, String](properties)
  val topic = "testcase"
  @tailrec
  def write(i:Int) {
    val msg = StdIn.readLine()
    val record: ProducerRecord[Nothing, String] = new ProducerRecord(topic, msg)
    producer.send(record)
    write(i+1)
  }
  write(0)
}
