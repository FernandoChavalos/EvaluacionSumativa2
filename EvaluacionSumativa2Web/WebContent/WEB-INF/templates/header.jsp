<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="vendor/bulma/css/bulma.min.css" rel="stylesheet" />
</head>
<body>
	<header>
		<nav class="navbar has-background-danger" role="navigation" aria-label="main navigation">
			<div class="navbar-brand">
				<a class="navbar-item" href="index.jsp"> <img
					src="img/GobiernoLogo.jpg" >
				</a> <a role="button" class="navbar-burger" aria-label="menu"
					aria-expanded="false" data-target="navbarBasicExample"> <span
					aria-hidden="true"></span> <span aria-hidden="true"></span> <span
					aria-hidden="true"></span>
				</a>
			</div>

			<div id="navbarBasicExample" class="navbar-menu">
				<div class="navbar-start">
					<a class="navbar-item"> Inicio </a> 

					<div class="navbar-item has-dropdown is-hoverable">
						<a class="navbar-link"> Solicitudes </a>

						<div class="navbar-dropdown">
							<a class="navbar-item"> Ingresar solicitud </a> 
							<a class="navbar-item"> Atender solicitud</a>
						</div>
					</div>
				</div>
			</div>
		</nav>
	</header>