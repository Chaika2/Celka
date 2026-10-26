package celestial;

public class ZB extends vm_3 {
   private cv_3 class_;
   private final Runnable throws_;

   public ZB(Runnable var1) {
      super(new rgn_3("datapackFailure.title"));
      this.class_ = cv_3.class_;
      this.throws_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.class_.class_(var1, this.package_ / 2, 70);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.class_ = cv_3.class_(this.super_, this.new_(), this.package_ - 50);
      this.class_(new LF(this.package_ / 2 - 155, this.int_ / 6 + 96, 150, 20, new rgn_3("datapackFailure.safeMode"), var1 -> this.throws_.run()));
      this.class_(new LF(this.package_ / 2 - 155 + 160, this.int_ / 6 + 96, 150, 20, new rgn_3("gui.toTitle"), var1 -> this.volatile_.break_((vm_3)null)));
   }
}
