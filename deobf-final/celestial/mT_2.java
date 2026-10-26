package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class mT_2 extends vm_3 {
   private final rgP_2 catch_;
   private cv_3 private_ = cv_3.class_;
   protected rgP_2 class_;
   protected rgP_2 throws_;
   private int implements_;
   protected final BooleanConsumer case_;

   public mT_2(BooleanConsumer var1, rgP_2 var2, rgP_2 var3) {
      this(var1, var2, var3, cN_2.throws_, cN_2.case_);
   }

   public mT_2(BooleanConsumer var1, rgP_2 var2, rgP_2 var3, rgP_2 var4, rgP_2 var5) {
      super(var2);
      this.case_ = var1;
      this.catch_ = var3;
      this.class_ = var4;
      this.throws_ = var5;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 70, 16777215);
      this.private_.class_(var1, this.package_ / 2, 90);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.case_.accept(false);
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   public void break_(int var1) {
      this.implements_ = var1;

      for (LZ var3 : this.new_) {
         var3.int_ = false;
      }
   }

   @Override
   public void private_() {
      super.private_();
      if (--this.implements_ == 0) {
         for (LZ var2 : this.new_) {
            var2.int_ = true;
         }
      }
   }

   @Override
   public String D_() {
      return super.D_() + ". " + this.catch_.getString();
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.class_(new LF(this.package_ / 2 - 155, this.int_ / 6 + 96, 150, 20, this.class_, var1 -> this.case_.accept(true)));
      this.class_(new LF(this.package_ / 2 - 155 + 160, this.int_ / 6 + 96, 150, 20, this.throws_, var1 -> this.case_.accept(false)));
      this.private_ = cv_3.class_(this.super_, this.catch_, this.package_ - 50);
   }
}
