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
package de.alpharogroup.db.resource.bundles.service.api;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import de.alpharogroup.collections.pairs.KeyValuePair;
import de.alpharogroup.db.resource.bundles.entities.BundleApplications;
import de.alpharogroup.db.resource.bundles.entities.BundleNames;
import de.alpharogroup.db.resource.bundles.entities.Resourcebundles;
import de.alpharogroup.db.service.api.BusinessService;

/**
 * The interface {@link ResourcebundlesService}.
 */
public interface ResourcebundlesService extends BusinessService<Resourcebundles, Integer>
{

	/**
	 * Checks if a {@link Resourcebundles} object exists from the given baseName, the given
	 * {@link Locale} object and the given properties key.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @param key
	 *            the properties key
	 * @return the found {@link Resourcebundles} object or null if it does not exists.
	 */
	Resourcebundles contains(final String baseName, final Locale locale, final String key);

	/**
	 * Find a list of {@link Resourcebundles} objects from the given baseName, the given locale as
	 * String, the given properties key and the given value that can be null if it shell be ignored.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 * @return the list of the found {@link Resourcebundles} objects.
	 */
	List<Resourcebundles> find(final String baseName, final String locale, final String key,
		final String value);

	/**
	 * Find a list of {@link Resourcebundles} objects from the given baseName and the given
	 * {@link Locale} object.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @return the list of the found {@link Resourcebundles} objects.
	 */
	List<Resourcebundles> findResourceBundles(final String baseName, final Locale locale);

	/**
	 * Find a list of {@link Resourcebundles} objects from the given {@link BundleNames} object.
	 *
	 * @param bundleName
	 *            the bundle name
	 * @return the list of the found {@link Resourcebundles} objects.
	 */
	List<Resourcebundles> findResourceBundles(final BundleNames bundleName);

	/**
	 * Find a list of {@link Resourcebundles} objects from the given baseName, the given
	 * {@link Locale} object and the given properties key.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @param key
	 *            the properties key
	 * @return the list of the found {@link Resourcebundles} objects.
	 */
	List<Resourcebundles> findResourceBundles(final String baseName, final Locale locale,
		final String key);

	/**
	 * Get the {@link Properties} object from the given baseName and the given {@link Locale}
	 * object.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @return the found {@link Properties} object.
	 */
	Properties getProperties(final String baseName, final Locale locale);

	/**
	 * Get the {@link Properties} object from given {@link BundleNames} object.
	 *
	 * @param bundleName
	 *            the bundle name
	 * @return the found {@link Properties} object.
	 */
	Properties getProperties(final BundleNames bundleName);

	/**
	 * Get the {@link Properties} object from the given baseName and the given locale code as
	 * {@link String} object.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @return the found {@link Properties} object.
	 */
	Properties getProperties(final String baseName, final String locale);

	/**
	 * Gets the {@link Resourcebundles} object entry from the the given baseName, the given
	 * {@link Locale} object and the given properties key.
	 *
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @param key
	 *            the properties key
	 * @return the found {@link Resourcebundles} object
	 */
	Resourcebundles getResourcebundle(final String baseName, final Locale locale, final String key);

	/**
	 * Import the given list with {@linkplain KeyValuePair} objects as properties file as key and
	 * the locale string code as value.
	 *
	 * @param bundleApplication
	 *            the bundle application that will be the owner of the given properties.
	 * @param foundProperties
	 *            the found properties
	 * @return the list with the {@link BundleNames} that was created.
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	List<BundleNames> importProperties(BundleApplications bundleApplication,
		List<KeyValuePair<File, Locale>> foundProperties) throws IOException;

	/**
	 * Save or update the given resource bundle entry.
	 *
	 * @param bundleName
	 *            the bundle name
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 * @param update
	 *            the update
	 */
	Resourcebundles saveOrUpdateEntry(final BundleNames bundleName, final String baseName,
		final Locale locale, final String key, final String value, final boolean update);

	/**
	 * Update the given {@link Properties} object to the underlying database with the given baseName
	 * and the given {@link Locale} object.
	 *
	 * @param properties
	 *            the properties
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 */
	BundleNames updateProperties(final Properties properties, final String baseName,
		final Locale locale);

	/**
	 * Update the given {@link Properties} object to the underlying database with the given baseName
	 * and the given {@link Locale} object.
	 *
	 * @param properties
	 *            the properties
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @param update
	 *            flag that indicates if an existing property shell be updated
	 */
	BundleNames updateProperties(final Properties properties, final String baseName,
		final Locale locale, final boolean update);

	/**
	 * Update the given {@link Properties} object to the underlying database with the given owner
	 * and the given baseName and the given {@link Locale} object.
	 *
	 * @param owner
	 *            the owner
	 * @param properties
	 *            the properties
	 * @param baseName
	 *            the base name
	 * @param locale
	 *            the locale
	 * @return the bundle names
	 */
	BundleNames updateProperties(final BundleApplications owner, final Properties properties,
		final String baseName, final Locale locale);

}