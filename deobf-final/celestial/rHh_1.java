package celestial;

class rHh_1 implements rpF_2 {
   rHh_1(rHO var1) {
      this.class_ = var1;
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public void class_(int var1, int var2) {
      switch (var1) {
         case 0:
            this.class_.throws_ = var2;
            break;
         case 1:
            if (!this.class_.extends_.continue_ && !this.class_.byte_.isEmpty()) {
               this.class_.class_(rqn_3.C);
            }

            this.class_.catch_ = rHO.class_(var2);
            break;
         case 2:
            this.class_.private_ = rHO.class_(var2);
      }
   }

   @Override
   public int class_(int var1) {
      switch (var1) {
         case 0:
            return this.class_.throws_;
         case 1:
            return rLR.class_(this.class_.catch_);
         case 2:
            return rLR.class_(this.class_.private_);
         default:
            return 0;
      }
   }
}
