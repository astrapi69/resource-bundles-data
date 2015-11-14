package de.alpharogroup.db.resource.bundles.rest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.alpharogroup.db.resource.bundles.domain.Resourcebundle;
import de.alpharogroup.service.rs.RestfulResource;

/**
 * The interface {@link ResourcebundlesResource} provides methods for resolving resource bundles.
 */
@Path("/resourcebundle/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ResourcebundlesResource extends RestfulResource<Integer, Resourcebundle>
{

    /**
     * Gets the {@link Resourcebundle} from the given id.
     *
     * @param id the id
     * @return the {@link Resourcebundle}
     */
    @GET
    @Path("/get/{id}")  
	Resourcebundle get(@PathParam("id")String id);

    /**
     * Find the {@link Resourcebundle} from the given arguments.
     *
     * @param baseName the base name
     * @param locale the locale
     * @param key the key
     * @return the {@link Resourcebundle}
     */
    @GET
    @Path("/find/{basename}/{locale}/{key}") 
	Resourcebundle find(@PathParam("basename")String baseName, @PathParam("locale")String locale, @PathParam("key")String key);

    /**
     * Find the {@link String} from the given arguments.
     *
     * @param baseName the base name
     * @param locale the locale
     * @param key the key
     * @return the {@link String}
     */
    @GET
    @Path("/get/string/{basename}/{locale}/{key}") 
    String getString(@PathParam("basename")String baseName, @PathParam("locale")String locale, @PathParam("key")String key);

    /**
     * Find the {@link String} from the given arguments.
     *
     * @param baseName the base name
     * @param locale the locale
     * @param key the key
     * @return the {@link String}
     */
    @POST
    @Path("/get/string/{basename}/{locale}/{key}/{params}") 
    String getString(@PathParam("basename")String baseName, @PathParam("locale")String locale, @PathParam("key")String key, @PathParam("params")Object[] params);

}