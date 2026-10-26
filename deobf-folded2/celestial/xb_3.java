package celestial;

import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public class xb_3 extends kE_2 implements kx_3 {
   public static final rCu_1<rCp_1> id_volatile = rCT.t;
   public static final rCN id_final = rCT.id_this;
   protected static final rjC_2 id_package = xd_3.id_class(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final rjC_2 id_continue = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final rjC_2 id_super = xd_3.id_class(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final rjC_2 id_this = rjw_3.id_class(id_package, id_int, id_continue);
   protected static final rjC_2 id_else = rjw_3.id_class(id_package, id_new, id_super);
   protected static final rjC_2 id_synchronized = rjw_3.id_class(id_package, id_int, id_new);
   protected static final rjC_2 id_return = rjw_3.id_class(id_package, id_continue, id_super);
   private final rxL_2 id_public;

   public xb_3(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.id_public = var1;
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rCp_1.FOOT).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(p, id_volatile, id_final);
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHJ(this.id_public);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.id_class(var1, var2, var3, var4, var5);
      if (!var1.id_continue) {
         rfH_2 var6 = var2.id_break(var3.id_byte(p));
         var1.id_class(var6, var3.id_class(id_volatile, rCp_1.HEAD), 3);
         var1.id_class(var2, xu_3.id_class);
         var3.id_class(var1, var2, 3);
      }
   }

   private static Optional<rjU_2> id_class(aI_2<?> var0, rRT var1, rfH_2 var2, int[][] var3, boolean var4) {
      rfw_3 var5 = new rfw_3();

      for (int[] var9 : var3) {
         var5.id_class(var2.b_() + var9[0], var2.c_(), var2.d_() + var9[1]);
         rjU_2 var10 = rqI_2.id_class(var0, var1, var5, var4);
         if (var10 != null) {
            return Optional.of(var10);
         }
      }

      return Optional.empty();
   }

   private static Optional<rjU_2> id_class(aI_2<?> var0, rRT var1, rfH_2 var2, rpr_3 var3, rpr_3 var4) {
      int[][] var5 = id_break(var3, var4);
      Optional var6 = id_class(var0, var1, var2, var5, true);
      if (var6.isPresent()) {
         return var6;
      } else {
         rfH_2 var7 = var2.id_break();
         Optional var8 = id_class(var0, var1, var7, var5, true);
         if (var8.isPresent()) {
            return var8;
         } else {
            int[][] var9 = id_class(var3);
            Optional var10 = id_class(var0, var1, var2, var9, true);
            if (var10.isPresent()) {
               return var10;
            } else {
               Optional var11 = id_class(var0, var1, var2, var5, false);
               if (var11.isPresent()) {
                  return var11;
               } else {
                  Optional var12 = id_class(var0, var1, var7, var5, false);
                  return var12.isPresent() ? var12 : id_class(var0, var1, var2, var9, false);
               }
            }
         }
      }
   }

   public static rpr_3 id_class(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      return var2.id_break() instanceof xb_3 ? var2.id_byte(p) : null;
   }

   public static Optional<rjU_2> id_class(aI_2<?> var0, rRT var1, rfH_2 var2, float var3) {
      rpr_3 var4 = var1.id_byte(var2).id_byte(p);
      rpr_3 var5 = var4.id_catch();
      rpr_3 var6 = var5.id_class(var3) ? var5.id_case() : var5;
      if (id_break(var1, var2)) {
         return id_class(var0, var1, var2, var4, var6);
      } else {
         int[][] var7 = id_class(var4, var6);
         Optional var8 = id_class(var0, var1, var2, var7, true);
         return var8.isPresent() ? var8 : id_class(var0, var1, var2, var7, false);
      }
   }

   private static int[][] id_class(rpr_3 var0) {
      return new int[][]{{0, 0}, {-var0.id_implements(), -var0.id_extends()}};
   }

   private static int[][] id_class(rpr_3 var0, rpr_3 var1) {
      return (int[][])ArrayUtils.addAll(id_break(var0, var1), id_class(var0));
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public long id_class(xc_3 var1, rfH_2 var2) {
      rfH_2 var3 = var2.id_class(var1.id_byte(p), var1.id_byte(id_volatile) == rCp_1.HEAD ? 0 : 1);
      return rfU_2.id_byte(var3.b_(), var2.c_(), var3.d_());
   }

   @Override
   public void id_class(rRq_1 var1, an_3 var2) {
      if (var2.PR()) {
         super.id_class(var1, var2);
      } else {
         this.id_class(var2);
      }
   }

   private void id_class(an_3 var1) {
      rjU_2 var2 = var1.rv();
      if (var2.id_byte < 0.0) {
         double var3 = var1 instanceof iB_2 ? 1.0 : 0.8;
         var1.id_catch(var2.id_break, -var2.id_byte * 0.66F * var3, var2.id_protected);
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.CONSUME;
      } else {
         if (var1.id_byte(id_volatile) != rCp_1.HEAD) {
            var3 = var3.id_break(var1.id_byte(p));
            var1 = var2.id_byte(var3);
            if (!var1.id_class(this)) {
               return ryZ_2.CONSUME;
            }
         }

         if (!id_class(var2)) {
            var2.id_class(var3, false);
            rfH_2 var7 = var3.id_break(var1.id_byte(p).id_case());
            if (var2.id_byte(var7).id_class(this)) {
               var2.id_class(var7, false);
            }

            var2.id_class(
               (an_3)null, rye_3.id_class(), (rRQ)null, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0F, true, rRz_1.DESTROY
            );
            return ryZ_2.SUCCESS;
         } else if (var1.id_byte(id_final)) {
            if (!this.id_class(var2, var3)) {
               var4.id_class(new rgn_3("block.minecraft.bed.occupied"), true);
            }

            return ryZ_2.SUCCESS;
         } else {
            var4.id_class(var3).ifLeft(var1x -> {
               if (var1x != null) {
                  var4.id_class(var1x.id_class(), true);
               }
            });
            return ryZ_2.SUCCESS;
         }
      }
   }

   private static rpr_3 id_class(rCp_1 var0, rpr_3 var1) {
      return var0 == rCp_1.FOOT ? var1 : var1.id_case();
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      super.id_class(var1, var2, var3, var4 * 0.5F);
   }

   private boolean id_class(rYB var1, rfH_2 var2) {
      List var3 = var1.id_class(rsq_3.class, new rfl_3(var2), iB_2::Sc);
      if (var3.isEmpty()) {
         return false;
      } else {
         ((rsq_3)var3.get(0)).SQ();
         return true;
      }
   }

   public static boolean id_class(rYB var0) {
      return var0.id_default().id_private();
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rpr_3 var5 = id_private(var1).id_case();
      switch (var5) {
         case NORTH:
            return id_this;
         case SOUTH:
            return id_else;
         case WEST:
            return id_synchronized;
         default:
            return id_return;
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 != id_class(var1.id_byte(id_volatile), var1.id_byte(p))) {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         return var3.id_class(this) && var3.id_byte(id_volatile) != var1.id_byte(id_volatile)
            ? var1.id_class(id_final, var3.id_byte(id_final))
            : xu_3.id_class.id_continue();
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rpr_3 var2 = var1.id_case();
      rfH_2 var3 = var1.id_class();
      rfH_2 var4 = var3.id_break(var2);
      return var1.id_int().id_byte(var4).id_class(var1) ? this.id_continue().id_class(p, var2) : null;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.id_continue && var4.id_implements()) {
         rCp_1 var5 = var3.id_byte(id_volatile);
         if (var5 == rCp_1.FOOT) {
            rfH_2 var6 = var2.id_break(id_class(var5, var3.id_byte(p)));
            xc_3 var7 = var1.id_byte(var6);
            if (var7.id_break() == this && var7.id_byte(id_volatile) == rCp_1.HEAD) {
               var1.id_class(var6, xu_3.id_class.id_continue(), 35);
               var1.id_class(var4, 2001, var6, xd_3.id_finally(var7));
            }
         }
      }

      super.id_class(var1, var2, var3, var4);
   }

   private static boolean id_break(rRq_1 var0, rfH_2 var1) {
      return var0.id_byte(var1.id_break()).id_break() instanceof xb_3;
   }

   private static int[][] id_break(rpr_3 var0, rpr_3 var1) {
      return new int[][]{
         {var1.id_implements(), var1.id_extends()},
         {var1.id_implements() - var0.id_implements(), var1.id_extends() - var0.id_extends()},
         {var1.id_implements() - var0.id_implements() * 2, var1.id_extends() - var0.id_extends() * 2},
         {-var0.id_implements() * 2, -var0.id_extends() * 2},
         {-var1.id_implements() - var0.id_implements() * 2, -var1.id_extends() - var0.id_extends() * 2},
         {-var1.id_implements() - var0.id_implements(), -var1.id_extends() - var0.id_extends()},
         {-var1.id_implements(), -var1.id_extends()},
         {-var1.id_implements() + var0.id_implements(), -var1.id_extends() + var0.id_extends()},
         {var0.id_implements(), var0.id_extends()},
         {var1.id_implements() + var0.id_implements(), var1.id_extends() + var0.id_extends()}
      };
   }

   public rxL_2 id_break() {
      return this.id_public;
   }

   public static ryk_3 id_implements(xc_3 var0) {
      rCp_1 var1 = var0.id_byte(id_volatile);
      return var1 == rCp_1.HEAD ? ryk_3.FIRST : ryk_3.SECOND;
   }

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.DESTROY;
   }

   public static rpr_3 id_private(xc_3 var0) {
      rpr_3 var1 = var0.id_byte(p);
      return var0.id_byte(id_volatile) == rCp_1.HEAD ? var1.id_case() : var1;
   }
}
