package com.Biz.DeckofCards;
import java.util.Scanner;
import java.util.ArrayList;

public class DeckofCards {
        ArrayList<Players> playerList = new ArrayList<>();

    public void initCards(){
            String[] SUITS = {
                    "Clubs", "Diamonds", "Hearts", "Spades"
            };

            String[] RANKS = {
                    "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Jack", "Queen", "King", "Ace"
            };

            int n = SUITS.length * RANKS.length;
            String[] deck = new String[n];
            for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
              deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
                }
            }
        }
        public void addingPlayer(){

            System.out.print(" Enter the No of players to play : ");
            Scanner sc = new Scanner(System.in);
            int playerCount = sc.nextInt();
            if(playerCount >= 2 && playerCount <= 4){
                for(int i=0; i<playerCount; i++){
                    Players player = new Players();
                    playerList.add(player);
                }

            }else{
                System.out.println("Error Enter between 2 & 4 ");
            }
        }
    }

