package de.alpharogroup.db.resource.bundles.db.init;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.alpharogroup.db.resource.bundles.entities.LanguageLocales;
import de.alpharogroup.db.resource.bundles.entities.Languages;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DataObjectFactory
{

	public static List<Languages> newLanguageList() {
		final Map<String, String> languagesMap = new LinkedHashMap<>();
		languagesMap.put("ab", "Abkhaz");
		languagesMap.put("aa", "Afar");
		languagesMap.put("af", "Afrikaans");
		languagesMap.put("ak", "Akan");
		languagesMap.put("sq", "Albanian");
		languagesMap.put("am", "Amharic");
		languagesMap.put("ar", "Arabic");
		languagesMap.put("an", "Aragonese");
		languagesMap.put("hy", "Armenian");
		languagesMap.put("as", "Assamese");
		languagesMap.put("av", "Avaric");
		languagesMap.put("ae", "Avestan");
		languagesMap.put("ay", "Aymara");
		languagesMap.put("az", "Azerbaijani");
		languagesMap.put("bm", "Bambara");
		languagesMap.put("ba", "Bashkir");
		languagesMap.put("eu", "Basque");
		languagesMap.put("be", "Belarusian");
		languagesMap.put("bn", "Bengali, Bangla");
		languagesMap.put("bh", "Bihari");
		languagesMap.put("bi", "Bislama");
		languagesMap.put("bs", "Bosnian");
		languagesMap.put("br", "Breton");
		languagesMap.put("bg", "Bulgarian");
		languagesMap.put("my", "Burmese");
		languagesMap.put("ca", "Catalan");
		languagesMap.put("ch", "Chamorro");
		languagesMap.put("ce", "Chechen");
		languagesMap.put("ny", "Chichewa, Chewa, Nyanja");
		languagesMap.put("zh", "Chinese");
		languagesMap.put("cv", "Chuvash");
		languagesMap.put("kw", "Cornish");
		languagesMap.put("co", "Corsican");
		languagesMap.put("cr", "Cree");
		languagesMap.put("hr", "Croatian");
		languagesMap.put("cs", "Czech");
		languagesMap.put("da", "Danish");
		languagesMap.put("dv", "Divehi, Dhivehi, Maldivian");
		languagesMap.put("nl", "Dutch");
		languagesMap.put("dz", "Dzongkha");
		languagesMap.put("en", "English");
		languagesMap.put("eo", "Esperanto");
		languagesMap.put("et", "Estonian");
		languagesMap.put("ee", "Ewe");
		languagesMap.put("fo", "Faroese");
		languagesMap.put("fj", "Fijian");
		languagesMap.put("fi", "Finnish");
		languagesMap.put("fr", "French");
		languagesMap.put("ff", "Fula, Fulah, Pulaar, Pular");
		languagesMap.put("gl", "Galician");
		languagesMap.put("ka", "Georgian");
		languagesMap.put("de", "German");
		languagesMap.put("el", "Greek (modern)");
		languagesMap.put("gn", "Guaraní");
		languagesMap.put("gu", "Gujarati");
		languagesMap.put("ht", "Haitian, Haitian Creole");
		languagesMap.put("ha", "Hausa");
		languagesMap.put("he", "Hebrew (modern)");
		languagesMap.put("hz", "Herero");
		languagesMap.put("hi", "Hindi");
		languagesMap.put("ho", "Hiri Motu");
		languagesMap.put("hu", "Hungarian");
		languagesMap.put("ia", "Interlingua");
		languagesMap.put("id", "Indonesian");
		languagesMap.put("ie", "Interlingue");
		languagesMap.put("ga", "Irish");
		languagesMap.put("ig", "Igbo");
		languagesMap.put("ik", "Inupiaq");
		languagesMap.put("io", "Ido");
		languagesMap.put("is", "Icelandic");
		languagesMap.put("it", "Italian");
		languagesMap.put("iu", "Inuktitut");
		languagesMap.put("ja", "Japanese");
		languagesMap.put("jv", "Javanese");
		languagesMap.put("kl", "Kalaallisut, Greenlandic");
		languagesMap.put("kn", "Kannada");
		languagesMap.put("kr", "Kanuri");
		languagesMap.put("ks", "Kashmiri");
		languagesMap.put("kk", "Kazakh");
		languagesMap.put("km", "Khmer");
		languagesMap.put("ki", "Kikuyu, Gikuyu");
		languagesMap.put("rw", "Kinyarwanda");
		languagesMap.put("ky", "Kyrgyz");
		languagesMap.put("kv", "Komi");
		languagesMap.put("kg", "Kongo");
		languagesMap.put("ko", "Korean");
		languagesMap.put("ku", "Kurdish");
		languagesMap.put("kj", "Kwanyama, Kuanyama");
		languagesMap.put("la", "Latin");
		languagesMap.put("lb", "Luxembourgish, Letzeburgesch");
		languagesMap.put("lg", "Ganda");
		languagesMap.put("li", "Limburgish, Limburgan, Limburger");
		languagesMap.put("ln", "Lingala");
		languagesMap.put("lo", "Lao");
		languagesMap.put("lt", "Lithuanian");
		languagesMap.put("lu", "Luba-Katanga");
		languagesMap.put("lv", "Latvian");
		languagesMap.put("gv", "Manx");
		languagesMap.put("mk", "Macedonian");
		languagesMap.put("mg", "Malagasy");
		languagesMap.put("ms", "Malay");
		languagesMap.put("ml", "Malayalam");
		languagesMap.put("mt", "Maltese");
		languagesMap.put("mi", "M?ori");
		languagesMap.put("mr", "Marathi");
		languagesMap.put("mh", "Marshallese");
		languagesMap.put("mn", "Mongolian");
		languagesMap.put("na", "Nauruan");
		languagesMap.put("nv", "Navajo, Navaho");
		languagesMap.put("nd", "Northern Ndebele");
		languagesMap.put("ne", "Nepali");
		languagesMap.put("ng", "Ndonga");
		languagesMap.put("nb", "Norwegian Bokmål");
		languagesMap.put("nn", "Norwegian Nynorsk");
		languagesMap.put("no", "Norwegian");
		languagesMap.put("ii", "Nuosu");
		languagesMap.put("nr", "Southern Ndebele");
		languagesMap.put("oc", "Occitan");
		languagesMap.put("oj", "Ojibwe, Ojibwa");
		languagesMap.put("cu", "Old Church Slavonic, Church Slavonic, Old Bulgarian");
		languagesMap.put("om", "Oromo");
		languagesMap.put("or", "Oriya");
		languagesMap.put("os", "Ossetian, Ossetic");
		languagesMap.put("pa", "Panjabi, Punjabi");
		languagesMap.put("pi", "P?li");
		languagesMap.put("fa", "Persian (Farsi)");
		languagesMap.put("pl", "Polish");
		languagesMap.put("ps", "Pashto, Pushto");
		languagesMap.put("pt", "Portuguese");
		languagesMap.put("qu", "Quechua");
		languagesMap.put("rm", "Romansh");
		languagesMap.put("rn", "Kirundi");
		languagesMap.put("rc", "Reunionese, Reunion Creole");
		languagesMap.put("ro", "Romanian");
		languagesMap.put("ru", "Russian");
		languagesMap.put("sa", "Sanskrit");
		languagesMap.put("sc", "Sardinian");
		languagesMap.put("sd", "Sindhi");
		languagesMap.put("se", "Northern Sami");
		languagesMap.put("sm", "Samoan");
		languagesMap.put("sg", "Sango");
		languagesMap.put("sr", "Serbian");
		languagesMap.put("gd", "Scottish Gaelic, Gaelic");
		languagesMap.put("sn", "Shona");
		languagesMap.put("si", "Sinhalese, Sinhala");
		languagesMap.put("sk", "Slovak");
		languagesMap.put("sl", "Slovene");
		languagesMap.put("so", "Somali");
		languagesMap.put("st", "Southern Sotho");
		languagesMap.put("es", "Spanish");
		languagesMap.put("su", "Sundanese");
		languagesMap.put("sw", "Swahili");
		languagesMap.put("ss", "Swati");
		languagesMap.put("sv", "Swedish");
		languagesMap.put("ta", "Tamil");
		languagesMap.put("te", "Telugu");
		languagesMap.put("tg", "Tajik");
		languagesMap.put("th", "Thai");
		languagesMap.put("ti", "Tigrinya");
		languagesMap.put("bo", "Tibetan Standard, Tibetan, Central");
		languagesMap.put("tk", "Turkmen");
		languagesMap.put("tl", "Tagalog");
		languagesMap.put("tn", "Tswana");
		languagesMap.put("to", "Tonga (Tonga Islands)");
		languagesMap.put("tr", "Turkish");
		languagesMap.put("ts", "Tsonga");
		languagesMap.put("tt", "Tatar");
		languagesMap.put("tw", "Twi");
		languagesMap.put("ty", "Tahitian");
		languagesMap.put("ug", "Uyghur");
		languagesMap.put("uk", "Ukrainian");
		languagesMap.put("ur", "Urdu");
		languagesMap.put("uz", "Uzbek");
		languagesMap.put("ve", "Venda");
		languagesMap.put("vi", "Vietnamese");
		languagesMap.put("vo", "Volapük");
		languagesMap.put("wa", "Walloon");
		languagesMap.put("cy", "Welsh");
		languagesMap.put("wo", "Wolof");
		languagesMap.put("fy", "Western Frisian");
		languagesMap.put("xh", "Xhosa");
		languagesMap.put("yi", "Yiddish");
		languagesMap.put("yo", "Yoruba");
		languagesMap.put("za", "Zhuang, Chuang");
		languagesMap.put("zu", "Zulu");

		final List<Languages> languages = new ArrayList<>();
		for (final Map.Entry<String, String> entry : languagesMap.entrySet())
		{
			languages.add(Languages.builder().name(entry.getValue()).iso639Dash1(entry.getKey()).build());
		}
		return languages;
	}

	public static List<LanguageLocales> newLanguageLocales() {
		final List<LanguageLocales> languageLocales = new ArrayList<>();
		languageLocales.add(LanguageLocales.builder().locale("en").build());
		languageLocales.add(LanguageLocales.builder().locale("en_GB").build());
		languageLocales.add(LanguageLocales.builder().locale("en_US").build());
		languageLocales.add(LanguageLocales.builder().locale("de").build());
		languageLocales.add(LanguageLocales.builder().locale("de_AT").build());
		languageLocales.add(LanguageLocales.builder().locale("de_CH").build());
		languageLocales.add(LanguageLocales.builder().locale("de_DE").build());
		languageLocales.add(LanguageLocales.builder().locale("es").build());
		languageLocales.add(LanguageLocales.builder().locale("es_ES").build());
		languageLocales.add(LanguageLocales.builder().locale("fr").build());
		languageLocales.add(LanguageLocales.builder().locale("fr_BE").build());
		languageLocales.add(LanguageLocales.builder().locale("fr_CH").build());
		languageLocales.add(LanguageLocales.builder().locale("fr_FR").build());
		languageLocales.add(LanguageLocales.builder().locale("it").build());
		languageLocales.add(LanguageLocales.builder().locale("it_IT").build());
		languageLocales.add(LanguageLocales.builder().locale("nl").build());
		languageLocales.add(LanguageLocales.builder().locale("nl_BE").build());
		languageLocales.add(LanguageLocales.builder().locale("nl_NL").build());
		return languageLocales;
	}
}
