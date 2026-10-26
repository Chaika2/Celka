package celestial;

import java.util.EnumSet;

class rMk_1 extends rMr_1 {
   private double id_byte;
   private double id_protected;
   private int id_throws;
   private int id_case;

   @Override
   public void id_byte() {
      this.id_finally();
      this.id_case = 2 + this.id_break.Sa().nextInt(3);
      this.id_break.id_this(true);
      this.id_break.id_public().id_final();
   }

   public rMk_1(rba_3 var1) {
      super(var1);
      this.id_break = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_break.Sr() == null
         && this.id_break.Sa().nextFloat() < 0.02F
         && !this.id_break.Sc()
         && this.id_break.I_() == null
         && this.id_break.id_public().id_native()
         && !this.id_private()
         && !this.id_break.sd()
         && !this.id_break.x();
   }

   @Override
   public boolean id_break() {
      return this.id_case > 0;
   }

   @Override
   public void id_throws() {
      this.id_throws--;
      if (this.id_throws <= 0) {
         this.id_case--;
         this.id_finally();
      }

      this.id_break
         .id_continue()
         .id_class(
            this.id_break.rx() + this.id_byte, this.id_break.rH(), this.id_break.BO() + this.id_protected, (float)this.id_break.S(), (float)this.id_break.r()
         );
   }

   private void id_finally() {
      double var1 = (Math.PI * 2) * this.id_break.Sa().nextDouble();
      this.id_byte = Math.cos(var1);
      this.id_protected = Math.sin(var1);
      this.id_throws = 80 + this.id_break.Sa().nextInt(20);
   }

   @Override
   public void id_protected() {
      this.id_break.id_this(false);
   }
}
