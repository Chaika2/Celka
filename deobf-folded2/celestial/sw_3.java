package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sw_3 extends C_try {
   private static short[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;

   public sw_3(C_case var1) {
      super(var1, "forcecancel");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      C_final var3 = ((C_case)this.id_class[0]).id_this();
      var3.id_break();
      var3.id_private();
      this.id_case("Принудительно отменены все процессы.");
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1395970455;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4298367004519771026L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -72, 98, -98, -18, 16, 50, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_break = new short[1];
   }

   private static void id_finally() {
      id_throws = new boolean[]{true, false, false, false, true, true};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList("Как cancel, но более с большой силой.", "", "Использование:", "> forcecancel");
   }

   private static void id_extends() {
      id_catch = new String[]{
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
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Принудительно отменяет все процессы.";
   }

   private static void id_protected() {
      id_case = new byte[]{4, 2, 3};
   }
}
