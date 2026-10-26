/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.GC;
import celestial.Gl_1;
import celestial.Ps_1;
import celestial.bq_3;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rc_3;
import celestial.rn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gn_1
extends bq_3
implements rc_3 {
    private static byte[] id_throws;
    private static String[] id_catch;
    private static short[] id_private;
    private static boolean[] id_implements;
    public Object[] id_break;

    @Override
    public boolean id_byte() {
        this.id_volatile();
        return (Gl_1)((Object)this.id_break[id_private[12]]) != (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[13]]) ? id_implements[0] : id_implements[1];
    }

    public Gn_1(C_class c_class) {
        super(c_class);
        this.id_volatile();
    }

    static {
        Gn_1.ntfClinit();
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        this.id_volatile();
        switch (((int[])GC.id_class[id_private[14]])[((Gl_1)((Object)this.id_break[id_private[15]])).ordinal()]) {
            case 1: {
                return new rn_3((rP_2)this.id_break[id_private[16]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[17]]));
            }
            case 2: {
                rn_3 rn_32 = new rn_3((rP_2)this.id_break[id_private[18]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[19]]));
                Gl_1 gl_1 = (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[20]]);
                this.id_break[Gn_1.id_private[21]] = gl_1;
                return rn_32;
            }
            case 3: {
                if (bl) {
                    this.id_protected();
                    return new rn_3((rP_2)this.id_break[id_private[22]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[23]]));
                }
                if ((rP_2)this.id_break[id_private[24]] == null || ((rP_2)this.id_break[id_private[25]]).id_break(((Ps_1)this.id_case[id_private[26]]).id_volatile()) && ((rP_2)this.id_break[id_private[27]]).id_break(((C_class)this.id_case[id_private[28]]).id_while().id_super())) {
                    this.id_protected();
                    if (((Boolean)C_class.id_instanceof().id_char.id_class[id_private[29]]).booleanValue()) {
                        ((Ps_1)this.id_case[id_private[30]]).id_case().id_catch();
                    }
                    if (((Boolean)C_class.id_instanceof().rK.id_class[id_private[31]]).booleanValue()) {
                        this.id_byte(id_catch[0], id_implements[2]);
                    }
                    return new rn_3((rP_2)this.id_break[id_private[32]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[33]]));
                }
                return new rn_3((rP_2)this.id_break[id_private[34]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[35]]));
            }
        }
        throw new IllegalStateException();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82E09FC4;
    }

    @Override
    public void id_class(rP_2 rP_22) {
        this.id_volatile();
        rP_2 rP_23 = rP_22;
        this.id_break[Gn_1.id_private[0]] = rP_23;
        if ((Gl_1)((Object)this.id_break[id_private[1]]) == (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[2]])) {
            Gl_1 gl_1 = (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[3]]);
            this.id_break[Gn_1.id_private[4]] = gl_1;
        }
        if ((Gl_1)((Object)this.id_break[id_private[5]]) == (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[6]])) {
            Gl_1 gl_1 = (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[7]]);
            this.id_break[Gn_1.id_private[8]] = gl_1;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{44, 120, 109, 52, -35, 106, 93, 111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE01786CBFB646BE2L;
    }

    @Override
    public String id_class() {
        this.id_volatile();
        return "Custom Goal " + (rP_2)this.id_break[id_private[39]];
    }

    private static /* synthetic */ void ntfClinit() {
        Gn_1.id_finally();
        Gn_1.id_final();
        Gn_1.id_extends();
        Gn_1.id_native();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_implements = blArray;
    }

    private static void id_extends() {
        short[] sArray = new short[40];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[15] = 1;
        sArray[17] = 2;
        sArray[19] = 4;
        sArray[20] = 3;
        sArray[21] = 1;
        sArray[23] = 2;
        sArray[26] = 1;
        sArray[30] = 1;
        sArray[33] = 2;
        sArray[37] = 1;
        id_private = sArray;
    }

    @Override
    public void id_implements() {
        this.id_volatile();
        Gl_1 gl_1 = (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[9]]);
        this.id_break[Gn_1.id_private[10]] = gl_1;
    }

    @Override
    public void id_protected() {
        this.id_volatile();
        super.id_protected();
        Gl_1 gl_1 = (Gl_1)((Object)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[36]]);
        this.id_break[Gn_1.id_private[37]] = gl_1;
        Object var6_2 = null;
        this.id_break[Gn_1.id_private[38]] = var6_2;
    }

    @Override
    public rP_2 id_private() {
        this.id_volatile();
        return (rP_2)this.id_break[id_private[11]];
    }

    private static void id_final() {
        id_catch = new String[]{new String("Pathing complete")};
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static void id_native() {
        id_throws = new byte[]{2};
    }
}

