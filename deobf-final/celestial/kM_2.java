package celestial;

import java.util.Map;

public class kM_2 extends xd_3 {
   public static final rCN volatile_ = Wt_1.volatile_;
   public static final rCN final_ = Wt_1.final_;
   public static final rCN package_ = Wt_1.package_;
   public static final rCN int_ = Wt_1.int_;
   public static final rCN new_ = Wt_1.new_;
   public static final rCN continue_ = Wt_1.continue_;
   private static final Map<rpr_3, rCN> super_ = Wt_1.super_;

   public kM_2(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, Boolean.valueOf(true))
            .class_(final_, Boolean.valueOf(true))
            .class_(package_, Boolean.valueOf(true))
            .class_(int_, Boolean.valueOf(true))
            .class_(new_, Boolean.valueOf(true))
            .class_(continue_, Boolean.valueOf(true))
      );
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(super_.get(var2.class_(rpr_3.NORTH)), var1.byte_(volatile_))
         .class_(super_.get(var2.class_(rpr_3.SOUTH)), var1.byte_(package_))
         .class_(super_.get(var2.class_(rpr_3.EAST)), var1.byte_(final_))
         .class_(super_.get(var2.class_(rpr_3.WEST)), var1.byte_(int_))
         .class_(super_.get(var2.class_(rpr_3.UP)), var1.byte_(new_))
         .class_(super_.get(var2.class_(rpr_3.DOWN)), var1.byte_(continue_));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(new_, continue_, volatile_, final_, package_, int_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(super_.get(var2.break_(rpr_3.NORTH)), var1.byte_(volatile_))
         .class_(super_.get(var2.break_(rpr_3.SOUTH)), var1.byte_(package_))
         .class_(super_.get(var2.break_(rpr_3.EAST)), var1.byte_(final_))
         .class_(super_.get(var2.break_(rpr_3.WEST)), var1.byte_(int_))
         .class_(super_.get(var2.break_(rpr_3.UP)), var1.byte_(new_))
         .class_(super_.get(var2.break_(rpr_3.DOWN)), var1.byte_(continue_));
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      return this.continue_()
         .class_(continue_, Boolean.valueOf(this != var2.byte_(var3.break_()).break_()))
         .class_(new_, Boolean.valueOf(this != var2.byte_(var3.final_()).break_()))
         .class_(volatile_, Boolean.valueOf(this != var2.byte_(var3.private_()).break_()))
         .class_(final_, Boolean.valueOf(this != var2.byte_(var3.extends_()).break_()))
         .class_(package_, Boolean.valueOf(this != var2.byte_(var3.protected_()).break_()))
         .class_(int_, Boolean.valueOf(this != var2.byte_(var3.byte_()).break_()));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var3.class_(this) ? var1.class_(super_.get(var2), Boolean.valueOf(false)) : super.class_(var1, var2, var3, var4, var5, var6);
   }
}
