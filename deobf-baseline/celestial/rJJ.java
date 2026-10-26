package celestial;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class rJJ extends rJr_1 {
   private final rXu_1 id_class = new rXd_1();
   final rXu_1 id_break = new rJx_1(this, 2);
   private final rpq_3 id_byte;

   public rJJ(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJJ(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_package, var1);
      this.id_byte = var3;
      this.id_break(new rJd_1(this, this.id_break, 0, 49, 19));
      this.id_break(new rJk_1(this, this.id_break, 1, 49, 40));
      this.id_break(new rJW(this, this.id_class, 2, 129, 34, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.id_break(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_break(new rJY(var2, var6, 8 + var6 * 18, 142));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         rdn_3 var6 = this.id_break.id_extends(0);
         rdn_3 var7 = this.id_break.id_extends(1);
         if (var2 == 2) {
            if (!this.id_class(var5, 3, 39, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (!var6.id_class() && !var7.id_class()) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.id_class(var5, 30, 39, false)) {
                     return rdn_3.id_break;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.id_class(var5, 3, 30, false)) {
                  return rdn_3.id_break;
               }
            } else if (!this.id_class(var5, 0, 2, false)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 3, 39, false)) {
            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         } else {
            var4.id_byte();
         }

         if (var5.id_char() == var3.id_char()) {
            return rdn_3.id_break;
         }

         var4.id_class(var1, var5);
      }

      return var3;
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_byte, var1, xu_3.XS);
   }

   private void id_class() {
      rdn_3 var1 = this.id_break.id_extends(0);
      rdn_3 var2 = this.id_break.id_extends(1);
      boolean var3 = !var1.id_class() || !var2.id_class();
      boolean var4 = !var1.id_class() && !var2.id_class();
      if (!var3) {
         this.id_class.id_break(0, rdn_3.id_break);
      } else {
         boolean var5 = !var1.id_class() && var1.id_break() != rdy_3.dm && !var1.id_public()
            || !var2.id_class() && var2.id_break() != rdy_3.dm && !var2.id_public();
         if (var1.id_char() > 1 || var2.id_char() > 1 || !var4 && var5) {
            this.id_class.id_break(0, rdn_3.id_break);
            this.id_native();
            return;
         }

         byte var6 = 1;
         int var7;
         rdn_3 var8;
         if (var4) {
            if (var1.id_break() != var2.id_break()) {
               this.id_class.id_break(0, rdn_3.id_break);
               this.id_native();
               return;
            }

            rdb_3 var9 = var1.id_break();
            int var10 = var9.id_finally() - var1.id_catch();
            int var11 = var9.id_finally() - var2.id_catch();
            int var12 = var10 + var11 + var9.id_finally() * 5 / 100;
            var7 = Math.max(var9.id_finally() - var12, 0);
            var8 = this.id_break(var1, var2);
            if (!var8.id_throws()) {
               if (!rdn_3.id_break(var1, var2)) {
                  this.id_class.id_break(0, rdn_3.id_break);
                  this.id_native();
                  return;
               }

               var6 = 2;
            }
         } else {
            boolean var13 = !var1.id_class();
            var7 = var13 ? var1.id_catch() : var2.id_catch();
            var8 = var13 ? var1 : var2;
         }

         this.id_class.id_break(0, this.id_class(var8, var7, var6));
      }

      this.id_native();
   }

   private rdn_3 id_class(rdn_3 var1, int var2, int var3) {
      rdn_3 var4 = var1.id_implements();
      var4.id_byte("Enchantments");
      var4.id_byte("StoredEnchantments");
      if (var2 > 0) {
         var4.id_break(var2);
      } else {
         var4.id_byte("Damage");
      }

      var4.id_throws(var3);
      Map var5 = eA_2.id_class(var1).entrySet().stream().filter(var0 -> var0.getKey().id_byte()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      eA_2.id_class(var5, var4);
      var4.id_byte(0);
      if (var4.id_break() == rdy_3.dm && var5.size() == 0) {
         var4 = new rdn_3(rdy_3.XM);
         if (var1.id_this()) {
            var4.id_class(var1.id_continue());
         }
      }

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var4.id_byte(rJf_1.id_protected(var4.id_instanceof()));
      }

      return var4;
   }

   @Override
   public void id_class(rXu_1 var1) {
      super.id_class(var1);
      if (var1 == this.id_break) {
         this.id_class();
      }
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_byte.id_class((var2, var3) -> this.id_class(var1, var2, this.id_break));
   }

   private rdn_3 id_break(rdn_3 var1, rdn_3 var2) {
      rdn_3 var3 = var1.id_implements();
      Map var4 = eA_2.id_class(var2);

      for (Entry var6 : var4.entrySet()) {
         ev_3 var7 = (ev_3)var6.getKey();
         if (!var7.id_byte() || eA_2.id_class(var7, var3) == 0) {
            var3.id_class(var7, (Integer)var6.getValue());
         }
      }

      return var3;
   }
}
