package celestial;

public class rNz_1 extends rzh_3<rNz_1> {
   private final rWK class_;
   private boolean break_;

   public rNz_1(rWK var1) {
      this.class_ = var1;
   }

   protected rNz_1 throws_() {
      return this;
   }

   public rNz_1 catch_() {
      this.break_ = true;
      return this;
   }

   @Override
   public rNL case_() {
      return new rNW(this.byte_(), this.class_, this.break_);
   }
}
