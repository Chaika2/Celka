/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.PlatformTask
 *  com.viaversion.viaversion.api.scheduler.Task
 *  com.viaversion.viaversion.api.scheduler.TaskStatus
 */
package celestial;

import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.scheduler.Task;
import com.viaversion.viaversion.api.scheduler.TaskStatus;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjK_2
implements PlatformTask<Task> {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rrjK_2(Task task) {
        this.id_byte();
        Task task2 = task;
        this.id_class[rrjK_2.id_break[0]] = task2;
    }

    static {
        rrjK_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{7, -110, -98, -83, -112, 59, -116, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x440E96DD;
    }

    public Task id_class() {
        return (Task)this.id_class[id_break[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2B6864880A3C76F5L;
    }

    public void cancel() {
        ((Task)this.id_class[id_break[2]]).cancel();
    }

    public /* synthetic */ Object getObject() {
        return this.id_class();
    }

    public TaskStatus id_break() {
        return this.id_class().status();
    }

    private static void id_throws() {
        id_break = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrjK_2.id_protected();
        rrjK_2.id_throws();
    }

    private static void id_protected() {
        id_byte = new boolean[]{true};
    }
}

