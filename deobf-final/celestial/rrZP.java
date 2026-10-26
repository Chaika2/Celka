package celestial;

import discord.DiscordEventHandlers;
import discord.DiscordRPC;
import discord.DiscordRichPresence.Builder;
import discord.helpers.RPCButton;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public enum rrZP implements MinecraftAccessor {
   ;
   private static String[] stringsfda1a12b8e6d3a64af93b1c14ed22523;
   public Object[] fieldsfda1a12b8e6d3a64af93b1c14ed22523;
   private static byte[] bytesfda1a12b8e6d3a64af93b1c14ed22523;
   public static Object[] staticFieldsfda1a12b8e6d3a64af93b1c14ed22523;
   private static short[] shortsfda1a12b8e6d3a64af93b1c14ed22523;
   private static long[] longsfda1a12b8e6d3a64af93b1c14ed22523;
   private static boolean[] booleansfda1a12b8e6d3a64af93b1c14ed22523;

   private rrZP() {
      this.finally_();
      Boolean var7 = true;
      this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[0] = var7;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 105, -101, -128, -97, -54, 27, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3184952807016864502L;
   }

   public void class_() {
      DiscordRPC.INSTANCE.Discord_Shutdown();
      Boolean var5 = false;
      this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[0] = var5;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -191609160;
   }

   public void class_(rrZr_1 var1) {
      Pair var2 = this.native_();
      Builder var3 = new Builder();
      var3.setStartTimestamp((Long)staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[2] / 1000L);
      var3.setDetails("UID » " + var1.protected_());
      var3.setState("Build » 1.1 (1.16.5)");
      var3.setLargeImage("https://i.imgur.com/5OALbHi.png", "t.me/CelestialMinecraft");
      var3.setSmallImage((String)var2.getLeft(), (String)var2.getRight());
      var3.setButtons(RPCButton.create("Купить", "https://celestial.su/"), RPCButton.create("Телеграм", "https://t.me/CelestialMinecraft"));
      DiscordRPC.INSTANCE.Discord_UpdatePresence(var3.build());
   }

   public void break_() {
      DiscordEventHandlers var1 = new discord.DiscordEventHandlers.Builder().ready(var0 -> {
         String var1x = "https://cdn.discordapp.com/avatars/";
         if (var0.avatar != null) {
            var1x = var1x + var0.userId + "/" + var0.avatar + ".png";
         }

         ((rrZr_1)rrQJ.class_[5]).class_(var0);
         ((rrZr_1)rrQJ.class_[5]).break_(var1x);
         ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).class_((rrZr_1)rrQJ.class_[5]);
      }).build();
      DiscordRPC.INSTANCE.Discord_Initialize("999325989563801640", var1, true, "");
      new Thread(() -> {
         while (this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[0]) {
            DiscordRPC.INSTANCE.Discord_RunCallbacks();
            this.class_((rrZr_1)rrQJ.class_[5]);

            try {
               Thread.sleep(longsfda1a12b8e6d3a64af93b1c14ed22523[1]);
            } catch (InterruptedException var2) {
            }
         }
      }).start();
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrZP(), "999325989563801640", 1787089031580L, null};
      var0[3] = new rrZP[]{(rrZP)var0[0]};
      staticFieldsfda1a12b8e6d3a64af93b1c14ed22523 = var0;
   }

   private void finally_() {
      if (this.fieldsfda1a12b8e6d3a64af93b1c14ed22523 == null) {
         this.fieldsfda1a12b8e6d3a64af93b1c14ed22523 = new Object[1];
         Object[] var1 = this.fieldsfda1a12b8e6d3a64af93b1c14ed22523;
         var1[0] = false;
      }
   }

   private static void catch_() {
      shortsfda1a12b8e6d3a64af93b1c14ed22523 = new short[]{3, 0, 0, 2, 1, 0, 5, 0, 5, 5, 5, 0, 5, 0};
   }

   private static void case_() {
      bytesfda1a12b8e6d3a64af93b1c14ed22523 = new byte[]{3, 2, 4, 2};
   }

   private static void implements_() {
      booleansfda1a12b8e6d3a64af93b1c14ed22523 = new boolean[]{true, true, false, true, false, false, false, true, false, false, true};
   }

   private static void protected_() {
      longsfda1a12b8e6d3a64af93b1c14ed22523 = new long[]{1000L, 2000L, 0L};
   }

   private static void private_() {
      stringsfda1a12b8e6d3a64af93b1c14ed22523 = new String[]{
         new String("999325989563801640"),
         new String(""),
         new String("Build » 1.1 (1.16.5)"),
         new String("https://i.imgur.com/5OALbHi.png"),
         new String("t.me/CelestialMinecraft"),
         new String("Купить"),
         new String("https://celestial.su/"),
         new String("Телеграм"),
         new String("https://t.me/CelestialMinecraft"),
         new String("https://smertnix55551.github.io/funtime.jpg"),
         new String("Играет на Funtime"),
         new String("https://smertnix55551.github.io/spookytime.png"),
         new String("Играет на SpookyTime"),
         new String("https://smertnix55551.github.io/holyworld.jpg"),
         new String("Играет на HolyWorld"),
         new String("https://smertnix55551.github.io/reallyworld.jpg"),
         new String("Играет на ReallyWorld"),
         new String("https://smertnix55551.github.io/metahvh.jpg"),
         new String("Играет на MetaHVH"),
         new String("https://smertnix55551.github.io/infinity.jpg"),
         new String("Играет на InfinityHVH"),
         new String("https://smertnix55551.github.io/aresmine.jpg"),
         new String("Играет на AresMine"),
         new String("https://smertnix55551.github.io/sunrise.jpg"),
         new String("Играет на Sunrise"),
         new String("vk.com/celestialclient"),
         new String("https://cdn.discordapp.com/avatars/"),
         new String("INSTANCE"),
         new String("999325989563801640")
      };
   }

   private Pair<String, String> native_() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.class_[1];
      if (var1 != null) {
         switch (((int[])rrZB.class_[0])[var1.ordinal()]) {
            case 1:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[9], "Играет на Funtime");
            case 2:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[11], "Играет на SpookyTime");
            case 3:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[13], "Играет на HolyWorld");
            case 4:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[15], "Играет на ReallyWorld");
            case 5:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[17], "Играет на MetaHVH");
            case 6:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[19], "Играет на InfinityHVH");
            case 7:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[21], "Играет на AresMine");
            case 8:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[23], "Играет на Sunrise");
         }
      }

      return Pair.of(((rrZr_1)rrQJ.class_[5]).byte_(), "vk.com/celestialclient");
   }
}
