/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package celestial;

import celestial.rrjA_2;
import celestial.rrwU_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIM
extends rrwU_2 {
    private static String[] id_break;

    private static void id_byte() {
        id_break = new String[]{new String("viaversion"), new String("version"), new String("viaVersion"), new String("viaVersion"), new String("viaVersion"), new String("version"), new String("version")};
    }

    public rrIM() {
        super(id_break[0]);
    }

    static {
        rrIM.id_byte();
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_break[3])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_break[4]);
        if (jsonObject2.has(id_break[5])) {
            int n = jsonObject2.get(id_break[6]).getAsInt();
            ProtocolVersion protocolVersion = ProtocolVersion.getProtocol((int)n);
            rrjA_2.id_protected().id_class(protocolVersion);
            System.out.println("ViaVersionConfig: Loaded ViaVersion version " + protocolVersion.getName());
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6C4D2BC;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA18512A541D2B29CL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-9, -34, 64, 23, 90, -48, -20, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        rrjA_2 rrjA_22 = rrjA_2.id_protected();
        if (rrjA_22 == null) {
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(id_break[1], (Number)rrjA_22.id_throws().getVersion());
        jsonObject.add(id_break[2], (JsonElement)jsonObject2);
    }
}

