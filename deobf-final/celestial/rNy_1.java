package celestial;

public class rNy_1 extends rzh_3<rNy_1> {
   private final rzV_2 class_;
   private int break_ = 0;

   public rNy_1(rzV_2 var1) {
      this.class_ = var1;
   }

   public rNy_1 class_(int var1) {
      this.break_ = var1;
      return this;
   }

   protected rNy_1 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rNH(this.byte_(), this.class_, this.break_);
   }
}
