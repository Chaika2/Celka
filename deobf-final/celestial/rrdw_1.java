package celestial;

import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class rrdw_1 {
   private int class_ = 0;
   private String break_ = null;
   private String[] byte_ = null;
   private String protected_ = null;
   private String[] throws_ = null;
   private int case_ = 0;

   public String byte_() {
      return this.byte_[this.case_];
   }

   public rrdw_1(String var1, String[] var2, String var3, String[] var4, int var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.class_ = var5;
      if (var2.length != var4.length) {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      } else if (var5 >= 0 && var5 < var2.length) {
         this.case_ = var5;
      } else {
         throw new IllegalArgumentException("Invalid default value: " + var5);
      }
   }

   @Override
   public String toString() {
      return this.break_ + "=" + this.byte_() + " [" + rrbb_3.class_(this.byte_) + "], value: " + this.case_;
   }

   public boolean class_(String var1) {
      if (var1 == null) {
         this.case_ = this.class_;
         return false;
      } else {
         this.case_ = ArrayUtils.indexOf(this.byte_, var1);
         if (this.case_ >= 0 && this.case_ < this.byte_.length) {
            return true;
         } else {
            this.case_ = this.class_;
            return false;
         }
      }
   }

   public void class_(boolean var1) {
      byte var2 = 0;
      int var3 = this.byte_.length - 1;
      this.case_ = rrbb_3.class_(this.case_, var2, var3);
      if (var1) {
         this.case_++;
         if (this.case_ > var3) {
            this.case_ = var2;
         }
      } else {
         this.case_--;
         if (this.case_ < var2) {
            this.case_ = var3;
         }
      }
   }

   public boolean class_(Properties var1) {
      this.case_();
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.getProperty(this.break_);
         return var2 == null ? false : this.class_(var2);
      }
   }

   public void class_(int var1) {
      this.case_ = var1;
      if (this.case_ < 0 || this.case_ >= this.byte_.length) {
         this.case_ = this.class_;
      }
   }

   public int class_() {
      return this.case_;
   }

   public void break_(Properties var1) {
      if (var1 != null) {
         var1.setProperty(this.throws_(), this.byte_());
      }
   }

   public String break_() {
      return this.throws_[this.case_];
   }

   public String throws_() {
      return this.break_;
   }

   public void case_() {
      this.case_ = this.class_;
   }

   public String protected_() {
      return this.protected_;
   }
}
