package celestial;

import java.util.List;
import java.util.Random;

public abstract class Jt_1 extends kG_2 {
   public static final rCN volatile_ = rCT.return_;
   protected static final rjC_2 final_ = xd_3.class_(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final rjC_2 package_ = xd_3.class_(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final rjC_2 int_ = xd_3.class_(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final rjC_2 new_ = xd_3.class_(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final rjC_2 continue_ = xd_3.class_(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final rjC_2 super_ = xd_3.class_(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final rjC_2 this_ = xd_3.class_(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final rjC_2 else_ = xd_3.class_(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final rjC_2 synchronized_ = xd_3.class_(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final rjC_2 return_ = xd_3.class_(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final rjC_2 public_ = xd_3.class_(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final rjC_2 goto_ = xd_3.class_(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final rjC_2 while_ = xd_3.class_(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final rjC_2 try_ = xd_3.class_(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final rjC_2 instanceof_ = xd_3.class_(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final rjC_2 throw_ = xd_3.class_(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final boolean long_;

   public void byte_(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(true)), 3);
      this.case_(var1, var2, var3);
      var2.finally_().class_(var3, this, this.break_());
   }

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   protected Jt_1(boolean var1, Jq_1 var2) {
      super(var2);
      this.extends_(this.abstract_.break_().class_(p, rpr_3.NORTH).class_(volatile_, Boolean.valueOf(false)).class_(q, rCH.WALL));
      this.long_ = var1;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rpr_3 var5 = var1.byte_(p);
      boolean var6 = var1.byte_(volatile_);
      switch ((rCH)var1.byte_(q)) {
         case FLOOR:
            if (var5.final_() == rpB_2.X) {
               return var6 ? public_ : int_;
            }

            return var6 ? goto_ : new_;
         case WALL:
            switch (var5) {
               case EAST:
                  return var6 ? throw_ : else_;
               case WEST:
                  return var6 ? instanceof_ : this_;
               case SOUTH:
                  return var6 ? try_ : super_;
               case NORTH:
               default:
                  return var6 ? while_ : continue_;
            }
         case CEILING:
         default:
            if (var5.final_() == rpB_2.X) {
               return var6 ? synchronized_ : final_;
            } else {
               return var6 ? return_ : package_;
            }
      }
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_) ? 15 : 0;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.continue_ && this.long_ && !var1.byte_(volatile_)) {
         this.throws_(var1, var2, var3);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, volatile_, q);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.byte_(volatile_)) {
         return ryZ_2.CONSUME;
      } else {
         this.byte_(var1, var2, var3);
         this.class_(var4, var2, var3, true);
         return ryZ_2.class_(var2.continue_);
      }
   }

   protected abstract rqA_2 class_(boolean var1);

   protected void class_(rhd_3 var1, rRg_1 var2, rfH_2 var3, boolean var4) {
      var2.class_(var4 ? var1 : null, var3, this.class_(var4), rqL_2.BLOCKS, 0.3F, var4 ? 0.6F : 0.5F);
   }

   private int break_() {
      return this.long_ ? 30 : 20;
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         if (var1.byte_(volatile_)) {
            this.case_(var1, var2, var3);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_) && private_(var1) == var4 ? 15 : 0;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_)) {
         if (this.long_) {
            this.throws_(var1, var2, var3);
         } else {
            var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(false)), 3);
            this.case_(var1, var2, var3);
            this.class_((rhd_3)null, var2, var3, false);
         }
      }
   }

   private void throws_(xc_3 var1, rYB var2, rfH_2 var3) {
      List var4 = var2.class_(rhm_3.class, var1.finally_(var2, var3).class_().class_(var3));
      boolean var5 = !var4.isEmpty();
      boolean var6 = var1.byte_(volatile_);
      if (var5 != var6) {
         var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(var5)), 3);
         this.case_(var1, var2, var3);
         this.class_((rhd_3)null, var2, var3, var5);
      }

      if (var5) {
         var2.finally_().class_(new rfH_2(var3), this, this.break_());
      }
   }

   private void case_(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.break_(var3, this);
      var2.break_(var3.break_(private_(var1).case_()), this);
   }
}
