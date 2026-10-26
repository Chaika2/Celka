package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bg_1 extends Bn_1 implements By_1 {
   private static boolean[] protected_;
   public Object[] byte_;
   private static short[] throws_;
   private static String[] case_;

   public Bg_1() {
      super("Маяк убийца", (Pattern[])Bl_1.class_[18]);
      this.catch_();
   }

   static {
      ntfClinit();
   }

   @Override
   public String class_() {
      this.catch_();
      return (BR)this.byte_[0] == null ? null : ((BR)this.byte_[0]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -623250404;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3329730522932075399L;
   }

   @Override
   public void throws_(String var1) {
      this.catch_();
      super.throws_(var1);
      BR var6 = BR.class_(var1);
      this.byte_[0] = var6;
      if ((BR)this.byte_[0] != null) {
         this.protected_(((BR)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      protected_ = new boolean[]{true};
   }

   private void catch_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 26, -93, 80, -44, -29, 62, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void implements_() {
      case_ = new String[]{new String("Маяк убийца")};
   }

   private static void private_() {
      throws_ = new short[]{18, 0, 0, 0, 0, 0};
   }
}
