package celestial;

import com.mojang.datafixers.DataFixUtils;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjv_3 implements MinecraftAccessor {
   private static short[] class_;

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 96, -122, -124, 125, -121, 123, 80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 361469838;
   }

   public static rYB class_() {
      return (rYB)DataFixUtils.orElse(
         Optional.of(import_.this_()).flatMap(var0 -> Optional.of(var0.class_(((gm_3)import_.class_[56]).E()))), (gm_3)import_.class_[56]
      );
   }

   public static void class_(rVi_1 var0, rVi_1 var1) {
      Aq_1 var2 = import_.void_();
      if (var2 != null) {
         class_(var2.class_(), var0, var1);
      }
   }

   public static void class_(rud_3 var0, rVi_1 var1, rVi_1 var2) {
      if (var0 != null) {
         var0.class_(var1, var2);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3591937622271078113L;
   }

   private static void break_() {
      class_ = new short[]{56, 56};
   }
}
