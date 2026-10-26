package celestial;

import java.util.EnumSet;

class rMG extends rBk_1 {
   @Override
   public void id_byte() {
      this.id_class.id_this(false);
      this.id_class.id_public(false);
   }

   public rMG(rba_3 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.Sc()) {
         return false;
      } else {
         iB_2 var1 = this.id_class.I_();
         return var1 != null
            && var1.BM()
            && rba_3.id_goto.test(var1)
            && this.id_class.id_int(var1) > 36.0
            && !this.id_class.x()
            && !this.id_class.su()
            && !rba_3.id_break(this.id_class);
      }
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_class.I_();
      this.id_class.id_continue().id_class(var1, (float)this.id_class.S(), (float)this.id_class.r());
      if (this.id_class.id_int(var1) <= 36.0) {
         this.id_class.id_return(true);
         this.id_class.id_synchronized(true);
         this.id_class.id_public().id_final();
      } else {
         this.id_class.id_public().id_class(var1, 1.5);
      }
   }

   @Override
   public void id_protected() {
      iB_2 var1 = this.id_class.I_();
      if (var1 != null && rba_3.id_class(this.id_class, var1)) {
         this.id_class.id_return(true);
         this.id_class.id_synchronized(true);
         this.id_class.id_public().id_final();
         this.id_class.id_continue().id_class(var1, (float)this.id_class.S(), (float)this.id_class.r());
      } else {
         this.id_class.id_return(false);
         this.id_class.id_synchronized(false);
      }
   }
}
