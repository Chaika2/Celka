package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bT_2 implements PP {
   private static short[] throws_;
   private static boolean[] case_;
   public static Object[] class_;
   public Object[] break_;
   private static byte[] catch_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[1] = false;
         var1[2] = 0;
      }
   }

   public bT_2(Ps_1 var1) {
      this.byte_();
      Integer var6 = 0;
      this.break_[2] = var6;
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.break_[2] = var6;
   }

   public void class_(boolean var1) {
      if ((Integer)this.break_[2] > 0) {
         Integer var8 = (Integer)this.break_[2] - 1;
         this.break_[2] = var8;
      } else {
         rjG_2 var2 = ((Ps_1)this.break_[0]).byte_();
         boolean var3 = var2 != null && var2.byte_() == rjM_2.BLOCK ? true : case_[5];
         if (var1 && var3) {
            ((Ps_1)this.break_[0]).native_().class_((Boolean)this.break_[1]);
            if (((Ps_1)this.break_[0]).native_().protected_()) {
               ((Ps_1)this.break_[0]).native_().class_();
               ((Ps_1)this.break_[0]).native_().break_(((rff_3)var2).class_(), ((rff_3)var2).break_());
               ((Ps_1)this.break_[0]).catch_().class_(rpm_3.MAIN_HAND);
            } else {
               if (((Ps_1)this.break_[0]).native_().class_(((rff_3)var2).class_(), ((rff_3)var2).break_())) {
                  ((Ps_1)this.break_[0]).catch_().class_(rpm_3.MAIN_HAND);
               }

               if (((Ps_1)this.break_[0]).native_().protected_()) {
                  Integer var9 = (Integer)C_throws.break_().Pg.class_[0] - 1;
                  this.break_[2] = var9;
                  ((Ps_1)this.break_[0]).native_().break_(0);
               }
            }

            Boolean var10 = !((Ps_1)this.break_[0]).native_().protected_() ? true : case_[9];
            this.break_[1] = var10;
            ((Ps_1)this.break_[0]).native_().class_(false);
         } else {
            Boolean var11 = false;
            this.break_[1] = var11;
         }
      }
   }

   public void class_() {
      if (((Ps_1)this.break_[0]).catch_() != null && (Boolean)this.break_[1]) {
         ((Ps_1)this.break_[0]).native_().class_(false);
         ((Ps_1)this.break_[0]).native_().break_();
         Boolean var5 = false;
         this.break_[1] = var5;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6383739252937993269L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-114, -17, 3, 71, 81, -91, 66, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2071425103;
   }

   private static void break_() {
      throws_ = new short[]{2, 0, 0, 1, 0, 0, 1, 2, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 1, 2};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{1};
      class_ = var0;
   }

   private static void case_() {
      catch_ = new byte[]{3, 2};
   }

   private static void protected_() {
      case_ = new boolean[]{false, false, false, true, true, false, true, false, true, false, false, false, true, false, false, true, false, true};
   }
}
