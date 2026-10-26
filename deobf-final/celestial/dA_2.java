package celestial;

import com.google.common.base.Predicates;

public class dA_2 extends xd_3 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCN final_ = rCT.private_;
   protected static final rjC_2 package_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final rjC_2 int_ = xd_3.class_(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final rjC_2 new_ = rjw_3.class_(package_, int_);
   private static Qh_1 continue_;

   public dA_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.case_().case_()).class_(final_, Boolean.valueOf(false));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var1.byte_(final_) ? new_ : package_;
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }

   public static Qh_1 break_() {
      if (continue_ == null) {
         continue_ = Qx_1.class_()
            .class_("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .class_('?', ryw_3.class_(Qd_1.class_))
            .class_('^', ryw_3.class_(Qd_1.class_(xu_3.SO).class_(final_, Predicates.equalTo(true)).class_(volatile_, Predicates.equalTo(rpr_3.SOUTH))))
            .class_('>', ryw_3.class_(Qd_1.class_(xu_3.SO).class_(final_, Predicates.equalTo(true)).class_(volatile_, Predicates.equalTo(rpr_3.WEST))))
            .class_('v', ryw_3.class_(Qd_1.class_(xu_3.SO).class_(final_, Predicates.equalTo(true)).class_(volatile_, Predicates.equalTo(rpr_3.NORTH))))
            .class_('<', ryw_3.class_(Qd_1.class_(xu_3.SO).class_(final_, Predicates.equalTo(true)).class_(volatile_, Predicates.equalTo(rpr_3.EAST))))
            .break_();
      }

      return continue_;
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.byte_(final_) ? 15 : 0;
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
