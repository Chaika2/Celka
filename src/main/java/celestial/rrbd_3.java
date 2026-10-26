/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.KY;
import celestial.Ko_1;
import celestial.Qw_1;
import celestial.rrJz_1;
import celestial.rrbb_3;
import celestial.rrbk_3;
import celestial.rrdZ;
import java.util.HashMap;

public class rrbd_3 {
    public static void id_class(Ko_1 ko_1) {
        ko_1.id_class("OptiFine Version", rrbb_3.id_class());
        ko_1.id_class("OptiFine Build", rrbb_3.id_throws());
        if (rrbb_3.rE() != null) {
            ko_1.id_class("Render Distance Chunks", "" + rrbb_3.rx());
            ko_1.id_class("Mipmaps", "" + rrbb_3.id_int());
            ko_1.id_class("Anisotropic Filtering", "" + rrbb_3.y());
            ko_1.id_class("Antialiasing", "" + rrbb_3.q());
            ko_1.id_class("Multitexture", "" + rrbb_3.w());
        }
        ko_1.id_class("Shaders", rrdZ.y());
        ko_1.id_class("OpenGlVersion", rrbb_3.id_case);
        ko_1.id_class("OpenGlRenderer", rrbb_3.id_catch);
        ko_1.id_class("OpenGlVendor", rrbb_3.id_private);
        ko_1.id_class("CpuCount", "" + rrbb_3.rG());
    }

    private static String id_class(KY kY) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OptiFineVersion: " + rrbb_3.id_class() + "\n");
        stringBuffer.append("Summary: " + rrbd_3.id_break(kY) + "\n");
        stringBuffer.append("\n");
        stringBuffer.append(kY.id_protected());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static void id_class(KY kY, Ko_1 ko_1) {
        try {
            Throwable throwable = kY.id_break();
            if (throwable == null) {
                return;
            }
            if (throwable.getClass().getName().contains(".fml.client.SplashProgress")) {
                return;
            }
            if (throwable.getClass() == Throwable.class) {
                return;
            }
            rrbd_3.id_class(ko_1);
            Qw_1 qw_1 = rrbb_3.rE();
            if (qw_1 == null) {
                return;
            }
            if (!qw_1.r) {
                return;
            }
            String string = "http://optifine.net/crashReport";
            String string2 = rrbd_3.id_class(kY);
            byte[] byArray = string2.getBytes("ASCII");
            rrbk_3 rrbk_32 = new rrbk_3();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("OF-Version", rrbb_3.id_class());
            hashMap.put("OF-Summary", rrbd_3.id_break(kY));
            rrJz_1 rrJz_12 = new rrJz_1(string, hashMap, byArray, rrbk_32);
            rrJz_12.setPriority(10);
            rrJz_12.start();
            Thread.sleep(1000L);
        }
        catch (Exception exception) {
            rrbb_3.id_byte(exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    private static String id_break(KY kY) {
        Throwable throwable = kY.id_break();
        if (throwable == null) {
            return "Unknown";
        }
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        String string = "unknown";
        if (stackTraceElementArray.length > 0) {
            string = stackTraceElementArray[0].toString().trim();
        }
        return throwable.getClass().getName() + ": " + throwable.getMessage() + " (" + kY.id_class() + ") [" + string + "]";
    }
}

