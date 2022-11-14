/**
 * 
 */
package xyz.sumithpuri.spring.boot.annotation.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xyz.sumithpuri.spring.boot.annotation.service.SBASampleInterface;

/**
 * @author sumith.puri
 *
 */
@Component
public class SpringBootAnnotationComponent {

	
	@Autowired
	private SBASampleInterface sbaSampleInterfaceImpl;
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("Testing @SpringBootApplication, @Component and @PostConstruct");
	}

}
