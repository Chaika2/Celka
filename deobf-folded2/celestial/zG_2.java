package celestial;

import java.util.Random;
import java.util.stream.IntStream;

public class zG_2 extends xd_3 implements kd_3 {
   public static final rCc_1 id_volatile = kE_2.p;
   public static final rCu_1<rCj_1> id_final = rCT.b;
   public static final rCu_1<rCK> id_package = rCT.R;
   public static final rCN id_int = rCT.id_throw;
   protected static final rjC_2 id_new = Wg_1.id_int;
   protected static final rjC_2 id_continue = Wg_1.id_package;
   protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final rjC_2 id_else = xd_3.id_class(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final rjC_2 id_synchronized = xd_3.id_class(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final rjC_2 id_return = xd_3.id_class(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final rjC_2 id_public = xd_3.id_class(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final rjC_2 id_goto = xd_3.id_class(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final rjC_2 id_while = xd_3.id_class(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final rjC_2[] id_try = id_class(id_new, id_super, id_return, id_this, id_public);
   protected static final rjC_2[] id_instanceof = id_class(id_continue, id_else, id_goto, id_synchronized, id_while);
   private static final int[] id_throw = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final xd_3 id_long;
   private final xc_3 id_float;

   protected zG_2(xc_3 var1, Jq_1 var2) {
      super(var2);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, rpr_3.NORTH)
            .id_class(id_final, rCj_1.BOTTOM)
            .id_class(id_package, rCK.STRAIGHT)
            .id_class(id_int, Boolean.valueOf(false))
      );
      this.id_long = var1.id_break();
      this.id_float = var1;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_int)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return var2.id_final().id_protected() ? var1.id_class(id_package, id_catch(var1, var4, var5)) : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rpr_3 var2 = var1.id_finally();
      rfH_2 var3 = var1.id_class();
      rXE var4 = var1.id_int().id_break(var3);
      xc_3 var5 = this.id_continue()
         .id_class(id_volatile, var1.id_case())
         .id_class(id_final, var2 == rpr_3.DOWN || var2 != rpr_3.UP && var1.id_extends().id_byte - (double)var3.c_() > 0.5 ? rCj_1.TOP : rCj_1.BOTTOM)
         .id_class(id_int, Boolean.valueOf(var4.id_class() == rXG.id_byte));
      return var5.id_class(id_package, id_catch(var5, var1.id_int(), var3));
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, rRW var3) {
      this.id_long.id_class(var1, var2, var3);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      return this.id_float.id_class(var2, var4, var5, var6);
   }

   private static rjC_2[] id_class(rjC_2 var0, rjC_2 var1, rjC_2 var2, rjC_2 var3, rjC_2 var4) {
      return IntStream.range(0, 16).mapToObj(var5 -> id_class(var5, var0, var1, var2, var3, var4)).toArray(rjC_2[]::new);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_long.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package, id_int);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      rpr_3 var3 = var1.id_byte(id_volatile);
      rCK var4 = var1.id_byte(id_package);
      switch (var2) {
         case LEFT_RIGHT:
            if (var3.id_final() == rpB_2.Z) {
               switch (var4) {
                  case INNER_LEFT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.INNER_RIGHT);
                  case INNER_RIGHT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.INNER_LEFT);
                  case OUTER_LEFT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.OUTER_RIGHT);
                  case OUTER_RIGHT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.OUTER_LEFT);
                  default:
                     return var1.id_class(rqd_3.CLOCKWISE_180);
               }
            }
            break;
         case FRONT_BACK:
            if (var3.id_final() == rpB_2.X) {
               switch (var4) {
                  case INNER_LEFT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.INNER_LEFT);
                  case INNER_RIGHT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.INNER_RIGHT);
                  case OUTER_LEFT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.OUTER_RIGHT);
                  case OUTER_RIGHT:
                     return var1.id_class(rqd_3.CLOCKWISE_180).id_class(id_package, rCK.OUTER_LEFT);
                  case STRAIGHT:
                     return var1.id_class(rqd_3.CLOCKWISE_180);
               }
            }
      }

      return super.id_class(var1, var2);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var1.id_break())) {
         this.id_float.id_class(var2, var3, xu_3.id_class, var3, false);
         this.id_long.id_class(this.id_float, var2, var3, var4, false);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      this.id_float.id_class(var2, var3, var4);
   }

   @Override
   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      super.id_class(var1, var2, var3);
      this.id_long.id_class(var1, var2, var3);
   }

   private static rjC_2 id_class(int var0, rjC_2 var1, rjC_2 var2, rjC_2 var3, rjC_2 var4, rjC_2 var5) {
      rjC_2 var6 = var1;
      if ((var0 & 1) != 0) {
         var6 = rjw_3.id_class(var1, var2);
      }

      if ((var0 & 2) != 0) {
         var6 = rjw_3.id_class(var6, var3);
      }

      if ((var0 & 4) != 0) {
         var6 = rjw_3.id_class(var6, var4);
      }

      if ((var0 & 8) != 0) {
         var6 = rjw_3.id_class(var6, var5);
      }

      return var6;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return (var1.id_byte(id_final) == rCj_1.TOP ? id_try : id_instanceof)[id_throw[this.id_implements(var1)]];
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, an_3 var3) {
      this.id_long.id_class(var1, var2, var3);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      this.id_long.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         this.id_float.id_break(var2, var3, var4, var5);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_long.id_break(var1, var2, var3, var4);
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_int) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }

   private static rCK id_catch(xc_3 var0, rRq_1 var1, rfH_2 var2) {
      rpr_3 var3 = var0.id_byte(id_volatile);
      xc_3 var4 = var1.id_byte(var2.id_break(var3));
      if (id_private(var4) && var0.id_byte(id_final) == var4.id_byte(id_final)) {
         rpr_3 var5 = var4.id_byte(id_volatile);
         if (var5.id_final() != var0.id_byte(id_volatile).id_final() && id_protected(var0, var1, var2, var5.id_case())) {
            if (var5 == var3.id_private()) {
               return rCK.OUTER_LEFT;
            }

            return rCK.OUTER_RIGHT;
         }
      }

      xc_3 var7 = var1.id_byte(var2.id_break(var3.id_case()));
      if (id_private(var7) && var0.id_byte(id_final) == var7.id_byte(id_final)) {
         rpr_3 var6 = var7.id_byte(id_volatile);
         if (var6.id_final() != var0.id_byte(id_volatile).id_final() && id_protected(var0, var1, var2, var6)) {
            if (var6 == var3.id_private()) {
               return rCK.INNER_LEFT;
            }

            return rCK.INNER_RIGHT;
         }
      }

      return rCK.STRAIGHT;
   }

   @Override
   public float id_extends() {
      return this.id_long.id_extends();
   }

   private int id_implements(xc_3 var1) {
      return var1.id_byte(id_package).ordinal() * 4 + var1.id_byte(id_volatile).id_protected();
   }

   private static boolean id_protected(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.id_byte(var2.id_break(var3));
      return !id_private(var4) || var4.id_byte(id_volatile) != var0.id_byte(id_volatile) || var4.id_byte(id_final) != var0.id_byte(id_final);
   }

   public static boolean id_private(xc_3 var0) {
      return var0.id_break() instanceof zG_2;
   }

   @Override
   public boolean a_(xc_3 var1) {
      return this.id_long.a_(var1);
   }
}
