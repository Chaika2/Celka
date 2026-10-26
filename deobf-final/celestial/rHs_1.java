package celestial;

class rHs_1 implements rpF_2 {
   rHs_1(rHS var1) {
      this.class_ = var1;
   }

   @Override
   public int class_() {
      return 4;
   }

   @Override
   public void class_(int var1, int var2) {
      switch (var1) {
         case 0:
            this.class_.catch_ = var2;
            break;
         case 1:
            this.class_.private_ = var2;
            break;
         case 2:
            this.class_.implements_ = var2;
            break;
         case 3:
            this.class_.finally_ = var2;
      }
   }

   @Override
   public int class_(int var1) {
      switch (var1) {
         case 0:
            return this.class_.catch_;
         case 1:
            return this.class_.private_;
         case 2:
            return this.class_.implements_;
         case 3:
            return this.class_.finally_;
         default:
            return 0;
      }
   }
}
