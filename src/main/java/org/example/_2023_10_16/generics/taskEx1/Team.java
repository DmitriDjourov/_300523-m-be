package org.example._2023_10_16.generics.taskEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();
    private static final Random RANDOM = new Random(); //private static final - CAPS LOCK!

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant newParticipant) {
        participants.add(newParticipant);
        System.out.println("New participant was added to the team: " + name);
    }

    public void play(Team team) {
        String winner;
        int r = RANDOM.nextInt(2);
        if(r == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("WINNER NAME: " + winner);
    }
}
