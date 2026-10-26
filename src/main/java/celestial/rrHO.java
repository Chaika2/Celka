/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.cb_3;
import celestial.module.player.AutoTool;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrHJ;
import celestial.rrHX;
import celestial.rrHb_1;
import celestial.rrHh_1;
import celestial.rrQX;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrHO
implements Comparator<rrHJ> {
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrHh_1()};
        id_class = objectArray;
    }

    public rrHO(List<rrHX> list) {
        List<rrHX> list2;
        this.id_break();
        this.id_break[rrHO.id_byte[18]] = list2 = list;
    }

    static {
        rrHO.ntfClinit();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rrHJ)object, (rrHJ)object2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{100, -76, -51, -64, -84, 95, -72, -53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class(rrHJ rrHJ2, rrHJ rrHJ3) {
        rfH_2 rfH_22 = rrHJ2.id_break();
        rfH_2 rfH_23 = rrHJ3.id_break();
        xc_3 xc_32 = rrHJ2.id_class();
        xc_3 xc_33 = rrHJ3.id_class();
        ComparisonChain comparisonChain = ComparisonChain.start();
        for (rrHX rrHX2 : (List)this.id_break[id_byte[0]]) {
            switch (((int[])rrHb_1.id_class[id_byte[1]])[rrHX2.ordinal()]) {
                case 1: {
                    comparisonChain = comparisonChain.compare(this.id_class(xc_33), this.id_class(xc_32));
                    break;
                }
                case 2: {
                    float f = xc_32.id_class((cb_3)MinecraftAccessor.id_import.id_class[id_byte[2]], (rYB)((cb_3)MinecraftAccessor.id_import.id_class[rrHO.id_byte[3]]).id_throws[id_byte[4]], rfH_22);
                    float f2 = xc_33.id_class((cb_3)MinecraftAccessor.id_import.id_class[id_byte[5]], (rYB)((cb_3)MinecraftAccessor.id_import.id_class[rrHO.id_byte[6]]).id_throws[id_byte[7]], rfH_23);
                    AutoTool autoTool = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_private().id_for();
                    if (autoTool.aJ_()) {
                        Pair<rdn_3, Integer> pair = autoTool.id_class(xc_32, rfH_22);
                        Pair<rdn_3, Integer> pair2 = autoTool.id_class(xc_33, rfH_23);
                        rdn_3 rdn_32 = (rdn_3)pair.getLeft();
                        rdn_3 rdn_33 = (rdn_3)pair2.getLeft();
                        if (rdn_32 != null && !rdn_32.id_class()) {
                            f = xc_32.id_class((cb_3)MinecraftAccessor.id_import.id_class[id_byte[9]], rdn_32, (rYB)((cb_3)MinecraftAccessor.id_import.id_class[rrHO.id_byte[10]]).id_throws[id_byte[11]], rfH_22);
                        }
                        if (rdn_33 != null && !rdn_33.id_class()) {
                            f2 = xc_33.id_class((cb_3)MinecraftAccessor.id_import.id_class[id_byte[12]], rdn_33, (rYB)((cb_3)MinecraftAccessor.id_import.id_class[rrHO.id_byte[13]]).id_throws[id_byte[14]], rfH_23);
                        }
                    }
                    comparisonChain = comparisonChain.compare(f2, f);
                    break;
                }
                case 3: {
                    comparisonChain = comparisonChain.compare(((cb_3)MinecraftAccessor.id_import.id_class[id_byte[15]]).id_break(rfH_22), ((cb_3)MinecraftAccessor.id_import.id_class[id_byte[16]]).id_break(rfH_23));
                }
            }
        }
        return comparisonChain.result();
    }

    private static void id_class() {
        short[] sArray = new short[19];
        sArray[1] = 1;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 7;
        sArray[5] = 57;
        sArray[6] = 57;
        sArray[7] = 7;
        sArray[9] = 57;
        sArray[10] = 57;
        sArray[11] = 7;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[14] = 7;
        sArray[15] = 57;
        sArray[16] = 57;
        id_byte = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x388AD1FF0E8DC324L;
    }

    public int id_class(xc_3 xc_32) {
        return ((Map)id_class[id_byte[17]]).getOrDefault(xc_32.id_break(), Integer.valueOf(id_throws[0]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF5B986B;
    }

    private void id_break() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    private static void id_throws() {
        id_throws = new byte[]{-1};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHO.id_protected();
        rrHO.id_class();
        rrHO.id_throws();
        rrHO.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }
}

