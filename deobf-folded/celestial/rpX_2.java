package celestial;

public class rpX_2 extends rye_3 {
   protected final an_3 id_return;
   private boolean id_public;

   public rpX_2(String var1, an_3 var2) {
      super(var1);
      this.id_return = var2;
   }

   @Override
   public String toString() {
      return "EntityDamageSource (" + this.id_return + ")";
   }

   @Override
   public rgP_2 id_class(iB_2 var1) {
      rdn_3 var2 = this.id_return instanceof iB_2 ? ((iB_2)this.id_return).ss() : rdn_3.id_break;
      String var3 = "death.attack." + this.id_synchronized;
      return !var2.id_class() && var2.id_this()
         ? new rgn_3(var3 + ".item", var1.L_(), this.id_return.L_(), var2.id_throw())
         : new rgn_3(var3, var1.L_(), this.id_return.L_());
   }

   @Override
   public an_3 id_extends() {
      return this.id_return;
   }

   public boolean id_goto() {
      return this.id_public;
   }

   @Override
   public rjU_2 id_return() {
      return this.id_return != null ? this.id_return.Ps() : null;
   }

   @Override
   public boolean id_super() {
      return this.id_return != null && this.id_return instanceof iB_2 && !(this.id_return instanceof rhd_3);
   }

   public rpX_2 id_public() {
      this.id_public = true;
      return this;
   }
}
