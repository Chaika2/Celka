package celestial;

import java.util.List;

public class rsc_3 extends rsQ_2 implements rHI {
   private boolean id_protected = true;
   private int id_catch = -1;
   private final rfH_2 id_private = rfH_2.id_protected;

   public boolean id_char() {
      return this.id_catch > 0;
   }

   public void id_byte(boolean var1) {
      this.id_protected = var1;
   }

   @Override
   public xc_3 id_int() {
      return xu_3.sl.id_continue();
   }

   public rsc_3(aI_2<? extends rsc_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rsc_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.S, var2, var4, var6, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.id_goto()) {
         rfH_2 var1 = this.Bs();
         if (var1.equals(this.id_private)) {
            this.id_catch--;
         } else {
            this.id_volatile(0);
         }

         if (!this.id_char()) {
            this.id_volatile(0);
            if (this.id_interface()) {
               this.id_volatile(4);
               this.id_break();
            }
         }
      }
   }

   public boolean id_interface() {
      if (rHt_1.id_class((rHI)this)) {
         return true;
      } else {
         List var1 = ((rYB)this.id_throws[7]).id_class(rsE_2.class, this.rN().id_byte(0.25, 0.0, 0.25), rpJ_2.id_class);
         if (!var1.isEmpty()) {
            rHt_1.id_class(this, (rsE_2)var1.get(0));
         }

         return false;
      }
   }

   @Override
   public rJr_1 id_class(int var1, rhz_3 var2) {
      return new rJz_1(var1, var2, this);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("TransferCooldown", this.id_catch);
      var1.id_class("Enabled", this.id_protected);
   }

   @Override
   public void id_class(int var1, int var2, int var3, boolean var4) {
      boolean var5 = !var4;
      if (var5 != this.id_goto()) {
         this.id_byte(var5);
      }
   }

   @Override
   protected void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_catch = var1.id_private("TransferCooldown");
      this.id_protected = var1.id_throws("Enabled") ? var1.id_new("Enabled") : true;
   }

   @Override
   public void id_break(rye_3 var1) {
      super.id_break(var1);
      if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
         this.id_class(xu_3.sl);
      }
   }

   public boolean id_goto() {
      return this.id_protected;
   }

   @Override
   public int id_continue() {
      return 1;
   }

   @Override
   public int id_else() {
      return 5;
   }

   @Override
   public double id_instanceof() {
      return this.re() + 0.5;
   }

   @Override
   public double id_throw() {
      return this.BO();
   }

   @Override
   public double id_try() {
      return this.rx();
   }

   @Override
   public rYB id_while() {
      return (rYB)this.id_throws[7];
   }

   @Override
   public rsd_3 id_final() {
      return rsd_3.HOPPER;
   }

   public void id_volatile(int var1) {
      this.id_catch = var1;
   }
}
