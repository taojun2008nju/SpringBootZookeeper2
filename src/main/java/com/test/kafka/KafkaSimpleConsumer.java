package com.test.kafka;

import com.test.constant.KafkaConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2020/7/26 16:28:00
 * @description TODO
 */
@Slf4j
@Component
public class KafkaSimpleConsumer {

    String topicSimple = "SIMPLE";

    // 简单消费者
    @KafkaListener(topics = KafkaConstants.TOPIC_SIMPLE)
    public void consumer1(String msgData) {
        log.info("consumer, topic= {}, content = {}", KafkaConstants.TOPIC_SIMPLE, msgData);
//        ack.acknowledge();

        /*
         * 如果需要手工提交异步 consumer.commitSync();
         * 手工同步提交 consumer.commitAsync()
         */
    }
}
