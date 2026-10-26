package celestial;

public class zv_3 extends kE_2 implements kd_3 {
   public static final rCN volatile_ = rCT.else_;
   public static final rCu_1<rCj_1> final_ = rCT.b;
   public static final rCN package_ = rCT.return_;
   public static final rCN int_ = rCT.throw_;
   protected static final rjC_2 new_ = xd_3.class_(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final rjC_2 continue_ = xd_3.class_(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final rjC_2 this_ = xd_3.class_(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 else_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final rjC_2 synchronized_ = xd_3.class_(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

   protected zv_3(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(p, rpr_3.NORTH)
            .class_(volatile_, Boolean.valueOf(false))
            .class_(final_, rCj_1.BOTTOM)
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
      );
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = this.continue_();
      rXE var3 = var1.int_().break_(var1.class_());
      rpr_3 var4 = var1.finally_();
      if (!var1.byte_() && var4.final_().protected_()) {
         var2 = var2.class_(p, var4).class_(final_, var1.extends_().byte_ - (double)var1.class_().c_() > 0.5 ? rCj_1.TOP : rCj_1.BOTTOM);
      } else {
         var2 = var2.class_(p, var1.case_().case_()).class_(final_, var4 == rpr_3.UP ? rCj_1.BOTTOM : rCj_1.TOP);
      }

      if (var1.int_().public_(var1.class_())) {
         var2 = var2.class_(volatile_, Boolean.valueOf(true)).class_(package_, Boolean.valueOf(true));
      }

      return var2.class_(int_, Boolean.valueOf(var3.class_() == rXG.byte_));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, volatile_, final_, package_, int_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(int_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.continue_) {
         boolean var7 = var2.public_(var3);
         if (var7 != var1.byte_(package_)) {
            if (var1.byte_(volatile_) != var7) {
               var1 = var1.class_(volatile_, Boolean.valueOf(var7));
               this.class_((rhd_3)null, var2, var3, var7);
            }

            var2.class_(var3, var1.class_(package_, Boolean.valueOf(var7)), 2);
            if (var1.byte_(int_)) {
               var2.extends_().class_(var3, rXG.byte_, rXG.byte_.class_(var2));
            }
         }
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (this.break_ == QP.static_) {
         return ryZ_2.PASS;
      } else {
         var1 = var1.class_(volatile_);
         var2.class_(var3, var1, 2);
         if (var1.byte_(int_)) {
            var2.extends_().class_(var3, rXG.byte_, rXG.byte_.class_(var2));
         }

         this.class_(var4, var2, var3, var1.byte_(volatile_));
         return ryZ_2.class_(var2.continue_);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.byte_(volatile_);
         case WATER:
            return var1.byte_(int_);
         case AIR:
            return var1.byte_(volatile_);
         default:
            return false;
      }
   }

   protected void class_(rhd_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      if (var4) {
         int var5 = this.break_ == QP.static_ ? 1037 : 1007;
         var2.class_(var1, var5, var3, 0);
      } else {
         int var6 = this.break_ == QP.static_ ? 1036 : 1013;
         var2.class_(var1, var6, var3, 0);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (!var1.byte_(volatile_)) {
         return var1.byte_(final_) == rCj_1.TOP ? synchronized_ : else_;
      } else {
         switch ((rpr_3)var1.byte_(p)) {
            case NORTH:
            default:
               return this_;
            case SOUTH:
               return super_;
            case WEST:
               return continue_;
            case EAST:
               return new_;
         }
      }
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(int_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }
}
