package fr.opensagres.xdocreport.remoting.repository.services;

import java.util.List;

import fr.opensagres.xdocreport.remoting.repository.domain.Filter;
import fr.opensagres.xdocreport.remoting.repository.domain.ResourceContent;
import fr.opensagres.xdocreport.remoting.repository.domain.ResourceMetadata;

public class DelegateRepositoryService
    implements IRepositoryService
{

    public String getName()
    {
        return getDelegate().getName();
    }

    public List<ResourceMetadata> getMetadatas()
    {
        return getDelegate().getMetadatas();
    }

    public List<ResourceMetadata> getMetadatas( Filter filter )
    {
        return getDelegate().getMetadatas( filter );
    }

    public ResourceMetadata getMetadata( String resourceId )
    {
        return getDelegate().getMetadata( resourceId );
    }

    public ResourceMetadata getMetadata( String resourceId, Filter filter )
    {
        return getDelegate().getMetadata( resourceId, filter );
    }

    public ResourceContent download( String resourceId )
    {
        return getDelegate().download( resourceId );
    }

    public ResourceContent download( String resourceId, Filter filter )
    {
        return getDelegate().download( resourceId, filter );
    }

    public void upload( ResourceContent content )
    {
        getDelegate().upload( content );
    }

    private IRepositoryService getDelegate()
    {
        // TODO : manage implementation with SPI
        // By default it's XDocReportRepositoryService.
        return XDocReportRepositoryService.getDefault();
    }

}