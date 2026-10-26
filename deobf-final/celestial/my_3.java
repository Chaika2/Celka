package celestial;

public class my_3 extends vm_3 {
   private final vm_3 throws_;
   protected final mp_3 class_;
   private final rgP_2 case_;
   private final boolean catch_;
   private cv_3 private_ = cv_3.class_;
   private LC implements_;

   public my_3(vm_3 var1, mp_3 var2, rgP_2 var3, rgP_2 var4, boolean var5) {
      super(var3);
      this.throws_ = var1;
      this.class_ = var2;
      this.case_ = var4;
      this.catch_ = var5;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.volatile_.break_(this.throws_);
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 50, 16777215);
      this.private_.class_(var1, this.package_ / 2, 70);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.private_ = cv_3.class_(this.super_, this.case_, this.package_ - 50);
      int var1 = (this.private_.class_() + 1) * 9;
      this.class_(
         new LF(
            this.package_ / 2 - 155,
            100 + var1,
            150,
            20,
            new rgn_3("selectWorld.backupJoinConfirmButton"),
            var1x -> this.class_.proceed(true, this.implements_.private_())
         )
      );
      this.class_(
         new LF(
            this.package_ / 2 - 155 + 160,
            100 + var1,
            150,
            20,
            new rgn_3("selectWorld.backupJoinSkipButton"),
            var1x -> this.class_.proceed(false, this.implements_.private_())
         )
      );
      this.class_(new LF(this.package_ / 2 - 155 + 80, 124 + var1, 150, 20, cN_2.protected_, var1x -> this.volatile_.break_(this.throws_)));
      this.implements_ = new LC(this.package_ / 2 - 155 + 80, 76 + var1, 150, 20, new rgn_3("selectWorld.backupEraseCache"), false);
      if (this.catch_) {
         this.class_(this.implements_);
      }
   }
}
