package car;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;



public class Init {	
	

	
	private static final String SUCCESS="成功"; 
	private static final String Fail="失败"; 
	

	
	public String carSys () {

		/*
		 * 车辆类型1	载人		PessengerCar
		 * 		2	载物		Trunk
		 * 		3	混合		Pickup
		 */
		PessengerCar[] pessengerCars = {new PessengerCar(1,1,"奥迪",5,500),new PessengerCar(2,1, "宝马", 5,600),
				new PessengerCar(3,1, "奔驰", 5,700),new PessengerCar(4,1, "保时捷", 5,800)};
		Trunk[] trunks = {new Trunk(1,1,"大奥迪",500,600),new Trunk(2,1, "大宝马", 500,700),
				new Trunk(3,1, "大奔驰", 500,800),new Trunk(4,1, "大保时捷", 500,900)};
		PickUp[] pickUps = {new PickUp(1,1,"混合奥迪",5,200,800),new PickUp(2,1, "混合宝马", 5,200,900),
				new PickUp(3,1, "混合奔驰", 5,200,1000),new PickUp(4,1, "混合保时捷",5, 200,1100)};
//		List<PessengerCar> list =new ArrayList<>();
//		list.add(new PessengerCar(1,"奥迪",5,2000));
//		list.add(new PessengerCar(1, "宝马", 5,2000));
//		list.add(new PessengerCar(1, "奔驰", 5,2000));
//		list.add(new PessengerCar(1, "保时捷", 5,2000));
//		Iterator<PessengerCar> iterator = list.iterator();
		//是否租车
		System.out.println("欢迎光临ABCD租车系统\n是否要租车:  1.是        2.否");
		Scanner inScanner = new Scanner(System.in);
		int i = inScanner.nextInt();
		int unit =0 ;//辆
		int day =0;//时间
		float price=0;//总价
		int id=0;//序号
		if(i==1) {
			System.out.println("租哪种车?  1.轿车/巴士  2.货车  3.皮卡");
			int j = inScanner.nextInt();
			System.out.println("您要租多少辆车？\n 1. 	2. 	  3. 	4.	  5.");
			unit =inScanner.nextInt();
			switch (j) {
			case 1:
					//显示租车信息 
					for(PessengerCar pc:pessengerCars) {
						System.out.println(pc);
					}
					System.out.println("请输入您要租车的序号");
					id = inScanner.nextInt();
					price = pessengerCars[id-1].getCarPrice();
				break;
				
			case 2:
					//显示租车信息
					for(Trunk trk:trunks) {
						System.out.println(trk);
					}
					System.out.println("请输入您要租车的序号");
					id = inScanner.nextInt();
					price = trunks[id-1].getCarPrice();
				break;
			case 3:
				//显示租车信息
				for(PickUp pk:pickUps) {
					System.out.println(pk);
				}
				System.out.println("请输入您要租车的序号");
				id = inScanner.nextInt();
				price = pickUps[id-1].getCarPrice();
			break;
			default:
				break;
			}
			System.out.println("您要租多久？");
			day =inScanner.nextInt();
			System.out.println("总共需要支付:"+unit*day*price);
			
		}
		else {
			return Fail;
		}
		return SUCCESS;
		};	
		
		public static void main(String[] args) {
			Init init = new Init();
			init.carSys();
		}
		
}