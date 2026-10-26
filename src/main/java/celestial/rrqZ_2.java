/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.event.EventTarget;
import celestial.module.util.XRay;
import celestial.q_1;
import celestial.rVi_1;
import celestial.rZR;
import celestial.rfH_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rja_3;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rrLu_1;
import celestial.rrfu_3;
import celestial.rrjc_3;
import celestial.rrqN_2;
import celestial.rrqQ_2;
import celestial.rrqc_3;
import celestial.rrqz_3;
import celestial.ruS_2;
import celestial.rvC_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqZ_2
extends rrqN_2 {
    private static byte[] id_byte;
    private static long[] id_protected;
    private static short[] id_case;
    private static boolean[] id_catch;
    private static String[] id_private;
    public Object[] id_class;

    private static void id_byte() {
        short[] sArray = new short[24];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 3;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[15] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[22] = 1;
        id_case = sArray;
    }

    public rrqZ_2(XRay<?> xRay) {
        super(xRay);
        HashSet hashSet;
        HashMap hashMap;
        this.id_case();
        this.id_class[rrqZ_2.id_case[0]] = hashMap = new HashMap();
        this.id_class[rrqZ_2.id_case[1]] = hashSet = new HashSet();
        Long l = id_protected[0];
        this.id_class[rrqZ_2.id_case[2]] = l;
    }

    static {
        rrqZ_2.ntfClinit();
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_case();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[3]])) {
            XRay xRay = (XRay)this.id_continue();
            this.id_final().removeIf(rrqc_32 -> {
                this.id_case();
                rfH_2 rfH_22 = rrqc_32.id_break();
                if (rrjc_3.id_protected(rfH_22) == xu_3.Jx) {
                    ((Map)this.id_class[id_case[20]]).put(rfH_22, rrqc_32);
                    return id_catch[7];
                }
                if (((Map)this.id_class[id_case[21]]).containsKey(rfH_22)) {
                    ((Set)this.id_class[id_case[22]]).remove(rrqc_32);
                    ((Map)this.id_class[id_case[23]]).remove(rfH_22);
                    return id_catch[8];
                }
                return id_catch[9];
            });
            if ((Long)this.id_class[id_case[4]] != id_protected[1] && (Integer)this.id_class[id_case[5]] > 0 && !((Set)this.id_class[id_case[6]]).isEmpty() && rqR_2.id_break() - (Long)this.id_class[id_case[7]] > id_protected[2]) {
                int n = (Integer)this.id_class[id_case[8]];
                String[] stringArray = new String[id_byte[0]];
                stringArray[rrqZ_2.id_catch[0]] = id_private[0];
                stringArray[rrqZ_2.id_catch[1]] = id_private[1];
                stringArray[rrqZ_2.id_byte[1]] = id_private[2];
                String string = rql_3.id_class(n, stringArray);
                String[] stringArray2 = new String[id_byte[2]];
                stringArray2[rrqZ_2.id_catch[2]] = id_private[3];
                stringArray2[rrqZ_2.id_catch[3]] = id_private[4];
                stringArray2[rrqZ_2.id_byte[3]] = id_private[5];
                String string2 = rql_3.id_class(n, stringArray2);
                rVi_1 rVi_12 = new rgN_2(id_private[6]).id_break(rgF_2.GRAY).id_break(rrfu_3.id_class(xRay) + string + " " + rgF_2.RED + n + " " + rgF_2.GRAY + string2);
                rrfu_3.id_class(rVi_12);
                Integer n2 = id_catch[4];
                this.id_class[rrqZ_2.id_case[9]] = n2;
                Long l = id_protected[3];
                this.id_class[rrqZ_2.id_case[10]] = l;
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x974C08D1;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAF588F4B16F3C16AL;
    }

    private rrqc_3 id_class(xd_3 xd_32, rfH_2 rfH_22) {
        return new rrqc_3(new rrqz_3(xd_32, ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_case[19]]).id_class(xd_32)), new rfH_2(rfH_22), new rja_3(rfH_22.b_(), rfH_22.c_(), rfH_22.d_()));
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvC_2) {
            rvC_2 rvC_22 = (rvC_2)ruS_22;
            rvC_22.id_class((rfH_2 rfH_22, xc_3 xc_32) -> this.id_break((rfH_2)rfH_22, (xc_3)xc_32));
        } else if (ruS_22 instanceof rZR) {
            rZR rZR2 = (rZR)ruS_22;
            this.id_break(rZR2.id_byte(), rZR2.id_break());
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{64, -31, -127, 19, 59, -91, 79, -106}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        long[] lArray = new long[6];
        lArray[0] = -1L;
        lArray[1] = -1L;
        lArray[2] = 100L;
        lArray[3] = -1L;
        lArray[4] = -1L;
        id_protected = lArray;
    }

    private void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_case();
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 == xu_3.Jx) {
            rrqc_3 rrqc_32 = this.id_class(xd_32, rfH_22);
            this.id_class(rrqc_32);
            if (((Set)this.id_class[id_case[11]]).add(rrqc_32)) {
                rrqZ_2 rrqZ_22 = this;
                Integer n = (Integer)rrqZ_22.id_class[id_case[12]] + id_catch[5];
                rrqZ_22.id_class[rrqZ_2.id_case[13]] = n;
                Long l = rqR_2.id_break();
                this.id_class[rrqZ_2.id_case[14]] = l;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrqZ_2.id_implements();
        rrqZ_2.id_protected();
        rrqZ_2.id_class();
        rrqZ_2.id_byte();
        rrqZ_2.id_private();
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[2] = 0;
            this.id_class[3] = 0L;
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[11];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        id_catch = blArray;
    }

    private static void id_protected() {
        id_private = new String[]{new String("\u0411\u044b\u043b \u043d\u0430\u0439\u0434\u0435\u043d"), new String("\u0411\u044b\u043b\u043e \u043d\u0430\u0439\u0434\u0435\u043d\u043e"), new String("\u0411\u044b\u043b\u043e \u043d\u0430\u0439\u0434\u0435\u043d\u043e"), new String("\u0414\u0440\u0435\u0432\u043d\u0438\u0439 \u043e\u0431\u043b\u043e\u043c\u043e\u043a"), new String("\u0414\u0440\u0435\u0432\u043d\u0438\u0445 \u043e\u0431\u043b\u043e\u043c\u043a\u0430"), new String("\u0414\u0440\u0435\u0432\u043d\u0438\u0445 \u043e\u0431\u043b\u043e\u043c\u043a\u043e\u0432"), new String("")};
    }

    private static void id_private() {
        id_byte = new byte[]{3, 2, 3, 2, 4, 2, 3};
    }

    @Override
    public boolean aK_() {
        this.id_case();
        ((Set)this.id_class[id_case[15]]).clear();
        ((Map)this.id_class[id_case[16]]).clear();
        Integer n = id_catch[6];
        this.id_class[rrqZ_2.id_case[17]] = n;
        Long l = id_protected[4];
        this.id_class[rrqZ_2.id_case[18]] = l;
        return super.aK_();
    }
}

