package celestial;

import java.util.Random;

public class NL {
   private final Random class_ = new Random();
   private final QY break_;
   private NQ byte_;
   private int protected_ = 100;

   public NL(QY var1) {
      this.break_ = var1;
   }

   public void class_(NS var1) {
      this.byte_ = Np_1.class_(var1.class_());
      if (this.byte_.catch_() != Nf_1.class_) {
         this.break_.c().class_(this.byte_);
      }

      this.protected_ = Integer.MAX_VALUE;
   }

   public void class_() {
      NS var1 = this.break_.try_();
      if (this.byte_ != null) {
         if (!var1.class_().class_().equals(this.byte_.case_()) && var1.protected_()) {
            this.break_.c().break_(this.byte_);
            this.protected_ = rfU_2.class_(this.class_, 0, var1.break_() / 2);
         }

         if (!this.break_.c().byte_(this.byte_)) {
            this.byte_ = null;
            this.protected_ = Math.min(this.protected_, rfU_2.class_(this.class_, var1.break_(), var1.byte_()));
         }
      }

      this.protected_ = Math.min(this.protected_, var1.byte_());
      if (this.byte_ == null && this.protected_-- <= 0) {
         this.class_(var1);
      }
   }

   public void break_() {
      if (this.byte_ != null) {
         this.break_.c().break_(this.byte_);
         this.byte_ = null;
      }

      this.protected_ += 100;
   }

   public boolean break_(NS var1) {
      return this.byte_ == null ? false : var1.class_().class_().equals(this.byte_.case_());
   }
}
