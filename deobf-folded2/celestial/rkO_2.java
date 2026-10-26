package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class rkO_2 extends rdb_3 {
   private static final Map<aI_2<?>, rkO_2> id_class = Maps.newIdentityHashMap();
   private final int id_break;
   private final int id_byte;
   private final aI_2<?> id_protected;

   public rkO_2(aI_2<?> var1, int var2, int var3, rdO_2 var4) {
      super(var4);
      this.id_protected = var1;
      this.id_break = var2;
      this.id_byte = var3;
      id_class.put(var1, this);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      if (!(var2 instanceof rrEm_1)) {
         return ryZ_2.SUCCESS;
      } else {
         rdn_3 var3 = var1.id_volatile();
         rfH_2 var4 = var1.id_class();
         rpr_3 var5 = var1.id_finally();
         xc_3 var6 = var2.id_byte(var4);
         if (var6.id_class(xu_3.rD)) {
            ryO_2 var7 = var2.id_class(var4);
            if (var7 instanceof rHU) {
               rrEy_1 var11 = ((rHU)var7).id_catch();
               aI_2 var9 = this.id_class(var3.id_package());
               var11.id_class(var9);
               var7.id_break();
               var2.id_class(var4, var6, var6, 3);
               var3.id_catch(1);
               return ryZ_2.CONSUME;
            }
         }

         rfH_2 var10;
         if (var6.id_extends(var2, var4).id_break()) {
            var10 = var4;
         } else {
            var10 = var4.id_break(var5);
         }

         aI_2 var8 = this.id_class(var3.id_package());
         if (var8.id_class((rrEm_1)var2, var3, var1.id_final(), var10, iO_2.SPAWN_EGG, true, !Objects.equals(var4, var10) && var5 == rpr_3.UP) != null) {
            var3.id_catch(1);
         }

         return ryZ_2.CONSUME;
      }
   }

   public static rkO_2 id_class(aI_2<?> var0) {
      return id_class.get(var0);
   }

   public aI_2<?> id_class(rcd_3 var1) {
      if (var1 != null && var1.id_byte("EntityTag", 10)) {
         rcd_3 var2 = var1.id_int("EntityTag");
         if (var2.id_byte("id", 8)) {
            return aI_2.id_class(var2.id_native("id")).orElse(this.id_protected);
         }
      }

      return this.id_protected;
   }

   public Optional<is_3> id_class(rhd_3 var1, is_3 var2, aI_2<? extends is_3> var3, rrEm_1 var4, rjU_2 var5, rdn_3 var6) {
      if (!this.id_class(var6.id_package(), var3)) {
         return Optional.empty();
      } else {
         Object var7;
         if (var2 instanceof au_3) {
            var7 = ((au_3)var2).id_class(var4, (au_3)var2);
         } else {
            var7 = (is_3)var3.id_class(var4);
         }

         if (var7 == null) {
            return Optional.empty();
         } else {
            ((is_3)var7).id_class(true);
            if (!((is_3)var7).n_()) {
               return Optional.empty();
            } else {
               ((is_3)var7).id_class(var5.id_class(), var5.id_break(), var5.id_byte(), 0.0F, 0.0F);
               var4.id_class((an_3)var7);
               if (var6.id_this()) {
                  ((is_3)var7).id_break(var6.id_continue());
               }

               if (!((rhx_3)var1.id_implements[18]).id_protected) {
                  var6.id_catch(1);
               }

               return Optional.of((is_3)var7);
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rff_3 var5 = id_class(var1, var2, rjs_3.SOURCE_ONLY);
      if (var5.id_byte() != rjM_2.BLOCK) {
         return rym_3.id_byte(var4);
      } else if (!(var1 instanceof rrEm_1)) {
         return rym_3.id_class(var4);
      } else {
         rff_3 var6 = var5;
         rfH_2 var7 = var6.id_class();
         if (!(var1.id_byte(var7).id_break() instanceof dj_3)) {
            return rym_3.id_byte(var4);
         } else if (var1.id_class(var2, var7) && var2.id_class(var7, var6.id_break(), var4)) {
            aI_2 var8 = this.id_class(var4.id_package());
            if (var8.id_class((rrEm_1)var1, var4, var2, var7, iO_2.SPAWN_EGG, false, false) == null) {
               return rym_3.id_byte(var4);
            } else {
               if (!((rhx_3)var2.id_implements[18]).id_protected) {
                  var4.id_catch(1);
               }

               var2.id_class(rlB_2.id_byte.id_break(this));
               return rym_3.id_break(var4);
            }
         } else {
            return rym_3.id_protected(var4);
         }
      }
   }

   public boolean id_class(rcd_3 var1, aI_2<?> var2) {
      return Objects.equals(this.id_class(var1), var2);
   }

   public int id_class(int var1) {
      return var1 == 0 ? this.id_break : this.id_byte;
   }

   public static Iterable<rkO_2> id_catch() {
      return Iterables.unmodifiableIterable(id_class.values());
   }
}
