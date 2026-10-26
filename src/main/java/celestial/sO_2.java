/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FilenameUtils
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.E;
import celestial.Ps_1;
import celestial.S;
import celestial.k_1;
import celestial.rU_2;
import celestial.rja_3;
import celestial.x_1;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class sO_2
extends C_try {
    private static String[] id_throws;
    private static boolean[] id_case;
    private static short[] id_catch;
    private static byte[] id_private;
    public static Object[] id_break;

    public sO_2(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[sO_2.id_case[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        sO_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x18D84DBB;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        rU_2 rU_22;
        File file = ((File)c_static.id_break((E)E.staticFieldsa68f70fa3b203574ab28df4fae9f18d2[id_catch[0]], (File)id_break[id_catch[1]])).getAbsoluteFile();
        if (FilenameUtils.getExtension((String)file.getAbsolutePath()).isEmpty()) {
            file = new File(file.getAbsolutePath() + "." + (String)C_class.id_instanceof().PZ.id_class[id_catch[2]]);
        }
        rU_2 rU_23 = ((Ps_1)this.id_class[id_catch[3]]).id_volatile();
        if (c_static.id_final()) {
            c_static.id_class(id_private[0]);
            rU_22 = (rU_2)c_static.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_catch[4]], rU_23);
        } else {
            c_static.id_class(id_case[2]);
            rU_22 = rU_23;
        }
        boolean bl = ((C_case)this.id_class[id_catch[5]]).r().id_class(file.getName(), file, (rja_3)rU_22);
        if (!bl) {
            throw new k_1(id_throws[1]);
        }
        Object[] objectArray = new Object[id_case[3]];
        objectArray[sO_2.id_case[4]] = rU_22;
        this.id_case(String.format(id_throws[2], objectArray));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC442576FE0D96475L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{117, -68, -5, -96, -69, -47, 58, 126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            return E.id_class(c_static, (File)id_break[id_catch[6]]);
        }
        if (c_static.id_break(id_private[1])) {
            c_static.id_throws();
            return c_static.id_class((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_catch[7]]);
        }
        return Stream.empty();
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new File("C:\\Celestial\\Beta 1.16.5\\schematics")};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sO_2.id_extends();
        sO_2.id_native();
        sO_2.id_finally();
        sO_2.id_protected();
        sO_2.id_throws();
    }

    private static void id_finally() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        id_catch = sArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_private[2]];
        stringArray[sO_2.id_case[5]] = id_throws[4];
        stringArray[sO_2.id_case[6]] = id_throws[5];
        stringArray[sO_2.id_private[3]] = id_throws[6];
        stringArray[sO_2.id_private[4]] = id_throws[7];
        stringArray[sO_2.id_private[5]] = id_throws[8];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_case = blArray;
    }

    @Override
    public boolean id_case() {
        return id_case[7];
    }

    @Override
    public String id_implements() {
        return id_throws[3];
    }

    private static void id_protected() {
        id_private = new byte[]{3, 2, 5, 2, 3, 4, 24};
    }

    private static void id_native() {
        id_throws = new String[]{new String("build"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u0441\u0445\u0435\u043c\u0443. \u0423\u0431\u0435\u0434\u0438\u0442\u0435\u0441\u044c, \u0447\u0442\u043e \u0432\u044b \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0435 \u043f\u043e\u043b\u043d\u043e\u0435 \u0438\u043c\u044f \u0444\u0430\u0439\u043b\u0430, \u0432\u043a\u043b\u044e\u0447\u0430\u044f \u0440\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u0435 (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, blah.schematic)"), new String("\u0423\u0441\u043f\u0435\u0448\u043d\u043e \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u0430 \u0441\u0445\u0435\u043c\u0430 \u0434\u043b\u044f \u0437\u0434\u0430\u043d\u0438\u044f\n\u041f\u0440\u043e\u0438\u0441\u0445\u043e\u0436\u0434\u0435\u043d\u0438\u0435: %s"), new String("\u041f\u043e\u0441\u0442\u0440\u043e\u0439\u0442\u0435 \u0441\u0445\u0435\u043c\u0443"), new String("\u041f\u043e\u0441\u0442\u0440\u043e\u0435\u043d\u0438\u0435 \u0441\u0445\u0435\u043c\u044b \u0438\u0437 \u0444\u0430\u0439\u043b\u0430"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> build <\u0438\u043c\u044f \u0444\u0430\u0439\u043b\u0430> - \u0417\u0430\u0433\u0440\u0443\u0436\u0430\u0435\u0442 \u0438 \u0441\u0442\u0440\u043e\u0438\u0442 '<\u0438\u043c\u044f \u0444\u0430\u0439\u043b\u0430>.schematic'"), new String("> build <\u0438\u043c\u044f \u0444\u0430\u0439\u043b\u0430> <x> <y> <z> - \u0412\u044b\u0431\u043e\u0440\u043e\u0447\u043d\u0430\u044f \u043f\u043e\u0437\u0438\u0446\u0438\u044f"), new String("schematics")};
    }
}

