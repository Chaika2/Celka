package celestial;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class zA_2 extends xd_3 {
   public static final rCN volatile_ = rCT.return_;
   public static final rCN final_ = rCT.class_;
   public static final rCN package_ = rCT.protected_;
   public static final rCN int_ = Wt_1.volatile_;
   public static final rCN new_ = Wt_1.final_;
   public static final rCN continue_ = Wt_1.package_;
   public static final rCN super_ = Wt_1.int_;
   private static final Map<rpr_3, rCN> synchronized_ = dV_2.continue_;
   protected static final rjC_2 this_ = xd_3.class_(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final rjC_2 else_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final zC_2 return_;

   public zA_2(zC_2 var1, Jq_1 var2) {
      super(var2);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, Boolean.valueOf(false))
            .class_(final_, Boolean.valueOf(false))
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, Boolean.valueOf(false))
            .class_(continue_, Boolean.valueOf(false))
            .class_(super_, Boolean.valueOf(false))
      );
      this.return_ = var1;
   }

   public boolean class_(xc_3 var1, rpr_3 var2) {
      xd_3 var3 = var1.break_();
      return var3 == this.return_ ? var1.byte_(zC_2.volatile_) == var2.case_() : var3 == this;
   }

   private void class_(rYB var1, rfH_2 var2) {
      xc_3 var3 = var1.byte_(var2);
      boolean var4 = var3.byte_(volatile_);
      boolean var5 = false;
      List var6 = var1.class_((an_3)null, var3.finally_(var1, var2).class_().class_(var2));
      if (!var6.isEmpty()) {
         for (an_3 var8 : var6) {
            if (!var8.rB()) {
               var5 = true;
               break;
            }
         }
      }

      if (var5 != var4) {
         var3 = var3.class_(volatile_, Boolean.valueOf(var5));
         var1.class_(var2, var3, 3);
         this.class_(var1, var2, var3);
      }

      if (var5) {
         var1.finally_().class_(new rfH_2(var2), this, 10);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.continue_ && !var1.byte_(volatile_)) {
         this.class_(var2, var3);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var1.byte_(final_) ? this_ : else_;
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.class_(int_, var1.byte_(continue_))
               .class_(new_, var1.byte_(super_))
               .class_(continue_, var1.byte_(int_))
               .class_(super_, var1.byte_(new_));
         case COUNTERCLOCKWISE_90:
            return var1.class_(int_, var1.byte_(new_))
               .class_(new_, var1.byte_(continue_))
               .class_(continue_, var1.byte_(super_))
               .class_(super_, var1.byte_(int_));
         case CLOCKWISE_90:
            return var1.class_(int_, var1.byte_(super_))
               .class_(new_, var1.byte_(int_))
               .class_(continue_, var1.byte_(new_))
               .class_(super_, var1.byte_(continue_));
         default:
            return var1;
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.class_(int_, var1.byte_(continue_)).class_(continue_, var1.byte_(int_));
         case FRONT_BACK:
            return var1.class_(new_, var1.byte_(super_)).class_(super_, var1.byte_(new_));
         default:
            return super.class_(var1, var2);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_, int_, new_, super_, continue_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      return this.continue_()
         .class_(int_, Boolean.valueOf(this.class_(var2.byte_(var3.private_()), rpr_3.NORTH)))
         .class_(new_, Boolean.valueOf(this.class_(var2.byte_(var3.extends_()), rpr_3.EAST)))
         .class_(continue_, Boolean.valueOf(this.class_(var2.byte_(var3.protected_()), rpr_3.SOUTH)))
         .class_(super_, Boolean.valueOf(this.class_(var2.byte_(var3.byte_()), rpr_3.WEST)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.final_().protected_()
         ? var1.class_(synchronized_.get(var2), Boolean.valueOf(this.class_(var3, var2)))
         : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_())) {
         this.class_(var2, var3, var1);
      }
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      for (rpr_3 var7 : new rpr_3[]{rpr_3.SOUTH, rpr_3.WEST}) {
         for (int var8 = 1; var8 < 42; var8++) {
            rfH_2 var9 = var2.class_(var7, var8);
            xc_3 var10 = var1.byte_(var9);
            if (var10.class_(this.return_)) {
               if (var10.byte_(zC_2.volatile_) == var7.case_()) {
                  this.return_.class_(var1, var9, var10, false, true, var8, var3);
               }
               break;
            }

            if (!var10.class_(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.continue_ && !var4.ss().class_() && var4.ss().break_() == rdy_3.JJ) {
         var1.class_(var2, var3.class_(package_, Boolean.valueOf(true)), 4);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.byte_(var3).byte_(volatile_)) {
         this.class_(var2, var3);
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         this.class_(var2, var3, var1.class_(volatile_, Boolean.valueOf(true)));
      }
   }
}
