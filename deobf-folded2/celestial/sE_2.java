package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sE_2 implements C_import {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   @Override
   public String id_byte() {
      return (String)this.id_class[2];
   }

   @Override
   public <T> T id_byte(Class<T> var1) throws W {
      return ((SU)SU.staticFields60242b15623d3e12b4eaac026de79971[0]).id_class(var1, this);
   }

   public sE_2(int var1, String var2, String var3) {
      this.id_protected();
      Integer var8 = var1;
      this.id_class[0] = var8;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1280063635;
   }

   @Override
   public <T, S> boolean id_class(Class<T> var1, Class<S> var2, S var3) {
      try {
         this.id_break(var1, var2, var3);
         return id_break[2];
      } catch (Throwable var5) {
         return false;
      }
   }

   @Override
   public int id_class() {
      return (Integer)this.id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, -1, -7, 75, 95, 0, 27, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4592312456710349533L;
   }

   @Override
   public <T> boolean id_class(Class<T> var1) {
      try {
         this.id_byte(var1);
         return id_break[0];
      } catch (Throwable var3) {
         return false;
      }
   }

   @Override
   public String id_break() {
      return (String)this.id_class[1];
   }

   @Override
   public <T, S> T id_break(Class<T> var1, Class<S> var2, S var3) throws W {
      return ((SU)SU.staticFields60242b15623d3e12b4eaac026de79971[0]).id_class(var1, var2, this, var3);
   }

   @Override
   public <E extends Enum<?>> E id_break(Class<E> var1) throws W {
      return (E)Stream.of((Enum[])var1.getEnumConstants())
         .filter(var1x -> var1x.name().equalsIgnoreCase((String)this.id_class[1]))
         .findFirst()
         .orElseThrow(() -> new W(this, var1.getSimpleName()));
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, true, false, false, false};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 2, 0, 1, 2, 0, 0, 1};
   }

   private static void id_case() {
      id_byte = new byte[]{3};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[0] = 0;
      }
   }
}
