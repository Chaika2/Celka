package celestial;

public abstract class jW_2<T extends ryO_2> implements rrMa_1 {
   protected final jz_3 catch_;
   private ryW_2 class_ = null;
   private rqO_2 break_ = null;

   @Override
   public rrWQ<aI_2, ryW_2> byte_() {
      return this.class_ == null ? null : rrWQ.break_(this.class_);
   }

   public jW_2(jz_3 var1) {
      this.catch_ = var1;
   }

   @Override
   public void class_(rqO_2 var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(rrWQ<aI_2, ryW_2> var1) {
      this.class_ = (ryW_2)var1.break_().get();
   }

   public abstract void class_(T var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6);

   public boolean class_(T var1) {
      return false;
   }

   @Override
   public rqO_2 protected_() {
      return this.break_;
   }
}
