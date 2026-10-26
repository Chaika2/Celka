/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.GT;
import celestial.Gp_1;
import celestial.Gq_1;
import celestial.Gt_1;
import celestial.Gw_1;
import celestial.Gy_1;
import celestial.bq_3;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rX_2;
import celestial.rfH_2;
import celestial.rn_3;
import celestial.rs_3;
import celestial.ru_3;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GH
extends bq_3
implements ru_3 {
    private static String[] id_throws;
    private static short[] id_catch;
    private static byte[] id_private;
    public Object[] id_break;
    private static boolean[] id_implements;

    @Override
    public boolean id_byte() {
        this.id_extends();
        return (rfH_2)this.id_break[id_catch[0]] != null ? id_implements[0] : id_implements[1];
    }

    public GH(C_class c_class) {
        super(c_class);
        this.id_extends();
    }

    static {
        GH.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{85, -23, -63, 82, 31, -30, 115, 19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(int n, int n2) {
        this.id_extends();
        rfH_2 rfH_22 = new rfH_2(n, id_implements[2], n2);
        this.id_break[GH.id_catch[1]] = rfH_22;
        Integer n3 = id_implements[3];
        this.id_break[GH.id_catch[2]] = n3;
    }

    @Override
    public String id_class() {
        this.id_extends();
        return "Exploring around " + (rfH_2)this.id_break[id_catch[20]] + ", distance completed " + (Integer)this.id_break[id_catch[21]] + ", currently going to " + new rs_3(this.id_class((rfH_2)this.id_break[id_catch[22]], this.id_private()));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B6A1F5CCB97ED8FL;
    }

    public static /* synthetic */ C_class id_class(GH gH) {
        return (C_class)gH.id_case[id_catch[23]];
    }

    @Override
    public void id_class(Path path, boolean bl) throws Exception {
        this.id_extends();
        Gw_1 gw_1 = new Gw_1(this, path, bl);
        this.id_break[GH.id_catch[3]] = gw_1;
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        this.id_extends();
        if (bl) {
            this.id_case(id_throws[0]);
            if (((Boolean)C_class.id_instanceof().id_abstract.id_class[id_catch[6]]).booleanValue()) {
                this.id_byte(id_throws[1], id_implements[4]);
            }
            this.id_protected();
            return null;
        }
        Gt_1 gt_1 = this.id_private();
        if (!((Boolean)C_class.id_instanceof().PN.id_class[id_catch[7]]).booleanValue() && gt_1.id_class() == 0) {
            this.id_case(id_throws[2]);
            if (((Boolean)C_class.id_instanceof().id_abstract.id_class[id_catch[8]]).booleanValue()) {
                this.id_byte(id_throws[3], id_implements[5]);
            }
            this.id_protected();
            return null;
        }
        rP_2[] rP_2Array = this.id_class((rfH_2)this.id_break[id_catch[9]], gt_1);
        if (rP_2Array == null) {
            this.id_byte(id_throws[4]);
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[10]]));
        }
        return new rn_3(new rs_3(rP_2Array), (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[11]]));
    }

    /*
     * Enabled aggressive block sorting
     */
    private rP_2[] id_class(rfH_2 rfH_23, Gt_1 gt_1) {
        this.id_extends();
        int n = rfH_23.b_() >> id_private[0];
        int n2 = rfH_23.d_() >> id_private[1];
        int n3 = Math.min(gt_1.id_class(), (Integer)C_class.id_instanceof().rR.id_class[id_catch[12]]);
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        int n4 = (Integer)C_class.id_instanceof().Pm.id_class[id_catch[13]];
        int n5 = (Integer)this.id_break[id_catch[14]];
        block5: while (true) {
            int n6 = -n5;
            while (true) {
                int n7;
                if (n6 <= n5) {
                    n7 = n5 - Math.abs(n6);
                } else {
                    if (n5 % id_private[9] == 0) {
                        n3 = Math.min(gt_1.id_class(), (Integer)C_class.id_instanceof().rR.id_class[id_catch[16]]);
                    }
                    if (arrayList.size() >= n3) {
                        return (rP_2[])arrayList.stream().map(rfH_22 -> GH.id_break(rfH_22.b_(), rfH_22.d_())).toArray(rP_2[]::new);
                    }
                    if (arrayList.isEmpty()) {
                        Integer n8 = n5 + id_implements[9];
                        this.id_break[GH.id_catch[17]] = n8;
                    }
                    ++n5;
                    continue block5;
                }
                block7: for (int i = id_implements[6]; i < id_private[2]; ++i) {
                    int n9 = (i * id_private[3] - id_implements[7]) * n7;
                    int n10 = Math.abs(n6) + Math.abs(n9);
                    if (n10 != n5) {
                        throw new IllegalStateException();
                    }
                    switch (((int[])Gp_1.id_class[id_catch[15]])[gt_1.id_class(n + n6, n2 + n9).ordinal()]) {
                        case 1: {
                            return null;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            continue block7;
                        }
                    }
                    int n11 = (n + n6 << id_private[4]) + id_private[5];
                    int n12 = (n2 + n9 << id_private[6]) + id_private[7];
                    int n13 = n4 << id_private[8];
                    n11 = n6 < 0 ? (n11 -= n13) : (n11 += n13);
                    n12 = n9 < 0 ? (n12 -= n13) : (n12 += n13);
                    arrayList.add(new rfH_2(n11, id_implements[8], n12));
                }
                ++n6;
            }
            break;
        }
    }

    private static rP_2 id_break(int n, int n2) {
        if ((Integer)C_class.id_instanceof().rP.id_class[id_catch[18]] == id_private[10]) {
            return new rX_2(n, n2);
        }
        return new Gy_1(n, n2);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2A7C4F51;
    }

    private static /* synthetic */ void ntfClinit() {
        GH.id_implements();
        GH.id_native();
        GH.id_finally();
        GH.id_volatile();
    }

    private static void id_finally() {
        short[] sArray = new short[24];
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[10] = 1;
        sArray[11] = 4;
        sArray[14] = 2;
        sArray[17] = 2;
        sArray[21] = 2;
        id_catch = sArray;
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[11]];
            objectArray[GH.id_private[12]] = id_implements[10];
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_implements = blArray;
    }

    @Override
    public void id_protected() {
        this.id_extends();
        super.id_protected();
        Object var5_1 = null;
        this.id_break[GH.id_catch[19]] = var5_1;
    }

    public Gt_1 id_private() {
        this.id_extends();
        Gt_1 gt_1 = (Gt_1)this.id_break[id_catch[4]] != null ? new GT(this, (Gt_1)this.id_break[id_catch[5]], new Gq_1(this)) : new Gq_1(this);
        return gt_1;
    }

    private static void id_volatile() {
        id_private = new byte[]{4, 4, 2, 2, 4, 8, 4, 8, 4, 10, -1, 3, 2};
    }

    private static void id_native() {
        id_throws = new String[]{new String("Failed"), new String("Exploration failed"), new String("Explored all chunks"), new String("Explored all chunks"), new String("awaiting region load from disk")};
    }
}

