
package pt.webdetails.cdf.dd.model.meta.validation;

import org.apache.commons.lang.StringUtils;
import pt.webdetails.cdf.dd.model.meta.Resource;

/**
 * @author dcleao
 */
public final class ComponentTypeDuplicateResourceError extends ComponentTypeError
{
  private final Resource.Type _resourceType;
  private final String _resourceName;

  public ComponentTypeDuplicateResourceError(String componentTypeLabel, Resource.Type resourceType, String resourceName)
  {
    super(componentTypeLabel);

    if(resourceType == null) { throw new IllegalArgumentException("resourceType"); }
    if(StringUtils.isEmpty(resourceName)) { throw new IllegalArgumentException("resourceName"); }

    this._resourceType = resourceType;
    this._resourceName = resourceName;
  }

  public Resource.Type getResourceType()
  {
    return this._resourceType;
  }

  public String getResourceName()
  {
    return this._resourceName;
  }

  @Override
  public String toString()
  {
    return "ComponentType '" + this._componentTypeLabel + "' already has a resource named '" + this._resourceName + "' of type '" + this._resourceType + "'.";
  }
}