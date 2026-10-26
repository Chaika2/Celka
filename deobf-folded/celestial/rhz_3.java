package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class rhz_3 implements rXu_1, rpA_2 {
   public final rqs_3<rdn_3> id_class = rqs_3.id_class(36, rdn_3.id_break);
   public final rqs_3<rdn_3> id_break = rqs_3.id_class(4, rdn_3.id_break);
   public final rqs_3<rdn_3> id_byte = rqs_3.id_class(1, rdn_3.id_break);
   private final List<rqs_3<rdn_3>> id_case = ImmutableList.of(this.id_class, this.id_break, this.id_byte);
   public int id_protected;
   public final rhd_3 id_throws;
   private rdn_3 id_catch = rdn_3.id_break;
   private int id_private;

   public int id_byte(rdn_3 var1) {
      for (int var2 = 0; var2 < this.id_class.size(); var2++) {
         rdn_3 var3 = this.id_class.get(var2);
         if (!this.id_class.get(var2).id_class()
            && this.id_break(var1, this.id_class.get(var2))
            && !this.id_class.get(var2).id_case()
            && !var3.id_public()
            && !var3.id_this()) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_throws.id_throws[27] ? false : !(var1.id_int(this.id_throws) > 64.0);
   }

   public rdn_3 id_byte(int var1) {
      return this.id_break.get(var1);
   }

   public rdn_3 id_byte() {
      return id_break(this.id_protected) ? this.id_class.get(this.id_protected) : rdn_3.id_break;
   }

   private int id_byte(int var1, rdn_3 var2) {
      rdb_3 var3 = var2.id_break();
      int var4 = var2.id_char();
      rdn_3 var5 = this.id_extends(var1);
      if (var5.id_class()) {
         var5 = new rdn_3(var3, 0);
         if (var2.id_final()) {
            var5.id_byte(var2.id_package().id_catch());
         }

         this.id_break(var1, var5);
      }

      int var6 = var4;
      if (var4 > var5.id_byte() - var5.id_char()) {
         var6 = var5.id_byte() - var5.id_char();
      }

      if (var6 > this.ab_() - var5.id_char()) {
         var6 = this.ab_() - var5.id_char();
      }

      if (var6 == 0) {
         return var4;
      } else {
         var4 -= var6;
         var5.id_case(var6);
         var5.id_protected(5);
         return var4;
      }
   }

   public rhz_3(rhd_3 var1) {
      this.id_throws = var1;
   }

   private boolean id_class(rdn_3 var1, rdn_3 var2) {
      return !var1.id_class() && this.id_break(var1, var2) && var1.id_protected() && var1.id_char() < var1.id_byte() && var1.id_char() < this.ab_();
   }

   public void id_class(rWr_1 var1) {
      for (rdn_3 var3 : this.id_class) {
         var1.id_class(var3);
      }
   }

   public boolean id_class(rlb_3<rdb_3> var1) {
      for (List var3 : this.id_case) {
         for (rdn_3 var5 : var3) {
            if (!var5.id_class() && var1.id_class(var5.id_break())) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean id_class(int var1, rdn_3 var2) {
      if (var2.id_class()) {
         return false;
      } else {
         try {
            if (var2.id_case()) {
               if (var1 == -1) {
                  var1 = this.id_throws();
               }

               if (var1 >= 0) {
                  this.id_class.set(var1, var2.id_implements());
                  this.id_class.get(var1).id_protected(5);
                  var2.id_throws(0);
                  return true;
               } else if (((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                  var2.id_throws(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var3;
               do {
                  var3 = var2.id_char();
                  if (var1 == -1) {
                     var2.id_throws(this.id_finally(var2));
                  } else {
                     var2.id_throws(this.id_byte(var1, var2));
                  }
               } while (!var2.id_class() && var2.id_char() < var3);

               if (var2.id_char() == var3 && ((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                  var2.id_throws(0);
                  return true;
               } else {
                  return var2.id_char() < var3;
               }
            }
         } catch (Throwable var6) {
            KY var4 = KY.id_class(var6, "Adding item to inventory");
            Ko_1 var5 = var4.id_class("Item being added");
            var5.id_class("Item ID", rdb_3.id_class(var2.id_break()));
            var5.id_class("Item data", var2.id_catch());
            var5.id_class("Item name", () -> var2.id_continue().getString());
            throw new KU(var4);
         }
      }
   }

   public void id_class(rye_3 var1, float var2) {
      if (!(var2 <= 0.0F)) {
         var2 /= 4.0F;
         if (var2 < 1.0F) {
            var2 = 1.0F;
         }

         for (int var3 = 0; var3 < this.id_break.size(); var3++) {
            rdn_3 var4 = this.id_break.get(var3);
            if ((!var1.id_int() || !var4.id_break().id_else()) && var4.id_break() instanceof rxS_2) {
               int var5 = var3;
               var4.id_class((int)var2, this.id_throws, var1x -> var1x.id_break(rXQ.id_class(rXN.ARMOR, var5)));
            }
         }
      }
   }

   public void id_class(rYB var1, rdn_3 var2) {
      if (!var1.id_continue) {
         while (!var2.id_class()) {
            int var3 = this.id_protected(var2);
            if (var3 == -1) {
               var3 = this.id_throws();
            }

            if (var3 == -1) {
               this.id_throws.id_class(var2, false);
               break;
            }

            int var4 = var2.id_byte() - this.id_extends(var3).id_char();
            if (this.id_class(var3, var2.id_class(var4))) {
               ((rhN_2)this.id_throws).id_class.id_class(new rFM(-2, var3, this.id_extends(var3)));
            }
         }
      }
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      rqs_3 var3 = null;

      for (rqs_3 var5 : this.id_case) {
         if (var1 < var5.size()) {
            var3 = var5;
            break;
         }

         var1 -= var5.size();
      }

      return var3 != null && !((rdn_3)var3.get(var1)).id_class() ? rXC.id_class(var3, var1, var2) : rdn_3.id_break;
   }

   public float id_class(xc_3 var1) {
      return this.id_class(this.id_class.get(this.id_protected), var1);
   }

   public rcy_3 id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < this.id_class.size(); var2++) {
         if (!this.id_class.get(var2).id_class()) {
            rcd_3 var3 = new rcd_3();
            var3.id_class("Slot", (byte)var2);
            this.id_class.get(var2).id_break(var3);
            var1.add(var3);
         }
      }

      for (int var4 = 0; var4 < this.id_break.size(); var4++) {
         if (!this.id_break.get(var4).id_class()) {
            rcd_3 var6 = new rcd_3();
            var6.id_class("Slot", (byte)(var4 + 100));
            this.id_break.get(var4).id_break(var6);
            var1.add(var6);
         }
      }

      for (int var5 = 0; var5 < this.id_byte.size(); var5++) {
         if (!this.id_byte.get(var5).id_class()) {
            rcd_3 var7 = new rcd_3();
            var7.id_class("Slot", (byte)(var5 + 150));
            this.id_byte.get(var5).id_break(var7);
            var1.add(var7);
         }
      }

      return var1;
   }

   public void id_class(int var1) {
      this.id_protected = this.id_case();
      rdn_3 var2 = this.id_class.get(this.id_protected);
      this.id_class.set(this.id_protected, this.id_class.get(var1));
      this.id_class.set(var1, var2);
   }

   public void id_class(rdn_3 var1) {
      int var2 = this.id_break(var1);
      if (id_break(var2)) {
         this.id_protected = var2;
      } else if (var2 == -1) {
         this.id_protected = this.id_case();
         if (!this.id_class.get(this.id_protected).id_class()) {
            int var3 = this.id_throws();
            if (var3 != -1) {
               this.id_class.set(var3, this.id_class.get(this.id_protected));
            }
         }

         this.id_class.set(this.id_protected, var1);
      } else {
         this.id_class(var2);
      }
   }

   public int id_class(Predicate<rdn_3> var1, int var2, rXu_1 var3) {
      int var4 = 0;
      boolean var5 = var2 == 0;
      var4 += rXC.id_class(this, var1, var2 - var4, var5);
      var4 += rXC.id_class(var3, var1, var2 - var4, var5);
      var4 += rXC.id_class(this.id_catch, var1, var2 - var4, var5);
      if (this.id_catch.id_class()) {
         this.id_catch = rdn_3.id_break;
      }

      return var4;
   }

   public void id_class(double var1) {
      if (var1 > 0.0) {
         var1 = 1.0;
      }

      if (var1 < 0.0) {
         var1 = -1.0;
      }

      this.id_protected = (int)((double)this.id_protected - var1);

      while (this.id_protected < 0) {
         this.id_protected += 9;
      }

      while (this.id_protected >= 9) {
         this.id_protected -= 9;
      }
   }

   public void id_class(rhz_3 var1) {
      for (int var2 = 0; var2 < this.id_else(); var2++) {
         this.id_break(var2, var1.id_extends(var2));
      }

      this.id_protected = var1.id_protected;
   }

   public float id_class(rdn_3 var1, xc_3 var2) {
      return var1 == null ? this.id_class(var2) : var1.id_class(var2);
   }

   @Override
   public rgP_2 g() {
      return new rgn_3("container.inventory");
   }

   @Override
   public void id_break() {
      this.id_private++;
   }

   public int id_break(rdn_3 var1) {
      for (int var2 = 0; var2 < this.id_class.size(); var2++) {
         if (!this.id_class.get(var2).id_class() && this.id_break(var1, this.id_class.get(var2))) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean id_break(int var0) {
      return var0 >= 0 && var0 < 9;
   }

   public void id_break(rcy_3 var1) {
      this.id_class.clear();
      this.id_break.clear();
      this.id_byte.clear();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.id_class(var2);
         int var4 = var3.id_case("Slot") & 255;
         rdn_3 var5 = rdn_3.id_class(var3);
         if (!var5.id_class()) {
            if (var4 >= 0 && var4 < this.id_class.size()) {
               this.id_class.set(var4, var5);
            } else if (var4 >= 100 && var4 < this.id_break.size() + 100) {
               this.id_break.set(var4 - 100, var5);
            } else if (var4 >= 150 && var4 < this.id_byte.size() + 150) {
               this.id_byte.set(var4 - 150, var5);
            }
         }
      }
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      rqs_3 var3 = null;

      for (rqs_3 var5 : this.id_case) {
         if (var1 < var5.size()) {
            var3 = var5;
            break;
         }

         var1 -= var5.size();
      }

      if (var3 != null) {
         var3.set(var1, var2);
      }
   }

   private boolean id_break(rdn_3 var1, rdn_3 var2) {
      return var1.id_break() == var2.id_break() && rdn_3.id_class(var1, var2);
   }

   public boolean id_throws(rdn_3 var1) {
      return this.id_class(-1, var1);
   }

   public int id_throws() {
      for (int var1 = 0; var1 < this.id_class.size(); var1++) {
         if (this.id_class.get(var1).id_class()) {
            return var1;
         }
      }

      return -1;
   }

   private int id_finally(rdn_3 var1) {
      int var2 = this.id_protected(var1);
      if (var2 == -1) {
         var2 = this.id_throws();
      }

      return var2 == -1 ? var1.id_char() : this.id_byte(var2, var1);
   }

   public rdn_3 id_finally() {
      return this.id_catch;
   }

   public void id_catch(rdn_3 var1) {
      for (rqs_3 var3 : this.id_case) {
         for (int var4 = 0; var4 < var3.size(); var4++) {
            if (var3.get(var4) == var1) {
               var3.set(var4, rdn_3.id_break);
               break;
            }
         }
      }
   }

   public void id_catch() {
      for (rqs_3 var2 : this.id_case) {
         for (int var3 = 0; var3 < var2.size(); var3++) {
            if (!((rdn_3)var2.get(var3)).id_class()) {
               ((rdn_3)var2.get(var3)).id_class((rYB)this.id_throws.id_throws[7], this.id_throws, var3, this.id_protected == var3);
            }
         }
      }
   }

   public List<rqs_3<rdn_3>> id_extends() {
      return this.id_case;
   }

   private int id_extends(rdn_3 var1) {
      int var2 = this.id_protected(var1);
      if (var2 == -1) {
         var2 = this.id_throws();
      }

      return var2 == -1 ? var1.id_char() : this.id_protected(var2, var1);
   }

   @Override
   public rdn_3 id_extends(int var1) {
      rqs_3 var2 = null;

      for (rqs_3 var4 : this.id_case) {
         if (var1 < var4.size()) {
            var2 = var4;
            break;
         }

         var1 -= var4.size();
      }

      return var2 == null ? rdn_3.id_break : (rdn_3)var2.get(var1);
   }

   public int id_case() {
      for (int var1 = 0; var1 < 9; var1++) {
         int var2 = (this.id_protected + var1) % 9;
         if (this.id_class.get(var2).id_class()) {
            return var2;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = (this.id_protected + var3) % 9;
         if (!this.id_class.get(var4).id_public()) {
            return var4;
         }
      }

      return this.id_protected;
   }

   public boolean id_case(rdn_3 var1) {
      if (var1.id_class()) {
         return false;
      } else {
         try {
            var1 = var1.id_implements();
            if (var1.id_case()) {
               int var7 = this.id_throws();
               if (var7 >= 0) {
                  var1.id_throws(0);
                  return true;
               } else if (((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                  var1.id_throws(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var2;
               do {
                  var2 = var1.id_char();
                  var1.id_throws(this.id_extends(var1));
               } while (!var1.id_class() && var1.id_char() < var2);

               if (var1.id_char() == var2 && ((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                  var1.id_throws(0);
                  return true;
               } else {
                  return var1.id_char() < var2;
               }
            }
         } catch (Throwable var6) {
            KY var3 = KY.id_class(var6, "Adding item to inventory");
            Ko_1 var4 = var3.id_class("Item being added");
            var4.id_class("Item ID", rdb_3.id_class(var1.id_break()));
            var4.id_class("Item data", var1.id_catch());
            rdn_3 var5 = var1;
            var4.id_class("Item name", () -> var5.id_continue().getString());
            throw new KU(var3);
         }
      }
   }

   @Override
   public int id_else() {
      return this.id_class.size() + this.id_break.size() + this.id_byte.size();
   }

   public int id_implements() {
      return this.id_private;
   }

   public boolean id_implements(rdn_3 var1) {
      for (List var3 : this.id_case) {
         for (rdn_3 var5 : var3) {
            if (!var5.id_class() && var5.id_class(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean id_return() {
      for (rdn_3 var2 : this.id_class) {
         if (!var2.id_class()) {
            return false;
         }
      }

      for (rdn_3 var5 : this.id_break) {
         if (!var5.id_class()) {
            return false;
         }
      }

      for (rdn_3 var6 : this.id_byte) {
         if (!var6.id_class()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void id_public() {
      for (List var2 : this.id_case) {
         var2.clear();
      }
   }

   public static int id_protected() {
      return 9;
   }

   public int id_protected(rdn_3 var1) {
      if (this.id_class(this.id_extends(this.id_protected), var1)) {
         return this.id_protected;
      } else if (this.id_class(this.id_extends(40), var1)) {
         return 40;
      } else {
         for (int var2 = 0; var2 < this.id_class.size(); var2++) {
            if (this.id_class(this.id_class.get(var2), var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private int id_protected(int var1, rdn_3 var2) {
      rdb_3 var3 = var2.id_break();
      int var4 = var2.id_char();
      rdn_3 var5 = this.id_extends(var1);
      if (var5.id_class()) {
         var5 = new rdn_3(var3, 0);
         if (var2.id_final()) {
            var5.id_byte(var2.id_package().id_catch());
         }
      }

      int var6 = var4;
      if (var4 > var5.id_byte() - var5.id_char()) {
         var6 = var5.id_byte() - var5.id_char();
      }

      if (var6 > this.ab_() - var5.id_char()) {
         var6 = this.ab_() - var5.id_char();
      }

      if (var6 != 0) {
         var4 -= var6;
      }

      return var4;
   }

   public void id_private(rdn_3 var1) {
      this.id_catch = var1;
   }

   public void id_private() {
      for (List var2 : this.id_case) {
         for (int var3 = 0; var3 < var2.size(); var3++) {
            rdn_3 var4 = (rdn_3)var2.get(var3);
            if (!var4.id_class()) {
               this.id_throws.id_class(var4, true, false);
               var2.set(var3, rdn_3.id_break);
            }
         }
      }
   }

   @Override
   public rdn_3 id_native(int var1) {
      rqs_3 var2 = null;

      for (rqs_3 var4 : this.id_case) {
         if (var1 < var4.size()) {
            var2 = var4;
            break;
         }

         var1 -= var4.size();
      }

      if (var2 != null && !((rdn_3)var2.get(var1)).id_class()) {
         rdn_3 var5 = (rdn_3)var2.get(var1);
         var2.set(var1, rdn_3.id_break);
         return var5;
      } else {
         return rdn_3.id_break;
      }
   }
}
