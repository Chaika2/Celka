package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class rXA implements rXZ, rXu_1 {
   private final int id_class;
   private final rqs_3<rdn_3> id_break;
   private List<rXm_1> id_byte;

   @Override
   public boolean id_byte(rhd_3 var1) {
      return true;
   }

   private void id_byte(rdn_3 var1) {
      for (int var2 = 0; var2 < this.id_class; var2++) {
         rdn_3 var3 = this.id_extends(var2);
         if (var3.id_class()) {
            this.id_break(var2, var1.id_implements());
            var1.id_throws(0);
            return;
         }
      }
   }

   public rcy_3 id_byte() {
      rcy_3 var1 = new rcy_3();

      for (int var2 = 0; var2 < this.id_else(); var2++) {
         rdn_3 var3 = this.id_extends(var2);
         if (!var3.id_class()) {
            var1.add(var3.id_break(new rcd_3()));
         }
      }

      return var1;
   }

   public rXA(rdn_3... var1) {
      this.id_class = var1.length;
      this.id_break = rqs_3.id_class(rdn_3.id_break, var1);
   }

   public rXA(int var1) {
      this.id_class = var1;
      this.id_break = rqs_3.id_class(var1, rdn_3.id_break);
   }

   @Override
   public String toString() {
      return this.id_break.stream().filter(var0 -> !var0.id_class()).collect(Collectors.toList()).toString();
   }

   private boolean id_class(rdn_3 var1, rdn_3 var2) {
      return var1.id_break() == var2.id_break() && rdn_3.id_class(var1, var2);
   }

   public void id_class(rXm_1 var1) {
      if (this.id_byte == null) {
         this.id_byte = Lists.newArrayList();
      }

      this.id_byte.add(var1);
   }

   public void id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rdn_3 var3 = rdn_3.id_class(var1.id_class(var2));
         if (!var3.id_class()) {
            this.id_class(var3);
         }
      }
   }

   @Override
   public void id_class(rWr_1 var1) {
      for (rdn_3 var3 : this.id_break) {
         var1.id_break(var3);
      }
   }

   public rdn_3 id_class(rdb_3 var1, int var2) {
      rdn_3 var3 = new rdn_3(var1, 0);

      for (int var4 = this.id_class - 1; var4 >= 0; var4--) {
         rdn_3 var5 = this.id_extends(var4);
         if (var5.id_break().equals(var1)) {
            int var6 = var2 - var3.id_char();
            rdn_3 var7 = var5.id_class(var6);
            var3.id_case(var7.id_char());
            if (var3.id_char() == var2) {
               break;
            }
         }
      }

      if (!var3.id_class()) {
         this.id_break();
      }

      return var3;
   }

   public rdn_3 id_class(rdn_3 var1) {
      rdn_3 var2 = var1.id_implements();
      this.id_protected(var2);
      if (var2.id_class()) {
         return rdn_3.id_break;
      } else {
         this.id_byte(var2);
         return var2.id_class() ? rdn_3.id_break : var2;
      }
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      rdn_3 var3 = rXC.id_class(this.id_break, var1, var2);
      if (!var3.id_class()) {
         this.id_break();
      }

      return var3;
   }

   public boolean id_break(rdn_3 var1) {
      boolean var2 = false;

      for (rdn_3 var4 : this.id_break) {
         if (var4.id_class() || this.id_class(var4, var1) && var4.id_char() < var4.id_byte()) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public void id_break(rXm_1 var1) {
      this.id_byte.remove(var1);
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_break.set(var1, var2);
      if (!var2.id_class() && var2.id_char() > this.ab_()) {
         var2.id_throws(this.ab_());
      }

      this.id_break();
   }

   private void id_break(rdn_3 var1, rdn_3 var2) {
      int var3 = Math.min(this.ab_(), var2.id_byte());
      int var4 = Math.min(var1.id_char(), var3 - var2.id_char());
      if (var4 > 0) {
         var2.id_case(var4);
         var1.id_catch(var4);
         this.id_break();
      }
   }

   @Override
   public void id_break() {
      if (this.id_byte != null) {
         for (rXm_1 var2 : this.id_byte) {
            var2.id_class(this);
         }
      }
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return var1 >= 0 && var1 < this.id_break.size() ? this.id_break.get(var1) : rdn_3.id_break;
   }

   @Override
   public int id_else() {
      return this.id_class;
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
      this.id_break();
   }

   private void id_protected(rdn_3 var1) {
      for (int var2 = 0; var2 < this.id_class; var2++) {
         rdn_3 var3 = this.id_extends(var2);
         if (this.id_class(var3, var1)) {
            this.id_break(var1, var3);
            if (var1.id_class()) {
               return;
            }
         }
      }
   }

   public List<rdn_3> id_protected() {
      List var1 = this.id_break.stream().filter(var0 -> !var0.id_class()).collect(Collectors.toList());
      this.id_public();
      return var1;
   }

   @Override
   public rdn_3 id_native(int var1) {
      rdn_3 var2 = this.id_break.get(var1);
      if (var2.id_class()) {
         return rdn_3.id_break;
      } else {
         this.id_break.set(var1, rdn_3.id_break);
         return var2;
      }
   }
}
