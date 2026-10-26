/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
package celestial;

import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrjq_3
extends ChannelInboundHandlerAdapter {
    private static short[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_class;
    public Object[] id_break;

    public abstract String id_byte();

    public rrjq_3(UserConnection userConnection) {
        this.id_implements();
        UserConnection userConnection2 = userConnection;
        this.id_break[rrjq_3.id_byte[0]] = userConnection2;
    }

    static {
        rrjq_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D44E615;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE9714C44BAC26E9EL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, -88, 5, 62, -5, 73, -1, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public abstract String id_class();

    public abstract String id_break();

    public abstract String id_throws();

    private static /* synthetic */ void ntfClinit() {
        rrjq_3.id_private();
        rrjq_3.id_catch();
        rrjq_3.id_case();
        rrjq_3.id_finally();
        rrjq_3.id_extends();
    }

    private static void id_finally() {
        id_throws = new byte[]{2};
    }

    private static void id_catch() {
        id_protected = new String[]{new String("via-decoder"), new String("via-encoder")};
    }

    private static void id_extends() {
        Object[] objectArray = new Object[]{id_protected[0], id_protected[1]};
        id_class = objectArray;
    }

    private static void id_case() {
        id_byte = new short[2];
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[0]];
        }
    }

    public UserConnection id_protected() {
        return (UserConnection)this.id_break[id_byte[1]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_case = blArray;
    }

    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        super.userEventTriggered(channelHandlerContext, object);
    }

    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.handlerAdded(channelHandlerContext);
    }
}

