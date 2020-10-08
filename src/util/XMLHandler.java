package util;

import java.util.Properties;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler
{
	private Properties props;
	private StringBuffer currentValue = new StringBuffer();
	
	public XMLHandler()
	{
		this.props = new Properties();
	}
	
	public Properties getProps()
	{
		return props;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
	{
		currentValue.delete(0, currentValue.length());
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException
	{
		currentValue.append(ch, start, length);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException
	{
		props.put(qName.toLowerCase(), currentValue.toString().trim());
	}
	
	
}
