package celestial;

public class rNc_1 extends rzh_3<rNc_1> {
   private rrrZ<?> class_ = rNN.break_;
   private rrGh_1 break_ = rNN.byte_;
   private byte byte_ = 2;
   private int protected_ = 50;
   private boolean throws_ = true;

   public rNc_1 class_(rrGh_1 var1) {
      this.break_ = var1;
      return this;
   }

   public rNc_1 class_(byte var1) {
      this.byte_ = var1;
      return this;
   }

   public rNc_1 class_(boolean var1) {
      this.throws_ = var1;
      return this;
   }

   public rNc_1 class_(rrrZ<?> var1) {
      this.class_ = var1;
      return this;
   }

   protected rNc_1 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rNN(this.byte_(), this.class_, this.break_, this.byte_, this.protected_, this.throws_);
   }
}
