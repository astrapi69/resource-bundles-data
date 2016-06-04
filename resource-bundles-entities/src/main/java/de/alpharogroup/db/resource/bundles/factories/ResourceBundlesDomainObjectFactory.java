package de.alpharogroup.db.resource.bundles.factories;

import java.io.Serializable;
import java.util.Locale;

import de.alpharogroup.db.resource.bundles.entities.BaseNames;
import de.alpharogroup.db.resource.bundles.entities.BundleNames;
import de.alpharogroup.db.resource.bundles.entities.DefaultLocaleBaseNamemMap;
import de.alpharogroup.db.resource.bundles.entities.LanguageLocales;
import de.alpharogroup.db.resource.bundles.entities.PropertiesKeys;
import de.alpharogroup.db.resource.bundles.entities.Resourcebundles;
import de.alpharogroup.resourcebundle.locale.LocaleExtensions;

/**
 * A factory for creating Domain objects for the resource bundles.
 */
public class ResourceBundlesDomainObjectFactory implements Serializable {

	/** The Constant instance. */
	private static final ResourceBundlesDomainObjectFactory instance = new ResourceBundlesDomainObjectFactory();

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Gets the single instance of MessageSystemFactory.
	 * 
	 * @return single instance of MessageSystemFactory
	 */
	public static ResourceBundlesDomainObjectFactory getInstance() {
		return instance;
	}

	/**
	 * Instantiates a new MessageSystemFactory object.
	 */
	private ResourceBundlesDomainObjectFactory() {
		super();
	}

	/**
	 * Factory method for create a new {@link Resourcebundles}.
	 *
	 * @param baseName the bundlename
	 * @param locale the locale
	 * @param propertieskey the propertieskey
	 * @param value the value
	 * @return the new {@link Resourcebundles}
	 */
	public Resourcebundles newResourcebundles(String baseName, String locale, String propertieskey,
			String value) {
		Resourcebundles resourcebundles = new Resourcebundles();
		resourcebundles.setBundleName(newBundleName(baseName, locale));
		resourcebundles.setKey(newPropertiesKeys(propertieskey));
		resourcebundles.setValue(value);
		return resourcebundles;
	}

	/**
	 * Factory method for create a new {@link Resourcebundles}.
	 *
	 * @param baseName the bundlename
	 * @param locale the locale
	 * @param propertieskey the propertieskey
	 * @param value the value
	 * @return the new {@link Resourcebundles}
	 */
	public Resourcebundles newResourcebundles(String baseName, Locale locale, String propertieskey,
			String value) {
		Resourcebundles resourcebundles = new Resourcebundles();
		resourcebundles.setBundleName(newBundleName(baseName, locale));
		resourcebundles.setKey(newPropertiesKeys(propertieskey));
		resourcebundles.setValue(value);
		return resourcebundles;
	}
	
	/**
	 * Factory method for create a new {@link BundleNames}.
	 *
	 * @param baseName the base name
	 * @param locale the locale
	 * @return the new {@link BundleNames}
	 */
	public BundleNames newBundleName(String baseName, Locale locale) {		
		return newBundleName(baseName, LocaleExtensions.getLocaleFilenameSuffix(locale));
	}

	/**
	 * Factory method for create a new {@link BundleNames}.
	 *
	 * @param baseName the base name
	 * @param locale the locale
	 * @return the new {@link BundleNames}
	 */
	public BundleNames newBundleName(String baseName, String locale) {
		BundleNames bundleNames = new BundleNames();
		bundleNames.setBaseName(newBaseNames(baseName));
		bundleNames.setLocale(newLanguageLocales(locale));
		return bundleNames;
	}
	
	/**
	 * Factory method for create a new {@link LanguageLocales}.
	 *
	 * @param locale the locale
	 * 
	 * @return the new {@link LanguageLocales}
	 */
	public LanguageLocales newLanguageLocales(String locale) {
		LanguageLocales languageLocales = new LanguageLocales();
		languageLocales.setLocale(locale);
		return languageLocales;
	}
	
	
	/**
	 * Factory method for create a new {@link LanguageLocales}.
	 *
	 * @param locale the {@link Locale} object.
	 * 
	 * @return the new {@link LanguageLocales}
	 */
	public LanguageLocales newLanguageLocales(Locale locale) {
		LanguageLocales languageLocales = new LanguageLocales();
		languageLocales.setLocale(LocaleExtensions.getLocaleFilenameSuffix(locale));
		return languageLocales;
	}
	
	/**
	 * Factory method for create a new {@link DefaultLocaleBaseNamemMap}.
	 *
	 * @param bundleName the {@link BundleNames} object
	 * @param defaultLocale the default {@link LanguageLocales} object for the given {@link BundleNames} object
	 * 
	 * @return the new {@link DefaultLocaleBaseNamemMap}
	 */
	public DefaultLocaleBaseNamemMap newDefaultLocaleForBaseName(BundleNames bundleName, LanguageLocales defaultLocale) {
		DefaultLocaleBaseNamemMap defaultLocaleForBaseName = new DefaultLocaleBaseNamemMap();
		defaultLocaleForBaseName.setBundleName(bundleName);
		defaultLocaleForBaseName.setDefaultLocale(defaultLocale);
		return defaultLocaleForBaseName;
	}
	
	/**
	 * Factory method for create a new {@link BaseNames}.
	 *
	 * @param name the name
	 * 
	 * @return the new {@link BaseNames}
	 */
	public BaseNames newBaseNames(String name) {
		BaseNames baseName = new BaseNames();
		baseName.setName(name);
		return baseName;
	}
	
	/**
	 * Factory method for create a new {@link PropertiesKeys}.
	 *
	 * @param name the name
	 * 
	 * @return the new {@link PropertiesKeys}
	 */
	public PropertiesKeys newPropertiesKeys(String name){
		PropertiesKeys propertiesKeys = new PropertiesKeys();
		propertiesKeys.setName(name);
		return propertiesKeys;
	}

}