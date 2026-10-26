package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sI_2 extends C_try {
   private static String[] id_break;
   private static byte[] id_throws;
   private static boolean[] id_case;

   public sI_2(C_case var1) {
      super(var1, "gc");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2429512582658921796L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 750512443;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      System.gc();
      this.id_case("ok called System.gc()");
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -4, -54, -22, -66, -128, -1, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new byte[]{4, 2, 3};
   }

   private static void id_finally() {
      id_break = new String[]{
         new String("gc"),
         new String("ok called System.gc()"),
         new String("Call System.gc()"),
         new String("Calls System.gc()."),
         new String(""),
         new String("Usage:"),
         new String("> gc")
      };
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList("Calls System.gc().", "", "Usage:", "> gc");
   }

   @Override
   public String id_implements() {
      return "Call System.gc()";
   }

   private static void id_protected() {
      id_case = new boolean[]{true, false, false, false, true};
   }
}
