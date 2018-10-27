package com.blu3flux.snakeonline;

import java.io.IOException;

import com.blu3flux.entities.Direction;
import com.blu3flux.snakeonline.players.Player;

public class Input implements Runnable{
	
	Player player;
	
	public Input(Player p) {
		this.player = p;
	}

	@Override
	public void run() {
		while(true) {
			Direction d = Direction.right;
			try {
				d = (Direction) player.getObjectInputStream().readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			player.getSnake().setDirection(d);
		}
	}

}
