/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rrjA_2;
import com.mojang.blaze3d.systems.RenderSystem;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjH_2
extends LZ {
    private static short[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;
    public Object[] id_class;
    private static byte[] id_private;
    private static float[] id_implements;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3EE7D8CC;
    }

    public rrjH_2(List<ProtocolVersion> list, int n, int n2, int n3, int n4) {
        super(n, n2, Math.max(n3, id_private[0]), n4, new rgN_2(id_catch[0]));
        ArrayList<ProtocolVersion> arrayList;
        this.id_extends();
        this.id_class[rrjH_2.id_throws[0]] = arrayList = new ArrayList<ProtocolVersion>(list);
        Collections.reverse((List)this.id_class[id_throws[1]]);
        ProtocolVersion protocolVersion = ProtocolVersion.getProtocol((int)rrjA_2.id_protected().id_throws().getVersion());
        int n5 = ((List)this.id_class[id_throws[2]]).indexOf(protocolVersion);
        if (n5 == id_private[1]) {
            n5 = id_case[0];
        }
        Float f = Float.valueOf((float)n5 / (float)(((List)this.id_class[id_throws[3]]).size() - id_case[1]));
        this.id_class[rrjH_2.id_throws[4]] = f;
        this.id_break(new rgN_2(((ProtocolVersion)((List)this.id_class[id_throws[5]]).get(n5)).getName()));
    }

    static {
        rrjH_2.ntfClinit();
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        this.id_extends();
        Boolean bl = id_case[9];
        this.id_class[rrjH_2.id_throws[15]] = bl;
        return super.id_class(d, d2, n);
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        this.id_extends();
        if (this.id_new && ((Boolean)this.id_class[id_throws[8]]).booleanValue()) {
            Float f = Float.valueOf(rfU_2.id_class((float)(d - (double)(this.id_volatile + id_private[11])) / (float)(this.id_extends - id_private[12]), id_implements[4], id_implements[5]));
            this.id_class[rrjH_2.id_throws[9]] = f;
            this.id_final();
        }
        return super.id_class(d, d2, n, d3, d4);
    }

    @Override
    public void id_class(Ml_1 ml_1, QY qY, int n, int n2) {
        this.id_extends();
        qY.A().id_class(id_finally);
        RenderSystem.color4f(id_implements[0], id_implements[1], id_implements[2], id_implements[3]);
        int n3 = (this.B_() ? id_private[2] : id_case[2]) * id_private[3];
        int n4 = this.id_volatile + (int)(((Float)this.id_class[id_throws[6]]).floatValue() * (float)(this.id_extends - id_private[4]));
        int n5 = this.id_final;
        int n6 = id_private[5] + n3;
        this.id_break(ml_1, n4, n5, id_case[3], n6, id_private[6], id_private[7]);
        this.id_break(ml_1, n4 + id_private[8], n5, id_throws[7], n6, id_private[9], id_private[10]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x935E829E8B57A255L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{115, 12, -15, -33, -68, 3, -93, -86}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_extends();
        if (super.id_break(d, d2, n)) {
            Float f = Float.valueOf(rfU_2.id_class((float)(d - (double)(this.id_volatile + id_private[13])) / (float)(this.id_extends - id_private[14]), id_implements[6], id_implements[7]));
            this.id_class[rrjH_2.id_throws[10]] = f;
            this.id_final();
            Boolean bl = id_case[5];
            this.id_class[rrjH_2.id_throws[11]] = bl;
            return id_case[6];
        }
        return id_case[7];
    }

    private static /* synthetic */ void ntfClinit() {
        rrjH_2.id_private();
        rrjH_2.id_implements();
        rrjH_2.id_native();
        rrjH_2.id_catch();
        rrjH_2.id_volatile();
    }

    private static void id_catch() {
        float[] fArray = new float[9];
        fArray[0] = 1.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        fArray[3] = 1.0f;
        fArray[5] = 1.0f;
        fArray[7] = 1.0f;
        id_implements = fArray;
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_private[15]];
            objectArray[rrjH_2.id_case[10]] = Float.valueOf(id_implements[8]);
            objectArray[rrjH_2.id_private[16]] = id_case[11];
        }
    }

    private static void id_implements() {
        id_catch = new String[]{new String("")};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_case = blArray;
    }

    private void id_final() {
        this.id_extends();
        int n = (int)(((Float)this.id_class[id_throws[12]]).floatValue() * (float)(((List)this.id_class[id_throws[13]]).size() - id_case[8]));
        ProtocolVersion protocolVersion = (ProtocolVersion)((List)this.id_class[id_throws[14]]).get(n);
        this.id_break(new rgN_2(protocolVersion.getName()));
        rrjA_2.id_protected().id_class(protocolVersion);
    }

    private static void id_volatile() {
        id_private = new byte[]{110, -1, 2, 20, 8, 46, 4, 20, 4, 4, 20, 4, 8, 4, 8, 3, 2};
    }

    private static void id_native() {
        short[] sArray = new short[16];
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 196;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[15] = 2;
        id_throws = sArray;
    }

    @Override
    public int a_(boolean bl) {
        return id_case[4];
    }
}

