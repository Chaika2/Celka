package celestial;

import java.util.List;

public class Ff_1 extends FI {
   private void id_byte(int var1) {
      ((Ax_1)id_import.id_class[55]).id_class(var1 > 35 && var1 <= 45 ? var1 - 36 : var1);
   }

   public Ff_1(Fb_1<?> var1, int var2, int var3, int var4, int var5, LL var6) {
      super(var1, var2, var3, var4, var5, new rgn_3("container.action.drop_all"), var6);
   }

   @Override
   public boolean id_extends() {
      rJr_1 var1 = this.id_native().G_();
      List var2 = var1.id_class(null);
      return rrfY_2.id_class(var2, false);
   }

   @Override
   public FM id_implements() {
      return FM.DROP_ALL;
   }

   @Override
   public void id_private() {
      Fb_1 var1 = this.id_native();
      if (var1.id_package() == this.id_implements()) {
         rJr_1 var2 = var1.G_();

         for (int var3 = 0; var3 < var2.id_extends().size() && (vm_3)id_import.id_class[73] == var1; var3++) {
            rJY var4 = ((rJT)((cb_3)id_import.id_class[57]).id_implements[3]).id_class(var3);
            if (var4.id_break()) {
               if (var3 < 9) {
                  ((Ax_1)id_import.id_class[55]).id_class(var2.id_case, var3, 1, rXa_1.THROW, true);
               } else {
                  this.id_final();
                  this.id_byte(var3);
               }
            }
         }

         this.id_final();
         this.id_byte(36);
         if (!((cb_3)id_import.id_class[57]).Sn().id_class()) {
            if (!((cb_3)id_import.id_class[57]).id_native()) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.id_protected, rpr_3.DOWN));
            }

            this.id_final();
            ((Ax_1)id_import.id_class[55]).id_class(var2.id_case, 45, 1, rXa_1.THROW, true);
         }

         var1.id_class(null);
         var1.id_class(null);
      }
   }

   private void id_final() {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.id_protected, rpr_3.DOWN));
      ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND, false);
   }
}
