package celestial;

import java.util.List;

public class Ff_1 extends FI {
   private void byte_(int var1) {
      ((Ax_1)import_.class_[55]).class_(var1 > 35 && var1 <= 45 ? var1 - 36 : var1);
   }

   public Ff_1(Fb_1<?> var1, int var2, int var3, int var4, int var5, LL var6) {
      super(var1, var2, var3, var4, var5, new rgn_3("container.action.drop_all"), var6);
   }

   @Override
   public boolean extends_() {
      rJr_1 var1 = this.native_().G_();
      List var2 = var1.class_(null);
      return rrfY_2.class_(var2, false);
   }

   @Override
   public FM implements_() {
      return FM.DROP_ALL;
   }

   @Override
   public void private_() {
      Fb_1 var1 = this.native_();
      if (var1.package_() == this.implements_()) {
         rJr_1 var2 = var1.G_();

         for (int var3 = 0; var3 < var2.extends_().size() && (vm_3)import_.class_[73] == var1; var3++) {
            rJY var4 = ((rJT)((cb_3)import_.class_[57]).implements_[3]).class_(var3);
            if (var4.break_()) {
               if (var3 < 9) {
                  ((Ax_1)import_.class_[55]).class_(var2.case_, var3, 1, rXa_1.THROW, true);
               } else {
                  this.final_();
                  this.byte_(var3);
               }
            }
         }

         this.final_();
         this.byte_(36);
         if (!((cb_3)import_.class_[57]).Sn().class_()) {
            if (!((cb_3)import_.class_[57]).native_()) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.protected_, rpr_3.DOWN));
            }

            this.final_();
            ((Ax_1)import_.class_[55]).class_(var2.case_, 45, 1, rXa_1.THROW, true);
         }

         var1.class_(null);
         var1.class_(null);
      }
   }

   private void final_() {
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.protected_, rpr_3.DOWN));
      ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND, false);
   }
}
