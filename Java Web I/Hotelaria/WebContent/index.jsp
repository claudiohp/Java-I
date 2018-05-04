<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<title>Reserva Clientes</title>
</head>
<body style="font-family: sans-serif;">
	
	<div class="container">
		
		<div class="page-header" style="text-align: center; margin-bottom: 80px;">
			<h1>Sistema de Reserva de Clientes</h1>
		</div>
		
		<div class="block1" style="margin-bottom: 80px;">
		<h1>Cadastro Reserva</h1>
			<form action="HotelariaServlet" method="POST">
				<div class="form-group">
				<label for="nome">Nome</label>
				<input type="text" id="nome" name="txtnome" class="form-control" placeholder="Digite seu nome" value="${hospede.nome}"/>
				</div>
				<div class="form-group">
				<label for="quarto" style="display: block;">Quarto</label>
				<input type="text" id="quarto" name="txtquarto" class="form-control" placeholder="Digite o número do quarto" value="${quarto.numeroQuarto}"/>
				</div>
				<div class="form-group">
				<label for="dtentrada" style="display: block;">Data Entrada</label>
				<input type="text" id="dtentrada" name="txtdtentrada" class="form-control" placeholder="Digite a data de entrada" value="${reserva.dataentrada}"/>
				</div>
				<div class="form-group">
				<label for="dtsaida" style="display: block;">Data Saída</label>
				<input type="text" id="dtsaida" name="txtdtsaida" class="form-control" placeholder="Digite a data de saída" value="${reserva.datasaida}"/>
				</div>
		
				<input type="submit" class="btn btn-primary" value="Cadastrar" style="float:right;">
				
			</form>
		</div>
		
		<div class="block2">
		
		<h1>Listando Reserva</h1>
			<form action="HotelariaServlet" method="POST">
			<table class="table table-striped table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Quarto</th>
						<th>Data Entrada</th>
						<th>Data Saída</th>
						<th>Estado</th>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</thead>
			</table>
			<input type="submit" class="btn btn-primary" value="Listar" style="float:right;">
			</form>
				
		</div>	
	</div>

</body>
</html>