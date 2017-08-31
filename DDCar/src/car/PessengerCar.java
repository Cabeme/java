package car;

public class PessengerCar extends Cars {

	private int carPcapacity;// 承载多少人 	/人

	public int getCarPcapacity() {
		return carPcapacity;
	}

	public void setCarPcapacity(int carPcapacity) {
		this.carPcapacity = carPcapacity;
	}

	public PessengerCar() {
	};

	public PessengerCar(int carId,int carType, String carName, int carPcapacity, float carPrice) {
		super.setCarId(carId);
		super.setCarType(carType);
		super.setCarName(carName);
		this.carPcapacity = carPcapacity;
		super.setCarPrice(carPrice) ;
	}
	
	@Override
	public String toString() {
		return 	"[ 汽车序号:" + super.getCarId() + ",汽车类型:" + super.getCarType() +
				", 汽车名字 :" + super.getCarName() + ", 最大承载量（人）:"+
				carPcapacity +", 价格（元/天）:" + super.getCarPrice() +"]";
	}

}
