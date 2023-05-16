package Mobile;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Manager {
	public static void main(String[] args) {
	System.out.println("Hi");
	System.out.println("ข้อ7");
	List<IPhone> IPList = new ArrayList<>();
	IPhone IP1 = new IPhone();
    IPhone IP2 = new IPhone();
    IPhone IP3 = new IPhone();
    IPList.add(IP1);
    IPList.add(IP2);
    IPList.add(IP3);
    for(IPhone iphone : IPList) {
    	System.out.println(iphone);
    }
    //	ข้อ7 ^^^
    System.out.println("ข้อ8");
    Map<String, IPhone> phoneMap = new HashMap<>();
    IPhone IP4 = new IPhone();
    IPhone IP5 = new IPhone();
    IPhone IP6 = new IPhone();
    phoneMap.put("082-282-8418", IP4);
    phoneMap.put("091-627-6478", IP5);
    phoneMap.put("888-888-8888", IP6);
    for(Map.Entry m:phoneMap.entrySet()) {
    	System.out.println(m.getKey() + ", " + m.getValue());
    }
    //	ข้อ8 ^^^
    System.out.println("ข้อ6");
    System.out.println("IPhone 1");
    System.out.println("Open Phone");
    IP1.slideToUnlock();
    
    IP1.makeCall("080-080-0808");
    IP1.receiveCall("111-111-1111");
    
    String Song = IP1.playSong("ใครในเพลง");
    System.out.println("เล่นเพลง : " + Song);
    String Video = IP1.playVideo("aaaaaaaa");
    System.out.println("เล่นวิดีโอ : " + Video);
    
    IP1.installApplication("Meb");
    
    System.out.println(IP1.getLocation());
    
	}
}