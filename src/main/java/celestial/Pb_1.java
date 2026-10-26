/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.SystemUtils
 */
package celestial;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.SystemUtils;

public class Pb_1 {
    private static String[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;
    private static short[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte(String string) {
        ProcessBuilder processBuilder = new ProcessBuilder(new String[id_throws[1]]);
        String[] stringArray = new String[id_byte[0]];
        stringArray[Pb_1.id_throws[2]] = id_break[5];
        stringArray[Pb_1.id_throws[3]] = id_break[6];
        stringArray[Pb_1.id_byte[1]] = "display notification \"" + string + "\" with title \"Celestial\"";
        processBuilder.command(stringArray);
        try {
            processBuilder.start();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        id_class = objectArray;
    }

    static {
        Pb_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, 14, 1, -7, -117, -48, -82, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(String string, boolean bl) {
        if (SystemUtils.IS_OS_WINDOWS) {
            Pb_1.id_break(string, bl);
        } else if (SystemUtils.IS_OS_MAC_OSX) {
            Pb_1.id_byte(string);
        } else if (SystemUtils.IS_OS_LINUX) {
            Pb_1.id_break(string);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBDAE50CC4A7DCE0BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB1B37E40;
    }

    private static void id_class() {
        id_break = new String[]{new String(""), new String("Celestial"), new String("Celestial"), new String("Celestial"), new String("SystemTray is not supported"), new String("osascript"), new String("-e"), new String("notify-send"), new String("-a"), new String("Celestial")};
    }

    private static void id_break() {
        id_protected = new short[6];
    }

    private static void id_break(String string, boolean bl) {
        if (SystemTray.isSupported()) {
            try {
                if ((TrayIcon)id_class[id_protected[0]] == null) {
                    SystemTray systemTray = SystemTray.getSystemTray();
                    Image image = Toolkit.getDefaultToolkit().createImage(id_break[0]);
                    TrayIcon trayIcon = new TrayIcon(image, id_break[1]);
                    Pb_1.id_class[Pb_1.id_protected[1]] = trayIcon;
                    ((TrayIcon)id_class[id_protected[2]]).setImageAutoSize(id_throws[0]);
                    ((TrayIcon)id_class[id_protected[3]]).setToolTip(id_break[2]);
                    systemTray.add((TrayIcon)id_class[id_protected[4]]);
                }
                ((TrayIcon)id_class[id_protected[5]]).displayMessage(id_break[3], string, bl ? TrayIcon.MessageType.ERROR : TrayIcon.MessageType.INFO);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else {
            System.out.println(id_break[4]);
        }
    }

    private static void id_break(String string) {
        ProcessBuilder processBuilder = new ProcessBuilder(new String[id_throws[4]]);
        String[] stringArray = new String[id_byte[2]];
        stringArray[Pb_1.id_throws[5]] = id_break[7];
        stringArray[Pb_1.id_throws[6]] = id_break[8];
        stringArray[Pb_1.id_byte[3]] = id_break[9];
        stringArray[Pb_1.id_byte[4]] = string;
        processBuilder.command(stringArray);
        try {
            processBuilder.start();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void id_throws() {
        id_byte = new byte[]{3, 2, 4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        Pb_1.id_protected();
        Pb_1.id_class();
        Pb_1.id_break();
        Pb_1.id_throws();
        Pb_1.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_throws = blArray;
    }
}

