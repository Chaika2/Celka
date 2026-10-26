/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BO;
import celestial.C_class;
import celestial.Gh_1;
import celestial.bK_2;
import celestial.bo_3;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rn_3;
import celestial.rr_3;
import celestial.rz_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bY_2
implements rr_3 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;

    @Override
    public boolean id_byte() {
        return !((List)this.id_class[id_break[69]]).isEmpty() ? id_byte[9] : id_byte[10];
    }

    public bY_2(C_class c_class) {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_finally();
        C_class c_class2 = c_class;
        this.id_class[bY_2.id_break[0]] = c_class2;
        this.id_class[bY_2.id_break[1]] = hashSet = new HashSet();
        this.id_class[bY_2.id_break[2]] = arrayList = new ArrayList();
        c_class.s().id_class(new bo_3(this));
    }

    static {
        bY_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{59, -124, -104, 88, -35, -18, 59, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(rz_3 rz_32) {
        rz_32.id_protected();
        ((HashSet)this.id_class[id_break[3]]).add(rz_32);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x61D9B8EA;
    }

    @Override
    public HashSet<rz_3> id_class() {
        return (HashSet)this.id_class[id_break[68]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x702C7D4096E8CF6DL;
    }

    public boolean id_class(rP_2 rP_22) {
        Gh_1 gh_1 = ((C_class)this.id_class[id_break[54]]).id_while().id_new();
        if (gh_1 != null) {
            if (rP_22.id_break(gh_1.id_class().id_protected())) {
                return id_byte[0];
            }
            return !rP_22.equals(gh_1.id_class().id_byte()) ? id_byte[1] : id_byte[2];
        }
        return id_byte[3];
    }

    public boolean id_break(rP_2 rP_22) {
        rU_2 rU_22;
        rP_2 rP_23;
        Gh_1 gh_1 = ((C_class)this.id_class[id_break[55]]).id_while().id_new();
        if (gh_1 != null && (rP_23 = gh_1.id_class().id_byte()).id_break(rU_22 = gh_1.id_class().id_protected()) && !rP_22.id_break(rU_22)) {
            return id_byte[4];
        }
        return id_byte[5];
    }

    @Override
    public Optional<rn_3> id_break() {
        return Optional.ofNullable((rn_3)this.id_class[id_break[11]]);
    }

    @Override
    public rz_3 id_throws() {
        return this.id_class().stream().filter(rz_3::id_byte).findFirst().orElse(null);
    }

    private static /* synthetic */ void ntfClinit() {
        bY_2.id_native();
        bY_2.id_extends();
        bY_2.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public void id_catch() {
        rz_3 rz_32 = (rz_3)this.id_class[id_break[12]];
        this.id_class[bY_2.id_break[13]] = rz_32;
        Object var7_2 = null;
        this.id_class[bY_2.id_break[14]] = var7_2;
        BO bO = ((C_class)this.id_class[id_break[15]]).id_while();
        rn_3 rn_32 = this.id_private();
        this.id_class[bY_2.id_break[16]] = rn_32;
        if ((rn_3)this.id_class[id_break[17]] == null) {
            bO.id_synchronized();
            bO.id_class((rP_2)null);
            return;
        }
        if (!Objects.equals((rz_3)this.id_class[id_break[18]], (rz_3)this.id_class[id_break[19]]) && (rC_2)((Object)((rn_3)this.id_class[bY_2.id_break[20]]).id_class[id_break[21]]) != (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_break[22]]) && (rz_3)this.id_class[id_break[23]] != null && !((rz_3)this.id_class[id_break[24]]).id_catch()) {
            bO.id_synchronized();
        }
        switch (((int[])bK_2.id_class[id_break[25]])[((rC_2)((Object)((rn_3)this.id_class[bY_2.id_break[26]]).id_class[id_break[27]])).ordinal()]) {
            case 1: {
                bO.id_final();
                break;
            }
            case 2: {
                bO.id_class((rP_2)((rn_3)this.id_class[bY_2.id_break[28]]).id_class[id_break[29]]);
                bO.id_synchronized();
                break;
            }
            case 3: {
                if (bO.id_catch() || bO.id_case().isPresent()) break;
                bO.id_class((rn_3)this.id_class[id_break[30]]);
                break;
            }
            case 4: {
                if (bO.id_catch() || bO.id_case().isPresent()) break;
                bO.id_class((rn_3)this.id_class[id_break[31]]);
                break;
            }
            case 5: {
                if ((rP_2)((rn_3)this.id_class[bY_2.id_break[32]]).id_class[id_break[33]] == null) break;
                ((C_class)this.id_class[id_break[34]]).id_while().id_class((rn_3)this.id_class[id_break[35]]);
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    private static void id_extends() {
        short[] sArray = new short[70];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[5] = 3;
        sArray[6] = 4;
        sArray[7] = 5;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[10] = 4;
        sArray[11] = 5;
        sArray[12] = 4;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[16] = 5;
        sArray[17] = 5;
        sArray[18] = 4;
        sArray[19] = 3;
        sArray[20] = 5;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 3;
        sArray[24] = 3;
        sArray[26] = 5;
        sArray[27] = 1;
        sArray[28] = 5;
        sArray[30] = 5;
        sArray[31] = 5;
        sArray[32] = 5;
        sArray[35] = 5;
        sArray[36] = 5;
        sArray[39] = 5;
        sArray[40] = 1;
        sArray[41] = 5;
        sArray[43] = 5;
        sArray[45] = 5;
        sArray[47] = 5;
        sArray[49] = 5;
        sArray[51] = 5;
        sArray[53] = 5;
        sArray[56] = 1;
        sArray[57] = 2;
        sArray[58] = 2;
        sArray[59] = 2;
        sArray[60] = 2;
        sArray[61] = 2;
        sArray[62] = 3;
        sArray[65] = 1;
        sArray[66] = 5;
        sArray[67] = 4;
        sArray[68] = 1;
        sArray[69] = 2;
        id_break = sArray;
    }

    public void id_case() {
        ((C_class)this.id_class[id_break[4]]).s().id_native();
        Object var7_1 = null;
        this.id_class[bY_2.id_break[5]] = var7_1;
        Object var8_2 = null;
        this.id_class[bY_2.id_break[6]] = var8_2;
        Object var9_3 = null;
        this.id_class[bY_2.id_break[7]] = var9_3;
        ((List)this.id_class[id_break[8]]).clear();
        for (rz_3 rz_32 : (HashSet)this.id_class[id_break[9]]) {
            rz_32.id_protected();
            if (!rz_32.id_byte() || rz_32.id_catch()) continue;
            throw new IllegalStateException(rz_32.id_break());
        }
    }

    private static void id_implements() {
        id_protected = new byte[]{6};
    }

    @Override
    public Optional<rz_3> id_protected() {
        return Optional.ofNullable((rz_3)this.id_class[id_break[10]]);
    }

    public rn_3 id_private() {
        for (rz_3 rz_32 : (HashSet)this.id_class[id_break[56]]) {
            if (rz_32.id_byte()) {
                if (((List)this.id_class[id_break[57]]).contains(rz_32)) continue;
                ((List)this.id_class[id_break[58]]).add(id_byte[6], rz_32);
                continue;
            }
            ((List)this.id_class[id_break[59]]).remove(rz_32);
        }
        ((List)this.id_class[id_break[60]]).sort(Comparator.comparingDouble(rz_3::id_case).reversed());
        Iterator<rz_3> iterator = ((List)this.id_class[id_break[61]]).iterator();
        while (iterator.hasNext()) {
            rz_3 rz_32;
            rn_3 rn_32 = rz_32.id_class(Objects.equals(rz_32 = (rz_3)iterator.next(), (rz_3)this.id_class[id_break[62]]) && ((C_class)this.id_class[id_break[63]]).id_while().id_int() ? id_byte[7] : id_byte[8], ((C_class)this.id_class[id_break[64]]).id_while().id_else());
            if (rn_32 == null) {
                if (!rz_32.id_byte()) continue;
                throw new IllegalStateException(rz_32.id_break() + " actively returned null PathingCommand");
            }
            if ((rC_2)((Object)rn_32.id_class[id_break[65]]) == (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_break[66]])) continue;
            rz_3 rz_33 = rz_32;
            this.id_class[bY_2.id_break[67]] = rz_33;
            if (!rz_32.id_catch()) {
                iterator.forEachRemaining(rz_3::id_protected);
            }
            return rn_32;
        }
        return null;
    }

    public void id_volatile() {
        if ((rn_3)this.id_class[id_break[36]] == null) {
            return;
        }
        BO bO = ((C_class)this.id_class[id_break[37]]).id_while();
        switch (((int[])bK_2.id_class[id_break[38]])[((rC_2)((Object)((rn_3)this.id_class[bY_2.id_break[39]]).id_class[id_break[40]])).ordinal()]) {
            case 3: {
                if ((rP_2)((rn_3)this.id_class[bY_2.id_break[41]]).id_class[id_break[42]] == null || this.id_class((rP_2)((rn_3)this.id_class[bY_2.id_break[43]]).id_class[id_break[44]]) || this.id_break((rP_2)((rn_3)this.id_class[bY_2.id_break[45]]).id_class[id_break[46]])) {
                    bO.id_this();
                }
                bO.id_class((rn_3)this.id_class[id_break[47]]);
                break;
            }
            case 4: {
                if (((Boolean)C_class.id_instanceof().Pb.id_class[id_break[48]]).booleanValue() && ((rP_2)((rn_3)this.id_class[bY_2.id_break[49]]).id_class[id_break[50]] == null || this.id_break((rP_2)((rn_3)this.id_class[bY_2.id_break[51]]).id_class[id_break[52]]))) {
                    bO.id_this();
                }
                bO.id_class((rn_3)this.id_class[id_break[53]]);
                break;
            }
        }
    }

    private static void id_native() {
        boolean[] blArray = new boolean[11];
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_byte = blArray;
    }
}

