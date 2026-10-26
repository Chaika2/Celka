/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.cG_2;
import celestial.gm_3;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rpZ_2;
import celestial.rqA_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvy_1
extends cG_2 {
    private static float[] id_finally;
    private static boolean[] id_extends;
    private static short[] id_native;
    public Object[] id_break;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-53, 101, -52, -66, -76, 51, -55, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_long() {
        id_finally = new float[1];
    }

    private static void id_float() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_extends = blArray;
    }

    public rrvy_1(cG_2 cG_22) {
        super((gm_3)cG_22.id_class[id_native[0]], cG_22.sv());
        this.id_public();
        cG_2 cG_23 = cG_22;
        this.id_break[rrvy_1.id_native[1]] = cG_23;
        this.id_protected(cG_22);
    }

    static {
        rrvy_1.ntfClinit();
    }

    public void id_class(int n, BiConsumer<Integer, rrvy_1> biConsumer) {
        this.id_public();
        for (int i = id_extends[0]; i < n; ++i) {
            this.id_private(new rjU_2(((Float)((cG_2)this.id_break[rrvy_1.id_native[2]]).id_private[id_native[3]]).floatValue(), ((Float)((cG_2)this.id_break[rrvy_1.id_native[4]]).id_private[id_native[5]]).floatValue(), ((Float)((cG_2)this.id_break[rrvy_1.id_native[6]]).id_private[id_native[7]]).floatValue()));
            if (biConsumer == null) continue;
            biConsumer.accept(i, this);
        }
    }

    public void id_class(int n) {
        this.id_class(n, (BiConsumer<Integer, rrvy_1>)null);
    }

    @Override
    public rdn_3 id_class(rXQ rXQ2) {
        this.id_public();
        return ((cG_2)this.id_break[id_native[23]]).id_class(rXQ2);
    }

    @Override
    public void id_class(rdn_3 rdn_32, int n) {
    }

    @Override
    public void id_class(rXQ rXQ2, rdn_3 rdn_32) {
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8796157F80FF9D99L;
    }

    @Override
    public void id_class(rqA_2 rqA_22, float f, float f2) {
    }

    @Override
    public void U() {
    }

    @Override
    public void id_break(rfH_2 rfH_22, xc_3 xc_32) {
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return id_extends[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrvy_1.id_float();
        rrvy_1.id_static();
        rrvy_1.id_long();
    }

    @Override
    public void Sk() {
    }

    @Override
    public Aw_1 id_continue() {
        return null;
    }

    public List<Float> id_else() {
        this.id_public();
        ArrayList<Float> arrayList = new ArrayList<Float>();
        int n = id_native[8];
        for (int i = id_extends[1]; !this.BL() && i < n; ++i) {
            float f = ((Float)this.id_throws[id_native[9]]).floatValue();
            this.id_private(new rjU_2(((Float)((cG_2)this.id_break[rrvy_1.id_native[10]]).id_private[id_native[11]]).floatValue(), ((Float)((cG_2)this.id_break[rrvy_1.id_native[12]]).id_private[id_native[13]]).floatValue(), ((Float)((cG_2)this.id_break[rrvy_1.id_native[14]]).id_private[id_native[15]]).floatValue()));
            if (((Float)this.id_throws[id_native[16]]).floatValue() == id_finally[0] || ((Float)this.id_throws[id_native[17]]).floatValue() == f) continue;
            arrayList.add(Float.valueOf(((Float)this.id_throws[id_native[18]]).floatValue()));
        }
        return arrayList;
    }

    private static int id_else(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCEC14986;
    }

    @Override
    public boolean id_implements() {
        this.id_public();
        return ((cG_2)this.id_break[id_native[21]]).id_implements();
    }

    @Override
    public boolean id_try() {
        return id_extends[4];
    }

    private static void id_static() {
        short[] sArray = new short[25];
        sArray[0] = 5;
        sArray[3] = 42;
        sArray[5] = 43;
        sArray[7] = 44;
        sArray[8] = 1000;
        sArray[9] = 31;
        sArray[11] = 42;
        sArray[13] = 43;
        sArray[15] = 44;
        sArray[16] = 31;
        sArray[17] = 31;
        sArray[18] = 31;
        id_native = sArray;
    }

    private void id_public() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_extends[7]];
        }
    }

    @Override
    public void id_private(float f) {
    }

    @Override
    public boolean id_native() {
        this.id_public();
        return ((cG_2)this.id_break[id_native[20]]).id_native();
    }

    @Override
    public boolean SG() {
        return id_extends[6];
    }

    @Override
    public Iterable<rdn_3> PV() {
        this.id_public();
        return ((cG_2)this.id_break[id_native[19]]).PV();
    }

    @Override
    public void Bb() {
    }

    @Override
    public boolean Sy() {
        this.id_public();
        return ((cG_2)this.id_break[id_native[22]]).Sy();
    }

    @Override
    public boolean Sp() {
        return id_extends[5];
    }

    @Override
    public void St() {
    }

    @Override
    public rpZ_2 Su() {
        this.id_public();
        return ((cG_2)this.id_break[id_native[24]]).Su();
    }

    @Override
    public boolean SO() {
        return id_extends[3];
    }

    @Override
    public void Sv() {
    }
}

