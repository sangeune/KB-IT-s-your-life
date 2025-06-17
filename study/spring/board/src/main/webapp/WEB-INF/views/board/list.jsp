<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<%@include file="../layouts/header.jsp"%>
<h1 class="page-header my-4"><i class="fas fa-list"></i> 글 목록</h1>
<table class="table table-hover">
    <thead>
    <tr>
        <th style="width: 60px">No</th>
        <th>제목</th>
        <th style="width: 100px">작성자</th>
        <th style="width: 130px">등록일</th>
    </tr>
    </thead>
    <tbody>
    <%--JSTL : 자바의 여러 기본 문법들을 코딩할 때 tag로 쓸 수 있는 기능--%>
    <%-- taglib지시자가 있어야함.--%>
    <c:forEach var="board" items="${list}">
        <%-- board는  dto --%>
    <tr>
        <td>${board.no}</td>
        <%-- <%= board.getNo() %> --%>
        <td>
            <a href="get?no=${board.no}">${board.title}</a>
        </td>
        <td>${board.writer}</td>
        <td>
            <fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd"/>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

<%@ include file="../layouts/footer.jsp"%>