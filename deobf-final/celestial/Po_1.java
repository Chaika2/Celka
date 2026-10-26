package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Po_1 {
   private static boolean[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static byte[] protected_;
   private static String[] throws_;
   private static short[] case_;

   private static void byte_() {
      throws_ = new String[]{
         new String("(?i)(сололайт|дуолайт|триолайт|кланлайт|лайт120|классик|лобби|sololite|duolite|triolite|clanlite|lite120|classic)(\\d+)")
      };
   }

   public Po_1(PK var1, String var2) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public String class_() {
      return (String)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, -126, 126, 120, -108, -94, 44, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5996086653761835792L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1270401447;
   }

   public static Po_1 break_(String var0) {
      if (rql_3.break_(var0)) {
         return null;
      } else {
         Matcher var1 = ((Pattern)break_[0]).matcher(var0.toLowerCase());
         if (var1.find()) {
            String var2 = var1.group(1);
            String var3 = var1.group(2);
            String var4 = (String)((Map)Pg_1.throws_[1]).get(var2);
            if (var4 != null) {
               for (PK var8 : (PK[])PK.staticFields6a264fee257833ddb403077ab7e90d84[7]) {
                  if (var8.class_().equals(var4)) {
                     return new Po_1(var8, var3);
                  }
               }
            }

            for (PK var12 : (PK[])PK.staticFields6a264fee257833ddb403077ab7e90d84[7]) {
               if (var12.class_().equalsIgnoreCase(var2)) {
                  return new Po_1(var12, var3);
               }
            }
         }

         return null;
      }
   }

   public PK break_() {
      return (PK)this.class_[0];
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, false, false, true};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      protected_ = new byte[]{2, 2};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{
         Pattern.compile("(?i)(сололайт|дуолайт|триолайт|кланлайт|лайт120|классик|лобби|sololite|duolite|triolite|clanlite|lite120|classic)(\\d+)", 0)
      };
      break_ = var0;
   }

   private static void private_() {
      case_ = new short[]{0, 1, 7, 7, 0, 1, 0, 1};
   }
}
