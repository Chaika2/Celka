package celestial;

public class rpw_3 extends rpX_2 {
   private final an_3 id_public;

   public rpw_3(String var1, an_3 var2, an_3 var3) {
      super(var1, var2);
      this.id_public = var3;
   }

   @Override
   public rgP_2 id_class(iB_2 var1) {
      rgP_2 var2 = this.id_public == null ? this.id_return.L_() : this.id_public.L_();
      rdn_3 var3 = this.id_public instanceof iB_2 ? ((iB_2)this.id_public).ss() : rdn_3.id_break;
      String var4 = "death.attack." + this.id_synchronized;
      String var5 = var4 + ".item";
      return !var3.id_class() && var3.id_this() ? new rgn_3(var5, var1.L_(), var2, var3.id_throw()) : new rgn_3(var4, var1.L_(), var2);
   }

   @Override
   public an_3 id_finally() {
      return this.id_return;
   }

   @Override
   public an_3 id_extends() {
      return this.id_public;
   }
}
