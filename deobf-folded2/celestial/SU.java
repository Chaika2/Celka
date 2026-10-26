package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum SU implements C_void {
   private static boolean[] booleans60242b15623d3e12b4eaac026de79971;
   public Object[] fields60242b15623d3e12b4eaac026de79971;
   private static short[] shorts60242b15623d3e12b4eaac026de79971;
   private static String[] strings60242b15623d3e12b4eaac026de79971;
   private static byte[] bytes60242b15623d3e12b4eaac026de79971;
   public static Object[] staticFields60242b15623d3e12b4eaac026de79971;

   private static void id_byte() {
      shorts60242b15623d3e12b4eaac026de79971 = new short[]{1, 0, 0, 0, 0, 0, 0, 0};
   }

   private SU() {
      this.id_private();
      L var7 = new L();
      this.fields60242b15623d3e12b4eaac026de79971[0] = var7;
      ((List)Se_1.id_class[0]).forEach(((L)this.fields60242b15623d3e12b4eaac026de79971[0])::id_break);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1873593100;
   }

   @Override
   public <T, S> C_long<T, S> id_class(Class<T> var1, Class<S> var2) {
      return ((L)this.fields60242b15623d3e12b4eaac026de79971[0])
         .id_byte()
         .filter(C_long.class::isInstance)
         .map(C_long.class::cast)
         .filter(var1x -> var1x.id_class().isAssignableFrom(var1))
         .filter(var1x -> var1x.id_break().isAssignableFrom(var2))
         .map(C_long.class::cast)
         .findFirst()
         .orElse(null);
   }

   @Override
   public <T> T id_class(Class<T> var1, C_import var2) throws W {
      C_float var3 = this.id_class(var1);
      if (var3 == null) {
         throw new z_1(var1);
      } else {
         try {
            return (T)var3.id_class(var2);
         } catch (Exception var5) {
            throw new W(var2, var1.getSimpleName());
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -60, 38, 31, -13, -42, -4, 104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public <T> C_float<T> id_class(Class<T> var1) {
      return ((L)this.fields60242b15623d3e12b4eaac026de79971[0])
         .id_byte()
         .filter(C_float.class::isInstance)
         .map(C_float.class::cast)
         .filter(var1x -> var1x.id_class().isAssignableFrom(var1))
         .findFirst()
         .orElse(null);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4328709968587778063L;
   }

   @Override
   public L<C_abstract> id_class() {
      return (L<C_abstract>)this.fields60242b15623d3e12b4eaac026de79971[0];
   }

   @Override
   public <T, S> T id_class(Class<T> var1, Class<S> var2, C_import var3, S var4) throws W {
      C_long var5 = this.id_class(var1, var2);
      if (var5 == null) {
         throw new z_1(var1);
      } else {
         try {
            return (T)var5.id_class(var3, var4);
         } catch (Exception var7) {
            throw new W(var3, var1.getSimpleName());
         }
      }
   }

   private static void id_throws() {
      bytes60242b15623d3e12b4eaac026de79971 = new byte[]{2};
   }

   private static void id_catch() {
      booleans60242b15623d3e12b4eaac026de79971 = new boolean[]{true, false, false, false, true, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new SU(), null};
      var0[1] = new SU[]{(SU)var0[0]};
      staticFields60242b15623d3e12b4eaac026de79971 = var0;
   }

   private static void id_protected() {
      strings60242b15623d3e12b4eaac026de79971 = new String[]{new String("INSTANCE")};
   }

   private void id_private() {
      if (this.fields60242b15623d3e12b4eaac026de79971 == null) {
         this.fields60242b15623d3e12b4eaac026de79971 = new Object[1];
         Object[] var1 = this.fields60242b15623d3e12b4eaac026de79971;
      }
   }
}
