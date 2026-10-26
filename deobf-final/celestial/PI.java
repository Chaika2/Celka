package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PI {
   public static Object[] class_;
   private static boolean[] byte_;
   public Object[] break_;
   private static String[] protected_;
   private static byte[] throws_;
   private static short[] case_;

   private static void byte_() {
      case_ = new short[]{0, 3, 0, 1, 0, 1};
   }

   public PI(Pf_1 var1, String var2) {
      this.private_();
      this.break_[0] = var1;
      this.break_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public Pf_1 class_() {
      return (Pf_1)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1157381242;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, 44, -117, 102, 126, -25, 91, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3938501422209975708L;
   }

   public String break_() {
      return (String)this.break_[1];
   }

   public static PI break_(String var0) {
      if (rql_3.break_(var0)) {
         return null;
      } else {
         Matcher var1 = ((Pattern)class_[0]).matcher(var0);
         if (var1.find()) {
            String var2 = var1.group(1);
            String var3 = var1.group(2);

            for (Pf_1 var7 : (Pf_1[])Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[3]) {
               if (var7.class_().equalsIgnoreCase(var2)) {
                  return new PI(var7, var3);
               }
            }
         }

         return null;
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, false, true};
   }

   private static void catch_() {
      throws_ = new byte[]{2, 2};
   }

   private static void case_() {
      protected_ = new String[]{new String("(an|grief|hub)(\\d*)")};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{Pattern.compile("(an|grief|hub)(\\d*)", 0)};
      class_ = var0;
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
