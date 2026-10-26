package celestial;

import java.util.List;

public class WG extends JY {
   public static final rCN id_int = rCT.id_return;
   private final WM id_new;

   protected WG(WM var1, Jq_1 var2) {
      super(var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_int, Boolean.valueOf(false)));
      this.id_new = var1;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_int);
   }

   @Override
   protected void id_class(rRg_1 var1, rfH_2 var2) {
      if (this.id_break != QP.id_goto && this.id_break != QP.id_while) {
         var1.id_class((rhd_3)null, var2, rqn_3.xe, rqL_2.BLOCKS, 0.3F, 0.6F);
      } else {
         var1.id_class((rhd_3)null, var2, rqn_3.WL, rqL_2.BLOCKS, 0.3F, 0.8F);
      }
   }

   @Override
   protected xc_3 id_class(xc_3 var1, int var2) {
      return var1.id_class(id_int, Boolean.valueOf(var2 > 0));
   }

   @Override
   protected void id_break(rRg_1 var1, rfH_2 var2) {
      if (this.id_break != QP.id_goto && this.id_break != QP.id_while) {
         var1.id_class((rhd_3)null, var2, rqn_3.xU, rqL_2.BLOCKS, 0.3F, 0.5F);
      } else {
         var1.id_class((rhd_3)null, var2, rqn_3.WF, rqL_2.BLOCKS, 0.3F, 0.7F);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected int id_break(rYB var1, rfH_2 var2) {
      rfl_3 var3 = id_package.id_class(var2);
      List var4;
      switch (this.id_new) {
         case EVERYTHING:
            var4 = var1.id_class((an_3)null, var3);
            break;
         case MOBS:
            var4 = var1.id_class(iB_2.class, var3);
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
   protected int id_catch(xc_3 var1) {
      return var1.id_byte(id_int) ? 15 : 0;
   }
}
