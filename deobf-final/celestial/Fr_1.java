package celestial;

import java.util.List;

public class Fr_1 extends vm_3 {
   protected final vm_3 class_;
   private List<rpl_3> case_;
   private LF catch_;
   private LF private_;
   private LF implements_;
   private LF finally_;
   protected Lu_1 throws_;
   private va_3 else_;

   @Override
   public void byte_(boolean var1) {
      this.private_.int_ = var1;
      this.catch_.int_ = var1;
      this.implements_.int_ = var1;
      this.finally_.int_ = var1;
   }

   public Fr_1(vm_3 var1) {
      super(new rgn_3("selectWorld.title"));
      this.class_ = var1;
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      return super.class_(var1, var3, var5);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.case_ = null;
      this.else_.class_(var1, var2, var3, var4);
      this.throws_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 8, 16777215);
      super.class_(var1, var2, var3, var4);
      if (this.case_ != null) {
         this.break_(var1, this.case_, var2, var3);
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      return super.class_(var1, var2, var3) ? true : this.throws_.class_(var1, var2, var3);
   }

   @Override
   public boolean class_(char var1, int var2) {
      return this.throws_.class_(var1, var2);
   }

   public void break_(List<rpl_3> var1) {
      this.case_ = var1;
   }

   @Override
   public void private_() {
      this.throws_.catch_();
   }

   @Override
   public void volatile_() {
      this.volatile_.break_(this.class_);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.throws_ = new Lu_1(this.super_, this.package_ / 2 - 100, 22, 200, 20, this.throws_, new rgn_3("selectWorld.search"), true);
      this.throws_.class_(var1 -> this.else_.class_(() -> var1, false));
      this.else_ = new va_3(this, this.volatile_, this.package_, this.int_, 48, this.int_ - 64, 36, () -> this.throws_.private_(), this.else_);
      this.native_.add(this.throws_);
      this.native_.add(this.else_);
      this.private_ = this.class_(
         (LF)(new LF(this.package_ / 2 - 154, this.int_ - 52, 150, 20, new rgn_3("selectWorld.select"), var1 -> this.else_.private_().ifPresent(vi_3::class_)))
      );
      this.class_(
         (LF)(new LF(this.package_ / 2 + 4, this.int_ - 52, 150, 20, new rgn_3("selectWorld.create"), var1 -> this.volatile_.break_(mo_3.class_(this))))
      );
      this.implements_ = this.class_(
         (LF)(new LF(this.package_ / 2 - 154, this.int_ - 28, 72, 20, new rgn_3("selectWorld.edit"), var1 -> this.else_.private_().ifPresent(vi_3::byte_)))
      );
      this.catch_ = this.class_(
         (LF)(new LF(this.package_ / 2 - 76, this.int_ - 28, 72, 20, new rgn_3("selectWorld.delete"), var1 -> this.else_.private_().ifPresent(vi_3::break_)))
      );
      this.finally_ = this.class_(
         (LF)(new LF(
            this.package_ / 2 + 4, this.int_ - 28, 72, 20, new rgn_3("selectWorld.recreate"), var1 -> this.else_.private_().ifPresent(vi_3::protected_)
         ))
      );
      this.class_((LF)(new LF(this.package_ / 2 + 82, this.int_ - 28, 72, 20, cN_2.protected_, var1 -> this.volatile_.break_(this.class_))));
      this.byte_(false);
      this.break_(this.throws_);
   }

   @Override
   public void w_() {
      super.w_();
      if (this.else_ != null) {
         this.else_.x_().forEach(vi_3::close);
      }
   }
}
