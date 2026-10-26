/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.bl_3;
import celestial.module.util.CreeperFarm;
import celestial.rU_2;
import celestial.rY_2;
import celestial.rrQX;
import celestial.rrwj_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwD_2
implements rrwj_3 {
    private static short[] id_class;
    private static String[] id_break;

    private rU_2 id_byte(JsonObject jsonObject) {
        return new rU_2(jsonObject.get(id_break[10]).getAsInt(), jsonObject.get(id_break[11]).getAsInt(), jsonObject.get(id_break[12]).getAsInt());
    }

    static {
        rrwD_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5863516;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xADBCBAAC646624C7L;
    }

    private static void id_class() {
        id_class = new short[2];
    }

    private JsonObject id_class(rU_2 rU_22) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(id_break[7], (Number)rU_22.b_());
        jsonObject.addProperty(id_break[8], (Number)rU_22.c_());
        jsonObject.addProperty(id_break[9], (Number)rU_22.d_());
        return jsonObject;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        if (!jsonObject.has(id_break[3])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_break[4]);
        rU_2 rU_22 = this.id_byte(jsonObject2.getAsJsonObject(id_break[5]));
        rU_2 rU_23 = this.id_byte(jsonObject2.getAsJsonObject(id_break[6]));
        CreeperFarm creeperFarm = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[1]]).id_private().i();
        bl_3 bl_32 = new bl_3(rU_22, rU_23);
        creeperFarm.id_class(bl_32);
        creeperFarm.id_continue().add(bl_32);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -27, -12, 94, 84, 62, -8, -83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new String[]{new String("pos1"), new String("pos2"), new String("selection"), new String("selection"), new String("selection"), new String("pos1"), new String("pos2"), new String("x"), new String("y"), new String("z"), new String("x"), new String("y"), new String("z")};
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        rY_2 rY_22 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[0]]).id_private().i().id_new();
        if (rY_22 == null) {
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add(id_break[0], (JsonElement)this.id_class(rY_22.id_byte()));
        jsonObject2.add(id_break[1], (JsonElement)this.id_class(rY_22.id_case()));
        jsonObject.add(id_break[2], (JsonElement)jsonObject2);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwD_2.id_break();
        rrwD_2.id_class();
    }
}

