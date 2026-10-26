package celestial;

class riz_3 {
   final int class_;
   final riz_3[] break_ = new riz_3[6];
   final boolean[] byte_ = new boolean[6];
   boolean protected_;
   boolean throws_;
   private int case_;

   public int byte_() {
      int var1 = 0;

      for (int var2 = 0; var2 < 6; var2++) {
         if (this.byte_[var2]) {
            var1++;
         }
      }

      return var1;
   }

   public riz_3(int var1) {
      this.class_ = var1;
   }

   public boolean class_(int var1) {
      if (this.throws_) {
         return true;
      } else {
         this.case_ = var1;

         for (int var2 = 0; var2 < 6; var2++) {
            if (this.break_[var2] != null && this.byte_[var2] && this.break_[var2].case_ != var1 && this.break_[var2].class_(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public void class_(rpr_3 var1, riz_3 var2) {
      this.break_[var1.byte_()] = var2;
      var2.break_[var1.case_().byte_()] = this;
   }

   public void class_() {
      for (int var1 = 0; var1 < 6; var1++) {
         this.byte_[var1] = this.break_[var1] != null;
      }
   }

   public boolean break_() {
      return this.class_ >= 75;
   }
}
