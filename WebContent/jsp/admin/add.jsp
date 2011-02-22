<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:include page="header.jsp" />

<h3>Add a Point</h3>

<form method="post">
	<h3>who are you?</h3>
	<ul>
		<li>
			<label>your name</label>
			<input type="text" name="contact_name"></input>
		</li>
		<li>
			<label>email</label>
			<input type="text" name="contact_email"></input>
		</li>
	</ul>
	
	<h3>building information</h3>
	<ul>
		<li>
			<label>building name</label>
			<input type="text" name="building_name"></input>
		</li>
		<li>
			<label>know the owner?</label> 
			<select name="known_owner"> 
				<option>(choose one)</option> 
				<option >yes</option> 
				<option >no</option> 
			</select> 
		</li>
		<li>
			<label>type of building?</label>
			<select name="building_type">
				<option value="">(select)</option>
				<option value="non-profit">non-profit</option> 
				<option value="residential">residential</option> 
				<option value="commercial">commercial</option> 
				<option value="dont know">don't know</option> 
			</select>
		</li>
		<li>
			<label>date painted</label>
			<input type="text" name="date_painted"></input>
		</li>
		<li>
			<label>roof type</label>
			<select name="roof_type">
				<option value="">(select)</option>
				<option value="white">white</option> 
				<option value="black">black</option> 
				<option value="solar">solar</option> 
				<option value="green">green</option>
				<optgroup label="grey">
					<option value="gravel">gravel</option>
					<option value="capsheet">capsheet</option>
				</optgroup>
			</select>
		</li>
		<li>
			<label>temperature monitor?</label>
			<select name="temperature_monitor">
				<option value="">(select)</option>
				<option value="true">yes</option>
				<option value="false">no</option>
				<option value="dont know">don't know</option> 
			</select>
		</li>
		<li>
			<label>street address</label>
			<input type="text" name="addr"></input>
		</li>
		<li>
			<label>city</label>
			<input type="text" name="city"></input>
		</li>
		<li>
			<label>state</label>
			<input type="text" name="state"></input>
		</li>
		<li>
			<label>zip</label>
			<input type="text" name="zip"></input>
		</li>
		<li>
			<label>country</label>
			<input type="text" name="country"></input>
		</li>
	</ul>
	
	<h3>sponsors</h3>
	<ul>
		<li>
			<label>name</label>
			<input type="text" name="sponsor_name"></input>
		</li>
		<li>
			<label>email</label>
			<input type="text" name="sponsor_email"></input>
		</li>
		<li>
			<label>phone</label>
			<input type="text" name="sponsor_phone"></input>
		</li>
	</ul>
	
	<input type="submit" value="Submit"></input>
	
	<div id="input_map"></div>
</form>


<jsp:include page="footer.jsp" />