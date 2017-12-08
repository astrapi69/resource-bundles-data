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
package de.alpharogroup.db.resource.bundles.service;

import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.db.resource.bundles.domain.BundleApplication;
import de.alpharogroup.db.resource.bundles.domain.Resourcebundle;
import de.alpharogroup.db.resource.bundles.entities.BundleApplications;
import de.alpharogroup.db.resource.bundles.entities.Resourcebundles;
import de.alpharogroup.db.resource.bundles.mapper.ResourcebundlesMapper;
import de.alpharogroup.db.resource.bundles.repositories.ResourcebundlesRepository;
import de.alpharogroup.db.resource.bundles.service.api.ResourcebundleService;
import de.alpharogroup.db.resource.bundles.service.api.ResourcebundlesService;
import de.alpharogroup.resourcebundle.locale.BundleKey;
import de.alpharogroup.service.domain.AbstractDomainService;

/**
 * The class {@link ResourcebundleDomainService}.
 */
@Transactional
@Service("resourcebundleDomainService")
public class ResourcebundleDomainService
	extends
		AbstractDomainService<Integer, Resourcebundle, Resourcebundles, ResourcebundlesRepository, ResourcebundlesMapper>
	implements
		ResourcebundleService
{

	@Autowired
	private ResourcebundlesService resourcebundlesService;
//
//	private final CacheableMap<String, String, DatabaseListResourceBundle> cache = new CacheableMap<String, String, DatabaseListResourceBundle>()
//	{
//
//		@Override
//		public DatabaseListResourceBundle newValue(final String baseName, final String locale)
//		{
//			return new DatabaseListResourceBundle(baseName, LocaleResolver.resolveLocale(locale),
//				resourcebundlesService);
//		}
//	};
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public Resourcebundle contains(final String baseName, final Locale locale, final String key)
//	{
//		return find(baseName, locale, key);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public Resourcebundle find(final String baseName, final Locale locale, final String key)
//	{
//		return find(baseName, LocaleExtensions.getLocaleFilenameSuffix(locale), key);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public Resourcebundle find(final String baseName, final String locale, final String key)
//	{
//		return ListExtensions.getFirst(find(baseName, locale, key, null));
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	@SuppressWarnings("unchecked")
//	public List<Resourcebundle> find(final String baseName, final String locale, final String key,
//		final String value)
//	{
//		final String hqlString = HqlStringCreator.forResourcebundles(baseName, locale, key);
//		final Query query = getRepository().getQuery(hqlString);
//		if (baseName != null && !baseName.isEmpty())
//		{
//			query.setParameter("baseName", baseName);
//		}
//		if (locale != null && !locale.isEmpty())
//		{
//			query.setParameter("locale", locale);
//		}
//		if (key != null && !key.isEmpty())
//		{
//			query.setParameter("key", key);
//		}
//		if (value != null && !value.isEmpty())
//		{
//			query.setParameter("value", value);
//		}
//		final List<Resourcebundles> entities = query.getResultList();
//		final List<Resourcebundle> bos = getMapper().toDomainObjects(entities);
//		return bos;
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Deprecated
//	@Override
//	public List<Resourcebundle> findResourceBundles(final String baseName, final Locale locale)
//	{
//		return null;
//	}
//
//	private DatabaseListResourceBundle getDatabaseListResourceBundle(final String baseName,
//		final String locale)
//	{
//		return cache.getValue(baseName, locale);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public Properties getProperties(final String baseName, final Locale locale)
//	{
//		return resourcebundlesService.getProperties(baseName, locale);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public Properties getProperties(final String baseName, final String locale)
//	{
//		return resourcebundlesService.getProperties(baseName, locale);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public Resourcebundle getResourcebundle(final String baseName, final Locale locale,
//		final String key)
//	{
//		return find(baseName, locale, key);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public String getString(final BundleKey bundleKey)
//	{
//		return getString(bundleKey.getBaseName(),
//			LocaleExtensions.getLocaleFilenameSuffix(bundleKey.getLocale()),
//			bundleKey.getResourceBundleKey().getKey(),
//			bundleKey.getResourceBundleKey().getDefaultValue(),
//			bundleKey.getResourceBundleKey().getParameters());
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public String getString(final String baseName, final String locale, final String key)
//	{
//		return getString(baseName, locale, key, null, null);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public String getString(final String baseName, final String locale, final String key,
//		final Object[] params)
//	{
//		return getString(baseName, locale, key, null, params);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public String getString(final String baseName, final String locale, final String key,
//		final String defaultValue)
//	{
//		return getString(baseName, locale, key, defaultValue, null);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public String getString(final String baseName, final String locale, final String key,
//		final String defaultValue, final Object[] params)
//	{
//		final DatabaseListResourceBundle listResourceBundle = getDatabaseListResourceBundle(
//			baseName, locale);
//		final String value = ResourceBundleExtensions.getString(listResourceBundle, key,
//			defaultValue, params);
//		return value;
//	}

	/**
	 * Sets the specific {@link ResourcebundlesMapper}.
	 *
	 * @param mapper
	 *            the new {@link ResourcebundlesMapper}.
	 */
	@Autowired
	public void setResourcebundlesMapper(ResourcebundlesMapper mapper)
	{
		setMapper(mapper);
	}

	@Autowired
	public void setResourcebundlesRepository(final ResourcebundlesRepository repository)
	{
		setRepository(repository);
	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public void updateProperties(final Properties properties, final String baseName,
//		final Locale locale)
//	{// TODO change with appropriate bundleApp
//		resourcebundlesService.updateProperties(null, properties, baseName, locale);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public void updateProperties(final Properties properties, final String baseName,
//		final Locale locale, final boolean update)
//	{// TODO change with appropriate bundleApp
//		// resourcebundlesService.updateProperties(null, properties, baseName, locale, update);
//	}

	@Override
	public Resourcebundle contains(BundleApplication bundleApplication, String baseName,
		Locale locale, String key)
	{

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resourcebundle find(BundleApplication bundleApplication, String baseName, Locale locale,
		String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resourcebundle> find(BundleApplication bundleApplication, String baseName,
		String locale, String key, String value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resourcebundle> findResourceBundles(BundleApplication bundleApplication,
		String baseName, Locale locale)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getProperties(BundleApplication bundleApplication, String baseName,
		Locale locale)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getProperties(BundleApplication bundleApplication, String baseName,
		String locale)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resourcebundle getResourcebundle(BundleApplication bundleApplication, String baseName,
		Locale locale, String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(BundleApplication bundleApplication, BundleKey bundleKey)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(BundleApplication bundleApplication, String baseName, String locale,
		String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(BundleApplication bundleApplication, String baseName, String locale,
		String key, Object[] params)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(BundleApplication bundleApplication, String baseName, String locale,
		String key, String defaultValue)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(BundleApplication bundleApplication, String baseName, String locale,
		String key, String defaultValue, Object[] params)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProperties(BundleApplication bundleApplication, Properties properties,
		String baseName, Locale locale)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProperties(BundleApplication bundleApplication, Properties properties,
		String baseName, Locale locale, boolean update)
	{
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BundleApplication find(String name)
	{
		final BundleApplications bundleApplications = resourcebundlesService.find(name);
		final BundleApplication bundleApplication = getMapper().map(bundleApplications, BundleApplication.class);
		return bundleApplication;
	}



}
