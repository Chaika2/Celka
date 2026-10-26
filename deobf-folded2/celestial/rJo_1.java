package celestial;

import java.util.List;

public class rJo_1 extends rXy_1 {
   private final rYB id_catch;
   private rWW id_private;
   private final List<rWW> id_implements;

   public rJo_1(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJo_1(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_else, var1, var2, var3);
      this.id_catch = (rYB)var2.id_throws.id_throws[7];
      this.id_implements = this.id_catch.id_implements().id_class(rkj_3.id_catch);
   }

   @Override
   protected boolean id_class(rdn_3 var1) {
      return this.id_implements.stream().anyMatch(var1x -> var1x.id_class(var1));
   }

   @Override
   public void id_class() {
      List var1 = this.id_catch.id_implements().id_break(rkj_3.id_catch, this.id_break, this.id_catch);
      if (var1.isEmpty()) {
         this.id_class.id_break(0, rdn_3.id_break);
      } else {
         this.id_private = (rWW)var1.get(0);
         rdn_3 var2 = this.id_private.id_class(this.id_break);
         this.id_class.id_class(this.id_private);
         this.id_class.id_break(0, var2);
      }
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return var2.id_byte != this.id_class && super.id_class(var1, var2);
   }

   @Override
   protected boolean id_class(xc_3 var1) {
      return var1.id_class(xu_3.XE);
   }

   @Override
   protected boolean id_class(rhd_3 var1, boolean var2) {
      return this.id_private != null && this.id_private.id_class(this.id_break, this.id_catch);
   }

   @Override
   protected rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      var2.id_class((rYB)var1.id_throws[7], var1, var2.id_char());
      this.id_class.id_class(var1);
      this.id_protected(0);
      this.id_protected(1);
      this.id_byte.id_class((var0, var1x) -> var0.id_byte(1044, var1x, 0));
      return var2;
   }

   private void id_protected(int var1) {
      rdn_3 var2 = this.id_break.id_extends(var1);
      var2.id_catch(1);
      this.id_break.id_break(var1, var2);
   }
}
