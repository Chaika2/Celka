package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import java.util.Random;

public class Wv_1 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.q;
   private static final ImmutableList<rja_3> id_final = ImmutableList.of(
      new rja_3(0, 0, -1),
      new rja_3(-1, 0, 0),
      new rja_3(0, 0, 1),
      new rja_3(1, 0, 0),
      new rja_3(-1, 0, -1),
      new rja_3(1, 0, -1),
      new rja_3(-1, 0, 1),
      new rja_3(1, 0, 1)
   );
   private static final ImmutableList<rja_3> id_package = new Builder()
      .addAll(id_final)
      .addAll(id_final.stream().map(rja_3::id_catch).iterator())
      .addAll(id_final.stream().map(rja_3::id_implements).iterator())
      .add(new rja_3(0, 1, 0))
      .build();

   private void id_byte(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.id_class(var3, false);
      boolean var4 = rpb_3.HORIZONTAL.id_class().map(var3::id_break).anyMatch(var1x -> id_class(var1x, var2));
      boolean var5 = var4 || var2.id_break(var3.id_final()).id_class(rlG_2.id_break);
      WF var6 = new WF(this, var5);
      var2.id_class((an_3)null, rye_3.id_class(), var6, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0F, true, rRz_1.DESTROY);
   }

   public Wv_1(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.id_protected(var5);
      if (var5 == rpm_3.MAIN_HAND && !id_class(var7) && id_class(var4.id_protected(rpm_3.OFF_HAND))) {
         return ryZ_2.PASS;
      } else if (id_class(var7) && id_private(var1)) {
         id_class(var2, var3, var1);
         if (!((rhx_3)var4.id_implements[18]).id_protected) {
            var7.id_catch(1);
         }

         return ryZ_2.id_class(var2.id_continue);
      } else if (var1.id_byte(id_volatile) == 0) {
         return ryZ_2.PASS;
      } else if (!id_class(var2)) {
         if (!var2.id_continue) {
            this.id_byte(var1, var2, var3);
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         if (!var2.id_continue) {
            rhN_2 var8 = (rhN_2)var4;
            if (var8.E() != var2.E() || !var8.S().equals(var3)) {
               var8.id_class(var2.E(), var3, 0.0F, false, true);
               var2.id_class((rhd_3)null, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, rqn_3.Xy, rqL_2.BLOCKS, 1.0F, 1.0F);
               return ryZ_2.SUCCESS;
            }
         }

         return ryZ_2.CONSUME;
      }
   }

   public static int id_class(xc_3 var0, int var1) {
      return rfU_2.id_protected((float)(var0.id_byte(id_volatile) - 0) / 4.0F * (float)var1);
   }

   public static Optional<rjU_2> id_class(aI_2<?> var0, rRT var1, rfH_2 var2) {
      Optional var3 = id_class(var0, var1, var2, true);
      return var3.isPresent() ? var3 : id_class(var0, var1, var2, false);
   }

   private static Optional<rjU_2> id_class(aI_2<?> var0, rRT var1, rfH_2 var2, boolean var3) {
      rfw_3 var4 = new rfw_3();
      UnmodifiableIterator var5 = id_package.iterator();

      while (var5.hasNext()) {
         rja_3 var6 = (rja_3)var5.next();
         var4.id_class(var2).id_case(var6);
         rjU_2 var7 = rqI_2.id_class(var0, var1, var4, var3);
         if (var7 != null) {
            return Optional.of(var7);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   private static boolean id_class(rfH_2 var0, rYB var1) {
      rXE var2 = var1.id_break(var0);
      if (!var2.id_class(rlG_2.id_break)) {
         return false;
      } else if (var2.id_break()) {
         return true;
      } else {
         float var3 = (float)var2.id_throws();
         if (var3 < 2.0F) {
            return false;
         } else {
            rXE var4 = var1.id_break(var0.id_break());
            return !var4.id_class(rlG_2.id_break);
         }
      }
   }

   private static boolean id_class(rdn_3 var0) {
      return var0.id_break() == rdy_3.Bm;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile) != 0) {
         if (var4.nextInt(100) == 0) {
            var2.id_class((rhd_3)null, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, rqn_3.XC, rqL_2.BLOCKS, 1.0F, 1.0F);
         }

         double var5 = (double)var3.b_() + 0.5 + (0.5 - var4.nextDouble());
         double var7 = (double)var3.c_() + 1.0;
         double var9 = (double)var3.d_() + 0.5 + (0.5 - var4.nextDouble());
         double var11 = (double)var4.nextFloat() * 0.04;
         var2.id_class(rLQ.v, var5, var7, var9, 0.0, var11, 0.0);
      }
   }

   public static void id_class(rYB var0, rfH_2 var1, xc_3 var2) {
      var0.id_class(var1, var2.id_class(id_volatile, Integer.valueOf(var2.id_byte(id_volatile) + 1)), 3);
      var0.id_class((rhd_3)null, (double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, rqn_3.Xl, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   public static boolean id_class(rYB var0) {
      return var0.id_default().id_implements();
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return id_class(var1, 15);
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }

   private static boolean id_private(xc_3 var0) {
      return var0.id_byte(id_volatile) < 4;
   }
}
