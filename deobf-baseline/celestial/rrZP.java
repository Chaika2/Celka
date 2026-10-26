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
   private static String[] stringsfda1a12b8e6d3a64af93b1c14ed22523;
   public Object[] fieldsfda1a12b8e6d3a64af93b1c14ed22523;
   private static byte[] bytesfda1a12b8e6d3a64af93b1c14ed22523;
   public static Object[] staticFieldsfda1a12b8e6d3a64af93b1c14ed22523;
   private static short[] shortsfda1a12b8e6d3a64af93b1c14ed22523;
   private static long[] longsfda1a12b8e6d3a64af93b1c14ed22523;
   private static boolean[] booleansfda1a12b8e6d3a64af93b1c14ed22523;

   private rrZP() {
      this.id_finally();
      Boolean var7 = booleansfda1a12b8e6d3a64af93b1c14ed22523[0];
      this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[1]] = var7;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 105, -101, -128, -97, -54, 27, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3184952807016864502L;
   }

   public void id_class() {
      DiscordRPC.INSTANCE.Discord_Shutdown();
      Boolean var5 = booleansfda1a12b8e6d3a64af93b1c14ed22523[2];
      this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[2]] = var5;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -191609160;
   }

   public void id_class(rrZr_1 var1) {
      Pair var2 = this.id_native();
      Builder var3 = new Builder();
      var3.setStartTimestamp(
         (Long)staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[3]] / longsfda1a12b8e6d3a64af93b1c14ed22523[0]
      );
      var3.setDetails("UID » " + var1.id_protected());
      var3.setState(stringsfda1a12b8e6d3a64af93b1c14ed22523[2]);
      var3.setLargeImage(stringsfda1a12b8e6d3a64af93b1c14ed22523[3], stringsfda1a12b8e6d3a64af93b1c14ed22523[4]);
      var3.setSmallImage((String)var2.getLeft(), (String)var2.getRight());
      var3.setButtons(
         RPCButton.create(stringsfda1a12b8e6d3a64af93b1c14ed22523[5], stringsfda1a12b8e6d3a64af93b1c14ed22523[6]),
         RPCButton.create(stringsfda1a12b8e6d3a64af93b1c14ed22523[7], stringsfda1a12b8e6d3a64af93b1c14ed22523[8])
      );
      DiscordRPC.INSTANCE.Discord_UpdatePresence(var3.build());
   }

   public void id_break() {
      DiscordEventHandlers var1 = new discord.DiscordEventHandlers.Builder()
         .ready(
            var0 -> {
               String var1x = stringsfda1a12b8e6d3a64af93b1c14ed22523[26];
               if (var0.avatar != null) {
                  var1x = var1x + var0.userId + "/" + var0.avatar + ".png";
               }

               ((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[9]]).id_class(var0);
               ((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[10]]).id_break(var1x);
               ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[shortsfda1a12b8e6d3a64af93b1c14ed22523[11]])
                  .id_class((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[12]]);
            }
         )
         .build();
      DiscordRPC.INSTANCE
         .Discord_Initialize(
            stringsfda1a12b8e6d3a64af93b1c14ed22523[0], var1, booleansfda1a12b8e6d3a64af93b1c14ed22523[1], stringsfda1a12b8e6d3a64af93b1c14ed22523[1]
         );
      new Thread(() -> {
         while (this.fieldsfda1a12b8e6d3a64af93b1c14ed22523[shortsfda1a12b8e6d3a64af93b1c14ed22523[7]]) {
            DiscordRPC.INSTANCE.Discord_RunCallbacks();
            this.id_class((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[8]]);

            try {
               Thread.sleep(longsfda1a12b8e6d3a64af93b1c14ed22523[1]);
            } catch (InterruptedException var2) {
            }
         }
      }).start();
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrZP(), stringsfda1a12b8e6d3a64af93b1c14ed22523[28], 1787089031580L, null};
      var0[3] = new rrZP[]{(rrZP)var0[0]};
      staticFieldsfda1a12b8e6d3a64af93b1c14ed22523 = var0;
   }

   private void id_finally() {
      if (this.fieldsfda1a12b8e6d3a64af93b1c14ed22523 == null) {
         this.fieldsfda1a12b8e6d3a64af93b1c14ed22523 = new Object[booleansfda1a12b8e6d3a64af93b1c14ed22523[7]];
         Object[] var1 = this.fieldsfda1a12b8e6d3a64af93b1c14ed22523;
         var1[booleansfda1a12b8e6d3a64af93b1c14ed22523[8]] = booleansfda1a12b8e6d3a64af93b1c14ed22523[9];
      }
   }

   private static void id_catch() {
      shortsfda1a12b8e6d3a64af93b1c14ed22523 = new short[]{3, 0, 0, 2, 1, 0, 5, 0, 5, 5, 5, 0, 5, 0};
   }

   private static void id_case() {
      bytesfda1a12b8e6d3a64af93b1c14ed22523 = new byte[]{3, 2, 4, 2};
   }

   private static void id_implements() {
      booleansfda1a12b8e6d3a64af93b1c14ed22523 = new boolean[]{true, true, false, true, false, false, false, true, false, false, true};
   }

   private static void id_protected() {
      longsfda1a12b8e6d3a64af93b1c14ed22523 = new long[]{1000L, 2000L, 0L};
   }

   private static void id_private() {
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

   private Pair<String, String> id_native() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[4]];
      if (var1 != null) {
         switch (((int[])rrZB.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[5]])[var1.ordinal()]) {
            case 1:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[9], stringsfda1a12b8e6d3a64af93b1c14ed22523[10]);
            case 2:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[11], stringsfda1a12b8e6d3a64af93b1c14ed22523[12]);
            case 3:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[13], stringsfda1a12b8e6d3a64af93b1c14ed22523[14]);
            case 4:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[15], stringsfda1a12b8e6d3a64af93b1c14ed22523[16]);
            case 5:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[17], stringsfda1a12b8e6d3a64af93b1c14ed22523[18]);
            case 6:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[19], stringsfda1a12b8e6d3a64af93b1c14ed22523[20]);
            case 7:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[21], stringsfda1a12b8e6d3a64af93b1c14ed22523[22]);
            case 8:
               return Pair.of(stringsfda1a12b8e6d3a64af93b1c14ed22523[23], stringsfda1a12b8e6d3a64af93b1c14ed22523[24]);
         }
      }

      return Pair.of(((rrZr_1)rrQJ.id_class[shortsfda1a12b8e6d3a64af93b1c14ed22523[6]]).id_byte(), stringsfda1a12b8e6d3a64af93b1c14ed22523[25]);
   }
}
