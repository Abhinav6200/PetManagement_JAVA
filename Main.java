package com.amdocs; 
  
 import java.io.BufferedReader; 
 import java.io.IOException; 
 import java.io.InputStreamReader;
 import java.sql.SQLException;
 import java.util.List; 
 import java.util.Scanner; 
  
 public class Main { 
         public static void main(String[] args) throws IOException, SQLException { 
  
                 System.out.println(Jdbc_Connection.getConnection()); 
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                 Scanner sc= new Scanner(System.in); 
                 PetData pd = new PetData(); 
                 Pet pet = new Pet(); 
                 Boolean f= true; 
                 while(f) { 
                         System.out.println("1. Add a Pet"); 
                         System.out.println("2. Display all Pets"); 
                         System.out.println("3. Update a Pet"); 
                         System.out.println("4. Delete a Pet"); 
                         System.out.println("5. Search a Pet By Id"); 
                         System.out.println("6. Exit"); 
  
                         int choice = sc.nextInt(); 
                         sc.nextLine(); 
                         switch(choice) { 
                         case 1 : 
  
                             System.out.print("Enter Pet ID: "); 
                             pet.setPetId(sc.nextInt());                 
  
                             System.out.print("Enter Pet Name: "); 
                             pet.setPetName(br.readLine()); 
  
                             System.out.print("Enter Pet Color: "); 
                             pet.setPetColor(br.readLine()); 
  
                             System.out.print("Enter Price of Pet: "); 
                             pet.setPetPrice(sc.nextInt());
                             
                             
                             pd.insertPet(pet);
                             
                             
                             
                             System.out.println("--------------------------");
                             System.out.println("--------You have sucessfully added a pet--------");
                                    
                             System.out.println("1. To view the changes in the data base"); 
                             System.out.println("2. Go to Main menu");
                             int view = sc.nextInt(); 
                             sc.nextLine();
                             
                             switch (view) {
                             case 1:
                            	 List<Pet>a1 = pd.getAllPets(); 
                           	  
                                 for (Pet pets : a1) { 
                                     System.out.println("Pet ID: " + pets.getPetId()); 
                                     System.out.println("Pet Name: " + pets.getPetName()); 
                                     System.out.println("Pet Price: " + pets.getPetPrice()); 
                                     System.out.println("Pet Color: " + pets.getPetColor()); 

                                     System.out.println("--------------------------"); 
                                 }
                             case 2:
                             
                            	 break;
                             
                             } 
                             //pd.getcount(pet);
                             break; 
                         case 2: 
  
                                 List<Pet>allPets = pd.getAllPets(); 
  
                                 for (Pet pets : allPets) { 
                                     System.out.println("Pet ID: " + pets.getPetId()); 
                                     System.out.println("Pet Name: " + pets.getPetName()); 
                                     System.out.println("Pet Price: " + pets.getPetPrice()); 
                                     System.out.println("Pet Color: " + pets.getPetColor()); 
  
                                     System.out.println("--------------------------"); 
                                 } 
                                 break; 
                         case 3: 
                                   System.out.print("Enter Pet ID that you want to update: "); 
                                   pet.setPetId(sc.nextInt()); 
  
                                   System.out.print("Enter Pet Name : "); 
                                   pet.setPetName(br.readLine()); 
  
                                   System.out.print("Enter Pet Price: "); 
                                   pet.setPetPrice(sc.nextInt()); 
  
                                   System.out.print("Enter Pet Color:"); 
                                   pet.setPetColor(br.readLine()); 
                                   pd.updatePet(pet); 
                                   
                                   System.out.println("--------------------------");
                                   System.out.println("You have sucessfully updated a pet");
                                   
                                   System.out.println("1. To view the changes in the data base"); 
                                   System.out.println("2. Go to Main menu");
                                   int view2 = sc.nextInt(); 
                                   sc.nextLine();
                                   
                                   switch (view2) {
                                   case 1:
                                  	 List<Pet>a1 = pd.getAllPets(); 
                                 	  
                                       for (Pet pets : a1) { 
                                           System.out.println("Pet ID: " + pets.getPetId()); 
                                           System.out.println("Pet Name: " + pets.getPetName()); 
                                           System.out.println("Pet Price: " + pets.getPetPrice()); 
                                           System.out.println("Pet Color: " + pets.getPetColor()); 

                                           System.out.println("--------------------------"); 
                                       }
                                   case 2:
                                   
                                  	 break;
                                   
                                   }
                                   
                                   
                                   break; 
  
                         case 4: 
                                 System.out.print("Enter Pet ID that you want to Delete: "); 
                                 pd.deletePet(sc.nextInt());
                                 
                                 System.out.println("--------------------------");
                                 System.out.println("You have sucessfully deleted a pet");
                                                                 
                                 System.out.println("1. To view the changes in the data base"); 
                                 System.out.println("2. Go to Main Menu");
                                 int view3 = sc.nextInt(); 
                                 sc.nextLine();
                                 
                                 switch (view3) {
                                 case 1:
                                	 List<Pet>a1 = pd.getAllPets(); 
                               	  
                                     for (Pet pets : a1) { 
                                         System.out.println("Pet ID: " + pets.getPetId()); 
                                         System.out.println("Pet Name: " + pets.getPetName()); 
                                         System.out.println("Pet Price: " + pets.getPetPrice()); 
                                         System.out.println("Pet Color: " + pets.getPetColor()); 

                                         System.out.println("--------------------------"); 
                                     }
                                 case 2:
                                 
                                	 break;
                                 
                                 }
                                 
  
                                   break; 
                         case 5: 
                                 System.out.print("Enter Pet ID which you want to search: "); 
                                 List<Pet> petdata = pd.search(sc.nextInt()); 
  
                                 for (Pet pets : petdata) { 
                                     System.out.println("Pet ID: " + pets.getPetId()); 
                                     System.out.println("Pet Name: " + pets.getPetName()); 
                                     System.out.println("Pet Price: " + pets.getPetPrice()); 
                                     System.out.println("Pet Color: " + pets.getPetColor()); 
  
                                     System.out.println("--------------------------"); 
                                 } 
                                 break; 
                         case 6: 
                                 f=false; 
                                 break; 
  
                         } 
  
  
                 } 
                 sc.close(); 
         } 
 }
