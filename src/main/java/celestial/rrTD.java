/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
 */
package celestial;

import celestial.rrTK;
import celestial.rrTi_1;
import celestial.rrTo_1;
import celestial.rrtB_2;
import celestial.rrtE_2;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTD
extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_byte = new boolean[]{true, true, true};
    }

    public rrTD(rrTK rrTK2) {
        this.id_class();
        rrTK rrTK3 = rrTK2;
        this.id_class[rrTD.id_break[0]] = rrTK3;
    }

    static {
        rrTD.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4D4E4033;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA01AE5B00839F0E9L;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-66, 126, 81, -29, -76, -31, -5, -104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(ChannelHandlerContext channelHandlerContext, BinaryWebSocketFrame binaryWebSocketFrame) throws Exception {
        rrtB_2 rrtB_22 = ((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[15]])).id_class[id_break[16]]).id_case();
        rrtB_22.id_class((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[17]])).id_class[id_break[18]], binaryWebSocketFrame, channelHandlerContext, id_byte[1]);
    }

    private static void id_break() {
        short[] sArray = new short[19];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 6;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[18] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTD.id_byte();
        rrTD.id_break();
    }

    public void channelReadComplete(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelReadComplete(channelHandlerContext);
        while (!((Queue)((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[7]])).id_class[rrTD.id_break[8]]).id_class[id_break[9]]).isEmpty()) {
            rrTi_1 rrTi_12 = (rrTi_1)((Queue)((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[10]])).id_class[rrTD.id_break[11]]).id_class[id_break[12]]).poll();
            ((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[13]])).id_class[id_break[14]]).id_class(rrTi_12, channelHandlerContext.channel(), id_byte[0]);
        }
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        throwable.printStackTrace();
        channelHandlerContext.close();
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        ((Queue)((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[1]])).id_class[rrTD.id_break[2]]).id_class[id_break[3]]).add(new rrtE_2((String)((rrTo_1)((rrTK)((Object)this.id_class[rrTD.id_break[4]])).id_class[rrTD.id_break[5]]).id_class[id_break[6]]));
    }

    public /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.id_class(channelHandlerContext, (BinaryWebSocketFrame)object);
    }
}

