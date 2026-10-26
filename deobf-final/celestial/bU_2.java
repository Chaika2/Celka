package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bU_2 {
   private static float[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static double[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;
   private static int[] catch_;

   private static void byte_() {
      throws_ = new byte[]{-1, 9, 3};
   }

   public bU_2(cb_3 var1) {
      this.case_();
      HashMap var9 = new HashMap();
      this.class_[0] = var9;
      this.class_[2] = var1;
      if ((Boolean)C_class.instanceof_().ry.class_[0]) {
         double var2 = this.break_();
         Function var4 = var2x -> var2 * var2x;
         Function var11 = var4.compose(this::break_);
         this.class_[1] = var11;
      } else {
         Function var12 = this::break_;
         this.class_[1] = var12;
      }
   }

   static {
      ntfClinit();
   }

   public double class_(xc_3 var1) {
      return (Double)((Map)this.class_[0]).computeIfAbsent(var1.break_(), (Function)this.class_[1]);
   }

   public static double class_(rdn_3 var0, xc_3 var1) {
      float var2;
      try {
         var2 = var1.private_(null, null);
      } catch (NullPointerException var5) {
         return -1.0;
      }

      if (var2 < 0.0F) {
         return -1.0;
      } else {
         float var3 = var0.class_(var1);
         if (var3 > 1.0F) {
            int var4 = eA_2.class_(eY_2.this_, var0);
            if (var4 > 0 && !var0.class_()) {
               var3 += (float)(var4 * var4 + 1);
            }
         }

         var3 /= var2;
         return var1.new_() && (var0.class_() || !var0.break_(var1)) ? (double)(var3 / 100.0F) : (double)(var3 / 30.0F);
      }
   }

   public int class_(xd_3 var1, boolean var2, boolean var3) {
      if (!C_class.instanceof_().protected_() && var3) {
         return ((rhz_3)((cb_3)this.class_[2]).implements_[1]).protected_;
      } else {
         int var4 = case_[3];
         double var5 = Double.NEGATIVE_INFINITY;
         int var7 = Integer.MIN_VALUE;
         boolean var8 = false;
         xc_3 var9 = var1.continue_();

         for (int var10 = 0; var10 < 9; var10++) {
            rdn_3 var11 = ((rhz_3)((cb_3)this.class_[2]).implements_[1]).extends_(var10);
            if (((Boolean)C_class.instanceof_().rS.class_[0] || !(var11.break_() instanceof rkx_3))
               && (
                  !(Boolean)C_class.instanceof_().Br.class_[0]
                     || var11.catch_() + (Integer)C_class.instanceof_().V.class_[0] < var11.private_()
                     || var11.private_() <= 1
               )) {
               double var12 = class_(var11, var9);
               boolean var14 = this.class_(var11);
               if (var12 > var5) {
                  var5 = var12;
                  var4 = var10;
                  var7 = this.break_(var11);
                  var8 = var14;
               } else if (var12 == var5) {
                  int var15 = this.break_(var11);
                  if (var15 < var7 && (var14 || !var8) || var2 && !var8 && var14) {
                     var5 = var12;
                     var4 = var10;
                     var7 = var15;
                     var8 = var14;
                  }
               }
            }
         }

         return var4;
      }
   }

   public boolean class_(rdn_3 var1) {
      return eA_2.class_(eY_2.else_, var1) > 0 ? true : case_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5877705170485491610L;
   }

   private static void class_() {
      byte_ = new short[]{0, 2, 0, 1, 1, 0, 1, 2, 1, 2, 1, 0, 0, 0, 2, 1, 0, 0, 2, 2, 2, 2};
   }

   public int class_(xd_3 var1, boolean var2) {
      return this.class_(var1, var2, false);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 93, -125, 33, -4, -94, 49, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -688220717;
   }

   private double class_(xd_3 var1) {
      return ((List)C_class.instanceof_().p.class_[0]).contains(var1) ? (Double)C_class.instanceof_().rG.class_[0] : protected_[1];
   }

   private int break_(rdn_3 var1) {
      if (var1.break_() instanceof rkW_2) {
         rkW_2 var2 = (rkW_2)var1.break_();
         return var2.private_().protected_();
      } else {
         return throws_[0];
      }
   }

   private double break_(xd_3 var1) {
      rdn_3 var2 = ((rhz_3)((cb_3)this.class_[2]).implements_[1]).extends_(this.class_(var1, false, true));
      return class_(var2, var1.continue_()) * this.class_(var1);
   }

   private double break_() {
      double var1 = 1.0;
      if (((cb_3)this.class_[2]).break_(rLD.byte_)) {
         var1 *= 1.0 + (double)(((cb_3)this.class_[2]).byte_(rLD.byte_).byte_() + 1) * 0.2;
      }

      if (((cb_3)this.class_[2]).break_(rLD.protected_)) {
         switch (((cb_3)this.class_[2]).byte_(rLD.protected_).byte_()) {
            case 0:
               var1 *= 0.3;
               break;
            case 1:
               var1 *= 0.09;
               break;
            case 2:
               var1 *= 0.0027;
               break;
            default:
               var1 *= 8.1E-4;
         }
      }

      return var1;
   }

   private static void throws_() {
      catch_ = new int[]{Integer.MIN_VALUE};
   }

   private static void catch_() {
      protected_ = new double[]{Double.NEGATIVE_INFINITY, 1.0, -1.0, -1.0, 1.0, 1.0, 0.2, 0.3, 0.09, 0.0027, 8.1E-4};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new float[]{0.0F, 1.0F, 30.0F, 100.0F};
   }

   private static void private_() {
      case_ = new boolean[]{true, false, false, false, false, false, true, false, true, true, true};
   }
}
