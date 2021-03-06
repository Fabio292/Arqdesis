<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home - ADM</title>
<link rel="stylesheet" type="text/css"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<!-- Nav -->

		<nav class="navbar navbar-inverse navbar-fixed-top"> <!-- Access-->
	<div class="btn-group">
		<button type="button" class="btn btn-lg btn-primary">Access</button>
		<button type="button" class="btn btn-lg btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span class="caret"></span> <span class="sr-only">Toggle
				Dropdown</span>
		</button>
		<ul class="dropdown-menu">
			<li href = "http://localhost:8080/br.usjt.oficial.project/AccessRead.jsp"><a>Read</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/AccessCreate.jsp">Insert</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/AccessUpdate.jsp">Update</a></li>
			<li role="separator" class="divider"></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/AccessDelete.jsp">Delete</a></li>
		</ul>
	</div>

	<!-- AirConditioningTemperature-->
	<div class="btn-group">
		<button type="button" class="btn btn-lg btn-primary">AirConditioningTemperature</button>
		<button type="button" class="btn btn-lg btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span class="caret"></span> <span class="sr-only">Toggle
				Dropdown</span>
		</button>
		<ul class="dropdown-menu">
			<li><a href="http://localhost:8080/br.usjt.oficial.project/AirConditioningTemperatureCreate.jsp">Read</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/AirConditioningTemperatureUpdate.jsp">Update</a></li>
		</ul>
	</div>


	<!-- Company-->
	<div class="btn-group">
		<button type="button" class="btn btn-lg btn-primary">Company</button>
		<button type="button" class="btn btn-lg btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span class="caret"></span> <span class="sr-only">Toggle
				Dropdown</span>
		</button>
		<ul class="dropdown-menu">
			<li><a href="http://localhost:8080/br.usjt.oficial.project/CompanyRead.jsp">Read</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/CompanyCreate.jsp">Insert</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/CompanyUpdate.jsp">Update</a></li>
			<li role="separator" class="divider"></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/CompanyDelete.jsp">Delete</a></li>
		</ul>
	</div>


	<!-- PropertySet-->
	<div class="btn-group">
		<button type="button" class="btn btn-lg btn-primary">PropertySet</button>
		<button type="button" class="btn btn-lg btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span class="caret"></span> <span class="sr-only">Toggle
				Dropdown</span>
		</button>
		<ul class="dropdown-menu">
			<li><a href="http://localhost:8080/br.usjt.oficial.project/PropertyRead.jsp">Read</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/PropertySetJSP.jsp">Insert</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/PropertyUpdate.jsp">Update</a></li>
			<li role="separator" class="divider"></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/PropertyDelete.jsp">Delete</a></li>
		</ul>
	</div>


	<!-- User-->
	<div class="btn-group">
		<button type="button" class="btn btn-lg btn-primary">User</button>
		<button type="button" class="btn btn-lg btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span class="caret"></span> <span class="sr-only">Toggle
				Dropdown</span>
		</button>
		<ul class="dropdown-menu">
			<li><a href="http://localhost:8080/br.usjt.oficial.project/UserRead.jsp">Read</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/UserJSP.jsp">Insert</a></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/UserUpdate.jsp">Update</a></li>
			<li role="separator" class="divider"></li>
			<li><a href="http://localhost:8080/br.usjt.oficial.project/UserDelete.jsp">Delete</a></li>
		</ul>
	</div>

	<nav class="nav navbar-nav navbar-right"> <!-- Login-->
	<div class="btn-group">
		<button type="button" class="btn btn-lg btn-primary">Adm</button>
		<button type="button" class="btn btn-lg btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span class="caret"></span> <span class="sr-only">Toggle
				Dropdown</span>
		</button>
		<ul class="dropdown-menu">
			<li><a href="#">Edit Account</a></li>
			<li><a href="#">Help</a></li>
			<li><a href="#">About</a></li>
			<li role="separator" class="divider"></li>
			<li><a href="#">Exit</a></li>
		</ul>
	</div>


	</nav> </nav>

	<!-- Page -->

	<div id="main" class="container">
	
	
	<h3 class="page-header">Company Delete</h3>
<!-- Formulario para Deletar de Empresas -->
<form action="controller.do" method="post">

<!-- area de campos do form -->
<div class="row">
<div class="form-group col-md-12">
<label >CNPJ</label>
<input type="text" class="form-control" name="stringCnpj" id="stringCnpj"
maxlength="15" pattern="(?:\d{2}[\ ]?\d{2}[\ ]?\d{4}[- ]?\d{2}[: ]?\d{2}" placeholder="">

</div>
</div>
<div class="row">

<div class="form-group col-md-6">
<label >Company Name</label>
<input type="text" class="form-control" name="stringCompanyName" id="stringCompanyName"
 placeholder="">
</div>
<div class="form-group col-md-6">
<label for="text">Check-In Day</label>
<input type="text" class="form-control" name="stringCheckIn" id="stringCheckIn"
required maxlength="60" placeholder="">
</div>
<div class="form-group col-md-6">
<label for="text">Check- Out</label>
<input type="text" class="form-control" name="stringCheckOut" id="stringCheckOut"
required maxlength="60" placeholder="">
</div>

<div class="form-group col-md-6">
<label for="text">Standard Temperature</label>
<input type="text" class="form-control" name="intStandardTemperatureOfAirConditioning" id="intStandardTemperatureOfAirConditioning"
required maxlength="60" placeholder="">
</div>

<div class="form-group col-md-6">
<label for="text">Check In Ar Condicionado</label>
<input type="text" class="form-control" name="stringAirConditioningCheckIn" id="stringAirConditioningCheckIn"
required maxlength="60" placeholder="">
</div>

<div class="form-group col-md-6">
<label for="text">Check Out Ar Condicionado</label>
<input type="text" class="form-control" name="stringAirConditioningCheckOut" id="stringAirConditioningCheckOut"
required maxlength="60" placeholder="">
</div>

</div>
<hr />
<div id="actions" class="row">
<div class="col-md-12">
<button type="submit" class="btn btn-primary" name="acao"
value="Criar">Delete</button>
<a href="index.html" class="btn btn-default">Cancel</a>
</div>
</div>
</form>
</div>
	
	</div>



	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">



</body>
</html>