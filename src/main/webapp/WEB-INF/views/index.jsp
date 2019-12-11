<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SpringBootIsRocking</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<style>
.control-label {
	padding-top: 6px;
}

.pull-left {
	margin-left: -25px; /* Try with different values until you are happy */
}
</style>
</head>
<body>
	<div class="container">
		<div style="text-align: center">
			<h2>Spring Boot Data JPA Hibernate</h2>
			<h3>JQuery BootStrap</h3>
			<h4>Cascading Dropdown Example</h4>
		</div>
		<br>
		<form>
			<div class="row">
				<label class="col-md-3 control-label text-right"
					for="passwordConfirm">Country</label>
				<div class="col-md-6">
					<select id="dropdownCountry" class="form-control pull-left">
						<option value="countryvalue" disabled selected="selected">--
							Select --</option>

						<c:forEach var="country" items="${countries }">

							<option value="${country.id }">${country.name }</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<br>

			<div class="row">
				<label class="col-md-3 control-label text-right"
					for="passwordConfirm">State</label>
				<div class="col-md-6">
					<select id="dropdownState" class="form-control pull-left">
					</select>
				</div>
			</div>

			<br>

			<div class="row">
				<label class="col-md-3 control-label text-right"
					for="passwordConfirm">City</label>
				<div class="col-md-6">
					<select id="dropdownCity" class="form-control pull-left">
					</select>
				</div>
			</div>

		</form>
	</div>
</body>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#dropdownState").val(
								$("#dropdownState option:first").val());
						$('#dropdownCountry')
								.on(
										'change',
										function() {
											var countryId = $(this).val();
											$
													.ajax({
														type : 'GET',
														url : '${pageContext.request.contextPath }/loadStatesByCountry/'
																+ countryId,
														success : function(
																result) {
															var result = JSON
																	.parse(result);
															var state = '';
															state += '<option disabled selected="selected">--Select State--</option>';
															for (var i = 0; i < result.length; i++) {
																state += '<option value="' + result[i].id + '">'
																		+ result[i].name
																		+ '</option>';
															}
															$('#dropdownState')
																	.html(state);
															$("#dropdownState")
																	.val(
																			$(
																					"#dropdownState option:first")
																					.val());
															$("#dropdownCity")
																	.val(
																			$(
																					"#dropdownCity option:first")
																					.val());
														}
													});
										});

						$('#dropdownState')
								.on(
										'change',
										function() {
											var stateId = $(this).val();
											$
													.ajax({
														type : 'GET',
														url : '${pageContext.request.contextPath }/loadCitiesByState/'
																+ stateId,
														success : function(
																result) {
															var result = JSON
																	.parse(result);
															var city = '';
															city += '<option disabled selected="selected">--Select City--</option>';
															for (var i = 0; i < result.length; i++) {
																city += '<option value="' + result[i].id + '">'
																		+ result[i].name
																		+ '</option>';
															}
															$('#dropdownCity')
																	.html(city);
														}
													});
										});

					});
</script>
</html>