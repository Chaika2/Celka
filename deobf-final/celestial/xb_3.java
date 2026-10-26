package celestial;

import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public class xb_3 extends kE_2 implements kx_3 {
   public static final rCu_1<rCp_1> volatile_ = rCT.t;
   public static final rCN final_ = rCT.this_;
   protected static final rjC_2 package_ = xd_3.class_(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   protected static final rjC_2 int_ = xd_3.class_(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final rjC_2 new_ = xd_3.class_(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final rjC_2 continue_ = xd_3.class_(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final rjC_2 super_ = xd_3.class_(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final rjC_2 this_ = rjw_3.class_(package_, int_, continue_);
   protected static final rjC_2 else_ = rjw_3.class_(package_, new_, super_);
   protected static final rjC_2 synchronized_ = rjw_3.class_(package_, int_, new_);
   protected static final rjC_2 return_ = rjw_3.class_(package_, continue_, super_);
   private final rxL_2 public_;

   public xb_3(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.public_ = var1;
      this.extends_(this.abstract_.break_().class_(volatile_, rCp_1.FOOT).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, volatile_, final_);
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHJ(this.public_);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.class_(var1, var2, var3, var4, var5);
      if (!var1.continue_) {
         rfH_2 var6 = var2.break_(var3.byte_(p));
         var1.class_(var6, var3.class_(volatile_, rCp_1.HEAD), 3);
         var1.class_(var2, xu_3.class_);
         var3.class_(var1, var2, 3);
      }
   }

   private static Optional<rjU_2> class_(aI_2<?> var0, rRT var1, rfH_2 var2, int[][] var3, boolean var4) {
      rfw_3 var5 = new rfw_3();

      for (int[] var9 : var3) {
         var5.class_(var2.b_() + var9[0], var2.c_(), var2.d_() + var9[1]);
         rjU_2 var10 = rqI_2.class_(var0, var1, var5, var4);
         if (var10 != null) {
            return Optional.of(var10);
         }
      }

      return Optional.empty();
   }

   private static Optional<rjU_2> class_(aI_2<?> var0, rRT var1, rfH_2 var2, rpr_3 var3, rpr_3 var4) {
      int[][] var5 = break_(var3, var4);
      Optional var6 = class_(var0, var1, var2, var5, true);
      if (var6.isPresent()) {
         return var6;
      } else {
         rfH_2 var7 = var2.break_();
         Optional var8 = class_(var0, var1, var7, var5, true);
         if (var8.isPresent()) {
            return var8;
         } else {
            int[][] var9 = class_(var3);
            Optional var10 = class_(var0, var1, var2, var9, true);
            if (var10.isPresent()) {
               return var10;
            } else {
               Optional var11 = class_(var0, var1, var2, var5, false);
               if (var11.isPresent()) {
                  return var11;
               } else {
                  Optional var12 = class_(var0, var1, var7, var5, false);
                  return var12.isPresent() ? var12 : class_(var0, var1, var2, var9, false);
               }
            }
         }
      }
   }

   public static rpr_3 class_(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      return var2.break_() instanceof xb_3 ? var2.byte_(p) : null;
   }

   public static Optional<rjU_2> class_(aI_2<?> var0, rRT var1, rfH_2 var2, float var3) {
      rpr_3 var4 = var1.byte_(var2).byte_(p);
      rpr_3 var5 = var4.catch_();
      rpr_3 var6 = var5.class_(var3) ? var5.case_() : var5;
      if (break_(var1, var2)) {
         return class_(var0, var1, var2, var4, var6);
      } else {
         int[][] var7 = class_(var4, var6);
         Optional var8 = class_(var0, var1, var2, var7, true);
         return var8.isPresent() ? var8 : class_(var0, var1, var2, var7, false);
      }
   }

   private static int[][] class_(rpr_3 var0) {
      return new int[][]{{0, 0}, {-var0.implements_(), -var0.extends_()}};
   }

   private static int[][] class_(rpr_3 var0, rpr_3 var1) {
      return (int[][])ArrayUtils.addAll(break_(var0, var1), class_(var0));
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public long class_(xc_3 var1, rfH_2 var2) {
      rfH_2 var3 = var2.class_(var1.byte_(p), var1.byte_(volatile_) == rCp_1.HEAD ? 0 : 1);
      return rfU_2.byte_(var3.b_(), var2.c_(), var3.d_());
   }

   @Override
   public void class_(rRq_1 var1, an_3 var2) {
      if (var2.PR()) {
         super.class_(var1, var2);
      } else {
         this.class_(var2);
      }
   }

   private void class_(an_3 var1) {
      rjU_2 var2 = var1.rv();
      if (var2.byte_ < 0.0) {
         double var3 = var1 instanceof iB_2 ? 1.0 : 0.8;
         var1.catch_(var2.break_, -var2.byte_ * 0.66F * var3, var2.protected_);
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.CONSUME;
      } else {
         if (var1.byte_(volatile_) != rCp_1.HEAD) {
            var3 = var3.break_(var1.byte_(p));
            var1 = var2.byte_(var3);
            if (!var1.class_(this)) {
               return ryZ_2.CONSUME;
            }
         }

         if (!class_(var2)) {
            var2.class_(var3, false);
            rfH_2 var7 = var3.break_(var1.byte_(p).case_());
            if (var2.byte_(var7).class_(this)) {
               var2.class_(var7, false);
            }

            var2.class_(
               (an_3)null, rye_3.class_(), (rRQ)null, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0F, true, rRz_1.DESTROY
            );
            return ryZ_2.SUCCESS;
         } else if (var1.byte_(final_)) {
            if (!this.class_(var2, var3)) {
               var4.class_(new rgn_3("block.minecraft.bed.occupied"), true);
            }

            return ryZ_2.SUCCESS;
         } else {
            var4.class_(var3).ifLeft(var1x -> {
               if (var1x != null) {
                  var4.class_(var1x.class_(), true);
               }
            });
            return ryZ_2.SUCCESS;
         }
      }
   }

   private static rpr_3 class_(rCp_1 var0, rpr_3 var1) {
      return var0 == rCp_1.FOOT ? var1 : var1.case_();
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      super.class_(var1, var2, var3, var4 * 0.5F);
   }

   private boolean class_(rYB var1, rfH_2 var2) {
      List var3 = var1.class_(rsq_3.class, new rfl_3(var2), iB_2::Sc);
      if (var3.isEmpty()) {
         return false;
      } else {
         ((rsq_3)var3.get(0)).SQ();
         return true;
      }
   }

   public static boolean class_(rYB var0) {
      return var0.default_().private_();
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rpr_3 var5 = private_(var1).case_();
      switch (var5) {
         case NORTH:
            return this_;
         case SOUTH:
            return else_;
         case WEST:
            return synchronized_;
         default:
            return return_;
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 != class_(var1.byte_(volatile_), var1.byte_(p))) {
         return super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         return var3.class_(this) && var3.byte_(volatile_) != var1.byte_(volatile_) ? var1.class_(final_, var3.byte_(final_)) : xu_3.class_.continue_();
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rpr_3 var2 = var1.case_();
      rfH_2 var3 = var1.class_();
      rfH_2 var4 = var3.break_(var2);
      return var1.int_().byte_(var4).class_(var1) ? this.continue_().class_(p, var2) : null;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.continue_ && var4.implements_()) {
         rCp_1 var5 = var3.byte_(volatile_);
         if (var5 == rCp_1.FOOT) {
            rfH_2 var6 = var2.break_(class_(var5, var3.byte_(p)));
            xc_3 var7 = var1.byte_(var6);
            if (var7.break_() == this && var7.byte_(volatile_) == rCp_1.HEAD) {
               var1.class_(var6, xu_3.class_.continue_(), 35);
               var1.class_(var4, 2001, var6, xd_3.finally_(var7));
            }
         }
      }

      super.class_(var1, var2, var3, var4);
   }

   private static boolean break_(rRq_1 var0, rfH_2 var1) {
      return var0.byte_(var1.break_()).break_() instanceof xb_3;
   }

   private static int[][] break_(rpr_3 var0, rpr_3 var1) {
      return new int[][]{
         {var1.implements_(), var1.extends_()},
         {var1.implements_() - var0.implements_(), var1.extends_() - var0.extends_()},
         {var1.implements_() - var0.implements_() * 2, var1.extends_() - var0.extends_() * 2},
         {-var0.implements_() * 2, -var0.extends_() * 2},
         {-var1.implements_() - var0.implements_() * 2, -var1.extends_() - var0.extends_() * 2},
         {-var1.implements_() - var0.implements_(), -var1.extends_() - var0.extends_()},
         {-var1.implements_(), -var1.extends_()},
         {-var1.implements_() + var0.implements_(), -var1.extends_() + var0.extends_()},
         {var0.implements_(), var0.extends_()},
         {var1.implements_() + var0.implements_(), var1.extends_() + var0.extends_()}
      };
   }

   public rxL_2 break_() {
      return this.public_;
   }

   public static ryk_3 implements_(xc_3 var0) {
      rCp_1 var1 = var0.byte_(volatile_);
      return var1 == rCp_1.HEAD ? ryk_3.FIRST : ryk_3.SECOND;
   }

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.DESTROY;
   }

   public static rpr_3 private_(xc_3 var0) {
      rpr_3 var1 = var0.byte_(p);
      return var0.byte_(volatile_) == rCp_1.HEAD ? var1.case_() : var1;
   }
}
