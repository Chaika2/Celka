package celestial;

public abstract class rbM_2 extends rEi_1 {
   protected static final rut_3<Boolean> id_class = rmE_2.id_class(rbM_2.class, ruw_3.id_implements);
   protected int id_break = 0;

   protected void id_byte(rrEm_1 var1) {
      rbG_2 var2 = this.id_class(aI_2.rb, true);
      if (var2 != null) {
         var2.id_break(new rLY(rLD.id_implements, 200, 0));
      }
   }

   @Override
   public void id_long() {
      if (rbW_2.id_protected(this)) {
         super.id_long();
      }
   }

   @Override
   protected void id_double() {
      super.id_double();
      if (this.sJ()) {
         this.id_break++;
      } else {
         this.id_break = 0;
      }

      if (this.id_break > 300) {
         this.sW();
         this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
      }
   }

   public rbM_2(aI_2<? extends rbM_2> var1, rYB var2) {
      super(var1, var2);
      this.id_byte(true);
      this.sz();
      this.id_class(rLp_1.DANGER_FIRE, 16.0F);
      this.id_class(rLp_1.DAMAGE_FIRE, -1.0F);
   }

   public void id_this(boolean var1) {
      this.BQ().id_break(id_class, var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.L()) {
         var1.id_class("IsImmuneToZombification", true);
      }

      var1.id_break("TimeInOverworld", this.id_break);
   }

   public abstract rbJ_2 sd();

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("IsImmuneToZombification"));
      this.id_break = var1.id_private("TimeInOverworld");
   }

   protected abstract boolean id_throws();

   protected boolean L() {
      return this.BQ().id_class(id_class);
   }

   public boolean sx() {
      return !this.n_();
   }

   protected boolean sk() {
      return this.ss().id_break() instanceof rkW_2;
   }

   @Override
   protected void id_for() {
      super.id_for();
      ruP_2.id_class(this);
   }

   private void sz() {
      if (rpc_3.id_class(this)) {
         ((rLA)this.id_public()).id_class(true);
      }
   }

   @Override
   public iB_2 I_() {
      return ((iZ_2)this.id_private[72]).id_byte(il_3.id_package).orElse((iB_2)null);
   }

   @Override
   public double Pv() {
      return this.n_() ? -0.05 : -0.45;
   }

   public boolean sJ() {
      return !((rYB)this.id_throws[7]).id_default().id_catch() && !this.L() && !this.c();
   }

   protected abstract void sW();

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, false);
   }
}
