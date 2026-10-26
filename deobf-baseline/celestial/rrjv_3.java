package celestial;

import com.mojang.datafixers.DataFixUtils;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjv_3 implements MinecraftAccessor {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 96, -122, -124, 125, -121, 123, 80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 361469838;
   }

   public static rYB id_class() {
      return (rYB)DataFixUtils.orElse(
         Optional.of(id_import.id_this()).flatMap(var0 -> Optional.of(var0.id_class(((gm_3)id_import.id_class[id_class[1]]).E()))),
         (gm_3)id_import.id_class[id_class[0]]
      );
   }

   public static void id_class(rVi_1 var0, rVi_1 var1) {
      Aq_1 var2 = id_import.id_void();
      if (var2 != null) {
         id_class(var2.id_class(), var0, var1);
      }
   }

   public static void id_class(rud_3 var0, rVi_1 var1, rVi_1 var2) {
      if (var0 != null) {
         var0.id_class(var1, var2);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3591937622271078113L;
   }

   private static void id_break() {
      id_class = new short[]{56, 56};
   }
}
