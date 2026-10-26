/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rVL;
import celestial.rVi_1;
import celestial.rcH_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rgP_2;
import com.google.gson.annotations.SerializedName;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.AbstractList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfJ_2 {
    @SerializedName(value="displayName")
    private String id_break;
    private static boolean[] id_byte;
    @SerializedName(value="itemNBT")
    private String id_protected;
    private static byte[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;
    public Object[] id_class;
    @SerializedName(value="itemId")
    private int id_private;

    public rgP_2 id_byte() {
        if ((rgP_2)this.id_class[id_case[0]] == null) {
            rVi_1 rVi_12 = rgB_2.id_class(this.id_break);
            this.id_class[rrfJ_2.id_case[1]] = rVi_12;
        }
        return (rgP_2)this.id_class[id_case[2]];
    }

    public rrfJ_2() {
        this.id_private();
    }

    public rrfJ_2(String string, String string2, int n) {
        this.id_private();
        this.id_break = string;
        this.id_private = n;
        this.id_protected = string2;
    }

    static {
        rrfJ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x369D85711EF8FB77L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF5D12B5D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{21, -105, 8, -42, -35, -80, -23, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrfJ_2 id_class(rdn_3 rdn_32) {
        int n;
        Object object;
        String string = rgB_2.id_class(rdn_32.id_continue());
        rcd_3 rcd_32 = rdn_32.id_package();
        rcd_3 rcd_33 = rcd_32.id_int(id_catch[0]);
        rcZ_2 rcZ_22 = rcd_33.id_byte(id_catch[1]);
        if (rcZ_22 instanceof rcy_3) {
            object = (rcy_3)rcZ_22;
            for (n = id_byte[0]; n < ((rcy_3)object).size(); ++n) {
                rVi_1 rVi_12 = rgB_2.id_class(((rcy_3)object).id_implements(n));
                if (!rVi_12.getString().isEmpty()) continue;
                ((AbstractList)object).subList(n, ((rcy_3)object).size()).clear();
                break;
            }
        }
        object = rcd_32.toString();
        n = rVL.id_for.id_class(rdn_32.id_break());
        return new rrfJ_2(string, (String)object, n);
    }

    public rdn_3 id_class() {
        if ((rdn_3)this.id_class[id_case[6]] == null) {
            rdn_3 rdn_32 = new rdn_3(rVL.id_for.id_class(this.id_private));
            try {
                rdn_32.id_byte(rcH_2.id_class(this.id_protected));
            }
            catch (CommandSyntaxException commandSyntaxException) {
                commandSyntaxException.printStackTrace();
            }
            rdn_3 rdn_33 = rdn_32.id_implements();
            this.id_class[rrfJ_2.id_case[7]] = rdn_33;
            rdn_3 rdn_34 = ((rdn_3)this.id_class[id_case[8]]).id_implements();
            this.id_class[rrfJ_2.id_case[9]] = rdn_34;
        }
        if (((rdn_3)this.id_class[id_case[10]]).id_class()) {
            rdn_3 rdn_35 = ((rdn_3)this.id_class[id_case[11]]).id_implements();
            this.id_class[rrfJ_2.id_case[12]] = rdn_35;
        }
        return (rdn_3)this.id_class[id_case[13]];
    }

    public rcd_3 id_break() {
        if ((rcd_3)this.id_class[id_case[3]] == null) {
            try {
                rcd_3 rcd_32 = rcH_2.id_class(this.id_protected);
                this.id_class[rrfJ_2.id_case[4]] = rcd_32;
            }
            catch (CommandSyntaxException commandSyntaxException) {
                commandSyntaxException.printStackTrace();
            }
        }
        return (rcd_3)this.id_class[id_case[5]];
    }

    private static void id_throws() {
        id_byte = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrfJ_2.id_throws();
        rrfJ_2.id_case();
        rrfJ_2.id_catch();
        rrfJ_2.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[14];
        sArray[0] = 2;
        sArray[1] = 2;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 3;
        sArray[9] = 1;
        sArray[11] = 1;
        id_case = sArray;
    }

    private static void id_case() {
        id_catch = new String[]{new String("display"), new String("Lore")};
    }

    private static void id_protected() {
        id_throws = new byte[]{4};
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
        }
    }
}

