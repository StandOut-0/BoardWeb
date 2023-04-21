<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
			<c:set var="contextPath" value="${pageContext.request.contextPath}" />

			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">

				<!-- bootstrap -->
				<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
					rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
					crossorigin="anonymous">
					
				<!-- fontawesome -->
				<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
					integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
					crossorigin="anonymous" referrerpolicy="no-referrer">

				<!-- custom css -->
				<link href="${contextPath}/resources/css/style.css" rel="stylesheet" type="text/css" media="screen">

				<!-- favicon -->
				<link rel="shortcut icon"
					href="https://t0.gstatic.com/faviconV2?client=SOCIAL&type=FAVICON&fallback_opts=TYPE,SIZE,URL&url=http://standout.tistory.com&size=16" />


				<!-- title -->
				<title>
					<tiles:insertAttribute name="title" />
				</title>
				<!-- title -->
				
			</head>

			<body class="bg-primary-subtle p-5">
				<div id="container" class="bg-white m-auto rounded p-5 position-relative">


					<!-- 언어선택 -->
					<div class="text-end position-absolute position-absolute top-0 end-0 language_box">
						<a href="${window.location.href}?lang=en" class="btn btn-light small btn-sm rounded-0 rounded-top">
							<spring:message code="message.user.login.language.en" />
						</a>
						<a href="${window.location.href}?lang=ko" class="btn btn-light small btn-sm rounded-0 rounded-top">
							<spring:message code="message.user.login.language.ko" />
						</a>
					</div>
					<!-- 언어선택 -->


					<div id="header" class="text-center pb-4 mb-3">
						<tiles:insertAttribute name="header" />
					</div>
					<div id="content">
						<tiles:insertAttribute name="body" />
					</div>
					<div id="footer" class="text-center border-top pt-4 mt-5">
						<tiles:insertAttribute name="footer" />
					</div>
				</div>
			</body>

			</html>