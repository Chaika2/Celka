package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SE extends Bt_1 implements By_1 {
   public Object[] class_;
   private static short[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;

   public SE() {
      super("Снежная бойня");
      this.implements_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -944474185;
   }

   @Override
   public String class_() {
      this.implements_();
      return (SG)this.class_[0] == null ? null : ((SG)this.class_[0]).class_();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -80, -67, 123, 63, -119, -59, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8417179066477686441L;
   }

   private static void break_() {
      protected_ = new String[]{new String("Снежная бойня")};
   }

   @Override
   public void throws_(String var1) {
      this.implements_();
      super.throws_(var1);
      SG var6 = SG.class_(var1);
      this.class_[0] = var6;
      if ((SG)this.class_[0] != null) {
         this.protected_(((SG)this.class_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void catch_() {
      throws_ = new boolean[]{true};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      byte_ = new short[5];
   }
}
