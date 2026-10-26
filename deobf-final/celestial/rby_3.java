package celestial;

import java.util.EnumSet;

public class rby_3 extends rbq_3 {
   private int byte_;

   @Override
   public void byte_() {
      this.byte_ = 0;
      super.byte_();
   }

   rby_3(rbF_2 var1) {
      super(var1);
      this.class_ = var1;
      this.byte_ = ((rYB)this.class_.throws_[7]).int_.nextInt(10);
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public void throws_() {
      if (this.class_.char_ != null) {
         this.byte_++;
         if (this.byte_ > 600) {
            this.class_.char_ = null;
         } else if (!rbF_2.volatile_(this.class_).volatile_()) {
            if (this.class_.native_(this.class_.char_)) {
               this.class_.char_ = null;
            } else {
               this.class_.finally_(this.class_.char_);
            }
         }
      }
   }

   private boolean finally_() {
      return this.class_.while_ > 2400;
   }

   @Override
   public boolean catch_() {
      return this.class_.char_ != null
         && !this.class_.k()
         && this.finally_()
         && this.class_.volatile_(this.class_.char_)
         && !this.class_.break_(this.class_.char_, 2);
   }

   @Override
   public void protected_() {
      this.byte_ = 0;
      rbF_2.extends_(this.class_).final_();
      rbF_2.native_(this.class_).case_();
   }

   @Override
   public boolean private_() {
      return this.catch_();
   }
}
