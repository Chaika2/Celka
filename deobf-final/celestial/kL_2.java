package celestial;

import java.util.Random;

public class kL_2 extends kG_2 {
   public static final rCN volatile_ = rCT.return_;
   protected static final rjC_2 final_ = xd_3.class_(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final rjC_2 package_ = xd_3.class_(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final rjC_2 int_ = xd_3.class_(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final rjC_2 new_ = xd_3.class_(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final rjC_2 continue_ = xd_3.class_(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final rjC_2 super_ = xd_3.class_(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final rjC_2 this_ = xd_3.class_(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final rjC_2 else_ = xd_3.class_(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   public xc_3 byte_(xc_3 var1, rYB var2, rfH_2 var3) {
      var1 = var1.class_(volatile_);
      var2.class_(var3, var1, 3);
      this.throws_(var1, var2, var3);
      return var1;
   }

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   protected kL_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(p, rpr_3.NORTH).class_(volatile_, Boolean.valueOf(false)).class_(q, rCH.WALL));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(q, p, volatile_);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rCH)var1.byte_(q)) {
         case FLOOR:
            switch (var1.byte_(p).final_()) {
               case X:
                  return super_;
               case Z:
               default:
                  return continue_;
            }
         case WALL:
            switch ((rpr_3)var1.byte_(p)) {
               case EAST:
                  return new_;
               case WEST:
                  return int_;
               case SOUTH:
                  return package_;
               case NORTH:
               default:
                  return final_;
            }
         case CEILING:
         default:
            switch (var1.byte_(p).final_()) {
               case X:
                  return else_;
               case Z:
               default:
                  return this_;
            }
      }
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_) ? 15 : 0;
   }

   private static void class_(xc_3 var0, rRg_1 var1, rfH_2 var2, float var3) {
      rpr_3 var4 = var0.byte_(p).case_();
      rpr_3 var5 = private_(var0).case_();
      double var6 = (double)var2.b_() + 0.5 + 0.1 * (double)var4.implements_() + 0.2 * (double)var5.implements_();
      double var8 = (double)var2.c_() + 0.5 + 0.1 * (double)var4.finally_() + 0.2 * (double)var5.finally_();
      double var10 = (double)var2.d_() + 0.5 + 0.1 * (double)var4.extends_() + 0.2 * (double)var5.extends_();
      var1.class_(new rLc_1(1.0F, 0.0F, 0.0F, var3), var6, var8, var10, 0.0, 0.0, 0.0);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_) && var4.nextFloat() < 0.25F) {
         class_(var1, var2, var3, 0.5F);
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         xc_3 var9 = var1.class_(volatile_);
         if (var9.byte_(volatile_)) {
            class_(var9, var2, var3, 1.0F);
         }

         return ryZ_2.SUCCESS;
      } else {
         xc_3 var7 = this.byte_(var1, var2, var3);
         float var8 = var7.byte_(volatile_) ? 0.6F : 0.5F;
         var2.class_((rhd_3)null, var3, rqn_3.Gb, rqL_2.BLOCKS, 0.3F, var8);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         if (var1.byte_(volatile_)) {
            this.throws_(var1, var2, var3);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_) && private_(var1) == var4 ? 15 : 0;
   }

   private void throws_(xc_3 var1, rYB var2, rfH_2 var3) {
      var2.break_(var3, this);
      var2.break_(var3.break_(private_(var1).case_()), this);
   }
}
