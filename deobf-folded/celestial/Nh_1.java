package celestial;

public class Nh_1 implements NW {
   private final cb_3 id_class;
   private boolean id_break;
   private boolean id_byte = true;

   public Nh_1(cb_3 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_break() {
      rYB var1 = (rYB)this.id_class.id_throws[7];
      xc_3 var2 = var1.id_byte(this.id_class.rN().id_byte(0.0, -0.4F, 0.0).id_break(0.001))
         .filter(var0 -> var0.id_class(xu_3.hM))
         .findFirst()
         .orElse((xc_3)null);
      if (var2 != null) {
         if (!this.id_break && !this.id_byte && var2.id_class(xu_3.hM) && !this.id_class.id_native()) {
            boolean var3 = var2.id_byte(xv_3.id_volatile);
            if (var3) {
               this.id_class.id_class(rqn_3.rd, 1.0F, 1.0F);
            } else {
               this.id_class.id_class(rqn_3.rJ, 1.0F, 1.0F);
            }
         }

         this.id_break = true;
      } else {
         this.id_break = false;
      }

      this.id_byte = false;
   }
}
