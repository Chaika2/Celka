/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aH_2;
import celestial.aU_2;
import celestial.aZ_2;
import celestial.af_3;
import celestial.aj_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.is_3;
import celestial.rEA;
import celestial.rED;
import celestial.rEI;
import celestial.rEJ;
import celestial.rEL;
import celestial.rEO;
import celestial.rEX;
import celestial.rEY;
import celestial.rEa_1;
import celestial.rEc_1;
import celestial.rEg_1;
import celestial.rEu_1;
import celestial.rEw_1;
import celestial.rEx_1;
import celestial.rEy_1;
import celestial.rGA;
import celestial.rGB;
import celestial.rGD;
import celestial.rGJ;
import celestial.rGL;
import celestial.rGV;
import celestial.rGZ;
import celestial.rGg_1;
import celestial.rGi_1;
import celestial.rGw_1;
import celestial.rGx_1;
import celestial.rGz_1;
import celestial.rMA;
import celestial.rMF;
import celestial.rMK;
import celestial.rMR;
import celestial.rMZ;
import celestial.rMi_1;
import celestial.rMl_1;
import celestial.rMo_1;
import celestial.rOH;
import celestial.rOI;
import celestial.rOJ;
import celestial.rON;
import celestial.rOV;
import celestial.rOX;
import celestial.rOa_1;
import celestial.rOb_1;
import celestial.rOf_1;
import celestial.rOg_1;
import celestial.rOi_1;
import celestial.rOk_1;
import celestial.rRR;
import celestial.rSK;
import celestial.rSN;
import celestial.rSY;
import celestial.rSa_1;
import celestial.rSg_1;
import celestial.rSi_1;
import celestial.rSu_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rbE_2;
import celestial.rbF_2;
import celestial.rbG_2;
import celestial.rbP_2;
import celestial.rbR_2;
import celestial.rbY_2;
import celestial.rba_3;
import celestial.rbd_3;
import celestial.rbf_3;
import celestial.rbk_3;
import celestial.rbo_3;
import celestial.rbr_3;
import celestial.rbv_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhA_2;
import celestial.rhC_2;
import celestial.rhD_2;
import celestial.rhE_2;
import celestial.rhF_2;
import celestial.rhG_2;
import celestial.rhH_2;
import celestial.rhI_2;
import celestial.rhO_2;
import celestial.rhP_2;
import celestial.rhR_2;
import celestial.rhU_2;
import celestial.rhY_2;
import celestial.rhb_3;
import celestial.rhd_3;
import celestial.rhg_3;
import celestial.rhl_3;
import celestial.rhn_3;
import celestial.rho_3;
import celestial.rhp_3;
import celestial.rhw_3;
import celestial.rhy_3;
import celestial.rjC_2;
import celestial.rjw_3;
import celestial.rlb_3;
import celestial.rls_3;
import celestial.rnW_2;
import celestial.rpB_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrEm_1;
import celestial.rsB_2;
import celestial.rsE_2;
import celestial.rsG_2;
import celestial.rsM_2;
import celestial.rsN_2;
import celestial.rsO_2;
import celestial.rsP_2;
import celestial.rsU_2;
import celestial.rsW_2;
import celestial.rsX_2;
import celestial.rsc_3;
import celestial.rsk_3;
import celestial.rsm_3;
import celestial.rsq_3;
import celestial.rsr_3;
import celestial.rsu_3;
import celestial.rsv_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xn_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aI_2<T extends an_3> {
    private static final Logger rh = LogManager.getLogger();
    public static final aI_2<aZ_2> id_class = aI_2.id_class("area_effect_cloud", af_3.id_class(aZ_2::new, aH_2.MISC).id_byte().id_class(6.0f, 0.5f).id_class(10).id_break(Integer.MAX_VALUE));
    public static final aI_2<rSY> id_break = aI_2.id_class("armor_stand", af_3.id_class(rSY::new, aH_2.MISC).id_class(0.5f, 1.975f).id_class(10));
    public static final aI_2<rhF_2> id_byte = aI_2.id_class("arrow", af_3.id_class(rhF_2::new, aH_2.MISC).id_class(0.5f, 0.5f).id_class(4).id_break(20));
    public static final aI_2<rbv_3> id_protected = aI_2.id_class("bat", af_3.id_class(rbv_3::new, aH_2.AMBIENT).id_class(0.5f, 0.9f).id_class(5));
    public static final aI_2<rbF_2> id_throws = aI_2.id_class("bee", af_3.id_class(rbF_2::new, aH_2.CREATURE).id_class(0.7f, 0.6f).id_class(8));
    public static final aI_2<rEO> id_case = aI_2.id_class("blaze", af_3.id_class(rEO::new, aH_2.MONSTER).id_byte().id_class(0.6f, 1.8f).id_class(8));
    public static final aI_2<rSK> id_catch = aI_2.id_class("boat", af_3.id_class(rSK::new, aH_2.MISC).id_class(1.375f, 0.5625f).id_class(10));
    public static final aI_2<rbf_3> id_private = aI_2.id_class("cat", af_3.id_class(rbf_3::new, aH_2.CREATURE).id_class(0.6f, 0.7f).id_class(8));
    public static final aI_2<rEX> id_implements = aI_2.id_class("cave_spider", af_3.id_class(rEX::new, aH_2.MONSTER).id_class(0.7f, 0.5f).id_class(8));
    public static final aI_2<rbR_2> id_finally = aI_2.id_class("chicken", af_3.id_class(rbR_2::new, aH_2.CREATURE).id_class(0.4f, 0.7f).id_class(10));
    public static final aI_2<rOI> id_extends = aI_2.id_class("cod", af_3.id_class(rOI::new, aH_2.WATER_AMBIENT).id_class(0.5f, 0.3f).id_class(4));
    public static final aI_2<rbY_2> id_native = aI_2.id_class("cow", af_3.id_class(rbY_2::new, aH_2.CREATURE).id_class(0.9f, 1.4f).id_class(10));
    public static final aI_2<rEJ> id_volatile = aI_2.id_class("creeper", af_3.id_class(rEJ::new, aH_2.MONSTER).id_class(0.6f, 1.7f).id_class(8));
    public static final aI_2<rbo_3> id_final = aI_2.id_class("dolphin", af_3.id_class(rbo_3::new, aH_2.WATER_CREATURE).id_class(0.9f, 0.6f));
    public static final aI_2<rOa_1> id_package = aI_2.id_class("donkey", af_3.id_class(rOa_1::new, aH_2.CREATURE).id_class(1.3964844f, 1.5f).id_class(10));
    public static final aI_2<rhA_2> id_int = aI_2.id_class("dragon_fireball", af_3.id_class(rhA_2::new, aH_2.MISC).id_class(1.0f, 1.0f).id_class(4).id_break(10));
    public static final aI_2<rEx_1> id_new = aI_2.id_class("drowned", af_3.id_class(rEx_1::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rEc_1> id_continue = aI_2.id_class("elder_guardian", af_3.id_class(rEc_1::new, aH_2.MONSTER).id_class(1.9975f, 1.9975f).id_class(10));
    public static final aI_2<rSa_1> id_super = aI_2.id_class("end_crystal", af_3.id_class(rSa_1::new, aH_2.MISC).id_class(2.0f, 2.0f).id_class(16).id_break(Integer.MAX_VALUE));
    public static final aI_2<rSu_1> id_this = aI_2.id_class("ender_dragon", af_3.id_class(rSu_1::new, aH_2.MONSTER).id_byte().id_class(16.0f, 8.0f).id_class(10));
    public static final aI_2<rEu_1> id_else = aI_2.id_class("enderman", af_3.id_class(rEu_1::new, aH_2.MONSTER).id_class(0.6f, 2.9f).id_class(8));
    public static final aI_2<rEL> id_synchronized = aI_2.id_class("endermite", af_3.id_class(rEL::new, aH_2.MONSTER).id_class(0.4f, 0.3f).id_class(8));
    public static final aI_2<rEA> id_return = aI_2.id_class("evoker", af_3.id_class(rEA::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rhC_2> id_public = aI_2.id_class("evoker_fangs", af_3.id_class(rhC_2::new, aH_2.MISC).id_class(0.5f, 0.8f).id_class(6).id_break(2));
    public static final aI_2<rsP_2> id_goto = aI_2.id_class("experience_orb", af_3.id_class(rsP_2::new, aH_2.MISC).id_class(0.5f, 0.5f).id_class(6).id_break(20));
    public static final aI_2<rhl_3> id_while = aI_2.id_class("eye_of_ender", af_3.id_class(rhl_3::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(4));
    public static final aI_2<rsB_2> id_try = aI_2.id_class("falling_block", af_3.id_class(rsB_2::new, aH_2.MISC).id_class(0.98f, 0.98f).id_class(10).id_break(20));
    public static final aI_2<rhy_3> id_instanceof = aI_2.id_class("firework_rocket", af_3.id_class(rhy_3::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rba_3> id_throw = aI_2.id_class("fox", af_3.id_class(rba_3::new, aH_2.CREATURE).id_class(0.6f, 0.7f).id_class(8).id_class(xu_3.XJ));
    public static final aI_2<rEy_1> id_interface = aI_2.id_class("ghast", af_3.id_class(rEy_1::new, aH_2.MONSTER).id_byte().id_class(4.0f, 4.0f).id_class(10));
    public static final aI_2<rEw_1> id_char = aI_2.id_class("giant", af_3.id_class(rEw_1::new, aH_2.MONSTER).id_class(3.6f, 12.0f).id_class(10));
    public static final aI_2<rEI> id_abstract = aI_2.id_class("guardian", af_3.id_class(rEI::new, aH_2.MONSTER).id_class(0.85f, 0.85f).id_class(8));
    public static final aI_2<rEg_1> id_long = aI_2.id_class("hoglin", af_3.id_class(rEg_1::new, aH_2.MONSTER).id_class(1.3964844f, 1.4f).id_class(8));
    public static final aI_2<rOi_1> id_float = aI_2.id_class("horse", af_3.id_class(rOi_1::new, aH_2.CREATURE).id_class(1.3964844f, 1.6f).id_class(10));
    public static final aI_2<rEY> id_void = aI_2.id_class("husk", af_3.id_class(rEY::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rED> id_static = aI_2.id_class("illusioner", af_3.id_class(rED::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rMZ> id_import = aI_2.id_class("iron_golem", af_3.id_class(rMZ::new, aH_2.MISC).id_class(1.4f, 2.7f).id_class(10));
    public static final aI_2<rsE_2> id_short = aI_2.id_class("item", af_3.id_class(rsE_2::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(6).id_break(20));
    public static final aI_2<rsG_2> id_default = aI_2.id_class("item_frame", af_3.id_class(rsG_2::new, aH_2.MISC).id_class(0.5f, 0.5f).id_class(10).id_break(Integer.MAX_VALUE));
    public static final aI_2<rhH_2> id_const = aI_2.id_class("fireball", af_3.id_class(rhH_2::new, aH_2.MISC).id_class(1.0f, 1.0f).id_class(4).id_break(10));
    public static final aI_2<rsM_2> id_strictfp = aI_2.id_class("leash_knot", af_3.id_class(rsM_2::new, aH_2.MISC).id_break().id_class(0.5f, 0.5f).id_class(10).id_break(Integer.MAX_VALUE));
    public static final aI_2<rSg_1> id_boolean = aI_2.id_class("lightning_bolt", af_3.id_class(rSg_1::new, aH_2.MISC).id_break().id_class(0.0f, 0.0f).id_class(16).id_break(Integer.MAX_VALUE));
    public static final aI_2<rhP_2> id_transient = aI_2.id_class("llama", af_3.id_class(rhP_2::new, aH_2.CREATURE).id_class(0.9f, 1.87f).id_class(10));
    public static final aI_2<rhw_3> id_for = aI_2.id_class("llama_spit", af_3.id_class(rhw_3::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rEa_1> id_double = aI_2.id_class("magma_cube", af_3.id_class(rEa_1::new, aH_2.MONSTER).id_byte().id_class(2.04f, 2.04f).id_class(8));
    public static final aI_2<rsu_3> id_switch = aI_2.id_class("minecart", af_3.id_class(rsu_3::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rsk_3> r = aI_2.id_class("chest_minecart", af_3.id_class(rsk_3::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rsW_2> P = aI_2.id_class("command_block_minecart", af_3.id_class(rsW_2::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rsN_2> B = aI_2.id_class("furnace_minecart", af_3.id_class(rsN_2::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rsc_3> S = aI_2.id_class("hopper_minecart", af_3.id_class(rsc_3::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rsm_3> s = aI_2.id_class("spawner_minecart", af_3.id_class(rsm_3::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rsv_3> E = aI_2.id_class("tnt_minecart", af_3.id_class(rsv_3::new, aH_2.MISC).id_class(0.98f, 0.7f).id_class(8));
    public static final aI_2<rhE_2> G = aI_2.id_class("mule", af_3.id_class(rhE_2::new, aH_2.CREATURE).id_class(1.3964844f, 1.6f).id_class(8));
    public static final aI_2<rMF> b = aI_2.id_class("mooshroom", af_3.id_class(rMF::new, aH_2.CREATURE).id_class(0.9f, 1.4f).id_class(10));
    public static final aI_2<rMA> M = aI_2.id_class("ocelot", af_3.id_class(rMA::new, aH_2.CREATURE).id_class(0.6f, 0.7f).id_class(10));
    public static final aI_2<rsO_2> O = aI_2.id_class("painting", af_3.id_class(rsO_2::new, aH_2.MISC).id_class(0.5f, 0.5f).id_class(10).id_break(Integer.MAX_VALUE));
    public static final aI_2<rMl_1> h = aI_2.id_class("panda", af_3.id_class(rMl_1::new, aH_2.CREATURE).id_class(1.3f, 1.25f).id_class(10));
    public static final aI_2<rMR> X = aI_2.id_class("parrot", af_3.id_class(rMR::new, aH_2.CREATURE).id_class(0.5f, 0.9f).id_class(8));
    public static final aI_2<rGB> J = aI_2.id_class("phantom", af_3.id_class(rGB::new, aH_2.MONSTER).id_class(0.9f, 0.5f).id_class(8));
    public static final aI_2<rMo_1> x = aI_2.id_class("pig", af_3.id_class(rMo_1::new, aH_2.CREATURE).id_class(0.9f, 0.9f).id_class(10));
    public static final aI_2<rbk_3> d = aI_2.id_class("piglin", af_3.id_class(rbk_3::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rbd_3> k = aI_2.id_class("piglin_brute", af_3.id_class(rbd_3::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rGJ> W = aI_2.id_class("pillager", af_3.id_class(rGJ::new, aH_2.MONSTER).id_protected().id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rMK> z = aI_2.id_class("polar_bear", af_3.id_class(rMK::new, aH_2.CREATURE).id_class(1.4f, 1.4f).id_class(10));
    public static final aI_2<rsX_2> Q = aI_2.id_class("tnt", af_3.id_class(rsX_2::new, aH_2.MISC).id_byte().id_class(0.98f, 0.98f).id_class(10).id_break(10));
    public static final aI_2<rOf_1> N = aI_2.id_class("pufferfish", af_3.id_class(rOf_1::new, aH_2.WATER_AMBIENT).id_class(0.7f, 0.7f).id_class(4));
    public static final aI_2<rMi_1> c = aI_2.id_class("rabbit", af_3.id_class(rMi_1::new, aH_2.CREATURE).id_class(0.4f, 0.5f).id_class(8));
    public static final aI_2<rGx_1> u = aI_2.id_class("ravager", af_3.id_class(rGx_1::new, aH_2.MONSTER).id_class(1.95f, 2.2f).id_class(10));
    public static final aI_2<rOV> m = aI_2.id_class("salmon", af_3.id_class(rOV::new, aH_2.WATER_AMBIENT).id_class(0.7f, 0.4f).id_class(4));
    public static final aI_2<rOb_1> Z = aI_2.id_class("sheep", af_3.id_class(rOb_1::new, aH_2.CREATURE).id_class(0.9f, 1.3f).id_class(10));
    public static final aI_2<rGz_1> v = aI_2.id_class("shulker", af_3.id_class(rGz_1::new, aH_2.MONSTER).id_byte().id_protected().id_class(1.0f, 1.0f).id_class(10));
    public static final aI_2<rhg_3> F = aI_2.id_class("shulker_bullet", af_3.id_class(rhg_3::new, aH_2.MISC).id_class(0.3125f, 0.3125f).id_class(8));
    public static final aI_2<rGZ> L = aI_2.id_class("silverfish", af_3.id_class(rGZ::new, aH_2.MONSTER).id_class(0.4f, 0.3f).id_class(8));
    public static final aI_2<rGL> A = aI_2.id_class("skeleton", af_3.id_class(rGL::new, aH_2.MONSTER).id_class(0.6f, 1.99f).id_class(8));
    public static final aI_2<rhG_2> n = aI_2.id_class("skeleton_horse", af_3.id_class(rhG_2::new, aH_2.CREATURE).id_class(1.3964844f, 1.6f).id_class(10));
    public static final aI_2<rGA> C = aI_2.id_class("slime", af_3.id_class(rGA::new, aH_2.MONSTER).id_class(2.04f, 2.04f).id_class(10));
    public static final aI_2<rhR_2> l = aI_2.id_class("small_fireball", af_3.id_class(rhR_2::new, aH_2.MISC).id_class(0.3125f, 0.3125f).id_class(4).id_break(10));
    public static final aI_2<rOX> H = aI_2.id_class("snow_golem", af_3.id_class(rOX::new, aH_2.MISC).id_class(0.7f, 1.9f).id_class(8));
    public static final aI_2<rhY_2> y = aI_2.id_class("snowball", af_3.id_class(rhY_2::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rho_3> p = aI_2.id_class("spectral_arrow", af_3.id_class(rho_3::new, aH_2.MISC).id_class(0.5f, 0.5f).id_class(4).id_break(20));
    public static final aI_2<rGw_1> q = aI_2.id_class("spider", af_3.id_class(rGw_1::new, aH_2.MONSTER).id_class(1.4f, 0.9f).id_class(8));
    public static final aI_2<rOJ> T = aI_2.id_class("squid", af_3.id_class(rOJ::new, aH_2.WATER_CREATURE).id_class(0.8f, 0.8f).id_class(8));
    public static final aI_2<rGV> t = aI_2.id_class("stray", af_3.id_class(rGV::new, aH_2.MONSTER).id_class(0.6f, 1.99f).id_class(8));
    public static final aI_2<rOk_1> w = aI_2.id_class("strider", af_3.id_class(rOk_1::new, aH_2.CREATURE).id_byte().id_class(0.9f, 1.7f).id_class(10));
    public static final aI_2<rhn_3> I = aI_2.id_class("egg", af_3.id_class(rhn_3::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rSi_1> f = aI_2.id_class("ender_pearl", af_3.id_class(rSi_1::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rsr_3> j = aI_2.id_class("experience_bottle", af_3.id_class(rsr_3::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rhI_2> V = aI_2.id_class("potion", af_3.id_class(rhI_2::new, aH_2.MISC).id_class(0.25f, 0.25f).id_class(4).id_break(10));
    public static final aI_2<rhD_2> g = aI_2.id_class("trident", af_3.id_class(rhD_2::new, aH_2.MISC).id_class(0.5f, 0.5f).id_class(4).id_break(20));
    public static final aI_2<rhb_3> R = aI_2.id_class("trader_llama", af_3.id_class(rhb_3::new, aH_2.CREATURE).id_class(0.9f, 1.87f).id_class(10));
    public static final aI_2<rOg_1> Y = aI_2.id_class("tropical_fish", af_3.id_class(rOg_1::new, aH_2.WATER_AMBIENT).id_class(0.5f, 0.4f).id_class(4));
    public static final aI_2<rON> o = aI_2.id_class("turtle", af_3.id_class(rON::new, aH_2.CREATURE).id_class(1.2f, 0.4f).id_class(10));
    public static final aI_2<rGg_1> K = aI_2.id_class("vex", af_3.id_class(rGg_1::new, aH_2.MONSTER).id_byte().id_class(0.4f, 0.8f).id_class(8));
    public static final aI_2<rsq_3> D = aI_2.id_class("villager", af_3.id_class(rsq_3::new, aH_2.MISC).id_class(0.6f, 1.95f).id_class(10));
    public static final aI_2<rGD> U = aI_2.id_class("vindicator", af_3.id_class(rGD::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rsU_2> e = aI_2.id_class("wandering_trader", af_3.id_class(rsU_2::new, aH_2.CREATURE).id_class(0.6f, 1.95f).id_class(10));
    public static final aI_2<rGi_1> a = aI_2.id_class("witch", af_3.id_class(rGi_1::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rSN> i = aI_2.id_class("wither", af_3.id_class(rSN::new, aH_2.MONSTER).id_byte().id_class(xu_3.ry).id_class(0.9f, 3.5f).id_class(10));
    public static final aI_2<rbr_3> rr = aI_2.id_class("wither_skeleton", af_3.id_class(rbr_3::new, aH_2.MONSTER).id_byte().id_class(xu_3.ry).id_class(0.7f, 2.4f).id_class(8));
    public static final aI_2<rhU_2> rP = aI_2.id_class("wither_skull", af_3.id_class(rhU_2::new, aH_2.MISC).id_class(0.3125f, 0.3125f).id_class(4).id_break(10));
    public static final aI_2<rOH> rB = aI_2.id_class("wolf", af_3.id_class(rOH::new, aH_2.CREATURE).id_class(0.6f, 0.85f).id_class(10));
    public static final aI_2<rbP_2> rS = aI_2.id_class("zoglin", af_3.id_class(rbP_2::new, aH_2.MONSTER).id_byte().id_class(1.3964844f, 1.4f).id_class(8));
    public static final aI_2<rbB_2> rs = aI_2.id_class("zombie", af_3.id_class(rbB_2::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rhO_2> rE = aI_2.id_class("zombie_horse", af_3.id_class(rhO_2::new, aH_2.CREATURE).id_class(1.3964844f, 1.6f).id_class(10));
    public static final aI_2<rbE_2> rG = aI_2.id_class("zombie_villager", af_3.id_class(rbE_2::new, aH_2.MONSTER).id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rbG_2> rb = aI_2.id_class("zombified_piglin", af_3.id_class(rbG_2::new, aH_2.MONSTER).id_byte().id_class(0.6f, 1.95f).id_class(8));
    public static final aI_2<rhd_3> rM = aI_2.id_class("player", af_3.id_class(aH_2.MISC).id_break().id_class().id_class(0.6f, 1.8f).id_class(32).id_break(2));
    public static final aI_2<rhp_3> rO = aI_2.id_class("fishing_bobber", af_3.id_class(aH_2.MISC).id_break().id_class().id_class(0.25f, 0.25f).id_class(4).id_break(5));
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

    public boolean id_byte() {
        return this.rW;
    }

    public boolean id_int() {
        return this != rM && this != id_for && this != i && this != id_protected && this != id_default && this != id_strictfp && this != O && this != id_super && this != id_public;
    }

    public aI_2(aj_3<T> aj_32, aH_2 aH_22, boolean bl, boolean bl2, boolean bl3, boolean bl4, ImmutableSet<xd_3> immutableSet, ap_3 ap_32, int n, int n2) {
        this.rX = aj_32;
        this.rJ = aH_22;
        this.rz = bl4;
        this.rd = bl;
        this.rk = bl2;
        this.rW = bl3;
        this.rx = immutableSet;
        this.rZ = ap_32;
        this.rQ = n;
        this.rN = n2;
    }

    public String toString() {
        return this.id_private();
    }

    public static an_3 id_class(int n, rYB rYB2) {
        return aI_2.id_class(rYB2, rVL.id_transient.id_class(n));
    }

    public static Optional<an_3> id_class(rcd_3 rcd_32, rYB rYB2) {
        return rqR_2.id_class(aI_2.id_class(rcd_32).map(aI_22 -> aI_22.id_class(rYB2)), (T an_32) -> an_32.id_throws(rcd_32), () -> {});
    }

    private static an_3 id_class(rYB rYB2, aI_2<?> aI_22) {
        return aI_22 == null ? null : (an_3)aI_22.id_class(rYB2);
    }

    public T id_class(rYB rYB2) {
        return this.rX.create(this, rYB2);
    }

    private static <T extends an_3> aI_2<T> id_class(String string, af_3<T> af_32) {
        return rVL.id_class(rVL.id_transient, string, af_32.id_class(string));
    }

    public boolean id_class(xc_3 xc_32) {
        if (this.rx.contains((Object)xc_32.id_break())) {
            return false;
        }
        if (this.rW || !xc_32.id_class(rls_3.N) && !xc_32.id_class(xu_3.bV) && !xn_3.id_private(xc_32) && !xc_32.id_class(xu_3.id_instanceof)) {
            return xc_32.id_class(xu_3.ry) || xc_32.id_class(xu_3.XJ) || xc_32.id_class(xu_3.Pw);
        }
        return true;
    }

    public boolean id_class(rlb_3<aI_2<?>> rlb_32) {
        return rlb_32.id_class(this);
    }

    public static an_3 id_class(rcd_3 rcd_32, rYB rYB2, Function<an_3, an_3> function) {
        return aI_2.id_break(rcd_32, rYB2).map(function).map(an_32 -> {
            if (rcd_32.id_byte("Passengers", 9)) {
                rcy_3 rcy_32 = rcd_32.id_protected("Passengers", 10);
                for (int i = 0; i < rcy_32.size(); ++i) {
                    an_3 an_33 = aI_2.id_class(rcy_32.id_class(i), rYB2, function);
                    if (an_33 == null) continue;
                    an_33.id_class((an_3)an_32, true);
                }
            }
            return an_32;
        }).orElse(null);
    }

    public static Optional<aI_2<?>> id_class(rcd_3 rcd_32) {
        return rVL.id_transient.id_break(new rqO_2(rcd_32.id_native("id")));
    }

    public rfl_3 id_class(double d, double d2, double d3) {
        float f = this.id_extends() / 2.0f;
        return new rfl_3(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)this.id_native(), d3 + (double)f);
    }

    public boolean id_class() {
        return this.rd;
    }

    public an_3 id_class(rrEm_1 rrEm_12, rdn_3 rdn_32, rhd_3 rhd_32, rfH_2 rfH_22, iO_2 iO_22, boolean bl, boolean bl2) {
        return this.id_class(rrEm_12, rdn_32 == null ? null : rdn_32.id_package(), rdn_32 != null && rdn_32.id_this() ? rdn_32.id_continue() : null, rhd_32, rfH_22, iO_22, bl, bl2);
    }

    public static void id_class(rYB rYB2, rhd_3 rhd_32, an_3 an_32, rcd_3 rcd_32) {
        rnW_2 rnW_22;
        if (rcd_32 != null && rcd_32.id_byte("EntityTag", 10) && (rnW_22 = rYB2.id_const()) != null && an_32 != null && (rYB2.id_continue || !an_32.o() || rhd_32 != null && rnW_22.x().id_case(rhd_32.sv()))) {
            rcd_3 rcd_33 = an_32.id_case(new rcd_3());
            UUID uUID = an_32.ro();
            rcd_33.id_class(rcd_32.id_int("EntityTag"));
            an_32.a_(uUID);
            an_32.id_throws(rcd_33);
        }
    }

    public static Optional<aI_2<?>> id_class(String string) {
        return rVL.id_transient.id_break(rqO_2.id_break(string));
    }

    protected static double id_class(rRR rRR2, rfH_2 rfH_22, boolean bl, rfl_3 rfl_32) {
        rfl_3 rfl_33 = new rfl_3(rfH_22);
        if (bl) {
            rfl_33 = rfl_33.id_break(0.0, -1.0, 0.0);
        }
        Stream<rjC_2> stream = rRR2.id_byte(null, rfl_33, an_32 -> true);
        return 1.0 + rjw_3.id_class(rpB_2.Y, rfl_32, stream, bl ? -2.0 : -1.0);
    }

    public T id_class(rrEm_1 rrEm_12, rcd_3 rcd_32, rgP_2 rgP_22, rhd_3 rhd_32, rfH_2 rfH_22, iO_2 iO_22, boolean bl, boolean bl2) {
        T t = this.id_break(rrEm_12, rcd_32, rgP_22, rhd_32, rfH_22, iO_22, bl, bl2);
        if (t != null) {
            rrEm_12.id_class((an_3)t);
        }
        return t;
    }

    public static rqO_2 id_class(aI_2<?> aI_22) {
        return rVL.id_transient.id_break(aI_22);
    }

    private static Optional<an_3> id_break(rcd_3 rcd_32, rYB rYB2) {
        try {
            return aI_2.id_class(rcd_32, rYB2);
        }
        catch (RuntimeException runtimeException) {
            rh.warn("Exception loading entity: ", (Throwable)runtimeException);
            return Optional.empty();
        }
    }

    public T id_break(rrEm_1 rrEm_12, rcd_3 rcd_32, rgP_2 rgP_22, rhd_3 rhd_32, rfH_2 rfH_22, iO_2 iO_22, boolean bl, boolean bl2) {
        double d;
        T t = this.id_class(rrEm_12);
        if (t == null) {
            return (T)((an_3)null);
        }
        if (bl) {
            ((an_3)t).id_new((double)rfH_22.b_() + 0.5, rfH_22.c_() + 1, (double)rfH_22.d_() + 0.5);
            d = aI_2.id_class((rRR)rrEm_12, rfH_22, bl2, ((an_3)t).rN());
        } else {
            d = 0.0;
        }
        ((an_3)t).id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + d, (double)rfH_22.d_() + 0.5, rfU_2.id_catch(rrEm_12.id_int.nextFloat() * 360.0f), 0.0f);
        if (t instanceof is_3) {
            is_3 is_32 = (is_3)t;
            Float f = Float.valueOf(((Float)is_32.id_throws[15]).floatValue());
            is_32.id_private[25] = f;
            Float f2 = Float.valueOf(((Float)is_32.id_throws[15]).floatValue());
            is_32.id_private[23] = f2;
            is_32.id_class(rrEm_12, rrEm_12.id_throws(is_32.Bs()), iO_22, (aU_2)null, rcd_32);
            is_32.id_long();
        }
        if (rgP_22 != null && t instanceof iB_2) {
            ((an_3)t).id_break(rgP_22);
        }
        aI_2.id_class(rrEm_12, rhd_32, t, rcd_32);
        return t;
    }

    public boolean id_break() {
        return this.rk;
    }

    public aH_2 id_throws() {
        return this.rJ;
    }

    public rqO_2 id_finally() {
        if (this.rm == null) {
            rqO_2 rqO_22 = rVL.id_transient.id_break(this);
            this.rm = new rqO_2(rqO_22.id_byte(), "entities/" + rqO_22.id_break());
        }
        return this.rm;
    }

    public boolean id_catch() {
        if (this.rJ == aH_2.MISC) {
            return this.id_case() || this == id_short || this == f;
        }
        return true;
    }

    public float id_extends() {
        return this.rZ.id_class;
    }

    public boolean id_case() {
        if (this.rJ == aH_2.MISC) {
            return this == rM || this == id_break || this == D || this == id_static || this == id_import || this == H;
        }
        return true;
    }

    public rgP_2 id_implements() {
        if (this.ru == null) {
            this.ru = new rgn_3(this.id_private());
        }
        return this.ru;
    }

    public int id_package() {
        return this.rN;
    }

    public boolean id_protected() {
        return this.rz;
    }

    public String id_private() {
        if (this.rc == null) {
            this.rc = rqR_2.id_class("entity", rVL.id_transient.id_break(this));
        }
        return this.rc;
    }

    public int id_final() {
        return this.rQ;
    }

    public ap_3 id_volatile() {
        return this.rZ;
    }

    public float id_native() {
        return this.rZ.id_break;
    }
}

