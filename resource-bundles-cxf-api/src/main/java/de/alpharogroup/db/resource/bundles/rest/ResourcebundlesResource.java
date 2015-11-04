package de.alpharogroup.db.resource.bundles.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import de.alpharogroup.db.resource.bundles.domain.Resourcebundle;
import de.alpharogroup.db.resource.bundles.service.mapper.ResourcebundleService;
import de.alpharogroup.db.service.rs.AbstractRestfulResource;

@Component
@Path("/resourcebundle/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResourcebundlesResource extends AbstractRestfulResource<Integer, Resourcebundle, ResourcebundleService>
{
    
    @GET
    @Path("/get/{id}")   
    public Resourcebundle get(@PathParam("id")String id) {
    	Resourcebundle resourcebundle = getBusinessMapperService().read(Integer.valueOf(id));
    	return resourcebundle;
    }    
    
    @GET
    @Path("/find/{basename}/{locale}/{key}") 
    public Resourcebundle find(@PathParam("basename")String baseName, @PathParam("locale")String locale, @PathParam("key")String key) {
    	Resourcebundle resourcebundle = getBusinessMapperService().find(baseName, locale, key);
    	return resourcebundle;    	
    }    

}
