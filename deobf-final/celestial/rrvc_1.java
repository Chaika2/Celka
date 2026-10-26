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
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static String[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      protected_ = new String[]{
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
      this.break_();
      HashMap var5 = new HashMap();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      Set var2 = ((HashMap)this.class_[0]).entrySet();
      var1.append("{");
      int var3 = 0;

      for (Entry var5 : var2) {
         Object var6 = var5.getValue();
         var1.append(this.break_((String)var5.getKey())).append(":");
         if (var6 instanceof String) {
            var1.append(this.break_(String.valueOf(var6)));
         } else if (var6 instanceof Integer) {
            var1.append(Integer.valueOf(String.valueOf(var6)));
         } else if (var6 instanceof Boolean) {
            var1.append(var6);
         } else if (var6 instanceof rrvc_1) {
            var1.append(var6);
         } else if (var6.getClass().isArray()) {
            var1.append("[");
            int var7 = Array.getLength(var6);

            for (int var8 = 0; var8 < var7; var8++) {
               var1.append(Array.get(var6, var8).toString()).append(var8 != var7 - 1 ? "," : protected_[4]);
            }

            var1.append("]");
         }

         var3++;
         var1.append(var3 == var2.size() ? "}" : protected_[7]);
      }

      return var1.toString();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, 111, -13, -17, 98, 82, 21, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   void class_(String var1, Object var2) {
      if (var2 != null) {
         ((HashMap)this.class_[0]).put(var1, var2);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8326021286767912081L;
   }

   private static void class_() {
      throws_ = new byte[]{32};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1994381342;
   }

   private String break_(String var1) {
      StringBuilder var2 = new StringBuilder("\"");

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         switch (var4) {
            case '\b':
               var2.append("\\b");
               break;
            case '\t':
               var2.append("\\t");
               break;
            case '\n':
               var2.append("\\n");
               break;
            case '\f':
               var2.append("\\f");
               break;
            case '\r':
               var2.append("\\r");
               break;
            case '"':
               var2.append("\\\"");
               break;
            case '\\':
               var2.append("\\\\");
               break;
            default:
               if (var4 < ' ') {
                  var2.append(String.format("\\u%04x", Integer.valueOf(var4)));
               } else {
                  var2.append(var4);
               }
         }
      }

      return var2.append("\"").toString();
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{false, false, true, false, true, false, true};
   }

   private static void protected_() {
      break_ = new short[3];
   }
}
