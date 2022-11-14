/**
 * 
 */
package xyz.sumithpuri.spring.boot.annotation.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

/**
 * @author sumith.puri
 *
 */
@Component
@ConfigurationProperties(prefix = "proptest")
@ConfigurationPropertiesScan
public class SBASampleConfigurationProperties {

	private String name;
	private String pass;
	private String mail;
	private String year;
	private long uuid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

}
