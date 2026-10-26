package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfO_2 {
   public static Object[] staticFieldsf407dfe4cb09378d9b156ac8f4322895;
   private static int[] integersf407dfe4cb09378d9b156ac8f4322895;
   private static boolean[] booleansf407dfe4cb09378d9b156ac8f4322895;
   private static String[] stringsf407dfe4cb09378d9b156ac8f4322895;
   private static short[] shortsf407dfe4cb09378d9b156ac8f4322895;
   private static float[] floatsf407dfe4cb09378d9b156ac8f4322895;
   public Object[] fieldsf407dfe4cb09378d9b156ac8f4322895;
   private static byte[] bytesf407dfe4cb09378d9b156ac8f4322895;

   public rdn_3 id_byte() {
      return (rdn_3)this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[19]];
   }

   private rrfO_2(rLY[] var3, rdn_3 var4, int var5) {
      this.id_finally();
      this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[21]] = var3;
      this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[22]] = var4;
      Integer var12 = var5;
      this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[23]] = var12;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, -46, 97, 92, 75, -99, 73, -101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrfO_2 id_class(Collection<rLR> var0) {
      rrfO_2[] var1 = (rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[4]];
      int var2 = var1.length;

      for (int var3 = booleansf407dfe4cb09378d9b156ac8f4322895[6]; var3 < var2; var3++) {
         rrfO_2 var4 = var1[var3];
         if (((rLY[])var4.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[5]]).length == var0.size()) {
            boolean var5 = booleansf407dfe4cb09378d9b156ac8f4322895[7];

            for (rLR var7 : var0) {
               boolean var8 = booleansf407dfe4cb09378d9b156ac8f4322895[8];
               rLY[] var9 = (rLY[])var4.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[6]];
               int var10 = var9.length;

               for (int var11 = booleansf407dfe4cb09378d9b156ac8f4322895[9]; var11 < var10; var11++) {
                  rLY var12 = var9[var11];
                  if (var7.equals(var12.id_class())) {
                     var8 = booleansf407dfe4cb09378d9b156ac8f4322895[10];
                     break;
                  }
               }

               if (!var8) {
                  var5 = booleansf407dfe4cb09378d9b156ac8f4322895[11];
                  break;
               }
            }

            if (var5) {
               return var4;
            }
         }
      }

      return null;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4944702682757448260L;
   }

   private static boolean id_class(rLY var0, rLY var1) {
      if (var0 == var1) {
         return booleansf407dfe4cb09378d9b156ac8f4322895[13];
      } else {
         return var0.id_break() >= var1.id_break() && var0.id_byte() >= var1.id_byte() && var0.id_class().equals(var1.id_class())
            ? booleansf407dfe4cb09378d9b156ac8f4322895[14]
            : booleansf407dfe4cb09378d9b156ac8f4322895[15];
      }
   }

   public static rrfO_2 id_class(int var0) {
      float var1 = (float)(var0 >> bytesf407dfe4cb09378d9b156ac8f4322895[0] & shortsf407dfe4cb09378d9b156ac8f4322895[7]);
      float var2 = (float)(var0 >> bytesf407dfe4cb09378d9b156ac8f4322895[1] & shortsf407dfe4cb09378d9b156ac8f4322895[8]);
      float var3 = (float)(var0 & shortsf407dfe4cb09378d9b156ac8f4322895[9]);
      rrfO_2 var4 = null;
      float var5 = floatsf407dfe4cb09378d9b156ac8f4322895[0];
      rrfO_2[] var6 = (rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[10]];
      int var7 = var6.length;

      for (int var8 = booleansf407dfe4cb09378d9b156ac8f4322895[12]; var8 < var7; var8++) {
         rrfO_2 var9 = var6[var8];
         if ((Integer)var9.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[11]] == var0) {
            return var9;
         }

         float var10 = (float)(
            (Integer)var9.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[12]] >> bytesf407dfe4cb09378d9b156ac8f4322895[2]
               & shortsf407dfe4cb09378d9b156ac8f4322895[13]
         );
         float var11 = (float)(
            (Integer)var9.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[14]] >> bytesf407dfe4cb09378d9b156ac8f4322895[3]
               & shortsf407dfe4cb09378d9b156ac8f4322895[15]
         );
         float var12 = (float)(
            (Integer)var9.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[16]] & shortsf407dfe4cb09378d9b156ac8f4322895[17]
         );
         float var13 = var1 - var10;
         float var14 = var2 - var11;
         float var15 = var3 - var12;
         float var16 = var13 * var13 + var14 * var14 + var15 * var15;
         if (var16 < var5) {
            var5 = var16;
            var4 = var9;
         }
      }

      return var4;
   }

   public static rrfO_2 id_class(rdn_3 var0) {
      if (var0.id_break() != rdy_3.kk) {
         return null;
      } else {
         List var1 = rAB.id_class(var0);
         rrfO_2[] var2 = (rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[1]];
         int var3 = var2.length;

         for (int var4 = booleansf407dfe4cb09378d9b156ac8f4322895[0]; var4 < var3; var4++) {
            rrfO_2 var5 = var2[var4];
            if (((rLY[])var5.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[2]]).length == var1.size()) {
               boolean var6 = booleansf407dfe4cb09378d9b156ac8f4322895[1];

               for (rLY var8 : var1) {
                  boolean var9 = booleansf407dfe4cb09378d9b156ac8f4322895[2];
                  rLY[] var10 = (rLY[])var5.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[3]];
                  int var11 = var10.length;

                  for (int var12 = booleansf407dfe4cb09378d9b156ac8f4322895[3]; var12 < var11; var12++) {
                     rLY var13 = var10[var12];
                     if (id_class(var8, var13)) {
                        var9 = booleansf407dfe4cb09378d9b156ac8f4322895[4];
                        break;
                     }
                  }

                  if (!var9) {
                     var6 = booleansf407dfe4cb09378d9b156ac8f4322895[5];
                     break;
                  }
               }

               if (var6) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public rLY[] id_class() {
      return (rLY[])this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[18]];
   }

   public int id_break() {
      return (Integer)this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[20]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 860926296;
   }

   private void id_finally() {
      if (this.fieldsf407dfe4cb09378d9b156ac8f4322895 == null) {
         this.fieldsf407dfe4cb09378d9b156ac8f4322895 = new Object[3];
         this.fieldsf407dfe4cb09378d9b156ac8f4322895[2] = 0;
      }
   }

   private static void id_catch() {
      shortsf407dfe4cb09378d9b156ac8f4322895 = new short[]{
         8,
         7,
         0,
         0,
         7,
         0,
         0,
         255,
         255,
         255,
         7,
         2,
         2,
         255,
         2,
         255,
         2,
         255,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         200,
         400,
         3600,
         900,
         12000,
         600,
         600,
         12000,
         12000,
         1200,
         18000,
         1200,
         6000,
         1200,
         400,
         400,
         400,
         400,
         400,
         1800,
         200,
         1800,
         200
      };
   }

   private static void id_extends() {
      integersf407dfe4cb09378d9b156ac8f4322895 = new int[]{16738740, 16777215, 10040115, 65535, 3355443, 3329330, 4737096};
   }

   private static void id_case() {
      booleansf407dfe4cb09378d9b156ac8f4322895 = new boolean[]{
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false
      };
   }

   private static void id_implements() {
      bytesf407dfe4cb09378d9b156ac8f4322895 = new byte[]{
         16,
         8,
         16,
         8,
         7,
         2,
         3,
         4,
         5,
         6,
         4,
         9,
         4,
         2,
         100,
         9,
         3,
         36,
         3,
         2,
         37,
         2,
         2,
         4,
         3,
         38,
         2,
         3,
         4,
         2,
         2,
         3,
         39,
         3,
         4,
         4,
         3,
         2,
         2,
         3,
         40,
         4,
         5,
         5,
         2,
         2,
         3,
         4,
         4,
         41,
         5,
         6,
         4,
         2,
         2,
         3,
         42,
         6,
         8,
         7,
         3,
         2,
         9
      };
   }

   private static void id_protected() {
      stringsf407dfe4cb09378d9b156ac8f4322895 = new String[]{
         new String("FIRECRACKER"),
         new String("HOLY_WATER"),
         new String("RAGE"),
         new String("PALLADIN"),
         new String("ASSASSIN"),
         new String("RADIATION"),
         new String("SLEEPING")
      };
   }

   private static void id_private() {
      floatsf407dfe4cb09378d9b156ac8f4322895 = new float[]{Float.MAX_VALUE};
   }

   private static void id_native() {
      Object[] var0 = new Object[9];
      String var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[0];
      rLY[] var2 = new rLY[]{new rLY(rLD.id_break, 200, 9), new rLY(rLD.id_class, 400, 4), new rLY(rLD.id_package, 100, 9), new rLY(rLD.id_public, 3600, 0)};
      rLY[] var10006 = var2;
      rdn_3 var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"is-tshop\":1b,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF1493\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF0055\\\",\\\"text\\\":\\\"Х\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF3F3D\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF7E24\\\",\\\"text\\\":\\\"о\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFBD0C\\\",\\\"text\\\":\\\"п\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DBE21D\\\",\\\"text\\\":\\\"у\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#92EC57\\\",\\\"text\\\":\\\"ш\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#49F592\\\",\\\"text\\\":\\\"к\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#00FFCC\\\",\\\"text\\\":\\\"а\\\"}],\\\"text\\\":\\\"\\\"}\"},\"CustomPotionColor\":16738740,\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-69b,73b,-125b,-85b,-116b,3b,79b,-52b,-115b,33b,-39b,109b,68b,28b,113b,88b]},\"CustomPotionEffects\":[{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":200,\"Id\":2b,\"Amplifier\":9b},{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":400,\"Id\":1b,\"Amplifier\":4b},{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":100,\"Id\":15b,\"Amplifier\":9b},{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":3600,\"Id\":24b,\"Amplifier\":0b}]}"
         )
      );
      var0[0] = new rrfO_2(var10006, var10007, 16738740);
      var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[1];
      rLY[] var3 = new rLY[]{new rLY(rLD.id_finally, 900, 1), new rLY(rLD.id_final, 12000, 1), new rLY(rLD.id_case, 0, 1)};
      var10006 = var3;
      var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"CustomPotionEffects\":[{\"Duration\":900,\"Ambient\":0b,\"Id\":10b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":12000,\"Ambient\":0b,\"Id\":14b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1,\"Ambient\":0b,\"Id\":6b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":16777215,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFCB\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFCB\\\",\\\"text\\\":\\\"С\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFBC\\\",\\\"text\\\":\\\"в\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFAC\\\",\\\"text\\\":\\\"я\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFF9D\\\",\\\"text\\\":\\\"т\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFF8E\\\",\\\"text\\\":\\\"а\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFF7F\\\",\\\"text\\\":\\\"я\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE6F\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE60\\\",\\\"text\\\":\\\"в\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE51\\\",\\\"text\\\":\\\"о\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE41\\\",\\\"text\\\":\\\"д\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE32\\\",\\\"text\\\":\\\"а\\\"}],\\\"text\\\":\\\"\\\"}\"}}"
         )
      );
      var0[1] = new rrfO_2(var10006, var10007, 16777215);
      var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[2];
      rLY[] var4 = new rLY[]{new rLY(rLD.id_throws, 600, 4), new rLY(rLD.id_break, 600, 3)};
      var10006 = var4;
      var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-59b,-40b,-118b,10b,104b,12b,74b,-13b,-69b,13b,118b,125b,-59b,63b,98b,-25b]},\"CustomPotionEffects\":[{\"Duration\":600,\"Ambient\":0b,\"Id\":5b,\"Amplifier\":4b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":600,\"Ambient\":0b,\"Id\":2b,\"Amplifier\":3b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":10040115,\"Potion\":\"minecraft:empty\",\"is-tshop\":1b,\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#8B0000\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#8B0000\\\",\\\"text\\\":\\\"З\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#A20E00\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#B91C00\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D12900\\\",\\\"text\\\":\\\"ь\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E83700\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF4500\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF5300\\\",\\\"text\\\":\\\"Г\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF6100\\\",\\\"text\\\":\\\"н\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF7000\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF7E00\\\",\\\"text\\\":\\\"в\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF8C00\\\",\\\"text\\\":\\\"а\\\"}],\\\"text\\\":\\\"\\\"}\"}}"
         )
      );
      var0[2] = new rrfO_2(var10006, var10007, 10040115);
      var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[3];
      rLY[] var5 = new rLY[]{
         new rLY(rLD.id_extends, 12000, 0), new rLY(rLD.id_native, 12000, 0), new rLY(rLD.id_else, 1200, 2), new rLY(rLD.id_final, 18000, 0)
      };
      var10006 = var5;
      var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"CustomPotionEffects\":[{\"Duration\":12000,\"Ambient\":0b,\"Id\":11b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":12000,\"Ambient\":0b,\"Id\":12b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1200,\"Ambient\":0b,\"Id\":21b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":18000,\"Ambient\":0b,\"Id\":14b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":65535,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D1FF5B\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D1FF5B\\\",\\\"text\\\":\\\"З\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D6FF6C\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DBFF7D\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E0FF8E\\\",\\\"text\\\":\\\"ь\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E4FFA0\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E9FFB1\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#EEFFC2\\\",\\\"text\\\":\\\"П\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#F3FFD3\\\",\\\"text\\\":\\\"а\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#EEFFC2\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E9FFB1\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E4FFA0\\\",\\\"text\\\":\\\"а\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E0FF8E\\\",\\\"text\\\":\\\"д\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DBFF7D\\\",\\\"text\\\":\\\"и\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D6FF6C\\\",\\\"text\\\":\\\"н\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D1FF5B\\\",\\\"text\\\":\\\"а\\\"}],\\\"text\\\":\\\"\\\"}\"}}"
         )
      );
      var0[3] = new rrfO_2(var10006, var10007, 65535);
      var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[4];
      rLY[] var6 = new rLY[]{new rLY(rLD.id_throws, 1200, 3), new rLY(rLD.id_class, 6000, 2), new rLY(rLD.id_byte, 1200, 0), new rLY(rLD.id_catch, 0, 1)};
      var10006 = var6;
      var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-6b,90b,-5b,78b,-61b,74b,64b,-69b,-127b,-59b,99b,96b,-16b,72b,5b,-75b]},\"CustomPotionEffects\":[{\"Duration\":1200,\"Ambient\":0b,\"Id\":5b,\"Amplifier\":3b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":6000,\"Ambient\":0b,\"Id\":1b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1200,\"Ambient\":0b,\"Id\":3b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1,\"Ambient\":0b,\"Id\":7b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":3355443,\"Potion\":\"minecraft:empty\",\"is-tshop\":1b,\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#414345\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#414345\\\",\\\"text\\\":\\\"З\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#463E40\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#4B393A\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#503435\\\",\\\"text\\\":\\\"ь\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#542E30\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#59292A\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#5E2425\\\",\\\"text\\\":\\\"А\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#631F20\\\",\\\"text\\\":\\\"с\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#681A1B\\\",\\\"text\\\":\\\"с\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#6D1515\\\",\\\"text\\\":\\\"а\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#710F10\\\",\\\"text\\\":\\\"с\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#760A0B\\\",\\\"text\\\":\\\"и\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#7B0505\\\",\\\"text\\\":\\\"н\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#800000\\\",\\\"text\\\":\\\"а\\\"}],\\\"text\\\":\\\"\\\"}\"}}"
         )
      );
      var0[4] = new rrfO_2(var10006, var10007, 3355443);
      var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[5];
      rLY[] var7 = new rLY[]{
         new rLY(rLD.id_super, 400, 1),
         new rLY(rLD.id_this, 400, 1),
         new rLY(rLD.id_break, 400, 2),
         new rLY(rLD.id_new, 400, 4),
         new rLY(rLD.id_public, 400, 0)
      };
      var10006 = var7;
      var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-95b,-28b,102b,122b,14b,95b,68b,-89b,-65b,-13b,90b,-54b,121b,82b,-64b,121b]},\"CustomPotionEffects\":[{\"Duration\":400,\"Ambient\":0b,\"Id\":19b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":20b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":2b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":17b,\"Amplifier\":4b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":24b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":3329330,\"Potion\":\"minecraft:empty\",\"is-tshop\":1b,\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFF73A\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFF73A\\\",\\\"text\\\":\\\"З\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#F7F550\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#EEF366\\\",\\\"text\\\":\\\"л\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E6F17C\\\",\\\"text\\\":\\\"ь\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DDF093\\\",\\\"text\\\":\\\"е\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D5EEA9\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#CCECBF\\\",\\\"text\\\":\\\"Р\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#C4EDBF\\\",\\\"text\\\":\\\"а\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#BCF0AA\\\",\\\"text\\\":\\\"д\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#B4F394\\\",\\\"text\\\":\\\"и\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#ABF67F\\\",\\\"text\\\":\\\"а\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#A3F969\\\",\\\"text\\\":\\\"ц\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#9BFC54\\\",\\\"text\\\":\\\"и\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#93FF3E\\\",\\\"text\\\":\\\"и\\\"}],\\\"text\\\":\\\"\\\"}\"}}"
         )
      );
      var0[5] = new rrfO_2(var10006, var10007, 3329330);
      var10004 = stringsf407dfe4cb09378d9b156ac8f4322895[6];
      rLY[] var8 = new rLY[]{
         new rLY(rLD.id_continue, 1800, 1), new rLY(rLD.id_protected, 200, 0), new rLY(rLD.id_this, 1800, 2), new rLY(rLD.id_package, 200, 0)
      };
      var10006 = var8;
      var10007 = new rdn_3(rdy_3.kk, 1);
      var10007.id_byte(
         rcH_2.id_class(
            "{\"CustomPotionEffects\":[{\"Duration\":1800,\"Ambient\":0b,\"Id\":18b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":200,\"Ambient\":0b,\"Id\":4b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1800,\"Ambient\":0b,\"Id\":20b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":200,\"Ambient\":0b,\"Id\":15b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":254,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#3F0D9A\\\",\\\"text\\\":\\\"[★]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#3F0D9A\\\",\\\"text\\\":\\\"С\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#31209F\\\",\\\"text\\\":\\\"н\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#2332A5\\\",\\\"text\\\":\\\"о\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#1545AA\\\",\\\"text\\\":\\\"т\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#0758AF\\\",\\\"text\\\":\\\"в\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#0C66B8\\\",\\\"text\\\":\\\"о\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#2371C4\\\",\\\"text\\\":\\\"р\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#3A7CD1\\\",\\\"text\\\":\\\"н\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#5287DD\\\",\\\"text\\\":\\\"о\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#6992E9\\\",\\\"text\\\":\\\"е\\\"}],\\\"text\\\":\\\"\\\"}\"}}"
         )
      );
      var0[6] = new rrfO_2(var10006, var10007, 4737096);
      var0[7] = new rrfO_2[]{(rrfO_2)var0[0], (rrfO_2)var0[1], (rrfO_2)var0[2], (rrfO_2)var0[3], (rrfO_2)var0[4], (rrfO_2)var0[5], (rrfO_2)var0[6]};
      var0[8] = new rrfO_2[]{(rrfO_2)var0[0], (rrfO_2)var0[1], (rrfO_2)var0[2], (rrfO_2)var0[3], (rrfO_2)var0[4], (rrfO_2)var0[5], (rrfO_2)var0[6]};
      staticFieldsf407dfe4cb09378d9b156ac8f4322895 = var0;
   }
}
