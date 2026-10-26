package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class rkO_2 extends rdb_3 {
   private static final Map<aI_2<?>, rkO_2> class_ = Maps.newIdentityHashMap();
   private final int break_;
   private final int byte_;
   private final aI_2<?> protected_;

   public rkO_2(aI_2<?> var1, int var2, int var3, rdO_2 var4) {
      super(var4);
      this.protected_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      class_.put(var1, this);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      if (!(var2 instanceof rrEm_1)) {
         return ryZ_2.SUCCESS;
      } else {
         rdn_3 var3 = var1.volatile_();
         rfH_2 var4 = var1.class_();
         rpr_3 var5 = var1.finally_();
         xc_3 var6 = var2.byte_(var4);
         if (var6.class_(xu_3.rD)) {
            ryO_2 var7 = var2.class_(var4);
            if (var7 instanceof rHU) {
               rrEy_1 var11 = ((rHU)var7).catch_();
               aI_2 var9 = this.class_(var3.package_());
               var11.class_(var9);
               var7.break_();
               var2.class_(var4, var6, var6, 3);
               var3.catch_(1);
               return ryZ_2.CONSUME;
            }
         }

         rfH_2 var10;
         if (var6.extends_(var2, var4).break_()) {
            var10 = var4;
         } else {
            var10 = var4.break_(var5);
         }

         aI_2 var8 = this.class_(var3.package_());
         if (var8.class_((rrEm_1)var2, var3, var1.final_(), var10, iO_2.SPAWN_EGG, true, !Objects.equals(var4, var10) && var5 == rpr_3.UP) != null) {
            var3.catch_(1);
         }

         return ryZ_2.CONSUME;
      }
   }

   public static rkO_2 class_(aI_2<?> var0) {
      return class_.get(var0);
   }

   public aI_2<?> class_(rcd_3 var1) {
      if (var1 != null && var1.byte_("EntityTag", 10)) {
         rcd_3 var2 = var1.int_("EntityTag");
         if (var2.byte_("id", 8)) {
            return aI_2.class_(var2.native_("id")).orElse(this.protected_);
         }
      }

      return this.protected_;
   }

   public Optional<is_3> class_(rhd_3 var1, is_3 var2, aI_2<? extends is_3> var3, rrEm_1 var4, rjU_2 var5, rdn_3 var6) {
      if (!this.class_(var6.package_(), var3)) {
         return Optional.empty();
      } else {
         Object var7;
         if (var2 instanceof au_3) {
            var7 = ((au_3)var2).class_(var4, (au_3)var2);
         } else {
            var7 = (is_3)var3.class_(var4);
         }

         if (var7 == null) {
            return Optional.empty();
         } else {
            ((is_3)var7).class_(true);
            if (!((is_3)var7).n_()) {
               return Optional.empty();
            } else {
               ((is_3)var7).class_(var5.class_(), var5.break_(), var5.byte_(), 0.0F, 0.0F);
               var4.class_((an_3)var7);
               if (var6.this_()) {
                  ((is_3)var7).break_(var6.continue_());
               }

               if (!((rhx_3)var1.implements_[18]).protected_) {
                  var6.catch_(1);
               }

               return Optional.of((is_3)var7);
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rff_3 var5 = class_(var1, var2, rjs_3.SOURCE_ONLY);
      if (var5.byte_() != rjM_2.BLOCK) {
         return rym_3.byte_(var4);
      } else if (!(var1 instanceof rrEm_1)) {
         return rym_3.class_(var4);
      } else {
         rff_3 var6 = var5;
         rfH_2 var7 = var6.class_();
         if (!(var1.byte_(var7).break_() instanceof dj_3)) {
            return rym_3.byte_(var4);
         } else if (var1.class_(var2, var7) && var2.class_(var7, var6.break_(), var4)) {
            aI_2 var8 = this.class_(var4.package_());
            if (var8.class_((rrEm_1)var1, var4, var2, var7, iO_2.SPAWN_EGG, false, false) == null) {
               return rym_3.byte_(var4);
            } else {
               if (!((rhx_3)var2.implements_[18]).protected_) {
                  var4.catch_(1);
               }

               var2.class_(rlB_2.byte_.break_(this));
               return rym_3.break_(var4);
            }
         } else {
            return rym_3.protected_(var4);
         }
      }
   }

   public boolean class_(rcd_3 var1, aI_2<?> var2) {
      return Objects.equals(this.class_(var1), var2);
   }

   public int class_(int var1) {
      return var1 == 0 ? this.break_ : this.byte_;
   }

   public static Iterable<rkO_2> catch_() {
      return Iterables.unmodifiableIterable(class_.values());
   }
}
