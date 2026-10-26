package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwU_2 implements rrwj_3 {
   public Object[] class_;
   private static String[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      break_ = new String[]{new String("misc")};
   }

   public rrwU_2(String var1) {
      this.case_();
      this.class_[0] = var1;
      File var8 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("misc"), var1 + ".celka");
      this.class_[1] = var8;
      if (!((File)this.class_[1]).exists()) {
         try {
            ((File)this.class_[byte_[4]]).createNewFile();
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }
   }

   static {
      ntfClinit();
   }

   public String class_() {
      return (String)this.class_[0];
   }

   @Override
   public void class_(JsonObject var1) {
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 613648274;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3079748517801737363L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 120, -75, 89, 63, 119, -13, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public File break_() {
      return (File)this.class_[1];
   }

   @Override
   public void break_(JsonObject var1) {
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 1, 1, 1, 0, 1};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }
}
