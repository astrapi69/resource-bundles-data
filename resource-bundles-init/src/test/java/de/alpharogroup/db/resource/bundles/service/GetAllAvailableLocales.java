package de.alpharogroup.db.resource.bundles.service;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetAllAvailableLocales
{

	public static void main(String[] args)
	{
		final Locale poolArray[] = DateFormat.getAvailableLocales();
		for (int i = 0; i < poolArray.length; i++)
		{
			final Locale locale = poolArray[i];
			final String englishName = locale.getDisplayName(Locale.ENGLISH);
			final String country = locale.getCountry();
			String iSO3Country = "";
			try
			{
				iSO3Country = locale.getISO3Country();
			}
			catch (final Exception e)
			{
				log.error(e.getClass().getName()+ ": " +e.getMessage());
			}
			final String englishCountryName = locale.getDisplayCountry(Locale.ENGLISH);

			final String language = locale.getLanguage();
			final String iSO3Language = locale.getISO3Language();
			final String englishLanguageName = locale.getDisplayLanguage(Locale.ENGLISH);

			final String script = locale.getScript();
			final String englishScript = locale.getDisplayScript(Locale.ENGLISH);

			System.out.printf(
				"Name: %s%n" +
			"Country: %s; %s - %s%n" + ""
				+ "Language: %s; %s - %s%n"
					+ "Script: %s - %s%n",
				englishName,
				country, iSO3Country, englishCountryName,
				language, iSO3Language, englishLanguageName,
				script, englishScript);
		}

		System.out.println("poolArray.length:"+poolArray.length);

	}

	/**
	 * Returns a list of all available locales on the current os.
	 *
	 * @return list of all available locales on the current os.
	 */
	public static List<Locale> getAvailableLocales()
	{
		final Locale poolArray[] = DateFormat.getAvailableLocales();
		return Arrays.asList(poolArray);
	}

}
