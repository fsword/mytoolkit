package mytoolkit.practise1;

public class Record {
	private String name;
	private int code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Record(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}
	public Record() {
	}
	
}
