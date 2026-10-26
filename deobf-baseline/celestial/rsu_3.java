package celestial;

public class rsu_3 extends rsJ_2 {
   public rsu_3(aI_2<?> var1, rYB var2) {
      super(var1, var2);
   }

   public rsu_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.id_switch, var1, var2, var4, var6);
   }

   @Override
   public void id_class(int var1, int var2, int var3, boolean var4) {
      if (var4) {
         if (this.BP()) {
            this.Bn();
         }

         if (this.id_private() == 0) {
            this.id_break(-this.id_implements());
            this.id_class(10);
            this.id_byte(50.0F);
            this.rf();
         }
      }
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      if (var1.sN()) {
         return ryZ_2.PASS;
      } else if (this.BP()) {
         return ryZ_2.PASS;
      } else if (!((rYB)this.id_throws[7]).id_continue) {
         return var1.id_this(this) ? ryZ_2.CONSUME : ryZ_2.PASS;
      } else {
         return ryZ_2.SUCCESS;
      }
   }

   @Override
   public rsd_3 id_final() {
      return rsd_3.RIDEABLE;
   }
}
