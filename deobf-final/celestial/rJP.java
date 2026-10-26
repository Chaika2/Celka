package celestial;

public class rJP<T extends rJr_1> {
   public static final rJP<rXe_1> class_ = class_("generic_9x1", rXe_1::class_);
   public static final rJP<rXe_1> break_ = class_("generic_9x2", rXe_1::break_);
   public static final rJP<rXe_1> byte_ = class_("generic_9x3", rXe_1::byte_);
   public static final rJP<rXe_1> protected_ = class_("generic_9x4", rXe_1::protected_);
   public static final rJP<rXe_1> throws_ = class_("generic_9x5", rXe_1::throws_);
   public static final rJP<rXe_1> case_ = class_("generic_9x6", rXe_1::case_);
   public static final rJP<rJs_1> catch_ = class_("generic_3x3", rJs_1::new);
   public static final rJP<rJf_1> private_ = class_("anvil", rJf_1::new);
   public static final rJP<rXT> implements_ = class_("beacon", rXT::new);
   public static final rJP<rXI> finally_ = class_("blast_furnace", rXI::new);
   public static final rJP<rXf_1> extends_ = class_("brewing_stand", rXf_1::new);
   public static final rJP<rJa_1> native_ = class_("crafting", rJa_1::new);
   public static final rJP<rJE> volatile_ = class_("enchantment", rJE::new);
   public static final rJP<rJO> final_ = class_("furnace", rJO::new);
   public static final rJP<rJJ> package_ = class_("grindstone", rJJ::new);
   public static final rJP<rJz_1> int_ = class_("hopper", rJz_1::new);
   public static final rJP<rJv_1> new_ = class_("lectern", (var0, var1) -> new rJv_1(var0));
   public static final rJP<rJL> continue_ = class_("loom", rJL::new);
   public static final rJP<rJp_1> super_ = class_("merchant", rJp_1::new);
   public static final rJP<rJV> this_ = class_("shulker_box", rJV::new);
   public static final rJP<rJo_1> else_ = class_("smithing", rJo_1::new);
   public static final rJP<rJK> synchronized_ = class_("smoker", rJK::new);
   public static final rJP<rXR> return_ = class_("cartography_table", rXR::new);
   public static final rJP<rJD> public_ = class_("stonecutter", rJD::new);
   private final rJB<T> goto_;

   private rJP(rJB<T> var1) {
      this.goto_ = var1;
   }

   private static <T extends rJr_1> rJP<T> class_(String var0, rJB<T> var1) {
      return rVL.class_(rVL.G, var0, new rJP<>(var1));
   }

   public T class_(int var1, rhz_3 var2) {
      return this.goto_.create(var1, var2);
   }
}
