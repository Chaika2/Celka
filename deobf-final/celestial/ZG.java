package celestial;

public class ZG extends vm_3 {
   private final rgP_2 class_;
   private cv_3 throws_ = cv_3.class_;
   private final vm_3 case_;
   private int catch_;

   public ZG(vm_3 var1, rgP_2 var2, rgP_2 var3) {
      super(var2);
      this.case_ = var1;
      this.class_ = var3;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, this.int_ / 2 - this.catch_ / 2 - 18, 11184810);
      this.throws_.class_(var1, this.package_ / 2, this.int_ / 2 - this.catch_ / 2);
      super.class_(var1, var2, var3, var4);
   }

   private void finally_() {
      if ((Ak_1)rrfp_3.class_[0] != null) {
         this.volatile_.break_(new mt_3(new rrvL(), import_, (Ak_1)rrfp_3.class_[0]));
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.throws_ = cv_3.class_(this.super_, this.class_, this.package_ - 50);
      this.catch_ = this.throws_.class_() * 9;
      int var1 = Math.min(this.int_ / 2 + this.catch_ / 2 + 9, this.int_ - 30);
      this.class_(new LF(this.package_ / 2 - 100, var1, 200, 20, new rgn_3("gui.toMenu"), var1x -> this.volatile_.break_(this.case_)));
      if (!this.volatile_.switch_() && (rrfq_3)rrfp_3.class_[1] != null) {
         this.class_(new LF(this.package_ / 2 - 100, var1 + 25, 200, 20, new rgn_3("menu.reconnect"), var1x -> this.finally_()));
      }

      Aq_1 var2 = import_.void_();
      rrFK.class_((rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[1], this.class_, var2 == null ? null : var2.class_());
   }
}
