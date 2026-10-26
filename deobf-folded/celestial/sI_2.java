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
      String[] var10002 = new String[1];
      var10002[id_case[1]] = id_break[0];
      super(var1, var10002);
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
      var2.id_class(id_case[2]);
      System.gc();
      this.id_case(id_break[1]);
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
      String[] var10000 = new String[4];
      var10000[id_case[3]] = id_break[3];
      var10000[1] = id_break[4];
      var10000[2] = id_break[5];
      var10000[3] = id_break[6];
      return Arrays.asList(var10000);
   }

   @Override
   public String id_implements() {
      return id_break[2];
   }

   private static void id_protected() {
      id_case = new boolean[]{true, false, false, false, true};
   }
}
