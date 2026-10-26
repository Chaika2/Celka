package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public abstract class mN_2 {
   public static final mN_2 class_ = new mc_3("default");
   private static final mN_2 throws_ = new mu_3("flat");
   private static final mN_2 case_ = new mm_3("large_biomes");
   public static final mN_2 break_ = new mZ_2("amplified");
   private static final mN_2 catch_ = new mv_3("single_biome_surface");
   private static final mN_2 private_ = new mF_2("single_biome_caves");
   private static final mN_2 implements_ = new mL_2("single_biome_floating_islands");
   private static final mN_2 finally_ = new mA_2("debug_all_block_states");
   protected static final List<mN_2> byte_ = Lists.newArrayList(new mN_2[]{class_, throws_, case_, break_, catch_, private_, implements_, finally_});
   protected static final Map<Optional<mN_2>, mn_3> protected_ = ImmutableMap.of(
      Optional.of(throws_),
      (mn_3)(var0, var1) -> {
         rKd_1 var2 = var1.throws_();
         return new mg_3(
            var0,
            var2x -> var0.case_
                  .class_(
                     new rrSp_1(
                        var1.class_(), var1.break_(), var1.byte_(), rrSp_1.class_(var0.case_.break_().break_(rVL.void_), var1.protected_(), new rKz_1(var2x))
                     )
                  ),
            var2 instanceof rKz_1 ? ((rKz_1)var2).catch_() : rKQ.class_(var0.case_.break_().break_(rVL.n))
         );
      },
      Optional.of(catch_),
      (mn_3)(var0, var1) -> new mf_3(
            var0, var0.case_.break_(), var2 -> var0.case_.class_(class_(var0.case_.break_(), var1, catch_, var2)), class_(var0.case_.break_(), var1)
         ),
      Optional.of(private_),
      (mn_3)(var0, var1) -> new mf_3(
            var0, var0.case_.break_(), var2 -> var0.case_.class_(class_(var0.case_.break_(), var1, private_, var2)), class_(var0.case_.break_(), var1)
         ),
      Optional.of(implements_),
      (mn_3)(var0, var1) -> new mf_3(
            var0, var0.case_.break_(), var2 -> var0.case_.class_(class_(var0.case_.break_(), var1, implements_, var2)), class_(var0.case_.break_(), var1)
         )
   );
   private final rgP_2 extends_;

   mN_2(String var1) {
      this.extends_ = new rgn_3("generator." + var1);
   }

   private static rYG class_(rVm_1 var0, rrSp_1 var1) {
      return var1.throws_().protected_().break_().stream().findFirst().orElse(var0.break_(rVL.n).byte_(rYl_1.break_));
   }

   private static rrSp_1 class_(rVm_1 var0, rrSp_1 var1, mN_2 var2, rYG var3) {
      ror_3 var4 = new ror_3(var3);
      rVF var5 = var0.break_(rVL.void_);
      rVF var6 = var0.break_(rVL.u);
      Supplier var7;
      if (var2 == private_) {
         var7 = () -> var6.byte_(rKW.catch_);
      } else if (var2 == implements_) {
         var7 = () -> var6.byte_(rKW.private_);
      } else {
         var7 = () -> var6.byte_(rKW.byte_);
      }

      return new rrSp_1(var1.class_(), var1.break_(), var1.byte_(), rrSp_1.class_(var5, var1.protected_(), new rKT(var4, var1.class_(), var7)));
   }

   public rgP_2 class_() {
      return this.extends_;
   }

   public rrSp_1 class_(rVv_1 var1, long var2, boolean var4, boolean var5) {
      rVF var6 = var1.break_(rVL.n);
      rVF var7 = var1.break_(rVL.void_);
      rVF var8 = var1.break_(rVL.u);
      return new rrSp_1(var2, var4, var5, rrSp_1.class_(var7, rRJ.class_(var7, var6, var8, var2), this.class_(var6, var8, var2)));
   }

   protected abstract rKd_1 class_(rVL<rYG> var1, rVL<rKW> var2, long var3);

   public static Optional<mN_2> class_(rrSp_1 var0) {
      rKd_1 var1 = var0.throws_();
      if (var1 instanceof rKz_1) {
         return Optional.of(throws_);
      } else {
         return var1 instanceof rKk_1 ? Optional.of(finally_) : Optional.empty();
      }
   }
}
