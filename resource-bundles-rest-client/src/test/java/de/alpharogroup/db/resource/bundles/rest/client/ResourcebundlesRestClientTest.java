/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.db.resource.bundles.rest.client;

import java.util.Properties;

import javax.ws.rs.core.Response;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.alpharogroup.collections.pairs.KeyValuePair;
import de.alpharogroup.db.resource.bundles.domain.Resourcebundle;
import de.alpharogroup.db.resource.bundles.rest.api.ResourcebundlesResource;

/**
 * The class {@link ResourcebundlesRestClientTest}.
 *
 * Note: you have to start a rest server to test this or you have to mock it.
 */
public class ResourcebundlesRestClientTest
{

	/** The rest client. */
	private ResourcebundlesRestClient restClient;

	/** The resourcebundles resource. */
	private ResourcebundlesResource resourcebundlesResource;

	/**
	 * Sets the up method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	public void setUpMethod() throws Exception
	{
		if (restClient == null)
		{
			restClient = new ResourcebundlesRestClient();
			resourcebundlesResource = restClient.getResourcebundlesResource();
			AssertJUnit.assertNotNull(resourcebundlesResource);
		}
	}

	/**
	 * Tear down method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterMethod
	public void tearDownMethod() throws Exception
	{
	}

	/**
	 * Test method for {@link ResourcebundlesResource#find(String, String, String)}.
	 */
	@Test(enabled = false)
	public void testFind()
	{
		// http://localhost:8080/resourcebundle/find/base-bundle-application/base-resource-bundles/de_DE/resource.bundles.test.label
		final Resourcebundle resourcebundle2 = resourcebundlesResource.find(
			"base-bundle-application", "base-resource-bundles", "de",
			"resource.bundles.test.label");
		AssertJUnit.assertNotNull(resourcebundle2);
		AssertJUnit.assertEquals("Erstes label", resourcebundle2.getValue());
	}

	/**
	 * Test method for {@link ResourcebundlesResource#get(String)}.
	 */
	@Test(enabled = false)
	public void testGet()
	{
		// http://localhost:8080/resourcebundle/get/1
		final Resourcebundle resourcebundle1 = resourcebundlesResource
			.get(Integer.valueOf(1).toString());
		AssertJUnit.assertNotNull(resourcebundle1);
		AssertJUnit.assertEquals("Erstes label", resourcebundle1.getValue());
	}

	/**
	 * Test method for {@link ResourcebundlesResource#getProperties(String, String, String)}.
	 */
	@Test(enabled = false)
	public void testGetProperties()
	{
		Response response;
		Properties properties;
		// http://localhost:8080/resourcebundle/get/properties/base-bundle-application/base-resource-bundles/de
		response = resourcebundlesResource.getProperties("base-bundle-application", "base-resource-bundles",
			"de");

		properties = response.readEntity(Properties.class);
		AssertJUnit.assertNotNull(properties);
		AssertJUnit.assertEquals("Erstes label",
			properties.getProperty("resource.bundles.test.label"));

		// http://localhost:8080/resourcebundle/get/properties/base-bundle-application/test/de_DE
		response = resourcebundlesResource.getProperties("base-bundle-application", "test",
			"en_US");
		properties = response.readEntity(Properties.class);
		AssertJUnit.assertNotNull(properties);
		AssertJUnit.assertTrue(properties.size() == 4);
	}

	/**
	 * Test method for {@link ResourcebundlesResource#getResponseString(String, String, String)}.
	 */
	@SuppressWarnings("unchecked")
	@Test(enabled = false)
	public void testGetResponseString()
	{
		// http://localhost:8080/resourcebundle/get/r/string/base-bundle-application/base-resource-bundles/de/resource.bundles.test.label
		final Response response = resourcebundlesResource.getResponseString(
			"base-bundle-application", "base-resource-bundles", "de",
			"resource.bundles.test.label");
		final KeyValuePair<String, String> keyValuePair = response.readEntity(KeyValuePair.class);
		AssertJUnit.assertNotNull(keyValuePair);
		AssertJUnit.assertEquals("Erstes label", keyValuePair.getValue());
	}

	/**
	 * Test method for {@link ResourcebundlesResource#getString(String, String, String)}.
	 */
	@SuppressWarnings("unchecked")
	@Test(enabled = false)
	public void testGetString()
	{
		// http://localhost:8080/resourcebundle/get/string/base-bundle-application/base-resource-bundles/de_DE/resource.bundles.test.label
		final Response response = resourcebundlesResource.getString("base-bundle-application",
			"base-resource-bundles", "de", "resource.bundles.test.label");
		final KeyValuePair<String, String> keyValuePair = response.readEntity(KeyValuePair.class);
		AssertJUnit.assertNotNull(keyValuePair);
		AssertJUnit.assertEquals("Erstes label", keyValuePair.getValue());
	}

	/**
	 * Test method for {@link ResourcebundlesResource#getString(String, String, String)}.
	 */
	@SuppressWarnings("unchecked")
	@Test(enabled = false)
	public void testGetStringWithParameters()
	{
		// http://localhost:8080/resourcebundle/get/string/base-bundle-application/test/de_DE/com.example.gui.prop.with.params.label/parameters?parameter=Fritz&parameter=Deutschland
		final String[] paramsGerman = { "Fritz", "Deutschland" };
		final String baseName = "test";

		Response response = resourcebundlesResource.getString("base-bundle-application", baseName,
			"de_DE", "com.example.gui.prop.with.params.label", paramsGerman);

		KeyValuePair<String, String> keyValuePair = response.readEntity(KeyValuePair.class);
		AssertJUnit.assertNotNull(keyValuePair);
		AssertJUnit.assertEquals("Hallo ich bin Fritz und komme aus Deutschland.",
			keyValuePair.getValue());

		// http://localhost:8080/resourcebundle/get/string/base-bundle-application/test/en_US/com.example.gui.prop.with.params.label/parameters?parameter=Fritz&parameter=Germany
		final String[] paramsBritain = { "Fritz", "Germany" };
		response = resourcebundlesResource.getString("base-bundle-application", baseName, "en_US",
			"com.example.gui.prop.with.params.label", paramsBritain);
		keyValuePair = response.readEntity(KeyValuePair.class);
		AssertJUnit.assertNotNull(keyValuePair);
		AssertJUnit.assertEquals("Hello i am Fritz and i come from Germany.",
			keyValuePair.getValue());
	}

}
