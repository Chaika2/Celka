package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jv_3 {
   private static final Logger class_ = LogManager.getLogger();
   private final jF_2 break_;
   private final jL_2 byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;
   private String catch_;

   public final int byte_() {
      return this.protected_;
   }

   public jv_3(int var1, jF_2 var2, jL_2 var3, int var4) {
      if (this.class_(var1, var3)) {
         this.byte_ = var3;
      } else {
         class_.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
         this.byte_ = jL_2.UV;
      }

      this.break_ = var2;
      this.protected_ = var1;
      this.throws_ = var4;
      this.case_ = var2.class_() * this.throws_;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         jv_3 var2 = (jv_3)var1;
         if (this.throws_ != var2.throws_) {
            return false;
         } else if (this.protected_ != var2.protected_) {
            return false;
         } else {
            return this.break_ != var2.break_ ? false : this.byte_ == var2.byte_;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.catch_ != null ? this.catch_ : this.throws_ + "," + this.byte_.class_() + "," + this.break_.break_();
   }

   @Override
   public int hashCode() {
      int var1 = this.break_.hashCode();
      var1 = 31 * var1 + this.byte_.hashCode();
      var1 = 31 * var1 + this.protected_;
      return 31 * var1 + this.throws_;
   }

   public void class_(long var1, int var3) {
      this.byte_.class_(this.throws_, this.break_.byte_(), var3, var1, this.protected_);
   }

   public void class_(String var1) {
      this.catch_ = var1;
   }

   private boolean class_(int var1, jL_2 var2) {
      return var1 == 0 || var2 == jL_2.UV;
   }

   public final jF_2 class_() {
      return this.break_;
   }

   public final jL_2 break_() {
      return this.byte_;
   }

   public void throws_() {
      this.byte_.class_(this.protected_);
   }

   public String catch_() {
      return this.catch_;
   }

   public final int case_() {
      return this.throws_;
   }

   public final int protected_() {
      return this.case_;
   }
}
