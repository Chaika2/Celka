package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpH_2 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true};
   }

   public rrpH_2(GriefJoiner var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 156743717759219309L;
   }

   public Optional<rrpl_3> class_(rrfq_3 var1) {
      return var1 == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0] ? Optional.of(new rrpn_3((GriefJoiner)this.class_[0])) : Optional.empty();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1971815900;
   }

   private static void class_() {
      byte_ = new short[3];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 40, 69, -98, 75, -61, -5, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }
}
