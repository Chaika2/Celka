/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.SN;
import celestial.SZ;
import celestial.Sc_1;
import celestial.Sm_1;
import celestial.Su_1;
import celestial.Sz_1;
import celestial.event.PacketEvent;
import celestial.j_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrnN_2;
import celestial.rrnQ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SQ
extends Pv_1 {
    public Object[] id_break;
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static byte[] id_case;
    public static Object[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_throws = blArray;
    }

    public SQ(C_class c_class) {
        super(c_class);
        HashMap hashMap;
        this.id_protected();
        this.id_break[SQ.id_protected[0]] = hashMap = new HashMap();
    }

    static {
        SQ.ntfClinit();
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_protected();
        if (((Map)this.id_break[id_protected[7]]).isEmpty()) {
            return;
        }
        if (((Map)this.id_break[id_protected[8]]).size() >= (Integer)id_byte[id_protected[9]] && ((Ps_1)this.id_class[id_protected[10]]).id_catch() != null && ((Ps_1)this.id_class[id_protected[11]]).id_case() != null) {
            boolean bl;
            HashSet<xd_3> hashSet = new HashSet<xd_3>(((Map)this.id_break[id_protected[12]]).values());
            SZ sZ = SZ.id_class(hashSet);
            Sz_1 sz_1 = Sz_1.id_class(hashSet);
            boolean bl2 = sZ != null ? id_throws[0] : id_throws[1];
            boolean bl3 = bl = sz_1 != null ? id_throws[2] : id_throws[3];
            if (bl2 || bl) {
                Sc_1 sc_1 = bl2 ? new Su_1() : new SN();
                sc_1.id_class((Map)this.id_break[id_protected[13]]);
                if (sc_1.id_protected() && !sc_1.id_throws()) {
                    rfl_3 rfl_32 = sc_1.id_byte();
                    if (bl2) {
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[14]]).id_finally().id_class(rrnN_2.id_class(sZ, rfl_32));
                    } else {
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[15]]).id_finally().id_class(rrnQ_2.id_class(sz_1, rfl_32));
                    }
                }
            }
        }
        ((Map)this.id_break[id_protected[16]]).clear();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAE75BE30930E21A8L;
    }

    @Override
    public void id_class(PacketEvent packetEvent) {
        this.id_protected();
        if (!packetEvent.id_break() || (rrfq_3)((Object)rrfp_3.id_class[id_protected[1]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[2]]) && (rrfq_3)((Object)rrfp_3.id_class[id_protected[3]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[4]])) {
            return;
        }
        rfH_2 rfH_22 = packetEvent.id_byte();
        xc_3 xc_32 = packetEvent.id_class();
        if (xc_32.id_catch()) {
            return;
        }
        xd_3 xd_32 = xc_32.id_break();
        if (((Set)id_byte[id_protected[5]]).contains(xd_32)) {
            ((Map)this.id_break[id_protected[6]]).put(rfH_22.id_int(), xd_32);
        }
    }

    private static void id_class() {
        id_case = new byte[]{2, 16, 16, 2, 16, 16, 2};
    }

    private static /* synthetic */ int id_class(Object object) {
        return ((Sm_1)object).id_case();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x759A0762;
    }

    private static /* synthetic */ Stream id_break(Object object) {
        return ((Sm_1)object).id_throws();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, 35, -74, 41, 120, -45, -112, 45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        id_protected = sArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = new Object[]{xu_3.EA, xu_3.hY, xu_3.EZ, xu_3.Pq, xu_3.Mn, xu_3.PT, xu_3.id_case, xu_3.Jl, xu_3.by, xu_3.Ge, xu_3.id_catch, xu_3.BJ, xu_3.Bd, xu_3.Sh, xu_3.bg, xu_3.hV, xu_3.Bs, xu_3.Ju, xu_3.JI, xu_3.bY, xu_3.hD, xu_3.bV, xu_3.SS, xu_3.Em, xu_3.bs, xu_3.Jw, xu_3.Ev, xu_3.bR, xu_3.EH, xu_3.hc, xu_3.hL, xu_3.Jd, xu_3.Jk, xu_3.PD, xu_3.SP, xu_3.bH, xu_3.Pt, xu_3.JF, xu_3.By, xu_3.hN, xu_3.JA, xu_3.Jv, xu_3.Ei, xu_3.Ea, xu_3.Bp, xu_3.sq, xu_3.Jc, xu_3.El, xu_3.MR, xu_3.Ba, xu_3.Bq, xu_3.JC, xu_3.JL, xu_3.id_throws, xu_3.id_volatile, xu_3.bq, xu_3.bp, xu_3.Jn, xu_3.bS, xu_3.hK, xu_3.BT, xu_3.bX, xu_3.sp, xu_3.hm, xu_3.OJ, xu_3.Jy, xu_3.sy, xu_3.JJ, xu_3.bO, xu_3.Jm, xu_3.hl};
        objectArray[0] = Set.of(objectArray2);
        objectArray[1] = 2;
        id_byte = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SQ.id_byte();
        SQ.id_break();
        SQ.id_class();
        SQ.id_throws();
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[11]];
        }
    }
}

