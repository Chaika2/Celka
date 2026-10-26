package celestial;

public abstract class rhv_3 extends rhL_2 implements ai_3 {
   private static final rut_3<rdn_3> id_catch = rmE_2.id_class(rhv_3.class, ruw_3.id_catch);

   public rhv_3(aI_2<? extends rhv_3> var1, iB_2 var2, double var3, double var5, double var7, rYB var9) {
      super(var1, var2, var3, var5, var7, var9);
   }

   public rhv_3(aI_2<? extends rhv_3> var1, double var2, double var4, double var6, double var8, double var10, double var12, rYB var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
   }

   public rhv_3(aI_2<? extends rhv_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rdn_3 var2 = this.id_protected();
      if (!var2.id_class()) {
         var1.id_class("Item", var2.id_break(new rcd_3()));
      }
   }

   @Override
   public rdn_3 id_class() {
      rdn_3 var1 = this.id_protected();
      return var1.id_class() ? new rdn_3(rdy_3.xa) : var1;
   }

   public void id_break(rdn_3 var1) {
      if (var1.id_break() != rdy_3.xa || var1.id_final()) {
         this.BQ().id_break(id_catch, rqR_2.id_class(var1.id_implements(), var0 -> var0.id_throws(1)));
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      rdn_3 var2 = rdn_3.id_class(var1.id_int("Item"));
      this.id_break(var2);
   }

   protected rdn_3 id_protected() {
      return this.BQ().id_class(id_catch);
   }

   @Override
   protected void m_() {
      this.BQ().id_class(id_catch, rdn_3.id_break);
   }
}
