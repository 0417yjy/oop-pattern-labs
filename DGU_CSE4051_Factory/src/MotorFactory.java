
public class MotorFactory {
	public Motor createMotor(String manufacturer) {
		if(manufacturer.equals("LG")) {
			return new LGMotor();
		}
		else if(manufacturer.equals("Hyundai")) {
			return new HyundaiMotor();
		}
		return null;
	}
}
