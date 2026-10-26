package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bv_3 {
   private static byte[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   public bL_2 byte_() {
      return (bL_2)this.class_[2];
   }

   public bv_3(rfl_3 var1, bL_2[] var2, int var3) {
      this.extends_();
      Integer var8 = var3;
      this.class_[0] = var8;
      this.class_[1] = var2;
      Integer var10 = var2.length;
      this.class_[5] = var10;
      bL_2 var11 = var2[0];
      this.class_[2] = var11;
      bL_2 var12 = var2[var2.length - 1];
      this.class_[3] = var12;
      this.class_[4] = var1;
   }

   static {
      ntfClinit();
   }

   public int class_() {
      return (Integer)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -64019766;
   }

   public boolean class_(rYB var1, rfH_2 var2) {
      return this.class_(var1, var2, null);
   }

   public int class_(rfH_2 var1) {
      if (var1 != null && !this.catch_()) {
         for (int var2 = byte_[19]; var2 < ((bL_2[])this.class_[1]).length; var2++) {
            if (((bL_2[])this.class_[1])[var2].equals(var1)) {
               return var2;
            }
         }

         return break_[1];
      } else {
         return break_[0];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -76, 49, 60, -46, 62, -77, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_(rYB var1, rpr_3 var2) {
      for (bL_2 var6 : (bL_2[])this.class_[1]) {
         if (var1.finally_(var6.byte_(var2))) {
            return false;
         }
      }

      return byte_[7];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7878301976046139145L;
   }

   public boolean class_(rYB var1) {
      for (bL_2 var5 : (bL_2[])this.class_[1]) {
         if (var1.finally_(var5)) {
            return false;
         }
      }

      return byte_[4];
   }

   public boolean class_(rYB var1, rfH_2 var2, rpr_3 var3) {
      for (bL_2 var7 : (bL_2[])this.class_[1]) {
         if (var7.equals(var2)) {
            if (var3 != null) {
               var7 = var7.byte_(var3);
            }

            return !var1.finally_(var7) ? true : byte_[13];
         }
      }

      return byte_[14];
   }

   public boolean break_(rfH_2 var1) {
      if (var1 != null && !this.catch_()) {
         for (bL_2 var5 : (bL_2[])this.class_[1]) {
            if (var5.equals(var1)) {
               return true;
            }
         }

         return byte_[18];
      } else {
         return byte_[15];
      }
   }

   public boolean break_(rYB var1, rfH_2 var2) {
      for (bL_2 var6 : (bL_2[])this.class_[1]) {
         if (var1.finally_(var6.class_(var2))) {
            return false;
         }
      }

      return byte_[10];
   }

   public rfl_3 break_() {
      return (rfl_3)this.class_[4];
   }

   public bL_2[] throws_() {
      return (bL_2[])this.class_[1];
   }

   private static void finally_() {
      break_ = new byte[]{-1, -1, 6, 5};
   }

   public boolean catch_() {
      return rrki_1.break_((bL_2[])this.class_[1]);
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[5] = 0;
      }
   }

   public int case_() {
      return (Integer)this.class_[5];
   }

   private static void implements_() {
      byte_ = new boolean[]{
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
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   public bL_2 protected_() {
      return (bL_2)this.class_[3];
   }

   private static void private_() {
      protected_ = new short[]{0, 1, 5, 2, 3, 4, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 2, 3, 4, 5};
   }
}
