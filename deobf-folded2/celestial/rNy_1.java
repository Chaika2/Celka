package celestial;

public class rNy_1 extends rzh_3<rNy_1> {
   private final rzV_2 id_class;
   private int id_break = 0;

   public rNy_1(rzV_2 var1) {
      this.id_class = var1;
   }

   public rNy_1 id_class(int var1) {
      this.id_break = var1;
      return this;
   }

   protected rNy_1 id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return new rNH(this.id_byte(), this.id_class, this.id_break);
   }
}
