package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bj_1 extends Bn_1 implements By_1 {
   private static String[] protected_;
   public Object[] byte_;
   private static short[] throws_;
   private static boolean[] case_;

   public Bj_1() {
      super("Алтарь", (Pattern[])Bl_1.class_[20]);
      this.finally_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5374855508433179389L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 490764782;
   }

   @Override
   public String class_() {
      this.finally_();
      return (BV)this.byte_[0] == null ? null : ((BV)this.byte_[0]).class_();
   }

   @Override
   public void throws_(String var1) {
      this.finally_();
      super.throws_(var1);
      BV var6 = BV.break_(var1);
      this.byte_[0] = var6;
      if ((BV)this.byte_[0] != null) {
         this.protected_(((BV)this.byte_[0]).class_() + " " + this.throws_().toLowerCase());
      }
   }

   private void finally_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 50, -67, 87, -42, 3, 12, 66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void catch_() {
      case_ = new boolean[]{true};
   }

   private static void implements_() {
      throws_ = new short[]{20, 0, 0, 0, 0, 0};
   }

   private static void private_() {
      protected_ = new String[]{new String("Алтарь")};
   }
}
