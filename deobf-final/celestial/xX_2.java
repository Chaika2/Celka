package celestial;

public class xX_2 extends dB_2 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCu_1<rCq_1> final_ = rCT.for_;
   public static final rCN package_ = rCT.return_;
   private static final rjC_2 int_ = xd_3.class_(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final rjC_2 new_ = xd_3.class_(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final rjC_2 continue_ = xd_3.class_(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final rjC_2 super_ = xd_3.class_(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final rjC_2 this_ = rjw_3.class_(super_, continue_);
   private static final rjC_2 else_ = rjw_3.class_(this_, xd_3.class_(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final rjC_2 synchronized_ = rjw_3.class_(this_, xd_3.class_(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final rjC_2 return_ = rjw_3.class_(this_, xd_3.class_(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final rjC_2 public_ = rjw_3.class_(this_, xd_3.class_(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final rjC_2 goto_ = rjw_3.class_(this_, xd_3.class_(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final rjC_2 while_ = rjw_3.class_(this_, xd_3.class_(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final rjC_2 try_ = rjw_3.class_(this_, xd_3.class_(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));

   public xX_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, rCq_1.FLOOR).class_(package_, Boolean.valueOf(false)));
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = implements_(var1).case_();
      return var4 == rpr_3.UP ? xd_3.class_(var2, var3.final_(), rpr_3.DOWN) : kG_2.break_(var2, var3, var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rCq_1 var7 = var1.byte_(final_);
      rpr_3 var8 = implements_(var1).case_();
      if (var8 == var2 && !var1.class_(var4, var5) && var7 != rCq_1.DOUBLE_WALL) {
         return xu_3.class_.continue_();
      } else {
         if (var2.final_() == var1.byte_(volatile_).final_()) {
            if (var7 == rCq_1.DOUBLE_WALL && !var3.protected_(var4, var6, var2)) {
               return var1.class_(final_, rCq_1.SINGLE_WALL).class_(volatile_, var2.case_());
            }

            if (var7 == rCq_1.SINGLE_WALL && var8.case_() == var2 && var3.protected_(var4, var6, var1.byte_(volatile_))) {
               return var1.class_(final_, rCq_1.DOUBLE_WALL);
            }
         }

         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rpr_3 var2 = var1.finally_();
      rfH_2 var3 = var1.class_();
      rYB var4 = var1.int_();
      rpB_2 var5 = var2.final_();
      if (var5 == rpB_2.Y) {
         xc_3 var6 = this.continue_().class_(final_, var2 == rpr_3.DOWN ? rCq_1.CEILING : rCq_1.FLOOR).class_(volatile_, var1.case_());
         if (var6.class_((rRR)var1.int_(), var3)) {
            return var6;
         }
      } else {
         boolean var9 = var5 == rpB_2.X
               && var4.byte_(var3.byte_()).protected_(var4, var3.byte_(), rpr_3.EAST)
               && var4.byte_(var3.extends_()).protected_(var4, var3.extends_(), rpr_3.WEST)
            || var5 == rpB_2.Z
               && var4.byte_(var3.private_()).protected_(var4, var3.private_(), rpr_3.SOUTH)
               && var4.byte_(var3.protected_()).protected_(var4, var3.protected_(), rpr_3.NORTH);
         xc_3 var7 = this.continue_().class_(volatile_, var2.case_()).class_(final_, var9 ? rCq_1.DOUBLE_WALL : rCq_1.SINGLE_WALL);
         if (var7.class_((rRR)var1.int_(), var1.class_())) {
            return var7;
         }

         boolean var8 = var4.byte_(var3.break_()).protected_(var4, var3.break_(), rpr_3.UP);
         var7 = var7.class_(final_, var8 ? rCq_1.FLOOR : rCq_1.CEILING);
         if (var7.class_((rRR)var1.int_(), var1.class_())) {
            return var7;
         }
      }

      return null;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.public_(var3);
      if (var7 != var1.byte_(package_)) {
         if (var7) {
            this.class_(var2, var3, (rpr_3)null);
         }

         var2.class_(var3, var1.class_(package_, Boolean.valueOf(var7)), 3);
      }
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHW();
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_);
   }

   @Override
   public void class_(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      an_3 var5 = var4.else_();
      rhd_3 var6 = var5 instanceof rhd_3 ? (rhd_3)var5 : null;
      this.class_(var1, var2, var3, var6, true);
   }

   private boolean class_(xc_3 var1, rpr_3 var2, double var3) {
      if (var2.final_() != rpB_2.Y && !(var3 > 0.8124F)) {
         rpr_3 var5 = var1.byte_(volatile_);
         rCq_1 var6 = var1.byte_(final_);
         switch (var6) {
            case FLOOR:
               return var5.final_() == var2.final_();
            case SINGLE_WALL:
            case DOUBLE_WALL:
               return var5.final_() != var2.final_();
            case CEILING:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean class_(rYB var1, xc_3 var2, rff_3 var3, rhd_3 var4, boolean var5) {
      rpr_3 var6 = var3.break_();
      rfH_2 var7 = var3.class_();
      boolean var8 = !var5 || this.class_(var2, var6, var3.case_().byte_ - (double)var7.c_());
      if (var8) {
         boolean var9 = this.class_(var1, var7, var6);
         if (var9 && var4 != null) {
            var4.break_(rlB_2.l);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      return this.class_(var2, var1, var6, var4, true) ? ryZ_2.class_(var2.continue_) : ryZ_2.PASS;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.private_(var1);
   }

   public boolean class_(rYB var1, rfH_2 var2, rpr_3 var3) {
      ryO_2 var4 = var1.class_(var2);
      if (!var1.continue_ && var4 instanceof rHW) {
         if (var3 == null) {
            var3 = var1.byte_(var2).byte_(volatile_);
         }

         ((rHW)var4).class_(var3);
         var1.class_((rhd_3)null, var2, rqn_3.V, rqL_2.BLOCKS, 2.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.private_(var1);
   }

   private static rpr_3 implements_(xc_3 var0) {
      switch ((rCq_1)var0.byte_(final_)) {
         case FLOOR:
            return rpr_3.UP;
         case CEILING:
            return rpr_3.DOWN;
         default:
            return var0.byte_(volatile_).case_();
      }
   }

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.DESTROY;
   }

   private rjC_2 private_(xc_3 var1) {
      rpr_3 var2 = var1.byte_(volatile_);
      rCq_1 var3 = var1.byte_(final_);
      if (var3 == rCq_1.FLOOR) {
         return var2 != rpr_3.NORTH && var2 != rpr_3.SOUTH ? new_ : int_;
      } else if (var3 == rCq_1.CEILING) {
         return try_;
      } else if (var3 != rCq_1.DOUBLE_WALL) {
         if (var2 == rpr_3.NORTH) {
            return goto_;
         } else if (var2 == rpr_3.SOUTH) {
            return while_;
         } else {
            return var2 == rpr_3.EAST ? public_ : return_;
         }
      } else {
         return var2 != rpr_3.NORTH && var2 != rpr_3.SOUTH ? synchronized_ : else_;
      }
   }
}
