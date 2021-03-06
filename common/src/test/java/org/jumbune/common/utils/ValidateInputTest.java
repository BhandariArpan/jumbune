package org.jumbune.common.utils;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jumbune.common.beans.Enable;
import org.jumbune.common.utils.ValidateInput;
import org.jumbune.common.yaml.config.Config;
import org.jumbune.common.yaml.config.YamlConfig;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
public class ValidateInputTest {

	ValidateInput fixture;
	YamlConfig config;
	
	@Before
	public void setUp() throws Exception {
	
	fixture = new ValidateInput();
	config = Mockito.mock(YamlConfig.class);
	}

	@Test
	public void testValidateYaml() {
		Enable enable = Enable.TRUE;
		when(config.getEnableDataValidation()).thenReturn(enable);
		assertNotNull(fixture.validateYaml(config));
		
			
	}

	
}
