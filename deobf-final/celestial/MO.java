package celestial;

import java.io.File;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public enum MO implements rR_2 {
   ;
   private static short[] shorts192d7263893339b4ba984e84e651e982;
   public Object[] fields192d7263893339b4ba984e84e651e982;
   private static byte[] bytes192d7263893339b4ba984e84e651e982;
   public static Object[] staticFields192d7263893339b4ba984e84e651e982;
   private static boolean[] booleans192d7263893339b4ba984e84e651e982;
   private static String[] strings192d7263893339b4ba984e84e651e982;

   private static void byte_() {
      booleans192d7263893339b4ba984e84e651e982 = new boolean[]{false, true, false, false, true, true, true};
   }

   MO(String var3) {
      this.throws_();
      this.fields192d7263893339b4ba984e84e651e982[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 82, -22, -7, 122, 122, -52, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2342390038893410733L;
   }

   @Override
   public boolean class_(File var1) {
      return ((String)this.fields192d7263893339b4ba984e84e651e982[0]).equalsIgnoreCase(FilenameUtils.getExtension(var1.getAbsolutePath()));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 469006092;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new Mh_1("schematic"), new MX("schem"), new MJ("litematic"), null};
      var0[3] = new MO[]{(MO)var0[0], (MO)var0[1], (MO)var0[2]};
      staticFields192d7263893339b4ba984e84e651e982 = var0;
   }

   private void throws_() {
      if (this.fields192d7263893339b4ba984e84e651e982 == null) {
         this.fields192d7263893339b4ba984e84e651e982 = new Object[1];
         Object[] var1 = this.fields192d7263893339b4ba984e84e651e982;
      }
   }

   private static void catch_() {
      strings192d7263893339b4ba984e84e651e982 = new String[]{
         new String("MCEDIT"), new String("schematic"), new String("SPONGE"), new String("schem"), new String("LITEMATICA"), new String("litematic")
      };
   }

   private static void case_() {
      shorts192d7263893339b4ba984e84e651e982 = new short[]{3, 0, 0, 0, 1, 2};
   }

   private static void protected_() {
      bytes192d7263893339b4ba984e84e651e982 = new byte[]{3, 2, 2, 2, 3, 4};
   }
}
