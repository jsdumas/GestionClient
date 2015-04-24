package fr.treeptik.controller;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.treeptik.model.Client;
import fr.treeptik.service.ClientService;

@Scope("request")
@Controller
@RequestMapping("/client")
public class ClientController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ClientValidator clientValidator;
	
	@Autowired
	private ClientService clientService;

	// private ArrayList<Client> clients = new ArrayList<Client>();	

	// Point d'entrée de l'application
	@RequestMapping("/list.do")
	public ModelAndView listClient() {
		// System.out.println("Hello World");
		//
		// Client client = new Client(1, "Client1");
		// String refContrat = "XContrat";
		//
		// Map<String, Object> param = new HashMap();
		// param.put("client", client);
		// param.put("refContrat", refContrat);
		//
		// return new ModelAndView("list.jsp", param );
		return new ModelAndView("list.jsp", "clients", clientService.findAll());
	}
	

	
	

//	@RequestMapping(value = "edit.do", method = RequestMethod.GET)
//	public ModelAndView initSaveClient() {
//
//		return new ModelAndView("edit.jsp", "client", new Client());
//
//	}

//	@RequestMapping(value = "edit.do", method = RequestMethod.POST)
//	public ModelAndView saveClient(Client client) {
//		System.out.println(client);
//		clients.add(client);
//		return listClient();
//	}
	
	@RequestMapping(value = "edit.do", method = RequestMethod.GET)
	public ModelAndView initSaveClient() {
		return new ModelAndView("edit.jsp", "client", new Client());

	}
	
	//@valid permet de dire de valider le champ enregistreement
	//BindingResult --> Objet pour récupérer les erreurs
	@RequestMapping(value = "edit.do", method = RequestMethod.POST)
	public ModelAndView saveClient(@Valid Client client, BindingResult result) {
		
		clientValidator.validate(client, result);
		
		if(result.hasErrors()){
			return new ModelAndView("edit.jsp", "client", client);
		}
		
		clientService.save(client);
		return listClient();
	}
	
	@RequestMapping(value="delete.do", method=RequestMethod.GET)
	public ModelAndView delete(Integer id){
		clientService.remove(id);
		return listClient();
	}
	
	@RequestMapping(value="update.do", method=RequestMethod.GET)
	public ModelAndView update(Integer id){
		Client client = clientService.findOne(id);
		return new ModelAndView("edit.jsp", "client", client);
	}
	
	

}
