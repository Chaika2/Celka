package celestial;

public class rpX_2 extends rye_3 {
   protected final an_3 return_;
   private boolean public_;

   public rpX_2(String var1, an_3 var2) {
      super(var1);
      this.return_ = var2;
   }

   @Override
   public String toString() {
      return "EntityDamageSource (" + this.return_ + ")";
   }

   @Override
   public rgP_2 class_(iB_2 var1) {
      rdn_3 var2 = this.return_ instanceof iB_2 ? ((iB_2)this.return_).ss() : rdn_3.break_;
      String var3 = "death.attack." + this.synchronized_;
      return !var2.class_() && var2.this_()
         ? new rgn_3(var3 + ".item", var1.L_(), this.return_.L_(), var2.throw_())
         : new rgn_3(var3, var1.L_(), this.return_.L_());
   }

   @Override
   public an_3 extends_() {
      return this.return_;
   }

   public boolean goto_() {
      return this.public_;
   }

   @Override
   public rjU_2 return_() {
      return this.return_ != null ? this.return_.Ps() : null;
   }

   @Override
   public boolean super_() {
      return this.return_ != null && this.return_ instanceof iB_2 && !(this.return_ instanceof rhd_3);
   }

   public rpX_2 public_() {
      this.public_ = true;
      return this;
   }
}
