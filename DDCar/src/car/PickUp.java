package car;

public class PickUp extends Cars {
	private int carPcapacity;// 承载多少人 	/人
	private float carCargoCapacity;// 承载多少货物	 /吨

	public int getCarPcapacity() {
		return carPcapacity;
	}

	public void setCarPcapacity(int carPcapacity) {
		this.carPcapacity = carPcapacity;
	}

	public PickUp() {
	};

	public PickUp(int carId,int carType, String carName, int carPcapacity, float carCargoCapacity, float carPrice) {
		super.setCarId(carId);
		super.setCarType(carType);
		super.setCarName(carName);
		this.carPcapacity = carPcapacity;
		this.carCargoCapacity = carCargoCapacity;
		super.setCarPrice(carPrice) ;
	}

	public float getcarCargoCapacity() {
		return carCargoCapacity;
	}

	public void setcarCargoCapacity(float carCargoCapacity) {
		this.carCargoCapacity = carCargoCapacity;
	}

	@Override
	public String toString() {
		return 	"[ 汽车序号:" + super.getCarId() + ",汽车类型:" + super.getCarType() +
				", 汽车名字 :" + super.getCarName() + ", 最大承载量（人）:" +
				carPcapacity  + ", 最大承载量（吨）:" + carCargoCapacity +
				", 价格（元/天）:" + super.getCarPrice() +"]";
	}
}
