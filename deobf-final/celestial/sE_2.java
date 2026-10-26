package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sE_2 implements C_import {
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;

   @Override
   public String byte_() {
      return (String)this.class_[2];
   }

   @Override
   public <T> T byte_(Class<T> var1) throws W {
      return ((SU)SU.staticFields60242b15623d3e12b4eaac026de79971[0]).class_(var1, this);
   }

   public sE_2(int var1, String var2, String var3) {
      this.protected_();
      Integer var8 = var1;
      this.class_[0] = var8;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1280063635;
   }

   @Override
   public <T, S> boolean class_(Class<T> var1, Class<S> var2, S var3) {
      try {
         this.break_(var1, var2, var3);
         return break_[2];
      } catch (Throwable var5) {
         return false;
      }
   }

   @Override
   public int class_() {
      return (Integer)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, -1, -7, 75, 95, 0, 27, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4592312456710349533L;
   }

   @Override
   public <T> boolean class_(Class<T> var1) {
      try {
         this.byte_(var1);
         return break_[0];
      } catch (Throwable var3) {
         return false;
      }
   }

   @Override
   public String break_() {
      return (String)this.class_[1];
   }

   @Override
   public <T, S> T break_(Class<T> var1, Class<S> var2, S var3) throws W {
      return ((SU)SU.staticFields60242b15623d3e12b4eaac026de79971[0]).class_(var1, var2, this, var3);
   }

   @Override
   public <E extends Enum<?>> E break_(Class<E> var1) throws W {
      return (E)Stream.of((Enum[])var1.getEnumConstants())
         .filter(var1x -> var1x.name().equalsIgnoreCase((String)this.class_[1]))
         .findFirst()
         .orElseThrow(() -> new W(this, var1.getSimpleName()));
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, true, false, false, false};
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 2, 0, 1, 2, 0, 0, 1};
   }

   private static void case_() {
      byte_ = new byte[]{3};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }
}
