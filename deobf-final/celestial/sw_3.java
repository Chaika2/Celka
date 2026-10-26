package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sw_3 extends C_try {
   private static short[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static String[] catch_;

   public sw_3(C_case var1) {
      super(var1, "forcecancel");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      C_final var3 = ((C_case)this.class_[0]).this_();
      var3.break_();
      var3.private_();
      this.case_("Принудительно отменены все процессы.");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1395970455;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4298367004519771026L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -72, 98, -98, -18, 16, 50, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      break_ = new short[1];
   }

   private static void finally_() {
      throws_ = new boolean[]{true, false, false, false, true, true};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Как cancel, но более с большой силой.", "", "Использование:", "> forcecancel");
   }

   private static void extends_() {
      catch_ = new String[]{
         new String("forcecancel"),
         new String("Принудительно отменены все процессы."),
         new String("Принудительно отменяет все процессы."),
         new String("Как cancel, но более с большой силой."),
         new String(""),
         new String("Использование:"),
         new String("> forcecancel")
      };
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Принудительно отменяет все процессы.";
   }

   private static void protected_() {
      case_ = new byte[]{4, 2, 3};
   }
}
