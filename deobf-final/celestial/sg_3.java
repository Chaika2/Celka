package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sg_3 extends C_try {
   private static short[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static String[] catch_;

   public sg_3(C_case var1) {
      super(var1, "invert");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1158356882;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 81525537217817591L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      rc_3 var3 = ((C_case)this.class_[0]).import_();
      rP_2 var4;
      if ((var4 = var3.private_()) == null) {
         throw new k_1("No goal");
      } else {
         if (var4 instanceof rG_2) {
            var4 = (rP_2)((rG_2)var4).class_[0];
         } else {
            var4 = new rG_2(var4);
         }

         var3.break_(var4);
         this.case_(String.format("Goal: %s", var4.toString()));
      }
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, -116, -39, -33, -108, -30, 38, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      case_ = new byte[]{4, 2, 3};
   }

   private static void finally_() {
      throws_ = new boolean[]{true, false, false, true, false, false, true};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "The invert command tells Baritone to head away from the current goal rather than towards it.", "", "Usage:", "> invert - Invert the current goal."
      );
   }

   private static void extends_() {
      break_ = new short[2];
   }

   @Override
   public String implements_() {
      return "Run away from the current goal";
   }

   private static void protected_() {
      catch_ = new String[]{
         new String("invert"),
         new String("No goal"),
         new String("Goal: %s"),
         new String("Run away from the current goal"),
         new String("The invert command tells Baritone to head away from the current goal rather than towards it."),
         new String(""),
         new String("Usage:"),
         new String("> invert - Invert the current goal.")
      };
   }
}
