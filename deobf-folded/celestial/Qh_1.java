package celestial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;

public class Qh_1 {
   private final Predicate<ryw_3>[][][] id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   public int id_byte() {
      return this.id_protected;
   }

   public Qh_1(Predicate<ryw_3>[][][] var1) {
      this.id_class = var1;
      this.id_break = var1.length;
      if (this.id_break > 0) {
         this.id_byte = var1[0].length;
         if (this.id_byte > 0) {
            this.id_protected = var1[0][0].length;
         } else {
            this.id_protected = 0;
         }
      } else {
         this.id_byte = 0;
         this.id_protected = 0;
      }
   }

   public QJ id_class(rRR var1, rfH_2 var2) {
      LoadingCache var3 = id_class(var1, false);
      int var4 = Math.max(Math.max(this.id_protected, this.id_byte), this.id_break);

      for (rfH_2 var6 : rfH_2.id_class(var2, var2.id_break(var4 - 1, var4 - 1, var4 - 1))) {
         for (rpr_3 var10 : rpr_3.values()) {
            for (rpr_3 var14 : rpr_3.values()) {
               if (var14 != var10 && var14 != var10.id_case()) {
                  QJ var15 = this.id_class(var6, var10, var14, var3);
                  if (var15 != null) {
                     return var15;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<rfH_2, ryw_3> id_class(rRR var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new QX(var0, var1));
   }

   protected static rfH_2 id_class(rfH_2 var0, rpr_3 var1, rpr_3 var2, int var3, int var4, int var5) {
      if (var1 != var2 && var1 != var2.id_case()) {
         rja_3 var6 = new rja_3(var1.id_implements(), var1.id_finally(), var1.id_extends());
         rja_3 var7 = new rja_3(var2.id_implements(), var2.id_finally(), var2.id_extends());
         rja_3 var8 = var6.id_throws(var7);
         return var0.id_break(
            var7.b_() * -var4 + var8.b_() * var3 + var6.b_() * var5,
            var7.c_() * -var4 + var8.c_() * var3 + var6.c_() * var5,
            var7.d_() * -var4 + var8.d_() * var3 + var6.d_() * var5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   private QJ id_class(rfH_2 var1, rpr_3 var2, rpr_3 var3, LoadingCache<rfH_2, ryw_3> var4) {
      for (int var5 = 0; var5 < this.id_protected; var5++) {
         for (int var6 = 0; var6 < this.id_byte; var6++) {
            for (int var7 = 0; var7 < this.id_break; var7++) {
               if (!this.id_class[var7][var6][var5].test((ryw_3)var4.getUnchecked(id_class(var1, var2, var3, var5, var6, var7)))) {
                  return null;
               }
            }
         }
      }

      return new QJ(var1, var2, var3, var4, this.id_protected, this.id_byte, this.id_break);
   }

   public int id_class() {
      return this.id_break;
   }

   public int id_break() {
      return this.id_byte;
   }
}
