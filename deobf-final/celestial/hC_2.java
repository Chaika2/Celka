package celestial;

public class hC_2 {
   private Boolean class_;
   private Boolean break_;
   private Boolean byte_;
   private Boolean protected_;
   private Boolean throws_;
   private Boolean case_;
   private Boolean catch_;
   private Boolean private_;
   private hY_2 implements_ = hY_2.class_;
   private hY_2 finally_ = hY_2.class_;

   public hC_2 class_(hK_2 var1) {
      this.implements_ = var1.break_();
      return this;
   }

   public hC_2 class_(Boolean var1) {
      this.class_ = var1;
      return this;
   }

   public static hC_2 class_() {
      return new hC_2();
   }

   public hn_3 break_() {
      return new hn_3(
         this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_, this.finally_
      );
   }

   public hC_2 break_(Boolean var1) {
      this.private_ = var1;
      return this;
   }
}
