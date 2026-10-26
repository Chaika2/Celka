package celestial;

public abstract class jW_2<T extends ryO_2> implements rrMa_1 {
   protected final jz_3 id_catch;
   private ryW_2 id_class = null;
   private rqO_2 id_break = null;

   @Override
   public rrWQ<aI_2, ryW_2> id_byte() {
      return this.id_class == null ? null : rrWQ.id_break(this.id_class);
   }

   public jW_2(jz_3 var1) {
      this.id_catch = var1;
   }

   @Override
   public void id_class(rqO_2 var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(rrWQ<aI_2, ryW_2> var1) {
      this.id_class = (ryW_2)var1.id_break().get();
   }

   public abstract void id_class(T var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6);

   public boolean id_class(T var1) {
      return false;
   }

   @Override
   public rqO_2 id_protected() {
      return this.id_break;
   }
}
