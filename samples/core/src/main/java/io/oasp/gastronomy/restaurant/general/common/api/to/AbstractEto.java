package io.oasp.gastronomy.restaurant.general.common.api.to;

import net.sf.mmm.util.transferobject.api.EntityTo;

/**
 * Abstract base class for an <em>{@link EntityTo entity transfer-object}</em> in this application.
 */
public class AbstractEto extends EntityTo<Long> {

  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   */
  public AbstractEto() {

    super();
  }

  /**
   * @param comment
   */
  public void setComment(String comment) {

    // TODO Auto-generated method stub

  }

  /**
   * @return
   */
  public String getComment() {

    // TODO Auto-generated method stub
    return null;
  }

}
