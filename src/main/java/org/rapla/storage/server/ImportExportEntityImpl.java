package org.rapla.storage.server;

import org.rapla.entities.RaplaType;
import org.rapla.entities.storage.internal.SimpleEntity;

public class ImportExportEntityImpl extends SimpleEntity implements ImportExportEntity
{

    public static final RaplaType<ImportExportEntity> raplaType = new RaplaType<>(ImportExportEntity.class, "IMPORT_EXPORT");
    private int direction;
    private String context;
    private String data;
    private String raplaId;
    private String externalSystem;

    public ImportExportEntityImpl()
    {
    }

    @Override
    public RaplaType<ImportExportEntity> getRaplaType()
    {
        return raplaType;
    }

    @Override
    public ImportExportEntity clone()
    {
        ImportExportEntityImpl newImportExportEntity = new ImportExportEntityImpl();
        super.deepClone(newImportExportEntity);
        newImportExportEntity.context = context;
        newImportExportEntity.data = data;
        newImportExportEntity.direction = direction;
        newImportExportEntity.externalSystem = externalSystem;
        newImportExportEntity.raplaId = raplaId;
        return newImportExportEntity;
    }

    @Override
    public String getExternalSystem()
    {
        return externalSystem;
    }

    @Override
    public String getRaplaId()
    {
        return raplaId;
    }

    @Override
    public String getData()
    {
        return data;
    }

    @Override
    public String getContext()
    {
        return context;
    }

    @Override
    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    public void setContext(String context)
    {
        this.context = context;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public void setRaplaId(String raplaId)
    {
        this.raplaId = raplaId;
    }

    public void setExternalSystem(String externalSystem)
    {
        this.externalSystem = externalSystem;
    }

}
