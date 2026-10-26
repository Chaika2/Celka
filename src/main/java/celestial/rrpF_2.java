/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.objecthunter.exp4j.Expression
 *  net.objecthunter.exp4j.ExpressionBuilder
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.rrAv_1;
import celestial.rrTF;
import celestial.rrjb_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class rrpF_2
extends rrTF<FtHelper> {
    private static boolean[] id_class;
    private static String[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_protected = new short[]{9, 12, 13, 15, 57};
    }

    public rrpF_2(FtHelper ftHelper) {
        super(ftHelper);
    }

    static {
        rrpF_2.ntfClinit();
    }

    @EventTarget
    public void id_class(rrAv_1 rrAv_12) {
        String string;
        if (!((FtHelper)this.id_continue()).id_new()) {
            return;
        }
        String string2 = rrAv_12.id_class();
        Matcher matcher = ((Pattern)rrjb_3.id_class[id_protected[0]]).matcher(string2);
        Matcher matcher2 = ((Pattern)rrjb_3.id_class[id_protected[1]]).matcher(string2);
        Matcher matcher3 = ((Pattern)rrjb_3.id_class[id_protected[2]]).matcher(string2);
        Matcher matcher4 = ((Pattern)rrjb_3.id_class[id_protected[3]]).matcher(string2);
        Matcher matcher5 = null;
        byte by = id_byte[0];
        if (matcher.find()) {
            matcher5 = matcher;
        } else if (matcher2.find()) {
            matcher5 = matcher2;
        } else if (matcher4.find()) {
            matcher5 = matcher4;
            by = id_class[0];
        } else if (matcher3.find()) {
            matcher5 = matcher3;
            by = id_byte[1];
        }
        if (matcher5 == null) {
            return;
        }
        try {
            String string3 = matcher5.group(by);
            string = matcher5.group(id_class[1]).replace(string3, this.id_class(string3));
        }
        catch (Exception exception) {
            string = null;
            exception.printStackTrace();
        }
        if (string != null) {
            ((cb_3)rrpF_2.id_import.id_class[id_protected[4]]).id_case(string);
            rrAv_12.id_class(id_class[2]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF16540E;
    }

    public String id_class(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalStateException(id_break[0]);
        }
        try {
            Expression expression = new ExpressionBuilder(string).build();
            long l = (long)expression.evaluate();
            return String.valueOf(l);
        }
        catch (Exception exception) {
            throw new IllegalStateException(id_break[1]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA0E41A2C2B692C56L;
    }

    private static void id_class() {
        id_break = new String[]{new String("\u041f\u0443\u0441\u0442\u043e\u0435 \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u0435"), new String("\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0432\u044b\u0447\u0438\u0441\u043b\u0435\u043d\u0438\u0438")};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_class = blArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, 55, -46, 93, 94, -115, -102, 90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrpF_2.id_break();
        rrpF_2.id_class();
        rrpF_2.id_byte();
        rrpF_2.id_protected();
    }

    private static void id_protected() {
        id_byte = new byte[]{2, 3};
    }
}

