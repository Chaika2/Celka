package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sa_3 extends C_try {
   private static String[] id_break;
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static short[] id_catch;

   public sa_3(C_case var1) {
      super(var1, "repack", "rescan");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5061815375472199920L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1990819864;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      this.id_case(
         String.format("Queued %d chunks for repacking", ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[0]).id_class((Ps_1)this.id_class[1]))
      );
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 122, -110, 56, 126, -47, -21, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_throws = new byte[]{2, 4, 2, 3};
   }

   private static void id_finally() {
      id_break = new String[]{
         new String("repack"),
         new String("rescan"),
         new String("Queued %d chunks for repacking"),
         new String("Re-cache chunks"),
         new String("Repack chunks around you. This basically re-caches them."),
         new String(""),
         new String("Usage:"),
         new String("> repack - Repack chunks.")
      };
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList("Repack chunks around you. This basically re-caches them.", "", "Usage:", "> repack - Repack chunks.");
   }

   private static void id_extends() {
      id_case = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public String id_implements() {
      return "Re-cache chunks";
   }

   private static void id_protected() {
      id_catch = new short[]{0, 1};
   }
}
