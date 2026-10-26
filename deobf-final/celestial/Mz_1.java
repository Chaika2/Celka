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
   private static byte[] byte_;
   private static short[] protected_;
   public static Object[] class_;
   public Object[] break_;
   private static boolean[] throws_;
   private static String[] case_;

   xc_3 byte_() {
      if ((xc_3)this.break_[2] == null) {
         xd_3 var1 = rVL.strictfp_.class_((rqO_2)this.break_[0]);
         xc_3 var6 = var1.continue_();
         this.break_[2] = var6;
         ((Map)this.break_[1]).keySet().stream().sorted(String::compareTo).forEachOrdered(var2 -> {
            rCZ var3 = var1.new_().class_(var2);
            if (var3 != null) {
               xc_3 var8 = class_((xc_3)this.break_[2], var3, (String)((Map)this.break_[1]).get(var2));
               this.break_[2] = var8;
            }
         });
      }

      return (xc_3)this.break_[2];
   }

   private Mz_1(rqO_2 var1, Map<String, String> var2) {
      this.throws_();
      this.break_[0] = var1;
      this.break_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2826839350835072058L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 51, 31, 17, -52, -21, 110, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -498277741;
   }

   private static void class_() {
      case_ = new String[]{
         new String("location"),
         new String("properties"),
         new String(","),
         new String("="),
         new String("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?")
      };
   }

   private static <T extends Comparable<T>> xc_3 class_(xc_3 var0, rCZ<T> var1, String var2) {
      Optional var3 = var1.break_(var2);
      if (var3.isPresent()) {
         return var0.class_(var1, (Comparable)var3.get());
      } else {
         throw new IllegalArgumentException("Invalid value for property " + var1);
      }
   }

   private static void break_() {
      byte_ = new byte[]{3};
   }

   static Mz_1 break_(String var0) {
      Matcher var1 = ((Pattern)class_[0]).matcher(var0);
      if (!var1.matches()) {
         return null;
      } else {
         try {
            String var2 = var1.group(case_[0]);
            String var3 = var1.group(case_[1]);
            rqO_2 var4 = new rqO_2(var2);
            HashMap var5 = new HashMap();
            if (var3 != null) {
               String[] var6 = var3.split(case_[2]);
               int var7 = var6.length;

               for (int var8 = throws_[0]; var8 < var7; var8++) {
                  String var9 = var6[var8];
                  String[] var10 = var9.split(case_[3]);
                  var5.put(var10[throws_[1]], var10[throws_[2]]);
               }
            }

            return new Mz_1(var4, var5);
         } catch (Exception var11) {
            var11.printStackTrace();
            return null;
         }
      }
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      throws_ = new boolean[]{false, false, true, false, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{Pattern.compile("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?", 0)};
      class_ = var0;
   }

   private static void protected_() {
      protected_ = new short[]{0, 1, 2, 0, 2, 1, 2, 0, 2, 1, 2};
   }
}
