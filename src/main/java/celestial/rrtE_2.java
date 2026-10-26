/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package celestial;

import celestial.rrTi_1;
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

public class rrtE_2
implements rrTi_1 {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public rrtE_2() {
        this.id_byte();
    }

    public rrtE_2(String string) {
        this.id_byte();
        String string2 = string;
        this.id_class[rrtE_2.id_byte[0]] = string2;
    }

    static {
        rrtE_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4A354F16;
    }

    @Override
    public void id_class(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        ruu_32.id_class((String)this.id_class[id_byte[1]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -127, 107, -14, -72, 125, -62, -3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9FCACB46A6BCDDBAL;
    }

    public String id_class() {
        return (String)this.id_class[id_byte[3]];
    }

    @Override
    public void id_class(rrtr_3 rrtr_32, ChannelHandlerContext channelHandlerContext) {
    }

    @Override
    public void id_break(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        String string = ruu_32.id_native();
        this.id_class[rrtE_2.id_byte[2]] = string;
    }

    private static void id_break() {
        id_byte = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrtE_2.id_protected();
        rrtE_2.id_break();
    }

    private static void id_protected() {
        id_break = new boolean[]{true};
    }
}

