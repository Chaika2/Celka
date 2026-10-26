package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;

public final class rjo_3 {
   private final rjV_2 id_class;
   private boolean id_break;
   private rje_3 id_byte;
   private rjY_2 id_protected;
   private rje_3 id_throws;
   private rjY_2 id_case;
   private static final rjo_3 id_catch = rqR_2.id_class((Supplier<rjo_3>)(() -> {
      rjV_2 var0 = new rjV_2();
      var0.id_class();
      rjo_3 var1 = new rjo_3(var0);
      var1.id_protected();
      return var1;
   }));

   public rjV_2 id_byte() {
      return this.id_class.id_case();
   }

   public rjo_3(rjV_2 var1) {
      if (var1 == null) {
         this.id_class = id_catch.id_class;
      } else {
         this.id_class = var1;
      }
   }

   public rjo_3(rje_3 var1, rjY_2 var2, rje_3 var3, rjY_2 var4) {
      this.id_class = id_class(var1, var2, var3, var4);
      this.id_byte = var1 != null ? var1 : new rje_3();
      this.id_protected = var2 != null ? var2 : rjY_2.id_class.id_catch();
      this.id_throws = var3 != null ? var3 : new rje_3(1.0F, 1.0F, 1.0F);
      this.id_case = var4 != null ? var4 : rjY_2.id_class.id_catch();
      this.id_break = true;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjo_3 var2 = (rjo_3)var1;
         return Objects.equals(this.id_class, var2.id_class);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class);
   }

   public static rjo_3 id_class() {
      return id_catch;
   }

   public static Pair<rjj_3, rje_3> id_class(rjV_2 var0) {
      var0.id_class(1.0F / var0.id_int);
      rje_3 var1 = new rje_3(var0.id_protected, var0.id_private, var0.id_native);
      rjj_3 var2 = new rjj_3(var0);
      return Pair.of(var2, var1);
   }

   public rjo_3 id_class(rjo_3 var1) {
      rjV_2 var2 = this.id_byte();
      var2.id_class(var1.id_byte());
      return new rjo_3(var2);
   }

   private static rjV_2 id_class(rje_3 var0, rjY_2 var1, rje_3 var2, rjY_2 var3) {
      rjV_2 var4 = new rjV_2();
      var4.id_class();
      if (var1 != null) {
         var4.id_class(new rjV_2(var1));
      }

      if (var2 != null) {
         var4.id_class(rjV_2.id_throws(var2.id_class(), var2.id_break(), var2.id_byte()));
      }

      if (var3 != null) {
         var4.id_class(new rjV_2(var3));
      }

      if (var0 != null) {
         var4.id_protected = var0.id_class();
         var4.id_private = var0.id_break();
         var4.id_native = var0.id_byte();
      }

      return var4;
   }

   public rjo_3 id_break() {
      if (this == id_catch) {
         return this;
      } else {
         rjV_2 var1 = this.id_byte();
         return var1.id_throws() ? new rjo_3(var1) : null;
      }
   }

   private void id_throws() {
      if (!this.id_break) {
         Pair var1 = id_class(this.id_class);
         Triple var2 = ((rjj_3)var1.getFirst()).id_break();
         this.id_byte = (rje_3)var1.getSecond();
         this.id_protected = (rjY_2)var2.getLeft();
         this.id_throws = (rje_3)var2.getMiddle();
         this.id_case = (rjY_2)var2.getRight();
         this.id_break = true;
      }
   }

   public rjY_2 id_protected() {
      this.id_throws();
      return this.id_protected.id_catch();
   }
}
