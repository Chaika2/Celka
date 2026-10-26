package celestial;

import com.google.gson.JsonObject;

public interface rkf_3<T extends rkw_3<?>> {
   rkf_3<rWb_1> class_ = class_("crafting_shaped", new rWM());
   rkf_3<rWO> break_ = class_("crafting_shapeless", new rWh_1());
   rWc_1<rkF_2> byte_ = class_("crafting_special_armordye", new rWc_1<>(rkF_2::new));
   rWc_1<rkn_3> protected_ = class_("crafting_special_bookcloning", new rWc_1<>(rkn_3::new));
   rWc_1<rkK_2> throws_ = class_("crafting_special_mapcloning", new rWc_1<>(rkK_2::new));
   rWc_1<rkD_2> case_ = class_("crafting_special_mapextending", new rWc_1<>(rkD_2::new));
   rWc_1<rky_3> catch_ = class_("crafting_special_firework_rocket", new rWc_1<>(rky_3::new));
   rWc_1<rkq_3> private_ = class_("crafting_special_firework_star", new rWc_1<>(rkq_3::new));
   rWc_1<rkp_3> implements_ = class_("crafting_special_firework_star_fade", new rWc_1<>(rkp_3::new));
   rWc_1<rWZ> finally_ = class_("crafting_special_tippedarrow", new rWc_1<>(rWZ::new));
   rWc_1<rkL_2> extends_ = class_("crafting_special_bannerduplicate", new rWc_1<>(rkL_2::new));
   rWc_1<rWX> native_ = class_("crafting_special_shielddecoration", new rWc_1<>(rWX::new));
   rWc_1<rWJ> volatile_ = class_("crafting_special_shulkerboxcoloring", new rWc_1<>(rWJ::new));
   rWc_1<rWm_1> final_ = class_("crafting_special_suspiciousstew", new rWc_1<>(rWm_1::new));
   rWc_1<rWS> package_ = class_("crafting_special_repairitem", new rWc_1<>(rWS::new));
   rkl_3<rkT_2> int_ = class_("smelting", new rkl_3<>(rkT_2::new, 200));
   rkl_3<rkA_2> new_ = class_("blasting", new rkl_3<>(rkA_2::new, 100));
   rkl_3<rWQ> continue_ = class_("smoking", new rkl_3<>(rWQ::new, 100));
   rkl_3<rkC_2> super_ = class_("campfire_cooking", new rkl_3<>(rkC_2::new, 100));
   rkf_3<rWu_1> this_ = class_("stonecutting", new rWd_1<>(rWu_1::new));
   rkf_3<rWW> else_ = class_("smithing", new rWz_1());

   static <S extends rkf_3<T>, T extends rkw_3<?>> S class_(String var0, S var1) {
      return rVL.class_(rVL.M, var0, (S)var1);
   }

   void class_(ruu_3 var1, T var2);

   T break_(rqO_2 var1, ruu_3 var2);

   T break_(rqO_2 var1, JsonObject var2);
}
