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
   ;
   private static boolean[] booleans4d15df505e473c14b11aa564ea558cfe;
   public static Object[] staticFields4d15df505e473c14b11aa564ea558cfe;
   private static String[] strings4d15df505e473c14b11aa564ea558cfe;
   private static short[] shorts4d15df505e473c14b11aa564ea558cfe;
   private static byte[] bytes4d15df505e473c14b11aa564ea558cfe;

   static {
      ntfClinit();
   }

   @Override
   public List<rfH_2> class_(Ps_1 var1, ra_3 var2, int var3, int var4, int var5) {
      ArrayList var6 = new ArrayList();
      if (var2.class_().isEmpty()) {
         return var6;
      } else {
         AO var7 = (AO)var1.case_().goto_();
         int var8 = var5 * var5;
         int var9 = var1.volatile_().b_() >> 4;
         int var10 = var1.volatile_().d_() >> 4;
         int var11 = var1.volatile_().c_();
         int var12 = var11 >> 4;
         int[] var13 = IntStream.range(0, 16).boxed().sorted(Comparator.comparingInt(var1x -> Math.abs(var1x - var12))).mapToInt(var0 -> var0).toArray();
         int var14 = 0;
         boolean var15 = false;

         while (true) {
            boolean var16 = booleans4d15df505e473c14b11aa564ea558cfe[3];
            boolean var17 = false;

            for (int var18 = -var14; var18 <= var14; var18++) {
               for (int var19 = -var14; var19 <= var14; var19++) {
                  int var20 = var18 * var18 + var19 * var19;
                  if (var20 == var14) {
                     var17 = booleans4d15df505e473c14b11aa564ea558cfe[5];
                     int var21 = var18 + var9;
                     int var22 = var19 + var10;
                     roJ_2 var23 = var7.class_(var21, var22, null, false);
                     if (var23 != null) {
                        var16 = booleans4d15df505e473c14b11aa564ea558cfe[7];
                        if (this.class_(var21 << 4, var22 << 4, var23, var2, var6, var3, var4, var11, var13)) {
                           var15 = true;
                        }
                     }
                  }
               }
            }

            if (var16 && var17 || var6.size() >= var3 && (var14 > var8 || var14 > 1 && var15)) {
               return var6;
            }

            var14++;
         }
      }
   }

   @Override
   public int class_(Ps_1 var1) {
      return this.class_(var1, 40);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2524790449951076498L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -350182091;
   }

   @Override
   public int class_(Ps_1 var1, int var2) {
      roX_2 var3 = var1.case_().goto_();
      C_super var4 = var1.package_().break_();
      rU_2 var5 = var1.volatile_();
      int var6 = var5.b_() >> 4;
      int var7 = var5.d_() >> 4;
      int var8 = var6 - var2;
      int var9 = var7 - var2;
      int var10 = var6 + var2;
      int var11 = var7 + var2;
      int var12 = 0;

      for (int var13 = var8; var13 <= var10; var13++) {
         for (int var14 = var9; var14 <= var11; var14++) {
            roJ_2 var15 = var3.class_(var13, var14, false);
            if (var15 != null && !var15.catch_()) {
               var12++;
               var4.class_(var15);
            }
         }
      }

      return var12;
   }

   private static void class_() {
      shorts4d15df505e473c14b11aa564ea558cfe = new short[]{2, 1, 0};
   }

   @Override
   public List<rfH_2> class_(Ps_1 var1, ra_3 var2, rfj_3 var3, int var4, int var5) {
      if (var2.class_().isEmpty()) {
         return Collections.emptyList();
      } else {
         AO var6 = (AO)var1.case_().goto_();
         roJ_2 var7 = var6.class_(var3.break_, var3.byte_, null, false);
         int var8 = var1.volatile_().c_();
         if (var7 != null && !var7.catch_()) {
            ArrayList var9 = new ArrayList();
            this.class_(var3.break_ << 4, var3.byte_ << 4, var7, var2, var9, var4, var5, var8, (int[])staticFields4d15df505e473c14b11aa564ea558cfe[1]);
            return var9;
         } else {
            return Collections.emptyList();
         }
      }
   }

   private boolean class_(int var1, int var2, roJ_2 var3, ra_3 var4, Collection<rfH_2> var5, int var6, int var7, int var8, int[] var9) {
      roQ_2[] var10 = var3.byte_();
      boolean var11 = false;

      for (int var12 = 0; var12 < 16; var12++) {
         int var13 = var9[var12];
         roQ_2 var14 = var10[var13];
         if (var14 != null && !roQ_2.class_(var14)) {
            int var15 = var13 << 4;
            rVM var16 = var14.implements_();

            for (int var17 = 0; var17 < 16; var17++) {
               for (int var18 = 0; var18 < 16; var18++) {
                  for (int var19 = 0; var19 < 16; var19++) {
                     xc_3 var20 = (xc_3)var16.class_(var19, var17, var18);
                     if (var4.class_(var20)) {
                        int var21 = var15 | var17;
                        if (var5.size() >= var6) {
                           if (Math.abs(var21 - var8) < var7) {
                              var11 = true;
                           } else if (var11) {
                              return true;
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

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -101, -99, 87, -128, -111, -23, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
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

   private static void throws_() {
      bytes4d15df505e473c14b11aa564ea558cfe = new byte[]{4, 4, 4, 16, 4, 4, 4, 4, 40, 4, 4, 16, 4, 16, 16, 16, 2, 16, 3};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new So_1(), new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, null};
      var0[2] = new So_1[]{(So_1)var0[0]};
      staticFields4d15df505e473c14b11aa564ea558cfe = var0;
   }

   private static void protected_() {
      strings4d15df505e473c14b11aa564ea558cfe = new String[]{new String("INSTANCE")};
   }
}
