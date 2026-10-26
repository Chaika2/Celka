package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfp_3 implements MinecraftAccessor {
   private static boolean[] id_break;
   private static short[] id_byte;
   public static Object[] id_class;
   private static String[] id_protected;
   private static byte[] id_throws;

   public static int id_byte() {
      Aq_1 var0 = id_import.id_void();
      return (cb_3)id_import.id_class[57] != null && var0 != null && var0.id_class(((cb_3)id_import.id_class[57]).ro()) != null
         ? var0.id_class(((cb_3)id_import.id_class[57]).ro()).id_byte()
         : id_break[6];
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1922804324;
   }

   public static boolean id_class(String... var0) {
      String var1 = id_import.S() == null ? null : id_import.S().id_break;
      if (var1 == null) {
         return false;
      } else if (id_import.id_finally()) {
         return false;
      } else {
         for (String var5 : var0) {
            if (var1.contains(var5)) {
               return true;
            }
         }

         return id_break[5];
      }
   }

   public static boolean id_class(Aw_1 var0) {
      for (Aw_1 var2 : id_import.id_void().id_throws()) {
         if (var2.id_class().getName().equals(var0.id_class().getName())) {
            return true;
         }
      }

      return id_break[8];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9178386518646645743L;
   }

   public static void id_class(rrfq_3 var0, rud_3 var1) {
   }

   public static Aw_1 id_class(String var0) {
      for (Aw_1 var2 : ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_throws()) {
         if (var2.id_class().getName().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }

   public static boolean id_class() {
      return ((gm_3)id_import.id_class[56]).E().id_class().id_break().equals("world_spawn");
   }

   public static void id_break(rrfq_3 var0, rud_3 var1) {
      if ((rrfq_3)id_class[1] != var0) {
         id_class[1] = var0;
         if ((rrfq_3)id_class[1] != null) {
            id_class(var0, var1);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -122, -82, -82, 125, 68, -114, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrfq_3 id_break() {
      for (rrfq_3 var3 : rrfq_3.values()) {
         if (id_class(var3.id_class())) {
            return var3;
         }
      }

      return null;
   }

   public static String id_throws() {
      if (id_import.id_finally()) {
         return "localhost";
      } else {
         Ak_1 var0 = id_import.S();
         return var0 == null ? null : var0.id_break;
      }
   }

   private static void id_finally() {
      id_byte = new short[]{57, 57, 57, 57, 0, 0, 57, 0, 56, 1, 1, 1, 2, 4};
   }

   private static void id_catch() {
      Object[] var0 = new Object[2];
      id_class = var0;
   }

   private static void id_extends() {
      id_protected = new String[]{
         new String("world_spawn"),
         new String("localhost"),
         new String("Via Version"),
         new String("Пожалуйста, используйте версию 1.16 для подключения к этому серверу")
      };
   }

   public static List<rrZk_1> id_case() {
      Map var0 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class();
      if (var0.isEmpty()) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = new ArrayList();

         for (Aw_1 var3 : ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_throws()) {
            String var4 = var3.id_class().getName().toLowerCase();
            rrZk_1 var5 = (rrZk_1)var0.get(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }

         return var1;
      }
   }

   private static void id_implements() {
      id_throws = new byte[]{2};
   }

   public static String id_protected() {
      return C_throws.id_byte().id_continue().id_byte();
   }

   private static void id_private() {
      id_break = new boolean[]{false, false, false, false, true, false, false, true, false};
   }
}
