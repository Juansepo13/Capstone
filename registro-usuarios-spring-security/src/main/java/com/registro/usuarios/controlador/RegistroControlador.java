package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "index";
	}
	
	@GetMapping("/creditovivienda")
	public String creditoVivienda() {
		return "creditovivienda";
	}
	
	@GetMapping("/creditolibreinversion")
	public String creditoLibreInversion() {
		return "creditolibreinversion";
	}
	
	@GetMapping("/adelantonomina")
	public String adelantoNomina() {
		return "adelantonomina";
	}
	
	@GetMapping("/compracartera")
	public String creditoCompraCartera() {
		return "compracartera";
	}
	
	@GetMapping("/creditovehiculo")
	public String creditoVehiculo() {
		return "creditovehiculo";
	}
	
	@GetMapping("/contenidobancolombia")
	public String contenidoBancolombia() {
		return "contenidobancolombia";
	}
	
	@GetMapping("/contenidobbva")
	public String contenidoBBVA() {
		return "contenidobbva";
	}
	
	@GetMapping("/contenidodavivienda")
	public String contenidoDavivienda() {
		return "contenidodavivienda";
	}
	
	@GetMapping("/contenidobancobogota")
	public String contenidoBancoBogota() {
		return "contenidobancobogota";
	}
}
