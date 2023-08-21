package program;


import java.util.InputMismatchException;
import java.util.Scanner;
import entities.UserManager;

import entities.User;

public class Main {

    public static void main(String[] args) {


	int i = 0, loggedUser = -1;
	char wannaComment = 'y';


	
	 UserManager userManager = UserManager.getInstance();
     Scanner sc = new Scanner(System.in);
     int choose = 0, tempChoose = 0;

	while (true) {
	  
		System.out.println("  _____ _                 _ ");
		System.out.println(" |_   _| |               | |");
		System.out.println("   | | | |__   __ _ _ __ | |");
		System.out.println("   | | | '_ \\ / _` | '_ \\| |");
		System.out.println("  _| |_| | | | (_| | | | |_|");
		System.out.println(" |_____|_| |_|\\__,_|_| |_(_)");
		System.out.println("                           ");
		System.out.println("  {Ihan!(/) - CONNECTING}");
		//	    System.out.println();
	    do {
		System.out.println("{1} NEW ACCOUNT ~ {2} LOGIN");
		System.out.print(":~$ ");
		choose = sc.nextInt();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		switch (choose) {
		case 1:
		    sc.nextLine();
		    System.out.print("USER NAME:~$ ");
		    String username = sc.nextLine();
		    System.out.print("PASSWORD:~$ ");
		    String password = sc.nextLine();
		    System.out.print("FULL NAME:~$ ");
		    String name = sc.nextLine();
		    System.out.print("BIRTHDATE (dd/MM/yyyy):~$ ");
		    String birthdate = sc.nextLine();
		    System.out.print("RELATIONSHIP:~$ ");
		    String relationship = sc.nextLine();
		    System.out.println();
		    userManager.getUsers().add(new User(username, password, name, birthdate, relationship));
		    break;
		case 2:
		    sc.nextLine();
		    do {
			System.out.print("USERNAME:~$ ");
			String usernameCheck = sc.nextLine();
			System.out.print("PASSWORD:~$ ");
			String passwordCheck = sc.nextLine();
			System.out.println();
			for (i = 0; i < userManager.getUsers().size(); i++) {
			    if (userManager.getUsers().get(i).getUsername().contentEquals(usernameCheck)
				    && userManager.getUsers().get(i).getPassword().contentEquals(passwordCheck)) {
				loggedUser = i;
				break;
			    }
			}
		    } while (loggedUser < 0);
		}
	    } while (loggedUser < 0);

	    do {
		System.out.println("  _____ _                 _ ");
		System.out.println(" |_   _| |               | |");
		System.out.println("   | | | |__   __ _ _ __ | |");
		System.out.println("   | | | '_ \\ / _` | '_ \\| |");
		System.out.println("  _| |_| | | | (_| | | | |_|");
		System.out.println(" |_____|_| |_|\\__,_|_| |_(_)");
		System.out.println("                           ");
		System.out.println("  {Ihan!(/) - CONNECTING}");
		System.out.println();
		System.out.println();
		System.out.println("                    {LOGGED AS " + userManager.getUsers().get(loggedUser).getName() + "}");
		userManager.getUsers().get(loggedUser).showFriends();
		userManager.getUsers().get(loggedUser).showPosts();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("{1} USER SETTINGS");
		System.out.println("{2} POSTS");
		System.out.println("{3} MARKETPLACE");
		System.out.println("{4} FRIENDS");
		System.out.println("{5} EVENTS");
		System.out.println("{6} LOGOUT");
		System.out.print(":~$ ");
		choose = sc.nextInt();
		System.out.println();
		if (choose == 1) {
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("{WHICH INFORMATION DO YOU WANT TO SET?}");
		    System.out.println();
		    System.out.println("[1] E-MAIL: " + userManager.getUsers().get(loggedUser).getUsername());
		    System.out.println("[2] PASSWORD: " + userManager.getUsers().get(loggedUser).getPassword());
		    System.out.println("[3] NAME: " + userManager.getUsers().get(loggedUser).getName());
		    System.out.println("[4] BIRTHDATE (dd/mm/yyyy): " + userManager.getUsers().get(loggedUser).getBirthdate());
		    System.out.println("[5] RELATIONSHIP: " + userManager.getUsers().get(loggedUser).getRelationship());
		    System.out.println("[6] MAIN MENU");
		    System.out.print(":~$ ");
		    tempChoose = sc.nextInt();
		    switch (tempChoose) {
		    case 1:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT E-MAIL} " + userManager.getUsers().get(loggedUser).getUsername());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW E-MAIL:~$ ");
			String newUsername = sc.nextLine();
			System.out.println();
			userManager.getUsers().get(loggedUser).setUsername(newUsername);
			break;
		    case 2:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT PASSWORD} " + userManager.getUsers().get(loggedUser).getPassword());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW PASSWORD:~$ ");
			String newPassword = sc.nextLine();
			System.out.println();
			userManager.getUsers().get(loggedUser).setPassword(newPassword);
			break;
		    case 3:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT FULL NAME} " + userManager.getUsers().get(loggedUser).getName());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW FULL NAME:~$ ");
			String newName = sc.nextLine();
			System.out.println();
			userManager.getUsers().get(loggedUser).setName(newName);
			break;
		    case 4:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT BIRTHDATE} " + userManager.getUsers().get(loggedUser).getBirthdate());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW BIRTHDATE:~$ ");
			String newBirthdate = sc.nextLine();
			System.out.println();
			userManager.getUsers().get(loggedUser).setBirthdate(newBirthdate);
			break;
		    case 5:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT RELATIONSHIP STATUS} " + userManager.getUsers().get(loggedUser).getRelationship());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW RELATIONSHIP STATUS:~$ ");
			String newRelationship = sc.nextLine();
			System.out.println();
			userManager.getUsers().get(loggedUser).setRelationship(newRelationship);
			break;
		    case 6:
			break;
		    }
		}
		if (choose == 2) {
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("{POSTS}");
		    System.out.println();
		    System.out.println("{1} WHATS ON YOUR MIND?");
		    System.out.println("{2} LIST YOUR POSTS");
		    System.out.println("{3} LIST ALL POSTS");
		    System.out.println("{4} MAIN MENU");
		    System.out.print(":~$ ");
		    System.out.println();
		    tempChoose = sc.nextInt();
		    System.out.println();
		    	switch (tempChoose) {
				   case 1:
							Integer idPost = null;
							while (idPost == null) {
								System.out.print("POST ID:~$ ");
								try {
									idPost = sc.nextInt();
								} catch (InputMismatchException e) {
									System.out.println("Invalid input. Please enter a valid number.");
									sc.nextLine(); // Clear the invalid input from the scanner buffer
								}
							}
							sc.nextLine(); // Consume the newline character

							System.out.print("POST CONTENT:~$ ");
							String content = sc.nextLine();
							userManager.getUsers().get(loggedUser).addPost(userManager.getUsers().get(loggedUser), idPost, content);
							System.out.println();
							break;

				   case 2:
						if (userManager.getUsers().get(loggedUser).getPosts().isEmpty()) {
						    System.out.println("{YOU DON'T HAVE ANY POST YET}");
						} else {
						    userManager.getUsers().get(loggedUser).showPosts();
						    do {
						        System.out.println();
						        System.out.println("{1} EDIT POST ~ {2} REMOVE POST ~ {3} MAIN MENU");
						        System.out.print(":~$ ");
				   
						        boolean isValidChoice = false;

						        while (!isValidChoice) {
						            try {
						                tempChoose = sc.nextInt();
						                if (tempChoose >= 1 && tempChoose <= 3) {
						                    isValidChoice = true;
						                } else {
						                    System.out.println("Please enter a valid option (1, 2, or 3).");
						                    System.out.print(":~$ ");
						                }
						            } catch (InputMismatchException e) {
						                System.out.println("Invalid input. Please enter a valid number (1, 2, or 3).");
						                sc.nextLine(); // Clear the invalid input from the scanner buffer
						            }
						        }

						        System.out.println();
						
							switch (tempChoose) {
							case 1:
							    sc.nextLine();
							    userManager.getUsers().get(loggedUser).showYourPosts();
							    System.out.println(
							        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							    Integer postId = null;
							    
							    while (postId == null) {
							        System.out.print("SELECT THE ID OF THE POST THAT YOU WANT TO EDIT:~$ ");
							        try {
							            postId = sc.nextInt();
							        } catch (InputMismatchException e) {
							            System.out.println("Invalid input. Please enter a valid integer.");
							            sc.nextLine(); // Clear the invalid input from the scanner buffer
							        }
							    }
							    
							    System.out.println();
							    sc.nextLine();
							    System.out.print("WRITE A NEW CONTENT:~$ ");
							    String editedContent = sc.nextLine();
							    userManager.getUsers().get(loggedUser).editPost(postId, editedContent);
							    break;

							case 2:
							    sc.nextLine();
							    userManager.getUsers().get(loggedUser).showPosts();
							    Integer postIdToRemove = null;

							    while (postIdToRemove == null) {
							        System.out.print("SELECT THE ID OF THE POST THAT YOU WANT TO REMOVE:~$ ");
							        try {
							            postIdToRemove = sc.nextInt();
							        } catch (InputMismatchException e) {
							            System.out.println("Invalid input. Please enter a valid integer.");
							            sc.nextLine(); // Clear the invalid input from the scanner buffer
							        }
							    }

							    userManager.getUsers().get(loggedUser).removePost(postIdToRemove);
							    break;

							case 3:
							    break;
							}
						  } while (tempChoose != 3);
						}
					break;
		    case 3:
		    	for (i = 0; i < userManager.getUsers().size(); i++) {
			    if (userManager.getUsers().get(i).getPosts().isEmpty()) {

			    } else {
				userManager.getUsers().get(i).showPosts();
				System.out.println();
			    }
		    }
			wannaComment = 'y';
			
			break;
		    case 4:
				break;
		    }
		}
		if (choose == 3) {
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("{MARKETPLACE}");
		    System.out.println();
		    System.out.println("{1} NEW SALE");
		    System.out.println("{2} LIST YOUR SALES");
		    System.out.println("{3} LIST ALL SALES");
		    System.out.println("{4} MAIN MENU");
		    System.out.print(":~$ ");
		    tempChoose = sc.nextInt();
		    System.out.println();
		    switch (tempChoose) {
			    case 1:
					System.out.println(
						"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.print("PRODUCT'S ID:~$ ");
					Integer productIdAdd = sc.nextInt();
					sc.nextLine();
					System.out.print("PRODUCT:~$ ");
					String product = sc.nextLine();
					System.out.print("PRICE ($):~$ ");
					Double price = sc.nextDouble();
					sc.nextLine();
					System.out.print("PRODUCT DESCRIPTION:~$ ");
					String description = sc.nextLine();
					userManager.getUsers().get(loggedUser).addProduct(userManager.getUsers().get(loggedUser), productIdAdd, product, price,
						description);
					break;
			    case 2:
					if (userManager.getUsers().get(loggedUser).getMarketplace().isEmpty()) {
					    System.out.println("{YOU DON'T HAVE ANY PRODUCT YET}");
					} else {
					    userManager.getUsers().get(loggedUser).showMarket();
					    do {
						System.out.println();
						System.out.println("{1} EDIT SALE ~ {2} REMOVE SALE ~ {3} MAIN MENU");
						tempChoose = sc.nextInt();
						System.out.println();
						switch (tempChoose) {
							case 1:
							    sc.nextLine();
							    userManager.getUsers().get(loggedUser).showYourMarket();
							    System.out.println(
								    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							    System.out.print("SELECT THE ID OF A PRODUCT THAT YOU WANT TO EDIT:~$ ");
							    Integer productId = sc.nextInt();
							    sc.nextLine();
							    System.out.println();
							    System.out.println("SELECT PRODUCT'S INFO THAT YOU WANT TO EDIT");
							    System.out.println("{1} NAME ~ {2} PRICE ~ {3} DESCRIPTION ~ {4} CANCEL");
							    System.out.println(":~$ ");
							    tempChoose = sc.nextInt();
							    sc.nextLine();
							    
						    switch (tempChoose) {
							    case 1:
								System.out.print("NEW PRODUCT NAME:~$ ");
								String editedProduct = sc.nextLine();
								userManager.getUsers().get(loggedUser).editProductName(productId, editedProduct);
								tempChoose = 0;
								break;
							    case 2:
								System.out.print("NEW PRODUCT PRICE:~$ ");
								Double editedPrice = sc.nextDouble();
								userManager.getUsers().get(loggedUser).editProductPrice(productId, editedPrice);
								tempChoose = 0;
								break;
							    case 3:
								System.out.print("NEW PRODUCT DESCRIPTION:~$ ");
								String editedDescription = sc.nextLine();
								userManager.getUsers().get(loggedUser).editProductDescription(productId, editedDescription);
								tempChoose = 0;
								break;
							    case 4:
								tempChoose = 0;
								break;
						    }
				    break;
				case 2:
				    sc.nextLine();
				    userManager.getUsers().get(loggedUser).showMarket();
				    System.out.println(
					    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				    System.out.print("SELECT THE ID OF A PRODUCT THAT YOU WANT TO REMOVE:~$ ");
				    Integer productRemoveId = sc.nextInt();
				    sc.nextLine();
				    userManager.getUsers().get(loggedUser).removeProduct(productRemoveId);
				    break;
				case 3:
				    break;
				}
			    } while (tempChoose != 3);
			}
			break;
			
		    case 3:
		    	
				for (i = 0; i < userManager.getUsers().size(); i++) {
				    if (userManager.getUsers().get(i).getMarketplace().isEmpty()) {
				    } else {
					userManager.getUsers().get(i).showMarket();
					System.out.println();
				    }
				}

		
			wannaComment = 'y';
			break;
		    case 4:
			break;
		    }
		}
		if (choose == 4) {
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("{YOUR FRIENDS}");
		    System.out.println();
		    userManager.getUsers().get(loggedUser).showFollowers();
		    System.out.println();
		    System.out.println("{1} LIST ALL PEOPLE");
		    System.out.println("{2} UNFOLLOW FRIEND");
		    System.out.println("{3} MAIN MENU");
		    System.out.print(":~$ ");
		    tempChoose = sc.nextInt();
		    System.out.println();
		    switch (tempChoose) {
		    case 1:
		    	do {
					    System.out.println();
					    for (i = 0; i < userManager.getUsers().size(); i++) {
						System.out.println("# " + userManager.getUsers().get(i).getName());
					    }
					    System.out.println();
					    System.out.println("{1} FOLLOW NEW FRIEND");
					    System.out.println("{2} MAIN MENU");
					    tempChoose = sc.nextInt();
					    switch (tempChoose) {
					    case 1:
						System.out.println(
							"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						sc.nextLine();
						System.out.print("FRIEND NAME:~$ ");
						String frienNameAdd = sc.nextLine();
						for (i = 0; i < userManager.getUsers().size(); i++) {
						    if (userManager.getUsers().get(i).getName().contentEquals(frienNameAdd)) {
							userManager.getUsers().get(loggedUser).follow(userManager.getUsers().get(i).getName(),
								userManager.getUsers().get(i).getBirthdate(), userManager.getUsers().get(i).getRelationship());
						    }
						}
						break;
					    case 2:
						break;
					    }
			} while (tempChoose != 2);
			break;
			
		    case 2:
				System.out.println();
				userManager.getUsers().get(loggedUser).showFollowers();
				System.out.println();
				sc.nextLine();
				System.out.println("TO BACK TYPE 'RETURN'");
				System.out.print("FRIEND NAME:~$ ");
				String friendNameRemove = sc.nextLine();
				
				

				if (!friendNameRemove.equalsIgnoreCase("RETURN")) {
				    for (i = 0; i < userManager.getUsers().size(); i++) {
				        if (userManager.getUsers().get(loggedUser).getFollowers().get(i).getName().contentEquals(friendNameRemove)) {
				            userManager.getUsers().get(loggedUser).unfollow(friendNameRemove);
				            break;
				        }
				    }
				} else {
					break;
				}
			
		    case 3:
			break;
		    }
		}
		if (choose == 5) {
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("{EVENTS}");
		    System.out.println();
		    System.out.println("{1} NEW EVENT");
		    System.out.println("{2} LIST ALL EVENTS");
		    System.out.println("{3} MAIN MENU");
		    System.out.print(":~$ ");
		    tempChoose = sc.nextInt();
		    System.out.println();
		    
		    switch (tempChoose) {
		    
			    case 1:
					    System.out.print("EVENT'S ID:~$ ");
					    Integer devEventId = sc.nextInt();
					    sc.nextLine();
					    System.out.print("EVENT'S NAME:~$ ");
					    String devEventName = sc.nextLine();
					    System.out.print("EVENT'S DATE (dd/MM/yyyy):~$ ");
					    String devEventDate = sc.nextLine();
					    System.out.print("EVENT'S LOCAL:~$ ");
					    String devEventLocal = sc.nextLine();
					    System.out.print("EVENT'S DESCRIPTION:~$ ");
					    String devEventDescription = sc.nextLine();
					    userManager.getUsers().get(loggedUser).addDevEvent(userManager.getUsers().get(loggedUser), devEventId, devEventName,
						    devEventDate, devEventLocal, devEventDescription);
					    tempChoose = 0;
					    break;

			    case 2:
						if (userManager.getUsers().get(loggedUser).getDev().isEmpty()) {
						    System.out.println("{YOU DON'T HAVE ANY  EVENT YET}");
						} else {
						    userManager.getUsers().get(loggedUser).showDevEvents();
						    do {
							System.out.println();
							System.out.println("{1} EDIT EVENT ~ {2} REMOVE EVENT ~ {3} MAIN MENU");
							System.out.println(":~$ ");
							tempChoose = sc.nextInt();
							System.out.println();
								switch (tempChoose) {
								case 1:
								    sc.nextLine();
								    userManager.getUsers().get(loggedUser).showYourDevEvents();
								    System.out.println(
									    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								    System.out.print("SELECT THE ID OF A EVENT THAT YOU WANT TO EDIT:~$ ");
								    Integer eventId = sc.nextInt();
								    sc.nextLine();
								    System.out.println();
								    System.out.println("SELECT EVENT'S INFO THAT YOU WANT TO EDIT");
								    System.out
									    .println("{1} NAME ~ {2} DATE ~ {3} LOCAL ~ {4} DESCRIPTION ~ {5} CANCEL");
								    System.out.println(":~$ ");
								    tempChoose = sc.nextInt();
								    sc.nextLine();
								    
								    switch (tempChoose) {
										    case 1:
											System.out.print("NEW EVENT'S NAME:~$ ");
											String editedDevEventName = sc.nextLine();
											userManager.getUsers().get(loggedUser).editDevEventName(eventId, editedDevEventName);
											tempChoose = 0;
											break;
										    case 2:
											System.out.print("NEW EVENT'S DATE:~$ ");
											String editedDevEventDate = sc.nextLine();
											userManager.getUsers().get(loggedUser).editDevEventDate(eventId, editedDevEventDate);
											tempChoose = 0;
											break;
										    case 3:
											System.out.print("NEW EVENT'S LOCAL:~$ ");
											String editedDevEventLocal = sc.nextLine();
											userManager.getUsers().get(loggedUser).editDevEventLocal(eventId, editedDevEventLocal);
											tempChoose = 0;
											break;
										    case 4:
											System.out.print("NEW EVENT'S DESCRIPTION:~$ ");
											String editedDevEventDesc = sc.nextLine();
											userManager.getUsers().get(loggedUser).editDevEventDescription(eventId, editedDevEventDesc);
											tempChoose = 0;
											break;
										    case 5:
											tempChoose = 0;
											break;
										    }
							    break;
							    
								case 2:
								    sc.nextLine();
								    userManager.getUsers().get(loggedUser).showDevEvents();
								    System.out.println(
									    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								    System.out.print("SELECT THE ID OF THE EVENT THAT YOU WANT TO REMOVE~$ ");
								    Integer eventDevRemoveId = sc.nextInt();
								    sc.nextLine();
								    userManager.getUsers().get(loggedUser).removeDevEvent(eventDevRemoveId);
								    break;
								case 3:
									break;
								}
						   } while (tempChoose != 3);
					}
			break;
		    case 3:
			break;
		    }
		}
		if (choose == 6) {
		    loggedUser = -1;
		    wannaComment = 'y';
		    break;
		}
	    } while (true);
	}
    }
}