/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.C_case;
import celestial.C_short;
import celestial.C_static;
import celestial.C_throw;
import celestial.C_try;
import celestial.Ps_1;
import celestial.St_1;
import celestial.rU_2;
import celestial.rVL;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.v_1;
import celestial.x_1;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sy_3
extends C_try {
    private static boolean[] id_break;
    private static short[] id_throws;
    private static String[] id_case;
    private static byte[] id_catch;
    private static int[] id_private;

    public sy_3(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[sy_3.id_break[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        sy_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_private(id_break[2]);
        ArrayList<xd_3> arrayList = new ArrayList<xd_3>();
        while (c_static.id_final()) {
            arrayList.add((xd_3)c_static.id_break((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[id_throws[0]]));
        }
        rU_2 rU_22 = ((Ps_1)this.id_class[id_throws[1]]).id_volatile();
        rVe_1[] rVe_1Array = (rVe_1[])arrayList.stream().flatMap(xd_32 -> ((Ps_1)this.id_class[id_throws[6]]).id_package().id_break().id_class(rVL.id_strictfp.id_break((xd_3)xd_32).id_break(), id_private[0], (Integer)rU_22.id_break[id_throws[7]], (Integer)rU_22.id_break[id_throws[8]], id_catch[7]).stream()).map(rU_2::new).map(this::id_class).toArray(rVe_1[]::new);
        if (rVe_1Array.length > 0) {
            Arrays.asList(rVe_1Array).forEach(rVi_12 -> {
                rVi_1[] rVi_1Array = new rVi_1[id_break[9]];
                rVi_1Array[sy_3.id_break[10]] = rVi_12;
                this.id_class(rVi_1Array);
            });
        } else {
            this.id_case(id_case[1]);
        }
    }

    private rgP_2 id_class(rU_2 rU_22) {
        Object[] objectArray = new Object[id_catch[0]];
        objectArray[sy_3.id_break[3]] = (int)((Integer)rU_22.id_break[id_throws[2]]);
        objectArray[sy_3.id_break[4]] = (int)((Integer)rU_22.id_break[id_throws[3]]);
        objectArray[sy_3.id_catch[1]] = (int)((Integer)rU_22.id_break[id_throws[4]]);
        String string = String.format(id_case[2], objectArray);
        Object[] objectArray2 = new Object[id_catch[2]];
        objectArray2[sy_3.id_break[5]] = C_throw.id_class;
        objectArray2[sy_3.id_break[6]] = string;
        String string2 = String.format(id_case[3], objectArray2);
        rgN_2 rgN_22 = new rgN_2(rU_22.toString());
        rgN_2 rgN_23 = new rgN_2(id_case[4]);
        rgN_22.id_class(rgN_22.id_class().id_class(rgF_2.GRAY).id_class(string).id_class(new rgl_3(rgH_2.RUN_COMMAND, string2)).id_class(new rgy_3(rgp_3.id_class, rgN_23)));
        return rgN_22;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3F34EFBA5C3D7E9CL;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return new v_1().id_break(((ImmutableSet)St_1.id_class[id_throws[5]]).stream().map(rVL.id_strictfp::id_break).map(Object::toString)).id_break(c_static.id_extends()).id_break().id_protected();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -71, 92, -117, 105, -62, -89, -95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC8CF98CB;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sy_3.id_throws();
        sy_3.id_protected();
        sy_3.id_extends();
        sy_3.id_native();
        sy_3.id_finally();
    }

    private static void id_finally() {
        id_private = new int[]{Integer.MAX_VALUE};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[3]];
        stringArray[sy_3.id_break[7]] = id_case[6];
        stringArray[sy_3.id_break[8]] = id_case[7];
        stringArray[sy_3.id_catch[4]] = id_case[8];
        stringArray[sy_3.id_catch[5]] = id_case[9];
        stringArray[sy_3.id_catch[6]] = id_case[10];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[8] = 1;
        id_throws = sArray;
    }

    @Override
    public String id_implements() {
        return id_case[5];
    }

    private static void id_protected() {
        id_case = new String[]{new String("find"), new String("No positions known, are you sure the blocks are cached?"), new String("%s %s %s"), new String("%sgoal %s"), new String("Click to set goal to this position"), new String("Find positions of a certain block"), new String("The find command searches through Baritone's cache and attempts to find the location of the block."), new String("Tab completion will suggest only cached blocks and uncached blocks can not be found."), new String(""), new String("Usage:"), new String("> find <block> [...] - Try finding the listed blocks")};
    }

    private static void id_native() {
        id_catch = new byte[]{3, 2, 2, 5, 2, 3, 4, 4};
    }
}

