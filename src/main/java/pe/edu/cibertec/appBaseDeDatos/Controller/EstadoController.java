package pe.edu.cibertec.appBaseDeDatos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.appBaseDeDatos.Service.EstadoService;

@Controller
@RequestMapping("/Estado")
public class EstadoController {
	
	@Autowired
	private EstadoService EstadoService;
	
	@GetMapping("/frmManEstado")
	public String frmManEstado(Model model) {
		model.addAttribute("listaEstado", EstadoService.listarEstados());
		return "Estado/frmManEstado";
	}

}