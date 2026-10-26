package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmJ_2 implements rruq_1 {
   private static String[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   private static void byte_() {
      break_ = new String[]{new String(" ")};
   }

   rrmJ_2() {
      this.class_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, 50, -7, -127, -97, 39, -60, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6344209331919228763L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 367673369;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String var2 = var1.implements_();
      if (((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).class_(var2)) {
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).byte_(var2);
      } else {
         String var3 = var1.class_(" ", 1);
         rrvm_1 var8 = new rrvm_1(var2, var3, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
         this.class_[0] = var8;
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).break_();
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).break_(var1x -> {
            if ((rrvm_1)this.class_[0] != null) {
               ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).class_(((rrvm_1)this.class_[0]).class_(rrfC_2.class_(var1x)), true);
               Object var6 = null;
               this.class_[0] = var6;
            }
         });
      }
   }

   private static void break_() {
      byte_ = new boolean[]{true, true, true};
   }

   private static void protected_() {
      protected_ = new short[10];
   }
}
