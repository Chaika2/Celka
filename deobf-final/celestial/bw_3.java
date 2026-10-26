package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bw_3 {
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   public static Object[] break_;
   private static short[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[9];
         Object[] var1 = this.class_;
         var1[8] = false;
      }
   }

   public bw_3(Ps_1 var1) {
      this(var1, false);
   }

   public bw_3(Ps_1 var1, boolean var2) {
      this(var1.case_(), (SR)var1.package_(), var2);
   }

   public bw_3(rYB var1, SR var2, boolean var3) {
      this.byte_();
      Object var8 = null;
      this.class_[6] = var8;
      Object var9 = null;
      this.class_[7] = var9;
      this.class_[2] = var1;
      ba_3 var11 = new ba_3(var1.instanceof_());
      this.class_[5] = var11;
      this.class_[1] = var2;
      if (var3) {
         AO var13 = ((AO)var1.goto_()).throws_();
         this.class_[0] = var13;
      } else {
         AO var14 = (AO)var1.goto_();
         this.class_[0] = var14;
      }

      Boolean var15 = !C_class.instanceof_().rU.class_[0] ? true : protected_[2];
      this.class_[8] = var15;
      if (!QY.instanceof_().rX()) {
         throw new IllegalStateException();
      } else {
         rfw_3 var16 = new rfw_3();
         this.class_[3] = var16;
         bI_2 var17 = new bI_2(this);
         this.class_[4] = var17;
      }
   }

   static {
      ntfClinit();
   }

   public boolean class_(int var1, int var2) {
      return ((AO)this.class_[0]).case_(var1 >> 4, var2 >> 4);
   }

   private static void class_() {
      Object[] var0 = new Object[]{rrPy_1.class_};
      break_ = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 83, -66, 89, -73, 18, -107, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static xc_3 class_(roJ_2 var0, int var1, int var2, int var3) {
      roQ_2 var4 = var0.byte_()[var2 >> 4];
      return roQ_2.class_(var4) ? (xc_3)break_[0] : var4.class_(var1 & 15, var2 & 15, var3 & 15);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -459902661183041068L;
   }

   public xc_3 class_(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < 256) {
         if ((Boolean)this.class_[8]) {
            roJ_2 var4 = (roJ_2)this.class_[6];
            if (var4 != null && var4.private_().break_ == var1 >> 4 && var4.private_().byte_ == var3 >> 4) {
               return class_(var4, var1, var2, var3);
            }

            roJ_2 var5 = ((AO)this.class_[0]).class_(var1 >> 4, var3 >> 4, roN_2.volatile_, false);
            if (var5 != null && !var5.catch_()) {
               this.class_[6] = var5;
               return class_(var5, var1, var2, var3);
            }
         }

         Sw_1 var12 = (Sw_1)this.class_[7];
         if (var12 == null || var12.break_() != var1 >> 9 || var12.class_() != var3 >> 9) {
            if ((SR)this.class_[1] == null) {
               return (xc_3)break_[0];
            }

            Sw_1 var13 = ((SI)((SR)this.class_[1]).class_[0]).throws_(var1 >> 9, var3 >> 9);
            if (var13 == null) {
               return (xc_3)break_[0];
            }

            this.class_[7] = var13;
            var12 = var13;
         }

         xc_3 var14 = var12.class_(var1 & 511, var2, var3 & 511);
         return var14 == null ? (xc_3)break_[0] : var14;
      } else {
         return (xc_3)break_[0];
      }
   }

   public xc_3 class_(rfH_2 var1) {
      return this.class_(var1.b_(), var1.c_(), var1.d_());
   }

   public static xc_3 class_(Ps_1 var0, rfH_2 var1) {
      return new bw_3(var0).class_(var1.b_(), var1.c_(), var1.d_());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1885121461;
   }

   public boolean break_(int var1, int var2) {
      roJ_2 var3 = (roJ_2)this.class_[6];
      if (var3 != null && var3.private_().break_ == var1 >> 4 && var3.private_().byte_ == var2 >> 4) {
         return true;
      } else {
         var3 = ((AO)this.class_[0]).class_(var1 >> 4, var2 >> 4, roN_2.volatile_, false);
         if (var3 != null && !var3.catch_()) {
            this.class_[6] = var3;
            return true;
         } else {
            Sw_1 var4 = (Sw_1)this.class_[7];
            if (var4 != null && var4.break_() == var1 >> 9 && var4.class_() == var2 >> 9) {
               return var4.class_(var1 & 511, var2 & 511);
            } else if ((SR)this.class_[1] == null) {
               return false;
            } else {
               var4 = ((SI)((SR)this.class_[1]).class_[0]).throws_(var1 >> 9, var2 >> 9);
               if (var4 == null) {
                  return false;
               } else {
                  this.class_[7] = var4;
                  return var4.class_(var1 & 511, var2 & 511);
               }
            }
         }
      }
   }

   public static xd_3 break_(Ps_1 var0, rfH_2 var1) {
      return class_(var0, var1).break_();
   }

   private static void break_() {
      throws_ = new short[]{
         6, 7, 2, 5, 1, 0, 0, 0, 8, 3, 4, 0, 256, 0, 8, 6, 0, 6, 7, 1, 0, 1, 0, 0, 7, 511, 511, 0, 6, 0, 6, 7, 511, 511, 1, 1, 0, 7, 511, 511, 0
      };
   }

   private static void throws_() {
      byte_ = new byte[]{4, 4, 4, 4, 4, 4, 9, 9, 9, 9, 4, 4, 4, 4, 9, 9, 9, 9, 4, 15, 15, 15, 9, 8};
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true, false, false, true, false, true, false, false, false, false, true};
   }
}
