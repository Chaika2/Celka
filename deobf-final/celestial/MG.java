package celestial;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum MG implements rt_3 {
   ;
   public static Object[] staticFields4592673f607b3ff2b69d116fa51286d2;
   private static String[] strings4592673f607b3ff2b69d116fa51286d2;
   private static boolean[] booleans4592673f607b3ff2b69d116fa51286d2;
   private static short[] shorts4592673f607b3ff2b69d116fa51286d2;
   public Object[] fields4592673f607b3ff2b69d116fa51286d2;
   private static byte[] bytes4592673f607b3ff2b69d116fa51286d2;

   private static void byte_() {
      booleans4592673f607b3ff2b69d116fa51286d2 = new boolean[]{true, false, false, false, true, true};
   }

   private MG() {
      this.throws_();
      L var7 = new L();
      this.fields4592673f607b3ff2b69d116fa51286d2[0] = var7;
      Arrays.stream(MO.values()).forEach(((L)this.fields4592673f607b3ff2b69d116fa51286d2[0])::break_);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1748468129;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1580300392762762233L;
   }

   @Override
   public L<rR_2> class_() {
      return (L<rR_2>)this.fields4592673f607b3ff2b69d116fa51286d2[0];
   }

   @Override
   public Optional<rR_2> class_(File var1) {
      return ((L)this.fields4592673f607b3ff2b69d116fa51286d2[0]).protected_().filter(var1x -> var1x.class_(var1)).findFirst();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 28, 124, -57, 126, -112, -10, -48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      bytes4592673f607b3ff2b69d116fa51286d2 = new byte[]{2};
   }

   private void throws_() {
      if (this.fields4592673f607b3ff2b69d116fa51286d2 == null) {
         this.fields4592673f607b3ff2b69d116fa51286d2 = new Object[1];
         Object[] var1 = this.fields4592673f607b3ff2b69d116fa51286d2;
      }
   }

   private static void catch_() {
      shorts4592673f607b3ff2b69d116fa51286d2 = new short[]{1, 0, 0, 0, 0, 0};
   }

   private static void case_() {
      strings4592673f607b3ff2b69d116fa51286d2 = new String[]{new String("INSTANCE")};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new MG(), null};
      var0[1] = new MG[]{(MG)var0[0]};
      staticFields4592673f607b3ff2b69d116fa51286d2 = var0;
   }
}
