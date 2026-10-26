package celestial;

public class rhb_3 extends rhP_2 {
   private int id_try = 47999;

   public rhb_3(aI_2<? extends rhb_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 == iO_2.EVENT) {
         this.e_(0);
      }

      if (var4 == null) {
         var4 = new am_3(false);
      }

      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("DespawnDelay", this.id_try);
   }

   @Override
   protected rhP_2 si() {
      return aI_2.R.id_class((rYB)this.id_throws[7]);
   }

   @Override
   public void id_default() {
      super.id_default();
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.Es();
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("DespawnDelay", 99)) {
         this.id_try = var1.id_private("DespawnDelay");
      }
   }

   @Override
   protected void id_catch(rhd_3 var1) {
      an_3 var2 = this.N();
      if (!(var2 instanceof rsU_2)) {
         super.id_catch(var1);
      }
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(1, new rBY(this, 2.0));
      this.id_int.id_class(1, new rhM_2(this, this));
   }

   private boolean EG() {
      return this.N() instanceof rsU_2;
   }

   private boolean Eb() {
      return this.z() && !this.EG();
   }

   private void Es() {
      if (this.EE()) {
         this.id_try = this.EG() ? ((rsU_2)this.N()).sW() - 1 : this.id_try - 1;
         if (this.id_try <= 0) {
            this.id_class(true, false);
            this.PD();
         }
      }
   }

   @Override
   public boolean sK() {
      return true;
   }

   private boolean EE() {
      return !this.sm() && !this.Eb() && !this.Pq();
   }
}
