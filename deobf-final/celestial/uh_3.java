package celestial;

class uh_3 {
   final int class_;
   final int break_;
   private final int byte_;
   private final int protected_;
   private uh_3 throws_;
   private uh_3 case_;
   private boolean catch_;

   uh_3(int var1, int var2, int var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   uh_3 class_(uJ_2 var1) {
      if (this.throws_ != null && this.case_ != null) {
         uh_3 var6 = this.throws_.class_(var1);
         if (var6 == null) {
            var6 = this.case_.class_(var1);
         }

         return var6;
      } else if (this.catch_) {
         return null;
      } else {
         int var2 = var1.class_();
         int var3 = var1.break_();
         if (var2 > this.byte_ || var3 > this.protected_) {
            return null;
         } else if (var2 == this.byte_ && var3 == this.protected_) {
            this.catch_ = true;
            return this;
         } else {
            int var4 = this.byte_ - var2;
            int var5 = this.protected_ - var3;
            if (var4 > var5) {
               this.throws_ = new uh_3(this.class_, this.break_, var2, this.protected_);
               this.case_ = new uh_3(this.class_ + var2 + 1, this.break_, this.byte_ - var2 - 1, this.protected_);
            } else {
               this.throws_ = new uh_3(this.class_, this.break_, this.byte_, var3);
               this.case_ = new uh_3(this.class_, this.break_ + var3 + 1, this.byte_, this.protected_ - var3 - 1);
            }

            return this.throws_.class_(var1);
         }
      }
   }
}
