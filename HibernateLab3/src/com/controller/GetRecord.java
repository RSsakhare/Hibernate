package com.controller;

import org.hibernate.Session;
import com.hibernate.utility.HibernateUtil;
import com.model.Batsman;
import com.model.Bowler;
import com.model.Player;

import java.util.Scanner;

public class GetRecord {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player ID: ");
        int playerId = scanner.nextInt();

        Player player = (Player) session.get(Player.class, playerId);
        if (player != null) {
            System.out.println("Player ID: " + player.getPlayerId());
            System.out.println("Player Name: " + player.getPlayerName());
            System.out.println("Number of Matches: " + player.getNumMatches());
            System.out.println("Address: " + player.getResAddr().getStreet() + ", " + player.getResAddr().getCity() + ", " + player.getResAddr().getCountry() + ", " + player.getResAddr().getPinCode());

            if (player instanceof Batsman) {
                System.out.println("Number of Runs: " + ((Batsman) player).getNumRuns());
            } else if (player instanceof Bowler) {
                System.out.println("Number of Wickets: " + ((Bowler) player).getNumWickets());
            }
        } else {
            System.out.println("Player not found!");
        }
        scanner.close();
        session.getTransaction().commit();
        session.close();
        
    }
}

