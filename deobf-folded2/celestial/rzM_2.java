package celestial;

public class rzM_2 {
   public static final rzm_3 id_class = id_class("empty", new rWw_1());
   public static final rzm_3 id_break = id_class("item", new rWa_1());
   public static final rzm_3 id_byte = id_class("loot_table", new rQr_1());
   public static final rzm_3 id_protected = id_class("dynamic", new rWT());
   public static final rzm_3 id_throws = id_class("tag", new rQS());
   public static final rzm_3 id_case = id_class("alternatives", rzt_3.id_class(rWL::new));
   public static final rzm_3 id_catch = id_class("sequence", rzt_3.id_class(rzR_2::new));
   public static final rzm_3 id_private = id_class("group", rzt_3.id_class(rWf_1::new));

   private static rzm_3 id_class(String var0, rWY<? extends rzE_2> var1) {
      return rVL.id_class(rVL.Q, new rqO_2(var0), new rzm_3(var1));
   }

   public static Object id_class() {
      return rzy_3.<rzE_2, rzm_3>id_class(rVL.Q, "entry", "type", rzE_2::id_class).id_class();
   }
}
