package test;

// XMwatch包消息
public class Packet {
	// 包头 2BYTE
	String head;
	// 包长度 2BYTE
	String length;
	// 消息流水号 2BYTE
	String serial;
	// 消息体属性 1BYTE
	String property;
	// 消息分包项 4BYTE
	String sub;
	// 消息ID 2BYTE
	String id;
	// 消息内容 NBYTE
	String data;
	// CRC校验 2BYTE
	String CRC;
	// 包尾 2BYTE
	String tail;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCRC() {
		return CRC;
	}

	public void setCRC(String cRC) {
		CRC = cRC;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public Integer computeLength() {
		return ((serial != null ? serial.length() : 0) + (property != null ? property.length() : 0) + (sub != null ? sub.length() : 0) + (id != null ? id.length() : 0) + (data != null ? data.length() : 0) + (CRC != null ? CRC.length() : 0)) / 2;
	}

	@Override
	public String toString() {
		return head + length + serial + property + sub + id + data + CRC + tail;
	}

	public Packet() {
		super();
		this.head = "f5f6";
		this.tail = "f7f8";
	}

}
