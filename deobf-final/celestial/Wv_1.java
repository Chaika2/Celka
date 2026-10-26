package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import java.util.Random;

public class Wv_1 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.q;
   private static final ImmutableList<rja_3> final_ = ImmutableList.of(
      new rja_3(0, 0, -1),
      new rja_3(-1, 0, 0),
      new rja_3(0, 0, 1),
      new rja_3(1, 0, 0),
      new rja_3(-1, 0, -1),
      new rja_3(1, 0, -1),
      new rja_3(-1, 0, 1),
      new rja_3(1, 0, 1)
   );
   private static final ImmutableList<rja_3> package_ = new Builder()
      .addAll(final_)
      .addAll(final_.stream().map(rja_3::catch_).iterator())
      .addAll(final_.stream().map(rja_3::implements_).iterator())
      .add(new rja_3(0, 1, 0))
      .build();

   private void byte_(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.class_(var3, false);
      boolean var4 = rpb_3.HORIZONTAL.class_().map(var3::break_).anyMatch(var1x -> class_(var1x, var2));
      boolean var5 = var4 || var2.break_(var3.final_()).class_(rlG_2.break_);
      WF var6 = new WF(this, var5);
      var2.class_((an_3)null, rye_3.class_(), var6, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0F, true, rRz_1.DESTROY);
   }

   public Wv_1(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.protected_(var5);
      if (var5 == rpm_3.MAIN_HAND && !class_(var7) && class_(var4.protected_(rpm_3.OFF_HAND))) {
         return ryZ_2.PASS;
      } else if (class_(var7) && private_(var1)) {
         class_(var2, var3, var1);
         if (!((rhx_3)var4.implements_[18]).protected_) {
            var7.catch_(1);
         }

         return ryZ_2.class_(var2.continue_);
      } else if (var1.byte_(volatile_) == 0) {
         return ryZ_2.PASS;
      } else if (!class_(var2)) {
         if (!var2.continue_) {
            this.byte_(var1, var2, var3);
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         if (!var2.continue_) {
            rhN_2 var8 = (rhN_2)var4;
            if (var8.E() != var2.E() || !var8.S().equals(var3)) {
               var8.class_(var2.E(), var3, 0.0F, false, true);
               var2.class_((rhd_3)null, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, rqn_3.Xy, rqL_2.BLOCKS, 1.0F, 1.0F);
               return ryZ_2.SUCCESS;
            }
         }

         return ryZ_2.CONSUME;
      }
   }

   public static int class_(xc_3 var0, int var1) {
      return rfU_2.protected_((float)(var0.byte_(volatile_) - 0) / 4.0F * (float)var1);
   }

   public static Optional<rjU_2> class_(aI_2<?> var0, rRT var1, rfH_2 var2) {
      Optional var3 = class_(var0, var1, var2, true);
      return var3.isPresent() ? var3 : class_(var0, var1, var2, false);
   }

   private static Optional<rjU_2> class_(aI_2<?> var0, rRT var1, rfH_2 var2, boolean var3) {
      rfw_3 var4 = new rfw_3();
      UnmodifiableIterator var5 = package_.iterator();

      while (var5.hasNext()) {
         rja_3 var6 = (rja_3)var5.next();
         var4.class_(var2).case_(var6);
         rjU_2 var7 = rqI_2.class_(var0, var1, var4, var3);
         if (var7 != null) {
            return Optional.of(var7);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   private static boolean class_(rfH_2 var0, rYB var1) {
      rXE var2 = var1.break_(var0);
      if (!var2.class_(rlG_2.break_)) {
         return false;
      } else if (var2.break_()) {
         return true;
      } else {
         float var3 = (float)var2.throws_();
         if (var3 < 2.0F) {
            return false;
         } else {
            rXE var4 = var1.break_(var0.break_());
            return !var4.class_(rlG_2.break_);
         }
      }
   }

   private static boolean class_(rdn_3 var0) {
      return var0.break_() == rdy_3.Bm;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_) != 0) {
         if (var4.nextInt(100) == 0) {
            var2.class_((rhd_3)null, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, rqn_3.XC, rqL_2.BLOCKS, 1.0F, 1.0F);
         }

         double var5 = (double)var3.b_() + 0.5 + (0.5 - var4.nextDouble());
         double var7 = (double)var3.c_() + 1.0;
         double var9 = (double)var3.d_() + 0.5 + (0.5 - var4.nextDouble());
         double var11 = (double)var4.nextFloat() * 0.04;
         var2.class_(rLQ.v, var5, var7, var9, 0.0, var11, 0.0);
      }
   }

   public static void class_(rYB var0, rfH_2 var1, xc_3 var2) {
      var0.class_(var1, var2.class_(volatile_, Integer.valueOf(var2.byte_(volatile_) + 1)), 3);
      var0.class_((rhd_3)null, (double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, rqn_3.Xl, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   public static boolean class_(rYB var0) {
      return var0.default_().implements_();
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return class_(var1, 15);
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }

   private static boolean private_(xc_3 var0) {
      return var0.byte_(volatile_) < 4;
   }
}
