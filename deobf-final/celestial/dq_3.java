package celestial;

public class dq_3 extends kE_2 {
   public static final rCN volatile_ = rCT.else_;
   public static final rCN final_ = rCT.return_;
   public static final rCN package_ = rCT.new_;
   protected static final rjC_2 int_ = xd_3.class_(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final rjC_2 new_ = xd_3.class_(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final rjC_2 continue_ = xd_3.class_(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final rjC_2 super_ = xd_3.class_(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final rjC_2 this_ = xd_3.class_(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final rjC_2 else_ = xd_3.class_(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final rjC_2 synchronized_ = rjw_3.class_(xd_3.class_(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), xd_3.class_(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final rjC_2 return_ = rjw_3.class_(xd_3.class_(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), xd_3.class_(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final rjC_2 public_ = rjw_3.class_(xd_3.class_(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), xd_3.class_(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final rjC_2 goto_ = rjw_3.class_(xd_3.class_(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), xd_3.class_(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));

   public dq_3(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_.break_().class_(volatile_, Boolean.valueOf(false)).class_(final_, Boolean.valueOf(false)).class_(package_, Boolean.valueOf(false))
      );
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      boolean var4 = var2.public_(var3);
      rpr_3 var5 = var1.case_();
      rpB_2 var6 = var5.final_();
      boolean var7 = var6 == rpB_2.Z && (this.private_(var2.byte_(var3.byte_())) || this.private_(var2.byte_(var3.extends_())))
         || var6 == rpB_2.X && (this.private_(var2.byte_(var3.private_())) || this.private_(var2.byte_(var3.protected_())));
      return this.continue_()
         .class_(p, var5)
         .class_(volatile_, Boolean.valueOf(var4))
         .class_(final_, Boolean.valueOf(var4))
         .class_(package_, Boolean.valueOf(var7));
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.byte_(volatile_)) {
         var1 = var1.class_(volatile_, Boolean.valueOf(false));
         var2.class_(var3, var1, 10);
      } else {
         rpr_3 var7 = var4.Pg();
         if (var1.byte_(p) == var7.case_()) {
            var1 = var1.class_(p, var7);
         }

         var1 = var1.class_(volatile_, Boolean.valueOf(true));
         var2.class_(var3, var1, 10);
      }

      var2.class_(var4, var1.byte_(volatile_) ? 1008 : 1014, var3, 0);
      return ryZ_2.class_(var2.continue_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.continue_) {
         boolean var7 = var2.public_(var3);
         if (var1.byte_(final_) != var7) {
            var2.class_(var3, var1.class_(final_, Boolean.valueOf(var7)).class_(volatile_, Boolean.valueOf(var7)), 2);
            if (var1.byte_(volatile_) != var7) {
               var2.class_((rhd_3)null, var7 ? 1008 : 1014, var3, 0);
            }
         }
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, volatile_, final_, package_);
   }

   public static boolean class_(xc_3 var0, rpr_3 var1) {
      return var0.byte_(p).final_() == var1.catch_().final_();
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rpB_2 var7 = var2.final_();
      if (var1.byte_(p).catch_().final_() != var7) {
         return super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var8 = this.private_(var3) || this.private_(var4.byte_(var5.break_(var2.case_())));
         return var1.class_(package_, Boolean.valueOf(var8));
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      if (var1.byte_(package_)) {
         return var1.byte_(p).final_() == rpB_2.X ? goto_ : public_;
      } else {
         return var1.byte_(p).final_() == rpB_2.X ? return_ : synchronized_;
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.byte_(volatile_);
         case WATER:
            return false;
         case AIR:
            return var1.byte_(volatile_);
         default:
            return false;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.byte_(package_)) {
         return var1.byte_(p).final_() == rpB_2.X ? super_ : continue_;
      } else {
         return var1.byte_(p).final_() == rpB_2.X ? new_ : int_;
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.byte_(volatile_)) {
         return rjw_3.class_();
      } else {
         return var1.byte_(p).final_() == rpB_2.Z ? this_ : else_;
      }
   }

   private boolean private_(xc_3 var1) {
      return var1.break_().class_(rls_3.abstract_);
   }
}
