package celestial;

public class rJP<T extends rJr_1> {
   public static final rJP<rXe_1> id_class = id_class("generic_9x1", rXe_1::id_class);
   public static final rJP<rXe_1> id_break = id_class("generic_9x2", rXe_1::id_break);
   public static final rJP<rXe_1> id_byte = id_class("generic_9x3", rXe_1::id_byte);
   public static final rJP<rXe_1> id_protected = id_class("generic_9x4", rXe_1::id_protected);
   public static final rJP<rXe_1> id_throws = id_class("generic_9x5", rXe_1::id_throws);
   public static final rJP<rXe_1> id_case = id_class("generic_9x6", rXe_1::id_case);
   public static final rJP<rJs_1> id_catch = id_class("generic_3x3", rJs_1::new);
   public static final rJP<rJf_1> id_private = id_class("anvil", rJf_1::new);
   public static final rJP<rXT> id_implements = id_class("beacon", rXT::new);
   public static final rJP<rXI> id_finally = id_class("blast_furnace", rXI::new);
   public static final rJP<rXf_1> id_extends = id_class("brewing_stand", rXf_1::new);
   public static final rJP<rJa_1> id_native = id_class("crafting", rJa_1::new);
   public static final rJP<rJE> id_volatile = id_class("enchantment", rJE::new);
   public static final rJP<rJO> id_final = id_class("furnace", rJO::new);
   public static final rJP<rJJ> id_package = id_class("grindstone", rJJ::new);
   public static final rJP<rJz_1> id_int = id_class("hopper", rJz_1::new);
   public static final rJP<rJv_1> id_new = id_class("lectern", (var0, var1) -> new rJv_1(var0));
   public static final rJP<rJL> id_continue = id_class("loom", rJL::new);
   public static final rJP<rJp_1> id_super = id_class("merchant", rJp_1::new);
   public static final rJP<rJV> id_this = id_class("shulker_box", rJV::new);
   public static final rJP<rJo_1> id_else = id_class("smithing", rJo_1::new);
   public static final rJP<rJK> id_synchronized = id_class("smoker", rJK::new);
   public static final rJP<rXR> id_return = id_class("cartography_table", rXR::new);
   public static final rJP<rJD> id_public = id_class("stonecutter", rJD::new);
   private final rJB<T> id_goto;

   private rJP(rJB<T> var1) {
      this.id_goto = var1;
   }

   private static <T extends rJr_1> rJP<T> id_class(String var0, rJB<T> var1) {
      return rVL.id_class(rVL.G, var0, new rJP<>(var1));
   }

   public T id_class(int var1, rhz_3 var2) {
      return this.id_goto.create(var1, var2);
   }
}
