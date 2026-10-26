package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrff_3 implements MinecraftAccessor {
   private static boolean[] class_;
   private static short[] break_;

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, 64, -42, 30, -86, -14, -76, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1748340043;
   }

   public static boolean class_(cG_2 var0) {
      return var0 != (cb_3)import_.class_[57] && !var0.sc() && !((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var0) && var0.Pu()
         ? true
         : class_[4];
   }

   public static boolean class_(an_3 var0) {
      return var0.BC().catch_();
   }

   public static boolean class_(Aw_1 var0) {
      return !var0.class_().equals(((cb_3)import_.class_[57]).sv())
            && !var0.super_()
            && !((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var0)
         ? true
         : class_[6];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1672365906599583753L;
   }

   private static void class_() {
      class_ = new boolean[]{false, true, false, true, false, true, false};
   }

   public static boolean class_(an_3 var0, CheckGroup var1) {
      if (!var1.catch_() && var0.Pp()) {
         return false;
      } else if (var0.BC() == aI_2.short_) {
         return var1.class_();
      } else if (var0.BC() == aI_2.f) {
         return var1.extends_();
      } else {
         if (var0.BC().case_()) {
            if (var0 instanceof cG_2 var2) {
               if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var2)) {
                  return var1.implements_();
               }

               if (var1.throws_()) {
                  if (var2.sc()) {
                     return var1.private_();
                  }

                  if (!rrjZ_2.byte_((iB_2)var2)) {
                     return var1.finally_();
                  }

                  return class_[1];
               }
            } else {
               if (rrjZ_2.class_(var0)) {
                  return var1.break_();
               }

               if (rrjZ_2.break_(var0)) {
                  return var1.case_();
               }
            }
         }

         return class_[2];
      }
   }

   private static void break_() {
      break_ = new short[]{0, 57, 0, 57, 0};
   }
}
