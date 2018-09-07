/**
 * The MIT License
 *
 * Copyright (C) 2007 - 2015 Asterios Raptis
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

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import de.alpharogroup.db.resource.bundles.entities.Languages;
import de.alpharogroup.file.read.ReadFileExtensions;
import de.alpharogroup.file.search.PathFinder;


/**
 * The class {@link ResourcebundlesBusinessServiceH2Test}.
 */
@ContextConfiguration(locations = "classpath:test-h2-applicationContext.xml")
public class ResourcebundlesBusinessServiceH2Test extends AbstractResourcebundlesBusinessServiceTest
{


	@Override
	@Test(enabled = true)
	public void testBundleApplicationsWithSameNameResourceBundles()
	{
		super.testBundleApplicationsWithSameNameResourceBundles();
	}

	@Test(enabled = true)
	@Transactional
	public void testCountries() throws IOException
	{
		final File projectDir = PathFinder.getProjectDirectory();
		final File mergeSqlFile = PathFinder.getRelativePathTo(projectDir, "/",
			"src/main/resources/dll/inserts", "merge_languages_H2.sql");
		List<Languages> all = languagesService.findAll();

		String sqlString = ReadFileExtensions.readFromFile(mergeSqlFile);
		EntityTransaction tx = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query nativeQuery = entityManager.createNativeQuery(sqlString);
		tx = entityManager.getTransaction();
		tx.begin();
		nativeQuery.executeUpdate();
		tx.commit();
		all = languagesService.findAll();
		System.out.println(all);
	}

	@Override
	@Test(enabled = true)
	public void testDeleteBundleApplications()
	{
		super.testDeleteBundleApplications();
	}

	@Override
	@Test(enabled = true)
	public void testFindBundleApplications()
	{
		super.testFindBundleApplications();
	}

	@Override
	@Test(enabled = true)
	public void testFindBundleNames()
	{
		super.testFindBundleNames();
	}

	@Override
	@Test(enabled = true)
	public void testFindLanguageLocales()
	{
		super.testFindLanguageLocales();
	}

	@Override
	@Test(enabled = true)
	public void testFindResourceBundles()
	{
		super.testFindResourceBundles();
	}

	@Test(enabled = true)
	@Override
	public void testSupportedLanguageLocales()
	{
		super.testSupportedLanguageLocales();
	}

	@Override
	@Test(enabled = true)
	public void testUpdateProperties() throws URISyntaxException, IOException
	{
		super.testUpdateProperties();
	}

	@Override
	@Test(enabled = false)
	public void testUpdatePropertiesUpdate() throws URISyntaxException, IOException
	{
		super.testUpdatePropertiesUpdate();
	}
}
