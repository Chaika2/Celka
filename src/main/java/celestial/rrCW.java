/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.AutoTotem;
import celestial.q_1;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhz_3;
import celestial.rme_3;
import celestial.rpr_3;
import celestial.rrCk_1;
import celestial.rrLu_1;
import celestial.rrfP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCW
extends rrCk_1 {
    private static byte[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;
    private static long[] id_case;
    private static boolean[] id_catch;

    @Override
    public void id_byte() {
        this.id_private();
        if ((Integer)this.id_break[id_protected[8]] != id_byte[1]) {
            return;
        }
        Pair<rdn_3, Integer> pair = ((AutoTotem)this.id_continue()).id_this();
        int n = (Integer)pair.getRight();
        if (n < 0) {
            return;
        }
        boolean bl = ((cb_3)rrCW.id_import.id_class[id_protected[9]]).Sn().id_public();
        int n2 = ((rhz_3)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[10]]).id_implements[id_protected[11]]).id_case();
        if (n > id_byte[2]) {
            ((rrfP_2)this.id_break[id_protected[12]]).id_class(((rhz_3)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[13]]).id_implements[rrCW.id_protected[14]]).id_protected);
            Long l = System.currentTimeMillis();
            this.id_break[rrCW.id_protected[15]] = l;
            ((Ax_1)rrCW.id_import.id_class[id_protected[16]]).id_break(n);
            ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[17]]).id_break[id_protected[18]]).id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
            ((Ax_1)rrCW.id_import.id_class[id_protected[19]]).id_break(n);
            if (bl || ((rhz_3)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[20]]).id_implements[id_protected[21]]).id_extends(n2).id_class()) {
                Integer n3 = n2;
                this.id_break[rrCW.id_protected[22]] = n3;
                return;
            }
        } else {
            ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[23]]).id_break[id_protected[24]]).id_break(new rme_3(n));
            ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[25]]).id_break[id_protected[26]]).id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
            ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[27]]).id_break[id_protected[28]]).id_break(new rme_3(((rhz_3)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[29]]).id_implements[rrCW.id_protected[30]]).id_protected));
        }
        if ((Integer)this.id_break[id_protected[31]] == id_byte[3]) {
            Integer n4 = n;
            this.id_break[rrCW.id_protected[32]] = n4;
            Boolean bl2 = id_catch[2];
            this.id_class[rrCW.id_protected[33]] = bl2;
        }
    }

    public rrCW(AutoTotem autoTotem) {
        super(autoTotem);
        this.id_private();
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_break[rrCW.id_protected[0]] = rrfP_22;
        Integer n = id_byte[0];
        this.id_break[rrCW.id_protected[1]] = n;
    }

    static {
        rrCW.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x660C74DF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC8217509F4C5F432L;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_private();
        ((rrfP_2)this.id_break[id_protected[7]]).id_class(rrLu_12);
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_private();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[2]])) {
            ((rrfP_2)this.id_break[id_protected[3]]).id_class(System.currentTimeMillis() - (Long)this.id_break[id_protected[4]] > id_case[0] ? id_catch[0] : id_catch[1]);
            if (((AutoTotem)this.id_continue()).id_super() && ((rhz_3)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[5]]).id_implements[id_protected[6]]).id_implements(new rdn_3(rdy_3.kL))) {
                this.id_byte();
                return;
            }
            this.id_class();
        }
    }

    @Override
    public void id_class() {
        this.id_private();
        if ((Integer)this.id_break[id_protected[34]] > id_byte[4]) {
            if ((Integer)this.id_break[id_protected[35]] > id_byte[5]) {
                ((Ax_1)rrCW.id_import.id_class[id_protected[36]]).id_break((Integer)this.id_break[id_protected[37]]);
                ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[38]]).id_break[id_protected[39]]).id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
                ((Ax_1)rrCW.id_import.id_class[id_protected[40]]).id_break((Integer)this.id_break[id_protected[41]]);
            } else {
                ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[42]]).id_break[id_protected[43]]).id_break(new rme_3((Integer)this.id_break[id_protected[44]]));
                ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[45]]).id_break[id_protected[46]]).id_break(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
                ((Aq_1)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[47]]).id_break[id_protected[48]]).id_break(new rme_3(((rhz_3)((cb_3)rrCW.id_import.id_class[rrCW.id_protected[49]]).id_implements[rrCW.id_protected[50]]).id_protected));
            }
            this.id_implements();
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{101, -77, -57, 103, 95, 116, -112, 41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[53];
        sArray[1] = 1;
        sArray[4] = 2;
        sArray[5] = 57;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 57;
        sArray[10] = 57;
        sArray[11] = 1;
        sArray[13] = 57;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 55;
        sArray[17] = 57;
        sArray[19] = 55;
        sArray[20] = 57;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 57;
        sArray[25] = 57;
        sArray[27] = 57;
        sArray[29] = 57;
        sArray[30] = 1;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[36] = 55;
        sArray[37] = 1;
        sArray[38] = 57;
        sArray[40] = 55;
        sArray[41] = 1;
        sArray[42] = 57;
        sArray[44] = 1;
        sArray[45] = 57;
        sArray[47] = 57;
        sArray[49] = 57;
        sArray[50] = 1;
        sArray[51] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCW.id_case();
        rrCW.id_extends();
        rrCW.id_throws();
        rrCW.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{-1, -1, 8, -1, -1, 8, -1, 3, 2};
    }

    private static void id_extends() {
        long[] lArray = new long[2];
        lArray[0] = 200L;
        id_case = lArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_catch = blArray;
    }

    private void id_implements() {
        this.id_private();
        Integer n = id_byte[6];
        this.id_break[rrCW.id_protected[51]] = n;
        Boolean bl = id_catch[3];
        this.id_class[rrCW.id_protected[52]] = bl;
    }

    private void id_private() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
            this.id_break[1] = 0;
            this.id_break[2] = 0L;
        }
    }

    @Override
    public boolean aK_() {
        this.id_implements();
        return super.aK_();
    }
}

