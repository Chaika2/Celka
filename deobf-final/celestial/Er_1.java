package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Er_1 extends C_try {
   private static boolean[] break_;
   private static byte[] throws_;
   private static short[] case_;
   private static String[] catch_;

   public Er_1(C_case var1) {
      super(var1, "schematica");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2338298556241726871L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      ((C_case)this.class_[0]).r().private_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1036941196;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 0, -118, -2, -98, 107, -1, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new byte[]{4, 2, 3};
   }

   private static void finally_() {
      catch_ = new String[]{
         new String("schematica"),
         new String("Построение загруженной схемы"),
         new String("Построение схемы, открытой в данный момент в Schematica"),
         new String(""),
         new String("Использование:"),
         new String("> schematica")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Построение схемы, открытой в данный момент в Schematica", "", "Использование:", "> schematica");
   }

   private static void extends_() {
      case_ = new short[1];
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Построение загруженной схемы";
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, false, false, true, true};
   }
}
