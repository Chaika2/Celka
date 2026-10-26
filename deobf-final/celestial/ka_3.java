package celestial;

import java.util.Arrays;

public class ka_3 extends dz_3 {
   public static final rCu_1<rCg_1> final_ = rCT.V;
   public static final rCN package_ = rCT.public_;
   protected static final rjC_2 int_ = xd_3.class_(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 new_ = xd_3.class_(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final rjC_2 continue_ = xd_3.class_(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final rjC_2 this_ = xd_3.class_(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 else_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final rjC_2 synchronized_ = xd_3.class_(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final rjC_2 return_ = xd_3.class_(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final rjC_2 public_ = xd_3.class_(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final rjC_2 goto_ = xd_3.class_(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final rjC_2 while_ = xd_3.class_(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final rjC_2 try_ = xd_3.class_(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final rjC_2 instanceof_ = xd_3.class_(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final rjC_2 throw_ = xd_3.class_(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final rjC_2 long_ = xd_3.class_(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final rjC_2 float_ = xd_3.class_(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final rjC_2 void_ = xd_3.class_(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final rjC_2 static_ = xd_3.class_(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final rjC_2[] import_ = class_(true);
   private static final rjC_2[] short_ = class_(false);

   public ka_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, rCg_1.DEFAULT).class_(package_, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(var3.byte_(final_) == rCg_1.STICKY ? xu_3.D : xu_3.rB);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var1.class_((rRR)var2, var3)) {
         rfH_2 var7 = var3.break_(var1.byte_(volatile_).case_());
         var2.byte_(var7).class_(var2, var7, var4, var5, false);
      }
   }

   private static rjC_2[] class_(boolean var0) {
      return Arrays.stream(rpr_3.values()).map(var1 -> class_(var1, var0)).toArray(rjC_2[]::new);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.continue_ && ((rhx_3)var4.implements_[18]).protected_) {
         rfH_2 var5 = var2.break_(var3.byte_(volatile_).case_());
         if (this.class_(var3, var1.byte_(var5))) {
            var1.break_(var5, false);
         }
      }

      super.class_(var1, var2, var3, var4);
   }

   private boolean class_(xc_3 var1, xc_3 var2) {
      xd_3 var3 = var1.byte_(final_) == rCg_1.DEFAULT ? xu_3.rB : xu_3.D;
      return var2.class_(var3) && var2.byte_(kD_2.final_) && var2.byte_(volatile_) == var1.byte_(volatile_);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return (var1.byte_(package_) ? import_ : short_)[var1.byte_(volatile_).ordinal()];
   }

   private static rjC_2 class_(rpr_3 var0, boolean var1) {
      switch (var0) {
         case DOWN:
         default:
            return rjw_3.class_(else_, var1 ? throw_ : return_);
         case UP:
            return rjw_3.class_(this_, var1 ? instanceof_ : synchronized_);
         case NORTH:
            return rjw_3.class_(super_, var1 ? float_ : goto_);
         case SOUTH:
            return rjw_3.class_(continue_, var1 ? long_ : public_);
         case WEST:
            return rjw_3.class_(new_, var1 ? static_ : try_);
         case EAST:
            return rjw_3.class_(int_, var1 ? void_ : while_);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.break_(var1.byte_(volatile_).case_()));
      return this.class_(var1, var4) || var4.class_(xu_3.rc) && var4.byte_(volatile_) == var1.byte_(volatile_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.case_() == var1.byte_(volatile_) && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         super.break_(var1, var2, var3, var4, var5);
         rfH_2 var6 = var3.break_(var1.byte_(volatile_).case_());
         if (this.class_(var1, var2.byte_(var6))) {
            var2.break_(var6, true);
         }
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }
}
