package celestial;

public class rzM_2 {
   public static final rzm_3 class_ = class_("empty", new rWw_1());
   public static final rzm_3 break_ = class_("item", new rWa_1());
   public static final rzm_3 byte_ = class_("loot_table", new rQr_1());
   public static final rzm_3 protected_ = class_("dynamic", new rWT());
   public static final rzm_3 throws_ = class_("tag", new rQS());
   public static final rzm_3 case_ = class_("alternatives", rzt_3.class_(rWL::new));
   public static final rzm_3 catch_ = class_("sequence", rzt_3.class_(rzR_2::new));
   public static final rzm_3 private_ = class_("group", rzt_3.class_(rWf_1::new));

   private static rzm_3 class_(String var0, rWY<? extends rzE_2> var1) {
      return rVL.class_(rVL.Q, new rqO_2(var0), new rzm_3(var1));
   }

   public static Object class_() {
      return rzy_3.<rzE_2, rzm_3>class_(rVL.Q, "entry", "type", rzE_2::class_).class_();
   }
}
