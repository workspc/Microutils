package org.simple.mu.properties.constants;

/**
 * The enumeration that contains all the configuration keys, configurations that
 * can be set by users to override default configurations.
 * 
 * @author Gagandeep Singh
 * @since 19-AUG-2017 1.0
 * @version 1.0
 */
public enum Key {

	// Properties separator.
	DELIMITER_KEY("delimiter"),

	// The properties file to override.
	FILE_NAME_KEY("file.name"),

	// Should Configuration throw exception if property is missing.
	EXCEPTION_ON_MISSING_PROPERTY_KEY("missing.property.exception");

	// Value of the enumeration.
	private final String value;

	/**
	 * Parameterized constructor initializing the key's value.
	 * 
	 * @author Gagandeep Singh
	 * @since 19-AUG-2017 1.0
	 * @version 1.0
	 * @param value
	 *            of the defined key.
	 */
	private Key(String value) {
		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}