package common;

public class Element {
	private String type;
	private String value;
	private boolean dynamic;
	
	public Element(String type, String value, boolean dynamic) {
		this.type = type;
		this.value = value;
		this.dynamic = dynamic;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getDynamic() {
		return dynamic;
	}

	public void setDynamic(Boolean dynamic) {
		this.dynamic = dynamic;
	}
	
}
