package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sR_2 extends C_try {
   private static boolean[] break_;
   private static byte[] throws_;
   private static String[] case_;
   private static short[] catch_;

   public sR_2(C_case var1) {
      super(var1, "litematica");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -690564778;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      int var3 = 0;
      if (var2.final_()) {
         var2.class_(1);
         if (var2.extends_(Integer.class)) {
            var3 = var2.catch_(Integer.class) - 1;
         }
      }

      try {
         ((C_case)this.class_[catch_[0]]).r().class_(var3);
      } catch (IndexOutOfBoundsException var5) {
         this.case_("Пожалуйста, предоставьте действительный индекс");
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5840040398790726742L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -85, -36, -37, -114, 102, -30, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new short[1];
   }

   private static void finally_() {
      throws_ = new byte[]{5, 2, 3, 4};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Постройте схему, открытую в настоящее время в Litematica", "", "Использование:", "> litematica", "> litematica <#>");
   }

   private static void extends_() {
      case_ = new String[]{
         new String("litematica"),
         new String("Пожалуйста, предоставьте действительный индекс"),
         new String("Построение загруженной схемы"),
         new String("Постройте схему, открытую в настоящее время в Litematica"),
         new String(""),
         new String("Использование:"),
         new String("> litematica"),
         new String("> litematica <#>")
      };
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
      break_ = new boolean[]{true, false, false, true, true, false, true, true};
   }
}
