package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class se_3 extends C_try {
   private static boolean[] break_;
   private static byte[] throws_;
   private static short[] case_;
   private static String[] catch_;

   public se_3(C_case var1) {
      super(var1, "render");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2071597137;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2388435061493023649L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      rU_2 var3 = ((Ps_1)this.class_[1]).volatile_();
      int var4 = (((Qw_1)b_.class_[20]).break_ + 1) * 16;
      ((yX_2)b_.class_[8])
         .class_((Integer)var3.break_[0] - var4, 0, (Integer)var3.break_[2] - var4, (Integer)var3.break_[0] + var4, 255, (Integer)var3.break_[2] + var4);
      this.case_("Done");
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 12, 24, 126, 115, -118, -87, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, false, true, false, false, true};
   }

   private static void finally_() {
      catch_ = new String[]{
         new String("render"),
         new String("Done"),
         new String("Fix glitched chunks"),
         new String("The render command fixes glitched chunk rendering without having to reload all of them."),
         new String(""),
         new String("Usage:"),
         new String("> render")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("The render command fixes glitched chunk rendering without having to reload all of them.", "", "Usage:", "> render");
   }

   private static void extends_() {
      throws_ = new byte[]{16, 4, 2, 3};
   }

   @Override
   public String implements_() {
      return "Fix glitched chunks";
   }

   private static void protected_() {
      case_ = new short[]{1, 20, 8, 0, 2, 0, 255, 2};
   }
}
