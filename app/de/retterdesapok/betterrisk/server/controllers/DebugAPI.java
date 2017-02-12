package de.retterdesapok.betterrisk.server.controllers;

import javax.inject.Inject;

import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class DebugAPI extends Controller {
	
	JPAApi jpaApi;
	FormFactory formFactory;

	@Inject
	DebugAPI(JPAApi jpaApi, FormFactory formFactory) {
		this.jpaApi = jpaApi;
		this.formFactory = formFactory;
	}

	@Transactional
    public Result test() {

        return ok("Testoutput");
    }

}
