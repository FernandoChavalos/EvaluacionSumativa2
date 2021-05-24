<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-8">
	<div class="columns is-centered">
		<div class="column is-6">
			<form method="POST" action="AtenderSolicitudesController.do">
				<div class="card">
					<div class="card-header has-background-primary">
						<span class="card-header-title"> Ingresar Tipo Solicitud</span>
					</div>
					<div class="card-content">
						<div class="field">
							<div class="select">
								<select name="marca-select" id="marca-select">
									<option value="0">Solicitud de Cédula de Identidad</option>
									<option value="1">Retiro de Cédula de Identidad</option>
									<option value="2">Solicitud de Certificado de Nacimiento</option>
									<option value="3">Solicitud de Certificado de Defunción</option>
								</select>
							</div>
						</div>

					</div>
						<div class="card-footer has-text-centered">
					<div class="card-footer-item">
					<button type="submit" class="button is-primary"> Filtrar </button>
					</div>
					</div>
				</div>
			</form>
		</div>

	</div>


</main>
</body>
</html>