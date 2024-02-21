package services;

import data.Catalogue;

public class CatalogueManagement {
	
	private Catalogue catalogue;
	
	public CatalogueManagement() {
		catalogue = new Catalogue();
	}

	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

	@Override
	public String toString() {
		return "CatalogueManagement [catalogue=" + catalogue + "]";
	}
	
}