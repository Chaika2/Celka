/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package celestial;

import celestial.rrTi_1;
import celestial.rrtb_3;
import celestial.rrtr_3;
import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtG_2
implements rrTi_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rrtG_2() {
        this.id_protected();
    }

    public rrtG_2(String string, rrtb_3 rrtb_32) {
        this.id_protected();
        String string2 = string;
        this.id_class[rrtG_2.id_break[0]] = string2;
        rrtb_3 rrtb_33 = rrtb_32;
        this.id_class[rrtG_2.id_break[1]] = rrtb_33;
    }

    static {
        rrtG_2.ntfClinit();
    }

    public rrtb_3 id_class() {
        return (rrtb_3)((Object)this.id_class[id_break[7]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF4ABB58E560EE16L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-12, 78, -101, -66, -52, 84, 66, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC96C0199;
    }

    @Override
    public void id_class(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        ruu_32.id_class((String)this.id_class[id_break[2]]);
        ruu_32.id_class((rrtb_3)((Object)this.id_class[id_break[3]]));
    }

    @Override
    public void id_class(rrtr_3 rrtr_32, ChannelHandlerContext channelHandlerContext) {
    }

    @Override
    public void id_break(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        String string = ruu_32.id_native();
        this.id_class[rrtG_2.id_break[4]] = string;
        rrtb_3 rrtb_32 = ruu_32.id_class(rrtb_3.class);
        this.id_class[rrtG_2.id_break[5]] = rrtb_32;
    }

    public String id_break() {
        return (String)this.id_class[id_break[6]];
    }

    private static void id_throws() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtG_2.id_throws();
        rrtG_2.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

