package fguiraldelli.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic fguiraldelliTopic() {
        return TopicBuilder.name("fguiraldelli")
                .build();
    }

    @Bean
    public NewTopic fguiraldelliJsonTopic() {
        return TopicBuilder.name("fguiraldelli_json")
                .build();
    }
}
