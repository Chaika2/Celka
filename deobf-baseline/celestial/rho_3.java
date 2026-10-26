package celestial;

public class rho_3 extends rhm_3 {
   private int id_private = 200;

   public rho_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.p, var2, var4, var6, var1);
   }

   public rho_3(rYB var1, iB_2 var2) {
      super(aI_2.p, var2, var1);
   }

   public rho_3(aI_2<? extends rho_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (((rYB)this.id_throws[7]).id_continue && !this.id_class) {
         ((rYB)this.id_throws[7]).id_class(rLQ.id_float, this.rx(), this.re(), this.BO(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void id_class(iB_2 var1) {
      super.id_class(var1);
      rLY var2 = new rLY(rLD.id_public, this.id_private, 0);
      var1.id_break(var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Duration", this.id_private);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_throws("Duration")) {
         this.id_private = var1.id_private("Duration");
      }
   }

   @Override
   protected rdn_3 id_catch() {
      return new rdn_3(rdy_3.kW);
   }
}
