package celestial;

public class rJq_1 extends rJY {
   private final rXl_1 id_class;
   private final rhd_3 id_break;
   private int id_catch;
   private final rsA_2 id_private;

   public rJq_1(rhd_3 var1, rsA_2 var2, rXl_1 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.id_break = var1;
      this.id_private = var2;
      this.id_class = var3;
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      this.b_(var2);
      rdI_2 var3 = this.id_class.id_protected();
      if (var3 != null) {
         rdn_3 var4 = this.id_class.id_extends(0);
         rdn_3 var5 = this.id_class.id_extends(1);
         if (var3.id_break(var4, var5) || var3.id_break(var5, var4)) {
            this.id_private.id_class(var3);
            var1.id_break(rlB_2.id_double);
            this.id_class.id_break(0, var4);
            this.id_class.id_break(1, var5);
         }

         this.id_private.id_class(this.id_private.id_protected() + var3.id_package());
      }

      return var2;
   }

   @Override
   protected void id_class(rdn_3 var1, int var2) {
      this.id_catch += var2;
      this.b_(var1);
   }

   @Override
   public rdn_3 id_class(int var1) {
      if (this.id_break()) {
         this.id_catch = this.id_catch + Math.min(var1, this.id_class().id_char());
      }

      return super.id_class(var1);
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return false;
   }

   @Override
   protected void b_(rdn_3 var1) {
      var1.id_class((rYB)this.id_break.id_throws[7], this.id_break, this.id_catch);
      this.id_catch = 0;
   }
}
