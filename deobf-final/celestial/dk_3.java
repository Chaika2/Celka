package celestial;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class dk_3 extends Jo_1 {
   public static final rCu_1<rCR> package_ = rCT.O;
   public static final rCN int_ = rCT.return_;

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   public dk_3(Jq_1 var1) {
      super(true, var1);
      this.extends_(this.abstract_.break_().class_(int_, Boolean.valueOf(false)).class_(package_, rCR.NORTH_SOUTH));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_())) {
         this.class_(var2, var3, this.class_(var1, var2, var3, var5));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      rCR var3 = var1.byte_(package_);
      switch (var2) {
         case LEFT_RIGHT:
            switch (var3) {
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               default:
                  return super.class_(var1, var2);
            }
         case FRONT_BACK:
            switch (var3) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
               case ASCENDING_SOUTH:
               default:
                  break;
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
            }
         default:
            return super.class_(var1, var2);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(package_, int_);
   }

   protected <T extends rsJ_2> List<T> class_(rYB var1, rfH_2 var2, Class<T> var3, Predicate<an_3> var4) {
      return var1.class_(var3, this.class_(var2), var4);
   }

   private rfl_3 class_(rfH_2 var1) {
      double var2 = 0.2;
      return new rfl_3(
         (double)var1.b_() + 0.2,
         (double)var1.c_(),
         (double)var1.d_() + 0.2,
         (double)(var1.b_() + 1) - 0.2,
         (double)(var1.c_() + 1) - 0.2,
         (double)(var1.d_() + 1) - 0.2
      );
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
            }
         case COUNTERCLOCKWISE_90:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_SOUTH:
                  return var1.class_(package_, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.class_(package_, rCR.NORTH_SOUTH);
            }
         case CLOCKWISE_90:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_SOUTH:
                  return var1.class_(package_, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.class_(package_, rCR.NORTH_SOUTH);
            }
         default:
            return var1;
      }
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(int_) ? 15 : 0;
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      if (this.class_(var3, var1, var2)) {
         boolean var4 = var3.byte_(int_);
         boolean var5 = false;
         List var6 = this.class_(var1, var2, rsJ_2.class, (Predicate<an_3>)null);
         if (!var6.isEmpty()) {
            var5 = true;
         }

         if (var5 && !var4) {
            xc_3 var7 = var3.class_(int_, Boolean.valueOf(true));
            var1.class_(var2, var7, 3);
            this.break_(var1, var2, var7, true);
            var1.break_(var2, this);
            var1.break_(var2.break_(), this);
            var1.class_(var2, var3, var7);
         }

         if (!var5 && var4) {
            xc_3 var8 = var3.class_(int_, Boolean.valueOf(false));
            var1.class_(var2, var8, 3);
            this.break_(var1, var2, var8, false);
            var1.break_(var2, this);
            var1.break_(var2.break_(), this);
            var1.class_(var2, var3, var8);
         }

         if (var5) {
            var1.finally_().class_(var2, this, 20);
         }

         var1.byte_(var2, this);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.continue_ && !var1.byte_(int_)) {
         this.class_(var2, var3, var1);
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(int_)) {
         this.class_(var2, var3, var1);
      }
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (!var1.byte_(int_)) {
         return 0;
      } else {
         return var4 == rpr_3.UP ? 15 : 0;
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      if (var1.byte_(int_)) {
         List var4 = this.class_(var2, var3, rsW_2.class, (Predicate<an_3>)null);
         if (!var4.isEmpty()) {
            return ((rsW_2)var4.get(0)).else_().case_();
         }

         List var5 = this.class_(var2, var3, rsJ_2.class, rpJ_2.protected_);
         if (!var5.isEmpty()) {
            return rJr_1.break_((rXu_1)var5.get(0));
         }
      }

      return 0;
   }

   protected void break_(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      WJ var5 = new WJ(var1, var2, var3);

      for (rfH_2 var7 : var5.class_()) {
         xc_3 var8 = var1.byte_(var7);
         var8.class_(var1, var7, var8.break_(), var2, false);
      }
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }

   @Override
   public rCZ<rCR> implements_() {
      return package_;
   }
}
