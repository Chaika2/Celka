package celestial;

import com.google.gson.JsonObject;

public interface rkf_3<T extends rkw_3<?>> {
   rkf_3<rWb_1> id_class = id_class("crafting_shaped", new rWM());
   rkf_3<rWO> id_break = id_class("crafting_shapeless", new rWh_1());
   rWc_1<rkF_2> id_byte = id_class("crafting_special_armordye", new rWc_1<>(rkF_2::new));
   rWc_1<rkn_3> id_protected = id_class("crafting_special_bookcloning", new rWc_1<>(rkn_3::new));
   rWc_1<rkK_2> id_throws = id_class("crafting_special_mapcloning", new rWc_1<>(rkK_2::new));
   rWc_1<rkD_2> id_case = id_class("crafting_special_mapextending", new rWc_1<>(rkD_2::new));
   rWc_1<rky_3> id_catch = id_class("crafting_special_firework_rocket", new rWc_1<>(rky_3::new));
   rWc_1<rkq_3> id_private = id_class("crafting_special_firework_star", new rWc_1<>(rkq_3::new));
   rWc_1<rkp_3> id_implements = id_class("crafting_special_firework_star_fade", new rWc_1<>(rkp_3::new));
   rWc_1<rWZ> id_finally = id_class("crafting_special_tippedarrow", new rWc_1<>(rWZ::new));
   rWc_1<rkL_2> id_extends = id_class("crafting_special_bannerduplicate", new rWc_1<>(rkL_2::new));
   rWc_1<rWX> id_native = id_class("crafting_special_shielddecoration", new rWc_1<>(rWX::new));
   rWc_1<rWJ> id_volatile = id_class("crafting_special_shulkerboxcoloring", new rWc_1<>(rWJ::new));
   rWc_1<rWm_1> id_final = id_class("crafting_special_suspiciousstew", new rWc_1<>(rWm_1::new));
   rWc_1<rWS> id_package = id_class("crafting_special_repairitem", new rWc_1<>(rWS::new));
   rkl_3<rkT_2> id_int = id_class("smelting", new rkl_3<>(rkT_2::new, 200));
   rkl_3<rkA_2> id_new = id_class("blasting", new rkl_3<>(rkA_2::new, 100));
   rkl_3<rWQ> id_continue = id_class("smoking", new rkl_3<>(rWQ::new, 100));
   rkl_3<rkC_2> id_super = id_class("campfire_cooking", new rkl_3<>(rkC_2::new, 100));
   rkf_3<rWu_1> id_this = id_class("stonecutting", new rWd_1<>(rWu_1::new));
   rkf_3<rWW> id_else = id_class("smithing", new rWz_1());

   static <S extends rkf_3<T>, T extends rkw_3<?>> S id_class(String var0, S var1) {
      return rVL.id_class(rVL.M, var0, (S)var1);
   }

   void id_class(ruu_3 var1, T var2);

   T id_break(rqO_2 var1, ruu_3 var2);

   T id_break(rqO_2 var1, JsonObject var2);
}
