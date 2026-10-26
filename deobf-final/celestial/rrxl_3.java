package celestial;

public class rrxl_3 {
   private int class_ = -1;
   private int break_ = 0;
   private rrWo_1<rrxl_3> byte_ = new rrWo_1<>(this);

   public int byte_() {
      return this.class_ + this.break_;
   }

   @Override
   public String toString() {
      return this.class_ + "/" + this.break_ + "/" + (this.class_ + this.break_);
   }

   public void class_(int var1) {
      this.class_ = var1;
   }

   public int class_() {
      return this.class_;
   }

   public void break_(int var1) {
      this.break_ = var1;
   }

   public int break_() {
      return this.break_;
   }

   public rrxl_3 throws_() {
      rrWo_1 var1 = this.byte_.break_();
      return var1 == null ? null : (rrxl_3)var1.class_();
   }

   public rrxl_3 case_() {
      rrWo_1 var1 = this.byte_.byte_();
      return var1 == null ? null : (rrxl_3)var1.class_();
   }

   public rrWo_1<rrxl_3> protected_() {
      return this.byte_;
   }
}
