package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mz_1 {
   private static byte[] id_byte;
   private static short[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static String[] id_case;

   xc_3 id_byte() {
      if ((xc_3)this.id_break[2] == null) {
         xd_3 var1 = rVL.id_strictfp.id_class((rqO_2)this.id_break[0]);
         xc_3 var6 = var1.id_continue();
         this.id_break[2] = var6;
         ((Map)this.id_break[1]).keySet().stream().sorted(String::compareTo).forEachOrdered(var2 -> {
            rCZ var3 = var1.id_new().id_class(var2);
            if (var3 != null) {
               xc_3 var8 = id_class((xc_3)this.id_break[2], var3, (String)((Map)this.id_break[1]).get(var2));
               this.id_break[2] = var8;
            }
         });
      }

      return (xc_3)this.id_break[2];
   }

   private Mz_1(rqO_2 var1, Map<String, String> var2) {
      this.id_throws();
      this.id_break[0] = var1;
      this.id_break[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2826839350835072058L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 51, 31, 17, -52, -21, 110, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -498277741;
   }

   private static void id_class() {
      id_case = new String[]{
         new String("location"),
         new String("properties"),
         new String(","),
         new String("="),
         new String("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?")
      };
   }

   private static <T extends Comparable<T>> xc_3 id_class(xc_3 var0, rCZ<T> var1, String var2) {
      Optional var3 = var1.id_break(var2);
      if (var3.isPresent()) {
         return var0.id_class(var1, (Comparable)var3.get());
      } else {
         throw new IllegalArgumentException("Invalid value for property " + var1);
      }
   }

   private static void id_break() {
      id_byte = new byte[]{3};
   }

   static Mz_1 id_break(String var0) {
      Matcher var1 = ((Pattern)id_class[0]).matcher(var0);
      if (!var1.matches()) {
         return null;
      } else {
         try {
            String var2 = var1.group(id_case[0]);
            String var3 = var1.group(id_case[1]);
            rqO_2 var4 = new rqO_2(var2);
            HashMap var5 = new HashMap();
            if (var3 != null) {
               String[] var6 = var3.split(id_case[2]);
               int var7 = var6.length;

               for (int var8 = id_throws[0]; var8 < var7; var8++) {
                  String var9 = var6[var8];
                  String[] var10 = var9.split(id_case[3]);
                  var5.put(var10[id_throws[1]], var10[id_throws[2]]);
               }
            }

            return new Mz_1(var4, var5);
         } catch (Exception var11) {
            var11.printStackTrace();
            return null;
         }
      }
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, false, true, false, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{Pattern.compile("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?", 0)};
      id_class = var0;
   }

   private static void id_protected() {
      id_protected = new short[]{0, 1, 2, 0, 2, 1, 2, 0, 2, 1, 2};
   }
}
