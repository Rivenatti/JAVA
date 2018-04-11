package endianness;

public class endianness {

	public static void main(String[] args) {
			
			int a = 0;
		    // 0x0....01 
		    int b = 1;
		    //0x0..0,0.01,0..0,0..0
		    int combine = (b<<16) | a;
		    System.out.println(combine);
		    if(combine == 65536){
		        System.out.println("Little Endian");
		    }else{
		        System.out.println("Big Endian");
		    }

	}

}
