package org.simple.mu.properties.constants;

/**
 * Contains all the configuration keys, configurations that can be set by users
 * to override default configurations.
 * 
 * @author Gagandeep Singh
 * @since 19-AUG-2017 1.0
 * @version 1.0
 */
public enum Core {

	// Properties separator VM argument value and default value if not present.
	DELIMITER("core.delimiter") {
		@Override
		public Object getDefaultValue() {
			return ',';
		}
	},

	// The properties file to override VM argument value and default value if
	// not present.
	FILE_NAME("core.file.name") {
		@Override
		public Object getDefaultValue() {
			return "core.properties";
		}
	},

	// Should Configuration throw exception if property is missing VM argument
	// value and default value if not present.
	EXCEPTION_ON_MISSING_PROPERTY("core.missing.property.show.exception") {

		@Override
		public Object getDefaultValue() {
			return true;
		}
	};

	// Value of the enumeration.
	private final String value;

	/**
	 * Parameterized constructor initializing the VM argument value.
	 * 
	 * @author Gagandeep Singh
	 * @since 19-AUG-2017 1.0
	 * @version 1.0
	 * @param value
	 */
	private Core(String value) {
		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return value;
	}

	/**
	 * Contains the default values of various configurations to be used in case
	 * no user defines configuration is found.
	 * 
	 * @author Gagandeep Singh
	 * @since 19-AUG-2017 1.0
	 * @version 1.0
	 * @return the default value of the type.
	 */
	public abstract Object getDefaultValue();
}