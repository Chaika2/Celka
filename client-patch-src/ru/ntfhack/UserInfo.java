package ru.ntfhack;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Client patch: replaces the hard-coded identity used by the HUD/WaterMark.
 *
 * <p>The original class always reported {@code LORDMAKAVTOJJ} with UID 2,
 * which also forced the Popka module on. This version reads the nickname the
 * launcher passed via {@code --username} (see
 * {@code net.minecraft.client.main.Main}) and generates a random UID once per
 * game session.</p>
 */
public class UserInfo {
   private static final int UID = ThreadLocalRandom.current().nextInt(100000, 1000000);

   public static String getUsername() {
      String name = System.getProperty("celestial.username");
      if (name == null || name.isBlank()) {
         name = "Player";
      }
      return name;
   }

   public static int getUID() {
      return UID;
   }
}
