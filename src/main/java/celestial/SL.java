/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.SA;
import celestial.SC;
import celestial.Sv_1;
import celestial.Y;
import celestial.cd_3;
import celestial.cq_3;
import celestial.q_1;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rql_3;
import celestial.rrAM;
import celestial.rrAl_1;
import celestial.rrFK;
import celestial.rrLO;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SL
extends Pv_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_break;
    private static float[] id_throws;
    private static boolean[] id_case;

    public cd_3 id_byte() {
        this.id_package();
        return (cd_3)this.id_break[id_protected[33]];
    }

    private void id_int() {
        this.id_package();
        if ((UUID)this.id_break[id_protected[25]] != null) {
            ((cq_3)((Ps_1)this.id_class[SL.id_protected[26]]).id_throws().id_class[id_protected[27]]).id_extends().id_catch().remove((UUID)this.id_break[id_protected[28]]);
            Object var5_1 = null;
            this.id_break[SL.id_protected[29]] = var5_1;
            Object var6_2 = null;
            this.id_break[SL.id_protected[30]] = var6_2;
        }
    }

    public SL(C_class c_class) {
        super(c_class);
        this.id_package();
        SA sA = new SA(this);
        this.id_break[SL.id_protected[0]] = sA;
    }

    static {
        SL.ntfClinit();
    }

    private static void id_this() {
        float[] fArray = new float[4];
        fArray[0] = 20.0f;
        fArray[1] = 1.0f;
        fArray[3] = 1.0f;
        id_throws = fArray;
    }

    @Override
    public void id_class(rrAl_1 rrAl_12) {
        this.id_finally().ifPresent(sv_1 -> sv_1.id_class(rrAl_12));
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_finally().ifPresent(sv_1 -> {
            this.id_package();
            if (q_12.id_class() == (Y)((Object)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[37]])) && ((Boolean)this.id_break[id_protected[38]]).booleanValue()) {
                SL sL = this;
                Integer n = (Integer)sL.id_break[id_protected[39]] + id_case[9];
                sL.id_break[SL.id_protected[40]] = n;
                this.id_final();
            }
            sv_1.id_class(q_12);
        });
    }

    public void id_class(SC sC) {
        this.id_package();
        SC sC2 = sC;
        this.id_break[SL.id_protected[21]] = sC2;
        this.id_finally().ifPresent(sv_1 -> sv_1.id_class(sC));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1C0DE985;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_finally().ifPresent(sv_1 -> sv_1.id_class(rrAM2));
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_finally().ifPresent(sv_1 -> sv_1.id_class(rrFK2));
    }

    public void id_class() {
        this.id_package();
        if ((SC)this.id_break[id_protected[15]] == null) {
            return;
        }
        this.id_int();
        UUID uUID = UUID.randomUUID();
        this.id_break[SL.id_protected[16]] = uUID;
        Boolean bl = id_case[4];
        this.id_break[SL.id_protected[17]] = bl;
        this.id_final();
    }

    @Override
    public void id_class(rrLO rrLO2) {
        this.id_finally().ifPresent(sv_1 -> sv_1.id_class(rrLO2));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8EAB093E33E62CDEL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, 44, 34, 79, 18, -26, 15, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break() {
        this.id_package();
        Object var5_1 = null;
        this.id_break[SL.id_protected[22]] = var5_1;
        this.id_int();
        Integer n = id_case[7];
        this.id_break[SL.id_protected[23]] = n;
        Boolean bl = id_case[8];
        this.id_break[SL.id_protected[24]] = bl;
    }

    public boolean id_throws() {
        this.id_package();
        return (SC)this.id_break[id_protected[19]] != null && !rql_3.id_break(((SC)this.id_break[id_protected[20]]).id_byte()) ? id_case[5] : id_case[6];
    }

    private static /* synthetic */ void ntfClinit() {
        SL.id_new();
        SL.id_continue();
        SL.id_this();
        SL.id_extends();
    }

    private Optional<Sv_1> id_finally() {
        this.id_package();
        if (!this.id_throws()) {
            return Optional.empty();
        }
        return ((SA)this.id_break[id_protected[18]]).id_class();
    }

    public SC id_catch() {
        this.id_package();
        return (SC)this.id_break[id_protected[31]];
    }

    private static void id_extends() {
        id_byte = new byte[]{6, 4, 5};
    }

    public boolean id_case() {
        this.id_package();
        return (Boolean)this.id_break[id_protected[36]];
    }

    private static void id_continue() {
        short[] sArray = new short[41];
        sArray[0] = 1;
        sArray[2] = 3;
        sArray[4] = 4;
        sArray[5] = 4;
        sArray[6] = 4;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 1;
        sArray[12] = 19;
        sArray[13] = 3;
        sArray[14] = 2;
        sArray[16] = 3;
        sArray[17] = 5;
        sArray[18] = 1;
        sArray[23] = 4;
        sArray[24] = 5;
        sArray[25] = 3;
        sArray[26] = 1;
        sArray[27] = 19;
        sArray[28] = 3;
        sArray[29] = 3;
        sArray[30] = 2;
        sArray[32] = 1;
        sArray[33] = 2;
        sArray[34] = 3;
        sArray[35] = 4;
        sArray[36] = 5;
        sArray[38] = 5;
        sArray[39] = 4;
        sArray[40] = 4;
        id_protected = sArray;
    }

    public int id_implements() {
        this.id_package();
        return (Integer)this.id_break[id_protected[35]];
    }

    private static void id_new() {
        boolean[] blArray = new boolean[12];
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[9] = true;
        id_case = blArray;
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[SL.id_byte[1]] = id_case[10];
            objectArray[SL.id_byte[2]] = id_case[11];
        }
    }

    private boolean id_super() {
        return id_case[3];
    }

    public SA id_protected() {
        this.id_package();
        return (SA)this.id_break[id_protected[32]];
    }

    public UUID id_private() {
        this.id_package();
        return (UUID)this.id_break[id_protected[34]];
    }

    private void id_final() {
        this.id_package();
        if ((SC)this.id_break[id_protected[1]] == null || (UUID)this.id_break[id_protected[2]] == null) {
            return;
        }
        int n = ((SC)this.id_break[id_protected[3]]).id_break();
        if (n <= 0) {
            return;
        }
        if ((Integer)this.id_break[id_protected[4]] >= n) {
            this.id_int();
            return;
        }
        int n2 = n - (Integer)this.id_break[id_protected[5]];
        float f = (float)n2 / id_throws[0];
        float f2 = id_throws[1] - rfU_2.id_class((float)((Integer)this.id_break[id_protected[6]]).intValue() / (float)n, id_throws[2], id_throws[3]);
        if ((cd_3)this.id_break[id_protected[7]] == null || this.id_super()) {
            rgN_2 rgN_22 = new rgN_2("\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434 \u0447\u0435\u0440\u0435\u0437 " + rgF_2.RED + rql_3.id_class(f) + " \u0441\u0435\u043a.");
            cd_3 cd_32 = new cd_3((UUID)this.id_break[id_protected[8]], rgN_22, rRb_1.WHITE, rRM.PROGRESS, f2, id_case[0], id_case[1], id_case[2]);
            this.id_break[SL.id_protected[9]] = cd_32;
        } else {
            ((cd_3)this.id_break[id_protected[10]]).id_class(f2);
        }
        ((cq_3)((Ps_1)this.id_class[SL.id_protected[11]]).id_throws().id_class[id_protected[12]]).id_extends().id_catch().put((UUID)this.id_break[id_protected[13]], (cd_3)this.id_break[id_protected[14]]);
    }
}

