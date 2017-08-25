
package org.simple.mu.properties;

import static org.simple.mu.properties.Configuration.CONFIG;
import static org.simple.mu.properties.constants.Core.FILE_NAME;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ConfigurationTest {

	@Test
	@Ignore
	public void testDefaultConfiguration() {
		Assert.assertEquals("Unable to get the correct property", "Gagandeep Singh",
				CONFIG.get().getString("author.name"));
	}

	@Test
	public void testCustomConfiguration() {
		System.setProperty(FILE_NAME.toString(), "custom.properties");
		Assert.assertEquals("Unable to get the correct property", "You are using a custom file instead of default.",
				CONFIG.get().getString("custom.message"));
	}
}