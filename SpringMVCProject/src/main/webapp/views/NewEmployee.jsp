<%@ include file="header.jsp" %>

<div class="container">
<form:form action="addEmployeeDetails" method="post" modelAttribute="employee">

<fieldset>

<div class="form-group">
  <label class="col-form-label" for="empName">Employee Name:</label>
   	<form:input path="empName" class="form-control"/>
	<form:errors path="empName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="deptName">Department Name:</label>
 	<form:input path="deptName" class="form-control"/>
	<form:errors path="deptName" class="form-control"/>
</div>

</fieldset>


<input type="submit" value="Add Employee" class="btn btn-primary"/>

</form:form>
</div>
<%@ include file="footer.jsp" %>