package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Be_1 extends Bn_1 implements By_1 {
   private static short[] protected_;
   private static boolean[] throws_;
   private static String[] case_;
   public Object[] byte_;

   public Be_1() {
      super("Метеор. дождь", (Pattern[])Bl_1.class_[15]);
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 67622947;
   }

   @Override
   public String class_() {
      this.catch_();
      return (Ba_1)this.byte_[0] == null ? null : ((Ba_1)this.byte_[0]).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6758016890447815831L;
   }

   @Override
   public void throws_(String var1) {
      this.catch_();
      super.throws_(var1);
      Ba_1 var6 = Ba_1.class_(var1);
      this.byte_[0] = var6;
      if ((Ba_1)this.byte_[0] != null) {
         this.protected_(((Ba_1)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      throws_ = new boolean[]{true};
   }

   private void catch_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -63, 84, -67, 81, 126, 57, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void implements_() {
      case_ = new String[]{new String("Метеор. дождь")};
   }

   private static void private_() {
      protected_ = new short[]{15, 0, 0, 0, 0, 0};
   }
}
