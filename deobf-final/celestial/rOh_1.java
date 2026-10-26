package celestial;

public abstract class rOh_1 extends rOQ {
   private int super_;

   protected rOh_1(aI_2<? extends rOh_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      this.super_++;
      super.this_();
   }

   public boolean sd() {
      return this.super_ > 100;
   }

   public boolean protected_(rhN_2 var1) {
      rcd_3 var2 = new rcd_3();
      var2.class_("id", this.rW());
      this.case_(var2);
      if (var1.private_(var2)) {
         this.PD();
         return true;
      } else {
         return false;
      }
   }
}
