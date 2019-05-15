<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>

<form:form action="setHuman" modelAttribute="human">
    First Name: <form:input path="firstName" />
    <br>
    Last Name: <form:input path="lastName" />
    <br>

    <input type="submit" value="Submit" />
</form:form>
</body>
</html>