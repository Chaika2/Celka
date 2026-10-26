package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sG_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public static Object[] id_class;
   private static byte[] id_protected;
   private static String[] id_throws;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, true};
   }

   private sG_2() {
   }

   static {
      ntfClinit();
   }

   public static List<C_import> id_class(String var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      Matcher var3 = ((Pattern)id_class[id_break[0]]).matcher(var0);

      int var4;
      for (var4 = id_protected[0]; var3.find(); var4 = var3.end()) {
         var2.add(new sE_2(var2.size(), var3.group(), var0.substring(var3.start())));
      }

      if (var1 && var4 < var0.length()) {
         var2.add(new sE_2(var2.size(), id_throws[0], id_throws[1]));
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6890028788193466492L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 433607525;
   }

   public static List<C_import> id_class(String var0) {
      return id_class(var0, id_byte[0]);
   }

   public static sE_2 id_class() {
      return new sE_2(id_protected[1], id_throws[2], id_throws[3]);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{Pattern.compile(id_throws[4])};
      id_class = var0;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 99, 108, -8, -84, -86, 28, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new byte[]{-1, -1};
   }

   private static void id_case() {
      id_throws = new String[]{new String(""), new String(""), new String("<unknown>"), new String(""), new String("\\S+")};
   }

   private static void id_protected() {
      id_break = new short[1];
   }
}
