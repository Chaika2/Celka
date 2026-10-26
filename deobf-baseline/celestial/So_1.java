package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum So_1 implements C_goto {
   private static boolean[] booleans4d15df505e473c14b11aa564ea558cfe;
   public static Object[] staticFields4d15df505e473c14b11aa564ea558cfe;
   private static String[] strings4d15df505e473c14b11aa564ea558cfe;
   private static short[] shorts4d15df505e473c14b11aa564ea558cfe;
   private static byte[] bytes4d15df505e473c14b11aa564ea558cfe;

   static {
      ntfClinit();
   }

   @Override
   public List<rfH_2> id_class(Ps_1 var1, ra_3 var2, int var3, int var4, int var5) {
      ArrayList var6 = new ArrayList();
      if (var2.id_class().isEmpty()) {
         return var6;
      } else {
         AO var7 = (AO)var1.id_case().id_goto();
         int var8 = var5 * var5;
         int var9 = var1.id_volatile().b_() >> bytes4d15df505e473c14b11aa564ea558cfe[0];
         int var10 = var1.id_volatile().d_() >> bytes4d15df505e473c14b11aa564ea558cfe[1];
         int var11 = var1.id_volatile().c_();
         int var12 = var11 >> bytes4d15df505e473c14b11aa564ea558cfe[2];
         int[] var13 = IntStream.range(booleans4d15df505e473c14b11aa564ea558cfe[0], bytes4d15df505e473c14b11aa564ea558cfe[3])
            .boxed()
            .sorted(Comparator.comparingInt(var1x -> Math.abs(var1x - var12)))
            .mapToInt(var0 -> var0)
            .toArray();
         int var14 = booleans4d15df505e473c14b11aa564ea558cfe[1];
         boolean var15 = booleans4d15df505e473c14b11aa564ea558cfe[2];

         while (true) {
            boolean var16 = booleans4d15df505e473c14b11aa564ea558cfe[3];
            boolean var17 = booleans4d15df505e473c14b11aa564ea558cfe[4];

            for (int var18 = -var14; var18 <= var14; var18++) {
               for (int var19 = -var14; var19 <= var14; var19++) {
                  int var20 = var18 * var18 + var19 * var19;
                  if (var20 == var14) {
                     var17 = booleans4d15df505e473c14b11aa564ea558cfe[5];
                     int var21 = var18 + var9;
                     int var22 = var19 + var10;
                     roJ_2 var23 = var7.id_class(var21, var22, null, booleans4d15df505e473c14b11aa564ea558cfe[6]);
                     if (var23 != null) {
                        var16 = booleans4d15df505e473c14b11aa564ea558cfe[7];
                        if (this.id_class(
                           var21 << bytes4d15df505e473c14b11aa564ea558cfe[4],
                           var22 << bytes4d15df505e473c14b11aa564ea558cfe[5],
                           var23,
                           var2,
                           var6,
                           var3,
                           var4,
                           var11,
                           var13
                        )) {
                           var15 = booleans4d15df505e473c14b11aa564ea558cfe[8];
                        }
                     }
                  }
               }
            }

            if (var16 && var17 || var6.size() >= var3 && (var14 > var8 || var14 > booleans4d15df505e473c14b11aa564ea558cfe[9] && var15)) {
               return var6;
            }

            var14++;
         }
      }
   }

   @Override
   public int id_class(Ps_1 var1) {
      return this.id_class(var1, bytes4d15df505e473c14b11aa564ea558cfe[8]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2524790449951076498L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -350182091;
   }

   @Override
   public int id_class(Ps_1 var1, int var2) {
      roX_2 var3 = var1.id_case().id_goto();
      C_super var4 = var1.id_package().id_break();
      rU_2 var5 = var1.id_volatile();
      int var6 = var5.b_() >> bytes4d15df505e473c14b11aa564ea558cfe[9];
      int var7 = var5.d_() >> bytes4d15df505e473c14b11aa564ea558cfe[10];
      int var8 = var6 - var2;
      int var9 = var7 - var2;
      int var10 = var6 + var2;
      int var11 = var7 + var2;
      int var12 = booleans4d15df505e473c14b11aa564ea558cfe[11];

      for (int var13 = var8; var13 <= var10; var13++) {
         for (int var14 = var9; var14 <= var11; var14++) {
            roJ_2 var15 = var3.id_class(var13, var14, booleans4d15df505e473c14b11aa564ea558cfe[12]);
            if (var15 != null && !var15.id_catch()) {
               var12++;
               var4.id_class(var15);
            }
         }
      }

      return var12;
   }

   private static void id_class() {
      shorts4d15df505e473c14b11aa564ea558cfe = new short[]{2, 1, 0};
   }

   @Override
   public List<rfH_2> id_class(Ps_1 var1, ra_3 var2, rfj_3 var3, int var4, int var5) {
      if (var2.id_class().isEmpty()) {
         return Collections.emptyList();
      } else {
         AO var6 = (AO)var1.id_case().id_goto();
         roJ_2 var7 = var6.id_class(var3.id_break, var3.id_byte, null, booleans4d15df505e473c14b11aa564ea558cfe[10]);
         int var8 = var1.id_volatile().c_();
         if (var7 != null && !var7.id_catch()) {
            ArrayList var9 = new ArrayList();
            this.id_class(
               var3.id_break << bytes4d15df505e473c14b11aa564ea558cfe[6],
               var3.id_byte << bytes4d15df505e473c14b11aa564ea558cfe[7],
               var7,
               var2,
               var9,
               var4,
               var5,
               var8,
               (int[])staticFields4d15df505e473c14b11aa564ea558cfe[shorts4d15df505e473c14b11aa564ea558cfe[1]]
            );
            return var9;
         } else {
            return Collections.emptyList();
         }
      }
   }

   private boolean id_class(int var1, int var2, roJ_2 var3, ra_3 var4, Collection<rfH_2> var5, int var6, int var7, int var8, int[] var9) {
      roQ_2[] var10 = var3.id_byte();
      boolean var11 = booleans4d15df505e473c14b11aa564ea558cfe[13];

      for (int var12 = booleans4d15df505e473c14b11aa564ea558cfe[14]; var12 < bytes4d15df505e473c14b11aa564ea558cfe[11]; var12++) {
         int var13 = var9[var12];
         roQ_2 var14 = var10[var13];
         if (var14 != null && !roQ_2.id_class(var14)) {
            int var15 = var13 << bytes4d15df505e473c14b11aa564ea558cfe[12];
            rVM var16 = var14.id_implements();

            for (int var17 = booleans4d15df505e473c14b11aa564ea558cfe[15]; var17 < bytes4d15df505e473c14b11aa564ea558cfe[13]; var17++) {
               for (int var18 = booleans4d15df505e473c14b11aa564ea558cfe[16]; var18 < bytes4d15df505e473c14b11aa564ea558cfe[14]; var18++) {
                  for (int var19 = booleans4d15df505e473c14b11aa564ea558cfe[17]; var19 < bytes4d15df505e473c14b11aa564ea558cfe[15]; var19++) {
                     xc_3 var20 = (xc_3)var16.id_class(var19, var17, var18);
                     if (var4.id_class(var20)) {
                        int var21 = var15 | var17;
                        if (var5.size() >= var6) {
                           if (Math.abs(var21 - var8) < var7) {
                              var11 = booleans4d15df505e473c14b11aa564ea558cfe[18];
                           } else if (var11) {
                              return booleans4d15df505e473c14b11aa564ea558cfe[19];
                           }
                        }

                        var5.add(new rfH_2(var1 | var19, var21, var2 | var18));
                     }
                  }
               }
            }
         }
      }

      return var11;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -101, -99, 87, -128, -111, -23, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleans4d15df505e473c14b11aa564ea558cfe = new boolean[]{
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void id_throws() {
      bytes4d15df505e473c14b11aa564ea558cfe = new byte[]{4, 4, 4, 16, 4, 4, 4, 4, 40, 4, 4, 16, 4, 16, 16, 16, 2, 16, 3};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new So_1(), new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, null};
      var0[2] = new So_1[]{(So_1)var0[0]};
      staticFields4d15df505e473c14b11aa564ea558cfe = var0;
   }

   private static void id_protected() {
      strings4d15df505e473c14b11aa564ea558cfe = new String[]{new String("INSTANCE")};
   }
}
