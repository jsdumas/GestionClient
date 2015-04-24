package fr.treeptik.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.treeptik.model.Client;

@Component
public class ClientValidator implements Validator {

	@Override
	public boolean supports(Class<?> obj) {
		if (obj.getName().equals(Client.class.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object obj, Errors errors) {

		if (supports(obj.getClass())) {
			Client client = (Client) obj;
			if (client.getTotalFacture() < 0) {
				//totalFacture : propriété de Client
				//errors.totalFacture : clé des fichiers properties
				//message par défaut
				errors.rejectValue("totalFacture", "errors.totalFacture",
						"Héhé erreur sur le total");
			}
		}

	}

}
