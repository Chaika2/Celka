package celestial;

public class rJX extends rJY {
   private final rhd_3 id_class;
   private int id_break;

   public rJX(rhd_3 var1, rXu_1 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.id_class = var1;
   }

   @Override
   protected void id_class(rdn_3 var1, int var2) {
      this.id_break += var2;
      this.b_(var1);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      this.b_(var2);
      super.id_class(var1, var2);
      return var2;
   }

   @Override
   public rdn_3 id_class(int var1) {
      if (this.id_break()) {
         this.id_break = this.id_break + Math.min(var1, this.id_class().id_char());
      }

      return super.id_class(var1);
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return false;
   }

   @Override
   protected void b_(rdn_3 var1) {
      var1.id_class((rYB)this.id_class.id_throws[7], this.id_class, this.id_break);
      if (!((rYB)this.id_class.id_throws[7]).id_continue && this.id_byte instanceof rHS) {
         ((rHS)this.id_byte).id_protected(this.id_class);
      }

      this.id_break = 0;
   }
}
