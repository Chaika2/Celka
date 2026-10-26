package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sj_1 {
   private static int[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static double[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      protected_ = new double[2];
   }

   private Sj_1() {
   }

   static {
      ntfClinit();
   }

   public static St_1 class_(roJ_2 var0) {
      HashMap var1 = new HashMap();
      BitSet var2 = new BitSet(131072);

      try {
         roQ_2[] var3 = var0.byte_();

         for (int var4 = throws_[0]; var4 < byte_[0]; var4++) {
            roQ_2 var5 = var3[var4];
            if (var5 != null) {
               rVM var6 = var5.implements_();
               int var7 = var4 << byte_[1];

               for (int var8 = throws_[1]; var8 < byte_[2]; var8++) {
                  int var9 = var8 | var7;

                  for (int var10 = throws_[2]; var10 < byte_[3]; var10++) {
                     for (int var11 = throws_[3]; var11 < byte_[4]; var11++) {
                        int var12 = St_1.class_(var11, var9, var10);
                        xc_3 var13 = (xc_3)var6.class_(var11, var8, var10);
                        boolean[] var14 = class_(var13, var0, var11, var9, var10).class_();
                        var2.set(var12, var14[throws_[4]]);
                        var2.set(var12 + throws_[5], var14[throws_[6]]);
                        xd_3 var15 = var13.break_();
                        if (((ImmutableSet)St_1.class_[break_[0]]).contains(var15)) {
                           String var16 = ri_3.class_(var15);
                           var1.computeIfAbsent(var16, var0x -> new ArrayList<>()).add(new rfH_2(var11, var9, var10));
                        }
                     }
                  }
               }
            }
         }
      } catch (Exception var17) {
         var17.printStackTrace();
      }

      xc_3[] var18 = new xc_3[break_[1]];

      for (int var19 = 0; var19 < 16; var19++) {
         label58:
         for (int var20 = 0; var20 < 16; var20++) {
            for (int var21 = 255; var21 >= 0; var21--) {
               int var22 = St_1.class_(var20, var21, var19);
               if (var2.get(var22) || var2.get(var22 + 1)) {
                  var18[var19 << 4 | var20] = bw_3.class_(var0, var20, var21, var19);
                  continue label58;
               }
            }

            var18[var19 << 4 | var20] = xu_3.class_.continue_();
         }
      }

      return new St_1(var0.private_().break_, var0.private_().byte_, var2, var18, var1, System.currentTimeMillis());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{79, -62, 0, -90, 22, 16, 90, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static xc_3 class_(MB var0, rqM_2<rYB> var1) {
      switch (((int[])SV.class_[0])[var0.ordinal()]) {
         case 1:
            return xu_3.class_.continue_();
         case 2:
            return xu_3.try_.continue_();
         case 3:
            return xu_3.instanceof_.continue_();
         case 4:
            if (var1 == rYB.byte_) {
               return xu_3.break_.continue_();
            } else if (var1 == rYB.protected_) {
               return xu_3.PR.continue_();
            } else if (var1 == rYB.throws_) {
               return xu_3.Sh.continue_();
            }
         default:
            return null;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -723346514;
   }

   private static MB class_(xc_3 var0, roJ_2 var1, int var2, int var3, int var4) {
      xd_3 var5 = var0.break_();
      if (EF.byte_(var0)) {
         if (EF.protected_(var0)) {
            return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[2];
         } else if ((var2 == 15 || !EF.protected_(bw_3.class_(var1, var2 + 1, var3, var4)))
            && (var2 == 0 || !EF.protected_(bw_3.class_(var1, var2 - 1, var3, var4)))
            && (var4 == 15 || !EF.protected_(bw_3.class_(var1, var2, var3, var4 + 1)))
            && (var4 == 0 || !EF.protected_(bw_3.class_(var1, var2, var3, var4 - 1)))) {
            if (var2 != 0 && var2 != 15 && var4 != 0 && var4 != 15) {
               return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[1];
            } else {
               rjU_2 var6 = var0.volatile_().byte_(var1.extends_(), new rfH_2(var2 + (var1.private_().break_ << 4), var3, var4 + (var1.private_().byte_ << 4)));
               return var6.break_ == 0.0 && var6.protected_ == 0.0
                  ? (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[2]
                  : (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[1];
            }
         } else {
            return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[2];
         }
      } else if (EF.throws_(var0) || EF.break_(var0)) {
         return (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[2];
      } else {
         return !(var5 instanceof Ja_1) && !(var5 instanceof zc_3) && !(var5 instanceof du_3) && !(var5 instanceof dI_2)
            ? (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[3]
            : (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[0];
      }
   }

   private static void class_() {
      break_ = new short[]{0, 256, 255, 2, 2, 1, 2, 1, 2, 0, 3, 0};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6029975890625909753L;
   }

   private static void break_() {
      throws_ = new boolean[]{false, false, false, false, false, true, true, false, false, true, true, true, true, true};
   }

   private static void throws_() {
      class_ = new int[]{131072};
   }

   private static void protected_() {
      byte_ = new byte[]{16, 4, 16, 16, 16, 16, 16, 4, 4, 15, 15, 15, 15, 4, 4};
   }
}
