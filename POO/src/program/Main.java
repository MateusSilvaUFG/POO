package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.User;

public class Main {

    public static void main(String[] args) {

	List<User> users = new ArrayList<>();

	int i = 0, loggedUser = -1, choose = 0, tempChoose = 0;
	char wannaComment = 'y';

	Scanner sc = new Scanner(System.in);

	while (true) {
	    System.out.println();
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
		    users.add(new User(username, password, name, birthdate, relationship));
		    break;
		case 2:
		    sc.nextLine();
		    do {
			System.out.print("USERNAME:~$ ");
			String usernameCheck = sc.nextLine();
			System.out.print("PASSWORD:~$ ");
			String passwordCheck = sc.nextLine();
			System.out.println();
			for (i = 0; i < users.size(); i++) {
			    if (users.get(i).getUsername().contentEquals(usernameCheck)
				    && users.get(i).getPassword().contentEquals(passwordCheck)) {
				loggedUser = i;
				break;
			    }
			}
		    } while (loggedUser < 0);
		}
	    } while (loggedUser < 0);

	    do {
		System.out.println();
		System.out.println();
		System.out.println("                    {LOGGED AS " + users.get(loggedUser).getName() + "}");
		users.get(loggedUser).showFriends();
		users.get(loggedUser).showPosts();
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
		    System.out.println("[1] E-MAIL: " + users.get(loggedUser).getUsername());
		    System.out.println("[2] PASSWORD: " + users.get(loggedUser).getPassword());
		    System.out.println("[3] NAME: " + users.get(loggedUser).getName());
		    System.out.println("[4] BIRTHDATE (dd/mm/yyyy): " + users.get(loggedUser).getBirthdate());
		    System.out.println("[5] RELATIONSHIP: " + users.get(loggedUser).getRelationship());
		    System.out.println("[6] MAIN MENU");
		    System.out.print(":~$ ");
		    tempChoose = sc.nextInt();
		    switch (tempChoose) {
		    case 1:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT E-MAIL} " + users.get(loggedUser).getUsername());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW E-MAIL:~$ ");
			String newUsername = sc.nextLine();
			System.out.println();
			users.get(loggedUser).setUsername(newUsername);
			break;
		    case 2:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT PASSWORD} " + users.get(loggedUser).getPassword());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW PASSWORD:~$ ");
			String newPassword = sc.nextLine();
			System.out.println();
			users.get(loggedUser).setPassword(newPassword);
			break;
		    case 3:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT FULL NAME} " + users.get(loggedUser).getName());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW FULL NAME:~$ ");
			String newName = sc.nextLine();
			System.out.println();
			users.get(loggedUser).setName(newName);
			break;
		    case 4:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT BIRTHDATE} " + users.get(loggedUser).getBirthdate());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW BIRTHDATE:~$ ");
			String newBirthdate = sc.nextLine();
			System.out.println();
			users.get(loggedUser).setBirthdate(newBirthdate);
			break;
		    case 5:
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("{CURRENT RELATIONSHIP STATUS} " + users.get(loggedUser).getRelationship());
			System.out.println();
			sc.nextLine();
			System.out.print("NEW RELATIONSHIP STATUS:~$ ");
			String newRelationship = sc.nextLine();
			System.out.println();
			users.get(loggedUser).setRelationship(newRelationship);
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
						System.out.print("POST ID:~$ ");
						Integer idPost = sc.nextInt();
						sc.nextLine();
						System.out.print("POST CONTENT:~$ ");
						String content = sc.nextLine();
						users.get(loggedUser).addPost(users.get(loggedUser), idPost, content);
						System.out.println();
						break;
				   case 2:
						if (users.get(loggedUser).getPosts().isEmpty()) {
						    System.out.println("{YOU DON'T HAVE ANY POST YET}");
						} else {
						    users.get(loggedUser).showPosts();
						  do {
							System.out.println();
							System.out.println("{1} EDIT POST ~ {2} REMOVE POST ~ {3} MAIN MENU");
							tempChoose = sc.nextInt();
							System.out.println();
						
							switch (tempChoose) {
							case 1:
							    sc.nextLine();
							    users.get(loggedUser).showYourPosts();
							    System.out.println(
								    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							    System.out.print("SELECT THE ID OF THE POST THAT YOU WANT TO EDIT:~$ ");
							    Integer postId = sc.nextInt();
							    System.out.println();
							    sc.nextLine();
							    System.out.print("WRITE A NEW CONTENT:~$ ");
							    String editedContent = sc.nextLine();
							    users.get(loggedUser).editPost(postId, editedContent);
							    break;
							case 2:
							    sc.nextLine();
							    users.get(loggedUser).showPosts();
							    System.out.print("SELECT THE ID OF THE POST THAT YOU WANT TO REMOVE:~$ ");
							    postId = sc.nextInt();
							    users.get(loggedUser).removePost(postId);
							    break;
							case 3:
							    break;
							}
						  } while (tempChoose != 3);
						}
					break;
		    case 3:
		    	for (i = 0; i < users.size(); i++) {
			    if (users.get(i).getPosts().isEmpty()) {

			    } else {
				users.get(i).showPosts();
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
					users.get(loggedUser).addProduct(users.get(loggedUser), productIdAdd, product, price,
						description);
					break;
			    case 2:
					if (users.get(loggedUser).getMarketplace().isEmpty()) {
					    System.out.println("{YOU DON'T HAVE ANY PRODUCT YET}");
					} else {
					    users.get(loggedUser).showMarket();
					    do {
						System.out.println();
						System.out.println("{1} EDIT SALE ~ {2} REMOVE SALE ~ {3} MAIN MENU");
						tempChoose = sc.nextInt();
						System.out.println();
						switch (tempChoose) {
							case 1:
							    sc.nextLine();
							    users.get(loggedUser).showYourMarket();
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
								users.get(loggedUser).editProductName(productId, editedProduct);
								tempChoose = 0;
								break;
							    case 2:
								System.out.print("NEW PRODUCT PRICE:~$ ");
								Double editedPrice = sc.nextDouble();
								users.get(loggedUser).editProductPrice(productId, editedPrice);
								tempChoose = 0;
								break;
							    case 3:
								System.out.print("NEW PRODUCT DESCRIPTION:~$ ");
								String editedDescription = sc.nextLine();
								users.get(loggedUser).editProductDescription(productId, editedDescription);
								tempChoose = 0;
								break;
							    case 4:
								tempChoose = 0;
								break;
						    }
				    break;
				case 2:
				    sc.nextLine();
				    users.get(loggedUser).showMarket();
				    System.out.println(
					    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				    System.out.print("SELECT THE ID OF A PRODUCT THAT YOU WANT TO REMOVE:~$ ");
				    Integer productRemoveId = sc.nextInt();
				    sc.nextLine();
				    users.get(loggedUser).removeProduct(productRemoveId);
				    break;
				case 3:
				    break;
				}
			    } while (tempChoose != 3);
			}
			break;
			
		    case 3:
		    	
				for (i = 0; i < users.size(); i++) {
				    if (users.get(i).getMarketplace().isEmpty()) {
				    } else {
					users.get(i).showMarket();
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
		    users.get(loggedUser).showFollowers();
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
					    for (i = 0; i < users.size(); i++) {
						System.out.println("# " + users.get(i).getName());
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
						for (i = 0; i < users.size(); i++) {
						    if (users.get(i).getName().contentEquals(frienNameAdd)) {
							users.get(loggedUser).follow(users.get(i).getName(),
								users.get(i).getBirthdate(), users.get(i).getRelationship());
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
				users.get(loggedUser).showFollowers();
				System.out.println();
				sc.nextLine();
				System.out.println("TO BACK TYPE 'RETURN'");
				System.out.print("FRIEND NAME:~$ ");
				String friendNameRemove = sc.nextLine();
				
				

				if (!friendNameRemove.equalsIgnoreCase("RETURN")) {
				    for (i = 0; i < users.size(); i++) {
				        if (users.get(loggedUser).getFollowers().get(i).getName().contentEquals(friendNameRemove)) {
				            users.get(loggedUser).unfollow(friendNameRemove);
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
					    users.get(loggedUser).addDevEvent(users.get(loggedUser), devEventId, devEventName,
						    devEventDate, devEventLocal, devEventDescription);
					    tempChoose = 0;
					    break;

			    case 2:
						if (users.get(loggedUser).getDev().isEmpty()) {
						    System.out.println("{YOU DON'T HAVE ANY  EVENT YET}");
						} else {
						    users.get(loggedUser).showDevEvents();
						    do {
							System.out.println();
							System.out.println("{1} EDIT EVENT ~ {2} REMOVE EVENT ~ {3} MAIN MENU");
							System.out.println(":~$ ");
							tempChoose = sc.nextInt();
							System.out.println();
								switch (tempChoose) {
								case 1:
								    sc.nextLine();
								    users.get(loggedUser).showYourDevEvents();
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
											users.get(loggedUser).editDevEventName(eventId, editedDevEventName);
											tempChoose = 0;
											break;
										    case 2:
											System.out.print("NEW EVENT'S DATE:~$ ");
											String editedDevEventDate = sc.nextLine();
											users.get(loggedUser).editDevEventDate(eventId, editedDevEventDate);
											tempChoose = 0;
											break;
										    case 3:
											System.out.print("NEW EVENT'S LOCAL:~$ ");
											String editedDevEventLocal = sc.nextLine();
											users.get(loggedUser).editDevEventLocal(eventId, editedDevEventLocal);
											tempChoose = 0;
											break;
										    case 4:
											System.out.print("NEW EVENT'S DESCRIPTION:~$ ");
											String editedDevEventDesc = sc.nextLine();
											users.get(loggedUser).editDevEventDescription(eventId, editedDevEventDesc);
											tempChoose = 0;
											break;
										    case 5:
											tempChoose = 0;
											break;
										    }
							    break;
							    
								case 2:
								    sc.nextLine();
								    users.get(loggedUser).showDevEvents();
								    System.out.println(
									    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								    System.out.print("SELECT THE ID OF THE EVENT THAT YOU WANT TO REMOVE~$ ");
								    Integer eventDevRemoveId = sc.nextInt();
								    sc.nextLine();
								    users.get(loggedUser).removeDevEvent(eventDevRemoveId);
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