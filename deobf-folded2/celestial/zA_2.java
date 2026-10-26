package celestial;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class zA_2 extends xd_3 {
   public static final rCN id_volatile = rCT.id_return;
   public static final rCN id_final = rCT.id_class;
   public static final rCN id_package = rCT.id_protected;
   public static final rCN id_int = Wt_1.id_volatile;
   public static final rCN id_new = Wt_1.id_final;
   public static final rCN id_continue = Wt_1.id_package;
   public static final rCN id_super = Wt_1.id_int;
   private static final Map<rpr_3, rCN> id_synchronized = dV_2.id_continue;
   protected static final rjC_2 id_this = xd_3.id_class(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final zC_2 id_return;

   public zA_2(zC_2 var1, Jq_1 var2) {
      super(var2);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, Boolean.valueOf(false))
            .id_class(id_continue, Boolean.valueOf(false))
            .id_class(id_super, Boolean.valueOf(false))
      );
      this.id_return = var1;
   }

   public boolean id_class(xc_3 var1, rpr_3 var2) {
      xd_3 var3 = var1.id_break();
      return var3 == this.id_return ? var1.id_byte(zC_2.id_volatile) == var2.id_case() : var3 == this;
   }

   private void id_class(rYB var1, rfH_2 var2) {
      xc_3 var3 = var1.id_byte(var2);
      boolean var4 = var3.id_byte(id_volatile);
      boolean var5 = false;
      List var6 = var1.id_class((an_3)null, var3.id_finally(var1, var2).id_class().id_class(var2));
      if (!var6.isEmpty()) {
         for (an_3 var8 : var6) {
            if (!var8.rB()) {
               var5 = true;
               break;
            }
         }
      }

      if (var5 != var4) {
         var3 = var3.id_class(id_volatile, Boolean.valueOf(var5));
         var1.id_class(var2, var3, 3);
         this.id_class(var1, var2, var3);
      }

      if (var5) {
         var1.id_finally().id_class(new rfH_2(var2), this, 10);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.id_continue && !var1.id_byte(id_volatile)) {
         this.id_class(var2, var3);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var1.id_byte(id_final) ? id_this : id_else;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.id_class(id_int, var1.id_byte(id_continue))
               .id_class(id_new, var1.id_byte(id_super))
               .id_class(id_continue, var1.id_byte(id_int))
               .id_class(id_super, var1.id_byte(id_new));
         case COUNTERCLOCKWISE_90:
            return var1.id_class(id_int, var1.id_byte(id_new))
               .id_class(id_new, var1.id_byte(id_continue))
               .id_class(id_continue, var1.id_byte(id_super))
               .id_class(id_super, var1.id_byte(id_int));
         case CLOCKWISE_90:
            return var1.id_class(id_int, var1.id_byte(id_super))
               .id_class(id_new, var1.id_byte(id_int))
               .id_class(id_continue, var1.id_byte(id_new))
               .id_class(id_super, var1.id_byte(id_continue));
         default:
            return var1;
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.id_class(id_int, var1.id_byte(id_continue)).id_class(id_continue, var1.id_byte(id_int));
         case FRONT_BACK:
            return var1.id_class(id_new, var1.id_byte(id_super)).id_class(id_super, var1.id_byte(id_new));
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package, id_int, id_new, id_super, id_continue);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      return this.id_continue()
         .id_class(id_int, Boolean.valueOf(this.id_class(var2.id_byte(var3.id_private()), rpr_3.NORTH)))
         .id_class(id_new, Boolean.valueOf(this.id_class(var2.id_byte(var3.id_extends()), rpr_3.EAST)))
         .id_class(id_continue, Boolean.valueOf(this.id_class(var2.id_byte(var3.id_protected()), rpr_3.SOUTH)))
         .id_class(id_super, Boolean.valueOf(this.id_class(var2.id_byte(var3.id_byte()), rpr_3.WEST)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.id_final().id_protected()
         ? var1.id_class(id_synchronized.get(var2), Boolean.valueOf(this.id_class(var3, var2)))
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         this.id_class(var2, var3, var1);
      }
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      for (rpr_3 var7 : new rpr_3[]{rpr_3.SOUTH, rpr_3.WEST}) {
         for (int var8 = 1; var8 < 42; var8++) {
            rfH_2 var9 = var2.id_class(var7, var8);
            xc_3 var10 = var1.id_byte(var9);
            if (var10.id_class(this.id_return)) {
               if (var10.id_byte(zC_2.id_volatile) == var7.id_case()) {
                  this.id_return.id_class(var1, var9, var10, false, true, var8, var3);
               }
               break;
            }

            if (!var10.id_class(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.id_continue && !var4.ss().id_class() && var4.ss().id_break() == rdy_3.JJ) {
         var1.id_class(var2, var3.id_class(id_package, Boolean.valueOf(true)), 4);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_byte(var3).id_byte(id_volatile)) {
         this.id_class(var2, var3);
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         this.id_class(var2, var3, var1.id_class(id_volatile, Boolean.valueOf(true)));
      }
   }
}
