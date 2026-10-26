package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCf_1 extends rrTF<Velocity> {
   private static short[] class_;
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      break_ = new boolean[]{true, true};
   }

   public rrCf_1(Velocity var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      protected_ = new byte[]{31};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -17, -88, -57, -41, 50, 49, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1856068226;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rvc_3 var3) {
         if ((cb_3)import_.class_[57] != null && var3.break_() == ((cb_3)import_.class_[57]).V()) {
            var1.class_(true);
         }
      } else if (var2 instanceof rvu_3 var4) {
         var4.class_(0.0F);
         var4.break_(0.0F);
         var4.byte_(0.0F);
      } else if (var2 instanceof rvQ_2 var5 && var5.break_() == 31) {
         var1.class_(true);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5214565446306757762L;
   }

   private static void break_() {
      class_ = new short[]{57, 57};
   }

   private static void protected_() {
      byte_ = new float[3];
   }
}
