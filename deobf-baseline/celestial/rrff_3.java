package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrff_3 implements MinecraftAccessor {
   private static boolean[] id_class;
   private static short[] id_break;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, 64, -42, 30, -86, -14, -76, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1748340043;
   }

   public static boolean id_class(cG_2 var0) {
      return var0 != (cb_3)id_import.id_class[id_break[1]]
            && !var0.sc()
            && !((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[2]]).id_class(var0)
            && var0.Pu()
         ? id_class[3]
         : id_class[4];
   }

   public static boolean id_class(an_3 var0) {
      return var0.BC().id_catch();
   }

   public static boolean id_class(Aw_1 var0) {
      return !var0.id_class().equals(((cb_3)id_import.id_class[id_break[3]]).sv())
            && !var0.id_super()
            && !((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[4]]).id_class(var0)
         ? id_class[5]
         : id_class[6];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1672365906599583753L;
   }

   private static void id_class() {
      id_class = new boolean[]{false, true, false, true, false, true, false};
   }

   public static boolean id_class(an_3 var0, CheckGroup var1) {
      if (!var1.id_catch() && var0.Pp()) {
         return id_class[0];
      } else if (var0.BC() == aI_2.id_short) {
         return var1.id_class();
      } else if (var0.BC() == aI_2.f) {
         return var1.id_extends();
      } else {
         if (var0.BC().id_case()) {
            if (var0 instanceof cG_2 var2) {
               if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[0]]).id_class(var2)) {
                  return var1.id_implements();
               }

               if (var1.id_throws()) {
                  if (var2.sc()) {
                     return var1.id_private();
                  }

                  if (!rrjZ_2.id_byte((iB_2)var2)) {
                     return var1.id_finally();
                  }

                  return id_class[1];
               }
            } else {
               if (rrjZ_2.id_class(var0)) {
                  return var1.id_break();
               }

               if (rrjZ_2.id_break(var0)) {
                  return var1.id_case();
               }
            }
         }

         return id_class[2];
      }
   }

   private static void id_break() {
      id_break = new short[]{0, 57, 0, 57, 0};
   }
}
