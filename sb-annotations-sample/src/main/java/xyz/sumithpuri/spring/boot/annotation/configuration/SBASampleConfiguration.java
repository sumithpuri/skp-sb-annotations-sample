/**
 * 
 */
package xyz.sumithpuri.spring.boot.annotation.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xyz.sumithpuri.spring.boot.annotation.service.SBASampleImpl;
import xyz.sumithpuri.spring.boot.annotation.service.SBASampleInterface;

/**
 * @author sumith.puri
 *
 */
@Configuration
//@ConditionalOnClass(SBASampleImpl.class)
@ConditionalOnProperty(name="mode", havingValue="false")
public class SBASampleConfiguration {
	
	@Bean
	public SBASampleInterface getSBAService() {
		
		return new SBASampleImpl();
	}
}
