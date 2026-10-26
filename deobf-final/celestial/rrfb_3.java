package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfb_3 {
   ;
   private static byte[] bytes6cf753d486d83843b93ccc10386a903f;
   private static boolean[] booleans6cf753d486d83843b93ccc10386a903f;
   private static short[] shorts6cf753d486d83843b93ccc10386a903f;
   private static String[] strings6cf753d486d83843b93ccc10386a903f;
   public Object[] fields6cf753d486d83843b93ccc10386a903f;
   public static Object[] staticFields6cf753d486d83843b93ccc10386a903f;

   private static void byte_() {
      booleans6cf753d486d83843b93ccc10386a903f = new boolean[]{false, true, false, false, true, true, true};
   }

   private rrfb_3(String var3) {
      this.break_();
      this.fields6cf753d486d83843b93ccc10386a903f[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 394055346;
   }

   public String class_() {
      return (String)this.fields6cf753d486d83843b93ccc10386a903f[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, -39, 97, -41, -92, -26, 50, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3119277349496352595L;
   }

   private void break_() {
      if (this.fields6cf753d486d83843b93ccc10386a903f == null) {
         this.fields6cf753d486d83843b93ccc10386a903f = new Object[1];
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrfb_3("Легендарный"), new rrfb_3("Богатый"), new rrfb_3("Обычный"), null};
      var0[3] = new rrfb_3[]{(rrfb_3)var0[0], (rrfb_3)var0[1], (rrfb_3)var0[2]};
      staticFields6cf753d486d83843b93ccc10386a903f = var0;
   }

   private static void catch_() {
      shorts6cf753d486d83843b93ccc10386a903f = new short[]{3, 0, 0, 0, 1, 2};
   }

   private static void case_() {
      strings6cf753d486d83843b93ccc10386a903f = new String[]{
         new String("LEGENDARY"), new String("Легендарный"), new String("RICH"), new String("Богатый"), new String("COMMON"), new String("Обычный")
      };
   }

   private static void private_() {
      bytes6cf753d486d83843b93ccc10386a903f = new byte[]{3, 2, 2, 2, 3, 4};
   }
}
