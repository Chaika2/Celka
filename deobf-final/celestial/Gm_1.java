package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gm_1 extends EZ {
   public Object[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static double[] case_;
   private static byte[] catch_;

   xc_3 byte_(int var1, int var2, int var3, xc_3 var4) {
      this.protected_();
      return ((rq_3)this.byte_[1]).class_(var1 - (Integer)this.byte_[2], var2 - (Integer)this.byte_[3], var3 - (Integer)this.byte_[4], var4)
         ? ((rq_3)this.byte_[1])
            .class_(
               var1 - (Integer)this.byte_[2], var2 - (Integer)this.byte_[3], var3 - (Integer)this.byte_[4], var4, (List<xc_3>)((GW)this.byte_[5]).break_[10]
            )
         : null;
   }

   private static void byte_() {
      catch_ = new byte[]{9, 6, 2, 3, 4};
   }

   public Gm_1(GW var1) {
      super(GW.class_(var1), true);
      this.protected_();
      this.byte_[5] = var1;
      List var7 = var1.break_(9);
      this.byte_[0] = var7;
      rq_3 var8 = (rq_3)var1.break_[4];
      this.byte_[1] = var8;
      Integer var9 = ((rja_3)var1.break_[5]).b_();
      this.byte_[2] = var9;
      Integer var10 = ((rja_3)var1.break_[5]).c_();
      this.byte_[3] = var10;
      Integer var11 = ((rja_3)var1.break_[5]).d_();
      this.byte_[4] = var11;
      Double var12 = (Double)this.break_[26] + 10.0;
      this.break_[26] = var12;
      Double var13 = 1.0;
      this.break_[25] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public double class_(int var1, int var2, int var3, xc_3 var4) {
      this.protected_();
      if (!this.byte_(var1, var2, var3) && ((ba_3)this.break_[28]).class_(var1, var3)) {
         xc_3 var5 = this.byte_(var1, var2, var3, var4);
         if (var5 != null && !((List)C_class.instanceof_().S.class_[0]).contains(var5.break_())) {
            if (var5.break_() instanceof Ja_1) {
               return (Double)this.break_[9] * (Double)C_class.instanceof_().byte_.class_[0];
            } else if (((List)this.byte_[0]).contains(var5)) {
               return 0.0;
            } else {
               return !this.break_[7] ? 1000000.0 : (Double)this.break_[9] * 1.5 * (Double)C_class.instanceof_().byte_.class_[0];
            }
         } else {
            return this.break_[7] ? (Double)this.break_[9] : case_[6];
         }
      } else {
         return case_[2];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8539032751228539965L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 760628513;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -43, 80, 63, 5, -17, 84, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public double break_(int var1, int var2, int var3, xc_3 var4) {
      this.protected_();
      if (((Boolean)this.break_[10] || ((List)this.break_[11]).contains(var4.break_())) && !this.byte_(var1, var2, var3)) {
         xc_3 var5 = this.byte_(var1, var2, var3, var4);
         if (var5 == null || ((List)C_class.instanceof_().S.class_[0]).contains(var5.break_())) {
            return case_[10];
         } else if (var5.break_() == xu_3.class_) {
            return 1.0;
         } else {
            return ((GW)this.byte_[5]).class_(((bw_3)this.break_[4]).class_(var1, var2, var3), var5, false)
               ? (Double)C_class.instanceof_().h.class_[0]
               : case_[9];
         }
      } else {
         return case_[7];
      }
   }

   private static void throws_() {
      protected_ = new short[]{5, 0, 4, 1, 5, 2, 5, 3, 5, 4, 26, 26, 25, 1, 2, 3, 4, 1, 2, 3, 4, 5, 10, 28, 0, 9, 0, 0, 7, 9, 0, 7, 9, 10, 11, 0, 5, 4, 0};
   }

   private static void catch_() {
      case_ = new double[]{10.0, 1.0, 1000000.0, 0.0, 1000000.0, 1.5, 1000000.0, 1000000.0, 1.0, 1.0, 1.0};
   }

   private static void case_() {
      throws_ = new boolean[]{true, false, false, false, false};
   }

   private void protected_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[6];
         Object[] var1 = this.byte_;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
      }
   }
}
