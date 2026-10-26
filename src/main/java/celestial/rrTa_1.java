/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
 */
package celestial;

import celestial.rrTU;
import celestial.rrTY;
import celestial.rrTe_1;
import celestial.rrTi_1;
import celestial.rrtB_2;
import celestial.rrtE_2;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTa_1
extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_protected = new boolean[]{true};
    }

    public rrTa_1(rrTe_1 rrTe_12) {
        this.id_protected();
        rrTe_1 rrTe_13 = rrTe_12;
        this.id_class[rrTa_1.id_break[0]] = rrTe_13;
    }

    static {
        rrTa_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{10, 76, 96, -119, -18, 65, -43, -69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new byte[]{2};
    }

    public void id_class(ChannelHandlerContext channelHandlerContext, BinaryWebSocketFrame binaryWebSocketFrame) throws Exception {
        rrtB_2 rrtB_22 = ((rrTU)((rrTe_1)((Object)this.id_class[rrTa_1.id_break[7]])).id_class[id_break[8]]).id_case();
        rrTi_1 rrTi_12 = rrtB_22.id_class((rrTU)((rrTe_1)((Object)this.id_class[rrTa_1.id_break[9]])).id_class[id_break[10]], binaryWebSocketFrame, channelHandlerContext, id_protected[0]);
        if (rrTi_12 instanceof rrtE_2) {
            rrtE_2 rrtE_22 = (rrtE_2)rrTi_12;
            ((rrTY)this.id_class[id_break[11]]).id_class(rrtE_22.id_class());
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAC157F99A17BBC91L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5B633D03;
    }

    private static void id_break() {
        short[] sArray = new short[15];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[12] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTa_1.id_byte();
        rrTa_1.id_break();
        rrTa_1.id_class();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        ((rrTU)((rrTe_1)((Object)this.id_class[rrTa_1.id_break[4]])).id_class[id_break[5]]).id_break((rrTY)this.id_class[id_break[6]]);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        throwable.printStackTrace();
        channelHandlerContext.close();
        ((rrTU)((rrTe_1)((Object)this.id_class[rrTa_1.id_break[12]])).id_class[id_break[13]]).id_break((rrTY)this.id_class[id_break[14]]);
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        rrTY rrTY2 = new rrTY(channelHandlerContext);
        this.id_class[rrTa_1.id_break[3]] = rrTY2;
        ((rrTU)((rrTe_1)((Object)this.id_class[rrTa_1.id_break[1]])).id_class[id_break[2]]).id_class(rrTY2);
    }

    public /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.id_class(channelHandlerContext, (BinaryWebSocketFrame)object);
    }
}

