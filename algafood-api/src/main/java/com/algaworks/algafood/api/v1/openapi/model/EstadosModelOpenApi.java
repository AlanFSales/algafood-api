package com.algaworks.algafood.api.v1.openapi.model;

import java.util.List;

import org.springframework.hateoas.Links;

import com.algaworks.algafood.api.v1.model.EstadoModel;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("EstadosModel")
@Data
public class EstadosModelOpenApi {

	private EstadosEmbeddeModelOpenApi _embedded;
	private Links _links;
	
	@ApiModel("EstadosEmbeddeModel")
	@Data
	public class EstadosEmbeddeModelOpenApi {
		
		private List<EstadoModel> estados;
	}
}
