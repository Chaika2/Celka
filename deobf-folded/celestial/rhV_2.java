package celestial;

public abstract class rhV_2 extends rhK_2 implements ai_3 {
   private static final rut_3<rdn_3> id_class = rmE_2.id_class(rhV_2.class, ruw_3.id_catch);

   public rhV_2(aI_2<? extends rhV_2> var1, iB_2 var2, rYB var3) {
      super(var1, var2, var3);
   }

   public rhV_2(aI_2<? extends rhV_2> var1, double var2, double var4, double var6, rYB var8) {
      super(var1, var2, var4, var6, var8);
   }

   public rhV_2(aI_2<? extends rhV_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public rdn_3 id_class() {
      rdn_3 var1 = this.id_case();
      return var1.id_class() ? new rdn_3(this.id_protected()) : var1;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rdn_3 var2 = this.id_case();
      if (!var2.id_class()) {
         var1.id_class("Item", var2.id_break(new rcd_3()));
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      rdn_3 var2 = rdn_3.id_class(var1.id_int("Item"));
      this.id_break(var2);
   }

   public void id_break(rdn_3 var1) {
      if (var1.id_break() != this.id_protected() || var1.id_final()) {
         this.BQ().id_break(id_class, rqR_2.id_class(var1.id_implements(), var0 -> var0.id_throws(1)));
      }
   }

   protected rdn_3 id_case() {
      return this.BQ().id_class(id_class);
   }

   protected abstract rdb_3 id_protected();

   @Override
   protected void m_() {
      this.BQ().id_class(id_class, rdn_3.id_break);
   }
}
