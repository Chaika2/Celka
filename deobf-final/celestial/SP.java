package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SP extends Bn_1 implements By_1 {
   private static String[] protected_;
   private static short[] throws_;
   public Object[] byte_;
   private static boolean[] case_;

   public SP() {
      super("Мистик", (Pattern[])Bl_1.class_[16]);
      this.private_();
   }

   static {
      ntfClinit();
   }

   @Override
   public String class_() {
      this.private_();
      return (SB)this.byte_[0] == null ? null : ((SB)this.byte_[0]).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5850071901462858031L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 310029569;
   }

   @Override
   public void throws_(String var1) {
      this.private_();
      super.throws_(var1);
      SB var6 = SB.class_(var1);
      this.byte_[0] = var6;
      if ((SB)this.byte_[0] != null) {
         this.protected_(((SB)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      case_ = new boolean[]{true};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 119, -39, -91, -19, -114, 40, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void catch_() {
      protected_ = new String[]{new String("Мистик")};
   }

   private static void implements_() {
      throws_ = new short[]{16, 0, 0, 0, 0, 0};
   }

   private void private_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }
}
