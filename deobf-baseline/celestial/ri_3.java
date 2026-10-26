package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ri_3 {
   private static boolean[] id_break;
   private static short[] id_byte;
   public static Object[] id_class;
   private static String[] id_protected;

   private static void id_byte() {
      id_protected = new String[]{new String("minecraft"), new String("Invalid block name %s"), new String(":")};
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, 51, -88, -58, -16, 21, 104, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private ri_3() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(xd_3 var0) {
      rqO_2 var1 = rVL.id_strictfp.id_break(var0);
      String var2 = var1.id_break();
      if (!var1.id_byte().equals(id_protected[0])) {
         var2 = var1.toString();
      }

      return var2;
   }

   private static void id_class() {
      id_break = new boolean[]{true, false, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6928496806877921579L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1836709736;
   }

   public static xd_3 id_class(String var0) {
      xd_3 var1 = id_protected(var0);
      return var1 == null ? xu_3.id_class : var1;
   }

   public static xd_3 id_break(String var0) {
      xd_3 var1 = id_protected(var0);
      if (var1 == null) {
         String var10002 = id_protected[1];
         Object[] var10003 = new Object[id_break[0]];
         var10003[id_break[1]] = var0;
         throw new IllegalArgumentException(String.format(var10002, var10003));
      } else {
         return var1;
      }
   }

   private static void id_break() {
      id_byte = new short[4];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new HashMap()};
      id_class = var0;
   }

   public static xd_3 id_protected(String var0) {
      xd_3 var1 = (xd_3)((Map)id_class[id_byte[0]]).get(var0);
      if (var1 != null) {
         return var1;
      } else if (((Map)id_class[id_byte[1]]).containsKey(var0)) {
         return null;
      } else {
         var1 = rVL.id_strictfp.id_break(rqO_2.id_break(var0.contains(id_protected[2]) ? var0 : "minecraft:" + var0)).orElse(null);
         HashMap var2 = new HashMap((Map)id_class[id_byte[2]]);
         var2.put(var0, var1);
         id_class[id_byte[3]] = var2;
         return var1;
      }
   }
}
