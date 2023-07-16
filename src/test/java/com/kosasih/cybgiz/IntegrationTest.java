package com.kosasih.cybgiz;

import com.kosasih.cybgiz.CybgizApp;
import com.kosasih.cybgiz.config.AsyncSyncConfiguration;
import com.kosasih.cybgiz.config.EmbeddedElasticsearch;
import com.kosasih.cybgiz.config.EmbeddedKafka;
import com.kosasih.cybgiz.config.EmbeddedSQL;
import com.kosasih.cybgiz.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CybgizApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
