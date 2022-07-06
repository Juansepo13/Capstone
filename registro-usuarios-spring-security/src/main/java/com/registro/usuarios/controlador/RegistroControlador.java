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
	
	@GetMapping("/index")
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
	
	@GetMapping("/contenidolibancolombia")
	public String contenidoLIBancolombia() {
		return "contenidolibancolombia";
	}
	
	@GetMapping("/contenidolibbva")
	public String contenidoLIBBVA() {
		return "contenidolibbva";
	}
	
	@GetMapping("/contenidolidavivienda")
	public String contenidoLIDavivienda() {
		return "contenidolidavivienda";
	}
	
	@GetMapping("/contenidolibancobogota")
	public String contenidoLIBancoBogota() {
		return "contenidolibancobogota";
	}
	
	@GetMapping("/contenidovbancolombia")
	public String contenidoVBancolombia() {
		return "contenidovbancolombia";
	}
	
	@GetMapping("/contenidovbbva")
	public String contenidoVBBVA() {
		return "contenidovbbva";
	}
	
	@GetMapping("/contenidovdavivienda")
	public String contenidoVDavivienda() {
		return "contenidovdavivienda";
	}
	
	@GetMapping("/contenidovbancobogota")
	public String contenidoVBancoBogota() {
		return "contenidovbancobogota";
	}
	
	@GetMapping("/contenidoccbancolombia")
	public String contenidoCCBancolombia() {
		return "contenidoccbancolombia";
	}
	
	@GetMapping("/contenidoccbbva")
	public String contenidoCCBBVA() {
		return "contenidoccbbva";
	}
	
	@GetMapping("/contenidoccdavivienda")
	public String contenidoCCDavivienda() {
		return "contenidoccdavivienda";
	}
	
	@GetMapping("/contenidoccbancobogota")
	public String contenidoCCBancoBogota() {
		return "contenidoccbancobogota";
	}
	
	@GetMapping("/adelantobancolombia")
	public String AdelantoBancolombia() {
		return "adelantobancolombia";
	}
	
	@GetMapping("/adelantobbva")
	public String AdelantoBBVA() {
		return "adelantobbva";
	}
	
	@GetMapping("/adelantodavivienda")
	public String AdelantoDavivienda() {
		return "adelantodavivienda";
	}
	
	@GetMapping("/adelantobancobogota")
	public String AdelantoBancoBogota() {
		return "adelantobancobogota";
	}
}
