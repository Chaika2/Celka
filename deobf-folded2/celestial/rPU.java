package celestial;

import java.util.EnumSet;

public class rPU extends rBk_1 {
   private final rOH id_class;
   private rhd_3 id_break;
   private final rYB id_byte;
   private final float id_protected;
   private int id_throws;
   private final ay_3 id_case;

   @Override
   public void id_byte() {
      this.id_class.id_this(true);
      this.id_throws = 40 + this.id_class.Sa().nextInt(40);
   }

   public rPU(rOH var1, float var2) {
      this.id_class = var1;
      this.id_byte = (rYB)var1.id_throws[7];
      this.id_protected = var2;
      this.id_case = new ay_3().id_class((double)var2).id_class().id_break().id_protected();
      this.id_class(EnumSet.of(rBW.LOOK));
   }

   private boolean id_class(rhd_3 var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         rdn_3 var6 = var1.id_protected(var5);
         if (this.id_class.sZ() && var6.id_break() == rdy_3.XR) {
            return true;
         }

         if (this.id_class.id_extends(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean id_class() {
      this.id_break = this.id_byte.id_class(this.id_case, this.id_class);
      return this.id_break == null ? false : this.id_class(this.id_break);
   }

   @Override
   public boolean id_break() {
      if (!this.id_break.BM()) {
         return false;
      } else {
         return this.id_class.id_int(this.id_break) > (double)(this.id_protected * this.id_protected)
            ? false
            : this.id_throws > 0 && this.id_class(this.id_break);
      }
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_break.rx(), this.id_break.rH(), this.id_break.BO(), 10.0F, (float)this.id_class.r());
      this.id_throws--;
   }

   @Override
   public void id_protected() {
      this.id_class.id_this(false);
      this.id_break = null;
   }
}
