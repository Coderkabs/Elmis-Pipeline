import HelperClass.PrescriptionAckRecord;
import org.apache.flink.streaming.connectors.kafka.KafkaSerializationSchema;
import org.apache.kafka.clients.producer.ProducerRecord;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.flink.streaming.connectors.kafka.KafkaSerializationSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProducerJunit {

    private  KafkaPrescriptionProducer kafkaPrescriptionProducer;

    @BeforeEach
    void setUp() {
        kafkaPrescriptionProducer = new KafkaPrescriptionProducer();
    }
    @Test
    void testSerializationSchema() {
//        KafkaSerializationSchema<PrescriptionAckRecord> schema = new kafkaPrescriptionProducer.createProducer().getSerializationSchema();
//        PrescriptionAckRecord record = new PrescriptionAckRecord("906785", "{\"message\": \"test\"}");
//        ProducerRecord<byte[], byte[]> producerRecord = schema.serialize(record, System.currentTimeMillis());
//
//        Assertions.assertNotNull(producerRecord);
//        Assertions.assertEquals("h-1234_m-PR", producerRecord.topic());
//        Assertions.assertNotNull(producerRecord.value());
    }

}



