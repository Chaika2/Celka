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
      String[] var10002 = new String[id_throws[0]];
      var10002[id_case[0]] = id_break[0];
      var10002[id_case[1]] = id_break[1];
      super(var1, var10002);
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
      var2.id_class(id_case[2]);
      String var10001 = id_break[2];
      Object[] var10002 = new Object[id_case[3]];
      var10002[id_case[4]] = ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_catch[0]]).id_class((Ps_1)this.id_class[id_catch[1]]);
      this.id_case(String.format(var10001, var10002));
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
      String[] var10000 = new String[id_throws[1]];
      var10000[id_case[5]] = id_break[4];
      var10000[id_case[6]] = id_break[5];
      var10000[id_throws[2]] = id_break[6];
      var10000[id_throws[3]] = id_break[7];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_case = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public String id_implements() {
      return id_break[3];
   }

   private static void id_protected() {
      id_catch = new short[]{0, 1};
   }
}
