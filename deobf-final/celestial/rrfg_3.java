package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfg_3 implements MinecraftAccessor {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[1] = false;
         this.class_[2] = false;
         this.class_[3] = false;
         this.class_[4] = false;
         this.class_[5] = false;
      }
   }

   public rrfg_3() {
      this.byte_();
      rrfw_3 var5 = new rrfw_3();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean class_(float var1) {
      if ((Boolean)this.class_[1]) {
         if (((rrfw_3)this.class_[0]).class_((double)var1)) {
            Boolean var6 = false;
            this.class_[1] = var6;
            ((rrfw_3)this.class_[0]).class_();
            return true;
         }
      } else {
         ((rrfw_3)this.class_[0]).class_();
      }

      return byte_[7];
   }

   public void class_(rrLu_1 var1) {
      if ((cb_3)import_.class_[57] != null) {
         if (!this.case_()) {
            if (var1.class_() instanceof rvu_3) {
               Boolean var9 = true;
               this.class_[3] = var9;
            }

            boolean var2 = !this.class_[2] && !this.class_[4] && !this.class_[3] && !this.class_[5] ? byte_[2] : byte_[1];
            if (!var2) {
               if (var1.class_() instanceof rvQ_2 var3 && var3.break_() == 2 && var3.class_((gm_3)import_.class_[56]) == (cb_3)import_.class_[57]) {
                  Boolean var10 = true;
                  this.class_[1] = var10;
               }
            } else if ((Integer)((cb_3)import_.class_[57]).private_[10] > 0) {
               Boolean var11 = false;
               this.class_[1] = var11;
               this.protected_();
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2030844275078529391L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, -68, -111, 31, 30, -25, 48, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1506344688;
   }

   public void class_(rrnh_3 var1) {
      switch (((int[])rrfR_2.class_[0])[var1.class_().ordinal()]) {
         case 1:
            Boolean var6 = true;
            this.class_[2] = var6;
            break;
         case 2:
            Boolean var7 = true;
            this.class_[4] = var7;
            break;
         case 3:
            Boolean var8 = true;
            this.class_[5] = var8;
      }

      Boolean var9 = false;
      this.class_[1] = var9;
   }

   public boolean class_() {
      return (Boolean)this.class_[1];
   }

   public void break_() {
      Boolean var5 = false;
      this.class_[1] = var5;
      this.protected_();
      ((rrfw_3)this.class_[0]).class_();
   }

   private static void throws_() {
      protected_ = new byte[]{2, 6, 2, 3, 4, 5};
   }

   private static void catch_() {
      break_ = new short[]{0, 57, 3, 2, 4, 3, 5, 56, 57, 1, 57, 10, 1, 1, 0, 1, 0, 0, 0, 2, 4, 5, 1, 1, 0, 2, 3, 4, 5, 57, 57, 57, 1};
   }

   private boolean case_() {
      return !((cb_3)import_.class_[57]).break_(rLD.super_) && !((cb_3)import_.class_[57]).break_(rLD.this_) && !((cb_3)import_.class_[57]).break_(rLD.catch_)
         ? byte_[18]
         : byte_[17];
   }

   private void protected_() {
      Boolean var5 = false;
      this.class_[2] = var5;
      Boolean var6 = false;
      this.class_[3] = var6;
      Boolean var7 = false;
      this.class_[4] = var7;
      Boolean var8 = false;
      this.class_[5] = var8;
   }

   private static void private_() {
      byte_ = new boolean[]{
         true,
         true,
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
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }
}
