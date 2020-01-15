<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<%@include file="head.jsp"%>

<body>

<form>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputName1">First Name</label>
            <input type="email" class="form-control" id="inputName1" placeholder="First Name">
            <c:param name="name"
        </div>
        <div class="form-group col-md-6">
            <label for="inputName1">Second Name</label>
            <input type="email" class="form-control" id="inputName2" placeholder="Second Name">
        </div>
        <div class="form-group col-md-6">
            <label for="inputEmail">Phone Number</label>
            <input type="email" class="form-control" id="inputEmail" placeholder="phone number">
        </div>
        <div class="form-group col-md-6">
            <label for="inputPhone">Email</label>
            <input type="email" class="form-control" id="inputPhone" placeholder="email">
        </div>
    </div>
    <div class="form-group">
        <label for="inputAddress">Address</label>
        <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
    </div>
    <div>
        class="col-12">
        <c:url value="/confirm" var="confirm"/>
        <a class="btn btn-primary" href="${confirm}">Confirm</a>
    </div>
</form>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>