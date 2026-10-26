package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class rXe_1 extends rJr_1 {
   private final rXu_1 id_class;
   private final List<rJY> id_break = new ArrayList<>();
   private final int id_byte;

   public static rXe_1 id_byte(int var0, rhz_3 var1) {
      return new rXe_1(rJP.id_byte, var0, var1, 3);
   }

   public rXe_1(rJP<?> var1, int var2, rhz_3 var3, rXu_1 var4, int var5) {
      super(var1, var2);
      id_class(var4, var5 * 9);
      this.id_class = var4;
      this.id_byte = var5;
      var4.b_(var3.id_throws);
      int var6 = (this.id_byte - 4) * 18;

      for (int var7 = 0; var7 < this.id_byte; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.id_break(new rJY(var4, var8 + var7 * 9, 8 + var8 * 18, 18 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var11 = 0; var11 < 9; var11++) {
            this.id_break(new rJY(var3, var11 + var9 * 9 + 9, 8 + var11 * 18, 103 + var9 * 18 + var6));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.id_break(new rJY(var3, var10, 8 + var10 * 18, 161 + var6));
      }
   }

   private rXe_1(rJP<?> var1, int var2, rhz_3 var3, int var4) {
      this(var1, var2, var3, new rXA(9 * var4), var4);
   }

   public static rXe_1 id_class(int var0, rhz_3 var1, rXu_1 var2) {
      return new rXe_1(rJP.id_byte, var0, var1, var2, 3);
   }

   @Override
   public List<rJY> id_class(@Nullable Predicate<rJY> var1) {
      ArrayList var2 = new ArrayList();

      for (rJY var4 : this.id_throws) {
         if (var4.id_byte == this.id_class && (var1 == null || var1.test(var4))) {
            var2.add(var4);
         }
      }

      return var2;
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_class.id_byte(var1);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 < this.id_byte * 9) {
            if (!this.id_class(var5, this.id_byte * 9, this.id_throws.size(), true)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 0, this.id_byte * 9, false)) {
            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         } else {
            var4.id_byte();
         }
      }

      return var3;
   }

   public rXu_1 id_class() {
      return this.id_class;
   }

   public static rXe_1 id_class(int var0, rhz_3 var1) {
      return new rXe_1(rJP.id_class, var0, var1, 1);
   }

   public static rXe_1 id_break(int var0, rhz_3 var1) {
      return new rXe_1(rJP.id_break, var0, var1, 2);
   }

   public static rXe_1 id_break(int var0, rhz_3 var1, rXu_1 var2) {
      return new rXe_1(rJP.id_case, var0, var1, var2, 6);
   }

   public int id_break() {
      return this.id_byte;
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_class.id_break(var1);
   }

   public static rXe_1 id_throws(int var0, rhz_3 var1) {
      return new rXe_1(rJP.id_throws, var0, var1, 5);
   }

   public static rXe_1 id_case(int var0, rhz_3 var1) {
      return new rXe_1(rJP.id_case, var0, var1, 6);
   }

   public static rXe_1 id_protected(int var0, rhz_3 var1) {
      return new rXe_1(rJP.id_protected, var0, var1, 4);
   }
}
