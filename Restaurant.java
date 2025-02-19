 import java.util.*;
 public class Restaurant
 {
    Scanner sc = new Scanner(System.in);
    int vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,d,totald=0,damt=0,ch,flag=0;
    double gst=0;
    String str="",ans,choice="";
    void veg_starters()
    {
        System.out.println("*****************************************************");
        System.out.println("STARTER                                                PRICE IN Rs.");
        System.out.println();
        System.out.println("1.Paneer Tikka                                              75");
        System.out.println("2.Veg Seekh kabab                                           80");
        System.out.println("3.Hara Bhara Kebab                                          85");
        System.out.println("4.Shanghai Spring Roll                                      80");
        System.out.println("5.American Corn Ball                                       100");
        System.out.println("6.Crispy American Corn                                      90");
        System.out.println("7.Crispy Baby Corn                                          90");
        System.out.println("8.Crispy Mushroom                                           95");
        System.out.println("9.Crispy Chilly potato                                      70");
        System.out.println("10.Crispy Chilly Chana                                      70");
        System.out.println("*****************************************************");
        while(choice==""||choice.equalsIgnoreCase("y"))
        {
            System.out.println("Choose your order from the list by entering your number!!");
            vstr=sc.nextInt();
            System.out.println("*****************************************************");
            System.out.println("Enter the total number of plates you want: ");
            tvstr=sc.nextInt();
            System.out.println("*****************************************************");
            if(vstr>=1&&vstr<=3)
                amt=tvstr*110;
            if(vstr==4||vstr==5)
                amt=tvstr*150;
            if(vstr==6||vstr==7)
                amt=tvstr*140;
            if(vstr==8||vstr==9)
                amt=tvstr*120;
            if(vstr==10)
                amt=tvstr*150;
            tamt=tamt+amt;
            System.out.println("Do you want to order more from this list?");
            System.out.println("Enter Y for yes and N for no");
            sc.nextLine();
            choice=sc.nextLine();
            System.out.println("*****************************************************");
        }
        choice="";
    }

    void non_veg_starters()
    {
        System.out.println("*****************************************************");
        System.out.println("NON-VEG STARTERS                      Price IN Rs.");
        System.out.println("1.Chicken Tikka                            80");
        System.out.println("2.Murg Reshmi Kebab                        80");
        System.out.println("3.Murg Chilli Kebab                        75");
        System.out.println("4.Chicken Seekh Kebab                      70");
        System.out.println("5.Tangdi Kebab                             85");
        System.out.println("6.Murg Tandoori                            90");
        System.out.println("7.Fish Ajwani Tikka                        95");
        System.out.println("8.Chilli Chicken                           70");
        System.out.println("9.Drums of Heaven                         100");
        System.out.println("10.Shanghai Chicken                       100");
        System.out.println("*****************************************************");
        while(choice==""||choice.equalsIgnoreCase("y"))
        {
            System.out.println("Choose your order from the list by entering your number!!");
            nvstr=sc.nextInt();
            System.out.println("*****************************************************");
            System.out.println("Enter the total number of plates you want: ");
            tnvstr=sc.nextInt();
            System.out.println("*****************************************************");
            if(nvstr==1||nvstr==2)
                amt=tnvstr*170;
            if(nvstr==3)
                amt=tnvstr*160;
            if(nvstr==4||nvstr==5)
                amt=tnvstr*180;
            if(nvstr==6||nvstr==7)
                amt=tnvstr*190;
            if(nvstr==8)
                amt=tnvstr*160;
            if(nvstr==9||nvstr==10)
                amt=tnvstr*180;
            tamt=tamt+amt;
            System.out.println("Do you want to order more from this list?");
            System.out.println("Enter Y for yes and N for no");
            sc.nextLine();
            choice=sc.nextLine();
            System.out.println("*****************************************************");
        }
        choice="";
    }

    void veg_maincourse()
    {
        System.out.println("*****************************************************");
        System.out.println("INDIAN VEG DISHES                          PRICE IN Rs.");
        System.out.println("1.Shahi Paneer                                  180");
        System.out.println("2.Navratan Korma                                180");
        System.out.println("3.Kadhai Paneer                                 150");
        System.out.println("4.Malai Kofta                                   140");
        System.out.println("5.Kadhai Vegetable                              140");
        System.out.println("6.Vegetable Pakeeza                             140");
        System.out.println("7.Shabnam Curry                                 150");
        System.out.println("8.Makai Corn Palak                              150");
        System.out.println("9.Veg Pulao                                     110");
        System.out.println("10.Kashmiri Pualo                               140");
        System.out.println("11.Butter Naan                                   50");
        System.out.println("12.Stuffed Kulcha                                60");
        System.out.println("*****************************************************");
        while(choice==""||choice.equalsIgnoreCase("y"))
        {
            System.out.println("Choose your order from the list by entering number!!");
            vfd=sc.nextInt();
            System.out.println("*****************************************************");
            System.out.println("Enter the total no.of plates you want: ");
            tvfd=sc.nextInt();
            System.out.println("*****************************************************");
            if(vfd==1||vfd==2)
                amt=tvfd*180;
            if(vfd==3)
                amt=tvfd*150;
            if(vfd==4||vfd==5||vfd==6)
                amt=tvfd*140;
            if(vfd==7||vfd==8)
                amt=tvfd*150;
            if(vfd==9)
                amt=tvfd*110;
            if(vfd==10)
                amt=tvfd*140;
            if(vfd==11)
                amt=tvfd*40;
            if(vfd==12)
                amt=tvfd*60;
            tamt=tamt+amt;
            System.out.println("Do you want to order more from this list?");
            System.out.println("Enter Y for yes and N for no");
            sc.nextLine();
            choice=sc.nextLine();
            System.out.println("*****************************************************");
        }
        choice="";
    }

    void non_veg_maincourse()
    {
        System.out.println("*****************************************************");
        System.out.println("INDIAN NON-VEG DISHES                          Price IN Rs.");
        System.out.println("1.Chicken Tikka Masala                              180");
        System.out.println("2.Mutton Biryani                                    180");
        System.out.println("3.Chicken Bharta                                    150");
        System.out.println("4.Kadhai Chicken                                    160");
        System.out.println("5.Mughlai Chicken                                   160");
        System.out.println("6.Murg Navratan Korma                               160");
        System.out.println("7.Chicken Biryani                                   170");
        System.out.println("8.Murg Musallam                                     170");
        System.out.println("9.Mutton Rogan Josh                                 190");
        System.out.println("10.Prawn Malai Curry                                190");
        System.out.println("11.Fish Sarsowala                                   140");
        System.out.println("12.Fish Dhaniawala                                  160");
        System.out.println("13.Butter naan                                       50");
        System.out.println("14.Stuffed Kulcha                                    60");
        System.out.println("*****************************************************");
        while(choice==""||choice.equalsIgnoreCase("y"))
        {
            System.out.println("Choose your order from the list by entering number!!");
            vfd=sc.nextInt();
            System.out.println("*****************************************************");
            System.out.println("Enter the no.of plates you want: ");
            tvfd=sc.nextInt();
            System.out.println("*****************************************************");
            if(vfd==1||vfd==2)
                amt=tvfd*180;
            if(vfd==3)
                amt=tvfd*150;
            if(vfd==4||vfd==5||vfd==6)
                amt=tvfd*160;
            if(vfd==7||vfd==8)
                amt=tvfd*170;
            if(vfd==9||vfd==10)
                amt=tvfd*190;
            if(vfd==11)
                amt=tvfd*140;
            if(vfd==12)
                amt=tvfd*160;
            if(vfd==13)
                amt=tvfd*40;
            if(vfd==14)
                amt=tvfd*60;
            tamt=tamt+amt;
            System.out.println("Do you want to order more from this list?");
            System.out.println("Enter Y for yes and N for no");
            sc.nextLine();
            choice=sc.nextLine();
            System.out.println("*****************************************************");
        }
        choice="";
    }

    void chinese()
    {
        System.out.println("*****************************************************");
        System.out.println("CHINESE DISHES                         PRICE IN Rs.");
        System.out.println();
        System.out.println("1.Schezwan Fried Rice                     140");
        System.out.println("2.Schezwan Chicken                        150");
        System.out.println("3.Chilly Chicken                          100");
        System.out.println("4.Chicken Noodle                          110");
        System.out.println("5.Veg.Hakka Noodle                        100");
        System.out.println("6.Chicken Manchurian                      120");
        System.out.println("7.Paneer Manchurian                       110");
        System.out.println("8.Chilly Paneer                           130");
        System.out.println("9.Sanghai Fried Rice                      150");
        System.out.println("10.Veg Fried Rice                         110");
        System.out.println("11.Chicken Fried Rice                     120");
        System.out.println("12.Kimchi Veg rice                        120");
        System.out.println("*****************************************************");
        while(choice==""||choice.equalsIgnoreCase("y"))
        {
            System.out.println("Choose your order from the above list by entering number!!");
            fd=sc.nextInt();
            System.out.println("*****************************************************");
            System.out.println("Enter the no.of plates you want: ");
            tfd=sc.nextInt();
            System.out.println("*****************************************************");
            if(fd==1)
                amt=tfd*240;
            if(fd==2||fd==3)
                amt=tfd*280;
            if(fd==4||fd==5)
                amt=tfd*210;
            if(fd==6||fd==7||fd==8)
                amt=tfd*190;
            if(fd==9)
                amt=tfd*240;
            if(fd==10||fd==11||fd==12)
                amt=tfd*210;
            tamt=tamt+amt;
            System.out.println("Do you want to order more from this list?");
            System.out.println("Enter Y for yes and N for no");
            sc.nextLine();
            choice=sc.nextLine();
            System.out.println("*****************************************************");
        }
        choice="";
    }

    void deserts()
    {
        System.out.println("******************************************************************");
        System.out.println("DESERT AND DRINKS                                         PRICE IN Rs.");
        System.out.println();
        System.out.println("1.Softy Pineapple                                           65");
        System.out.println("2.Softy Crunchy Chocolate                                   65");
        System.out.println("3.Chocolate Walnut Browny                                   70");
        System.out.println("4.Chocolate Doughnut                                        60");
        System.out.println("5.Marble Cake                                               60");
        System.out.println("6.Mocha Magic                                               75");
        System.out.println("7.Black Forest Gateaux                                      75");
        System.out.println("8.Mango Shake                                               65");
        System.out.println("9.Pineapple Shake                                           65");
        System.out.println("10.Tooty Fruity                                             60");
        System.out.println("11.Virgin Mojito                                            70");
        System.out.println("12.Virgin Mary                                              75");
        System.out.println("13.Bella Bellini                                            80");        
        System.out.println("14.Blue Shoe                                                70");
        System.out.println("15.Gabbie's Punch                                           80");
        System.out.println("*******************************************************************");
        while(choice==""||choice.equalsIgnoreCase("y"))
        {
            System.out.println("Choose your order by entering your number!!");
            d=sc.nextInt();
            System.out.println("*****************************************************");
            System.out.println("Enter the no.of plates you want: ");
            totald=sc.nextInt();
            System.out.println("*****************************************************");
            if(d==1||d==2)
                amt=totald*110;
            if(d==3||d==4)
                damt=totald*90;
            if(d==5)
                amt=totald*70;
            if(d==6||d==7)
                amt=totald*90;
            if(d==8||d==9)
                amt=totald*80;
            if(d==10)
                amt=totald*120;
            tamt=tamt+amt;
            System.out.println("Do you want to order more from this list?");
            System.out.println("Enter Y for yes and N for no");
            sc.nextLine();
            choice=sc.nextLine();
            System.out.println("*****************************************************");
        }
        choice="";
    }

    void bill()
    {
        System.out.println("*******THE GOLD-INDIAN RESTAURANT*******");
        System.out.println("******************BILL*******************");
        System.out.println("Total Cost = Rs."+tamt);
        gst=(int)Math.round(18/100.0*tamt);
        System.out.println("GST = 18%");
        System.out.println("Total GST = Rs."+gst);
        System.out.println("Amount to be paid = Rs."+(tamt+gst));
        System.out.println("Thanks for coming to the Gold-Indian Restaurant");
        System.out.println("Your Pleasure our Comfort!!!");
        System.out.println("Visit us Again!!!");
        System.out.println("*****************************************************");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag=0,ch;
        String ans;
        Restaurant obj = new Restaurant();
        System.out.println("********THE GOLD-INDIAN RESTAURANT********");
        System.out.println("");
        while(flag==0)
        {
            System.out.println("*****************************************************");
            System.out.println("ENTER :-");
            System.out.println("1-VEG STARTERS");
            System.out.println("2-NON-VEG STARTERS");
            System.out.println("3-VEG MAINCOURSE");
            System.out.println("4-NON-VEG MAINCOURSE");
            System.out.println("5-CHINESE");
            System.out.println("6-DESERTS AND DRINKS");
            System.out.println("*****************************************************");
            System.out.println("");
            System.out.println("Enter your choice :");
            ch=sc.nextInt();
            System.out.println("*****************************************************");
            switch(ch)
            {
                case 1:
                obj.veg_starters();
                break;
                case 2:
                obj.non_veg_starters();
                break;
                case 3:
                obj.veg_maincourse();
                break;
                case 4:
                obj.non_veg_maincourse();
                break;
                case 5:
                obj.chinese();
                break;
                case 6:
                obj.deserts();
                break;
                default:
                System.out.println("WRONG CHOICE!!");
                System.out.println("Please reexecute the program or enter the word 'L'");
            }
            System.out.println("To exit enter 'L' or if you want to order more from the menu then press any key");
            sc.nextLine();
            ans=sc.nextLine();
            if(ans.equalsIgnoreCase("L"))
            {
                flag=1;
            }
        }
        obj.bill();
    }
 }
 