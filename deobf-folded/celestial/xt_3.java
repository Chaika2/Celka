package celestial;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class xt_3 extends JI<rHu_1> implements kd_3 {
   public static final rCc_1 id_final = kE_2.p;
   public static final rCu_1<rCt_1> id_package = rCT.w;
   public static final rCN id_int = rCT.id_throw;
   protected static final rjC_2 id_new = xd_3.id_class(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final rjC_2 id_continue = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final rjC_2 id_this = xd_3.id_class(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final rjC_2 id_else = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ryX_2<rHu_1, Optional<rXu_1>> id_synchronized = new xw_3();
   private static final ryX_2<rHu_1, Optional<rJZ>> id_return = new xI_2();

   protected xt_3(Jq_1 var1, Supplier<ryW_2<? extends rHu_1>> var2) {
      super(var1, var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_final, rpr_3.NORTH).id_class(id_package, rCt_1.SINGLE).id_class(id_int, Boolean.valueOf(false)));
   }

   private static boolean id_class(rRq_1 var0, rfH_2 var1) {
      rfH_2 var2 = var1.id_final();
      return var0.id_byte(var2).id_catch(var0, var2);
   }

   public static boolean id_class(rRg_1 var0, rfH_2 var1) {
      return id_class((rRq_1)var0, var1) || id_break(var0, var1);
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHu_1();
   }

   public static ryX_2<rHu_1, Float2FloatFunction> id_class(rHw_1 var0) {
      return new xj_3(var0);
   }

   @Override
   public rJZ id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      return this.id_class(var1, var2, var3, false).apply(id_return).orElse((rJZ)null);
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   public ryJ_2<? extends rHu_1> id_class(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      BiPredicate var5;
      if (var4) {
         var5 = (var0, var1x) -> false;
      } else {
         var5 = xt_3::id_class;
      }

      return ryh_3.id_class(this.id_volatile.get(), xt_3::id_private, xt_3::id_implements, id_final, var1, var2, var3, var5);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_final, id_package, id_int);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_final)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_final, var2.id_class(var1.id_byte(id_final)));
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHu_1) {
            ((rHu_1)var6).id_class(var5.id_continue());
         }
      }
   }

   private rpr_3 id_class(rxx_3 var1, rpr_3 var2) {
      xc_3 var3 = var1.id_int().id_byte(var1.id_class().id_break(var2));
      return var3.id_class(this) && var3.id_byte(id_package) == rCt_1.SINGLE ? var3.id_byte(id_final) : null;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_int)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      if (var3.id_class(this) && var2.id_final().id_protected()) {
         rCt_1 var7 = var3.id_byte(id_package);
         if (var1.id_byte(id_package) == rCt_1.SINGLE
            && var7 != rCt_1.SINGLE
            && var1.id_byte(id_final) == var3.id_byte(id_final)
            && id_implements(var3) == var2.id_case()) {
            return var1.id_class(id_package, var7.id_break());
         }
      } else if (id_implements(var1) == var2) {
         return var1.id_class(id_package, rCt_1.SINGLE);
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rCt_1 var2 = rCt_1.SINGLE;
      rpr_3 var3 = var1.id_case().id_case();
      rXE var4 = var1.id_int().id_break(var1.id_class());
      boolean var5 = var1.id_catch();
      rpr_3 var6 = var1.id_finally();
      if (var6.id_final().id_protected() && var5) {
         rpr_3 var7 = this.id_class(var1, var6.id_case());
         if (var7 != null && var7.id_final() != var6.id_final()) {
            var3 = var7;
            var2 = var7.id_private() == var6.id_case() ? rCt_1.RIGHT : rCt_1.LEFT;
         }
      }

      if (var2 == rCt_1.SINGLE && !var5) {
         if (var3 == this.id_class(var1, var3.id_catch())) {
            var2 = rCt_1.LEFT;
         } else if (var3 == this.id_class(var1, var3.id_private())) {
            var2 = rCt_1.RIGHT;
         }
      }

      return this.id_continue().id_class(id_final, var3).id_class(id_package, var2).id_class(id_int, Boolean.valueOf(var4.id_class() == rXG.id_byte));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.id_byte(id_package) == rCt_1.SINGLE) {
         return id_else;
      } else {
         switch (id_implements(var1)) {
            case NORTH:
            default:
               return id_new;
            case SOUTH:
               return id_continue;
            case WEST:
               return id_super;
            case EAST:
               return id_this;
         }
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         rJZ var7 = this.id_class(var1, var2, var3);
         if (var7 != null) {
            var4.id_class(var7);
            var4.id_class(this.id_break());
            rbW_2.id_class(var4, true);
         }

         return ryZ_2.CONSUME;
      }
   }

   public static rXu_1 id_class(xt_3 var0, xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      return var0.id_class(var1, var2, var3, var4).apply(id_synchronized).orElse((rXu_1)null);
   }

   protected rCi_1<rqO_2> id_break() {
      return rlB_2.id_implements.id_break(rlB_2.N);
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.id_break(id_class(this, var1, var2, var3, false));
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rXu_1) {
            rXn_1.id_class(var2, var3, (rXu_1)var6);
            var2.id_byte(var3, this);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   private static boolean id_break(rRg_1 var0, rfH_2 var1) {
      List var2 = var0.id_class(
         rbf_3.class,
         new rfl_3((double)var1.b_(), (double)(var1.c_() + 1), (double)var1.d_(), (double)(var1.b_() + 1), (double)(var1.c_() + 2), (double)(var1.d_() + 1))
      );
      if (!var2.isEmpty()) {
         for (rbf_3 var4 : var2) {
            if (var4.Sc()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_int) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }

   public static rpr_3 id_implements(xc_3 var0) {
      rpr_3 var1 = var0.id_byte(id_final);
      return var0.id_byte(id_package) == rCt_1.LEFT ? var1.id_catch() : var1.id_private();
   }

   public static ryk_3 id_private(xc_3 var0) {
      rCt_1 var1 = var0.id_byte(id_package);
      if (var1 == rCt_1.SINGLE) {
         return ryk_3.SINGLE;
      } else {
         return var1 == rCt_1.RIGHT ? ryk_3.FIRST : ryk_3.SECOND;
      }
   }
}
