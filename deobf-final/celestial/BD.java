package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BD extends Bn_1 implements By_1 {
   private static short[] protected_;
   private static boolean[] throws_;
   public Object[] byte_;
   private static String[] case_;

   public BD() {
      super("Гейзер", (Pattern[])Bl_1.class_[23]);
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4325367419091138209L;
   }

   @Override
   public String class_() {
      this.private_();
      return (BU)this.byte_[0] == null ? null : ((BU)this.byte_[0]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1900915126;
   }

   @Override
   public void throws_(String var1) {
      this.private_();
      super.throws_(var1);
      BU var6 = BU.class_(var1);
      this.byte_[0] = var6;
      if ((BU)this.byte_[0] != null) {
         this.protected_(((BU)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      throws_ = new boolean[]{true};
   }

   private static void catch_() {
      protected_ = new short[]{23, 0, 0, 0, 0, 0};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -82, 77, 43, 5, -80, -107, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void implements_() {
      case_ = new String[]{new String("Гейзер")};
   }

   private void private_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }
}
