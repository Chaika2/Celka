package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BM extends Pv_1 {
   private static short[] byte_;
   private static String[] protected_;
   public static Object[] break_;
   private static byte[] throws_;
   private static boolean[] case_;

   private static void byte_() {
      byte_ = new short[]{0, 1};
   }

   public BM(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1057045127;
   }

   @Override
   public void class_(C var1) {
      super.class_(var1);
      boolean var2 = rrfZ_2.byte_();
      if (var2) {
         String var3 = var1.class_().toLowerCase().trim();
         if ((((Pattern)break_[0]).matcher(var3).find() || ((Pattern)break_[1]).matcher(var3).find()) && rrfv_3.class_(var3, true)) {
            var1.break_();
         }
      }
   }

   private static void class_() {
      Object[] var0 = new Object[]{Pattern.compile("^/(an|anarchy|grf|grief)(\\d+).*", 0), Pattern.compile("^/(hub).*")};
      break_ = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3205699586610278206L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{56, -83, -109, 79, 69, -109, -79, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new byte[]{2};
   }

   private static void throws_() {
      protected_ = new String[]{new String("^/(an|anarchy|grf|grief)(\\d+).*"), new String("^/(hub).*")};
   }

   private static void protected_() {
      case_ = new boolean[]{true, false, true};
   }
}
