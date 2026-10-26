/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.bridge.Bridge
 *  com.mojang.bridge.game.GameSession
 *  com.mojang.bridge.game.GameVersion
 *  com.mojang.bridge.game.Language
 *  com.mojang.bridge.game.PerformanceMetrics
 *  com.mojang.bridge.game.RunningGame
 *  com.mojang.bridge.launcher.Launcher
 *  com.mojang.bridge.launcher.SessionEventListener
 */
package celestial;

import celestial.Aq_1;
import celestial.QC;
import celestial.QY;
import celestial.Qe_1;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rpN_2;
import celestial.rqu_3;
import com.mojang.bridge.Bridge;
import com.mojang.bridge.game.GameSession;
import com.mojang.bridge.game.GameVersion;
import com.mojang.bridge.game.Language;
import com.mojang.bridge.game.PerformanceMetrics;
import com.mojang.bridge.game.RunningGame;
import com.mojang.bridge.launcher.Launcher;
import com.mojang.bridge.launcher.SessionEventListener;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QU
implements RunningGame {
    private static long[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        id_protected = new boolean[1];
    }

    public QU(QY qY) {
        this.id_throws();
        SessionEventListener sessionEventListener = SessionEventListener.NONE;
        this.id_class[QU.id_byte[0]] = sessionEventListener;
        QY qY2 = qY;
        this.id_class[QU.id_byte[1]] = qY2;
        Launcher launcher = Bridge.getLauncher();
        this.id_class[QU.id_byte[2]] = launcher;
        if ((Launcher)this.id_class[id_byte[3]] != null) {
            ((Launcher)this.id_class[id_byte[4]]).registerGame((RunningGame)this);
        }
    }

    static {
        QU.ntfClinit();
    }

    public void id_class() {
        ((SessionEventListener)this.id_class[id_byte[16]]).onLeaveGameSession(this.getCurrentSession());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{68, 117, 77, -32, -98, -90, -17, 92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE4910E55AA283FF3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBBFD99B;
    }

    public GameVersion getVersion() {
        return rqu_3.id_class();
    }

    public void id_break() {
        ((SessionEventListener)this.id_class[id_byte[15]]).onStartGameSession(this.getCurrentSession());
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        QU.id_byte();
        QU.id_case();
        QU.id_catch();
        QU.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[17];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[7] = 56;
        sArray[9] = 57;
        sArray[11] = 57;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[16] = 2;
        id_byte = sArray;
    }

    private static void id_case() {
        long[] lArray = new long[3];
        lArray[0] = Integer.MAX_VALUE;
        lArray[1] = Integer.MIN_VALUE;
        id_break = lArray;
    }

    private static void id_protected() {
        id_throws = new byte[]{3};
    }

    public void setSessionEventListener(SessionEventListener sessionEventListener) {
        SessionEventListener sessionEventListener2 = sessionEventListener;
        this.id_class[QU.id_byte[14]] = sessionEventListener2;
    }

    public Language getSelectedLanguage() {
        return ((QY)this.id_class[id_byte[5]]).u().id_break();
    }

    public PerformanceMetrics getPerformanceMetrics() {
        rpN_2 rpN_22 = ((QY)this.id_class[id_byte[13]]).k();
        long l = id_break[0];
        long l2 = id_break[1];
        long l3 = id_break[2];
        long[] lArray = rpN_22.id_byte();
        int n = lArray.length;
        for (int i = id_protected[0]; i < n; ++i) {
            long l4 = lArray[i];
            l = Math.min(l, l4);
            l2 = Math.max(l2, l4);
            l3 += l4;
        }
        return new Qe_1((int)l, (int)l2, (int)(l3 / (long)rpN_22.id_byte().length), rpN_22.id_byte().length);
    }

    public GameSession getCurrentSession() {
        gm_3 gm_32 = (gm_3)((QY)this.id_class[QU.id_byte[6]]).id_class[id_byte[7]];
        return gm_32 == null ? null : new QC(gm_32, (cb_3)((QY)this.id_class[QU.id_byte[8]]).id_class[id_byte[9]], (Aq_1)((cb_3)((QY)this.id_class[QU.id_byte[10]]).id_class[QU.id_byte[11]]).id_break[id_byte[12]]);
    }
}

