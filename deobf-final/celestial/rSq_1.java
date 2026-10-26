package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSq_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final rSu_1 break_;
   private final rSl_1[] byte_ = new rSl_1[rST.byte_()];
   private rSl_1 protected_;

   public rSq_1(rSu_1 var1) {
      this.break_ = var1;
      this.class_(rST.extends_);
   }

   public void class_(rST<?> var1) {
      if (this.protected_ == null || var1 != this.protected_.protected_()) {
         if (this.protected_ != null) {
            this.protected_.catch_();
         }

         this.protected_ = this.break_(var1);
         if (!((rYB)this.break_.throws_[7]).continue_) {
            this.break_.BQ().break_(rSu_1.class_, var1.break_());
         }

         class_.debug("Dragon is now in phase {} on the {}", var1, ((rYB)this.break_.throws_[7]).continue_ ? "client" : "server");
         this.protected_.byte_();
      }
   }

   public rSl_1 class_() {
      return this.protected_;
   }

   public <T extends rSl_1> T break_(rST<T> var1) {
      int var2 = var1.break_();
      if (this.byte_[var2] == null) {
         this.byte_[var2] = var1.class_(this.break_);
      }

      return (T)this.byte_[var2];
   }
}
