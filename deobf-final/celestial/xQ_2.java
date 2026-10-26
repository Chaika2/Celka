package celestial;

public class xQ_2 {
   private final rfH_2 class_;
   private final xd_3 break_;
   private final int byte_;
   private final int protected_;

   public int byte_() {
      return this.byte_;
   }

   public xQ_2(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof xQ_2 var2)
         ? false
         : this.class_.equals(var2.class_) && this.byte_ == var2.byte_ && this.protected_ == var2.protected_ && this.break_ == var2.break_;
   }

   @Override
   public String toString() {
      return "TE(" + this.class_ + ")," + this.byte_ + "," + this.protected_ + "," + this.break_;
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_.hashCode();
      var1 = 31 * var1 + this.byte_;
      return 31 * var1 + this.protected_;
   }

   public rfH_2 class_() {
      return this.class_;
   }

   public xd_3 break_() {
      return this.break_;
   }

   public int protected_() {
      return this.protected_;
   }
}
