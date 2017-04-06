import java.util.Scanner;
class SearchModule {
  Scanner sc = new Scanner(System.in);
  String[][] details =new String[10][10];  	  
  short ch;
  static short cnt=0;
  void search(String name) {
  	int j;
  	for(j=1;j<=cnt;j++) {
  		if(details[j][1].equalsIgnoreCase(name)) {
			System.out.println(details[j][0] + "Details:-\nName :" + details[j][1] + "\nCrime Type : " + details
[j][2] + "\nAge :" + details[j][3] + "\nGender : " + details[j][4] + "\nCrime Description : " + details[j][5]);  	
			return;
			}
		}
	    				   
  	if(j>cnt)
    	System.out.println("No such criminal named "+name+" found, Try Registering "+name+" Crime Details or Search again. 
");   	
 }
  void register() {    
      cnt++;
     System.out.println("\n*****Crime Details*******\n\n");
    System.out.println("Enter Person Type either "+details[0][0]);
    details[cnt][0] = sc.next();
    if(!(details[cnt][0].equalsIgnoreCase("Criminal"))||(details[cnt][0].equalsIgnoreCase("Victim")))
     {
       System.out.println("InValid Input...\nEnter Person Type again either "+details[0][0]);
      details[cnt][0] = sc.next();
      }
     System.out.printf("Enter %s Name :", details[cnt][0]);
    details[cnt][1] = sc.next();
    System.out.print("Enter Crime type :");
    details[cnt][2] = sc.next();
    System.out.print("Enter age :");
    details[cnt][3] = sc.next();
    System.out.print("Enter Gender(male or female) :");
    details[cnt][4] = sc.next();
    System.out.print("Enter Crime Description :");
    details[cnt][5] = sc.next();
    System.out.println("Successfully Registered Details of"+details[cnt][1]);
  }
 SearchModule() {
  	  details[0][0]="Criminal/Victim";
	  details[0][1] = "Criminal/Victim name";
	  details[0][2] = "Crime Type";
	  details[0][3] = "Age";
	  details[0][4] = "Gender";
	  details[0][5] = "Crime Description";	
    do{
    System.out.println("\nEnter What you want to do ??? (Choice)\n");
    System.out.println("1.Search for the Details of Victim/Criminal:");
    System.out.println("2.Register the Details of the new Criminal/Victim\n3.Exit : ");
    ch = sc.nextShort();
    switch(ch) {    
      case 1:
        System.out.println("Enter Criminal or Victim name ???");
        String name = sc.next();
	if(cnt>0)
        search(name);
	else
	System.out.println("No Entries found, Please Register first.\n");	
        break;
      case 2:
        register();
        
        break;
      case 3:
       System.out.println("Thanks for Visiting.....");
    }
    
  }while(ch!=3); 
  }
  public static void main(String args[]) {
  	SearchModule sm=new SearchModule();   
  	   
}
}

