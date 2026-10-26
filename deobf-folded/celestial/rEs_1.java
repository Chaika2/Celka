package celestial;

import java.util.EnumSet;

public class rEs_1 extends rBk_1 {
   private final rEB id_break;
   private final float id_byte;
   public final ay_3 id_class = new ay_3().id_class(8.0).id_protected().id_class().id_break().id_byte().id_throws();

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_break.id_public().id_final();

      for (rEB var2 : ((rYB)this.id_break.id_throws[7]).id_class(rEB.class, this.id_class, this.id_break, this.id_break.rN().id_byte(8.0, 8.0, 8.0))) {
         var2.id_byte(this.id_break.I_());
      }
   }

   public rEs_1(rEB var1, rsi_3 var2, float var3) {
      this.id_break = var2;
      this.id_byte = var3 * var3;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_break.Sr();
      return this.id_break.sx() == null && this.id_break.sA() && this.id_break.I_() != null && !this.id_break.v() && (var1 == null || var1.BC() != aI_2.rM);
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_break.I_();
      if (var1 != null) {
         if (this.id_break.id_int(var1) > (double)this.id_byte) {
            this.id_break.id_continue().id_class(var1, 30.0F, 30.0F);
            if (rEB.id_throws(this.id_break).nextInt(50) == 0) {
               this.id_break.id_long();
            }
         } else {
            this.id_break.id_case(true);
         }

         super.id_throws();
      }
   }

   @Override
   public void id_protected() {
      super.id_protected();
      iB_2 var1 = this.id_break.I_();
      if (var1 != null) {
         for (rEB var3 : ((rYB)this.id_break.id_throws[7]).id_class(rEB.class, this.id_class, this.id_break, this.id_break.rN().id_byte(8.0, 8.0, 8.0))) {
            var3.id_byte(var1);
            var3.id_case(true);
         }

         this.id_break.id_case(true);
      }
   }
}
