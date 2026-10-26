/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
 */
package celestial;

import celestial.QY;
import celestial.rrLc_1;
import celestial.rrLm_1;
import celestial.rrTi_1;
import celestial.rrtE_2;
import celestial.rrtG_2;
import celestial.rrtM_2;
import celestial.rrtS_2;
import celestial.rrtr_3;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtB_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;

    private static void id_byte() {
        id_break = new short[6];
    }

    public rrtB_2() {
        HashMap hashMap;
        this.id_throws();
        this.id_class[rrtB_2.id_break[0]] = hashMap = new HashMap();
        this.id_class(rrtE_2::new);
        this.id_class(rrtS_2::new);
        this.id_class(rrtG_2::new);
        this.id_class(rrtM_2::new);
    }

    static {
        rrtB_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, 23, 16, -103, 53, -124, 112, 37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Map<Integer, Supplier<? extends rrTi_1>> id_class() {
        return (Map)this.id_class[id_break[5]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB8E23003D1A82D1L;
    }

    public void id_class(Supplier<? extends rrTi_1> supplier) {
        ((Map)this.id_class[id_break[1]]).put(((Map)this.id_class[id_break[2]]).size(), supplier);
    }

    public void id_class(rrTi_1 rrTi_12, Channel channel, boolean bl) throws IOException {
        if (bl && rrLm_1.id_class(rrTi_12).id_byte()) {
            return;
        }
        int n = this.id_class(rrTi_12);
        if (n == id_protected[1]) {
            throw new IOException("Unknown packet: " + rrTi_12.getClass().getSimpleName());
        }
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeInt(n);
        rrTi_12.id_class(byteBuf);
        channel.writeAndFlush((Object)new BinaryWebSocketFrame(byteBuf));
    }

    public rrTi_1 id_class(rrtr_3 rrtr_32, BinaryWebSocketFrame binaryWebSocketFrame, ChannelHandlerContext channelHandlerContext, boolean bl) throws IOException {
        ByteBuf byteBuf = binaryWebSocketFrame.content();
        int n = byteBuf.readInt();
        rrTi_1 rrTi_12 = this.id_class(n);
        rrTi_12.id_break(byteBuf);
        byteBuf.clear();
        QY.id_instanceof().execute(() -> {
            if (bl && !rrLc_1.id_break(rrTi_12).id_byte()) {
                rrTi_12.id_class(rrtr_32, channelHandlerContext);
            }
        });
        return rrTi_12;
    }

    public rrTi_1 id_class(int n) {
        return (rrTi_1)((Supplier)((Map)this.id_class[id_break[3]]).get(n)).get();
    }

    public int id_class(rrTi_1 rrTi_12) {
        return ((Map)this.id_class[id_break[4]]).entrySet().stream().filter(entry -> ((rrTi_1)((Supplier)entry.getValue()).get()).getClass().equals(rrTi_12.getClass())).map(Map.Entry::getKey).findFirst().orElse(Integer.valueOf(id_protected[0]));
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC684F0FB;
    }

    private static void id_break() {
        id_byte = new boolean[]{true};
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrtB_2.id_break();
        rrtB_2.id_byte();
        rrtB_2.id_protected();
    }

    private static void id_protected() {
        id_protected = new byte[]{-1, -1};
    }
}

