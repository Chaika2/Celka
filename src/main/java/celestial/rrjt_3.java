/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelEncoderException
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
package celestial;

import celestial.rrVr;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelEncoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import offline.launcher.ViaProtocolDiagnostics;

@ChannelHandler.Sharable
public class rrjt_3
extends MessageToMessageEncoder<ByteBuf> {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static String[] id_throws;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    public rrjt_3(UserConnection userConnection) {
        this.id_break();
        UserConnection userConnection2 = userConnection;
        this.id_class[rrjt_3.id_byte[0]] = userConnection2;
    }

    static {
        rrjt_3.ntfClinit();
    }

    public /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object, list);
    }

    private boolean id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        if (((Boolean)this.id_class[id_byte[4]]).booleanValue()) {
            return id_protected[0];
        }
        int n = channelHandlerContext.pipeline().names().indexOf(id_throws[0]);
        if (n == id_break[0]) {
            return id_protected[1];
        }
        Boolean bl = id_protected[2];
        this.id_class[rrjt_3.id_byte[5]] = bl;
        if (n > channelHandlerContext.pipeline().names().indexOf(id_throws[1])) {
            rrVr.id_class(channelHandlerContext, byteBuf);
            ChannelHandler channelHandler = channelHandlerContext.pipeline().get(id_throws[2]);
            ChannelHandler channelHandler2 = channelHandlerContext.pipeline().get(id_throws[3]);
            channelHandlerContext.pipeline().remove(channelHandler);
            channelHandlerContext.pipeline().remove(channelHandler2);
            channelHandlerContext.pipeline().addAfter(id_throws[4], id_throws[5], channelHandler);
            channelHandlerContext.pipeline().addAfter(id_throws[6], id_throws[7], channelHandler2);
            return id_protected[3];
        }
        return id_protected[4];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD297578368A3CDAFL;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (!((UserConnection)this.id_class[id_byte[1]]).checkOutgoingPacket()) {
            throw CancelEncoderException.generate(null);
        }
        if (!((UserConnection)this.id_class[id_byte[2]]).shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        try {
            boolean bl = this.id_class(channelHandlerContext, byteBuf2);
            UserConnection userConnection = (UserConnection)this.id_class[id_byte[3]];
            ViaProtocolDiagnostics.traceOutgoingBefore(userConnection, byteBuf2);
            userConnection.transformOutgoing(byteBuf2, CancelEncoderException::generate);
            ViaProtocolDiagnostics.traceOutgoingAfter(byteBuf2);
            if (bl) {
                rrVr.id_break(channelHandlerContext, byteBuf2);
            }
            list.add(byteBuf2.retain());
        }
        finally {
            byteBuf2.release();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xED382D8C;
    }

    private static void id_class() {
        id_break = new byte[]{-1, 2};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-12, -128, -41, -35, 93, -9, -34, 34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
            objectArray[rrjt_3.id_protected[5]] = id_protected[6];
        }
    }

    private static void id_throws() {
        id_throws = new String[]{new String("compress"), new String("via-encoder"), new String("via-encoder"), new String("via-decoder"), new String("compress"), new String("via-encoder"), new String("decompress"), new String("via-decoder")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjt_3.id_byte();
        rrjt_3.id_throws();
        rrjt_3.id_protected();
        rrjt_3.id_class();
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[4] = 1;
        sArray[5] = 1;
        id_byte = sArray;
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        if (PipelineUtil.containsCause((Throwable)throwable, CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
    }
}

