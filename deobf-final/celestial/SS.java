package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SS extends Bn_1 implements By_1 {
   private static boolean[] protected_;
   private static short[] throws_;
   private static String[] case_;
   public Object[] byte_;

   public SS() {
      super("Дед мороз", (Pattern[])Bl_1.class_[21]);
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3027660393850232258L;
   }

   @Override
   public String class_() {
      this.private_();
      return (Ss_1)this.byte_[0] == null ? null : ((Ss_1)this.byte_[0]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2103942713;
   }

   @Override
   public void throws_(String var1) {
      this.private_();
      super.throws_(var1);
      Ss_1 var6 = Ss_1.class_(var1);
      this.byte_[0] = var6;
      if ((Ss_1)this.byte_[0] != null) {
         this.protected_(((Ss_1)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      case_ = new String[]{new String("Дед мороз")};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, 0, 24, 5, -12, 60, 12, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void catch_() {
      protected_ = new boolean[]{true};
   }

   private static void implements_() {
      throws_ = new short[]{21, 0, 0, 0, 0, 0};
   }

   private void private_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }
}
