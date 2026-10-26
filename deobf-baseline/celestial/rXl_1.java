package celestial;

public class rXl_1 implements rXu_1 {
   private final rsA_2 id_class;
   private final rqs_3<rdn_3> id_break = rqs_3.id_class(3, rdn_3.id_break);
   private rdI_2 id_byte;
   private int id_protected;
   private int id_throws;

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_class.id_class() == var1;
   }

   public void id_byte() {
      this.id_byte = null;
      rdn_3 var1;
      rdn_3 var2;
      if (this.id_break.get(0).id_class()) {
         var1 = this.id_break.get(1);
         var2 = rdn_3.id_break;
      } else {
         var1 = this.id_break.get(0);
         var2 = this.id_break.get(1);
      }

      if (var1.id_class()) {
         this.id_break(2, rdn_3.id_break);
         this.id_throws = 0;
      } else {
         rdf_3 var3 = this.id_class.id_break();
         if (!var3.isEmpty()) {
            rdI_2 var4 = var3.id_class(var1, var2, this.id_protected);
            if (var4 == null || var4.id_int()) {
               this.id_byte = var4;
               var4 = var3.id_class(var2, var1, this.id_protected);
            }

            if (var4 != null && !var4.id_int()) {
               this.id_byte = var4;
               this.id_break(2, var4.id_case());
               this.id_throws = var4.id_package();
            } else {
               this.id_break(2, rdn_3.id_break);
               this.id_throws = 0;
            }
         }

         this.id_class.id_class(this.id_extends(2));
      }
   }

   public rXl_1(rsA_2 var1) {
      this.id_class = var1;
   }

   public void id_class(int var1) {
      this.id_protected = var1;
      this.id_byte();
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      rdn_3 var3 = this.id_break.get(var1);
      if (var1 == 2 && !var3.id_class()) {
         return rXC.id_class(this.id_break, var1, var3.id_char());
      } else {
         rdn_3 var4 = rXC.id_class(this.id_break, var1, var2);
         if (!var4.id_class() && this.id_break(var1)) {
            this.id_byte();
         }

         return var4;
      }
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_break.set(var1, var2);
      if (!var2.id_class() && var2.id_char() > this.ab_()) {
         var2.id_throws(this.ab_());
      }

      if (this.id_break(var1)) {
         this.id_byte();
      }
   }

   @Override
   public void id_break() {
      this.id_byte();
   }

   private boolean id_break(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public int id_throws() {
      return this.id_throws;
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return this.id_break.get(var1);
   }

   @Override
   public int id_else() {
      return this.id_break.size();
   }

   @Override
   public boolean id_return() {
      for (rdn_3 var2 : this.id_break) {
         if (!var2.id_class()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void id_public() {
      this.id_break.clear();
   }

   public rdI_2 id_protected() {
      return this.id_byte;
   }

   @Override
   public rdn_3 id_native(int var1) {
      return rXC.id_class(this.id_break, var1);
   }
}
