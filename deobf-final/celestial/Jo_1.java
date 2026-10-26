package celestial;

public abstract class Jo_1 extends xd_3 {
   protected static final rjC_2 volatile_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final rjC_2 final_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final boolean package_;

   protected Jo_1(boolean var1, Jq_1 var2) {
      super(var2);
      this.package_ = var1;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.continue_ && var2.byte_(var3).class_(this)) {
         rCR var7 = var1.byte_(this.implements_());
         if (class_(var3, var2, var7)) {
            protected_(var1, var2, var3);
            var2.class_(var3, var6);
         } else {
            this.class_(var1, var2, var3, var4);
         }
      }
   }

   private static boolean class_(rfH_2 var0, rYB var1, rCR var2) {
      if (!byte_((rRq_1)var1, var0.break_())) {
         return true;
      } else {
         switch (var2) {
            case ASCENDING_EAST:
               return !byte_((rRq_1)var1, var0.extends_());
            case ASCENDING_WEST:
               return !byte_((rRq_1)var1, var0.byte_());
            case ASCENDING_NORTH:
               return !byte_((rRq_1)var1, var0.private_());
            case ASCENDING_SOUTH:
               return !byte_((rRq_1)var1, var0.protected_());
            default:
               return false;
         }
      }
   }

   protected void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
   }

   protected xc_3 class_(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      if (var1.continue_) {
         return var3;
      } else {
         rCR var5 = var3.byte_(this.implements_());
         return new WJ(var1, var2, var3).class_(var1.public_(var2), var4, var5).byte_();
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = super.continue_();
      rpr_3 var3 = var1.case_();
      boolean var4 = var3 == rpr_3.EAST || var3 == rpr_3.WEST;
      return var2.class_(this.implements_(), var4 ? rCR.EAST_WEST : rCR.NORTH_SOUTH);
   }

   public static boolean class_(rYB var0, rfH_2 var1) {
      return catch_(var0.byte_(var1));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rCR var5 = var1.class_(this) ? var1.byte_(this.implements_()) : null;
      return var5 != null && var5.break_() ? final_ : volatile_;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return byte_(var2, var3.break_());
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_())) {
         this.class_(var1, var2, var3, var5);
      }
   }

   protected xc_3 class_(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      var1 = this.class_(var2, var3, var1, true);
      if (this.package_) {
         var1.class_(var2, var3, this, var3, var4);
      }

      return var1;
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5) {
         super.break_(var1, var2, var3, var4, var5);
         if (var1.byte_(this.implements_()).break_()) {
            var2.break_(var3.final_(), this);
         }

         if (this.package_) {
            var2.break_(var3, this);
            var2.break_(var3.break_(), this);
         }
      }
   }

   public boolean break_() {
      return this.package_;
   }

   public static boolean catch_(xc_3 var0) {
      return var0.class_(rls_3.float_) && var0.break_() instanceof Jo_1;
   }

   public abstract rCZ<rCR> implements_();

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.NORMAL;
   }
}
