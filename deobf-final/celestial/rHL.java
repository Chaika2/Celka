package celestial;

public class rHL extends ryO_2 {
   private int class_;

   public rHL() {
      super(ryW_2.continue_);
   }

   public void class_(int var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_ = var2.private_("OutputSignal");
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("OutputSignal", this.class_);
      return var1;
   }

   public int throws_() {
      return this.class_;
   }
}
