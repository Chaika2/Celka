package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public abstract class mN_2 {
   public static final mN_2 id_class = new mc_3("default");
   private static final mN_2 id_throws = new mu_3("flat");
   private static final mN_2 id_case = new mm_3("large_biomes");
   public static final mN_2 id_break = new mZ_2("amplified");
   private static final mN_2 id_catch = new mv_3("single_biome_surface");
   private static final mN_2 id_private = new mF_2("single_biome_caves");
   private static final mN_2 id_implements = new mL_2("single_biome_floating_islands");
   private static final mN_2 id_finally = new mA_2("debug_all_block_states");
   protected static final List<mN_2> id_byte = Lists.newArrayList(
      new mN_2[]{id_class, id_throws, id_case, id_break, id_catch, id_private, id_implements, id_finally}
   );
   protected static final Map<Optional<mN_2>, mn_3> id_protected = ImmutableMap.of(
      Optional.of(id_throws),
      (mn_3)(var0, var1) -> {
         rKd_1 var2 = var1.id_throws();
         return new mg_3(
            var0,
            var2x -> var0.id_case
                  .id_class(
                     new rrSp_1(
                        var1.id_class(),
                        var1.id_break(),
                        var1.id_byte(),
                        rrSp_1.id_class(var0.id_case.id_break().id_break(rVL.id_void), var1.id_protected(), new rKz_1(var2x))
                     )
                  ),
            var2 instanceof rKz_1 ? ((rKz_1)var2).id_catch() : rKQ.id_class(var0.id_case.id_break().id_break(rVL.n))
         );
      },
      Optional.of(id_catch),
      (mn_3)(var0, var1) -> new mf_3(
            var0,
            var0.id_case.id_break(),
            var2 -> var0.id_case.id_class(id_class(var0.id_case.id_break(), var1, id_catch, var2)),
            id_class(var0.id_case.id_break(), var1)
         ),
      Optional.of(id_private),
      (mn_3)(var0, var1) -> new mf_3(
            var0,
            var0.id_case.id_break(),
            var2 -> var0.id_case.id_class(id_class(var0.id_case.id_break(), var1, id_private, var2)),
            id_class(var0.id_case.id_break(), var1)
         ),
      Optional.of(id_implements),
      (mn_3)(var0, var1) -> new mf_3(
            var0,
            var0.id_case.id_break(),
            var2 -> var0.id_case.id_class(id_class(var0.id_case.id_break(), var1, id_implements, var2)),
            id_class(var0.id_case.id_break(), var1)
         )
   );
   private final rgP_2 id_extends;

   mN_2(String var1) {
      this.id_extends = new rgn_3("generator." + var1);
   }

   private static rYG id_class(rVm_1 var0, rrSp_1 var1) {
      return var1.id_throws().id_protected().id_break().stream().findFirst().orElse(var0.id_break(rVL.n).id_byte(rYl_1.id_break));
   }

   private static rrSp_1 id_class(rVm_1 var0, rrSp_1 var1, mN_2 var2, rYG var3) {
      ror_3 var4 = new ror_3(var3);
      rVF var5 = var0.id_break(rVL.id_void);
      rVF var6 = var0.id_break(rVL.u);
      Supplier var7;
      if (var2 == id_private) {
         var7 = () -> var6.id_byte(rKW.id_catch);
      } else if (var2 == id_implements) {
         var7 = () -> var6.id_byte(rKW.id_private);
      } else {
         var7 = () -> var6.id_byte(rKW.id_byte);
      }

      return new rrSp_1(var1.id_class(), var1.id_break(), var1.id_byte(), rrSp_1.id_class(var5, var1.id_protected(), new rKT(var4, var1.id_class(), var7)));
   }

   public rgP_2 id_class() {
      return this.id_extends;
   }

   public rrSp_1 id_class(rVv_1 var1, long var2, boolean var4, boolean var5) {
      rVF var6 = var1.id_break(rVL.n);
      rVF var7 = var1.id_break(rVL.id_void);
      rVF var8 = var1.id_break(rVL.u);
      return new rrSp_1(var2, var4, var5, rrSp_1.id_class(var7, rRJ.id_class(var7, var6, var8, var2), this.id_class(var6, var8, var2)));
   }

   protected abstract rKd_1 id_class(rVL<rYG> var1, rVL<rKW> var2, long var3);

   public static Optional<mN_2> id_class(rrSp_1 var0) {
      rKd_1 var1 = var0.id_throws();
      if (var1 instanceof rKz_1) {
         return Optional.of(id_throws);
      } else {
         return var1 instanceof rKk_1 ? Optional.of(id_finally) : Optional.empty();
      }
   }
}
