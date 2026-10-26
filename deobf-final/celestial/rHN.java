package celestial;

class rHN implements rpF_2 {
   rHN(rHQ var1) {
      this.class_ = var1;
   }

   @Override
   public int class_() {
      return 2;
   }

   @Override
   public void class_(int var1, int var2) {
      switch (var1) {
         case 0:
            this.class_.case_ = var2;
            break;
         case 1:
            this.class_.implements_ = var2;
      }
   }

   @Override
   public int class_(int var1) {
      switch (var1) {
         case 0:
            return this.class_.case_;
         case 1:
            return this.class_.implements_;
         default:
            return 0;
      }
   }
}
