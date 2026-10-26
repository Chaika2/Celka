package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Po_1 {
   private static boolean[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static short[] id_case;

   private static void id_byte() {
      id_throws = new String[]{
         new String("(?i)(сололайт|дуолайт|триолайт|кланлайт|лайт120|классик|лобби|sololite|duolite|triolite|clanlite|lite120|classic)(\\d+)")
      };
   }

   public Po_1(PK var1, String var2) {
      this.id_catch();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   public String id_class() {
      return (String)this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, -126, 126, 120, -108, -94, 44, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5996086653761835792L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1270401447;
   }

   public static Po_1 id_break(String var0) {
      if (rql_3.id_break(var0)) {
         return null;
      } else {
         Matcher var1 = ((Pattern)id_break[0]).matcher(var0.toLowerCase());
         if (var1.find()) {
            String var2 = var1.group(1);
            String var3 = var1.group(2);
            String var4 = (String)((Map)Pg_1.id_throws[1]).get(var2);
            if (var4 != null) {
               for (PK var8 : (PK[])PK.staticFields6a264fee257833ddb403077ab7e90d84[7]) {
                  if (var8.id_class().equals(var4)) {
                     return new Po_1(var8, var3);
                  }
               }
            }

            for (PK var12 : (PK[])PK.staticFields6a264fee257833ddb403077ab7e90d84[7]) {
               if (var12.id_class().equalsIgnoreCase(var2)) {
                  return new Po_1(var12, var3);
               }
            }
         }

         return null;
      }
   }

   public PK id_break() {
      return (PK)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, false, false, true};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_protected = new byte[]{2, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{
         Pattern.compile("(?i)(сололайт|дуолайт|триолайт|кланлайт|лайт120|классик|лобби|sololite|duolite|triolite|clanlite|lite120|classic)(\\d+)", 0)
      };
      id_break = var0;
   }

   private static void id_private() {
      id_case = new short[]{0, 1, 7, 7, 0, 1, 0, 1};
   }
}
