package celestial;

public abstract class lO_2 extends lN_2 {
   protected fj_3 id_instanceof;

   @Override
   protected float id_byte() {
      return this.id_instanceof.id_catch();
   }

   protected lO_2(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected lO_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   protected void id_class(fj_3 var1) {
      this.id_instanceof = var1;
   }

   public void id_class(Ch_1 var1) {
      this.id_class(var1.id_class(this.id_continue));
   }

   public void id_break(Ch_1 var1) {
      this.id_class(var1.id_class(this.id_super, this.id_this));
   }

   @Override
   protected float id_break() {
      return this.id_instanceof.id_case();
   }

   @Override
   protected float id_throws() {
      return this.id_instanceof.id_implements();
   }

   @Override
   protected float id_protected() {
      return this.id_instanceof.id_private();
   }
}
