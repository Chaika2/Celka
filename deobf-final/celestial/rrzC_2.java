package celestial;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzC_2 {
   public Object[] class_;
   private static boolean[] byte_;
   private static String[] protected_;
   private static short[] throws_;
   private static byte[] case_;
   public static Object[] break_;

   private static void byte_() {
      case_ = new byte[]{3};
   }

   public byte[] byte_(String var1) {
      CharsetEncoder var2 = this.case_().reset();
      char[] var3 = var1.toCharArray();
      int var4 = (int)((float)var3.length * var2.maxBytesPerChar());
      byte[] var5 = new byte[var4];
      if (var4 == 0) {
         return var5;
      } else {
         ByteBuffer var6 = ByteBuffer.wrap(var5);
         CharBuffer var7 = CharBuffer.wrap(var3);
         CoderResult var8 = var2.encode(var7, var6, true);
         if (!var8.isUnderflow()) {
            throw new IllegalArgumentException(var8.toString());
         } else {
            var8 = var2.flush(var6);
            if (!var8.isUnderflow()) {
               throw new IllegalArgumentException(var8.toString());
            } else {
               return var6.position() == var5.length ? var5 : Arrays.copyOf(var5, var6.position());
            }
         }
      }
   }

   rrzC_2(Charset var1) {
      this.throws_();
      ThreadLocal var6 = new ThreadLocal();
      this.class_[1] = var6;
      ThreadLocal var7 = new ThreadLocal();
      this.class_[2] = var7;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1418936621;
   }

   public String class_(byte[] var1) {
      CharsetDecoder var2 = this.private_().reset();
      int var3 = (int)((float)var1.length * var2.maxCharsPerByte());
      char[] var4 = new char[var3];
      if (var3 == 0) {
         return new String(var4);
      } else {
         ByteBuffer var5 = ByteBuffer.wrap(var1, 0, var1.length);
         CharBuffer var6 = CharBuffer.wrap(var4);
         CoderResult var7 = var2.decode(var5, var6, true);
         if (!var7.isUnderflow()) {
            throw new IllegalArgumentException(var7.toString());
         } else {
            var7 = var2.flush(var6);
            if (!var7.isUnderflow()) {
               throw new IllegalArgumentException(var7.toString());
            } else {
               return new String(var4, 0, var6.position());
            }
         }
      }
   }

   public boolean class_() {
      return (Charset)this.class_[0] == StandardCharsets.UTF_8 ? true : byte_[5];
   }

   public static rrzC_2 class_(String var0) {
      Charset var1 = Charset.forName(var0);
      return var1.name().equals("UTF-8") ? (rrzC_2)break_[0] : new rrzC_2(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7086957266552043993L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, -5, -5, 24, -39, 50, 15, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new String[]{new String("UTF-8")};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrzl_3()};
      break_ = var0;
   }

   private CharsetEncoder case_() {
      CharsetEncoder var1 = (CharsetEncoder)((ThreadLocal)this.class_[2]).get();
      if (var1 == null) {
         var1 = ((Charset)this.class_[0]).newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
         ((ThreadLocal)this.class_[2]).set(var1);
      }

      return var1;
   }

   private static void implements_() {
      throws_ = new short[]{0, 0, 1, 2, 0, 1, 0, 1, 2, 0, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true, false, true, true, false, false, true};
   }

   private CharsetDecoder private_() {
      CharsetDecoder var1 = (CharsetDecoder)((ThreadLocal)this.class_[1]).get();
      if (var1 == null) {
         var1 = ((Charset)this.class_[0]).newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
         ((ThreadLocal)this.class_[1]).set(var1);
      }

      return var1;
   }
}
