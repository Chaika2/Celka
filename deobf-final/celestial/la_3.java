package celestial;

public class la_3 implements Comparable<la_3> {
   private final int class_;
   private final rfH_2 break_;
   private int byte_;
   private int protected_;

   public int byte_() {
      return this.protected_;
   }

   public la_3(int var1, rfH_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         la_3 var2 = (la_3)var1;
         return this.class_ == var2.class_;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.class_);
   }

   public int class_(la_3 var1) {
      return this.byte_ != var1.byte_ ? Integer.compare(this.byte_, var1.byte_) : Integer.compare(this.class_, var1.class_);
   }

   public void class_(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.byte_ = var1;
   }

   public rfH_2 class_() {
      return this.break_;
   }

   public void break_(int var1) {
      this.protected_ = var1;
   }

   public int break_() {
      return this.byte_;
   }
}
