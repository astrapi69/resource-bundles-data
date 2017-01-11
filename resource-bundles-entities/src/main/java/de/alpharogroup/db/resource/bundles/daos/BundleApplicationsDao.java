package de.alpharogroup.db.resource.bundles.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.db.resource.bundles.entities.BundleApplications;
import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;

import lombok.Getter;
import lombok.Setter;

@Repository("bundleApplicationsDao")
public class BundleApplicationsDao extends JpaEntityManagerDao<BundleApplications, Integer>{

	private static final long serialVersionUID = 1L;

	/** The entity manager. */
	@PersistenceContext
	@Getter
	@Setter
	private EntityManager entityManager;

}
