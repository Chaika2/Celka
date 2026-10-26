/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.booleans.BooleanArrayList
 *  it.unimi.dsi.fastutil.booleans.BooleanList
 */
package celestial;

import celestial.rec_3;
import celestial.rjj_3;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpH_2;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rqf_3;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class rjg_3
extends Enum<rjg_3>
implements rpH_2 {
    public static final /* enum */ rjg_3 IDENTITY = new rjg_3("identity", rqf_3.P123, false, false, false);
    public static final /* enum */ rjg_3 ROT_180_FACE_XY = new rjg_3("rot_180_face_xy", rqf_3.P123, true, true, false);
    public static final /* enum */ rjg_3 ROT_180_FACE_XZ = new rjg_3("rot_180_face_xz", rqf_3.P123, true, false, true);
    public static final /* enum */ rjg_3 ROT_180_FACE_YZ = new rjg_3("rot_180_face_yz", rqf_3.P123, false, true, true);
    public static final /* enum */ rjg_3 ROT_120_NNN = new rjg_3("rot_120_nnn", rqf_3.P231, false, false, false);
    public static final /* enum */ rjg_3 ROT_120_NNP = new rjg_3("rot_120_nnp", rqf_3.P312, true, false, true);
    public static final /* enum */ rjg_3 ROT_120_NPN = new rjg_3("rot_120_npn", rqf_3.P312, false, true, true);
    public static final /* enum */ rjg_3 ROT_120_NPP = new rjg_3("rot_120_npp", rqf_3.P231, true, false, true);
    public static final /* enum */ rjg_3 ROT_120_PNN = new rjg_3("rot_120_pnn", rqf_3.P312, true, true, false);
    public static final /* enum */ rjg_3 ROT_120_PNP = new rjg_3("rot_120_pnp", rqf_3.P231, true, true, false);
    public static final /* enum */ rjg_3 ROT_120_PPN = new rjg_3("rot_120_ppn", rqf_3.P231, false, true, true);
    public static final /* enum */ rjg_3 ROT_120_PPP = new rjg_3("rot_120_ppp", rqf_3.P312, false, false, false);
    public static final /* enum */ rjg_3 ROT_180_EDGE_XY_NEG = new rjg_3("rot_180_edge_xy_neg", rqf_3.P213, true, true, true);
    public static final /* enum */ rjg_3 ROT_180_EDGE_XY_POS = new rjg_3("rot_180_edge_xy_pos", rqf_3.P213, false, false, true);
    public static final /* enum */ rjg_3 ROT_180_EDGE_XZ_NEG = new rjg_3("rot_180_edge_xz_neg", rqf_3.P321, true, true, true);
    public static final /* enum */ rjg_3 ROT_180_EDGE_XZ_POS = new rjg_3("rot_180_edge_xz_pos", rqf_3.P321, false, true, false);
    public static final /* enum */ rjg_3 ROT_180_EDGE_YZ_NEG = new rjg_3("rot_180_edge_yz_neg", rqf_3.P132, true, true, true);
    public static final /* enum */ rjg_3 ROT_180_EDGE_YZ_POS = new rjg_3("rot_180_edge_yz_pos", rqf_3.P132, true, false, false);
    public static final /* enum */ rjg_3 ROT_90_X_NEG = new rjg_3("rot_90_x_neg", rqf_3.P132, false, false, true);
    public static final /* enum */ rjg_3 ROT_90_X_POS = new rjg_3("rot_90_x_pos", rqf_3.P132, false, true, false);
    public static final /* enum */ rjg_3 ROT_90_Y_NEG = new rjg_3("rot_90_y_neg", rqf_3.P321, true, false, false);
    public static final /* enum */ rjg_3 ROT_90_Y_POS = new rjg_3("rot_90_y_pos", rqf_3.P321, false, false, true);
    public static final /* enum */ rjg_3 ROT_90_Z_NEG = new rjg_3("rot_90_z_neg", rqf_3.P213, false, true, false);
    public static final /* enum */ rjg_3 ROT_90_Z_POS = new rjg_3("rot_90_z_pos", rqf_3.P213, true, false, false);
    public static final /* enum */ rjg_3 INVERSION = new rjg_3("inversion", rqf_3.P123, true, true, true);
    public static final /* enum */ rjg_3 INVERT_X = new rjg_3("invert_x", rqf_3.P123, true, false, false);
    public static final /* enum */ rjg_3 INVERT_Y = new rjg_3("invert_y", rqf_3.P123, false, true, false);
    public static final /* enum */ rjg_3 INVERT_Z = new rjg_3("invert_z", rqf_3.P123, false, false, true);
    public static final /* enum */ rjg_3 ROT_60_REF_NNN = new rjg_3("rot_60_ref_nnn", rqf_3.P312, true, true, true);
    public static final /* enum */ rjg_3 ROT_60_REF_NNP = new rjg_3("rot_60_ref_nnp", rqf_3.P231, true, false, false);
    public static final /* enum */ rjg_3 ROT_60_REF_NPN = new rjg_3("rot_60_ref_npn", rqf_3.P231, false, false, true);
    public static final /* enum */ rjg_3 ROT_60_REF_NPP = new rjg_3("rot_60_ref_npp", rqf_3.P312, false, false, true);
    public static final /* enum */ rjg_3 ROT_60_REF_PNN = new rjg_3("rot_60_ref_pnn", rqf_3.P231, false, true, false);
    public static final /* enum */ rjg_3 ROT_60_REF_PNP = new rjg_3("rot_60_ref_pnp", rqf_3.P312, true, false, false);
    public static final /* enum */ rjg_3 ROT_60_REF_PPN = new rjg_3("rot_60_ref_ppn", rqf_3.P312, false, true, false);
    public static final /* enum */ rjg_3 ROT_60_REF_PPP = new rjg_3("rot_60_ref_ppp", rqf_3.P231, true, true, true);
    public static final /* enum */ rjg_3 SWAP_XY = new rjg_3("swap_xy", rqf_3.P213, false, false, false);
    public static final /* enum */ rjg_3 SWAP_YZ = new rjg_3("swap_yz", rqf_3.P132, false, false, false);
    public static final /* enum */ rjg_3 SWAP_XZ = new rjg_3("swap_xz", rqf_3.P321, false, false, false);
    public static final /* enum */ rjg_3 SWAP_NEG_XY = new rjg_3("swap_neg_xy", rqf_3.P213, true, true, false);
    public static final /* enum */ rjg_3 SWAP_NEG_YZ = new rjg_3("swap_neg_yz", rqf_3.P132, false, true, true);
    public static final /* enum */ rjg_3 SWAP_NEG_XZ = new rjg_3("swap_neg_xz", rqf_3.P321, true, false, true);
    public static final /* enum */ rjg_3 ROT_90_REF_X_NEG = new rjg_3("rot_90_ref_x_neg", rqf_3.P132, true, false, true);
    public static final /* enum */ rjg_3 ROT_90_REF_X_POS = new rjg_3("rot_90_ref_x_pos", rqf_3.P132, true, true, false);
    public static final /* enum */ rjg_3 ROT_90_REF_Y_NEG = new rjg_3("rot_90_ref_y_neg", rqf_3.P321, true, true, false);
    public static final /* enum */ rjg_3 ROT_90_REF_Y_POS = new rjg_3("rot_90_ref_y_pos", rqf_3.P321, false, true, true);
    public static final /* enum */ rjg_3 ROT_90_REF_Z_NEG = new rjg_3("rot_90_ref_z_neg", rqf_3.P213, false, true, true);
    public static final /* enum */ rjg_3 ROT_90_REF_Z_POS = new rjg_3("rot_90_ref_z_pos", rqf_3.P213, true, false, true);
    private final rjj_3 field_235517_W_;
    private final String field_235518_X_;
    private Map<rpr_3, rpr_3> field_235519_Y_;
    private final boolean field_235520_Z_;
    private final boolean field_235521_aa_;
    private final boolean field_235522_ab_;
    private final rqf_3 field_235523_ac_;
    private static final rjg_3[][] field_235524_ad_;
    private static final rjg_3[] field_235525_ae_;
    private static final /* synthetic */ rjg_3[] $VALUES;

    private static /* synthetic */ rjg_3[] id_byte() {
        return new rjg_3[]{IDENTITY, ROT_180_FACE_XY, ROT_180_FACE_XZ, ROT_180_FACE_YZ, ROT_120_NNN, ROT_120_NNP, ROT_120_NPN, ROT_120_NPP, ROT_120_PNN, ROT_120_PNP, ROT_120_PPN, ROT_120_PPP, ROT_180_EDGE_XY_NEG, ROT_180_EDGE_XY_POS, ROT_180_EDGE_XZ_NEG, ROT_180_EDGE_XZ_POS, ROT_180_EDGE_YZ_NEG, ROT_180_EDGE_YZ_POS, ROT_90_X_NEG, ROT_90_X_POS, ROT_90_Y_NEG, ROT_90_Y_POS, ROT_90_Z_NEG, ROT_90_Z_POS, INVERSION, INVERT_X, INVERT_Y, INVERT_Z, ROT_60_REF_NNN, ROT_60_REF_NNP, ROT_60_REF_NPN, ROT_60_REF_NPP, ROT_60_REF_PNN, ROT_60_REF_PNP, ROT_60_REF_PPN, ROT_60_REF_PPP, SWAP_XY, SWAP_YZ, SWAP_XZ, SWAP_NEG_XY, SWAP_NEG_YZ, SWAP_NEG_XZ, ROT_90_REF_X_NEG, ROT_90_REF_X_POS, ROT_90_REF_Y_NEG, ROT_90_REF_Y_POS, ROT_90_REF_Z_NEG, ROT_90_REF_Z_POS};
    }

    private rjg_3(String string2, rqf_3 rqf_32, boolean bl, boolean bl2, boolean bl3) {
        this.field_235518_X_ = string2;
        this.field_235520_Z_ = bl;
        this.field_235521_aa_ = bl2;
        this.field_235522_ab_ = bl3;
        this.field_235523_ac_ = rqf_32;
        this.field_235517_W_ = new rjj_3();
        this.field_235517_W_.id_class = bl ? -1.0f : 1.0f;
        this.field_235517_W_.id_throws = bl2 ? -1.0f : 1.0f;
        this.field_235517_W_.id_implements = bl3 ? -1.0f : 1.0f;
        this.field_235517_W_.id_break(rqf_32.id_class());
    }

    static {
        $VALUES = rjg_3.id_byte();
        field_235524_ad_ = rqR_2.id_class(new rjg_3[rjg_3.values().length][rjg_3.values().length], (T rjg_3Array) -> {
            Map<Pair, rjg_3> map = Arrays.stream(rjg_3.values()).collect(Collectors.toMap(rjg_32 -> Pair.of((Object)((Object)rjg_32.field_235523_ac_), (Object)rjg_32.id_break()), rjg_32 -> rjg_32));
            for (rjg_3 rjg_33 : rjg_3.values()) {
                for (rjg_3 rjg_34 : rjg_3.values()) {
                    BooleanList booleanList = rjg_33.id_break();
                    BooleanList booleanList2 = rjg_34.id_break();
                    rqf_3 rqf_32 = rjg_34.field_235523_ac_.id_class(rjg_33.field_235523_ac_);
                    BooleanArrayList booleanArrayList = new BooleanArrayList(3);
                    for (int i = 0; i < 3; ++i) {
                        booleanArrayList.add(booleanList.getBoolean(i) ^ booleanList2.getBoolean(rjg_33.field_235523_ac_.id_class(i)));
                    }
                    rjg_3Array[rjg_33.ordinal()][rjg_34.ordinal()] = map.get(Pair.of((Object)((Object)rqf_32), (Object)booleanArrayList));
                }
            }
        });
        field_235525_ae_ = (rjg_3[])Arrays.stream(rjg_3.values()).map(rjg_32 -> Arrays.stream(rjg_3.values()).filter(rjg_33 -> rjg_32.id_class((rjg_3)rjg_33) == IDENTITY).findAny().get()).toArray(rjg_3[]::new);
    }

    public String toString() {
        return this.field_235518_X_;
    }

    public static rjg_3[] values() {
        return (rjg_3[])$VALUES.clone();
    }

    public static rjg_3 valueOf(String string) {
        return Enum.valueOf(rjg_3.class, string);
    }

    public rec_3 id_class(rec_3 rec_32) {
        return rec_3.id_class(this.id_class(rec_32.id_break()), this.id_class(rec_32.id_byte()));
    }

    public rpr_3 id_class(rpr_3 rpr_32) {
        if (this.field_235519_Y_ == null) {
            this.field_235519_Y_ = Maps.newEnumMap(rpr_3.class);
            for (rpr_3 rpr_33 : rpr_3.values()) {
                rpB_2 rpB_22 = rpr_33.id_final();
                rpG_2 rpG_22 = rpr_33.id_throws();
                rpB_2 rpB_23 = rpB_2.values()[this.field_235523_ac_.id_class(rpB_22.ordinal())];
                rpG_2 rpG_23 = this.id_class(rpB_23) ? rpG_22.id_break() : rpG_22;
                rpr_3 rpr_34 = rpr_3.id_class(rpB_23, rpG_23);
                this.field_235519_Y_.put(rpr_33, rpr_34);
            }
        }
        return this.field_235519_Y_.get(rpr_32);
    }

    public boolean id_class(rpB_2 rpB_22) {
        switch (rpB_22) {
            case X: {
                return this.field_235520_Z_;
            }
            case Y: {
                return this.field_235521_aa_;
            }
        }
        return this.field_235522_ab_;
    }

    public rjg_3 id_class(rjg_3 rjg_32) {
        return field_235524_ad_[this.ordinal()][rjg_32.ordinal()];
    }

    @Override
    public String id_class() {
        return this.field_235518_X_;
    }

    private BooleanList id_break() {
        return new BooleanArrayList(new boolean[]{this.field_235520_Z_, this.field_235521_aa_, this.field_235522_ab_});
    }
}

