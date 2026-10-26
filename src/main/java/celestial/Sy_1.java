/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.C_throws;
import celestial.Fc_1;
import celestial.PK;
import celestial.Po_1;
import celestial.SC;
import celestial.SF;
import celestial.SL;
import celestial.Sp_1;
import celestial.Sq_1;
import celestial.Sv_1;
import celestial.VU;
import celestial.cb_3;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rqs_3;
import celestial.rrAM;
import celestial.rrfu_3;
import celestial.rrfw_3;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sy_1
extends Sv_1 {
    private static boolean[] id_byte;
    private static String[] id_protected;
    private static long[] id_throws;
    private static short[] id_case;
    public Object[] id_break;
    private static byte[] id_catch;

    @Override
    public void id_byte() {
        this.id_private();
        super.id_byte();
        Boolean bl = id_byte[1];
        this.id_break[Sy_1.id_case[1]] = bl;
        Object var6_2 = null;
        this.id_break[Sy_1.id_case[2]] = var6_2;
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{124, -47, -116, 106, 3, -18, 23, -64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Sy_1(SL sL) {
        super(sL);
        this.id_private();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_break[Sy_1.id_case[0]] = rrfw_32;
    }

    static {
        Sy_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF77AF69D21DFC968L;
    }

    private Sp_1 id_class(PK pK, List<rdn_3> list) {
        String string = pK.id_class();
        for (rdn_3 rdn_32 : list) {
            String string2;
            if (rdn_32.id_break() != rdy_3.dq || !(string2 = rdn_32.id_continue().id_byte()).contains(string)) continue;
            return new Sp_1(this, rdn_32, (Sq_1)((Object)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[29]]));
        }
        return null;
    }

    @Override
    public void id_class(SC sC) {
        this.id_private();
        super.id_class(sC);
        Po_1 po_1 = Po_1.id_break(sC.id_byte());
        this.id_break[Sy_1.id_case[3]] = po_1;
        if ((Po_1)this.id_break[id_case[4]] == null) {
            this.id_byte();
        }
    }

    private Sp_1 id_class(Po_1 po_1, List<rdn_3> list) {
        String string = "#" + po_1.id_class();
        boolean bl = id_byte[7];
        for (rdn_3 rdn_32 : list) {
            if (rdn_32.id_break() != rdy_3.dJ) continue;
            bl = id_byte[8];
            List<rgP_2> list2 = rdn_32.id_class(null, VU.NORMAL);
            for (rgP_2 rgP_22 : list2) {
                String string2;
                String string3 = rgP_22.getString();
                if (!string3.contains(id_protected[6]) || !(string2 = string3.substring(string3.indexOf(id_catch[1]))).equals(string)) continue;
                return new Sp_1(this, rdn_32, (Sq_1)((Object)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[30]]));
            }
        }
        if (bl) {
            return new Sp_1(this, null, (Sq_1)((Object)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[31]]));
        }
        return null;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_private();
        super.id_class(rrAM2);
        SL sL = this.id_case();
        SC sC = sL.id_catch();
        if (sC != null) {
            this.id_case().id_class();
        }
        ((rrfw_3)this.id_break[id_case[5]]).id_class();
    }

    @Override
    public void id_class(q_1 q_12) {
        Object object;
        long l;
        this.id_private();
        super.id_class(q_12);
        if ((Po_1)this.id_break[id_case[6]] == null) {
            return;
        }
        SC sC = this.id_case().id_catch();
        if (sC instanceof SF && (l = ((SF)(object = (SF)sC)).id_class()) > id_throws[0] && !((rrfw_3)this.id_break[id_case[7]]).id_class(l)) {
            return;
        }
        object = ((Po_1)this.id_break[id_case[8]]).id_break();
        boolean bl = ((PK)((Object)object)).id_protected();
        boolean bl2 = ((PK)((Object)object)).id_byte();
        boolean bl3 = ((PK)((Object)object)).id_throws();
        Object object2 = (vm_3)Sy_1.id_import.id_class[id_case[9]];
        if (!(object2 instanceof Fc_1)) {
            if ((Integer)((cb_3)Sy_1.id_import.id_class[Sy_1.id_case[10]]).id_throws[id_case[11]] % id_catch[0] == 0) {
                Boolean bl4 = id_byte[2];
                this.id_break[Sy_1.id_case[12]] = bl4;
            }
            if (!((Boolean)this.id_break[id_case[13]]).booleanValue() && !this.id_break(this.id_break())) {
                if (bl) {
                    ((cb_3)Sy_1.id_import.id_class[id_case[14]]).id_case(id_protected[0]);
                } else if (bl2) {
                    ((cb_3)Sy_1.id_import.id_class[id_case[15]]).id_case(id_protected[1]);
                } else if (bl3) {
                    ((cb_3)Sy_1.id_import.id_class[id_case[16]]).id_protected(id_protected[2]);
                }
                Boolean bl5 = id_byte[3];
                this.id_break[Sy_1.id_case[17]] = bl5;
            }
            return;
        }
        Fc_1 fc_1 = (Fc_1)object2;
        object2 = fc_1.id_new().id_byte();
        rqs_3<rdn_3> rqs_32 = ((rXe_1)fc_1.G_()).id_extends();
        boolean bl6 = id_byte[4];
        if (bl) {
            bl6 = ((String)object2).equalsIgnoreCase(id_protected[3]);
        } else if (bl2) {
            bl6 = ((String)object2).equalsIgnoreCase(id_protected[4]);
        } else if (bl3) {
            bl6 = ((String)object2).equalsIgnoreCase(id_protected[5]);
        }
        if (bl6) {
            rdn_3 rdn_32;
            Sp_1 sp_1;
            Sp_1 sp_12 = this.id_class((Po_1)this.id_break[id_case[18]], rqs_32);
            if (sp_12 != null) {
                rdn_3 rdn_33;
                Sq_1 sq_1 = sp_12.id_break();
                if (sq_1 == (Sq_1)((Object)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[19]])) {
                    rrfu_3.id_byte("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u0440\u0435\u0436\u0438\u043c '" + ((Po_1)this.id_break[id_case[20]]).id_break().id_class() + ((Po_1)this.id_break[id_case[21]]).id_class() + "'");
                    this.id_byte();
                } else if (sq_1 == (Sq_1)((Object)Sq_1.staticFields3819d0a25319329c972e0f964aeaa125[id_case[22]]) && (rdn_33 = sp_12.id_class()) != null) {
                    ((Ax_1)Sy_1.id_import.id_class[id_case[23]]).id_class(((rJr_1)((cb_3)Sy_1.id_import.id_class[Sy_1.id_case[24]]).id_implements[Sy_1.id_case[25]]).id_case, rqs_32.indexOf(rdn_33), id_byte[5], rXa_1.PICKUP);
                }
            } else if (((PK)((Object)object)).id_protected() && (sp_1 = this.id_class((PK)((Object)object), rqs_32)) != null && (rdn_32 = sp_1.id_class()) != null) {
                ((Ax_1)Sy_1.id_import.id_class[id_case[26]]).id_class(((rJr_1)((cb_3)Sy_1.id_import.id_class[Sy_1.id_case[27]]).id_implements[Sy_1.id_case[28]]).id_case, rqs_32.indexOf(rdn_32), id_byte[6], rXa_1.PICKUP);
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x88CF562D;
    }

    @Override
    public boolean id_break(String string) {
        PK pK;
        Po_1 po_1 = Po_1.id_break(string);
        if (po_1 != null && (pK = po_1.id_break()) != null) {
            return pK.id_break();
        }
        return id_byte[0];
    }

    @Override
    public String id_throws() {
        PK pK;
        Po_1 po_1 = C_throws.id_byte().P().id_break();
        if (po_1 != null && (pK = po_1.id_break()) != null) {
            return pK.id_class() + po_1.id_class();
        }
        return null;
    }

    private static /* synthetic */ void ntfClinit() {
        Sy_1.id_volatile();
        Sy_1.id_implements();
        Sy_1.id_extends();
        Sy_1.id_native();
        Sy_1.id_finally();
    }

    private static void id_finally() {
        id_catch = new byte[]{20, 35, 3};
    }

    private static void id_extends() {
        id_throws = new long[1];
    }

    private static void id_implements() {
        id_protected = new String[]{new String("/lite"), new String("/lite120"), new String("/anarchy"), new String("\u0412\u044b\u0431\u043e\u0440 \u041b\u0430\u0439\u0442 \u0430\u043d\u0430\u0440\u0445\u0438\u0438:"), new String("\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0441\u0435\u0440\u0432\u0435\u0440 \u041b\u0430\u0439\u0442:"), new String("\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u041a\u043b\u0430\u0441\u0441\u0438\u0447. \u0410\u043d\u0430\u0440\u0445\u0438\u044e:"), new String("#")};
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[2]];
            objectArray[Sy_1.id_byte[9]] = id_byte[10];
        }
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[11];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_byte = blArray;
    }

    private static void id_native() {
        short[] sArray = new short[32];
        sArray[0] = 1;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 73;
        sArray[10] = 57;
        sArray[11] = 41;
        sArray[14] = 57;
        sArray[15] = 57;
        sArray[16] = 57;
        sArray[18] = 2;
        sArray[20] = 2;
        sArray[21] = 2;
        sArray[22] = 1;
        sArray[23] = 55;
        sArray[24] = 57;
        sArray[25] = 4;
        sArray[26] = 55;
        sArray[27] = 57;
        sArray[28] = 4;
        sArray[29] = 1;
        sArray[30] = 1;
        id_case = sArray;
    }
}

