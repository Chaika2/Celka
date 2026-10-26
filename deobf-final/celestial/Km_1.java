package celestial;

class Km_1 {
   private final rjU_2 class_;
   private final an_3 break_;
   private final Rm_1 byte_;

   public Km_1(an_3 var1, Rm_1 var2) {
      this.break_ = var1;
      this.byte_ = var2;
      this.class_ = var2.class_(var1);
   }

   public Km_1(rjU_2 var1) {
      this.break_ = null;
      this.class_ = var1;
      this.byte_ = null;
   }

   public void class_(gy_3 var1, an_3 var2) {
      if (this.break_ != null) {
         if (var2 instanceof rhN_2) {
            ((rhN_2)var2).class_(var1.this_(), this.break_, this.byte_);
         } else {
            var2.class_(var1.this_(), this.class_);
         }
      } else {
         var2.class_(var1.this_(), this.class_);
      }
   }
}
