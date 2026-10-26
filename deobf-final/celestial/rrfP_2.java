package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfP_2 {
   private static byte[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   private static void byte_() {
      protected_ = new short[]{1, 57, 57, 1, 0, 0, 1, 57, 1, 1, 0, 1, 1};
   }

   public rrfP_2() {
      this.protected_();
      Integer var5 = -1;
      this.class_[1] = var5;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6471351719885462085L;
   }

   public void class_(boolean var1) {
      if ((Boolean)this.class_[0] && (Integer)this.class_[1] != -1) {
         ((rhz_3)((cb_3)MinecraftAccessor.import_.class_[57]).implements_[1]).protected_ = (Integer)this.class_[1];
         if (var1) {
            Boolean var6 = false;
            this.class_[0] = var6;
            Integer var7 = -1;
            this.class_[1] = var7;
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, -110, -121, 45, 50, 52, -37, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new boolean[]{true, false, false, false, true, false};
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[1] = var6;
   }

   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvm_3 var2) {
         if ((cb_3)MinecraftAccessor.import_.class_[57] == null) {
            return;
         }

         if (var2.break_() != ((rhz_3)((cb_3)MinecraftAccessor.import_.class_[57]).implements_[1]).protected_) {
            Boolean var8 = true;
            this.class_[0] = var8;
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1422086272;
   }

   private static void break_() {
      break_ = new byte[]{-1, -1, -1, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[0] = false;
         this.class_[1] = 0;
      }
   }
}
