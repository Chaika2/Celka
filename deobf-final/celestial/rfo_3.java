package celestial;

public class rfo_3 extends rjG_2 {
   private final an_3 break_;
   private rpr_3 byte_;

   @Override
   public rjM_2 byte_() {
      return rjM_2.ENTITY;
   }

   public rfo_3(an_3 var1) {
      this(var1, rpr_3.UP, var1.Ps());
   }

   public rfo_3(an_3 var1, rpr_3 var2, rjU_2 var3) {
      super(var3);
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rfo_3(an_3 var1, rjU_2 var2) {
      super(var2);
      this.break_ = var1;
   }

   public an_3 class_() {
      return this.break_;
   }

   public rpr_3 break_() {
      return this.byte_;
   }

   @Override
   public rrTj_1 protected_() {
      return this.break_;
   }
}
