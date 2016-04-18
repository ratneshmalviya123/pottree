<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p><spring:message code="label.menu"/></p>
<c:forEach items="${linkLists}" var="listVal">
	<a href="${listVal.link}">${listVal.linkDisplay}</a><br/><br/>
</c:forEach>