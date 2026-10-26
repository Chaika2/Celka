package celestial;

import com.google.gson.JsonObject;
import discord.DiscordUser;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrvu_1 implements MinecraftAccessor {
   public static Object[] staticFields795d62f6fe74334786edf14455ec3bfd;
   private static boolean[] booleans795d62f6fe74334786edf14455ec3bfd;
   private static double[] doubles795d62f6fe74334786edf14455ec3bfd;
   private static String[] strings795d62f6fe74334786edf14455ec3bfd;
   private static short[] shorts795d62f6fe74334786edf14455ec3bfd;
   private static byte[] bytes795d62f6fe74334786edf14455ec3bfd;

   private static void id_byte() {
      strings795d62f6fe74334786edf14455ec3bfd = new String[]{
         new String("Celestial Audit"),
         new String("IP - "),
         new String("query"),
         new String(", Country - "),
         new String("country"),
         new String(", City - "),
         new String("city"),
         new String(""),
         new String("Anticheat message"),
         new String("Data:"),
         new String(""),
         new String("Game name:"),
         new String("Full message:"),
         new String("Server IP:"),
         new String(""),
         new String("Geolocation:"),
         new String("Build:"),
         new String("1.1"),
         new String("Time:"),
         new String("Europe/Moscow"),
         new String(""),
         new String("User was banned!"),
         new String("Data:"),
         new String(""),
         new String("Game name:"),
         new String("Reason:"),
         new String("Duration:"),
         new String("Banned by:"),
         new String("Ban time:"),
         new String("Mode data:"),
         new String("Server IP:"),
         new String("Unknown"),
         new String("Build:"),
         new String("1.1"),
         new String("Time:"),
         new String("Europe/Moscow"),
         new String(""),
         new String("User was banned!"),
         new String("Data:"),
         new String(""),
         new String("Game name:"),
         new String("Reason:"),
         new String("Duration:"),
         new String("Server IP:"),
         new String("Unknown"),
         new String("Build:"),
         new String("1.1"),
         new String("Time:"),
         new String("Europe/Moscow"),
         new String(""),
         new String(""),
         new String("Message"),
         new String("Data:"),
         new String("Report:"),
         new String("Time:"),
         new String("Europe/Moscow"),
         new String(""),
         new String("Data:"),
         new String("Game name:"),
         new String("Time:"),
         new String("Europe/Moscow"),
         new String("0.0.0.0"),
         new String("Failed Check"),
         new String("This is Number IP"),
         new String(""),
         new String("User started client!"),
         new String("Data:"),
         new String(""),
         new String(""),
         new String("Geolocation:"),
         new String("Computer name:"),
         new String("user.name"),
         new String("COMPUTERNAME"),
         new String("Client Version:"),
         new String("1.1"),
         new String("Java version:"),
         new String("java.version"),
         new String("Time:"),
         new String("Europe/Moscow"),
         new String("https://celka.xyz/payment"),
         new String("INSTANCE"),
         new String("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$"),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("")
      };
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 796581787;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2844385147085122976L;
   }

   public void id_class(rrZr_1 var1, String var2, Runnable var3) {
      ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[3]])
         .execute(
            () -> {
               try {
                  rrvW var4 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[49]);
                  DiscordUser var5 = var1.id_class();
                  String var6 = var5 == null ? strings795d62f6fe74334786edf14455ec3bfd[50] : "<@" + var5.userId + ">";
                  var4.id_class(
                     new rrvz_1()
                        .id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[3])))
                        .id_throws(strings795d62f6fe74334786edf14455ec3bfd[51])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[52],
                           "Username - " + var1.id_break() + ", Discord User - " + var6,
                           booleans795d62f6fe74334786edf14455ec3bfd[24]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[53], var2, booleans795d62f6fe74334786edf14455ec3bfd[25])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[54],
                           rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[55]),
                           booleans795d62f6fe74334786edf14455ec3bfd[26]
                        )
                  );
                  this.id_class(var4);
                  var3.run();
               } catch (IOException var7) {
                  var7.printStackTrace();
               }
            }
         );
   }

   public void id_class(rrZr_1 var1, String var2, String var3, String var4, String var5, String var6) {
      ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[5]])
         .execute(
            () -> {
               try {
                  rrvW var7 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[20]);
                  var7.id_class(
                     new rrvz_1()
                        .id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[1])))
                        .id_throws(strings795d62f6fe74334786edf14455ec3bfd[21])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[22],
                           "Username - "
                              + var1.id_break()
                              + ", UID - "
                              + var1.id_protected()
                              + ", Discord - "
                              + (var1.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[23] : var1.id_class().username),
                           booleans795d62f6fe74334786edf14455ec3bfd[7]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[24], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[8])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[25], var2, booleans795d62f6fe74334786edf14455ec3bfd[9])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[26], var3, booleans795d62f6fe74334786edf14455ec3bfd[10])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[27], var4, booleans795d62f6fe74334786edf14455ec3bfd[11])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[28], var5, booleans795d62f6fe74334786edf14455ec3bfd[12])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[29], var6, booleans795d62f6fe74334786edf14455ec3bfd[13])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[30],
                           (Ak_1)rrfp_3.id_class[shorts795d62f6fe74334786edf14455ec3bfd[7]] == null
                              ? strings795d62f6fe74334786edf14455ec3bfd[31]
                              : ((Ak_1)rrfp_3.id_class[shorts795d62f6fe74334786edf14455ec3bfd[8]]).id_break,
                           booleans795d62f6fe74334786edf14455ec3bfd[14]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[32],
                           strings795d62f6fe74334786edf14455ec3bfd[33],
                           booleans795d62f6fe74334786edf14455ec3bfd[15]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[34],
                           rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[35]),
                           booleans795d62f6fe74334786edf14455ec3bfd[16]
                        )
                  );
                  this.id_class(var7);
               } catch (IOException var8) {
                  var8.printStackTrace();
               }
            }
         );
   }

   public void id_class(rrZr_1 var1, String var2, String var3) {
      ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[6]])
         .execute(
            () -> {
               try {
                  rrvW var4 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[7]);
                  var4.id_class(
                     new rrvz_1()
                        .id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[0])))
                        .id_throws(strings795d62f6fe74334786edf14455ec3bfd[8])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[9],
                           "Username - "
                              + var1.id_break()
                              + ", UID - "
                              + var1.id_protected()
                              + ", Discord - "
                              + (var1.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[10] : var1.id_class().username),
                           booleans795d62f6fe74334786edf14455ec3bfd[0]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[11], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[1])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[12], var2, booleans795d62f6fe74334786edf14455ec3bfd[2])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[13],
                           var3 != null ? var3 : strings795d62f6fe74334786edf14455ec3bfd[14],
                           booleans795d62f6fe74334786edf14455ec3bfd[3]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[15], id_protected(), booleans795d62f6fe74334786edf14455ec3bfd[4])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[16],
                           strings795d62f6fe74334786edf14455ec3bfd[17],
                           booleans795d62f6fe74334786edf14455ec3bfd[5]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[18],
                           rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[19]),
                           booleans795d62f6fe74334786edf14455ec3bfd[6]
                        )
                  );
                  this.id_class(var4);
               } catch (IOException var5) {
                  var5.printStackTrace();
               }
            }
         );
   }

   private static void id_class() {
      Object[] var0 = new Object[]{
         new rrvu_1(),
         strings795d62f6fe74334786edf14455ec3bfd[82],
         strings795d62f6fe74334786edf14455ec3bfd[83],
         strings795d62f6fe74334786edf14455ec3bfd[84],
         strings795d62f6fe74334786edf14455ec3bfd[85],
         strings795d62f6fe74334786edf14455ec3bfd[86],
         strings795d62f6fe74334786edf14455ec3bfd[87],
         Pattern.compile(strings795d62f6fe74334786edf14455ec3bfd[81], 0),
         Executors.newSingleThreadExecutor(),
         null
      };
      var0[9] = new rrvu_1[]{(rrvu_1)var0[0]};
      staticFields795d62f6fe74334786edf14455ec3bfd = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -96, 8, 127, -61, 94, -29, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrZr_1 var1) {
      ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[1]])
         .execute(
            () -> {
               try {
                  rrvW var2 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[64]);
                  var2.id_class(
                     new rrvz_1()
                        .id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[5])))
                        .id_throws(strings795d62f6fe74334786edf14455ec3bfd[65])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[66],
                           "Username - "
                              + var1.id_break()
                              + ", UID - "
                              + var1.id_protected()
                              + ", Discord Name - "
                              + (var1.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[67] : var1.id_class().username)
                              + ", Discord ID - "
                              + (var1.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[68] : var1.id_class().userId),
                           booleans795d62f6fe74334786edf14455ec3bfd[31]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[69], id_protected(), booleans795d62f6fe74334786edf14455ec3bfd[32])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[70],
                           System.getProperty(strings795d62f6fe74334786edf14455ec3bfd[71]) + ", " + System.getenv(strings795d62f6fe74334786edf14455ec3bfd[72]),
                           booleans795d62f6fe74334786edf14455ec3bfd[33]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[73],
                           strings795d62f6fe74334786edf14455ec3bfd[74],
                           booleans795d62f6fe74334786edf14455ec3bfd[34]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[75],
                           System.getProperty(strings795d62f6fe74334786edf14455ec3bfd[76]),
                           booleans795d62f6fe74334786edf14455ec3bfd[35]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[77],
                           rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[78]),
                           booleans795d62f6fe74334786edf14455ec3bfd[36]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[79])
                  );
                  this.id_class(var2);
               } catch (IOException var3) {
                  var3.printStackTrace();
               }
            }
         );
   }

   public void id_class(rrvW var1) throws IOException {
      var1.id_class(strings795d62f6fe74334786edf14455ec3bfd[0]);
      var1.id_break();
   }

   public void id_class(rrZr_1 var1, String var2) {
      ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[2]])
         .execute(
            () -> {
               try {
                  rrvW var3 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[56]);
                  rrvz_1 var4 = new rrvz_1()
                     .id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[4])))
                     .id_throws(var2)
                     .id_class(
                        strings795d62f6fe74334786edf14455ec3bfd[57],
                        "Username - " + var1.id_break() + ", UID - " + var1.id_protected(),
                        booleans795d62f6fe74334786edf14455ec3bfd[27]
                     )
                     .id_class(strings795d62f6fe74334786edf14455ec3bfd[58], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[28])
                     .id_class(
                        strings795d62f6fe74334786edf14455ec3bfd[59],
                        rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[60]),
                        booleans795d62f6fe74334786edf14455ec3bfd[29]
                     );
                  if (!var2.equals(strings795d62f6fe74334786edf14455ec3bfd[61])
                     && ((Pattern)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[11]]).matcher(var2).matches()) {
                     var4.id_class(
                        strings795d62f6fe74334786edf14455ec3bfd[62], strings795d62f6fe74334786edf14455ec3bfd[63], booleans795d62f6fe74334786edf14455ec3bfd[30]
                     );
                  }

                  var3.id_class(var4);
                  this.id_class(var3);
               } catch (IOException var5) {
                  var5.printStackTrace();
               }
            }
         );
   }

   public void id_break(rrZr_1 var1, String var2, String var3) {
      ((ExecutorService)staticFields795d62f6fe74334786edf14455ec3bfd[shorts795d62f6fe74334786edf14455ec3bfd[4]])
         .execute(
            () -> {
               try {
                  rrvW var4 = new rrvW(strings795d62f6fe74334786edf14455ec3bfd[36]);
                  var4.id_class(
                     new rrvz_1()
                        .id_class(new Color((int)(Math.random() * doubles795d62f6fe74334786edf14455ec3bfd[2])))
                        .id_throws(strings795d62f6fe74334786edf14455ec3bfd[37])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[38],
                           "Username - "
                              + var1.id_break()
                              + ", UID - "
                              + var1.id_protected()
                              + ", Discord - "
                              + (var1.id_class() == null ? strings795d62f6fe74334786edf14455ec3bfd[39] : var1.id_class().username),
                           booleans795d62f6fe74334786edf14455ec3bfd[17]
                        )
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[40], id_import.id_while().id_byte(), booleans795d62f6fe74334786edf14455ec3bfd[18])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[41], var2, booleans795d62f6fe74334786edf14455ec3bfd[19])
                        .id_class(strings795d62f6fe74334786edf14455ec3bfd[42], var3, booleans795d62f6fe74334786edf14455ec3bfd[20])
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[43],
                           (Ak_1)rrfp_3.id_class[shorts795d62f6fe74334786edf14455ec3bfd[9]] == null
                              ? strings795d62f6fe74334786edf14455ec3bfd[44]
                              : ((Ak_1)rrfp_3.id_class[shorts795d62f6fe74334786edf14455ec3bfd[10]]).id_break,
                           booleans795d62f6fe74334786edf14455ec3bfd[21]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[45],
                           strings795d62f6fe74334786edf14455ec3bfd[46],
                           booleans795d62f6fe74334786edf14455ec3bfd[22]
                        )
                        .id_class(
                           strings795d62f6fe74334786edf14455ec3bfd[47],
                           rrfT_2.id_class(strings795d62f6fe74334786edf14455ec3bfd[48]),
                           booleans795d62f6fe74334786edf14455ec3bfd[23]
                        )
                  );
                  this.id_class(var4);
               } catch (IOException var5) {
                  var5.printStackTrace();
               }
            }
         );
   }

   private static void id_break() {
      bytes795d62f6fe74334786edf14455ec3bfd = new byte[]{9, 7, 8, 10, 2, 3, 4, 5, 6};
   }

   private static void id_throws() {
      doubles795d62f6fe74334786edf14455ec3bfd = new double[]{1.6777216E7, 1.6777216E7, 1.6777216E7, 1.6777216E7, 1.6777216E7, 1.6777216E7};
   }

   private static void id_case() {
      shorts795d62f6fe74334786edf14455ec3bfd = new short[]{9, 8, 8, 8, 8, 8, 8, 0, 0, 0, 0, 7, 0};
   }

   private static String id_protected() {
      JsonObject var0 = rrfT_2.id_break();
      StringBuilder var1 = new StringBuilder();
      if (var0 != null) {
         var1.append(strings795d62f6fe74334786edf14455ec3bfd[1])
            .append(var0.get(strings795d62f6fe74334786edf14455ec3bfd[2]).getAsString())
            .append(strings795d62f6fe74334786edf14455ec3bfd[3])
            .append(var0.get(strings795d62f6fe74334786edf14455ec3bfd[4]).getAsString())
            .append(strings795d62f6fe74334786edf14455ec3bfd[5])
            .append(var0.get(strings795d62f6fe74334786edf14455ec3bfd[6]).getAsString());
      }

      return var1.toString();
   }

   private static void id_private() {
      booleans795d62f6fe74334786edf14455ec3bfd = new boolean[]{
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }
}
