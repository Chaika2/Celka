package celestial;

public class rrxQ_2 {
   private boolean class_;
   private int break_;

   public boolean byte_() {
      return this.class_;
   }

   public rrxQ_2(boolean var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rrxQ_2(boolean var1) {
      this(var1, 1029);
   }

   public rrxQ_2() {
      this(false, 1029);
   }

   @Override
   public String toString() {
      return "enabled: " + this.class_ + ", mode: " + this.break_;
   }

   public void class_(boolean var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(boolean var1) {
      this.class_ = var1;
   }

   public void class_() {
      this.class_ = true;
   }

   public void class_(rrxQ_2 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
   }

   public void class_(int var1) {
      this.break_ = var1;
   }

   public void break_() {
      this.class_ = false;
   }

   public int protected_() {
      return this.break_;
   }
}
