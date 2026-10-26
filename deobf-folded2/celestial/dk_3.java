package celestial;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class dk_3 extends Jo_1 {
   public static final rCu_1<rCR> id_package = rCT.O;
   public static final rCN id_int = rCT.id_return;

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   public dk_3(Jq_1 var1) {
      super(true, var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_int, Boolean.valueOf(false)).id_class(id_package, rCR.NORTH_SOUTH));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         this.id_class(var2, var3, this.id_class(var1, var2, var3, var5));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      rCR var3 = var1.id_byte(id_package);
      switch (var2) {
         case LEFT_RIGHT:
            switch (var3) {
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               default:
                  return super.id_class(var1, var2);
            }
         case FRONT_BACK:
            switch (var3) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
               case ASCENDING_SOUTH:
               default:
                  break;
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
            }
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_package, id_int);
   }

   protected <T extends rsJ_2> List<T> id_class(rYB var1, rfH_2 var2, Class<T> var3, Predicate<an_3> var4) {
      return var1.id_class(var3, this.id_class(var2), var4);
   }

   private rfl_3 id_class(rfH_2 var1) {
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

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
            }
         case COUNTERCLOCKWISE_90:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_SOUTH:
                  return var1.id_class(id_package, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.id_class(id_package, rCR.NORTH_SOUTH);
            }
         case CLOCKWISE_90:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_SOUTH:
                  return var1.id_class(id_package, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.id_class(id_package, rCR.NORTH_SOUTH);
            }
         default:
            return var1;
      }
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_int) ? 15 : 0;
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      if (this.id_class(var3, var1, var2)) {
         boolean var4 = var3.id_byte(id_int);
         boolean var5 = false;
         List var6 = this.id_class(var1, var2, rsJ_2.class, (Predicate<an_3>)null);
         if (!var6.isEmpty()) {
            var5 = true;
         }

         if (var5 && !var4) {
            xc_3 var7 = var3.id_class(id_int, Boolean.valueOf(true));
            var1.id_class(var2, var7, 3);
            this.id_break(var1, var2, var7, true);
            var1.id_break(var2, this);
            var1.id_break(var2.id_break(), this);
            var1.id_class(var2, var3, var7);
         }

         if (!var5 && var4) {
            xc_3 var8 = var3.id_class(id_int, Boolean.valueOf(false));
            var1.id_class(var2, var8, 3);
            this.id_break(var1, var2, var8, false);
            var1.id_break(var2, this);
            var1.id_break(var2.id_break(), this);
            var1.id_class(var2, var3, var8);
         }

         if (var5) {
            var1.id_finally().id_class(var2, this, 20);
         }

         var1.id_byte(var2, this);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.id_continue && !var1.id_byte(id_int)) {
         this.id_class(var2, var3, var1);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_int)) {
         this.id_class(var2, var3, var1);
      }
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (!var1.id_byte(id_int)) {
         return 0;
      } else {
         return var4 == rpr_3.UP ? 15 : 0;
      }
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      if (var1.id_byte(id_int)) {
         List var4 = this.id_class(var2, var3, rsW_2.class, (Predicate<an_3>)null);
         if (!var4.isEmpty()) {
            return ((rsW_2)var4.get(0)).id_else().id_case();
         }

         List var5 = this.id_class(var2, var3, rsJ_2.class, rpJ_2.id_protected);
         if (!var5.isEmpty()) {
            return rJr_1.id_break((rXu_1)var5.get(0));
         }
      }

      return 0;
   }

   protected void id_break(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      WJ var5 = new WJ(var1, var2, var3);

      for (rfH_2 var7 : var5.id_class()) {
         xc_3 var8 = var1.id_byte(var7);
         var8.id_class(var1, var7, var8.id_break(), var2, false);
      }
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }

   @Override
   public rCZ<rCR> id_implements() {
      return id_package;
   }
}
