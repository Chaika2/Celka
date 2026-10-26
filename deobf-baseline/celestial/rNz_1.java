package celestial;

public class rNz_1 extends rzh_3<rNz_1> {
   private final rWK id_class;
   private boolean id_break;

   public rNz_1(rWK var1) {
      this.id_class = var1;
   }

   protected rNz_1 id_throws() {
      return this;
   }

   public rNz_1 id_catch() {
      this.id_break = true;
      return this;
   }

   @Override
   public rNL id_case() {
      return new rNW(this.id_byte(), this.id_class, this.id_break);
   }
}
