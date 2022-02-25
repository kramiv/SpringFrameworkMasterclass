package com.in28minutes_springboot.in28minutes_demo.xml;

public class XmlPersonDAO {
	
	XmlJdbcConnection xmljdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmljdbcConnection = jdbcConnection;
	}
	
	
}
