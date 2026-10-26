package celestial;

import java.util.EnumSet;

public class rBC extends rBk_1 {
   private final is_3 id_class;
   private double id_break;
   private double id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      double var1 = (Math.PI * 2) * this.id_class.Sa().nextDouble();
      this.id_break = Math.cos(var1);
      this.id_byte = Math.sin(var1);
      this.id_protected = 20 + this.id_class.Sa().nextInt(20);
   }

   public rBC(is_3 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_class.Sa().nextFloat() < 0.02F;
   }

   @Override
   public boolean id_break() {
      return this.id_protected >= 0;
   }

   @Override
   public void id_throws() {
      this.id_protected--;
      this.id_class.id_continue().id_class(this.id_class.rx() + this.id_break, this.id_class.rH(), this.id_class.BO() + this.id_byte);
   }
}
