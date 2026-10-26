package celestial;

public class rrbK_2 {
   private int class_;
   private int break_ = 0;
   private int byte_ = 0;
   private boolean protected_ = false;
   private boolean throws_ = false;

   public rrbK_2(int var1) {
      this.class_ = var1;
   }

   public void class_() {
      if (this.byte_ > 0) {
         rrbb_3.throws_("Suppressed " + this.break_ + " OpenGL errors: " + this.class_);
      }

      this.protected_ = this.break_ > 10;
      this.break_ = 0;
      this.byte_ = 0;
      this.throws_ = true;
   }

   public boolean break_() {
      this.break_++;
      if (this.throws_) {
         this.throws_ = false;
         return true;
      } else {
         if (this.protected_) {
            this.byte_++;
         }

         return !this.protected_;
      }
   }
}
