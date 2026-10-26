package celestial;

public class rSk_1 extends rBU {
   protected final float id_private;

   public rSk_1(aA_2 var1, double var2) {
      this(var1, var2, 0.001F);
   }

   public rSk_1(aA_2 var1, double var2, float var4) {
      super(var1, var2);
      this.id_private = var4;
   }

   @Override
   protected rjU_2 id_catch() {
      if (this.id_class.Pa()) {
         rjU_2 var1 = iX_2.id_break(this.id_class, 15, 7);
         return var1 == null ? super.id_catch() : var1;
      } else {
         return this.id_class.Sa().nextFloat() >= this.id_private ? iX_2.id_break(this.id_class, 10, 7) : super.id_catch();
      }
   }
}
