package celestial;

import java.util.Objects;

public class rrGO {
   private final rrGh_1 class_;
   private byte break_;
   private byte byte_;
   private byte protected_;
   private final rgP_2 throws_;

   public byte byte_() {
      return this.break_;
   }

   public rrGO(rrGh_1 var1, byte var2, byte var3, byte var4, rgP_2 var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rrGO var2)) {
         return false;
      } else if (this.class_ != var2.class_) {
         return false;
      } else if (this.protected_ != var2.protected_) {
         return false;
      } else if (this.break_ != var2.break_) {
         return false;
      } else {
         return this.byte_ != var2.byte_ ? false : Objects.equals(this.throws_, var2.throws_);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.class_();
      var1 = 31 * var1 + this.break_;
      var1 = 31 * var1 + this.byte_;
      var1 = 31 * var1 + this.protected_;
      return 31 * var1 + Objects.hashCode(this.throws_);
   }

   public byte class_() {
      return this.class_.class_();
   }

   public rrGh_1 break_() {
      return this.class_;
   }

   public byte throws_() {
      return this.protected_;
   }

   public rgP_2 catch_() {
      return this.throws_;
   }

   public boolean case_() {
      return this.class_.break_();
   }

   public byte protected_() {
      return this.byte_;
   }
}
