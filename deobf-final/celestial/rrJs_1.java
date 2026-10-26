package celestial;

public class rrJs_1 extends rrJM {
   private vm_3 class_;
   private Qw_1 private_;
   private static QF[] implements_ = new QF[]{QF.rc, QF.rh, QF.rm, QF.rO, QF.E, QF.H, QF.n, QF.C, QF.rb};
   private rrJX finally_ = new rrJX(this, new rrJd_1());

   public rrJs_1(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.class_("of.options.performanceTitle")));
      this.class_ = var1;
      this.private_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.case_, this.extends_, this.package_ / 2, 15, 16777215);
      super.class_(var1, var2, var3, var4);
      this.finally_.class_(var1, var2, var3, this.throws_);
   }

   @Override
   protected void break_(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.int_ && var2.class_ == 200) {
         ((Qw_1)this.volatile_.class_[20]).break_();
         this.volatile_.break_(this.class_);
      }
   }

   @Override
   public void v_() {
      this.throws_.clear();

      for (int var1 = 0; var1 < implements_.length; var1++) {
         QF var2 = implements_[var1];
         int var3 = this.package_ / 2 - 155 + var1 % 2 * 160;
         int var4 = this.int_ / 6 + 21 * (var1 / 2) - 12;
         this.class_(var2.class_((Qw_1)this.volatile_.class_[20], var3, var4, 150));
      }

      this.class_(new rrXi_1(200, this.package_ / 2 - 100, this.int_ / 6 + 168 + 11, jI_2.class_("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.volatile_.class_[20]).break_();
   }
}
