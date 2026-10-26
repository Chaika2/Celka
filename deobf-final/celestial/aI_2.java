package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aI_2<T extends an_3> {
   private static final Logger rh = LogManager.getLogger();
   public static final aI_2<aZ_2> class_ = class_(
      "area_effect_cloud", af_3.<aZ_2>class_(aZ_2::new, aH_2.MISC).byte_().class_(6.0F, 0.5F).class_(10).break_(Integer.MAX_VALUE)
   );
   public static final aI_2<rSY> break_ = class_("armor_stand", af_3.<rSY>class_(rSY::new, aH_2.MISC).class_(0.5F, 1.975F).class_(10));
   public static final aI_2<rhF_2> byte_ = class_("arrow", af_3.<rhF_2>class_(rhF_2::new, aH_2.MISC).class_(0.5F, 0.5F).class_(4).break_(20));
   public static final aI_2<rbv_3> protected_ = class_("bat", af_3.class_(rbv_3::new, aH_2.AMBIENT).class_(0.5F, 0.9F).class_(5));
   public static final aI_2<rbF_2> throws_ = class_("bee", af_3.class_(rbF_2::new, aH_2.CREATURE).class_(0.7F, 0.6F).class_(8));
   public static final aI_2<rEO> case_ = class_("blaze", af_3.class_(rEO::new, aH_2.MONSTER).byte_().class_(0.6F, 1.8F).class_(8));
   public static final aI_2<rSK> catch_ = class_("boat", af_3.<rSK>class_(rSK::new, aH_2.MISC).class_(1.375F, 0.5625F).class_(10));
   public static final aI_2<rbf_3> private_ = class_("cat", af_3.class_(rbf_3::new, aH_2.CREATURE).class_(0.6F, 0.7F).class_(8));
   public static final aI_2<rEX> implements_ = class_("cave_spider", af_3.class_(rEX::new, aH_2.MONSTER).class_(0.7F, 0.5F).class_(8));
   public static final aI_2<rbR_2> finally_ = class_("chicken", af_3.class_(rbR_2::new, aH_2.CREATURE).class_(0.4F, 0.7F).class_(10));
   public static final aI_2<rOI> extends_ = class_("cod", af_3.class_(rOI::new, aH_2.WATER_AMBIENT).class_(0.5F, 0.3F).class_(4));
   public static final aI_2<rbY_2> native_ = class_("cow", af_3.class_(rbY_2::new, aH_2.CREATURE).class_(0.9F, 1.4F).class_(10));
   public static final aI_2<rEJ> volatile_ = class_("creeper", af_3.class_(rEJ::new, aH_2.MONSTER).class_(0.6F, 1.7F).class_(8));
   public static final aI_2<rbo_3> final_ = class_("dolphin", af_3.class_(rbo_3::new, aH_2.WATER_CREATURE).class_(0.9F, 0.6F));
   public static final aI_2<rOa_1> package_ = class_("donkey", af_3.class_(rOa_1::new, aH_2.CREATURE).class_(1.3964844F, 1.5F).class_(10));
   public static final aI_2<rhA_2> int_ = class_("dragon_fireball", af_3.<rhA_2>class_(rhA_2::new, aH_2.MISC).class_(1.0F, 1.0F).class_(4).break_(10));
   public static final aI_2<rEx_1> new_ = class_("drowned", af_3.class_(rEx_1::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rEc_1> continue_ = class_("elder_guardian", af_3.class_(rEc_1::new, aH_2.MONSTER).class_(1.9975F, 1.9975F).class_(10));
   public static final aI_2<rSa_1> super_ = class_(
      "end_crystal", af_3.<rSa_1>class_(rSa_1::new, aH_2.MISC).class_(2.0F, 2.0F).class_(16).break_(Integer.MAX_VALUE)
   );
   public static final aI_2<rSu_1> this_ = class_("ender_dragon", af_3.class_(rSu_1::new, aH_2.MONSTER).byte_().class_(16.0F, 8.0F).class_(10));
   public static final aI_2<rEu_1> else_ = class_("enderman", af_3.class_(rEu_1::new, aH_2.MONSTER).class_(0.6F, 2.9F).class_(8));
   public static final aI_2<rEL> synchronized_ = class_("endermite", af_3.class_(rEL::new, aH_2.MONSTER).class_(0.4F, 0.3F).class_(8));
   public static final aI_2<rEA> return_ = class_("evoker", af_3.class_(rEA::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rhC_2> public_ = class_("evoker_fangs", af_3.<rhC_2>class_(rhC_2::new, aH_2.MISC).class_(0.5F, 0.8F).class_(6).break_(2));
   public static final aI_2<rsP_2> goto_ = class_("experience_orb", af_3.<rsP_2>class_(rsP_2::new, aH_2.MISC).class_(0.5F, 0.5F).class_(6).break_(20));
   public static final aI_2<rhl_3> while_ = class_("eye_of_ender", af_3.<rhl_3>class_(rhl_3::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(4));
   public static final aI_2<rsB_2> try_ = class_("falling_block", af_3.<rsB_2>class_(rsB_2::new, aH_2.MISC).class_(0.98F, 0.98F).class_(10).break_(20));
   public static final aI_2<rhy_3> instanceof_ = class_("firework_rocket", af_3.<rhy_3>class_(rhy_3::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rba_3> throw_ = class_("fox", af_3.class_(rba_3::new, aH_2.CREATURE).class_(0.6F, 0.7F).class_(8).class_(xu_3.XJ));
   public static final aI_2<rEy_1> interface_ = class_("ghast", af_3.class_(rEy_1::new, aH_2.MONSTER).byte_().class_(4.0F, 4.0F).class_(10));
   public static final aI_2<rEw_1> char_ = class_("giant", af_3.class_(rEw_1::new, aH_2.MONSTER).class_(3.6F, 12.0F).class_(10));
   public static final aI_2<rEI> abstract_ = class_("guardian", af_3.class_(rEI::new, aH_2.MONSTER).class_(0.85F, 0.85F).class_(8));
   public static final aI_2<rEg_1> long_ = class_("hoglin", af_3.class_(rEg_1::new, aH_2.MONSTER).class_(1.3964844F, 1.4F).class_(8));
   public static final aI_2<rOi_1> float_ = class_("horse", af_3.class_(rOi_1::new, aH_2.CREATURE).class_(1.3964844F, 1.6F).class_(10));
   public static final aI_2<rEY> void_ = class_("husk", af_3.class_(rEY::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rED> static_ = class_("illusioner", af_3.class_(rED::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rMZ> import_ = class_("iron_golem", af_3.class_(rMZ::new, aH_2.MISC).class_(1.4F, 2.7F).class_(10));
   public static final aI_2<rsE_2> short_ = class_("item", af_3.<rsE_2>class_(rsE_2::new, aH_2.MISC).class_(0.25F, 0.25F).class_(6).break_(20));
   public static final aI_2<rsG_2> default_ = class_(
      "item_frame", af_3.<rsG_2>class_(rsG_2::new, aH_2.MISC).class_(0.5F, 0.5F).class_(10).break_(Integer.MAX_VALUE)
   );
   public static final aI_2<rhH_2> const_ = class_("fireball", af_3.<rhH_2>class_(rhH_2::new, aH_2.MISC).class_(1.0F, 1.0F).class_(4).break_(10));
   public static final aI_2<rsM_2> strictfp_ = class_(
      "leash_knot", af_3.<rsM_2>class_(rsM_2::new, aH_2.MISC).break_().class_(0.5F, 0.5F).class_(10).break_(Integer.MAX_VALUE)
   );
   public static final aI_2<rSg_1> boolean_ = class_(
      "lightning_bolt", af_3.class_(rSg_1::new, aH_2.MISC).break_().class_(0.0F, 0.0F).class_(16).break_(Integer.MAX_VALUE)
   );
   public static final aI_2<rhP_2> transient_ = class_("llama", af_3.class_(rhP_2::new, aH_2.CREATURE).class_(0.9F, 1.87F).class_(10));
   public static final aI_2<rhw_3> for_ = class_("llama_spit", af_3.<rhw_3>class_(rhw_3::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rEa_1> double_ = class_("magma_cube", af_3.class_(rEa_1::new, aH_2.MONSTER).byte_().class_(2.04F, 2.04F).class_(8));
   public static final aI_2<rsu_3> switch_ = class_("minecart", af_3.<rsu_3>class_(rsu_3::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rsk_3> r = class_("chest_minecart", af_3.<rsk_3>class_(rsk_3::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rsW_2> P = class_("command_block_minecart", af_3.<rsW_2>class_(rsW_2::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rsN_2> B = class_("furnace_minecart", af_3.<rsN_2>class_(rsN_2::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rsc_3> S = class_("hopper_minecart", af_3.<rsc_3>class_(rsc_3::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rsm_3> s = class_("spawner_minecart", af_3.<rsm_3>class_(rsm_3::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rsv_3> E = class_("tnt_minecart", af_3.<rsv_3>class_(rsv_3::new, aH_2.MISC).class_(0.98F, 0.7F).class_(8));
   public static final aI_2<rhE_2> G = class_("mule", af_3.class_(rhE_2::new, aH_2.CREATURE).class_(1.3964844F, 1.6F).class_(8));
   public static final aI_2<rMF> b = class_("mooshroom", af_3.class_(rMF::new, aH_2.CREATURE).class_(0.9F, 1.4F).class_(10));
   public static final aI_2<rMA> M = class_("ocelot", af_3.class_(rMA::new, aH_2.CREATURE).class_(0.6F, 0.7F).class_(10));
   public static final aI_2<rsO_2> O = class_("painting", af_3.<rsO_2>class_(rsO_2::new, aH_2.MISC).class_(0.5F, 0.5F).class_(10).break_(Integer.MAX_VALUE));
   public static final aI_2<rMl_1> h = class_("panda", af_3.class_(rMl_1::new, aH_2.CREATURE).class_(1.3F, 1.25F).class_(10));
   public static final aI_2<rMR> X = class_("parrot", af_3.class_(rMR::new, aH_2.CREATURE).class_(0.5F, 0.9F).class_(8));
   public static final aI_2<rGB> J = class_("phantom", af_3.class_(rGB::new, aH_2.MONSTER).class_(0.9F, 0.5F).class_(8));
   public static final aI_2<rMo_1> x = class_("pig", af_3.class_(rMo_1::new, aH_2.CREATURE).class_(0.9F, 0.9F).class_(10));
   public static final aI_2<rbk_3> d = class_("piglin", af_3.class_(rbk_3::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rbd_3> k = class_("piglin_brute", af_3.class_(rbd_3::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rGJ> W = class_("pillager", af_3.class_(rGJ::new, aH_2.MONSTER).protected_().class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rMK> z = class_("polar_bear", af_3.class_(rMK::new, aH_2.CREATURE).class_(1.4F, 1.4F).class_(10));
   public static final aI_2<rsX_2> Q = class_("tnt", af_3.<rsX_2>class_(rsX_2::new, aH_2.MISC).byte_().class_(0.98F, 0.98F).class_(10).break_(10));
   public static final aI_2<rOf_1> N = class_("pufferfish", af_3.class_(rOf_1::new, aH_2.WATER_AMBIENT).class_(0.7F, 0.7F).class_(4));
   public static final aI_2<rMi_1> c = class_("rabbit", af_3.class_(rMi_1::new, aH_2.CREATURE).class_(0.4F, 0.5F).class_(8));
   public static final aI_2<rGx_1> u = class_("ravager", af_3.class_(rGx_1::new, aH_2.MONSTER).class_(1.95F, 2.2F).class_(10));
   public static final aI_2<rOV> m = class_("salmon", af_3.class_(rOV::new, aH_2.WATER_AMBIENT).class_(0.7F, 0.4F).class_(4));
   public static final aI_2<rOb_1> Z = class_("sheep", af_3.class_(rOb_1::new, aH_2.CREATURE).class_(0.9F, 1.3F).class_(10));
   public static final aI_2<rGz_1> v = class_("shulker", af_3.class_(rGz_1::new, aH_2.MONSTER).byte_().protected_().class_(1.0F, 1.0F).class_(10));
   public static final aI_2<rhg_3> F = class_("shulker_bullet", af_3.<rhg_3>class_(rhg_3::new, aH_2.MISC).class_(0.3125F, 0.3125F).class_(8));
   public static final aI_2<rGZ> L = class_("silverfish", af_3.class_(rGZ::new, aH_2.MONSTER).class_(0.4F, 0.3F).class_(8));
   public static final aI_2<rGL> A = class_("skeleton", af_3.class_(rGL::new, aH_2.MONSTER).class_(0.6F, 1.99F).class_(8));
   public static final aI_2<rhG_2> n = class_("skeleton_horse", af_3.class_(rhG_2::new, aH_2.CREATURE).class_(1.3964844F, 1.6F).class_(10));
   public static final aI_2<rGA> C = class_("slime", af_3.class_(rGA::new, aH_2.MONSTER).class_(2.04F, 2.04F).class_(10));
   public static final aI_2<rhR_2> l = class_("small_fireball", af_3.<rhR_2>class_(rhR_2::new, aH_2.MISC).class_(0.3125F, 0.3125F).class_(4).break_(10));
   public static final aI_2<rOX> H = class_("snow_golem", af_3.class_(rOX::new, aH_2.MISC).class_(0.7F, 1.9F).class_(8));
   public static final aI_2<rhY_2> y = class_("snowball", af_3.<rhY_2>class_(rhY_2::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rho_3> p = class_("spectral_arrow", af_3.<rho_3>class_(rho_3::new, aH_2.MISC).class_(0.5F, 0.5F).class_(4).break_(20));
   public static final aI_2<rGw_1> q = class_("spider", af_3.class_(rGw_1::new, aH_2.MONSTER).class_(1.4F, 0.9F).class_(8));
   public static final aI_2<rOJ> T = class_("squid", af_3.class_(rOJ::new, aH_2.WATER_CREATURE).class_(0.8F, 0.8F).class_(8));
   public static final aI_2<rGV> t = class_("stray", af_3.class_(rGV::new, aH_2.MONSTER).class_(0.6F, 1.99F).class_(8));
   public static final aI_2<rOk_1> w = class_("strider", af_3.class_(rOk_1::new, aH_2.CREATURE).byte_().class_(0.9F, 1.7F).class_(10));
   public static final aI_2<rhn_3> I = class_("egg", af_3.<rhn_3>class_(rhn_3::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rSi_1> f = class_("ender_pearl", af_3.<rSi_1>class_(rSi_1::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rsr_3> j = class_("experience_bottle", af_3.<rsr_3>class_(rsr_3::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rhI_2> V = class_("potion", af_3.<rhI_2>class_(rhI_2::new, aH_2.MISC).class_(0.25F, 0.25F).class_(4).break_(10));
   public static final aI_2<rhD_2> g = class_("trident", af_3.<rhD_2>class_(rhD_2::new, aH_2.MISC).class_(0.5F, 0.5F).class_(4).break_(20));
   public static final aI_2<rhb_3> R = class_("trader_llama", af_3.class_(rhb_3::new, aH_2.CREATURE).class_(0.9F, 1.87F).class_(10));
   public static final aI_2<rOg_1> Y = class_("tropical_fish", af_3.class_(rOg_1::new, aH_2.WATER_AMBIENT).class_(0.5F, 0.4F).class_(4));
   public static final aI_2<rON> o = class_("turtle", af_3.class_(rON::new, aH_2.CREATURE).class_(1.2F, 0.4F).class_(10));
   public static final aI_2<rGg_1> K = class_("vex", af_3.class_(rGg_1::new, aH_2.MONSTER).byte_().class_(0.4F, 0.8F).class_(8));
   public static final aI_2<rsq_3> D = class_("villager", af_3.<rsq_3>class_(rsq_3::new, aH_2.MISC).class_(0.6F, 1.95F).class_(10));
   public static final aI_2<rGD> U = class_("vindicator", af_3.class_(rGD::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rsU_2> e = class_("wandering_trader", af_3.class_(rsU_2::new, aH_2.CREATURE).class_(0.6F, 1.95F).class_(10));
   public static final aI_2<rGi_1> a = class_("witch", af_3.class_(rGi_1::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rSN> i = class_("wither", af_3.class_(rSN::new, aH_2.MONSTER).byte_().class_(xu_3.ry).class_(0.9F, 3.5F).class_(10));
   public static final aI_2<rbr_3> rr = class_("wither_skeleton", af_3.class_(rbr_3::new, aH_2.MONSTER).byte_().class_(xu_3.ry).class_(0.7F, 2.4F).class_(8));
   public static final aI_2<rhU_2> rP = class_("wither_skull", af_3.<rhU_2>class_(rhU_2::new, aH_2.MISC).class_(0.3125F, 0.3125F).class_(4).break_(10));
   public static final aI_2<rOH> rB = class_("wolf", af_3.class_(rOH::new, aH_2.CREATURE).class_(0.6F, 0.85F).class_(10));
   public static final aI_2<rbP_2> rS = class_("zoglin", af_3.class_(rbP_2::new, aH_2.MONSTER).byte_().class_(1.3964844F, 1.4F).class_(8));
   public static final aI_2<rbB_2> rs = class_("zombie", af_3.<rbB_2>class_(rbB_2::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rhO_2> rE = class_("zombie_horse", af_3.class_(rhO_2::new, aH_2.CREATURE).class_(1.3964844F, 1.6F).class_(10));
   public static final aI_2<rbE_2> rG = class_("zombie_villager", af_3.class_(rbE_2::new, aH_2.MONSTER).class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rbG_2> rb = class_("zombified_piglin", af_3.class_(rbG_2::new, aH_2.MONSTER).byte_().class_(0.6F, 1.95F).class_(8));
   public static final aI_2<rhd_3> rM = class_("player", af_3.<rhd_3>class_(aH_2.MISC).break_().class_().class_(0.6F, 1.8F).class_(32).break_(2));
   public static final aI_2<rhp_3> rO = class_("fishing_bobber", af_3.<rhp_3>class_(aH_2.MISC).break_().class_().class_(0.25F, 0.25F).class_(4).break_(5));
   private final aj_3<T> rX;
   private final aH_2 rJ;
   private final ImmutableSet<xd_3> rx;
   private final boolean rd;
   private final boolean rk;
   private final boolean rW;
   private final boolean rz;
   private final int rQ;
   private final int rN;
   private String rc;
   private rgP_2 ru;
   private rqO_2 rm;
   private final ap_3 rZ;

   public boolean byte_() {
      return this.rW;
   }

   public boolean int_() {
      return this != rM
         && this != for_
         && this != i
         && this != protected_
         && this != default_
         && this != strictfp_
         && this != O
         && this != super_
         && this != public_;
   }

   public aI_2(aj_3<T> var1, aH_2 var2, boolean var3, boolean var4, boolean var5, boolean var6, ImmutableSet<xd_3> var7, ap_3 var8, int var9, int var10) {
      this.rX = var1;
      this.rJ = var2;
      this.rz = var6;
      this.rd = var3;
      this.rk = var4;
      this.rW = var5;
      this.rx = var7;
      this.rZ = var8;
      this.rQ = var9;
      this.rN = var10;
   }

   @Override
   public String toString() {
      return this.private_();
   }

   public static an_3 class_(int var0, rYB var1) {
      return class_(var1, rVL.transient_.class_(var0));
   }

   public static Optional<an_3> class_(rcd_3 var0, rYB var1) {
      return rqR_2.class_(class_(var0).map(var1x -> var1x.class_(var1)), var1x -> var1x.throws_(var0), () -> {
      });
   }

   private static an_3 class_(rYB var0, aI_2<?> var1) {
      return var1 == null ? null : var1.class_(var0);
   }

   public T class_(rYB var1) {
      return this.rX.create(this, var1);
   }

   private static <T extends an_3> aI_2<T> class_(String var0, af_3<T> var1) {
      return rVL.class_(rVL.transient_, var0, var1.class_(var0));
   }

   public boolean class_(xc_3 var1) {
      if (this.rx.contains(var1.break_())) {
         return false;
      } else {
         return this.rW || !var1.class_(rls_3.N) && !var1.class_(xu_3.bV) && !xn_3.private_(var1) && !var1.class_(xu_3.instanceof_)
            ? var1.class_(xu_3.ry) || var1.class_(xu_3.XJ) || var1.class_(xu_3.Pw)
            : true;
      }
   }

   public boolean class_(rlb_3<aI_2<?>> var1) {
      return var1.class_(this);
   }

   public static an_3 class_(rcd_3 var0, rYB var1, Function<an_3, an_3> var2) {
      return break_(var0, var1).<an_3>map(var2).map(var3 -> {
         if (var0.byte_("Passengers", 9)) {
            rcy_3 var4 = var0.protected_("Passengers", 10);

            for (int var5 = 0; var5 < var4.size(); var5++) {
               an_3 var6 = class_(var4.class_(var5), var1, var2);
               if (var6 != null) {
                  var6.class_(var3, true);
               }
            }
         }

         return (an_3)var3;
      }).orElse((an_3)null);
   }

   public static Optional<aI_2<?>> class_(rcd_3 var0) {
      return rVL.transient_.break_(new rqO_2(var0.native_("id")));
   }

   public rfl_3 class_(double var1, double var3, double var5) {
      float var7 = this.extends_() / 2.0F;
      return new rfl_3(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)this.native_(), var5 + (double)var7);
   }

   public boolean class_() {
      return this.rd;
   }

   public an_3 class_(rrEm_1 var1, rdn_3 var2, rhd_3 var3, rfH_2 var4, iO_2 var5, boolean var6, boolean var7) {
      return this.class_(var1, var2 == null ? null : var2.package_(), var2 != null && var2.this_() ? var2.continue_() : null, var3, var4, var5, var6, var7);
   }

   public static void class_(rYB var0, rhd_3 var1, an_3 var2, rcd_3 var3) {
      if (var3 != null && var3.byte_("EntityTag", 10)) {
         rnW_2 var4 = var0.const_();
         if (var4 != null && var2 != null && (var0.continue_ || !var2.o() || var1 != null && var4.x().case_(var1.sv()))) {
            rcd_3 var5 = var2.case_(new rcd_3());
            UUID var6 = var2.ro();
            var5.class_(var3.int_("EntityTag"));
            var2.a_(var6);
            var2.throws_(var5);
         }
      }
   }

   public static Optional<aI_2<?>> class_(String var0) {
      return rVL.transient_.break_(rqO_2.break_(var0));
   }

   protected static double class_(rRR var0, rfH_2 var1, boolean var2, rfl_3 var3) {
      rfl_3 var4 = new rfl_3(var1);
      if (var2) {
         var4 = var4.break_(0.0, -1.0, 0.0);
      }

      Stream var5 = var0.byte_((an_3)null, var4, var0x -> true);
      return 1.0 + rjw_3.class_(rpB_2.Y, var3, var5, var2 ? -2.0 : -1.0);
   }

   public T class_(rrEm_1 var1, rcd_3 var2, rgP_2 var3, rhd_3 var4, rfH_2 var5, iO_2 var6, boolean var7, boolean var8) {
      an_3 var9 = this.break_(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var9 != null) {
         var1.class_(var9);
      }

      return (T)var9;
   }

   public static rqO_2 class_(aI_2<?> var0) {
      return rVL.transient_.break_(var0);
   }

   private static Optional<an_3> break_(rcd_3 var0, rYB var1) {
      try {
         return class_(var0, var1);
      } catch (RuntimeException var3) {
         rh.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public T break_(rrEm_1 var1, rcd_3 var2, rgP_2 var3, rhd_3 var4, rfH_2 var5, iO_2 var6, boolean var7, boolean var8) {
      an_3 var9 = this.class_(var1);
      if (var9 == null) {
         return null;
      } else {
         double var10;
         if (var7) {
            var9.new_((double)var5.b_() + 0.5, (double)(var5.c_() + 1), (double)var5.d_() + 0.5);
            var10 = class_(var1, var5, var8, var9.rN());
         } else {
            var10 = 0.0;
         }

         var9.class_((double)var5.b_() + 0.5, (double)var5.c_() + var10, (double)var5.d_() + 0.5, rfU_2.catch_(var1.int_.nextFloat() * 360.0F), 0.0F);
         if (var9 instanceof is_3 var12) {
            Float var17 = (Float)var12.throws_[15];
            var12.private_[25] = var17;
            Float var18 = (Float)var12.throws_[15];
            var12.private_[23] = var18;
            var12.class_(var1, var1.throws_(var12.Bs()), var6, (aU_2)null, var2);
            var12.long_();
         }

         if (var3 != null && var9 instanceof iB_2) {
            var9.break_(var3);
         }

         class_(var1, var4, var9, var2);
         return (T)var9;
      }
   }

   public boolean break_() {
      return this.rk;
   }

   public aH_2 throws_() {
      return this.rJ;
   }

   public rqO_2 finally_() {
      if (this.rm == null) {
         rqO_2 var1 = rVL.transient_.break_(this);
         this.rm = new rqO_2(var1.byte_(), "entities/" + var1.break_());
      }

      return this.rm;
   }

   public boolean catch_() {
      return this.rJ != aH_2.MISC ? true : this.case_() || this == short_ || this == f;
   }

   public float extends_() {
      return this.rZ.class_;
   }

   public boolean case_() {
      return this.rJ != aH_2.MISC ? true : this == rM || this == break_ || this == D || this == static_ || this == import_ || this == H;
   }

   public rgP_2 implements_() {
      if (this.ru == null) {
         this.ru = new rgn_3(this.private_());
      }

      return this.ru;
   }

   public int package_() {
      return this.rN;
   }

   public boolean protected_() {
      return this.rz;
   }

   public String private_() {
      if (this.rc == null) {
         this.rc = rqR_2.class_("entity", rVL.transient_.break_(this));
      }

      return this.rc;
   }

   public int final_() {
      return this.rQ;
   }

   public ap_3 volatile_() {
      return this.rZ;
   }

   public float native_() {
      return this.rZ.break_;
   }
}
