package com.rabbit.springcloudstream.source.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Slf4j
@Configuration("sourceSchedulingConfig")
// @AutoConfigureAfter(SourceStreamConfig.class)
@EnableScheduling
public class SourceSchedulingConfig {

	// no-op
}
