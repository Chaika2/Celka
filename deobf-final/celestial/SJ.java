package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SJ extends Bn_1 {
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] byte_;
   private static String[] case_;

   public SJ() {
      super("Аир-дроп", (Pattern[])BH.class_[4]);
      this.extends_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7368834094118296463L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1287466463;
   }

   @Override
   public void throws_(String var1) {
      this.extends_();
      super.throws_(var1);
      Sx_1 var6 = Sx_1.break_(var1);
      this.byte_[0] = var6;
      if ((Sx_1)this.byte_[0] != null) {
         this.protected_(((Sx_1)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      protected_ = new boolean[]{true};
   }

   public Sx_1 catch_() {
      this.extends_();
      return (Sx_1)this.byte_[0];
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, 50, -34, 93, 115, -35, 102, 23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void extends_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   private static void implements_() {
      case_ = new String[]{new String("Аир-дроп")};
   }

   private static void private_() {
      throws_ = new short[]{4, 0, 0, 0, 0};
   }
}
