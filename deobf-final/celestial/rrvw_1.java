package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrvw_1 {
   ;
   private static byte[] bytesb5a707e7713735c98363c6b6bc5591b6;
   private static String[] stringsb5a707e7713735c98363c6b6bc5591b6;
   private static short[] shortsb5a707e7713735c98363c6b6bc5591b6;
   public Object[] fieldsb5a707e7713735c98363c6b6bc5591b6;
   private static boolean[] booleansb5a707e7713735c98363c6b6bc5591b6;
   public static Object[] staticFieldsb5a707e7713735c98363c6b6bc5591b6;

   private rrvw_1() {
      this.throws_();
      ArrayList var7 = new ArrayList();
      this.fieldsb5a707e7713735c98363c6b6bc5591b6[0] = var7;
      ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).add(new rrvf_1());
   }

   static {
      ntfClinit();
   }

   public void class_() {
      for (Module var2 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
         var2.class_(var2.ax_(), false);
      }

      ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).forEach(rrvI::class_);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -32, 54, -81, 15, -46, 6, 27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 712074404;
   }

   public void class_(Consumer<Module> var1) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g().stream().allMatch(var0 -> var0.package_().class_())) {
         ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).forEach(rrvI::break_);
      } else {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .private_()
            .g()
            .stream()
            .filter(var0 -> !var0.package_().class_() ? true : booleansb5a707e7713735c98363c6b6bc5591b6[3])
            .forEach(var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6456379061537898708L;
   }

   public void class_(Module var1) {
      var1.class_(var1.ax_(), false);
      ((List)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0]).forEach(var1x -> var1x.class_(var1));
   }

   public List<rrvI> break_() {
      return (List<rrvI>)this.fieldsb5a707e7713735c98363c6b6bc5591b6[0];
   }

   private void throws_() {
      if (this.fieldsb5a707e7713735c98363c6b6bc5591b6 == null) {
         this.fieldsb5a707e7713735c98363c6b6bc5591b6 = new Object[1];
         Object[] var1 = this.fieldsb5a707e7713735c98363c6b6bc5591b6;
      }
   }

   private static void catch_() {
      shortsb5a707e7713735c98363c6b6bc5591b6 = new short[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   private static void case_() {
      booleansb5a707e7713735c98363c6b6bc5591b6 = new boolean[]{false, false, true, false, true, false, false, false, true, true};
   }

   private static void implements_() {
      stringsb5a707e7713735c98363c6b6bc5591b6 = new String[]{new String("INSTANCE")};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrvw_1(), null};
      var0[1] = new rrvw_1[]{(rrvw_1)var0[0]};
      staticFieldsb5a707e7713735c98363c6b6bc5591b6 = var0;
   }

   private static void private_() {
      bytesb5a707e7713735c98363c6b6bc5591b6 = new byte[]{2};
   }
}
