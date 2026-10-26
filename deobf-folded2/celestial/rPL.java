package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class rPL {
   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_byte(rsT_2 var0, float var1) {
      return ImmutableList.of(
         Pair.of(2, new rPz_1(il_3.id_break, var1, 1, 150, 1200)),
         Pair.of(3, new rru_3(rRP.id_continue, il_3.id_break)),
         Pair.of(3, new rPk_1()),
         Pair.of(
            5,
            new rry_3(
               ImmutableMap.of(il_3.id_break, iC_2.VALUE_ABSENT),
               ImmutableList.of(Pair.of(new rPl_1(var1), 1), Pair.of(new rPn_1(var1), 4), Pair.of(new rPH(var1, 4), 2), Pair.of(new rrQ_2(20, 40), 2))
            )
         ),
         id_break(),
         Pair.of(99, new rPF())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_class(float var0) {
      return ImmutableList.of(
         Pair.of(0, new rPy_1(80, 120)),
         id_class(),
         Pair.of(5, new rPp_1()),
         Pair.of(
            5,
            new rry_3(
               ImmutableMap.of(il_3.id_implements, iC_2.VALUE_ABSENT),
               ImmutableList.of(
                  Pair.of(rrR_2.id_class(aI_2.D, 8, il_3.id_new, var0, 2), 2),
                  Pair.of(rrR_2.id_class(aI_2.id_private, 8, il_3.id_new, var0, 2), 1),
                  Pair.of(new rrH_2(var0), 1),
                  Pair.of(new rPq_1(var0, 2), 1),
                  Pair.of(new rrY_2(var0), 2),
                  Pair.of(new rrQ_2(20, 40), 2)
               )
            )
         ),
         Pair.of(99, new rPF())
      );
   }

   private static Pair<Integer, rPm_1<iB_2>> id_class() {
      return Pair.of(
         5,
         new rry_3(
            ImmutableList.of(
               Pair.of(new rro_3(aI_2.id_private, 8.0F), 8),
               Pair.of(new rro_3(aI_2.D, 8.0F), 2),
               Pair.of(new rro_3(aI_2.rM, 8.0F), 2),
               Pair.of(new rro_3(aH_2.CREATURE, 8.0F), 1),
               Pair.of(new rro_3(aH_2.WATER_CREATURE, 8.0F), 1),
               Pair.of(new rro_3(aH_2.WATER_AMBIENT, 8.0F), 1),
               Pair.of(new rro_3(aH_2.MONSTER, 8.0F), 1),
               Pair.of(new rrQ_2(30, 60), 2)
            )
         )
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_class(rsT_2 var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new rPc_1(0.8F)),
         Pair.of(0, new rrg_3()),
         Pair.of(0, new rrK_2(45, 90)),
         Pair.of(0, new rPB()),
         Pair.of(0, new rPA()),
         Pair.of(0, new rrj_3()),
         Pair.of(0, new rrh_3()),
         Pair.of(0, new rru_3(var0.id_class(), il_3.id_byte)),
         Pair.of(0, new rru_3(var0.id_class(), il_3.id_protected)),
         Pair.of(1, new rPy_1()),
         Pair.of(2, new rPu_1(var0)),
         Pair.of(3, new rPv_1(var1)),
         new Pair[]{
            Pair.of(5, new rPS(var1, false, 4)),
            Pair.of(6, new rrT_2(var0.id_class(), il_3.id_byte, il_3.id_protected, true, Optional.empty())),
            Pair.of(7, new rrC_2(var1)),
            Pair.of(8, new rrA_2(var1)),
            Pair.of(10, new rrT_2(rRP.id_continue, il_3.id_break, false, Optional.of((byte)14))),
            Pair.of(10, new rrT_2(rRP.id_super, il_3.id_throws, true, Optional.of((byte)14))),
            Pair.of(10, new rrb_3()),
            Pair.of(10, new rrx_3())
         }
      );
   }

   private static Pair<Integer, rPm_1<iB_2>> id_break() {
      return Pair.of(5, new rry_3(ImmutableList.of(Pair.of(new rro_3(aI_2.D, 8.0F), 2), Pair.of(new rro_3(aI_2.rM, 8.0F), 2), Pair.of(new rrQ_2(30, 60), 8))));
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_break(rsT_2 var0, float var1) {
      Object var2;
      if (var0 == rsT_2.id_case) {
         var2 = new rrZ_2();
      } else {
         var2 = new rPW();
      }

      return ImmutableList.of(
         id_break(),
         Pair.of(
            5,
            new rry_3(
               ImmutableList.of(
                  Pair.of(var2, 7),
                  Pair.of(new rPw_1(il_3.id_byte, 0.4F, 4), 2),
                  Pair.of(new rPT(il_3.id_byte, 0.4F, 1, 10), 5),
                  Pair.of(new rPt_1(il_3.id_case, var1, 1, 6, il_3.id_byte), 5),
                  Pair.of(new rrm_3(), var0 == rsT_2.id_case ? 2 : 5),
                  Pair.of(new rrX_2(), var0 == rsT_2.id_case ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new rPd_1(400, 1600)),
         Pair.of(10, new rrL_2(aI_2.rM, 4)),
         Pair.of(2, new rPz_1(il_3.id_byte, var1, 9, 100, 1200)),
         Pair.of(3, new rrI_2(100)),
         Pair.of(99, new rPF())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_throws(rsT_2 var0, float var1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new rry_3(
               ImmutableList.of(
                  Pair.of(rrR_2.id_class(aI_2.D, 8, il_3.id_new, var1, 2), 2),
                  Pair.of(new rrR_2<>(aI_2.D, 8, au_3::N_, au_3::N_, il_3.id_continue, var1, 2), 1),
                  Pair.of(rrR_2.id_class(aI_2.id_private, 8, il_3.id_new, var1, 2), 1),
                  Pair.of(new rrH_2(var1), 1),
                  Pair.of(new rPq_1(var1, 2), 1),
                  Pair.of(new rrY_2(var1), 1),
                  Pair.of(new rrQ_2(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new rrI_2(100)),
         Pair.of(3, new rrL_2(aI_2.rM, 4)),
         Pair.of(3, new rPd_1(400, 1600)),
         Pair.of(3, new rre_3(ImmutableMap.of(), ImmutableSet.of(il_3.id_new), rra_3.ORDERED, rri_3.RUN_ONE, ImmutableList.of(Pair.of(new rPX(), 1)))),
         Pair.of(3, new rre_3(ImmutableMap.of(), ImmutableSet.of(il_3.id_continue), rra_3.ORDERED, rri_3.RUN_ONE, ImmutableList.of(Pair.of(new rrz_3(), 1)))),
         id_class(),
         Pair.of(99, new rPF())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_catch(rsT_2 var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new rPM()),
         Pair.of(0, new rry_3(ImmutableList.of(Pair.of(new rPz_1(il_3.id_throws, var1 * 1.5F, 2, 150, 200), 6), Pair.of(new rrH_2(var1 * 1.5F), 2)))),
         id_break(),
         Pair.of(99, new rrq_3())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_case(rsT_2 var0, float var1) {
      float var2 = var1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, new rrk_3()),
         Pair.of(1, rPO.id_break(il_3.id_try, var2, 6, false)),
         Pair.of(1, rPO.id_break(il_3.id_goto, var2, 6, false)),
         Pair.of(3, new rrH_2(var2, 2, 2)),
         id_break()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_implements(rsT_2 var0, float var1) {
      byte var2 = 2;
      return ImmutableList.of(Pair.of(0, new rrc_3(15, 3)), Pair.of(1, new rrF_2(32, var1 * 1.25F, 2)), id_break());
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_protected(rsT_2 var0, float var1) {
      return ImmutableList.of(
         Pair.of(2, new rry_3(ImmutableList.of(Pair.of(new rPw_1(il_3.id_throws, 0.4F, 40), 2), Pair.of(new rrW_2(), 2)))),
         Pair.of(10, new rPd_1(400, 1600)),
         Pair.of(10, new rrL_2(aI_2.rM, 4)),
         Pair.of(2, new rPz_1(il_3.id_throws, var1, 6, 100, 200)),
         Pair.of(3, new rrI_2(100)),
         Pair.of(3, new rru_3(rRP.id_super, il_3.id_throws)),
         Pair.of(3, new rre_3(ImmutableMap.of(), ImmutableSet.of(il_3.id_new), rra_3.ORDERED, rri_3.RUN_ONE, ImmutableList.of(Pair.of(new rPX(), 1)))),
         id_class(),
         Pair.of(99, new rPF())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends rPm_1<? super rsq_3>>> id_private(rsT_2 var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new rry_3(ImmutableList.of(Pair.of(new rrf_3(var1), 5), Pair.of(new rrl_3(var1 * 1.1F), 2)))),
         Pair.of(0, new rrJ_2(600, 600)),
         Pair.of(2, new rrv_3(24, var1 * 1.4F)),
         id_break(),
         Pair.of(99, new rrq_3())
      );
   }
}
