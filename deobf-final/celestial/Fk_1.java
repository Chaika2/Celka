package celestial;

class Fk_1 extends FJ {
   private final rLR throws_;
   private final fj_3 case_;
   private final boolean catch_;
   private final rgP_2 private_;

   public Fk_1(Fh_1 var1, int var2, int var3, rLR var4, boolean var5) {
      super(var2, var3);
      this.class_ = var1;
      this.throws_ = var4;
      this.case_ = QY.instanceof_().abstract_().class_(var4);
      this.catch_ = var5;
      this.private_ = this.class_(var4, var5);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3) {
      this.class_.class_(var1, this.private_, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1) {
      QY.instanceof_().A().class_(this.case_.extends_().protected_());
      class_(var1, this.volatile_ + 2, this.final_ + 2, this.h_(), 18, 18, this.case_);
   }

   private rgP_2 class_(rLR var1, boolean var2) {
      rgn_3 var3 = new rgn_3(var1.byte_());
      if (!var2 && var1 != rLD.finally_) {
         var3.break_(" II");
      }

      return var3;
   }

   @Override
   public void catch_() {
      if (!this.private_()) {
         if (this.catch_) {
            this.class_.implements_ = this.throws_;
         } else {
            this.class_.finally_ = this.throws_;
         }

         Fh_1.private_(this.class_).clear();
         Fh_1.implements_(this.class_).clear();
         this.class_.v_();
         this.class_.private_();
      }
   }
}
