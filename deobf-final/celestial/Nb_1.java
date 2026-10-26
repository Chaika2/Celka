package celestial;

public abstract class Nb_1 extends cr_3 {
   protected final rbF_2 class_;
   private boolean package_;

   @Override
   public void byte_() {
      boolean var1 = this.break_();
      if (var1 && !this.continue_()) {
         QY.instanceof_().c().class_((Nm_1)this.class_());
         this.package_ = true;
      }

      if (!(Boolean)this.class_.throws_[27] && !this.package_) {
         this.catch_ = (double)((float)this.class_.rx());
         this.private_ = (double)((float)this.class_.re());
         this.implements_ = (double)((float)this.class_.BO());
         float var2 = rfU_2.class_(an_3.case_(this.class_.rv()));
         if ((double)var2 >= 0.01) {
            this.case_ = rfU_2.catch_(rfU_2.class_(var2, this.this_(), this.else_()), this.this_(), this.else_());
            this.throws_ = rfU_2.catch_(rfU_2.class_(var2, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.case_ = 0.0F;
            this.throws_ = 0.0F;
         }
      } else {
         this.super_();
      }
   }

   public Nb_1(rbF_2 var1, rqA_2 var2, rqL_2 var3) {
      super(var2, var3);
      this.class_ = var1;
      this.catch_ = (double)((float)var1.rx());
      this.private_ = (double)((float)var1.re());
      this.implements_ = (double)((float)var1.BO());
      this.finally_ = true;
      this.extends_ = 0;
      this.throws_ = 0.0F;
   }

   private float this_() {
      return this.class_.n_() ? 1.1F : 0.7F;
   }

   protected abstract cr_3 class_();

   protected abstract boolean break_();

   @Override
   public boolean throws_() {
      return !this.class_.BF();
   }

   private float else_() {
      return this.class_.n_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
