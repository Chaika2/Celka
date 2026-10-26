package celestial;

public class hV_2 {
   private Boolean class_;
   private Boolean break_;
   private Boolean byte_;
   private Boolean protected_;
   private Boolean throws_;

   public hV_2 class_(Boolean var1) {
      this.class_ = var1;
      return this;
   }

   public static hV_2 class_() {
      return new hV_2();
   }

   public hV_2 break_(Boolean var1) {
      this.throws_ = var1;
      return this;
   }

   public hj_3 break_() {
      return new hj_3(this.class_, this.break_, this.byte_, this.protected_, this.throws_);
   }
}
