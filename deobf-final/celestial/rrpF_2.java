package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class rrpF_2 extends rrTF<FtHelper> {
   private static boolean[] class_;
   private static String[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   private static void byte_() {
      protected_ = new short[]{9, 12, 13, 15, 57};
   }

   public rrpF_2(FtHelper var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAv_1 var1) {
      if (this.continue_().new_()) {
         String var2 = var1.class_();
         Matcher var3 = ((Pattern)rrjb_3.class_[9]).matcher(var2);
         Matcher var4 = ((Pattern)rrjb_3.class_[12]).matcher(var2);
         Matcher var5 = ((Pattern)rrjb_3.class_[13]).matcher(var2);
         Matcher var6 = ((Pattern)rrjb_3.class_[15]).matcher(var2);
         Matcher var7 = null;
         byte var8 = 2;
         if (var3.find()) {
            var7 = var3;
         } else if (var4.find()) {
            var7 = var4;
         } else if (var6.find()) {
            var7 = var6;
            var8 = 1;
         } else if (var5.find()) {
            var7 = var5;
            var8 = 3;
         }

         if (var7 != null) {
            String var9;
            try {
               String var10 = var7.group(var8);
               var9 = var7.group(class_[1]).replace(var10, this.class_(var10));
            } catch (Exception var11) {
               var9 = null;
               var11.printStackTrace();
            }

            if (var9 != null) {
               ((cb_3)import_.class_[57]).case_(var9);
               var1.class_(true);
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1357491186;
   }

   public String class_(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         try {
            Expression var2 = new ExpressionBuilder(var1).build();
            long var3 = (long)var2.evaluate();
            return String.valueOf(var3);
         } catch (Exception var5) {
            throw new IllegalStateException("Ошибка при вычислении");
         }
      } else {
         throw new IllegalStateException("Пустое выражение");
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6853323955941856170L;
   }

   private static void class_() {
      break_ = new String[]{new String("Пустое выражение"), new String("Ошибка при вычислении")};
   }

   private static void break_() {
      class_ = new boolean[]{true, false, true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 55, -46, 93, 94, -115, -102, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void protected_() {
      byte_ = new byte[]{2, 3};
   }
}
