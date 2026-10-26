package celestial;

import java.util.EnumSet;

class rMW extends rMr_1 {
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_break.id_this(false);
      this.id_break.id_synchronized(false);
      this.id_break.id_return(false);
      this.id_break.id_super(false);
      this.id_break.id_while(true);
      this.id_break.id_public().id_final();
      this.id_break.id_super().id_class(this.id_break.rx(), this.id_break.re(), this.id_break.BO(), 0.0);
   }

   public rMW(rba_3 var1) {
      super(var1);
      this.id_break = var1;
      this.id_byte = rba_3.id_throws(this.id_break).nextInt(140);
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
   }

   @Override
   public boolean id_class() {
      return this.id_break.id_private[42] == 0.0F && this.id_break.id_private[43] == 0.0F && this.id_break.id_private[44] == 0.0F
         ? this.id_finally() || this.id_break.Sc()
         : false;
   }

   @Override
   public boolean id_break() {
      return this.id_finally();
   }

   private boolean id_finally() {
      if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else {
         return ((rYB)this.id_break.id_throws[7]).id_strictfp() && this.id_catch() && !this.id_private();
      }
   }

   @Override
   public void id_protected() {
      this.id_byte = rba_3.id_case(this.id_break).nextInt(140);
      this.id_break.sL();
   }
}
