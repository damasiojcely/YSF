<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lnakaya
  Date: 7/1/2017
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListUbigeos</title>
</head>
<body>
<jsp:useBean id="service" class="pe.com.yoursoccerfield.services.YSFService"/>
<select id="cboDeparment" name="cboDepartment" class="texto50">
    <c:forEach var="ubigeo" items="${service.ubigeosD}">
        <option value="${ubigeo.department}">${ubigeo.departmentName}</option>
    </c:forEach>
</select>
<br>
<select id="cboProvince" name="cboProvince" class="texto50">
    <c:forEach var="ubigeo" items="${service.ubigeosP}">
        <option value="${ubigeo.province}">${ubigeo.provinceName}</option>
    </c:forEach>
</select>
<br>
<select id="cboDistrict" name="cboDistrict" class="texto50">
    <c:forEach var="ubigeo" items="${service.ubigeosDi}">
        <option value="${ubigeo.district}">${ubigeo.districtName}</option>
    </c:forEach>
</select>
</body>
</html>
