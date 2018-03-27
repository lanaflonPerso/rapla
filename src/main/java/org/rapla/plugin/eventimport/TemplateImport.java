package org.rapla.plugin.eventimport;

import org.rapla.framework.RaplaException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path( "templateimport" )
public interface TemplateImport
{
    String BEGIN_KEY = "DatumVon";
    String STORNO_KEY = "StorniertAm";
    String PRIMARY_KEY = "Seminarnummer";
    String TEMPLATE_KEY = "TitelName";

    @POST
    @Path("importFromServer")
    ParsedTemplateResult importFromServer() throws RaplaException;
}
