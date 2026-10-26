/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Fu_1;
import celestial.LZ;
import celestial.Pv_1;
import celestial.Qw_1;
import celestial.rrNV;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrNO
extends Pv_1
implements MinecraftAccessor {
    private static byte[] id_byte;
    private static String[] id_protected;
    public Object[] id_break;
    private static double[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;

    public void id_byte() throws IllegalStateException {
        this.id_break(!this.id_private() ? id_catch[10] : id_catch[11]);
    }

    private static void id_int() {
        id_protected = new String[]{new String("\u041d\u0435\u043b\u044c\u0437\u044f \u0432\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u043f\u043e\u043a\u0443\u043f\u043a\u0443, \u043f\u043e\u043a\u0430 \u0430\u043a\u0442\u0438\u0432\u0435\u043d \u043f\u0430\u0440\u0441\u0435\u0440"), new String("\u041d\u0435\u043b\u044c\u0437\u044f \u0432\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u043f\u0430\u0440\u0441\u0435\u0440, \u043f\u043e\u043a\u0430 \u0430\u043a\u0442\u0438\u0432\u043d\u0430 \u043f\u043e\u043a\u0443\u043f\u043a\u0430")};
    }

    public rrNO(C_class c_class, rrfq_3 ... rrfq_3Array) {
        super(c_class);
        Set<rrfq_3> set;
        this.id_new();
        this.id_break[rrNO.id_case[0]] = set = Set.of(rrfq_3Array);
    }

    static {
        rrNO.ntfClinit();
    }

    public List<LZ> id_class(Fu_1<?> fu_1, String string, int n, int n2, int n3) {
        return null;
    }

    public void id_class(Fu_1<?> fu_1, rrNV rrNV2) {
    }

    public void id_class(boolean bl) {
        this.id_new();
        if (bl && this.id_private()) {
            throw new IllegalStateException(id_protected[0]);
        }
        Boolean bl2 = bl;
        this.id_break[rrNO.id_case[10]] = bl2;
        if (((Boolean)this.id_break[id_case[11]]).booleanValue()) {
            this.id_protected();
        } else {
            this.id_class();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4EB0254970A6308EL;
    }

    public void id_class() {
    }

    public int id_class(int n, int n2) {
        double d = ((Qw_1)rrNO.id_import.id_class[rrNO.id_case[9]]).rS;
        return (int)((double)n * (id_throws[0] - d / id_throws[1]) / (double)n2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x167F0E10;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, 35, -92, -15, 53, -22, -113, -118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(boolean bl) throws IllegalStateException {
        this.id_new();
        if (this.id_case() && bl) {
            throw new IllegalStateException(id_protected[1]);
        }
        Boolean bl2 = bl;
        this.id_break[rrNO.id_case[12]] = bl2;
        if (((Boolean)this.id_break[id_case[13]]).booleanValue()) {
            this.id_throws();
        } else {
            this.id_extends();
        }
    }

    public boolean id_break() {
        return (rrfq_3)((Object)rrfp_3.id_class[id_case[1]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_case[2]]) ? id_catch[0] : id_catch[1];
    }

    public void id_throws() {
    }

    private static /* synthetic */ void ntfClinit() {
        rrNO.id_super();
        rrNO.id_int();
        rrNO.id_final();
        rrNO.id_continue();
        rrNO.id_package();
    }

    public Set<rrfq_3> id_finally() {
        this.id_new();
        return (Set)this.id_break[id_case[16]];
    }

    public void id_catch() {
        this.id_new();
        if (((Boolean)this.id_break[id_case[14]]).booleanValue()) {
            this.id_class(id_catch[12]);
        }
        if (((Boolean)this.id_break[id_case[15]]).booleanValue()) {
            this.id_break(id_catch[13]);
        }
    }

    public void id_extends() {
    }

    public boolean id_case() {
        this.id_new();
        if (!((Boolean)this.id_break[id_case[3]]).booleanValue()) {
            return id_catch[2];
        }
        rrfq_3 rrfq_32 = (rrfq_3)((Object)rrfp_3.id_class[id_case[4]]);
        if (rrfq_32 == null || !((Set)this.id_break[id_case[5]]).contains((Object)rrfq_32)) {
            return id_catch[3];
        }
        return id_catch[4];
    }

    private static void id_continue() {
        id_throws = new double[]{1.0, 100.0};
    }

    public void id_implements() throws IllegalStateException {
        this.id_class(!this.id_case() ? id_catch[8] : id_catch[9]);
    }

    private void id_new() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[rrNO.id_catch[14]] = id_catch[15];
            objectArray[rrNO.id_byte[1]] = id_catch[16];
        }
    }

    private static void id_package() {
        id_byte = new byte[]{3, 2};
    }

    private static void id_super() {
        boolean[] blArray = new boolean[17];
        blArray[0] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[14] = true;
        id_catch = blArray;
    }

    public void id_protected() {
    }

    public boolean id_private() throws IllegalStateException {
        this.id_new();
        if (!((Boolean)this.id_break[id_case[6]]).booleanValue()) {
            return id_catch[5];
        }
        rrfq_3 rrfq_32 = (rrfq_3)((Object)rrfp_3.id_class[id_case[7]]);
        if (rrfq_32 == null || !((Set)this.id_break[id_case[8]]).contains((Object)rrfq_32)) {
            return id_catch[6];
        }
        return id_catch[7];
    }

    private static void id_final() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[9] = 20;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 1;
        sArray[15] = 2;
        id_case = sArray;
    }
}

