package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sb_1 extends Bn_1 implements By_1 {
   private static short[] protected_;
   private static String[] throws_;
   public Object[] byte_;
   private static boolean[] case_;

   public Sb_1() {
      super("Вулкан", (Pattern[])Bl_1.class_[19]);
      this.finally_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5919368048593481096L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1103593341;
   }

   @Override
   public String class_() {
      this.finally_();
      return (SM)this.byte_[0] == null ? null : ((SM)this.byte_[0]).class_();
   }

   @Override
   public void throws_(String var1) {
      this.finally_();
      super.throws_(var1);
      SM var6 = SM.break_(var1);
      this.byte_[0] = var6;
      if ((SM)this.byte_[0] != null) {
         this.protected_(((SM)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private void finally_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   private static void catch_() {
      protected_ = new short[]{19, 0, 0, 0, 0, 0};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, -115, -37, 13, 124, 74, 57, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void implements_() {
      case_ = new boolean[]{true};
   }

   private static void private_() {
      throws_ = new String[]{new String("Вулкан")};
   }
}
