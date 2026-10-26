/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzl_3;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzC_2 {
    public Object[] id_class;
    private static boolean[] id_byte;
    private static String[] id_protected;
    private static short[] id_throws;
    private static byte[] id_case;
    public static Object[] id_break;

    private static void id_byte() {
        id_case = new byte[]{3};
    }

    public byte[] id_byte(String string) {
        CharsetEncoder charsetEncoder = this.id_case().reset();
        char[] cArray = string.toCharArray();
        int n = (int)((float)cArray.length * charsetEncoder.maxBytesPerChar());
        byte[] byArray = new byte[n];
        if (n == 0) {
            return byArray;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        CharBuffer charBuffer = CharBuffer.wrap(cArray);
        CoderResult coderResult = charsetEncoder.encode(charBuffer, byteBuffer, id_byte[3]);
        if (!coderResult.isUnderflow()) {
            throw new IllegalArgumentException(coderResult.toString());
        }
        coderResult = charsetEncoder.flush(byteBuffer);
        if (!coderResult.isUnderflow()) {
            throw new IllegalArgumentException(coderResult.toString());
        }
        if (byteBuffer.position() == byArray.length) {
            return byArray;
        }
        return Arrays.copyOf(byArray, byteBuffer.position());
    }

    public rrzC_2(Charset charset) {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2;
        this.id_throws();
        this.id_class[rrzC_2.id_throws[2]] = threadLocal2 = new ThreadLocal();
        this.id_class[rrzC_2.id_throws[3]] = threadLocal = new ThreadLocal();
        Charset charset2 = charset;
        this.id_class[rrzC_2.id_throws[4]] = charset2;
    }

    static {
        rrzC_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5493412D;
    }

    public String id_class(byte[] byArray) {
        CharBuffer charBuffer;
        CharsetDecoder charsetDecoder = this.id_private().reset();
        int n = (int)((float)byArray.length * charsetDecoder.maxCharsPerByte());
        char[] cArray = new char[n];
        if (n == 0) {
            return new String(cArray);
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray, id_byte[0], byArray.length);
        CoderResult coderResult = charsetDecoder.decode(byteBuffer, charBuffer = CharBuffer.wrap(cArray), id_byte[1]);
        if (!coderResult.isUnderflow()) {
            throw new IllegalArgumentException(coderResult.toString());
        }
        coderResult = charsetDecoder.flush(charBuffer);
        if (!coderResult.isUnderflow()) {
            throw new IllegalArgumentException(coderResult.toString());
        }
        return new String(cArray, id_byte[2], charBuffer.position());
    }

    public boolean id_class() {
        return (Charset)this.id_class[id_throws[1]] == StandardCharsets.UTF_8 ? id_byte[4] : id_byte[5];
    }

    public static rrzC_2 id_class(String string) {
        Charset charset = Charset.forName(string);
        if (charset.name().equals(id_protected[0])) {
            return (rrzC_2)id_break[id_throws[0]];
        }
        return new rrzC_2(charset);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9DA611EA14CAC627L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{15, -5, -5, 24, -39, 50, 15, -53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new String[]{new String("UTF-8")};
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrzC_2.id_protected();
        rrzC_2.id_break();
        rrzC_2.id_implements();
        rrzC_2.id_byte();
        rrzC_2.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrzl_3()};
        id_break = objectArray;
    }

    private CharsetEncoder id_case() {
        CharsetEncoder charsetEncoder = (CharsetEncoder)((ThreadLocal)this.id_class[id_throws[8]]).get();
        if (charsetEncoder == null) {
            charsetEncoder = ((Charset)this.id_class[id_throws[9]]).newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
            ((ThreadLocal)this.id_class[id_throws[10]]).set(charsetEncoder);
        }
        return charsetEncoder;
    }

    private static void id_implements() {
        short[] sArray = new short[11];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 2;
        id_throws = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private CharsetDecoder id_private() {
        CharsetDecoder charsetDecoder = (CharsetDecoder)((ThreadLocal)this.id_class[id_throws[5]]).get();
        if (charsetDecoder == null) {
            charsetDecoder = ((Charset)this.id_class[id_throws[6]]).newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
            ((ThreadLocal)this.id_class[id_throws[7]]).set(charsetDecoder);
        }
        return charsetDecoder;
    }
}

