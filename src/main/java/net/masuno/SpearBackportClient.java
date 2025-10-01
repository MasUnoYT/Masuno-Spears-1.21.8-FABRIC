package net.masuno;

import net.fabricmc.api.ClientModInitializer;
import net.masuno.events.ModEventsClient;

public class SpearBackportClient implements ClientModInitializer {
   public void onInitializeClient() {
      ModEventsClient.init();
   }
}
