package celestial;

public class rhG_2 extends rOD {
   private final rSJ id_try = new rSJ(this);
   private boolean id_instanceof;
   private int id_throw;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      super.id_byte(var1);
      return rqn_3.Jn;
   }

   public rhG_2(aI_2<? extends rhG_2> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_this(boolean var1) {
      if (var1 != this.id_instanceof) {
         this.id_instanceof = var1;
         if (var1) {
            this.id_package.id_class(1, this.id_try);
         } else {
            this.id_package.id_class(this.id_try);
         }
      }
   }

   public static iz_3 n() {
      return sq().id_class(iQ_2.id_class, 15.0).id_class(iQ_2.id_protected, 0.2F);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("SkeletonTrap", this.sJ());
      var1.id_break("SkeletonTrapTime", this.id_throw);
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      return aI_2.n.id_class(var1);
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.sJ() && this.id_throw++ >= 18000) {
         this.PD();
      }
   }

   @Override
   protected void sf() {
      if (this.rT()) {
         this.id_class(rqn_3.Jy, 0.4F, 1.0F);
      } else {
         super.sf();
      }
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (!this.sm()) {
         return ryZ_2.PASS;
      } else if (this.n_()) {
         return super.id_break(var1, var2);
      } else if (var1.sN()) {
         this.id_case(var1);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else if (this.BP()) {
         return super.id_break(var1, var2);
      } else {
         if (!var3.id_class()) {
            if (var3.id_break() == rdy_3.hK && !this.id_byte()) {
               this.id_case(var1);
               return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }

            ryZ_2 var4 = var3.id_class(var1, this, var2);
            if (var4.id_class()) {
               return var4;
            }
         }

         this.id_catch(var1);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("SkeletonTrap"));
      this.id_throw = var1.id_private("SkeletonTrapTime");
   }

   @Override
   protected void L() {
      this.id_byte(iQ_2.id_volatile).id_class(this.sg());
   }

   @Override
   protected rqA_2 id_static() {
      super.id_static();
      return this.id_class(rlG_2.id_break) ? rqn_3.Jl : rqn_3.JL;
   }

   @Override
   protected void id_private(float var1) {
      if ((Boolean)this.id_throws[20]) {
         super.id_private(0.3F);
      } else {
         super.id_private(Math.min(0.1F, var1 * 25.0F));
      }
   }

   @Override
   public boolean PH() {
      return true;
   }

   @Override
   public double PS() {
      return super.PS() - 0.1875;
   }

   @Override
   protected rqA_2 BB() {
      if ((Boolean)this.id_throws[20]) {
         if (!this.BP()) {
            return rqn_3.Jp;
         }

         this.id_while++;
         if (this.id_while > 5 && this.id_while % 3 == 0) {
            return rqn_3.JH;
         }

         if (this.id_while <= 5) {
            return rqn_3.Jp;
         }
      }

      return rqn_3.JC;
   }

   @Override
   protected rqA_2 Bt() {
      super.Bt();
      return rqn_3.JA;
   }

   @Override
   protected float Bf() {
      return 0.96F;
   }

   public boolean sJ() {
      return this.id_instanceof;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_break;
   }

   @Override
   protected void su() {
   }
}
