package celestial;

public class rrxf_3 {
   private final String class_;
   private final rrdM break_;
   private int byte_;
   private int protected_;
   private rja_3 throws_;
   private rja_3 case_;
   private rjK_2 catch_;
   private int private_;

   public void byte_() {
      this.throws_ = null;
      this.case_ = null;
      this.catch_ = null;
   }

   public void byte_(int var1) {
      this.private_ = var1;
   }

   public rrxf_3(String var1, rrdM var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return "name: " + this.class_ + ", id: " + this.byte_;
   }

   public void class_(rja_3 var1) {
      this.throws_ = var1;
   }

   public void class_(rjK_2 var1) {
      this.catch_ = var1;
   }

   public void class_() {
   }

   public void class_(int var1) {
      this.byte_ = var1;
   }

   public void break_(int var1) {
      this.protected_ = var1;
   }

   public void break_(rja_3 var1) {
      this.case_ = var1;
   }

   public void break_() {
      this.byte_ = 0;
      this.protected_ = 0;
   }

   public rrdM throws_() {
      return this.break_;
   }

   public rjK_2 finally_() {
      return this.catch_;
   }

   public int catch_() {
      return this.protected_;
   }

   public int extends_() {
      return this.private_;
   }

   public int case_() {
      return this.byte_;
   }

   public rja_3 implements_() {
      return this.case_;
   }

   public String protected_() {
      return this.class_;
   }

   public rja_3 private_() {
      return this.throws_;
   }

   public boolean native_() {
      return this.private_ != 0;
   }
}
