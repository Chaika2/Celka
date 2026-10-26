/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_throws;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.GuiMove;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rmj_3;
import celestial.rmt_3;
import celestial.rqr_3;
import celestial.rrAO;
import celestial.rrHP;
import celestial.rrLY;
import celestial.rrLZ;
import celestial.rrQX;
import celestial.rrfY_2;
import celestial.rrfj_3;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrli_3;
import celestial.ruS_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHr_1
extends rrli_3 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[1] = false;
            this.id_class[2] = 0;
            this.id_class[3] = 0;
            this.id_class[4] = false;
            this.id_class[5] = false;
        }
    }

    public rrHr_1(GuiMove guiMove) {
        super(guiMove);
        ArrayList arrayList;
        this.id_byte();
        this.id_class[rrHr_1.id_byte[0]] = arrayList = new ArrayList();
    }

    static {
        rrHr_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA216A20F0789835DL;
    }

    @EventTarget
    public void id_class(rrAO rrAO2) {
        this.id_byte();
        if (((Boolean)this.id_class[id_byte[17]]).booleanValue() && C_throws.id_byte().id_return().id_class() && rrAO2.id_private()) {
            this.id_case();
            this.id_class(id_protected[8]);
            Boolean bl = id_protected[9];
            this.id_class[rrHr_1.id_byte[18]] = bl;
        }
    }

    private void id_class(boolean bl) {
        this.id_byte();
        if (!C_throws.id_byte().id_return().id_class()) {
            return;
        }
        Boolean bl2 = id_protected[24];
        this.id_class[rrHr_1.id_byte[50]] = bl2;
        if (bl) {
            ((Aq_1)((cb_3)rrHr_1.id_import.id_class[rrHr_1.id_byte[51]]).id_break[id_byte[52]]).id_break(new rmj_3(id_protected[25]));
        } else {
            ((cb_3)rrHr_1.id_import.id_class[id_byte[53]]).id_strictfp();
        }
        Boolean bl3 = id_protected[26];
        this.id_class[rrHr_1.id_byte[54]] = bl3;
    }

    public boolean id_class() {
        this.id_byte();
        return (Boolean)this.id_class[id_byte[55]] == false && ((List)this.id_class[id_byte[56]]).isEmpty() ? id_protected[27] : id_protected[28];
    }

    @EventTarget
    public void id_class(rrLY rrLY2) {
        this.id_byte();
        if (!((List)this.id_class[id_byte[15]]).isEmpty()) {
            Boolean bl = id_protected[7];
            this.id_class[rrHr_1.id_byte[16]] = bl;
        }
    }

    @EventTarget(id_class=-200)
    public void id_class(q_1 q_12) {
        this.id_byte();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[1]])) {
            if ((Integer)this.id_class[id_byte[2]] > 0) {
                rrHr_1 rrHr_12 = this;
                Integer n = (Integer)rrHr_12.id_class[id_byte[3]] - id_protected[0];
                rrHr_12.id_class[rrHr_1.id_byte[4]] = n;
            }
            if (rrfj_3.id_catch()) {
                Integer n = id_break[0];
                this.id_class[rrHr_1.id_byte[5]] = n;
            }
            if (((Boolean)this.id_class[id_byte[6]]).booleanValue()) {
                ((cb_3)rrHr_1.id_import.id_class[id_byte[7]]).c_(id_protected[1]);
                C_throws.id_byte().id_int().id_class();
                ((rqr_3)((cb_3)rrHr_1.id_import.id_class[rrHr_1.id_byte[8]]).id_break[id_byte[9]]).id_break(id_protected[2]);
                rrHr_1 rrHr_13 = this;
                int n = (Integer)rrHr_13.id_class[id_byte[10]] + id_protected[3];
                Integer n2 = n;
                rrHr_13.id_class[rrHr_1.id_byte[11]] = n2;
                if (n > id_protected[4] && !((cb_3)rrHr_1.id_import.id_class[id_byte[12]]).X()) {
                    this.id_throws();
                    Integer n3 = id_protected[5];
                    this.id_class[rrHr_1.id_byte[13]] = n3;
                    Boolean bl = id_protected[6];
                    this.id_class[rrHr_1.id_byte[14]] = bl;
                }
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D29393B;
    }

    @EventTarget
    public void id_class(rrLZ rrLZ2) {
        this.id_byte();
        ruS_2<?> ruS_22 = rrLZ2.id_class();
        if (ruS_22 instanceof rmt_3) {
            rmt_3 rmt_32 = (rmt_3)ruS_22;
            rrHP rrHP2 = this.id_break(rmt_32.id_break());
            if (rrHP2 == (rrHP)((Object)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[19]])) {
                ((List)this.id_class[id_byte[20]]).add(rmt_32);
                rrLZ2.id_class(id_protected[10]);
            } else {
                if (rrHP2 == (rrHP)((Object)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[21]])) {
                    Boolean bl = id_protected[11];
                    this.id_class[rrHr_1.id_byte[22]] = bl;
                }
                if (!((List)this.id_class[id_byte[23]]).isEmpty()) {
                    this.id_throws();
                }
            }
        } else if (ruS_22 instanceof rmj_3) {
            rrHP rrHP3;
            rmj_3 rmj_32 = (rmj_3)ruS_22;
            if (!((Boolean)this.id_class[id_byte[24]]).booleanValue() && (rrHP3 = this.id_break(rmj_32.id_break())) == (rrHP)((Object)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[25]])) {
                ((List)this.id_class[id_byte[26]]).add(ruS_22);
                Boolean bl = id_protected[12];
                this.id_class[rrHr_1.id_byte[27]] = bl;
                rrLZ2.id_class(id_protected[13]);
            }
        }
    }

    @Override
    public boolean id_class(vm_3 vm_32) {
        if (super.id_class(vm_32)) {
            return id_protected[14];
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[id_byte[28]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[29]]) && rrfo_3.id_class()) {
            return id_protected[15];
        }
        return id_protected[16];
    }

    private static void id_break() {
        id_break = new byte[]{3, -1, 6, 2, 3, 4, 5};
    }

    private rrHP id_break(int n) {
        this.id_byte();
        if (n != 0) {
            return (rrHP)((Object)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[34]]);
        }
        if ((Integer)this.id_class[id_byte[35]] == 0 && ((List)this.id_class[id_byte[36]]).isEmpty()) {
            return (rrHP)((Object)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[37]]);
        }
        return (rrHP)((Object)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[38]]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{66, -43, 14, -50, 97, -35, -103, 6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_throws() {
        this.id_byte();
        if (((List)this.id_class[id_byte[39]]).isEmpty()) {
            return;
        }
        for (ruS_2 ruS_22 : (List)this.id_class[id_byte[40]]) {
            ((Aq_1)((cb_3)rrHr_1.id_import.id_class[rrHr_1.id_byte[41]]).id_break[id_byte[42]]).id_break(ruS_22);
        }
        ((List)this.id_class[id_byte[43]]).clear();
        this.id_class(id_protected[21]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrHr_1.id_private();
        rrHr_1.id_protected();
        rrHr_1.id_break();
    }

    private void id_case() {
        int n;
        rdn_3 rdn_32 = ((rhz_3)((cb_3)rrHr_1.id_import.id_class[rrHr_1.id_byte[44]]).id_implements[id_byte[45]]).id_finally();
        if (!rdn_32.id_class() && (n = rrfY_2.id_class()) != id_break[1]) {
            ((Ax_1)rrHr_1.id_import.id_class[id_byte[46]]).id_class(((rJr_1)((cb_3)rrHr_1.id_import.id_class[rrHr_1.id_byte[47]]).id_implements[rrHr_1.id_byte[48]]).id_case, rrfY_2.id_break(n), id_protected[22], rXa_1.PICKUP, id_protected[23]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[49]]).id_finally().id_class(rrLY.id_class());
        }
    }

    private static void id_protected() {
        short[] sArray = new short[57];
        sArray[2] = 3;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 17;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 57;
        sArray[13] = 2;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[17] = 4;
        sArray[18] = 4;
        sArray[19] = 2;
        sArray[21] = 1;
        sArray[22] = 4;
        sArray[24] = 5;
        sArray[25] = 2;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 4;
        sArray[30] = 1;
        sArray[31] = 4;
        sArray[32] = 2;
        sArray[33] = 3;
        sArray[35] = 3;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[41] = 57;
        sArray[44] = 57;
        sArray[45] = 1;
        sArray[46] = 55;
        sArray[47] = 57;
        sArray[48] = 4;
        sArray[50] = 5;
        sArray[51] = 57;
        sArray[53] = 57;
        sArray[54] = 5;
        sArray[55] = 1;
        id_byte = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[35];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[21] = true;
        blArray[24] = true;
        blArray[27] = true;
        blArray[29] = true;
        id_protected = blArray;
    }

    @Override
    public boolean aK_() {
        this.id_byte();
        this.id_throws();
        Boolean bl = id_protected[17];
        this.id_class[rrHr_1.id_byte[30]] = bl;
        Boolean bl2 = id_protected[18];
        this.id_class[rrHr_1.id_byte[31]] = bl2;
        Integer n = id_protected[19];
        this.id_class[rrHr_1.id_byte[32]] = n;
        Integer n2 = id_protected[20];
        this.id_class[rrHr_1.id_byte[33]] = n2;
        return super.aK_();
    }
}

