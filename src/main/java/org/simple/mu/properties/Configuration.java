package org.simple.mu.properties;

import static org.simple.mu.properties.constants.Core.DELIMITER;
import static org.simple.mu.properties.constants.Core.EXCEPTION_ON_MISSING_PROPERTY;
import static org.simple.mu.properties.constants.Core.FILE_NAME;
import static org.simple.mu.properties.constants.Key.DELIMITER_KEY;
import static org.simple.mu.properties.constants.Key.EXCEPTION_ON_MISSING_PROPERTY_KEY;
import static org.simple.mu.properties.constants.Key.FILE_NAME_KEY;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.builder.fluent.PropertiesBuilderParameters;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.convert.ListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.simple.mu.core.annotations.Singleton;
import org.simple.mu.properties.constants.Key;

/**
 * Contains all the configuration keys, configurations that can be set by users
 * to override default configurations.
 * 
 * @author Gagandeep Singh
 * @since 19-AUG-2017 1.0
 * @version 1.0
 */
@Singleton
public enum Configuration {

	CONFIG;

	private final Logger log = Logger.getLogger(Configuration.class);
	private PropertiesConfiguration config;
	private Map<Key, Object> properties;

	/**
	 * Default constructor that initializes the properties file using the user
	 * defined or default values. This is a configurable system. Properties of
	 * use are:
	 * <ul>
	 * <li>-Dcore.delimiter=, (Default delimiter used as property separator)
	 * <li>-Dcore.file.name=core.properties (Default properties file)
	 * <li>-Dcore.missing.property.show.exception=true (If property key is not
	 * found system will throw an exception)
	 * </ul>
	 * 
	 * @author Gagandeep Singh
	 * @since 19-AUG-2017 1.0
	 * @version 1.0
	 */
	private Configuration() {

		log.info("Configuring properties...");
		calculateProperties();

		File file = new File(String.valueOf(properties.get(FILE_NAME_KEY)));
		log.info("Properties file : " + file.getName());
		ListDelimiterHandler delimiter = new DefaultListDelimiterHandler(
				String.valueOf(properties.get(DELIMITER_KEY)).charAt(0));
		PropertiesBuilderParameters propertyParameters = new Parameters().properties();
		propertyParameters.setFile(file);
		propertyParameters.setThrowExceptionOnMissing(true);
		propertyParameters.setListDelimiterHandler(delimiter);

		FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<PropertiesConfiguration>(
				PropertiesConfiguration.class);

		builder.configure(propertyParameters);

		try {
			config = builder.getConfiguration();
		} catch (ConfigurationException e) {
			log.error("Whoa! properties not getting picked");
			e.printStackTrace();
		}
	}

	/**
	 * The {@link PropertiesConfiguration} object to gain the properties and
	 * values defined in the user specified file or default file.
	 * 
	 * @author Gagandeep Singh
	 * @since 19-AUG-2017 1.0
	 * @version 1.0
	 * @return {@link PropertiesConfiguration} object.
	 */
	public PropertiesConfiguration get() {
		return config;
	}

	/**
	 * This will check for the user defined configurations, in case they are not
	 * found then default properties are picked.
	 * 
	 * @author Gagandeep Singh
	 * @since 19-AUG-2017 1.0
	 * @version 1.0
	 */
	private final void calculateProperties() {
		properties = new HashMap<>();
		properties.put(FILE_NAME_KEY, StringUtils.defaultIfEmpty(System.getProperty(FILE_NAME.toString()),
				String.valueOf(FILE_NAME.getDefaultValue())));
		properties.put(DELIMITER_KEY, StringUtils.defaultIfEmpty(System.getProperty(DELIMITER.toString()),
				String.valueOf(DELIMITER.getDefaultValue())));
		properties.put(EXCEPTION_ON_MISSING_PROPERTY_KEY,
				StringUtils.defaultIfEmpty(System.getProperty(EXCEPTION_ON_MISSING_PROPERTY.toString()),
						String.valueOf(EXCEPTION_ON_MISSING_PROPERTY.getDefaultValue())));
	}
}