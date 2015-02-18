<html>
	<body>
		<h1>RESTfulWebServiceExample_TomCat</h1>
		<h2>Links:</h2>
		 <ol>
			<li>Feet to Inch converter
				<form name="feet_to_inch" action="rest/ConversionService/FeetToInch">
					Feet <input type="text" id="feet">
					<input type="button" onclick="return onSubmitForm(1);" value="Convert in Inches">
				</form>
			</li>
			<li>Inch to Feet converter
				<form name="inch_to_feet" action="rest/ConversionService/InchToFeet">
					Inch <input type="text" id="inches">
					<input type="button" onclick="return onSubmitForm(2);" value="Convert in Feet">
				</form>
			</li>
			<li>
				<a href="Tester.do">test init paramters</a>
			</li>
			<li>
				<a href="beer_select.jsp">beer select form</a>
			</li>
			<li>
				<a href="ListenerTest.do">test context attributes set by listener</a>
			</li>
			<li>
				<a href="GetMeSession">get my session (plus HttpSessionBindingListener, HttpSessionListener, HttpSessionAttributeListener)</a>
			</li>
			<li>
				<form name="cookie_test" action="Cookie.do" method="post">
					username: <input type="text" name="username">
					<input type="submit" value="Submit User To Check Cookie">
				</form>
			</li>
		</ol> 
	</body>
	<script type="text/javascript">
		function onSubmitForm(formNumber){
			var number = 0;
			if(formNumber == 1) {
				number = document.querySelector('form[name=feet_to_inch] #feet').value;
				window.location.href = document.feet_to_inch.action+"/"+number;
			}
			
			if(formNumber == 2) {
				number = document.querySelector('form[name=inch_to_feet] #inches').value;
				window.location.href = document.inch_to_feet.action+"/"+number;
			}
			return false;
		}
	</script>
</html>