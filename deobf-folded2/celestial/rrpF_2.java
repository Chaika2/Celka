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
   private static boolean[] id_class;
   private static String[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_protected = new short[]{9, 12, 13, 15, 57};
   }

   public rrpF_2(FtHelper var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAv_1 var1) {
      if (this.id_continue().id_new()) {
         String var2 = var1.id_class();
         Matcher var3 = ((Pattern)rrjb_3.id_class[9]).matcher(var2);
         Matcher var4 = ((Pattern)rrjb_3.id_class[12]).matcher(var2);
         Matcher var5 = ((Pattern)rrjb_3.id_class[13]).matcher(var2);
         Matcher var6 = ((Pattern)rrjb_3.id_class[15]).matcher(var2);
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
               var9 = var7.group(id_class[1]).replace(var10, this.id_class(var10));
            } catch (Exception var11) {
               var9 = null;
               var11.printStackTrace();
            }

            if (var9 != null) {
               ((cb_3)id_import.id_class[57]).id_case(var9);
               var1.id_class(true);
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1357491186;
   }

   public String id_class(String var1) {
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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6853323955941856170L;
   }

   private static void id_class() {
      id_break = new String[]{new String("Пустое выражение"), new String("Ошибка при вычислении")};
   }

   private static void id_break() {
      id_class = new boolean[]{true, false, true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 55, -46, 93, 94, -115, -102, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_protected() {
      id_byte = new byte[]{2, 3};
   }
}
