package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjc_3 implements MinecraftAccessor {
   private static short[] class_;
   private static boolean[] break_;
   private static double[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, false, false, true, false, false};
   }

   public static boolean byte_(rfH_2 var0) {
      xd_3 var1 = protected_(var0);
      return var1 != xu_3.Jd && var1 != xu_3.rg ? break_[4] : break_[3];
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -75, -51, 85, -65, -122, -53, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static Stream<rfH_2> class_(Predicate<rfH_2> var0, rrju_3 var1, float var2) {
      Stream var3 = ((gm_3)import_.class_[56])
         .break_((cb_3)import_.class_[57], ((cb_3)import_.class_[57]).rN().class_((double)var2), (var1x, var2x) -> var0.test(var2x))
         .map(var0x -> new rfH_2(var0x.class_()));
      return var1 == (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2] ? var3 : var3.sorted((var1x, var2x) -> {
         double var3x = ((cb_3)import_.class_[57]).byte_(var1x);
         double var5 = ((cb_3)import_.class_[57]).byte_(var2x);
         if (var1 == (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[0]) {
            return Double.compare(var3x, var5);
         } else {
            return var1 == (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[1] ? Double.compare(var5, var3x) : break_[5];
         }
      });
   }

   private static void class_() {
      class_ = new short[]{56, 56, 56, 57, 56, 57, 57, 57, 57, 57, 56, 57, 56, 56, 56, 57, 57, 2, 56, 56, 56, 56, 57, 57, 0, 1};
   }

   public static rfl_3 class_(xc_3 var0, rfH_2 var1) {
      return var0.break_().class_(var0, (gm_3)import_.class_[56], var1, rjm_3.break_()).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7507790185637048206L;
   }

   public static xd_3 class_(int var0, int var1, int var2) {
      return ((gm_3)import_.class_[56]).byte_(new rfH_2(var0, var1, var2)).break_();
   }

   public static boolean class_(float var0) {
      if (((cb_3)import_.class_[57]).re() < 0.0) {
         return false;
      } else {
         rfl_3 var1 = ((cb_3)import_.class_[57]).rN().protected_(0.0, (double)(-var0), 0.0);
         return ((gm_3)import_.class_[56]).a_((cb_3)import_.class_[57], var1);
      }
   }

   public static rjC_2 class_(ryO_2 var0, rfH_2 var1, xc_3 var2, float var3) {
      xd_3 var4 = var2.break_();
      if (var4 instanceof Wp_1 && var0 instanceof ryr_3 var16) {
         return rjw_3.class_(var16.class_(var2, var3));
      } else {
         if (var4 instanceof JI var5 && var0 instanceof rHu_1) {
            rCt_1 var6 = var2.byte_(xt_3.package_);
            rpr_3 var7 = var2.byte_(xt_3.final_);
            rjC_2 var8 = var5.class_(var2, (gm_3)import_.class_[56], var1, rjm_3.break_());
            if (var6 == rCt_1.SINGLE) {
               return var8;
            }

            rpr_3 var9 = var6 == rCt_1.LEFT ? var7.catch_() : var7.private_();
            rfH_2 var10 = var1.break_(var9);
            xc_3 var11 = ((gm_3)import_.class_[56]).byte_(var10);
            xd_3 var12 = var11.break_();
            if (!(var12 instanceof JI)) {
               return var8;
            }

            rCt_1 var13 = var11.byte_(xt_3.package_);
            rpr_3 var14 = var11.byte_(xt_3.final_);
            if (var13 != var6 && var14 == var7) {
               rjC_2 var15 = var12.class_(var11, (gm_3)import_.class_[56], var10, rjm_3.break_());
               return rjw_3.class_(var8, var15.class_((double)var9.implements_(), (double)var9.finally_(), (double)var9.extends_()));
            }

            return var8;
         }

         return var4.class_(var2, (gm_3)import_.class_[56], var1, rjm_3.break_());
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1633726033;
   }

   public static boolean class_(rfH_2 var0) {
      return ((gm_3)import_.class_[56]).byte_(var0).byte_().throws_();
   }

   public static boolean class_(xd_3 var0) {
      return !var0.class_(var0.continue_(), (gm_3)import_.class_[56], ((cb_3)import_.class_[57]).Bs(), rLT.LAND) ? true : break_[1];
   }

   public static boolean break_(float var0) {
      return ((gm_3)import_.class_[56])
         .byte_(new rfH_2(((cb_3)import_.class_[57]).rx(), ((cb_3)import_.class_[57]).re() - (double)var0, ((cb_3)import_.class_[57]).BO()))
         .break_() instanceof dj_3;
   }

   private static void break_() {
      byte_ = new double[3];
   }

   public static rfl_3 break_(rfH_2 var0) {
      return class_(protected_(var0).continue_(), var0);
   }

   public static xd_3 protected_(rfH_2 var0) {
      return ((gm_3)import_.class_[56]).byte_(var0).break_();
   }
}
