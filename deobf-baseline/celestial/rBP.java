package celestial;

import java.util.EnumSet;
import java.util.List;

public class rBP extends rBk_1 {
   private static final ay_3 id_protected = new ay_3().id_class(8.0).id_class().id_break().id_byte();
   protected final rbZ_2 id_class;
   private final Class<? extends rbZ_2> id_throws;
   protected final rYB id_break;
   protected rbZ_2 id_byte;
   private int id_case;
   private final double id_catch;

   public rBP(rbZ_2 var1, double var2) {
      this(var1, var2, (Class<? extends rbZ_2>)var1.getClass());
   }

   public rBP(rbZ_2 var1, double var2, Class<? extends rbZ_2> var4) {
      this.id_class = var1;
      this.id_break = (rYB)var1.id_throws[7];
      this.id_throws = var4;
      this.id_catch = var2;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.sQ()) {
         return false;
      } else {
         this.id_byte = this.id_private();
         return this.id_byte != null;
      }
   }

   @Override
   public boolean id_break() {
      return this.id_byte.BM() && this.id_byte.sQ() && this.id_case < 60;
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_byte, 10.0F, (float)this.id_class.r());
      this.id_class.id_public().id_class(this.id_byte, this.id_catch);
      this.id_case++;
      if (this.id_case >= 60 && this.id_class.id_int(this.id_byte) < 9.0) {
         this.id_catch();
      }
   }

   protected void id_catch() {
      this.id_class.id_class((rrEm_1)this.id_break, this.id_byte);
   }

   @Override
   public void id_protected() {
      this.id_byte = null;
      this.id_case = 0;
   }

   private rbZ_2 id_private() {
      List var1 = this.id_break.id_class(this.id_throws, id_protected, this.id_class, this.id_class.rN().id_class(8.0));
      double var2 = Double.MAX_VALUE;
      rbZ_2 var4 = null;

      for (rbZ_2 var6 : var1) {
         if (this.id_class.id_class(var6) && this.id_class.id_int(var6) < var2) {
            var4 = var6;
            var2 = this.id_class.id_int(var6);
         }
      }

      return var4;
   }
}
