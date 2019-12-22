
package lumantadjm;
//GroupMates:LumantadJM,Piquero,Dalman//
import java.util.* ;

public class Project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date date=new Date();
        System.out.println("May I take your Order?");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("Enter Your Name Please");
        String name=sc.nextLine();
        System.out.println(" ");
        System.out.println("Hotel name\t\t"+"Costumer name\t\t"+"Date and Time");
        System.out.println(" ");
        System.out.println("Welcome to JL Hotel"+"\t"+name+"\t\t\t"+date.toString());
        int a,b,c,d,e,l,i;
        int eachcost=0;
        int cost=0;
        int price=0;
        int y=0,v=0;
        String item=" ";
        System.out.println(" ");
        System.out.println("Our Menu card");
        System.out.println(" ");
        System.out.println("Item name\t\t\t"+"Price\t\t"+"Price to order");
        System.out.println(" ");
        System.out.println("Adobo W/ rice\t\t\t"+"50\t\t"+"1");
        System.out.println(" ");
        System.out.println("LetchonManok W/ rice\t\t"+"90\t\t"+"2");
        System.out.println(" ");
        System.out.println("Caldireta W/ rice\t\t"+"40\t\t"+"3");
        System.out.println(" ");
        System.out.println("Letchonkawali W/ rice\t\t"+"150\t\t"+"4");
        System.out.println(" ");
        System.out.println("SinugbaNaBangos W/ rice\t\t"+"30\t\t"+"5");
        System.out.println(" ");
        
        
        System.out.println(" ");
        ArrayList order=new ArrayList();
        ArrayList<Integer> pric=new ArrayList<>();
        ArrayList plate=new ArrayList();
        
        do
        {
            System.out.println("Press to order");
            
            a=sc.nextInt();
            int press[]=new int[]{a};
            
            System.out.println("Enter the Number of plates");
            b=sc.nextInt();
            System.out.println(" ");
            
        if(a==1)
        {
            item="Adobo with rice";
            price=50;
            eachcost=price*b;
            cost+=eachcost;
            boolean of=order.contains(item);
            if(of)
            {
                order.add("");
                pric.add(eachcost);
                plate.add(b);
            }
            else
            {
                pric.add(eachcost);
                plate.add(b);
                order.add(item);
            }
        }
        if(a==2){
        item="Letchon Manok with rice";
        price=90;
        eachcost=price*b;
        cost+=eachcost;
        
        order.add("item");
        pric.add(eachcost);
        plate.add(b);
     }
        if(a==3){
        item="Caldireta with rice";
        price=40;
        eachcost=price*b;
        cost+=eachcost;
        System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
        order.add("item");
        pric.add(eachcost);
        plate.add(b);
        }
        if(a==4){
        item="Letchon kawali with rice";
        price=150;
        eachcost=price*b;
        cost+=eachcost;
        order.add("item");
        pric.add(eachcost);
        plate.add(b);
        }
        if(a==5)
        {
        item="Sinugba na bangos with rice";
        price=30;
        eachcost=price*b;
        cost+=eachcost;
        order.add("item");
        pric.add(eachcost);
        plate.add(b);
        }
        
         
        for(int k=0;k<press.length;k++)
        {
            String fetchitemname= " ";
            if(press[k]==1){
                fetchitemname="adobo with rice";
        }
            if(press[k]==2){
                fetchitemname="Letchon manok with rice";
        }
            if(press[k]==3){
                fetchitemname="Caldireta with rice";
        }
            if(press[k]==4){
                fetchitemname="Letchon kawali with rice";
        }
            if(press[k]==5){
                fetchitemname="Sinugba na bangos with rice";
        }
            
     }
            System.out.println("Do you want to continue the order(press 1 for continue/otherwis press 0)");
            y=sc.nextInt();
            System.out.println(" ");
            
}while(y!=0);
        System.out.println(" ");
        System.out.println(" ");
            System.out.println("Items name"+"\t\t\t\t\t\t"+"no.of plates"+"\t\t"+"Sub total");
            Iterator itr =order.iterator();
            Iterator<Integer> itrl=pric.iterator();
            Iterator itr2 =plate.iterator();
            
while(itr.hasNext() && itrl.hasNext() && itr2.hasNext())
{
        System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+itr.next());
        System.out.println(" ");
}
        System.out.println(" ");
        System.out.println("Total Bill :"+"\t\t\t\t\t\t\t"+"  "+"\t\t"+cost);
        System.out.println("");
         
        if(1==1)
        {
            do
            {
                int f = 0;
                
                 
              
                if(f==1){
                    item="Adobo with rice";
                    boolean of=order.contains(item);
                    int of1=order.indexOf(item);
                    
                    
                    if(of)
                    {
                        order.remove(item);
                        cost=cost-pric.remove(of1);
                        
                        plate.remove(of1);
                    }
                }
                if(f==2){
                    item="Letchon manok with rice";
                    boolean of=order.contains(item);
                    int of1=order.indexOf(item);
                    
                    
                    if(of)
                    {
                        order.remove(item);
                        cost=cost-pric.remove(of1);
                        
                        plate.remove(of1);
                    }
                }
                if(f==3){
                    item="Caldireta with rice";
                    boolean of=order.contains(item);
                    int of1=order.indexOf(item);
                    
                    
                    if(of)
                    {
                        order.remove(item);
                        cost=cost-pric.remove(of1);
                        
                        plate.remove(of1);
                    }
                }
                if(f==4){
                    item="Letchon kawali with rice";
                    boolean of=order.contains(item);
                    int of1=order.indexOf(item);
                    
                    
                    if(of)
                    {
                        order.remove(item);
                        cost=cost-pric.remove(of1);
                        
                        plate.remove(of1);
                    }
                }
                if(f==5){
                    item="Sinugba na bangos with rice";
                    boolean of=order.contains(item);
                    int of1=order.indexOf(item);
                    
                    
                    if(of)
                    {
                        order.remove(item);
                        cost=cost-pric.remove(of1);
                        
                        plate.remove(of1);
                    }
                }
                System.out.println("Do you want to cancel the order?(Press 1 for continue/otherwise Press 0)");
                v=sc.nextInt();
          
            }while(v!=0);
            System.out.println(" ");
            System.out.println("Items Name"+"\t\t\t\t\t\t\t"+"No.of plates"+"\t\t"+"Sub Total");
            itr =order.iterator();
            itrl =pric.iterator();
            itr2 =plate.iterator();
            int scost=0;
            while(itr.hasNext() && itrl.hasNext() && itr2.hasNext())
            {
                System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+itrl.next());
                System.out.println(" ");
                System.out.println(" ");
            }
            
            
            System.out.println("Total bill :"+"\t\t\t\t\t\t\t"+" "+"\t\t"+cost);
         }
                    else
                    {
                        System.out.println("Items Name"+"\t\t\t\t\t\t\t"+"No.of plates"+"\t\t"+"Sub Total");
                        itr =order.iterator();
                        itrl =pric.iterator();
                        itr2 =plate.iterator();
                        int scostl=0;
                        while(itr.hasNext() && itrl.hasNext() && itr2.hasNext())
                        {
                            System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t"+itrl.next());
                            System.out.println(" ");
                            System.out.println(" ");
                        }
                        
                        System.out.println("Total Bill :"+"\t\t\t\t\t\t\t"+" "+"\t\t"+cost);
                    }
                        System.out.println("Thank You for Visiting our hotel"+" "+name+"\t"+"signature");
                }
}
