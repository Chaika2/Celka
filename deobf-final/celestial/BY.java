package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BY extends Bt_1 implements By_1 {
   private static String[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static short[] throws_;

   public BY() {
      super("Сундук смерти");
      this.private_();
   }

   static {
      ntfClinit();
   }

   @Override
   public String class_() {
      this.private_();
      return (Bo_1)this.class_[0] == null ? null : ((Bo_1)this.class_[0]).class_();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-89, 54, 102, 85, 96, 55, 45, 38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1894617103352371136L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1898191739;
   }

   private static void break_() {
      byte_ = new String[]{new String("Сундук смерти")};
   }

   @Override
   public void throws_(String var1) {
      this.private_();
      super.throws_(var1);
      Bo_1 var6 = Bo_1.class_(var1);
      this.class_[0] = var6;
      if ((Bo_1)this.class_[0] != null) {
         this.protected_(((Bo_1)this.class_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void catch_() {
      throws_ = new short[5];
   }

   private static void implements_() {
      protected_ = new boolean[]{true};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
