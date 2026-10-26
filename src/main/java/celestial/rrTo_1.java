/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 */
package celestial;

import celestial.rrTK;
import celestial.rrTi_1;
import celestial.rrtB_2;
import celestial.rrtP_2;
import celestial.rrtr_3;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTo_1
implements rrtr_3 {
    public Object[] id_class;
    private static String[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;

    public String id_byte() {
        return (String)this.id_class[id_throws[13]];
    }

    public rrTo_1(rrtB_2 rrtB_22, String string) {
        ArrayDeque arrayDeque;
        this.id_finally();
        this.id_class[rrTo_1.id_throws[0]] = arrayDeque = new ArrayDeque();
        rrtB_2 rrtB_23 = rrtB_22;
        this.id_class[rrTo_1.id_throws[1]] = rrtB_23;
        String string2 = string;
        this.id_class[rrTo_1.id_throws[2]] = string2;
        String string3 = UUID.randomUUID().toString();
        this.id_class[rrTo_1.id_throws[3]] = string3;
    }

    static {
        rrTo_1.ntfClinit();
    }

    @Override
    public rrtP_2 id_class() {
        return (rrtP_2)((Object)rrtP_2.staticFields2f7653125b2938db917a91704c972442[id_throws[10]]);
    }

    @Override
    public void id_class(rrTi_1 rrTi_12, boolean bl) {
        throw new UnsupportedOperationException(id_break[0]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, -46, 115, 117, 78, 59, -1, 71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x655094C04BD2086CL;
    }

    public void id_class(int n) {
        Thread thread = new Thread(() -> {
            NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup();
            this.id_class[rrTo_1.id_throws[14]] = nioEventLoopGroup;
            try {
                Bootstrap bootstrap = new Bootstrap();
                ((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)this.id_class[id_throws[15]])).channel(NioSocketChannel.class)).handler((ChannelHandler)new rrTK(this, n));
                ChannelFuture channelFuture = bootstrap.connect((String)this.id_class[id_throws[16]], n).sync();
                Channel channel = channelFuture.channel();
                this.id_class[rrTo_1.id_throws[17]] = channel;
                channelFuture.channel().closeFuture().sync();
            }
            catch (Exception exception) {
                try {
                    exception.printStackTrace();
                }
                catch (Throwable throwable) {
                    ((EventLoopGroup)this.id_class[id_throws[20]]).shutdownGracefully();
                    throw throwable;
                }
                ((EventLoopGroup)this.id_class[id_throws[19]]).shutdownGracefully();
            }
            ((EventLoopGroup)this.id_class[id_throws[18]]).shutdownGracefully();
        });
        this.id_class[rrTo_1.id_throws[4]] = thread;
        ((Thread)this.id_class[id_throws[5]]).start();
    }

    @Override
    public void id_class(rrTi_1 rrTi_12, Channel channel, boolean bl) {
        if (this.id_break()) {
            try {
                this.id_case().id_class(rrTi_12, channel, bl);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x238E9042;
    }

    @Override
    public void id_break(rrTi_1 rrTi_12, boolean bl) {
        this.id_class(rrTi_12, (Channel)this.id_class[id_throws[9]], bl);
    }

    public boolean id_break() {
        Channel channel = this.id_throws();
        return channel != null && channel.isActive() ? id_protected[0] : id_protected[1];
    }

    public Channel id_throws() {
        return (Channel)this.id_class[id_throws[12]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrTo_1.id_extends();
        rrTo_1.id_private();
        rrTo_1.id_catch();
        rrTo_1.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_catch() {
        short[] sArray = new short[21];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 6;
        sArray[4] = 4;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 4;
        sArray[8] = 4;
        sArray[9] = 5;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 3;
        sArray[15] = 3;
        sArray[16] = 1;
        sArray[17] = 5;
        sArray[18] = 3;
        sArray[19] = 3;
        sArray[20] = 3;
        id_throws = sArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    @Override
    public rrtB_2 id_case() {
        return (rrtB_2)this.id_class[id_throws[11]];
    }

    private static void id_implements() {
        id_byte = new byte[]{7};
    }

    public void id_protected() {
        try {
            if (this.id_break()) {
                ((Channel)this.id_class[id_throws[6]]).close();
            }
            if ((Thread)this.id_class[id_throws[7]] != null) {
                ((Thread)this.id_class[id_throws[8]]).join();
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    private static void id_private() {
        id_break = new String[]{new String("Cannot send packet to all from client.")};
    }
}

