<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><tiles:getAsString name="title" ignore="true"/></title>
	<style>
		table { width: 100%; border-collapse: collapse; }
		caption { text-align: left; font-weight: 700; margin: 0 0 8px; }
		th, td { border: 1px solid #ddd; padding: 8px; vertical-align: top; }
		thead th { white-space: nowrap; }
	</style>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<tiles:insertAttribute name="header" ignore="true" />
		</div>
		
		<div class="body">
			<div class="left">
				<tiles:insertAttribute name="left" ignore="true" />
			</div>
		
			<div class="content">
				<tiles:insertAttribute name="content" ignore="true" />
			</div>
		</div>
		
		<div class="footer">
			<tiles:insertAttribute name="footer" ignore="true" />
		</div>
	</div>
</body>
</html>