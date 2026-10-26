package celestial;

public class rrJf_1 extends Ax_1 {
   private boolean id_catch = false;
   private rfH_2 id_private = null;
   private an_3 id_implements = null;

   public rrJf_1(QY var1, Aq_1 var2) {
      super(var1, var2);
   }

   @Override
   public ryZ_2 id_class(cb_3 var1, gm_3 var2, rpm_3 var3, rff_3 var4) {
      this.id_catch = true;
      this.id_private = var4.id_class();
      ryZ_2 var5 = super.id_class(var1, var2, var3, var4);
      this.id_catch = false;
      return var5;
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, an_3 var2, rpm_3 var3) {
      this.id_implements = var2;
      return super.id_class(var1, var2, var3);
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, an_3 var2, rfo_3 var3, rpm_3 var4) {
      this.id_implements = var2;
      return super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(rfH_2 var1, rpr_3 var2, boolean var3) {
      this.id_catch = true;
      this.id_private = var1;
      boolean var4 = super.id_class(var1, var2, var3);
      this.id_catch = false;
      return var4;
   }

   @Override
   public ryZ_2 id_class(rpm_3 var1) {
      this.id_catch = true;
      ryZ_2 var2 = super.id_class(var1);
      this.id_catch = false;
      return var2;
   }

   @Override
   public boolean id_break(rfH_2 var1, rpr_3 var2, boolean var3) {
      this.id_catch = true;
      this.id_private = var1;
      boolean var4 = super.id_break(var1, var2, var3);
      this.id_catch = false;
      return var4;
   }

   public rfH_2 id_continue() {
      return this.id_private;
   }

   public boolean id_new() {
      return this.id_catch;
   }

   public an_3 id_super() {
      return this.id_implements;
   }
}
