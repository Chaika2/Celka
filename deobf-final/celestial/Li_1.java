package celestial;

public class Li_1 extends LV<Ar_1> {
   static final rqO_2 throws_ = new rqO_2("textures/gui/resource_packs.png");
   static final rgP_2 case_ = new rgn_3("pack.incompatible");
   private static final rgP_2 catch_ = new rgn_3("pack.incompatible.confirm.title");
   public final rgP_2 class_;

   public Li_1(QY var1, int var2, int var3, rgP_2 var4) {
      super(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.class_ = var4;
      this.this_ = false;
      this.class_(true, 13);
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3, yb_3 var4) {
      rVi_1 var5 = new rgN_2("").class_(this.class_).class_(rgF_2.UNDERLINE, rgF_2.BOLD);
      ((cm_3)this.native_.class_[15])
         .byte_(var1, var5, (float)(var2 + this.final_ / 2 - ((cm_3)this.native_.class_[15]).class_(var5) / 2), (float)Math.min(this.int_ + 3, var3), 16777215);
   }

   @Override
   protected int protected_() {
      return this.continue_ - 6;
   }

   public int private_() {
      return this.package_;
   }

   @Override
   public int F_() {
      return this.final_;
   }
}
