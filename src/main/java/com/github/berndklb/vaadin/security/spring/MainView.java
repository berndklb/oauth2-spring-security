package com.github.berndklb.vaadin.security.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

	// Auth0 Provider:
	//https://manage.auth0.com/dashboard/eu/dev-vt4d68dy/
	
	@Autowired 
    public MainView(MessageBean bean, OAuth2AuthorizedClientService service) {
        Button button = new Button("Click me",
                e -> Notification.show(bean.getMessage()));
        add(button);
        
        // backup code: 2KCY - 7UYN - N7BY - CA1V - CPBR - LJ4E
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println("context: " + context);
    }

}
