package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PT extends Pv_1 implements MinecraftAccessor {
   private static byte[] byte_;
   private static String[] protected_;
   private static short[] throws_;
   private static boolean[] case_;
   public static Object[] break_;

   private static void byte_() {
      protected_ = new String[]{new String("По причине: (.*)\\s+Разбан через: (.*)")};
   }

   public PT(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 241817128376878310L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1272046458;
   }

   @Override
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvb_3 var3) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            return;
         }

         String var4 = var3.break_().byte_();
         Matcher var5 = ((Pattern)break_[0]).matcher(var4);
         if (var5.find()) {
            String var6 = var5.group(1);
            String var7 = var5.group(2);
            ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).break_((rrZr_1)rrQJ.class_[5], var6, var7);
            MinecraftAccessor.a_("Вы были забанены за " + var6, false);
         }
      }
   }

   private static void class_() {
      case_ = new boolean[]{true, false, false, true};
   }

   private static void break_() {
      Object[] var0 = new Object[]{Pattern.compile("По причине: (.*)\\s+Разбан через: (.*)", 0)};
      break_ = var0;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, -58, 46, -116, 19, 56, -75, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private static void protected_() {
      throws_ = new short[]{1, 2, 0, 0, 5};
   }
}
