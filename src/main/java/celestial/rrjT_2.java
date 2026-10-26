/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelDecoderException
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package celestial;

import celestial.rrVr;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelDecoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@ChannelHandler.Sharable
public class rrjT_2
extends MessageToMessageDecoder<ByteBuf> {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static String[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    public rrjT_2(UserConnection userConnection) {
        this.id_class();
        UserConnection userConnection2 = userConnection;
        this.id_class[rrjT_2.id_break[0]] = userConnection2;
    }

    static {
        rrjT_2.ntfClinit();
    }

    public /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object, list);
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
            objectArray[rrjT_2.id_byte[7]] = id_byte[8];
            objectArray[rrjT_2.id_protected[2]] = id_byte[9];
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{44, -63, 84, -120, -37, 61, -103, 42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private boolean id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        if (((Boolean)this.id_class[id_break[7]]).booleanValue()) {
            return id_byte[2];
        }
        int n = channelHandlerContext.pipeline().names().indexOf(id_throws[0]);
        if (n == id_protected[0]) {
            return id_byte[3];
        }
        Boolean bl = id_byte[4];
        this.id_class[rrjT_2.id_break[8]] = bl;
        if (n > channelHandlerContext.pipeline().names().indexOf(id_throws[1])) {
            rrVr.id_class(channelHandlerContext, byteBuf);
            ChannelHandler channelHandler = channelHandlerContext.pipeline().get(id_throws[2]);
            ChannelHandler channelHandler2 = channelHandlerContext.pipeline().get(id_throws[3]);
            channelHandlerContext.pipeline().remove(channelHandler);
            channelHandlerContext.pipeline().remove(channelHandler2);
            channelHandlerContext.pipeline().addAfter(id_throws[4], id_throws[5], channelHandler);
            channelHandlerContext.pipeline().addAfter(id_throws[6], id_throws[7], channelHandler2);
            return id_byte[5];
        }
        return id_byte[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (((Boolean)this.id_class[id_break[1]]).booleanValue()) {
            Boolean bl = id_byte[0];
            this.id_class[rrjT_2.id_break[2]] = bl;
            list.add(byteBuf.retain());
            return;
        }
        if (!((UserConnection)this.id_class[id_break[3]]).checkIncomingPacket()) {
            throw CancelDecoderException.generate(null);
        }
        if (!((UserConnection)this.id_class[id_break[4]]).shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        try {
            boolean bl = this.id_class(channelHandlerContext, byteBuf2);
            ((UserConnection)this.id_class[id_break[5]]).transformIncoming(byteBuf2, CancelDecoderException::generate);
            if (bl) {
                rrVr.id_break(channelHandlerContext, byteBuf2);
                Boolean bl2 = id_byte[1];
                this.id_class[rrjT_2.id_break[6]] = bl2;
            }
            list.add(byteBuf2.retain());
        }
        finally {
            byteBuf2.release();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x56728474;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA78360AC461FE415L;
    }

    private static void id_break() {
        short[] sArray = new short[9];
        sArray[1] = 2;
        sArray[2] = 2;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 1;
        id_break = sArray;
    }

    private static void id_throws() {
        id_protected = new byte[]{-1, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjT_2.id_byte();
        rrjT_2.id_protected();
        rrjT_2.id_break();
        rrjT_2.id_throws();
    }

    private static void id_protected() {
        id_throws = new String[]{new String("decompress"), new String("via-decoder"), new String("via-encoder"), new String("via-decoder"), new String("compress"), new String("via-encoder"), new String("decompress"), new String("via-decoder")};
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        if (PipelineUtil.containsCause((Throwable)throwable, CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
    }
}

