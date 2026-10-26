package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bi_1 extends Bn_1 implements By_1 {
   public Object[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static short[] case_;

   public Bi_1() {
      super("Загадочный маяк", (Pattern[])Bl_1.class_[17]);
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4251921814201771696L;
   }

   @Override
   public String class_() {
      this.catch_();
      return (Sr_1)this.byte_[0] == null ? null : ((Sr_1)this.byte_[0]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1671928312;
   }

   @Override
   public void throws_(String var1) {
      this.catch_();
      super.throws_(var1);
      Sr_1 var6 = Sr_1.break_(var1);
      this.byte_[0] = var6;
      if ((Sr_1)this.byte_[0] != null) {
         this.protected_(((Sr_1)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private static void finally_() {
      throws_ = new boolean[]{true};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 56, 36, -99, -63, 40, 37, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void catch_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   private static void implements_() {
      case_ = new short[]{17, 0, 0, 0, 0, 0};
   }

   private static void private_() {
      protected_ = new String[]{new String("Загадочный маяк")};
   }
}
