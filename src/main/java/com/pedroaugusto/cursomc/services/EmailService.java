package com.pedroaugusto.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.pedroaugusto.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}