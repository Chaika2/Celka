package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class rJV extends rJr_1 {
   private final rXu_1 id_class;

   public rJV(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(27));
   }

   public rJV(int var1, rhz_3 var2, rXu_1 var3) {
      super(rJP.id_this, var1);
      id_class(var3, 27);
      this.id_class = var3;
      var3.b_(var2.id_throws);
      byte var4 = 3;
      byte var5 = 9;

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.id_break(new rJg_1(var3, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.id_break(new rJY(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.id_break(new rJY(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 < this.id_class.id_else()) {
            if (!this.id_class(var5, this.id_class.id_else(), this.id_throws.size(), true)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 0, this.id_class.id_else(), false)) {
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
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_class.id_break(var1);
   }
}
