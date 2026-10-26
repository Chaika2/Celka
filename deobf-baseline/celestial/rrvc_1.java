package celestial;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvc_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_protected = new String[]{
         new String("{"),
         new String(":"),
         new String("["),
         new String(","),
         new String(""),
         new String("]"),
         new String("}"),
         new String(","),
         new String("\""),
         new String("\\\""),
         new String("\\\\"),
         new String("\\n"),
         new String("\\r"),
         new String("\\t"),
         new String("\\b"),
         new String("\\f"),
         new String("\\u%04x"),
         new String("\"")
      };
   }

   rrvc_1() {
      this.id_break();
      HashMap var5 = new HashMap();
      this.id_class[id_break[0]] = var5;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      Set var2 = ((HashMap)this.id_class[id_break[2]]).entrySet();
      var1.append(id_protected[0]);
      int var3 = id_byte[0];

      for (Entry var5 : var2) {
         Object var6 = var5.getValue();
         var1.append(this.id_break((String)var5.getKey())).append(id_protected[1]);
         if (var6 instanceof String) {
            var1.append(this.id_break(String.valueOf(var6)));
         } else if (var6 instanceof Integer) {
            var1.append(Integer.valueOf(String.valueOf(var6)));
         } else if (var6 instanceof Boolean) {
            var1.append(var6);
         } else if (var6 instanceof rrvc_1) {
            var1.append(var6);
         } else if (var6.getClass().isArray()) {
            var1.append(id_protected[2]);
            int var7 = Array.getLength(var6);

            for (int var8 = id_byte[1]; var8 < var7; var8++) {
               var1.append(Array.get(var6, var8).toString()).append(var8 != var7 - id_byte[2] ? id_protected[3] : id_protected[4]);
            }

            var1.append(id_protected[5]);
         }

         var3++;
         var1.append(var3 == var2.size() ? id_protected[6] : id_protected[7]);
      }

      return var1.toString();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, 111, -13, -17, 98, 82, 21, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   void id_class(String var1, Object var2) {
      if (var2 != null) {
         ((HashMap)this.id_class[id_break[1]]).put(var1, var2);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8326021286767912081L;
   }

   private static void id_class() {
      id_throws = new byte[]{32};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1994381342;
   }

   private String id_break(String var1) {
      StringBuilder var2 = new StringBuilder(id_protected[8]);

      for (int var3 = id_byte[3]; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         switch (var4) {
            case '\b':
               var2.append(id_protected[14]);
               break;
            case '\t':
               var2.append(id_protected[13]);
               break;
            case '\n':
               var2.append(id_protected[11]);
               break;
            case '\f':
               var2.append(id_protected[15]);
               break;
            case '\r':
               var2.append(id_protected[12]);
               break;
            case '"':
               var2.append(id_protected[9]);
               break;
            case '\\':
               var2.append(id_protected[10]);
               break;
            default:
               if (var4 < id_throws[0]) {
                  String var10001 = id_protected[16];
                  Object[] var10002 = new Object[id_byte[4]];
                  var10002[id_byte[5]] = Integer.valueOf(var4);
                  var2.append(String.format(var10001, var10002));
               } else {
                  var2.append(var4);
               }
         }
      }

      return var2.append(id_protected[17]).toString();
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[6]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, false, true, false, true, false, true};
   }

   private static void id_protected() {
      id_break = new short[3];
   }
}
