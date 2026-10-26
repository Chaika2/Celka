package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfV_2 implements MinecraftAccessor {
   private static short[] class_;

   static {
      ntfClinit();
   }

   public static void class_(ruS_2<?> var0) {
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(var0);
   }

   private static void class_() {
      class_ = new short[]{57, 0, 57, 57, 57, 0};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1990836947;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -68, -104, -97, -72, 121, 60, -54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5436583410470660470L;
   }

   public static Aw_1 class_(rgP_2 var0, String var1) {
      if (!var1.isEmpty() && !(var0 instanceof rVe_1)) {
         if ((cb_3)import_.class_[57] != null && import_.void_() != null) {
            GameProfile var2 = ((cb_3)import_.class_[57]).sv();

            for (Aw_1 var4 : ((Aq_1)((cb_3)import_.class_[57]).break_[0]).throws_()) {
               if (!var4.class_().equals(var2) && var1.contains(rql_3.class_(var4.class_().getName()))) {
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
