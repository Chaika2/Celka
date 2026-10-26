package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IF {
   public static final IF id_class = new IF();
   private final List<IZ> id_byte = Lists.newArrayList();
   private final List<IJ> id_protected;
   private rrbU_2 id_throws;
   public static rqO_2 id_break = null;

   public IF(IC var1, Id_1 var2, Function<rqO_2, Id_1> var3, Function<Ig_1, fj_3> var4, List<IZ> var5) {
      this.id_protected = var5.stream().map(var4x -> {
         Id_1 var5x = (Id_1)var3.apply(var4x.id_class());
         return Objects.equals(var5x, var2) ? null : var1.id_class(var4x.id_class(), If_1.X0_Y0, var4);
      }).collect(Collectors.toList());
      Collections.reverse(this.id_protected);

      for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
         this.id_byte.add((IZ)var5.get(var6));
      }

      if (this.id_byte.size() > 65) {
         this.id_throws = rrbU_2.id_class(this.id_byte);
      }
   }

   public IF(IC var1, we_3 var2, Function<rqO_2, Id_1> var3, List<IZ> var4) {
      this(var1, var2, var3, var1.id_protected()::id_class, var4);
   }

   private IF() {
      this.id_protected = Collections.emptyList();
   }

   public ImmutableList<IZ> id_class() {
      return ImmutableList.copyOf(this.id_byte);
   }

   public IJ id_class(IJ var1, rdn_3 var2, gm_3 var3, iB_2 var4) {
      boolean var5 = rrbb_3.rd();
      if (var5) {
         id_break = null;
      }

      if (!this.id_byte.isEmpty()) {
         if (this.id_throws != null) {
            Integer var6 = this.id_throws.id_class(var2, var3, var4);
            if (var6 != null) {
               int var10 = var6;
               if (var10 >= 0 && var10 < this.id_protected.size()) {
                  if (var5) {
                     id_break = this.id_byte.get(var10).id_class();
                  }

                  IJ var11 = this.id_protected.get(var10);
                  if (var11 != null) {
                     return var11;
                  }
               }

               return var1;
            }
         }

         for (int var9 = 0; var9 < this.id_byte.size(); var9++) {
            IZ var7 = this.id_byte.get(var9);
            if (var7.id_class(var2, var3, var4)) {
               IJ var8 = this.id_protected.get(var9);
               if (var5) {
                  id_break = var7.id_class();
               }

               if (this.id_throws != null) {
                  this.id_throws.id_class(var2, var3, var4, var9);
               }

               if (var8 == null) {
                  return var1;
               }

               return var8;
            }
         }

         if (this.id_throws != null) {
            this.id_throws.id_class(var2, var3, var4, rrbU_2.id_class);
         }
      }

      return var1;
   }
}
