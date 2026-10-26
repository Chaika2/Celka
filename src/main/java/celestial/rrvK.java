/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.cb_3;
import celestial.manager.FontManager;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rqs_3;
import celestial.rrAr_1;
import celestial.rrFl_1;
import celestial.rrLa_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrvD;
import celestial.rrvU;
import celestial.rrve_1;
import celestial.rrvo_1;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvK
extends rrFl_1<rrvU> {
    private static boolean[] id_break;
    private static int[] id_protected;
    private static String[] id_throws;
    private static byte[] id_case;
    public Object[] id_class;
    private static short[] id_catch;
    private static float[] id_private;

    public static String id_byte(String string) {
        return string.replace(id_throws[2], id_throws[3]).replaceAll(id_throws[4], id_throws[5]).trim();
    }

    @Override
    public Collection<rrvU> id_byte() {
        this.id_implements();
        return (List)this.id_class[id_catch[7]];
    }

    public rrvK(rrvo_1 rrvo_12) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_implements();
        this.id_class[rrvK.id_catch[0]] = arrayList2 = new ArrayList();
        this.id_class[rrvK.id_catch[1]] = arrayList = new ArrayList();
        rrvo_1 rrvo_13 = rrvo_12;
        this.id_class[rrvK.id_catch[2]] = rrvo_13;
        ((List)this.id_class[id_catch[3]]).add(new rrve_1(this, id_throws[0], id_throws[1]));
    }

    static {
        rrvK.ntfClinit();
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2) {
        this.id_implements();
        float f3 = ((rrvo_1)this.id_class[id_catch[4]]).id_long();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[5]]).id_class();
        this.id_break(id_private[0]);
        float f4 = this.id_finally();
        float f5 = this.id_protected();
        rrZO2.id_class(MinecraftAccessor.id_strictfp);
        for (rrvU rrvU2 : this.id_byte()) {
            AnimValue animValue = rrvU2.id_break();
            rrvU2.id_class(rrvU2.id_catch());
            if (!animValue.id_case()) continue;
            float f6 = animValue.id_byte();
            float f7 = animValue.id_continue();
            float f8 = f5 * id_private[1] * f7;
            float f9 = f + id_private[2];
            float f10 = f2 + f4 - f8;
            int n = ColorHelper.id_break(rrZF.d_, (int)(id_private[3] * f6 * f3));
            String string = rrvU2.id_case();
            String string2 = rrvU2.id_class();
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string, f9, f10, n, id_break[0], id_break[1]);
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string2, f9 + ((rrvo_1)this.id_class[id_catch[6]]).id_implements() - rrZO2.id_break(string2) - id_private[4], f10, n, id_break[2], id_break[3]);
            float f11 = f5 * f6;
            f4 += f11;
            this.id_class(f11);
        }
        rrZO2.id_byte(MinecraftAccessor.id_strictfp);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDAD9D5BD;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(rrLa_1 rrLa_12) {
        this.id_implements();
        rdn_3 rdn_32 = rrLa_12.id_class();
        Object object = rrLa_12.id_break();
        if (object instanceof rrAr_1) {
            rrAr_1 rrAr_12 = (rrAr_1)object;
            object = (List)this.id_class[id_catch[12]];
            synchronized (object) {
                if (this.id_class(rdn_32, rrAr_12.id_break())) {
                    return;
                }
                rrvD rrvD2 = new rrvD(rdn_32 = rrvK.id_class(rdn_32));
                if (!((List)this.id_class[id_catch[13]]).contains(rrvD2)) {
                    ((List)this.id_class[id_catch[14]]).add(rrvD2);
                    if (((List)this.id_class[id_catch[15]]).size() > id_break[6]) {
                        ((List)this.id_class[id_catch[16]]).sort(Comparator.comparingInt(rrvU2 -> {
                            int n;
                            if (rrvU2 instanceof rrvD) {
                                rrvD rrvD2 = (rrvD)rrvU2;
                                n = -rrvD2.id_implements();
                            } else {
                                n = id_break[15];
                            }
                            return n;
                        }));
                    }
                }
            }
        }
    }

    private boolean id_class(rdn_3 rdn_32, int n) {
        rdb_3 rdb_32 = rdn_32.id_break();
        if ((rrfq_3)((Object)rrfp_3.id_class[id_catch[17]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[18]])) {
            if (rdb_32 == rdy_3.dc && n >= id_protected[0]) {
                return id_break[7];
            }
            if (rdb_32 == rdy_3.hR && n >= id_protected[1]) {
                return id_break[8];
            }
            if (rdb_32 == rdy_3.WL && n >= id_catch[19]) {
                return id_break[9];
            }
            if (rdb_32 == rdy_3.Ex && n >= id_catch[20]) {
                return id_break[10];
            }
        }
        return id_break[11];
    }

    public List<rrvU> id_class() {
        this.id_implements();
        return (List)this.id_class[id_catch[26]];
    }

    @Override
    public float id_class(rrvU rrvU2) {
        String string = rrvU2.id_case() + rrvU2.id_class();
        return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[22]]).id_class().id_break(string) + id_private[5];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 115, -79, 31, 60, 54, 127, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static rdn_3 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_class() || (cb_3)MinecraftAccessor.id_import.id_class[id_catch[23]] == null) {
            return rdn_32;
        }
        rdn_3 rdn_33 = null;
        int n = id_case[0];
        boolean bl = id_break[12];
        for (rqs_3<rdn_3> rqs_32 : ((rhz_3)((cb_3)MinecraftAccessor.id_import.id_class[rrvK.id_catch[24]]).id_implements[id_catch[25]]).id_extends()) {
            for (rdn_3 rdn_34 : rqs_32) {
                if (!rdn_3.id_byte(rdn_34, rdn_32)) continue;
                boolean bl2 = rdn_34.id_this();
                int n2 = rdn_34.id_abstract();
                if (rdn_33 != null && (!bl2 || bl) && (bl2 != bl || n2 <= n)) continue;
                rdn_33 = rdn_34;
                bl = bl2;
                n = n2;
            }
        }
        return rdn_33 != null ? rdn_33 : rdn_32;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8D8B1469FE3C2EE9L;
    }

    public void id_break() {
        this.id_implements();
        ((List)this.id_class[id_catch[21]]).removeIf(rrvU2 -> !rrvU2.id_byte() ? id_break[13] : id_break[14]);
    }

    @Override
    public void id_throws() {
        this.id_implements();
        super.id_throws();
        Collection<rrvU> collection = this.id_byte();
        Boolean bl = id_break[4];
        this.id_class[rrvK.id_catch[8]] = bl;
        ((List)this.id_class[id_catch[9]]).clear();
        if (!collection.isEmpty()) {
            Iterator<rrvU> iterator = collection.iterator();
            while (iterator.hasNext()) {
                rrvU rrvU2 = iterator.next();
                AnimValue animValue = rrvU2.id_break();
                boolean bl2 = rrvU2.id_byte();
                if (!bl2) {
                    if (animValue.id_catch()) {
                        iterator.remove();
                        continue;
                    }
                    if (rrvU2 instanceof rrvD) {
                        rrvD rrvD2 = (rrvD)rrvU2;
                        rrvD2.id_throws();
                    }
                }
                if (!animValue.id_finally()) continue;
                if (rrvU2.id_catch()) {
                    ((List)this.id_class[id_catch[10]]).add(rrvU2);
                }
                if (bl2) continue;
                Boolean bl3 = id_break[5];
                this.id_class[rrvK.id_catch[11]] = bl3;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrvK.id_final();
        rrvK.id_native();
        rrvK.id_catch();
        rrvK.id_volatile();
        rrvK.id_extends();
        rrvK.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[28];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[7] = 1;
        sArray[8] = 3;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 4;
        sArray[19] = 6000;
        sArray[20] = 6000;
        sArray[21] = 1;
        sArray[23] = 57;
        sArray[24] = 57;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 3;
        id_catch = sArray;
    }

    private static void id_extends() {
        id_case = new byte[]{-1, 4, 3};
    }

    public boolean id_case() {
        this.id_implements();
        return (Boolean)this.id_class[id_catch[27]];
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[1]];
            objectArray[rrvK.id_case[2]] = id_break[16];
        }
    }

    @Override
    public float id_protected() {
        return id_private[6];
    }

    private static void id_private() {
        id_protected = new int[]{72000, 72000};
    }

    private static void id_final() {
        boolean[] blArray = new boolean[17];
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[13] = true;
        id_break = blArray;
    }

    private static void id_volatile() {
        id_private = new float[]{18.0f, 0.8f, 3.0f, 255.0f, 5.0f, 15.0f, 10.0f};
    }

    private static void id_native() {
        id_throws = new String[]{new String("Preview Cooldown"), new String("**:**"), new String("\u0451"), new String("\u0435"), new String("[^a-zA-Z\u0430-\u044f\u0410-\u042f- ]+"), new String("")};
    }
}

