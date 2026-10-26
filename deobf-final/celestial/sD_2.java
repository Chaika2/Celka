package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sD_2 extends C_try {
   private static String[] break_;
   private static byte[] throws_;
   private static short[] case_;
   private static boolean[] catch_;

   public sD_2(C_case var1) {
      super(var1, "proc");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      rr_3 var3 = ((C_case)this.class_[0]).goto_();
      rz_3 var4 = var3.protected_().orElse(null);
      if (var4 == null) {
         throw new k_1("No process in control");
      } else {
         this.case_(
            String.format(
               "Class: %s\nPriority: %f\nTemporary: %b\nDisplay name: %s\nLast command: %s",
               var4.getClass().getTypeName(),
               var4.case_(),
               var4.catch_(),
               var4.break_(),
               var3.break_().map(rn_3::toString).orElse("None")
            )
         );
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5506135059726129101L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1840389702;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, 115, 5, 20, -112, -91, -32, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new boolean[]{true, false, false, false, true, false, true};
   }

   private static void finally_() {
      case_ = new short[1];
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "The proc command provides miscellaneous information about the process currently controlling Baritone.",
         "",
         "You are not expected to understand this if you aren't familiar with how Baritone works.",
         "",
         "Usage:",
         "> proc - View process information, if present"
      );
   }

   private static void extends_() {
      throws_ = new byte[]{5, 2, 3, 4, 6, 2, 3, 4, 5};
   }

   @Override
   public String implements_() {
      return "View process state information";
   }

   private static void protected_() {
      break_ = new String[]{
         new String("proc"),
         new String("No process in control"),
         new String("Class: %s\nPriority: %f\nTemporary: %b\nDisplay name: %s\nLast command: %s"),
         new String("None"),
         new String("View process state information"),
         new String("The proc command provides miscellaneous information about the process currently controlling Baritone."),
         new String(""),
         new String("You are not expected to understand this if you aren't familiar with how Baritone works."),
         new String(""),
         new String("Usage:"),
         new String("> proc - View process information, if present")
      };
   }
}
