<html>
<body>
	<h2>Currency Converter</h2>
	<form method="GET" action="convert">
		<table>
			<tr>
				<td>Currency to convert: <input type="text" name="number" /></td>
				<td><select name ="currencyFrom" id ="currencyFrom">
						<option value="ksh">Ksh</option>
						<option value="usd">Usd</option>
						<option value="tz">TzSh</option>
						<option value="ug">Ugsh</option>
						<option value="euro">Euro</option>
				</select>
			</tr>
			<tr>
				<td>Select the currency to convert to:</td>
				<td><select name ="currencyTo" id ="currencyTo">
						<option value="ksh">Ksh</option>
						<option value="usd">Usd</option>
						<option value="tz">TzSh</option>
						<option value="ug">Ugsh</option>
						<option value="euro">Euro</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" value ="convert"/></td>
		</table>
	</form>
</body>
</html>
