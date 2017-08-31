package car;

public class Trunk extends Cars {
	
	private int carCargoCapacity;// 承载多少货物	 /吨

	public int getcarCargoCapacity() {
		return carCargoCapacity;
	}

	public void setcarCargoCapacity(int carCargoCapacity) {
		this.carCargoCapacity = carCargoCapacity;
	}

	public Trunk() {
	};

	public Trunk(int carId,int carType, String carName, int carCargoCapacity, float carPrice) {
		super.setCarId(carId);
		super.setCarType(carType);
		super.setCarName(carName);
		this.carCargoCapacity = carCargoCapacity;
		super.setCarPrice(carPrice) ;
	}

	@Override
	public String toString() {
		return 	"[ 汽车序号:" + super.getCarId() + ",汽车类型:" + super.getCarType() +
				", 汽车名字 :" + super.getCarName() + ", 最大承载量（吨）:"+
				carCargoCapacity +", 价格（元/天）:" + super.getCarPrice() +"]";
	}
}
