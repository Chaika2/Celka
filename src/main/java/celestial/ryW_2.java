/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.types.Type
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rHA;
import celestial.rHC;
import celestial.rHH;
import celestial.rHJ;
import celestial.rHL;
import celestial.rHM;
import celestial.rHO;
import celestial.rHQ;
import celestial.rHR;
import celestial.rHT;
import celestial.rHU;
import celestial.rHW;
import celestial.rHZ;
import celestial.rHa_1;
import celestial.rHb_1;
import celestial.rHc_1;
import celestial.rHg_1;
import celestial.rHj_1;
import celestial.rHl_1;
import celestial.rHn_1;
import celestial.rHp_1;
import celestial.rHq_1;
import celestial.rHt_1;
import celestial.rHu_1;
import celestial.rHx_1;
import celestial.rHy_1;
import celestial.rHz_1;
import celestial.rRq_1;
import celestial.rTC;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.ryE_2;
import celestial.ryG_2;
import celestial.ryO_2;
import celestial.ryQ_2;
import celestial.ryS_2;
import celestial.ryr_3;
import celestial.rys_3;
import celestial.ryz_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.datafixers.types.Type;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ryW_2<T extends ryO_2> {
    private static final Logger id_float = LogManager.getLogger();
    public static final ryW_2<rHT> id_class = ryW_2.id_class("furnace", ryz_3.id_class(rHT::new, xu_3.Ps));
    public static final ryW_2<rHu_1> id_break = ryW_2.id_class("chest", ryz_3.id_class(rHu_1::new, xu_3.re));
    public static final ryW_2<ryQ_2> id_byte = ryW_2.id_class("trapped_chest", ryz_3.id_class(ryQ_2::new, xu_3.sZ));
    public static final ryW_2<rHq_1> id_protected = ryW_2.id_class("ender_chest", ryz_3.id_class(rHq_1::new, xu_3.SW));
    public static final ryW_2<rHg_1> id_throws = ryW_2.id_class("jukebox", ryz_3.id_class(rHg_1::new, xu_3.Pj));
    public static final ryW_2<rHC> id_case = ryW_2.id_class("dispenser", ryz_3.id_class(rHC::new, xu_3.v));
    public static final ryW_2<rHl_1> id_catch = ryW_2.id_class("dropper", ryz_3.id_class(rHl_1::new, xu_3.st));
    public static final ryW_2<ryS_2> id_private = ryW_2.id_class("sign", ryz_3.id_class(ryS_2::new, xu_3.PE, xu_3.PG, xu_3.Pb, xu_3.PM, xu_3.PO, xu_3.Ph, xu_3.Pk, xu_3.PW, xu_3.Pz, xu_3.PQ, xu_3.PN, xu_3.Pc, xu_3.Jr, xu_3.JB, xu_3.JP, xu_3.JS));
    public static final ryW_2<rHU> id_implements = ryW_2.id_class("mob_spawner", ryz_3.id_class(rHU::new, xu_3.rD));
    public static final ryW_2<rHa_1> id_finally = ryW_2.id_class("piston", ryz_3.id_class(rHa_1::new, xu_3.rc));
    public static final ryW_2<rHQ> id_extends = ryW_2.id_class("brewing_stand", ryz_3.id_class(rHQ::new, xu_3.SG));
    public static final ryW_2<rHH> id_native = ryW_2.id_class("enchanting_table", ryz_3.id_class(rHH::new, xu_3.SE));
    public static final ryW_2<rHp_1> id_volatile = ryW_2.id_class("end_portal", ryz_3.id_class(rHp_1::new, xu_3.SM));
    public static final ryW_2<rHO> id_final = ryW_2.id_class("beacon", ryz_3.id_class(rHO::new, xu_3.Sv));
    public static final ryW_2<rys_3> id_package = ryW_2.id_class("skull", ryz_3.id_class(rys_3::new, xu_3.sM, xu_3.sO, xu_3.sW, xu_3.sz, xu_3.sQ, xu_3.sN, xu_3.sJ, xu_3.sx, xu_3.sh, xu_3.sX, xu_3.sd, xu_3.sk));
    public static final ryW_2<rHn_1> id_int = ryW_2.id_class("daylight_detector", ryz_3.id_class(rHn_1::new, xu_3.sA));
    public static final ryW_2<rHt_1> id_new = ryW_2.id_class("hopper", ryz_3.id_class(rHt_1::new, xu_3.sl));
    public static final ryW_2<rHL> id_continue = ryW_2.id_class("comparator", ryz_3.id_class(rHL::new, xu_3.sL));
    public static final ryW_2<rHb_1> id_super = ryW_2.id_class("banner", ryz_3.id_class(rHb_1::new, xu_3.GG, xu_3.Gb, xu_3.GM, xu_3.GO, xu_3.Gh, xu_3.GX, xu_3.GJ, xu_3.Gx, xu_3.Gd, xu_3.Gk, xu_3.GW, xu_3.Gz, xu_3.GQ, xu_3.GN, xu_3.Gc, xu_3.Gu, xu_3.Gm, xu_3.GZ, xu_3.Gv, xu_3.GF, xu_3.GL, xu_3.GA, xu_3.Gn, xu_3.GC, xu_3.Gl, xu_3.GH, xu_3.Gy, xu_3.Gp, xu_3.Gq, xu_3.GT, xu_3.Gt, xu_3.Gw));
    public static final ryW_2<ryG_2> id_this = ryW_2.id_class("structure_block", ryz_3.id_class(ryG_2::new, xu_3.Js));
    public static final ryW_2<rHy_1> id_else = ryW_2.id_class("end_gateway", ryz_3.id_class(rHy_1::new, xu_3.bw));
    public static final ryW_2<rHZ> id_synchronized = ryW_2.id_class("command_block", ryz_3.id_class(rHZ::new, xu_3.SZ, xu_3.bf, xu_3.bI));
    public static final ryW_2<ryr_3> id_return = ryW_2.id_class("shulker_box", ryz_3.id_class(ryr_3::new, xu_3.bD, xu_3.MX, xu_3.Mb, xu_3.MM, xu_3.ME, xu_3.MS, xu_3.MO, xu_3.bi, xu_3.Ms, xu_3.MP, xu_3.ba, xu_3.be, xu_3.MB, xu_3.MG, xu_3.Mh, xu_3.bU, xu_3.Mr));
    public static final ryW_2<rHJ> id_public = ryW_2.id_class("bed", ryz_3.id_class(rHJ::new, xu_3.R, xu_3.Y, xu_3.j, xu_3.V, xu_3.I, xu_3.t, xu_3.g, xu_3.y, xu_3.w, xu_3.q, xu_3.H, xu_3.l, xu_3.T, xu_3.f, xu_3.C, xu_3.p));
    public static final ryW_2<rHA> id_goto = ryW_2.id_class("conduit", ryz_3.id_class(rHA::new, xu_3.hB));
    public static final ryW_2<rHM> id_while = ryW_2.id_class("barrel", ryz_3.id_class(rHM::new, xu_3.ha));
    public static final ryW_2<ryE_2> id_try = ryW_2.id_class("smoker", ryz_3.id_class(ryE_2::new, xu_3.hi));
    public static final ryW_2<rHz_1> id_instanceof = ryW_2.id_class("blast_furnace", ryz_3.id_class(rHz_1::new, xu_3.Xr));
    public static final ryW_2<rHR> id_throw = ryW_2.id_class("lectern", ryz_3.id_class(rHR::new, xu_3.Xs));
    public static final ryW_2<rHW> id_interface = ryW_2.id_class("bell", ryz_3.id_class(rHW::new, xu_3.Xb));
    public static final ryW_2<rHj_1> id_char = ryW_2.id_class("jigsaw", ryz_3.id_class(rHj_1::new, xu_3.JE));
    public static final ryW_2<rHc_1> id_abstract = ryW_2.id_class("campfire", ryz_3.id_class(rHc_1::new, xu_3.Xh, xu_3.XX));
    public static final ryW_2<rHx_1> id_long = ryW_2.id_class("beehive", ryz_3.id_class(rHx_1::new, xu_3.JM, xu_3.JO));
    private final Supplier<? extends T> id_void;
    private final Set<xd_3> id_static;
    private final Type<?> id_import;

    public ryW_2(Supplier<? extends T> supplier, Set<xd_3> set, Type<?> type) {
        this.id_void = supplier;
        this.id_static = set;
        this.id_import = type;
    }

    public static rqO_2 id_class(ryW_2<?> ryW_22) {
        return rVL.r.id_break(ryW_22);
    }

    public T id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        return (T)(ryO_22 != null && ryO_22.id_void() == this ? ryO_22 : null);
    }

    public boolean id_class(xd_3 xd_32) {
        return this.id_static.contains(xd_32);
    }

    public T id_class() {
        return (T)((ryO_2)this.id_void.get());
    }

    private static <T extends ryO_2> ryW_2<T> id_class(String string, ryz_3<T> ryz_32) {
        if (ryz_32.id_break.isEmpty()) {
            id_float.warn("Block entity type {} requires at least one valid block to be defined!", (Object)string);
        }
        Type<?> type = rqR_2.id_class(rTC.id_extends, string);
        return rVL.id_class(rVL.r, string, ryz_32.id_class(type));
    }
}

