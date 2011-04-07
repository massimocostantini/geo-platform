package org.geosdi.geoplatform.gui.impl.tree.chaintohide;

import org.geosdi.geoplatform.gui.impl.map.store.GPLayersStore;
import org.geosdi.geoplatform.gui.impl.tree.AbstractRequestHandler;
import org.geosdi.geoplatform.gui.model.GPLayerBean;
import org.geosdi.geoplatform.gui.model.GPVectorBean;

public class HideVectorRequestHandler extends AbstractRequestHandler {

	public HideVectorRequestHandler(GPLayersStore<?, ?> theStore) {
		super(theStore);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.geosdi.geoplatform.gui.model.tree.responsibility.GPLayerRequestHandler
	 * #layerRequest(org.geosdi.geoplatform.gui.model.GPLayerBean)
	 */
	@Override
	public void layerRequest(GPLayerBean layer) {
		if (layer instanceof GPVectorBean) {
			super.layersStore.visitForHide((GPVectorBean)layer);	
		} else
			forwardLayerRequest(layer);
	}

}