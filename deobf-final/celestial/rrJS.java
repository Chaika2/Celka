package celestial;

public class rrJS extends rrJM {
   private vm_3 class_;
   private Qw_1 private_;
   private rrJX implements_ = new rrJX(this, new rrJd_1());

   @Override
   public void byte_(boolean var1) {
      if (var1) {
         ((Qw_1)this.volatile_.class_[20]).finally_();
      }

      this.volatile_.break_(this);
   }

   public rrJS(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.class_("of.options.otherTitle")));
      this.class_ = var1;
      this.private_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.case_, this.extends_, this.package_ / 2, 15, 16777215);
      super.class_(var1, var2, var3, var4);
      this.implements_.class_(var1, var2, var3, this.throws_);
   }

   @Override
   protected void break_(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.int_) {
         if (var2.class_ == 200) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            this.volatile_.else_().catch_();
            this.volatile_.break_(this.class_);
         }

         if (var2.class_ == 210) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            String var3 = jI_2.class_("of.message.other.reset");
            mT_2 var4 = new mT_2(this::byte_, new rgN_2(var3), new rgN_2(""));
            this.volatile_.break_(var4);
         }
      }
   }

   @Override
   public void v_() {
      this.throws_.clear();
      QH var1 = new QH(this.volatile_.else_());
      QF[] var2 = new QF[]{QF.k, QF.j, QF.W, QF.rz, QF.Z, QF.l, QF.r, QF.z, QF.rQ, QF.ru, var1, null};

      for (int var3 = 0; var3 < var2.length; var3++) {
         QF var4 = var2[var3];
         int var5 = this.package_ / 2 - 155 + var3 % 2 * 160;
         int var6 = this.int_ / 6 + 21 * (var3 / 2) - 12;
         LZ var7 = this.class_(var4.class_((Qw_1)this.volatile_.class_[20], var5, var6, 150));
         if (var4 == var1) {
            var7.int_(310);
            var3++;
         }
      }

      this.class_(new rrXi_1(210, this.package_ / 2 - 100, this.int_ / 6 + 168 + 11 - 44, jI_2.class_("of.options.other.reset")));
      this.class_(new rrXi_1(200, this.package_ / 2 - 100, this.int_ / 6 + 168 + 11, jI_2.class_("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.volatile_.class_[20]).break_();
      this.volatile_.else_().catch_();
   }
}
