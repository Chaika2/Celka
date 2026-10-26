package celestial;

import java.util.Arrays;

public class gS_2 {
   private final char[] class_;
   private int break_;
   private final Runnable byte_;

   public gS_2(char[] var1, Runnable var2) {
      this.byte_ = var2;
      if (var1.length < 1) {
         throw new IllegalArgumentException("Must have at least one char");
      } else {
         this.class_ = var1;
      }
   }

   @Override
   public String toString() {
      return "KeyCombo{chars=" + Arrays.toString(this.class_) + ", matchIndex=" + this.break_ + "}";
   }

   public boolean class_(char var1) {
      if (var1 == this.class_[this.break_++]) {
         if (this.break_ == this.class_.length) {
            this.class_();
            this.byte_.run();
            return true;
         }
      } else {
         this.class_();
      }

      return false;
   }

   public void class_() {
      this.break_ = 0;
   }
}
