package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpN_2 extends rrTF<FtHelper> {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static String[] id_protected;
   public static Object[] id_class;
   private static short[] id_case;

   private static void id_byte() {
      id_break = new boolean[]{true, true, true, false, true};
   }

   public rrpN_2(FtHelper var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, 57, 104, -97, 105, 28, 3, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLh_1 var1) {
      if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] && var1.id_break() == null) {
         String var2 = var1.id_class();
         rgP_2 var3 = var1.id_throws();
         Matcher var4 = ((Pattern)id_class[0]).matcher(var2);
         if (var4.find()) {
            String var5 = null;
            String var6 = null;

            for (rgP_2 var8 : var3.id_protected()) {
               rgy_3 var9 = var8.id_class().id_implements();
               if (var9 != null) {
                  Object var10 = var9.id_break();
                  if (var10 instanceof rgZ_2) {
                     rgZ_2 var11 = (rgZ_2)var10;
                     String var12 = var11.id_byte();
                     Matcher var13 = ((Pattern)id_class[1]).matcher(var12);
                     if (var13.find()) {
                        var5 = var13.group(1);
                     }

                     Matcher var14 = ((Pattern)id_class[2]).matcher(var12);
                     if (var14.find()) {
                        var6 = var14.group(1);
                     }
                  }
               }
            }

            if (var5 == null || var6 == null) {
               return;
            }

            String var15 = id_protected[0];
            if (var6.equalsIgnoreCase("навсегда")) {
               var15 = var15 + " навсегда";
            } else {
               var15 = var15 + " на " + var6.replace(" ", "");
            }

            var15 = var15 + " за \"" + var5 + "\"";
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrFH.id_class(var5, var6));
            var1.id_class(var3.id_case().id_class("забанен", var15, true));
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5812201043160822599L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 995887322;
   }

   private static void id_class() {
      id_case = new short[]{1, 2, 0, 1, 2, 0};
   }

   private static void id_break() {
      id_protected = new String[]{
         new String("забанен"),
         new String("навсегда"),
         new String(" "),
         new String(""),
         new String("забанен"),
         new String("\\[♨] (.+) забанен \\[Подробнее]"),
         new String("Причина: (.+)"),
         new String("Окончание: (.+)")
      };
   }

   private static void id_throws() {
      id_byte = new byte[]{2, 3};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{
         Pattern.compile("\\[♨] (.+) забанен \\[Подробнее]", 0), Pattern.compile("Причина: (.+)"), Pattern.compile("Окончание: (.+)")
      };
      id_class = var0;
   }
}
