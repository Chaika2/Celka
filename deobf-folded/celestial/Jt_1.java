package celestial;

import java.util.List;
import java.util.Random;

public abstract class Jt_1 extends kG_2 {
   public static final rCN id_volatile = rCT.id_return;
   protected static final rjC_2 id_final = xd_3.id_class(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final rjC_2 id_package = xd_3.id_class(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final rjC_2 id_int = xd_3.id_class(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final rjC_2 id_new = xd_3.id_class(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final rjC_2 id_continue = xd_3.id_class(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final rjC_2 id_super = xd_3.id_class(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final rjC_2 id_this = xd_3.id_class(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final rjC_2 id_else = xd_3.id_class(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final rjC_2 id_synchronized = xd_3.id_class(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final rjC_2 id_return = xd_3.id_class(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final rjC_2 id_public = xd_3.id_class(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final rjC_2 id_goto = xd_3.id_class(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final rjC_2 id_while = xd_3.id_class(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final rjC_2 id_try = xd_3.id_class(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final rjC_2 id_instanceof = xd_3.id_class(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final rjC_2 id_throw = xd_3.id_class(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final boolean id_long;

   public void id_byte(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(true)), 3);
      this.id_case(var1, var2, var3);
      var2.id_finally().id_class(var3, this, this.id_break());
   }

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   protected Jt_1(boolean var1, Jq_1 var2) {
      super(var2);
      this.id_extends(this.id_abstract.id_break().id_class(p, rpr_3.NORTH).id_class(id_volatile, Boolean.valueOf(false)).id_class(q, rCH.WALL));
      this.id_long = var1;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rpr_3 var5 = var1.id_byte(p);
      boolean var6 = var1.id_byte(id_volatile);
      switch ((rCH)var1.id_byte(q)) {
         case FLOOR:
            if (var5.id_final() == rpB_2.X) {
               return var6 ? id_public : id_int;
            }

            return var6 ? id_goto : id_new;
         case WALL:
            switch (var5) {
               case EAST:
                  return var6 ? id_throw : id_else;
               case WEST:
                  return var6 ? id_instanceof : id_this;
               case SOUTH:
                  return var6 ? id_try : id_super;
               case NORTH:
               default:
                  return var6 ? id_while : id_continue;
            }
         case CEILING:
         default:
            if (var5.id_final() == rpB_2.X) {
               return var6 ? id_synchronized : id_final;
            } else {
               return var6 ? id_return : id_package;
            }
      }
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile) ? 15 : 0;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.id_continue && this.id_long && !var1.id_byte(id_volatile)) {
         this.id_throws(var1, var2, var3);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(p, id_volatile, q);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.id_byte(id_volatile)) {
         return ryZ_2.CONSUME;
      } else {
         this.id_byte(var1, var2, var3);
         this.id_class(var4, var2, var3, true);
         return ryZ_2.id_class(var2.id_continue);
      }
   }

   protected abstract rqA_2 id_class(boolean var1);

   protected void id_class(rhd_3 var1, rRg_1 var2, rfH_2 var3, boolean var4) {
      var2.id_class(var4 ? var1 : null, var3, this.id_class(var4), rqL_2.BLOCKS, 0.3F, var4 ? 0.6F : 0.5F);
   }

   private int id_break() {
      return this.id_long ? 30 : 20;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         if (var1.id_byte(id_volatile)) {
            this.id_case(var1, var2, var3);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile) && id_private(var1) == var4 ? 15 : 0;
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile)) {
         if (this.id_long) {
            this.id_throws(var1, var2, var3);
         } else {
            var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(false)), 3);
            this.id_case(var1, var2, var3);
            this.id_class((rhd_3)null, var2, var3, false);
         }
      }
   }

   private void id_throws(xc_3 var1, rYB var2, rfH_2 var3) {
      List var4 = var2.id_class(rhm_3.class, var1.id_finally(var2, var3).id_class().id_class(var3));
      boolean var5 = !var4.isEmpty();
      boolean var6 = var1.id_byte(id_volatile);
      if (var5 != var6) {
         var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(var5)), 3);
         this.id_case(var1, var2, var3);
         this.id_class((rhd_3)null, var2, var3, var5);
      }

      if (var5) {
         var2.id_finally().id_class(new rfH_2(var3), this, this.id_break());
      }
   }

   private void id_case(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.id_break(var3, this);
      var2.id_break(var3.id_break(id_private(var1).id_case()), this);
   }
}
