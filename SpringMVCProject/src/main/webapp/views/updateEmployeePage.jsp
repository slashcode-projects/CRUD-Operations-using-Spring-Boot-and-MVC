<%@ include file="header.jsp" %>
<div class="container">

<h2>To Update Employee</h2>

<form:form action="updateEmployeeDetails" method="post" modelAttribute="employeeDetails">
<fieldset>

<form:input type="hidden" path="empId" value="${employeeDetails.empId}"/>

<%-- Employee Name: <form:input path="empName" value="${employeeDetails.empName}"/>
				<form:errors path="empName"/><br/>
Employee Department : <form:input path="deptName" value="${employeeDetails.deptName}"/>
					<form:errors path="deptName"/><br/> --%>
					
<div class="form-group">
  <label class="col-form-label" for="empName">Employee Name:</label>
   	<form:input path="empName" value="${employeeDetails.empName}" class="form-control"/>
	<form:errors path="empName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="deptName">Department Name:</label>
 	<form:input path="deptName" value="${employeeDetails.deptName}" class="form-control"/>
	<form:errors path="deptName" class="form-control"/>
</div>

</fieldset>
<input type="submit" value="update Employee" class="btn btn-primary"/>

</form:form>

</div>
<%@ include file="footer.jsp" %>