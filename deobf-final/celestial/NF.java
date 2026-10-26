package celestial;

public class NF extends cr_3 {
   private final rsJ_2 class_;
   private float package_ = 0.0F;

   @Override
   public void byte_() {
      if ((Boolean)this.class_.throws_[27]) {
         this.super_();
      } else {
         this.catch_ = (double)((float)this.class_.rx());
         this.private_ = (double)((float)this.class_.re());
         this.implements_ = (double)((float)this.class_.BO());
         float var1 = rfU_2.class_(an_3.case_(this.class_.rv()));
         if ((double)var1 >= 0.01) {
            this.package_ = rfU_2.class_(this.package_ + 0.0025F, 0.0F, 1.0F);
            this.throws_ = rfU_2.catch_(rfU_2.class_(var1, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.package_ = 0.0F;
            this.throws_ = 0.0F;
         }
      }
   }

   public NF(rsJ_2 var1) {
      super(rqn_3.GV, rqL_2.NEUTRAL);
      this.class_ = var1;
      this.finally_ = true;
      this.extends_ = 0;
      this.throws_ = 0.0F;
      this.catch_ = (double)((float)var1.rx());
      this.private_ = (double)((float)var1.re());
      this.implements_ = (double)((float)var1.BO());
   }

   @Override
   public boolean throws_() {
      return !this.class_.BF();
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
