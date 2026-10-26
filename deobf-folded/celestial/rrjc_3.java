package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjc_3 implements MinecraftAccessor {
   private static short[] id_class;
   private static boolean[] id_break;
   private static double[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{true, false, false, true, false, false};
   }

   public static boolean id_byte(rfH_2 var0) {
      xd_3 var1 = id_protected(var0);
      return var1 != xu_3.Jd && var1 != xu_3.rg ? id_break[4] : true;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -75, -51, 85, -65, -122, -53, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static Stream<rfH_2> id_class(Predicate<rfH_2> var0, rrju_3 var1, float var2) {
      Stream var3 = ((gm_3)id_import.id_class[56])
         .id_break((cb_3)id_import.id_class[57], ((cb_3)id_import.id_class[57]).rN().id_class((double)var2), (var1x, var2x) -> var0.test(var2x))
         .map(var0x -> new rfH_2(var0x.id_class()));
      return var1 == (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[2] ? var3 : var3.sorted((var1x, var2x) -> {
         double var3x = ((cb_3)id_import.id_class[57]).id_byte(var1x);
         double var5 = ((cb_3)id_import.id_class[57]).id_byte(var2x);
         if (var1 == (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_class[24]]) {
            return Double.compare(var3x, var5);
         } else {
            return var1 == (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[1] ? Double.compare(var5, var3x) : id_break[5];
         }
      });
   }

   private static void id_class() {
      id_class = new short[]{56, 56, 56, 57, 56, 57, 57, 57, 57, 57, 56, 57, 56, 56, 56, 57, 57, 2, 56, 56, 56, 56, 57, 57, 0, 1};
   }

   public static rfl_3 id_class(xc_3 var0, rfH_2 var1) {
      return var0.id_break().id_class(var0, (gm_3)id_import.id_class[56], var1, rjm_3.id_break()).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7507790185637048206L;
   }

   public static xd_3 id_class(int var0, int var1, int var2) {
      return ((gm_3)id_import.id_class[56]).id_byte(new rfH_2(var0, var1, var2)).id_break();
   }

   public static boolean id_class(float var0) {
      if (((cb_3)id_import.id_class[57]).re() < id_byte[0]) {
         return id_break[2];
      } else {
         rfl_3 var1 = ((cb_3)id_import.id_class[57]).rN().id_protected(id_byte[1], (double)(-var0), id_byte[2]);
         return ((gm_3)id_import.id_class[56]).a_((cb_3)id_import.id_class[57], var1);
      }
   }

   public static rjC_2 id_class(ryO_2 var0, rfH_2 var1, xc_3 var2, float var3) {
      xd_3 var4 = var2.id_break();
      if (var4 instanceof Wp_1 && var0 instanceof ryr_3 var16) {
         return rjw_3.id_class(var16.id_class(var2, var3));
      } else {
         if (var4 instanceof JI var5 && var0 instanceof rHu_1) {
            rCt_1 var6 = var2.id_byte(xt_3.id_package);
            rpr_3 var7 = var2.id_byte(xt_3.id_final);
            rjC_2 var8 = var5.id_class(var2, (gm_3)id_import.id_class[56], var1, rjm_3.id_break());
            if (var6 == rCt_1.SINGLE) {
               return var8;
            }

            rpr_3 var9 = var6 == rCt_1.LEFT ? var7.id_catch() : var7.id_private();
            rfH_2 var10 = var1.id_break(var9);
            xc_3 var11 = ((gm_3)id_import.id_class[56]).id_byte(var10);
            xd_3 var12 = var11.id_break();
            if (!(var12 instanceof JI)) {
               return var8;
            }

            rCt_1 var13 = var11.id_byte(xt_3.id_package);
            rpr_3 var14 = var11.id_byte(xt_3.id_final);
            if (var13 != var6 && var14 == var7) {
               rjC_2 var15 = var12.id_class(var11, (gm_3)id_import.id_class[56], var10, rjm_3.id_break());
               return rjw_3.id_class(var8, var15.id_class((double)var9.id_implements(), (double)var9.id_finally(), (double)var9.id_extends()));
            }

            return var8;
         }

         return var4.id_class(var2, (gm_3)id_import.id_class[56], var1, rjm_3.id_break());
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1633726033;
   }

   public static boolean id_class(rfH_2 var0) {
      return ((gm_3)id_import.id_class[56]).id_byte(var0).id_byte().id_throws();
   }

   public static boolean id_class(xd_3 var0) {
      return !var0.id_class(var0.id_continue(), (gm_3)id_import.id_class[56], ((cb_3)id_import.id_class[57]).Bs(), rLT.LAND) ? true : id_break[1];
   }

   public static boolean id_break(float var0) {
      return ((gm_3)id_import.id_class[56])
         .id_byte(new rfH_2(((cb_3)id_import.id_class[57]).rx(), ((cb_3)id_import.id_class[57]).re() - (double)var0, ((cb_3)id_import.id_class[57]).BO()))
         .id_break() instanceof dj_3;
   }

   private static void id_break() {
      id_byte = new double[3];
   }

   public static rfl_3 id_break(rfH_2 var0) {
      return id_class(id_protected(var0).id_continue(), var0);
   }

   public static xd_3 id_protected(rfH_2 var0) {
      return ((gm_3)id_import.id_class[56]).id_byte(var0).id_break();
   }
}
