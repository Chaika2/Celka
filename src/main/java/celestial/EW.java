/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.C_class;
import celestial.EQ;
import celestial.EZ;
import celestial.Ez_1;
import celestial.PM;
import celestial.PO;
import celestial.PP;
import celestial.a_1;
import celestial.bw_3;
import celestial.i_1;
import celestial.rP_2;
import celestial.rU_2;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class EW
implements PP,
i_1 {
    private static byte[] id_class;
    private static String[] id_case;
    private static boolean[] id_catch;
    private static double[] id_private;
    public static Object[] id_break;
    private static short[] id_implements;
    public Object[] id_throws;

    @Override
    public boolean id_byte() {
        return (Boolean)this.id_throws[id_implements[53]];
    }

    public EW(rU_2 rU_22, int n, int n2, int n3, rP_2 rP_22, EZ eZ) {
        EQ[] eQArray;
        this.id_private();
        this.id_throws[EW.id_implements[1]] = eQArray = new EQ[((double[])id_break[id_implements[0]]).length];
        rU_2 rU_23 = rU_22;
        this.id_throws[EW.id_implements[2]] = rU_23;
        Integer n4 = n;
        this.id_throws[EW.id_implements[3]] = n4;
        Integer n5 = n2;
        this.id_throws[EW.id_implements[4]] = n5;
        Integer n6 = n3;
        this.id_throws[EW.id_implements[5]] = n6;
        rP_2 rP_23 = rP_22;
        this.id_throws[EW.id_implements[6]] = rP_23;
        EZ eZ2 = eZ;
        this.id_throws[EW.id_implements[7]] = eZ2;
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap(((Integer)C_class.id_instanceof().re.id_class[id_implements[8]]).intValue(), ((Float)C_class.id_instanceof().a.id_class[id_implements[9]]).floatValue());
        this.id_throws[EW.id_implements[10]] = long2ObjectOpenHashMap;
    }

    static {
        EW.ntfClinit();
    }

    public double id_class(EQ eQ) {
        int n = (Integer)eQ.id_class[id_implements[30]] - (Integer)this.id_throws[id_implements[31]];
        int n2 = (Integer)eQ.id_class[id_implements[32]] - (Integer)this.id_throws[id_implements[33]];
        int n3 = (Integer)eQ.id_class[id_implements[34]] - (Integer)this.id_throws[id_implements[35]];
        return n * n + n2 * n2 + n3 * n3;
    }

    public EQ id_class(int n, int n2, int n3, long l) {
        EQ eQ = (EQ)((Long2ObjectOpenHashMap)this.id_throws[id_implements[36]]).get(l);
        if (eQ == null) {
            eQ = new EQ(n, n2, n3, (rP_2)this.id_throws[id_implements[37]]);
            ((Long2ObjectOpenHashMap)this.id_throws[id_implements[38]]).put(l, (Object)eQ);
        }
        return eQ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized PM id_class(long l, long l2) {
        PM pM;
        a_1 a_12;
        block13: {
            block12: {
                block11: {
                    if (((Boolean)this.id_throws[id_implements[12]]).booleanValue()) {
                        throw new IllegalStateException(id_case[0]);
                    }
                    Boolean bl = id_catch[1];
                    this.id_throws[EW.id_implements[13]] = bl;
                    a_12 = this.id_break(l, l2).map(a_1::id_private).orElse(null);
                    if (!((Boolean)this.id_throws[id_implements[14]]).booleanValue()) break block11;
                    PM pM2 = new PM((PO)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[15]]));
                    Boolean bl2 = id_catch[2];
                    this.id_throws[EW.id_implements[16]] = bl2;
                    return pM2;
                }
                if (a_12 != null) break block12;
                PM pM3 = new PM((PO)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[17]]));
                Boolean bl = id_catch[3];
                this.id_throws[EW.id_implements[18]] = bl;
                return pM3;
            }
            int n = a_12.id_class();
            a_12 = a_12.id_class((bw_3)((EZ)this.id_throws[EW.id_implements[19]]).id_break[id_implements[20]]);
            if (a_12.id_class() < n) {
                PP.a_.id_byte(id_case[1]);
                PP.a_.id_byte("Length decreased by " + (n - a_12.id_class()));
            } else {
                PP.a_.id_byte(id_case[2]);
            }
            n = a_12.id_class();
            a_12 = a_12.id_class((rP_2)this.id_throws[id_implements[21]]);
            if (a_12.id_class() < n) {
                PP.a_.id_byte("Static cutoff " + n + " to " + a_12.id_class());
            }
            if (!((rP_2)this.id_throws[id_implements[22]]).id_break(a_12.id_protected())) break block13;
            PM pM4 = new PM((PO)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[23]]), a_12);
            Boolean bl = id_catch[4];
            this.id_throws[EW.id_implements[24]] = bl;
            return pM4;
        }
        try {
            pM = new PM((PO)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[25]]), a_12);
        }
        catch (Exception exception) {
            PM pM5;
            try {
                PP.a_.id_case("Pathing exception: " + exception);
                exception.printStackTrace();
                pM5 = new PM((PO)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_implements[27]]));
            }
            catch (Throwable throwable) {
                Boolean bl = id_catch[7];
                this.id_throws[EW.id_implements[29]] = bl;
                throw throwable;
            }
            Boolean bl = id_catch[6];
            this.id_throws[EW.id_implements[28]] = bl;
            return pM5;
        }
        Boolean bl = id_catch[5];
        this.id_throws[EW.id_implements[26]] = bl;
        return pM;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD99C8C5;
    }

    public Optional<a_1> id_class(boolean bl, int n) {
        if ((EQ)this.id_throws[id_implements[40]] == null) {
            return Optional.empty();
        }
        double d = id_private[0];
        for (int i = id_catch[10]; i < ((double[])id_break[id_implements[41]]).length; ++i) {
            if (((EQ[])this.id_throws[id_implements[42]])[i] == null) continue;
            double d2 = this.id_class(((EQ[])this.id_throws[id_implements[43]])[i]);
            if (d2 > d) {
                d = d2;
            }
            if (!(d2 > id_private[1])) continue;
            if (bl) {
                if (((double[])id_break[id_implements[44]])[i] >= id_private[2]) {
                    System.out.println(id_case[3]);
                    System.out.println(id_case[4]);
                    System.out.println(id_case[5]);
                }
                this.id_byte("A* cost coefficient " + ((double[])id_break[id_implements[45]])[i]);
            }
            return Optional.of(new Ez_1((rU_2)this.id_throws[id_implements[46]], (EQ)this.id_throws[id_implements[47]], ((EQ[])this.id_throws[id_implements[48]])[i], n, (rP_2)this.id_throws[id_implements[49]], (EZ)this.id_throws[id_implements[50]]));
        }
        if (bl) {
            this.id_byte("Even with a cost coefficient of " + ((double[])id_break[id_implements[51]])[((double[])id_break[id_implements[52]]).length - id_catch[11]] + ", I couldn't get more than " + Math.sqrt(d) + " blocks");
            this.id_byte(id_case[6]);
            this.id_byte(id_case[7], id_catch[12]);
        }
        return Optional.empty();
    }

    @Override
    public Optional<a_1> id_class() {
        return this.id_class(id_catch[8], id_catch[9]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C2D82F216060476L;
    }

    @Override
    public rP_2 id_break() {
        return (rP_2)this.id_throws[id_implements[54]];
    }

    public abstract Optional<a_1> id_break(long var1, long var3);

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{82, -40, -99, -78, 5, -71, -106, 120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_throws() {
        return ((Long2ObjectOpenHashMap)this.id_throws[id_implements[58]]).size();
    }

    private static /* synthetic */ void ntfClinit() {
        EW.id_final();
        EW.id_extends();
        EW.id_finally();
        EW.id_volatile();
        EW.id_native();
        EW.id_implements();
    }

    private static void id_finally() {
        short[] sArray = new short[63];
        sArray[1] = 9;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 4;
        sArray[7] = 5;
        sArray[10] = 6;
        sArray[11] = 11;
        sArray[12] = 10;
        sArray[13] = 11;
        sArray[14] = 11;
        sArray[15] = 3;
        sArray[16] = 10;
        sArray[17] = 2;
        sArray[18] = 10;
        sArray[19] = 5;
        sArray[20] = 4;
        sArray[21] = 4;
        sArray[22] = 4;
        sArray[24] = 10;
        sArray[25] = 1;
        sArray[26] = 10;
        sArray[27] = 4;
        sArray[28] = 10;
        sArray[29] = 10;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[33] = 2;
        sArray[34] = 2;
        sArray[35] = 3;
        sArray[36] = 6;
        sArray[37] = 4;
        sArray[38] = 6;
        sArray[39] = 8;
        sArray[40] = 7;
        sArray[42] = 9;
        sArray[43] = 9;
        sArray[47] = 7;
        sArray[48] = 9;
        sArray[49] = 4;
        sArray[50] = 5;
        sArray[53] = 10;
        sArray[54] = 4;
        sArray[55] = 1;
        sArray[56] = 2;
        sArray[57] = 3;
        sArray[58] = 6;
        sArray[60] = 7;
        sArray[61] = 4;
        sArray[62] = 5;
        id_implements = sArray;
    }

    public void id_catch() {
        Boolean bl = id_catch[0];
        this.id_throws[EW.id_implements[11]] = bl;
    }

    private static void id_extends() {
        id_case = new String[]{new String("Path finder cannot be reused!"), new String("Cutting off path at edge of loaded chunks"), new String("Path ends within loaded chunks"), new String("Warning: cost coefficient is greater than three! Probably means that"), new String("the path I found is pretty terrible (like sneak-bridging for dozens of blocks)"), new String("But I'm going to do it anyway, because yolo"), new String("No path found =("), new String("No path found =(")};
    }

    public rU_2 id_case() {
        return new rU_2((Integer)this.id_throws[id_implements[55]], (Integer)this.id_throws[id_implements[56]], (Integer)this.id_throws[id_implements[57]]);
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{new double[]{1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0}, 5.0, 0.01};
        id_break = objectArray;
    }

    @Override
    public Optional<a_1> id_protected() {
        return Optional.ofNullable((EQ)this.id_throws[id_implements[39]]).map(eQ -> new Ez_1((rU_2)this.id_throws[id_implements[59]], (EQ)this.id_throws[id_implements[60]], (EQ)eQ, id_catch[13], (rP_2)this.id_throws[id_implements[61]], (EZ)this.id_throws[id_implements[62]]));
    }

    private void id_private() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_class[6]];
            objectArray[EW.id_catch[17]] = id_catch[18];
            objectArray[EW.id_class[7]] = id_catch[19];
            objectArray[EW.id_class[8]] = id_catch[20];
            objectArray[EW.id_class[9]] = id_catch[21];
            objectArray[EW.id_class[10]] = id_catch[22];
        }
    }

    private static void id_final() {
        boolean[] blArray = new boolean[24];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[23] = true;
        id_catch = blArray;
    }

    private static void id_volatile() {
        double[] dArray = new double[12];
        dArray[1] = 25.0;
        dArray[2] = 3.0;
        dArray[3] = 1.5;
        dArray[4] = 2.0;
        dArray[5] = 2.5;
        dArray[6] = 3.0;
        dArray[7] = 4.0;
        dArray[8] = 5.0;
        dArray[9] = 10.0;
        dArray[10] = 5.0;
        dArray[11] = 0.01;
        id_private = dArray;
    }

    private static void id_native() {
        id_class = new byte[]{7, 2, 3, 4, 5, 6, 12, 2, 3, 10, 11, 3, 2};
    }
}

