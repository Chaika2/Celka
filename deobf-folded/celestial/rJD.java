package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rJD extends rJr_1 {
   private final rpq_3 id_protected;
   private final rpj_3 id_catch = rpj_3.id_class();
   private final rYB id_private;
   private List<rWu_1> id_implements = Lists.newArrayList();
   private rdn_3 id_finally = rdn_3.id_break;
   long id_extends;
   final rJY id_class;
   final rJY id_break;
   Runnable id_native = () -> {
   };
   public final rXu_1 id_byte = new rJU(this, 1);
   final rXd_1 id_volatile = new rXd_1();

   public int id_byte() {
      return this.id_implements.size();
   }

   public rJD(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJD(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_public, var1);
      this.id_protected = var3;
      this.id_private = (rYB)var2.id_throws.id_throws[7];
      this.id_class = this.id_break(new rJY(this.id_byte, 0, 20, 33));
      this.id_break = this.id_break(new rJe_1(this, this.id_volatile, 1, 143, 33, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.id_break(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_break(new rJY(var2, var6, 8 + var6 * 18, 142));
      }

      this.id_class(this.id_catch);
   }

   public void id_class(Runnable var1) {
      this.id_native = var1;
   }

   @Override
   public void id_class(rXu_1 var1) {
      rdn_3 var2 = this.id_class.id_class();
      if (var2.id_break() != this.id_finally.id_break()) {
         this.id_finally = var2.id_implements();
         this.id_class(var1, var2);
      }
   }

   private void id_class(rXu_1 var1, rdn_3 var2) {
      this.id_implements.clear();
      this.id_catch.id_class(-1);
      this.id_break.id_break(rdn_3.id_break);
      if (!var2.id_class()) {
         this.id_implements = this.id_private.id_implements().id_break(rkj_3.id_case, var1, this.id_private);
      }
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return var2.id_byte != this.id_volatile && super.id_class(var1, var2);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         rdb_3 var6 = var5.id_break();
         var3 = var5.id_implements();
         if (var2 == 1) {
            var6.id_break(var5, (rYB)var1.id_throws[7], var1);
            if (!this.id_class(var5, 2, 38, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 == 0) {
            if (!this.id_class(var5, 2, 38, false)) {
               return rdn_3.id_break;
            }
         } else if (this.id_private.id_implements().id_class(rkj_3.id_case, new rXA(var5), this.id_private).isPresent()) {
            if (!this.id_class(var5, 0, 1, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 2 && var2 < 29) {
            if (!this.id_class(var5, 29, 38, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 29 && var2 < 38 && !this.id_class(var5, 2, 29, false)) {
            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         }

         var4.id_byte();
         if (var5.id_char() == var3.id_char()) {
            return rdn_3.id_break;
         }

         var4.id_class(var1, var5);
         this.id_native();
      }

      return var3;
   }

   public int id_class() {
      return this.id_catch.id_break();
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_protected, var1, xu_3.XG);
   }

   @Override
   public boolean id_break(rhd_3 var1, int var2) {
      if (this.id_protected(var2)) {
         this.id_catch.id_class(var2);
         this.id_throws();
      }

      return true;
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_volatile.id_native(1);
      this.id_protected.id_class((var2, var3) -> this.id_class(var1, (rYB)var1.id_throws[7], this.id_byte));
   }

   public List<rWu_1> id_break() {
      return this.id_implements;
   }

   void id_throws() {
      if (!this.id_implements.isEmpty() && this.id_protected(this.id_catch.id_break())) {
         rWu_1 var1 = this.id_implements.get(this.id_catch.id_break());
         this.id_volatile.id_class(var1);
         this.id_break.id_break(var1.id_class(this.id_byte));
      } else {
         this.id_break.id_break(rdn_3.id_break);
      }

      this.id_native();
   }

   @Override
   public rJP<?> id_finally() {
      return rJP.id_public;
   }

   private boolean id_protected(int var1) {
      return var1 >= 0 && var1 < this.id_implements.size();
   }

   public boolean id_protected() {
      return this.id_class.id_break() && !this.id_implements.isEmpty();
   }
}
