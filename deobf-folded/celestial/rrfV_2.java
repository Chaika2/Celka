package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfV_2 implements MinecraftAccessor {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   public static void id_class(ruS_2<?> var0) {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_class[1]]).id_break(var0);
   }

   private static void id_class() {
      id_class = new short[]{57, 0, 57, 57, 57, 0};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1990836947;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -68, -104, -97, -72, 121, 60, -54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5436583410470660470L;
   }

   public static Aw_1 id_class(rgP_2 var0, String var1) {
      if (!var1.isEmpty() && !(var0 instanceof rVe_1)) {
         if ((cb_3)id_import.id_class[57] != null && id_import.id_void() != null) {
            GameProfile var2 = ((cb_3)id_import.id_class[57]).sv();

            for (Aw_1 var4 : ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_class[5]]).id_throws()) {
               if (!var4.id_class().equals(var2) && var1.contains(rql_3.id_class(var4.id_class().getName()))) {
                  return var4;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
