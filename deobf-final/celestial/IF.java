package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IF {
   public static final IF class_ = new IF();
   private final List<IZ> byte_ = Lists.newArrayList();
   private final List<IJ> protected_;
   private rrbU_2 throws_;
   public static rqO_2 break_ = null;

   public IF(IC var1, Id_1 var2, Function<rqO_2, Id_1> var3, Function<Ig_1, fj_3> var4, List<IZ> var5) {
      this.protected_ = var5.stream().map(var4x -> {
         Id_1 var5x = (Id_1)var3.apply(var4x.class_());
         return Objects.equals(var5x, var2) ? null : var1.class_(var4x.class_(), If_1.X0_Y0, var4);
      }).collect(Collectors.toList());
      Collections.reverse(this.protected_);

      for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
         this.byte_.add((IZ)var5.get(var6));
      }

      if (this.byte_.size() > 65) {
         this.throws_ = rrbU_2.class_(this.byte_);
      }
   }

   public IF(IC var1, we_3 var2, Function<rqO_2, Id_1> var3, List<IZ> var4) {
      this(var1, var2, var3, var1.protected_()::class_, var4);
   }

   private IF() {
      this.protected_ = Collections.emptyList();
   }

   public ImmutableList<IZ> class_() {
      return ImmutableList.copyOf(this.byte_);
   }

   public IJ class_(IJ var1, rdn_3 var2, gm_3 var3, iB_2 var4) {
      boolean var5 = rrbb_3.rd();
      if (var5) {
         break_ = null;
      }

      if (!this.byte_.isEmpty()) {
         if (this.throws_ != null) {
            Integer var6 = this.throws_.class_(var2, var3, var4);
            if (var6 != null) {
               int var10 = var6;
               if (var10 >= 0 && var10 < this.protected_.size()) {
                  if (var5) {
                     break_ = this.byte_.get(var10).class_();
                  }

                  IJ var11 = this.protected_.get(var10);
                  if (var11 != null) {
                     return var11;
                  }
               }

               return var1;
            }
         }

         for (int var9 = 0; var9 < this.byte_.size(); var9++) {
            IZ var7 = this.byte_.get(var9);
            if (var7.class_(var2, var3, var4)) {
               IJ var8 = this.protected_.get(var9);
               if (var5) {
                  break_ = var7.class_();
               }

               if (this.throws_ != null) {
                  this.throws_.class_(var2, var3, var4, var9);
               }

               if (var8 == null) {
                  return var1;
               }

               return var8;
            }
         }

         if (this.throws_ != null) {
            this.throws_.class_(var2, var3, var4, rrbU_2.class_);
         }
      }

      return var1;
   }
}
