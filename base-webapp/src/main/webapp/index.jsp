<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<%@include file="head.jsp"%>

<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">EShop Catalog</a>

</nav>
        <div class="col-12">
            <table class="table table-borderless">
                <thead>
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Description</th>
                    <th scope="col">Price</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>

                <%-- for (Product product : (List<Product>) request.getAttribute("products")) { --%>
                <c:forEach var="product" items="${requestScope.products}">
                    <tr>
                        <td><c:out value="${product.name}"/></td>
                        <td><c:out value="${product.description}"/></td>
                        <td><c:out value="${product.price}"/></td>
                        <td>
                            <c:url value="/buy" var="productAddToCart">
                                <c:param name="id" value="${product.id}"/>
                            </c:url>
                            <a class="btn btn-primary" href="${productAddToCart}">Buy</a>
                        </td>
                    </tr>
                </c:forEach>
                <%-- } --%>
                </tbody>
            </table>
        </div>
<div class="col-12">
    <c:url value="/cart" var="productToCart"/>
    <a class="btn btn-primary" href="${productToCart}">Go to cart</a>
</div>
    </div>
</div>
</body>
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