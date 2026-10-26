package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sR_2 extends C_try {
   private static boolean[] id_break;
   private static byte[] id_throws;
   private static String[] id_case;
   private static short[] id_catch;

   public sR_2(C_case var1) {
      super(var1, "litematica");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -690564778;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      int var3 = 0;
      if (var2.id_final()) {
         var2.id_class(1);
         if (var2.id_extends(Integer.class)) {
            var3 = var2.id_catch(Integer.class) - 1;
         }
      }

      try {
         ((C_case)this.id_class[id_catch[0]]).r().id_class(var3);
      } catch (IndexOutOfBoundsException var5) {
         this.id_case("Пожалуйста, предоставьте действительный индекс");
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5840040398790726742L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -85, -36, -37, -114, 102, -30, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new short[1];
   }

   private static void id_finally() {
      id_throws = new byte[]{5, 2, 3, 4};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList("Постройте схему, открытую в настоящее время в Litematica", "", "Использование:", "> litematica", "> litematica <#>");
   }

   private static void id_extends() {
      id_case = new String[]{
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
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Построение загруженной схемы";
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, true, true, false, true, true};
   }
}
