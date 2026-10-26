package celestial;

import java.util.List;

public class WG extends JY {
   public static final rCN int_ = rCT.return_;
   private final WM new_;

   protected WG(WM var1, Jq_1 var2) {
      super(var2);
      this.extends_(this.abstract_.break_().class_(int_, Boolean.valueOf(false)));
      this.new_ = var1;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(int_);
   }

   @Override
   protected void class_(rRg_1 var1, rfH_2 var2) {
      if (this.break_ != QP.goto_ && this.break_ != QP.while_) {
         var1.class_((rhd_3)null, var2, rqn_3.xe, rqL_2.BLOCKS, 0.3F, 0.6F);
      } else {
         var1.class_((rhd_3)null, var2, rqn_3.WL, rqL_2.BLOCKS, 0.3F, 0.8F);
      }
   }

   @Override
   protected xc_3 class_(xc_3 var1, int var2) {
      return var1.class_(int_, Boolean.valueOf(var2 > 0));
   }

   @Override
   protected void break_(rRg_1 var1, rfH_2 var2) {
      if (this.break_ != QP.goto_ && this.break_ != QP.while_) {
         var1.class_((rhd_3)null, var2, rqn_3.xU, rqL_2.BLOCKS, 0.3F, 0.5F);
      } else {
         var1.class_((rhd_3)null, var2, rqn_3.WF, rqL_2.BLOCKS, 0.3F, 0.7F);
      }
   }

   @Override
   protected int break_(rYB var1, rfH_2 var2) {
      rfl_3 var3 = package_.class_(var2);
      List var4;
      switch (this.new_) {
         case EVERYTHING:
            var4 = var1.class_((an_3)null, var3);
            break;
         case MOBS:
            var4 = var1.class_(iB_2.class, var3);
            break;
         default:
            return 0;
      }

      if (!var4.isEmpty()) {
         for (an_3 var6 : var4) {
            if (!var6.rB()) {
               return 15;
            }
         }
      }

      return 0;
   }

   @Override
   protected int catch_(xc_3 var1) {
      return var1.byte_(int_) ? 15 : 0;
   }
}
