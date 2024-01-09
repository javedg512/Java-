class Mark{
	private String  Name;
	private int  Class;
	private int  Roll;
	private char Sec;
	private int  sub1;
	private int  sub2;
	private int  sub3;
	private int  sub4;
	private int  sub5;
	private int  Total;
	private int  percent;
	private char grade;
	
	public String getName(){ 	
		return Name;
	} 
	public int setClass(){
		return Class;
	}
	
	public char getSec(){ 	
		return Sec;
	} 
	
	public int getRoll(){ 	
		return Roll;
	} 
	public int getSub1(){ 	
		return sub1;
	} public int getSub2(){ 	
		return sub2;
	} public int getSub3(){ 	
		return sub3;
	} public int getSub4(){ 	
		return sub4;
	} public int getSub5(){ 	
		return sub5;
	} 
	public int getTotal(){ 	
		return Total;
	} 
	public int getPercent(){ 	
		return percent;
	} 
	public char getGrade(){ 	
		return grade;
	} 
	
	
	public void setName(String naam){ 	
		Name= naam;
	} 
	public void setClass(int cl){
		 Class = cl ;
	}
	
	public void setSec(char c){ 	
		Sec=c ;
	} 
	
	public void setRoll(int rol){ 	
		Roll=rol;
	} 
	public void setSub1(int one){ 	
		sub1=one;
	} public void setSub2(int two){ 	
		 sub2 = two;
	} public void setSub3(int three){ 	
		sub3 = three;
	} public void  setSub4(int four ){ 	
		sub4 = four;
	} public void setSub5(int five ){ 	
		sub5 = five ;
	} 
	public void setTotal(int tot){ 	
		Total = tot ;
	} 
	public void setPercent(int per){ 	
		percent  = per;
	} 
	public void setGrade(char gra){ 	
		 grade= gra;
	} 
	
	
	public String metName(){ 	
		return Name;
	} 
	public int metClass(){
		return Class;
	}
	
	public char metSec(){ 	
		return Sec;
	} 
	
	public int metRoll(){ 	
		return Roll;
	} 
	public int metSub1(){ 	
		return sub1;
	} public int metSub2(){ 	
		return sub2;
	} public int metSub3(){ 	
		return sub3;
	} public int metSub4(){ 	
		return sub4;
	} public int metSub5(){ 	
		return sub5;
	} 
	public int metTotal(){ 	
		return Total;
	} 
	public int metPercent(){ 	
		return percent;
	} 
	public char metGrade(){ 	
		return grade;
	} 
}

class main
{
	public static void main(String []args)
	{
		Mark sheet = new Mark();
		sheet.setName("Javed Gauri");
		sheet.setClass(11);
		sheet.setRoll(21);
		sheet.setSec('D');
		sheet.setTotal(355);
		sheet.setPercent(85);
		sheet.setGrade('A');
		sheet.setSub1(50);
		sheet.setSub2(85);
		sheet.setSub3(70);
		sheet.setSub4(80);
		sheet.setSub5(70);
		System.out.println("----------------------------------------------------------------------------------------\n");

		System.out.println("\t\t\t\tSt. Stephen School\n");
		System.out.println("----------------------------------------------------------------------------------------");

		System.out.println("\t\t\t\t\tRepord Card ");
		System.out.println("----------------------------------------------------------------------------------------\n");
		
		System.out.print("\tStudent's Name :"+sheet.metName());
		System.out.println("\t\t\t\tClass :"+sheet.metClass());
		System.out.print("\tGrade :"+sheet.metGrade());
		System.out.println("\t\t\t\t\t\tRoll no. :"+sheet.metRoll());
		System.out.println("----------------------------------------------------------------------------------------\n");
		
		System.out.println("\tSubjects \t\t Marks Obtained \t\t Total Marks\n");
		System.out.println("----------------------------------------------------------------------------------------\n");

		System.out.print("\tPhysics     \t\t"+sheet.metSub1()+"  \t\t\t\t 100");
		System.out.print("\n\tChemistry   \t\t"+sheet.metSub2()+" \t\t\t\t 100");
		System.out.print("\n\tMathematics \t\t"+sheet.metSub3()+" \t\t\t\t 100");
		System.out.print("\n\tHindi       \t\t"+sheet.metSub4()+"  \t\t\t\t 100");
		System.out.print("\n\tEnglish     \t\t"+sheet.metSub5()+"  \t\t\t\t 100");
		System.out.println("\n\tGrand Total \t\t"+sheet.metTotal()+"  \t\t\t\t 500\n");
				System.out.print("----------------------------------------------------------------------------------------\n");

		System.out.print("\n\tPercentage  \t\t"+sheet.metPercent());
		

		System.out.println("\t\tGrade   \t"+sheet.metGrade());
				System.out.println("----------------------------------------------------------------------------------------\n");

		

		

		
		
	}
}