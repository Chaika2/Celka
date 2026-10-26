package celestial;

public class rpw_3 extends rpX_2 {
   private final an_3 public_;

   public rpw_3(String var1, an_3 var2, an_3 var3) {
      super(var1, var2);
      this.public_ = var3;
   }

   @Override
   public rgP_2 class_(iB_2 var1) {
      rgP_2 var2 = this.public_ == null ? this.return_.L_() : this.public_.L_();
      rdn_3 var3 = this.public_ instanceof iB_2 ? ((iB_2)this.public_).ss() : rdn_3.break_;
      String var4 = "death.attack." + this.synchronized_;
      String var5 = var4 + ".item";
      return !var3.class_() && var3.this_() ? new rgn_3(var5, var1.L_(), var2, var3.throw_()) : new rgn_3(var4, var1.L_(), var2);
   }

   @Override
   public an_3 finally_() {
      return this.return_;
   }

   @Override
   public an_3 extends_() {
      return this.public_;
   }
}
